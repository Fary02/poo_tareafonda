package cl.dsy1102.fonda;

/**
 * Punto de entrada de la Tarea Fiestas Patrias - Fonda San Belarmino.
 *
 * Revisa el enunciado en README.md. Debes crear, en este mismo paquete,
 * las clases del diagrama: Bebida, BebidaAlcoholica, BebidaSinAlcohol,
 * la interfaz ConsumoResponsable y la clase GestorFonda.
 */
public class Main {

    public static void main(String[] args) {
        // TODO 1: instanciar las cuatro bebidas con los datos del enunciado.
        // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.
        // TODO 3: registrarlas todas en el gestor.
        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.
        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.

        // Se instancia cada objeto solicitado de forma correcta

        Bebida chicha = new BebidaAlcoholica("Chicha", 1000, 40, 5000, "una rica chica a base de uva", 2, 12.0, false, true);
        Bebida piscoSour = new BebidaAlcoholica("Pisco Sour", 500, 25, 2500, "un rico pisco sour", 2, 18.0, true, false);
        Bebida chichaSinAlcohol = new BebidaSinAlcohol("Chicha sin alchohol", 1000, 60, 1500, "chica en su version para niños", 95);
        Bebida moteConHuesillo = new BebidaSinAlcohol("Mote con huesillo", 400, 50, 10000, "Lo mejor de la fonda, este mote con huesillo justifica su inversion", 70);

        // Se ocupa el method solicitado y por mi lado coloque otros methods para los demas objetos

        /* si no mal recuerdo se ocupa instanceof, lei por internet que se debia castear

        chicha.restringirVenta(); */

        piscoSour.obtenerDetalle();

        chichaSinAlcohol.obtenerDetalle();

        moteConHuesillo.obtenerDetalle();

        /*       *****************NOTAS FINALES***********

          Aca intente acceder a los methods de "GestorFonda", pero al parecer al no ser abstracto quedaron
          aislados, Quedaron faltantes los pasos 3, 4, 5

        // Preguntar como se procede con la clase BebidaGestor, ya que esta involucrada en GestorFonda Linea 30

        // Dejo en claro que al no trabajar con la clase abstracta solo me permite registrar los paramentros de la clase concreta

        GestorFonda agregarChicha = new crearBebida("Chicha", 1000, 40, 5000, "una rica chica a base de uva");
        GestorFonda agregarPiscoSour = new crearBebida("Pisco Sour", 500, 25, 2500, "un rico pisco sour");
        GestorFonda agregarChichaSinAlcohol = new crearBebida("Chicha sin alchohol", 1000, 60, 1500, "chica en su version para niños");
        GestorFonda agregarmoteConHuesillo = new crearBebida("Mote con huesillo", 400, 50, 10000, "Lo mejor de la fonda, este mote con huesillo justifica su inversion");

         TIEMPO DE REALIZACION 6 HRS APROX */

        System.out.println("Proyecto listo. Comienza por la clase Bebida.");
    }
}
