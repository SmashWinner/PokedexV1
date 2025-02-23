package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Roca;
import Interfaces.Tierra;

public class Rhyhorn extends Pokemon implements Tierra, Roca{
    private static String nombre = "Rhyhorn";
    private static String num = "0110";
    private static String descripcion = "Pokémon de tipo Tierra/Roca";

    public Rhyhorn(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Rhyhorn(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
