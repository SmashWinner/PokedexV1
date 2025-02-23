package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;
import Interfaces.Roca;

public class Omanyte extends Pokemon implements Roca, Agua{
    private static String nombre = "Omanyte";
    private static String num = "0138";
    private static String descripcion = "Pokémon de tipo Roca/Agua";


    public Omanyte(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Omanyte(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
