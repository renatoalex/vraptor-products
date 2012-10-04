
$.noConflict();
jQuery(document).ready(function($) {
$("#produto\\.preco").maskMoney({symbol:'R$ ', showSymbol:false, thousands:'.', decimal:',', symbolStay: false});
});