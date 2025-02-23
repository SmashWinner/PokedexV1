package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Planta;
import Interfaces.Veneno;

public class Oddish extends Pokemon implements Planta, Veneno{
    private static String nombre = "Oddish";
    private static String num = "0043";
    private static String descripcion = "Pokémon de tipo Planta/Veneno";

    public Oddish(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Oddish(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
