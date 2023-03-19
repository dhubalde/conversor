import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class Frame extends JFrame {
	
	
	public Frame() {
		super("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(500,300));
		Conversiones conversionesDefault = new Conversiones();
		
		setLayout(new BorderLayout());
		
		int bucle = 0;
		
		do {
			Object seleccionPesoOTemp = JOptionPane.showInputDialog(null, "Selecciona una opción de conversión: ",				
					"Menu",JOptionPane.PLAIN_MESSAGE,null,
					new Object[] {"Conversor de monedas","Conversor de Temperatura"}, "Selecciona");
			
			
			//Seleccionar cancelar esto no correra
			if (seleccionPesoOTemp!= null) {				
				
				String seleccionPesoTemp = seleccionPesoOTemp.toString();
				if (seleccionPesoTemp == "Conversor de monedas") {
					
					String convertirAMonedas = JOptionPane.showInputDialog(null, "Ingrese la cantidad desea convertir");
					
					if(convertirAMonedas.matches("[0-9]+")) {
						
						 Double convertirAMonedas1 = Double.parseDouble(convertirAMonedas);
						Object seleccionDeMoneda = JOptionPane.showInputDialog(null, "Elije la moneda a convertir tu dinero: ", "Monedas",JOptionPane.PLAIN_MESSAGE,null,
								new Object[] {
								"Pesos Arg a Usd",
								"Pesos Arg a Eur",
								"Pesos Arg a Lib",
								"Pesos Arg a Yen",
								"Pesos Arg a Won",
								"Usd a Pesos Arg",
								"Eur a Pesos Arg",
								"Lib a Pesos Arg",
								"Yen a Pesos Arg",
								"Won a Pesos Arg"},
								"Pesos Arg a Usd");
						
						if (seleccionDeMoneda!= null) {
							String seleccionMoneda = seleccionDeMoneda.toString();
							
							switch (seleccionMoneda) {
							case "Pesos Arg a Usd":JOptionPane.showMessageDialog(null, "la conversion de Pesos Arg a Dolares es: "+ conversionesDefault.PAaUSD(convertirAMonedas1) + " Dolares");
								break;
							case "Pesos Arg a Eur": JOptionPane.showMessageDialog(null, "la conversion de Pesos Arg a Euros es: "+ conversionesDefault.PAaEUR(convertirAMonedas1) + " Euros");
								break;
							case "Pesos Arg a Lib": JOptionPane.showMessageDialog(null, "la conversion de Pesos Arg a Libras Esterlinas es: "+ conversionesDefault.PAaLIB(convertirAMonedas1) + " Libras Esterlinas");
								break;
							case "Pesos Arg a Yen": JOptionPane.showMessageDialog(null, "la conversion de Pesos Arg a Yenes es: "+ conversionesDefault.PAaYEN(convertirAMonedas1) + " Yenes");
								break;
							case "Pesos Arg a Won": JOptionPane.showMessageDialog(null, "la conversion de Pesos Arg a Won es: "+ conversionesDefault.PAaWON(convertirAMonedas1) + " Won");
								break;
							case "Usd a Pesos Arg": JOptionPane.showMessageDialog(null, "la conversion de Dolares a Pesos Arg es: "+ conversionesDefault.USDaPA(convertirAMonedas1) + " Pesos Arg");
								break;
							case "Eur a Pesos Arg": JOptionPane.showMessageDialog(null, "la conversion de Euros a Pesos Arg es: "+ conversionesDefault.EURaPA(convertirAMonedas1) + " Pesos Arg");
								break;
							case "Lib a Pesos Arg": JOptionPane.showMessageDialog(null, "la conversion de Libras Esterlinas a Pesos Arg es: "+ conversionesDefault.LIBaPA(convertirAMonedas1) + " Pesos Arg");
								break;
							case "Yen a Pesos Arg": JOptionPane.showMessageDialog(null, "la conversion de Yenes Pesos Arg es: "+ conversionesDefault.YENaPA(convertirAMonedas1) + " Pesos Arg");
								break;
							case "Won a Pesos Arg": JOptionPane.showMessageDialog(null, "la conversion de Won a Pesos Arg es: "+ conversionesDefault.WONaPA(convertirAMonedas1) + " Pesos Arg");
							break;
							default:
								break;
							}
						}else {
							JOptionPane.showMessageDialog(null, "Programa finalizado"); // En caso de presionar "cancel" en el segundo showinput
							break;
						}
						
						}else {
							JOptionPane.showMessageDialog(null, "valor no válido"); //En caso de no ingresar valores numericos
						}
					
					
					
					
				}
				else {
					String convertirATemp = JOptionPane.showInputDialog(null, "Ingrese la temperatura que desea convertir");
					
					
					if(convertirATemp.matches("[0-9]+")) {
						Object seleccionDeTemp = JOptionPane.showInputDialog(null, "Elije el tipo la temperatura que deseas convertir: ", "Temperatura",JOptionPane.PLAIN_MESSAGE,null,
								new Object[] {"Celsius a Fahrenheit","Celsius a Kelvin"}, "Celsius a Fahrenheit");
						Double convertirTemp = Double.parseDouble(convertirATemp);
						
						if (seleccionDeTemp!=null) {
							String seleccionTemp = seleccionDeTemp.toString();
							
							switch (seleccionTemp) {
							case "Celsius a Fahrenheit":JOptionPane.showMessageDialog(null, "la conversion de Celsius a Fahrenheit es: "+ conversionesDefault.celsiusaF(convertirTemp) + " Fahrenheit");
								break;
							case "Celsius a Kelvin":JOptionPane.showMessageDialog(null, "la conversion de Celsius a Kelvin es: "+ conversionesDefault.celsiusaK(convertirTemp) + " Kelvin");
							break;
							
							
							default:
								break;
							}
						}else {
							JOptionPane.showMessageDialog(null, "Programa finalizado");
							break;
						}
					}else {
						JOptionPane.showMessageDialog(null, "Valor no valido");
					}
					
					
					
				
					
				}
				bucle = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
				if (bucle >0) {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
				
				
			}else {
				JOptionPane.showMessageDialog(null, "Programa finalizado"); //en caso de cancelar el primer showinput
				break;
			}
			
			
		} while (bucle == 0);
		
		
		
		
	}
}
