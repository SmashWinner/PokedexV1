package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;
import Interfaces.Veneno;

public class Tentacool extends Pokemon implements Agua, Veneno{
    private static String nombre = "Tentacool";
    private static String num = "0072";
    private static String descripcion = "Pokémon de tipo Agua/Veneno";

    public Tentacool(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Tentacool(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    
}
