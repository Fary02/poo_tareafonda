package cl.dsy1102.fonda;

// Creacion clase hija, con su implementacion y herencia con extends y super

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable {

  // aca definimos los atributos en mi opinion en privado (Acepto correcion), ya que son unicos de la clase como tal

  public int limiteUnidadesPorCliente;
  public double gradosAlcohol;
  public boolean certificada;
  public boolean ventaRestringida;

  // Al constructor se le agrega el super y atributos de la clase padre;

  public BebidaAlcoholica(String nombre, int volumenML, int stock, double precio, String detalle, int limiteUnidadesPorCliente, double gradosAlcohol, boolean certificada, boolean ventaRestringida) {

    //Implementacion de super()

    super(nombre, volumenML, stock, precio, detalle);

    this.limiteUnidadesPorCliente = limiteUnidadesPorCliente;
    this.gradosAlcohol = gradosAlcohol;
    this.certificada = certificada;
    this.ventaRestringida = ventaRestringida;

  }

  // GETTERS / SETTERS

  public int getLimiteUnidadesPorCliente() {

    return limiteUnidadesPorCliente;

  }

  public void setLimiteUnidadesPorCliente(int limiteUnidadesPorCliente) {

    this.limiteUnidadesPorCliente = limiteUnidadesPorCliente;

  }

  public double getGradosAlcohol() {

    return gradosAlcohol;

  }

  public void setGradosAlcohol(double gradosAlcohol) {

    this.gradosAlcohol = gradosAlcohol;

  }

  // Aca se puede reemplazar el GET por cualquier valor mientras se respete su sintaxis, si no me equivoco lo mismo para SETT

  public boolean isCertificada() {

    return certificada;

  }

  public void setCertificada(boolean certificada) {

    this.certificada = certificada;

  }

  // Implementacion de methods de clase padre, SOLO los de interface con @OVERRIDE (Se aceptan correciones)

  @Override

  public void calcularPrecio() {

    System.out.println("El precio de la bebida Alcoholica es: " + precio);

  }

  @Override

  public void obtenerDetalle() {

    System.out.println("La bebida alcoholica: " + nombre + " tiene un valor de: " + precio + " y existe: " + stock + " unidades disponibles");

  }

  @Override

  public void tieneVentaRestringida() {

    System.out.println("¿La bebida alcoholica tiene restriccion?: " + ventaRestringida);

  }

  @Override

  public void superaLimite(int unidades) {

    if (limiteUnidadesPorCliente >= 3) {

      System.out.println("La cantidad seleccionada: " + unidades + " supera el limite por cliente");

    } else

      System.out.println("La cantidad: " + unidades + " no supera el limite por cliente");


  }

  @Override

  public void restringirVenta() {

    System.out.println("La bebida: " + this.nombre + " no puede ser vendida");

  }

}
