package br.gov.taxacao.converters;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ResourceBundle;

import br.com.caelum.vraptor.Convert;
import br.com.caelum.vraptor.Converter;
import br.com.caelum.vraptor.converter.ConversionError;
import br.com.caelum.vraptor.ioc.ApplicationScoped;



@Convert(BigDecimal.class)
@ApplicationScoped
public class BigDecimalConverter implements Converter<BigDecimal> {

    public BigDecimal convert(String value, Class<? extends BigDecimal> type, ResourceBundle bundle) {
        if (value == null || value.equals("")) {
            return null;
        }
        try {
        	DecimalFormat df = new DecimalFormat();
        	
        	df.setParseBigDecimal(true);        	
        	
        	return new BigDecimal(df.parse(value, new ParsePosition(0)).doubleValue());
            
        } catch (NumberFormatException e) {
            throw new ConversionError(MessageFormat.format(bundle.getString("is_not_a_valid_big_decimal"), value));
        }
    }


}