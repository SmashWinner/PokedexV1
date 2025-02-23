package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Tierra;

public class Cubone extends Pokemon implements Tierra{

    private static String nombre = "Cubone";
    private static String num = "0104";
    private static String descripcion = "Pokémon de tipo Tierra";

    public Cubone(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Cubone(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
