package POO;
import javax.swing.*;
public class Uso_coche {

	public static void main(String[] args) {
		
		ClassAuto Renault =new ClassAuto();
		System.out.println(Renault.getLargo());
		Renault.setColor(JOptionPane.showInputDialog("Ingrese el color del auto"));
		Renault.setAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));		
		Renault.setClimatizador(JOptionPane.showInputDialog("Tiene Climatizador?"));
		JOptionPane.showMessageDialog(null, Renault.getColor()+"\n"+Renault.getAsientos()+"\n"+Renault.getPrecioCoche());
	}

}
