package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;
import Interfaces.Roca;

public class Kabuto extends Pokemon implements Roca, Agua{
    private static String nombre = "Kabuto";
    private static String num = "0140";
    private static String descripcion = "Pokémon de tipo Roca/Agua";

    public Kabuto(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Kabuto(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
