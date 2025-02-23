package Class.Pokemons;

import Interfaces.Volador;

public class Dragonite extends Dragonair implements Volador{
    private static String nombre = "Dragonite";
    private static String num = "0149";
    private static String descripcion = "Pokémon de tipo Dragon/Volador";


    public Dragonite(){
        super(nombre, num, descripcion);
    }

    public Dragonite(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);

    }
    
}
