/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author javi1
 */
public class Sistema {
    private static Datos datos[];
    private static Interfaz interfaz;
    private static int con;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        datos = new Datos[100];
        interfaz = new Interfaz();
        
        for (int i = 0; i < 100; i++) {
            datos[i]=new Datos();
        }
        con=0;
        interfaz.setVisible(true);
    }

    public static void guardar(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j) {
        datos[con].setCod(a);
        datos[con].setEntidad(b);
        datos[con].setApellidos(c);
        datos[con].setNombres(d);
        datos[con].setSexo(e);
        datos[con].setDir(f);
        datos[con].setMotivo(g);
        datos[con].setLugar(h);
        datos[con].setMedico(i);
        datos[con].setFecha(j);
        con++;
    }
    public static void buscar(String bus){
        for (int j = 0; j < datos.length; j++) {
            if(datos[j].getNombres().equals(bus)){
                interfaz.cargardatos(datos[j]);
            }
            else{
                JOptionPane.showMessageDialog(null, "Datos erroneos");
            }
        }
    }
    
}
