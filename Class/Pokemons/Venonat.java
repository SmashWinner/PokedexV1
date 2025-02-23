package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Bicho;
import Interfaces.Veneno;

public class Venonat extends Pokemon implements Bicho, Veneno{
    private static String nombre = "Venonat";
    private static String num = "0048";
    private static String descripcion = "Pokémon de tipo Bicho/Veneno";

    public Venonat(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Venonat(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
