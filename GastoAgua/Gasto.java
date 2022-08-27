package GastoAgua;

import javax.swing.JOptionPane;

public class Gasto
{
    public static void main(String[] args) 
    {
        int x;
        int z;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de m3 de agua gastada: ")); 
        z = 0;

        if(x < 50)
        {
            z = 10000;
        }
        else if (50 <= x && x <= 200)
        {
            z =(int)((x-50) * 2000) + 10000;
        }
        else if (x >= 201)
        {
            z = (int)((x-200) * 3000) + (150 * 2000) + 10000;
        };
        JOptionPane.showMessageDialog(null, "Su cuota a pagar por agua es de " + z + "$", "Agua" , JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}