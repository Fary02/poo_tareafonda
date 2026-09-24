package cl.dsy1102.fonda;

// Creacion de INTERFACE, usada por clase hija "BebidaAlcoholica"

// Los atributos van todos en void, con el tipo de atributo

public interface ConsumoResponsable {

    void tieneVentaRestringida(boolean restringida);

    void restringirVenta();

    void superaLimite(int unidades);

}
