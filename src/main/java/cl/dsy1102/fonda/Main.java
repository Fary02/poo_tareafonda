package cl.dsy1102.fonda;

import java.util.List;

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

        // Se crea el objeto gestorFonda y se le pasa el objeto de la clase Bebida

        GestorFonda gestorFonda = new GestorFonda();

        gestorFonda.registrarBebida(chicha);
        gestorFonda.registrarBebida(piscoSour);
        gestorFonda.registrarBebida(chichaSinAlcohol);
        gestorFonda.registrarBebida(moteConHuesillo);

        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.

        // FALTA logica del SETTER stock

        gestorFonda.venderBebida(chicha.getNombre(),1);

        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.

        List<Bebida> resultadoBebidas = gestorFonda.buscarPorNombre("Chicha");
        if (resultadoBebidas.isEmpty()) {
            System.out.println("La bebida no existe en el catalogo");
        } else {
            System.out.println("La bebida existe en el catalogo: ");
            for (Bebida bebida : resultadoBebidas) {
                System.out.println(bebida.getNombre());
            }
        }

        List<Bebida> obtenerResultado = gestorFonda.obtenerTodas();

        for (Bebida bebida : obtenerResultado) {

            System.out.println("Bebida: " + bebida.getNombre());
        }

        System.out.println("Proyecto listo. Comienza por la clase Bebida.");
    }
}