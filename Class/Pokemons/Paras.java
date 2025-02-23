package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Bicho;
import Interfaces.Planta;

public class Paras extends Pokemon implements Bicho, Planta{
    private static String nombre = "Paras";
    private static String num = "0046";
    private static String descripcion = "Pokémon de tipo Bicho/planta";


    public Paras(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Paras(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
