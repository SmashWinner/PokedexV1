package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Hielo;
import Interfaces.Legendario;
import Interfaces.Volador;

public class Articuno extends Pokemon implements Hielo, Volador, Legendario{
    private static String nombre = "Articuno";
    private static String num = "0144";
    private static String descripcion = "Pokémon de tipo Hielo/Volador";

    public Articuno(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Articuno(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
