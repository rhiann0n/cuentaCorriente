package AR7_1Libro.Controlador;

import AR7_1Libro.Clases.CuentaCorriente;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente c;
        c = new CuentaCorriente("70592122Q", "Irene");
        c.ingreso(1000); //ingresamos 1000 euros
        c.egreso(300); //sacamos 300 euros. Quedarán 700
        c.mostrarInformacion(); //mostramos
        mostrar("Puedo sacar 700 €: " + c.egreso(700)); //quedan 0 euros
        error("Puedo sacar 500 €: " + c.egreso(500)); //no es posible

    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
        public static void error (String texto) {
            System.err.println("\t" + texto);
        }
}
