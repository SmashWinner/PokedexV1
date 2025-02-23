package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Fantasma;
import Interfaces.Veneno;

public class Gastly extends Pokemon implements Fantasma, Veneno{

    private static String nombre = "Gastly";
    private static String num = "0092";
    private static String descripcion = "Pokémon de tipo Fantasma/Veneno";

    public Gastly(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Gastly(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
