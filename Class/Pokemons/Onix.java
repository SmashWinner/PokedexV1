package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Roca;
import Interfaces.Tierra;

public class Onix extends Pokemon implements Roca, Tierra{
    private static String nombre = "Onix";
    private static String num = "0095";
    private static String descripcion = "Pokémon de tipo Roca/Tierra";

    public Onix(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Onix(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
