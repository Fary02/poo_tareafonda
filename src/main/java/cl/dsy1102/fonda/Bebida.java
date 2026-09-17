package cl.dsy1102.fonda;


// Creacion clase padre abstracta

public abstract class Bebida {

  // Atributos en protected

  protected String nombre;
  protected int volumenML;
  protected int stock;
  protected double precio;
  protected String detalle;

  // Constructor method

  public Bebida(String nombre, int volumenML, int stock, double precio, String detalle) {

    this.nombre = nombre;
    this.volumenML = volumenML;
    this.stock = stock;
    this.precio = precio;
    this.detalle = detalle;

  }

  // GETTERS / SETTERS

  /* GETTERS retornan valor
    SETTERS lleva parametro, solo va set"nombre V." sin el tipo, asignan valor con this y van con void
   */

  public String getNombre() {

    return nombre;

  }

  public void setNombre(String nombre) {

    this.nombre = nombre;

  }

  public int getVolumenML() {

    return volumenML;

  }

  public void setVolumenML(int volumenML) {

    this.volumenML = volumenML;

  }

  public int getStock() {

    return stock;

  }

  public void setStock(int stock) {

    this.stock = stock;

  }

  public double getPrecio() {

    return precio;

  }

  public void setPrecio(double precio) {

    this.precio = precio;

  }

  public String getDetalle() {

    return detalle;

  }

  public void setDetalle(String detalle) {

    this.detalle = detalle;

  }

  // Definimos atributos / methods compartidos

  public void calcularPrecio() {

    System.out.println("El precio es de: " + precio);

  }

  public void obtenerDetalle() {

    System.out.println("La bebida: " + nombre + " tiene un valor de: " + precio + " y existe: " + stock + " unidades disponibles");

  }

  // Definimos toString siguiendo el diagrama (sin tener claro para que)

  public String toString() {

    return this.nombre + this.detalle + this.stock + this.precio;

  }


}
