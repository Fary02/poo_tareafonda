package cl.dsy1102.fonda;

// La idea de esta clase es usarla para la clase "GestorFonda"

public class BebidaGestor extends Bebida {

// No llevara atributos y el constructor method solo llevara el super con los parametros de la clase PADRE

  public BebidaGestor(String nombre, int volumenML, int stock, double precio, String detalle) {

    super(nombre, volumenML, stock, precio, detalle);

  }

  // GETTERS / SETTERS Fueron heredados de la clase PADRE

  // Definimos atributos / methods compartidos

  public void calcularPrecioBebidaGestor() {

    System.out.println("El precio es de: " + precio);

  }

  public void obtenerDetalleBebibaGestor() {

    System.out.println("La bebida: " + nombre + " tiene un valor de: " + precio + " y existe: " + stock + " unidades disponibles");

  }

}
