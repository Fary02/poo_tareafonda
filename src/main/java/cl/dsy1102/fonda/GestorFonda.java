package cl.dsy1102.fonda;

// Se importa List y ArrayList (Al parecer se trabajan en conjunto segun apuntes de proyecto "poo_mere_007d")

import java.util.ArrayList;
import java.util.List;

// Clase con el rol de GESTOR

public class GestorFonda {

  // Se importa la clase PADRE Bebida como atributo

  public List<Bebida> bebidas;

  // Constuctor method con method List

  public GestorFonda() {

    this.bebidas = new ArrayList<>();

  }

  // Registrar / Create

  public void registrarBebida(Bebida bebida) {

    bebidas.add(bebida);

    // Se llama al metodo GET para obtener solo el nombre
    // (de lo contrario, lanza todos los valores declarados en toString de la clase PADRE)

    if (bebida instanceof BebidaAlcoholica) {

      System.out.println(
              bebida.getNombre() + " (BebidaAlcoholica) registrada correctamente.");

    } else if (bebida instanceof BebidaSinAlcohol) {

      System.out.println(
              bebida.getNombre() + " (BebidaSinAlcohol) registrada correctamente.");
    }
  }

  // Buscar / Read

  public List<Bebida> buscarPorNombre(String nombre) {

    ArrayList<Bebida> nombreBebida = new ArrayList<>();

    for (Bebida bebida : bebidas) {

      if (bebida.getNombre().equalsIgnoreCase(nombre)) {

        nombreBebida.add(bebida);

      }
    }

    return nombreBebida;
  }

  // Vender / UPDATE

  public void venderBebida(String nombre, int stock) {

    // COLOCARLE A TODO THIS por si acaso */

    for (Bebida bebida : this.bebidas) {

      if (bebida.getNombre().equalsIgnoreCase(nombre)) {

        // Primero verificamos si hay stock suficiente

        if (bebida.getStock() < stock) {

          System.out.println("Venta rechazada: stock insuficiente.");

          return;
        }

        // Si la bebida es alcoholica
        if (bebida instanceof BebidaAlcoholica) {

          BebidaAlcoholica alcoholica = (BebidaAlcoholica) bebida;

          // Verificar si la venta esta restringida

          if (alcoholica.getVentaRestrigida()) {System.out.println("Venta rechazada: " + bebida.getNombre() + " tiene la venta restringida.");

            return;
          }

          // Verificar limite por cliente

          if (stock > alcoholica.getLimiteUnidadesPorCliente()) {

            System.out.println("Venta rechazada: " + stock + " x " + bebida.getNombre() + " superan el limite de " + alcoholica.getLimiteUnidadesPorCliente() + " por cliente.");

            return;
          }
        }

        try {

          bebida.setStock(bebida.getStock() - stock);

          double total = bebida.getPrecio() * stock;

          System.out.println("Venta autorizada: " + stock + " x " + bebida.getNombre() + " | Total: $" + Math.round(total));

        } catch (Exception errorStock) {

          System.out.println("Error al vender la bebida: " + errorStock.getMessage());
        }

        return;
      }
    }

    System.out.println("Venta rechazada: " + nombre + " no existe en el catalogo.");
  }

  // ObtenerTodas / Delete

  public List<Bebida> obtenerTodas() {

    return bebidas;
  }
}