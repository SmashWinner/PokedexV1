package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Planta;
import Interfaces.Veneno;

public class Bellsprout extends Pokemon implements Planta, Veneno{
    private static String nombre = "Bellsprout";
    private static String num = "0069";
    private static String descripcion = "Pokémon de tipo Planta/Veneno";

    public Bellsprout(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Bellsprout(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
