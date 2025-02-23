package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;
import Interfaces.Volador;

public class Spearow extends Pokemon implements Volador, Normal{
    private static String nombre = "Spearow";
    private static String num = "0021";
    private static String descripcion = "Pokémon de tipo normal/volador";

    public Spearow(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Spearow(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
