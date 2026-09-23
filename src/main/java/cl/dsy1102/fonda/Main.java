package cl.dsy1102.fonda;

/**
 * Punto de entrada de la Tarea Fiestas Patrias - Fonda San Belarmino.
 * <p>
 * Revisa el enunciado en README.md. Debes crear, en este mismo paquete,
 * las clases del diagrama: Bebida, BebidaAlcoholica, BebidaSinAlcohol,
 * la interfaz ConsumoResponsable y la clase GestorFonda.
 */
public class Main {

  public static void main(String[] args) {

    // TODO 1: instanciar las cuatro bebidas con los datos del enunciado.

    // Se instancia cada objeto solicitado (Existe otro metodo que segun yo se incorpora mejor)

    Bebida chicha = new BebidaAlcoholica("Chicha", 1000, 40, 5000, "una rica chica a base de uva", 2, 12.0, false, true);
    Bebida piscoSour = new BebidaAlcoholica("Pisco Sour", 500, 25, 2500, "un rico pisco sour", 2, 18.0, true, false);
    Bebida chichaSinAlcohol = new BebidaSinAlcohol("Chicha sin alchohol", 1000, 60, 1500, "chica en su version para niños", 95);
    Bebida moteConHuesillo = new BebidaSinAlcohol("Mote con huesillo", 400, 50, 10000, "Lo mejor de la fonda, este mote con huesillo justifica su inversion", 70);


    // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.

    // Se castea y restringe segun enunciado, tambien se puede ocupar un bucle for y dentro colocar instanceof

    ((BebidaAlcoholica) chicha).restringirVenta();

    // TODO 3: registrarlas todas en el gestor.

    /* FALTA INCORPORAR

    ((GestorFonda) chicha).registrarBebida();
    ((GestorFonda) piscoSour).registrarBebida();
    ((GestorFonda) chichaSinAlcohol).registrarBebida();
    ((GestorFonda) moteConHuesillo).registrarBebida(); */

    // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.

    // FALTA INCORPORAR

    // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.

    // FALTA INCORPORAR

    System.out.println("Proyecto listo. Comienza por la clase Bebida.");
  }
}