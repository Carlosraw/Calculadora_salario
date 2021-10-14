/*Un obrero necesita calcular su salario semanal, el cual se obtiene de la
siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora. Si
trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y
$20 por cada hora extra. */

package calcular.salario;

import javax.swing.JOptionPane;

public class CalcularSalario {


    public static void main(String[] args) {
      /* se crean las variables horas que serian las horas trabajadas, pagatotal
        pagan que es la paga normal y pagae que es paga con recargo o por horas extra*/
      int  horas;
      float pagatotal, pagan,pagae;
        horas = Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero de horas trabajadas: "));
        
        if (horas > 40){
            pagae=(horas-40)*20;
            pagan=40*16;
            pagatotal=pagan+pagae;  
            JOptionPane.showMessageDialog(null,"El salario de esta semana es"+pagatotal);
            
    }
        else{
            pagatotal=horas*16;
            
            JOptionPane.showMessageDialog(null,"El salario de esta semana es"+pagatotal);
        }
    }
    
}
