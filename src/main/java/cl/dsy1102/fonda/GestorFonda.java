package cl.dsy1102.fonda;

// Se importa List y ArrayList (Al parecer se trabajan en conjunto segun apuntes de proyecto "poo_mere_007d")

import java.util.ArrayList;
import java.util.List;

// Clase hija que gestionara el CRUD

public class GestorFonda {

  // Se importa la clase PADRE Bebida como atributo

  public List<Bebida> bebida;

  // Constuctor method con method List

  public GestorFonda() {

    this.bebida = new ArrayList<>();

  }

// Create

  public Bebida crearBebida(String nombre, int volumenML, int stock, double precio, String detalle) {

    // Una clase abstracta no se puede inicializar, por lo que creare una idetica, pero no abstracta

    Bebida nuevaBebida = new BebidaGestor(nombre, volumenML, stock, precio, detalle);

    bebida.add(nuevaBebida);

    System.out.println("Bebida" + nombre + " a sido creada exitosamente.");

    return nuevaBebida;

  }

  // READ

  public Bebida obtenerBebidas(String nombre) {

    for (Bebida bebida : bebida) {

      if (bebida.getNombre().equalsIgnoreCase(nombre)) {

        return bebida;

      }
    }

    System.out.println("Bebida no encontrada");

    return null;

  }

  // UPDATE

  public void actualizarBebidad(String nombre, int volumenML, int stock, double precio, String detalle, String nuevoNombre, int nuevoVolumenML, int nuevoStock, double nuevoPrecio, String nuevoDetalle) {

    Bebida bebida = obtenerBebidas(nombre);

    if (bebida != null) {

      bebida.setNombre(nuevoNombre);
      bebida.setVolumenML(nuevoVolumenML);
      bebida.setStock(nuevoStock);
      bebida.setPrecio(nuevoPrecio);
      bebida.setDetalle(nuevoDetalle);

      System.out.println("Bebida actualizada correctamente");

    }

  }

  // DELETE

  public void eliminarBebida(String nombre) {

    Bebida bebidas = obtenerBebidas(nombre);

    if (bebidas != null) {

      /* En teoria borra la bebida y todo lo que esta relacionado a ella */

      bebida.remove(bebidas);

      System.out.println("Bebida: " + nombre + " y toda su informacion vinculada a sido eliminada");

    }

  }

}
