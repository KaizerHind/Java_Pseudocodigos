package zprueba1;

public class ZPrueba1 {

    public static void main(String[] args) {
    Teclado in = new Teclado();

    String nombre = in.getString("Ingresa nombre");

    System.out.println("Hola " + nombre);

    }
    
}
