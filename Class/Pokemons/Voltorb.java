package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Electrico;

public class Voltorb extends Pokemon implements Electrico{
    private static String nombre = "Voltorb";
    private static String num = "0100";
    private static String descripcion = "Pokémon de tipo Electrico";

    public Voltorb(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Voltorb(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
