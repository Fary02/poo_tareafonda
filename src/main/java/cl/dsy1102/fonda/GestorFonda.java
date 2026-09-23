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

  // Vender / UPDATE (FALTA INCORPORAR)

  public void venderBebida(String nombre, int stock) {


  }

  // ObtenerTodas / Delete

  public List<Bebida> obtenerTodas() {

    return bebidas;

  }

}
