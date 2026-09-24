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

        // Se llama al metodo GET para obtener solo el nombre (de lo contrario, lanza todos los valores declarados en toString de la clase PADRE)

        System.out.println("Se registro la bebida: " + bebida.getNombre());

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

        // COLOCARLE A TODO THIS por si acaso

        for (Bebida bebida : this.bebidas) {
            if (bebida.getNombre().equalsIgnoreCase(nombre)) {
                if (bebida.getStock() > stock) {
                    try{
                        bebida.setStock(bebida.getStock() - stock);
                        System.out.println("Se vende la bebida: " + bebida.getNombre());
                    }catch(Exception errorStock){
                        System.out.println("Error al vender la bebida: " + errorStock.getMessage());
                    }
                }
            }
        }

    }

    // ObtenerTodas / Delete

    public List<Bebida> obtenerTodas() {

        return bebidas;

    }

}
