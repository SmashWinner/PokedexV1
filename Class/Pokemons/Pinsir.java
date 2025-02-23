package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Bicho;

public class Pinsir extends Pokemon implements Bicho{
    private static String nombre = "Pinsir";
    private static String num = "0127";
    private static String descripcion = "Pokémon de tipo Bicho";

    public Pinsir(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Pinsir(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
