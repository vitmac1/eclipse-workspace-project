module app.calculo{
	requires transitive app.logging;
	exports br.com.ciss.app.calculo;
//	exports br.com.ciss.app.calculo.interno
//		to app.financeiro;
	
	opens br.com.ciss.app.calculo to app.financeiro;
	
	requires app.api;
	provides br.com.ciss.app.Calculadora
		with br.com.ciss.app.calculo.CalculadoraImpl;
}