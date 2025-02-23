package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Fuego;
import Interfaces.Legendario;
import Interfaces.Volador;

public class Moltres extends Pokemon implements Fuego, Volador, Legendario{
    private static String nombre = "Moltres";
    private static String num = "0146";
    private static String descripcion = "Pokémon de tipo Fuego/Volador";

    public Moltres(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Moltres(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
