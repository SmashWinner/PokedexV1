package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;
import Interfaces.Volador;

public class Doduo extends Pokemon implements Normal, Volador{

    private static String nombre = "Doduo";
    private static String num = "0084";
    private static String descripcion = "Pokémon de tipo Normal/Volador";

    public Doduo(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Doduo(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

}
