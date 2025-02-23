package Class.Pokemons;

import Interfaces.Volador;

public class Butterfree extends Metapod implements Volador{
    private static String nombre = "Butterfree";
    private static String num = "0012";
    private static String descripcion = "Pokémon de tipo bicho/volador";

    public Butterfree(){
        super(nombre, num, descripcion);
    }

    public Butterfree(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);

    }
}
