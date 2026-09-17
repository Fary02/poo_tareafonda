package cl.dsy1102.fonda;

// Creacion de INTERFACE, usada por clase hija "BebidaAlcoholica"

// Los atributos van todos en void, con el tipo de atributo

public interface ConsumoResponsable {

  // Aca no me queda claro si debo definirles un parametro boolean, o si despues se hara

  void tieneVentaRestringida();
  void restringirVenta();
  void superaLimite(int unidades);

}
