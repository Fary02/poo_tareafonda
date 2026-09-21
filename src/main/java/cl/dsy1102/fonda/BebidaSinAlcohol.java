package cl.dsy1102.fonda;

// Creacion de clase hija con herencia / extends y super de clase padre

public class BebidaSinAlcohol extends Bebida {

  // Unico atributo unico de la clase hija

  public int azucarPorLitro;

  // Constructor con atributos de la clase padre y super

  public BebidaSinAlcohol(String nombre, int volumenML, int stock, double precio, String detalle, int azucarPorLitro) {

    super(nombre, volumenML, stock, precio, detalle);

    this.azucarPorLitro = azucarPorLitro;

  }

  // GETTERS Y SETTERS


  public int getAzucarPorLitro() {

    return azucarPorLitro;

  }

  public void setAzucarPorlitro(int azucarPorLitro) {

    this.azucarPorLitro = azucarPorLitro;

  }

  // Methods de clase padre con @OVERRIDE

  @Override
  public void calcularPrecio() {

    System.out.println("El precio de la bebida sin alcohol es de: " + this.precio);

  }

  @Override
  public void obtenerDetalle() {

    System.out.println("La bebida sin alcohol: " + this.nombre + " tiene un valor de: " + this.precio + " y existe: " + this.stock + " unidades disponibles");

  }

}
