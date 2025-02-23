package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Bicho;
import Interfaces.Volador;

public class Scyther extends Pokemon implements Bicho, Volador{

    private static String nombre = "Scyther";
    private static String num = "0123";
    private static String descripcion = "Pokémon de tipo Bicho/Vollador";

    public Scyther(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Scyther(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
