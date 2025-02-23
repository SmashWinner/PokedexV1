package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Fuego;

public class Ponyta extends Pokemon implements Fuego{  
    private static String nombre = "Ponyta";
    private static String num = "0077";
    private static String descripcion = "Pokémon de tipo Fuego";
    
    public Ponyta(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Ponyta(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
