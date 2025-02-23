package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Fuego;

public class Vulpix extends Pokemon implements Fuego{
    private static String nombre = "Vulpix";
    private static String num = "0037";
    private static String descripcion = "Pokémon de tipo Fuego";


    public Vulpix(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Vulpix(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
