package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Tierra;

public class Diglett extends Pokemon implements Tierra{
    private static String nombre = "Diglett";
    private static String num = "0050";
    private static String descripcion = "Pokémon de tipo Tierra";

    public Diglett(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Diglett(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
