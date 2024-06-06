package AR7_1Libro.Clases;

public class CuentaCorriente {
    String dni; //del titular
    String nombre; //del titular
    double saldo; //efectivo disponible en la cuenta
    /*Los parámetros de entrada: nombre y dni, ocultan los atributos de la clase
    con el mismo identificador. Para acceder a ellos hay que utilizar this.*/
    public CuentaCorriente(String dni, String nombre) { //constructor
        this.dni = dni; //DNI pasado como parámetro
        this.nombre = nombre; //nombre pasado como parámetro
        saldo = 0; //asignamos el saldo por defecto
    }
    public boolean egreso(double cant) { //sacar dinero de la cuenta corriente
        boolean operacionPosible;
        if (saldo >= cant) { // si disponemos de saldo suficiente
            saldo -= cant;
            operacionPosible = true;
        } else {
            error("No hay dinero suficiente");
            operacionPosible = false;
        }
        return (operacionPosible); //indica si ha sido posible realizar la operación
    }
    public void ingreso(double cant) { //añadimos si ha sido posible realizar la operación
        saldo += cant;
    }
    public void mostrarInformacion() {
        mostrar("Nombre: " + nombre);
        mostrar("DNI: " + dni);
        mostrar("Saldo: " + saldo + " €");
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
