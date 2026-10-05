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

    Bebida chicha = new BebidaAlcoholica("Chicha", 1000, 40, 4200, "una rica chica a base de uva", 3, 12.0, false, true);
    Bebida piscoSour = new BebidaAlcoholica("Pisco Sour", 500, 25, 3500, "un rico pisco sour", 3, 18.0, true, false);
    Bebida chichaSinAlcohol = new BebidaSinAlcohol("Chicha", 1000, 60, 2200, "chica en su version para niños", 95);
    Bebida moteConHuesillo = new BebidaSinAlcohol("Mote con Huesillo", 400, 50, 2000, "Lo mejor de la fonda, este mote con huesillo justifica su inversion", 70);

    // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.

    // Se castea y restringe segun enunciado, tambien se puede ocupar un bucle for y dentro colocar instanceof

    System.out.println("--------------------------------------\n");

    System.out.println("=== LA BEBIDA CHICHA QUEDA RESTRINGIDA, TAMPOCO SE PUEDE VENDER ===\n");

    ((BebidaAlcoholica) chicha).restringirVenta();

    System.out.println("--------------------------------------\n");

    // TODO 3: registrarlas todas en el gestor.

      System.out.println("=== REGISTRO DE BEBIDAS ===\n");

    // Se crea el objeto gestorFonda y se le pasa el objeto de la clase Bebida

    GestorFonda gestorFonda = new GestorFonda();

    gestorFonda.registrarBebida(chicha);
    gestorFonda.registrarBebida(piscoSour);
    gestorFonda.registrarBebida(chichaSinAlcohol);
    gestorFonda.registrarBebida(moteConHuesillo);

    // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.

    System.out.println("--------------------------------------\n");

    System.out.println("=== BUSQUEDA POR NOMBRE: \"Chicha\" ===\n");

    // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.

    List<Bebida> resultadoBebidas = gestorFonda.buscarPorNombre("Chicha");

    if (resultadoBebidas.isEmpty()) {

      System.out.println("La bebida no existe en el catalogo");

    } else {

      for (Bebida bebida : resultadoBebidas) {

        if (bebida instanceof BebidaAlcoholica alcoholica) {

          System.out.println("Tipo: Bebida Alcoholica" + " | Nombre: " + bebida.getNombre() + " | Volumen: " + bebida.getVolumenML() + " ml" + " | Stock: " + bebida.getStock() + " | Grados: " + alcoholica.getGradosAlcohol() + " | Certificada: " + (alcoholica.isCertificada() ? "Si" : "No"));

          System.out.println("  Venta restringida: " + (alcoholica.getVentaRestrigida() ? "Si" : "No") + " | Precio: $" + Math.round(bebida.getPrecio()));

        } else if (bebida instanceof BebidaSinAlcohol sinAlcohol) {

          System.out.println("Tipo: Bebida Sin Alcohol" + " | Nombre: " + bebida.getNombre() + " | Volumen: " + bebida.getVolumenML() + " ml" + " | Stock: " + bebida.getStock() + " | Azucar: " + sinAlcohol.getAzucarPorLitro() + " g/L" + " | Precio: $" + Math.round(bebida.getPrecio()));
        }

        System.out.println("-----------------------------------------");
      }
    }

    // VENTAS

    System.out.println("=== VENTAS ===\n");

    gestorFonda.venderBebida(piscoSour.getNombre(), 2);
    gestorFonda.venderBebida(piscoSour.getNombre(), 5);
    gestorFonda.venderBebida(chicha.getNombre(), 1);
    gestorFonda.venderBebida(moteConHuesillo.getNombre(), 6);

    System.out.println("-----------------------------------------");

    // LISTADO DE BEBIDAS

    List<Bebida> obtenerResultado = gestorFonda.obtenerTodas();

    System.out.println();
    System.out.println("=== LISTADO DE BEBIDAS ===\n");

    for (Bebida bebida : obtenerResultado) {

      System.out.println(bebida.toString());
      System.out.println("-----------------------------------------");
    }
  }
}