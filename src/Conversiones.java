
import java.text.DecimalFormat;

public class Conversiones {
	DecimalFormat df = new DecimalFormat("#.##");
	
	//Pesos argentinos a otras monedas
	public String PAaUSD(double valor){
		valor = valor/210.00; 
		return df.format(valor);
	}

	public String PAaEUR(double valor) {
		valor= valor/215.00;
		return df.format(valor);	
	}

	public String PAaLIB(double valor) {
		valor= valor/243.00;
		return df.format(valor);
	}

	public String PAaYEN(double valor) {
		valor =  valor/1.52;
		return df.format(valor);
	}

	public String PAaWON(double valor) {
		valor = valor /0.15;
		return df.format(valor);
	}

	//Otras monedas a pesos argentinos 
	public String USDaPA(double valor) {
		valor =  valor * 210.00;
		return df.format(valor);
	}
	public String EURaPA(double valor) {
		valor = valor * 215.00;
		return df.format(valor);
		
	}
	public String LIBaPA(double valor) {
		valor = valor * 243.00;
		return df.format(valor);
	}
	public String YENaPA(double valor) {
		valor = valor * 1.52;
		return df.format(valor);
	}
	public String WONaPA(double valor) {
		valor = valor * 0.15;
		return df.format(valor);
	}

	//Temperatura
	public String celsiusaF(double valor) {
		valor = (valor * 1.8) + 32; //(1 °C × 9/5) + 32 = 33.8 °F

		return df.format(valor);
	}

	
	public String celsiusaK(double valor) {
		valor = valor + 273.15; //1 °C + 273.15 = 274.15 K
		return df.format(valor);
	}
	
}

