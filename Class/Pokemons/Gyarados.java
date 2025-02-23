package Class.Pokemons;

import Interfaces.Volador;

public class Gyarados extends Magikarp implements Volador{

    private static String nombre = "Gyarados";
    private static String num = "0130";
    private static String descripcion = "Pokémon de tipo Agua/Volador";

    public Gyarados(){
        super(nombre, num, descripcion);
    }

    public Gyarados(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);

    }
    
}
