package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Roca;
import Interfaces.Tierra;

public class Geodude extends Pokemon implements Roca, Tierra{
    private static String nombre = "Geodude";
    private static String num = "0074";
    private static String descripcion = "Pokémon de tipo Roca/Tierra";

    public Geodude(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Geodude(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
