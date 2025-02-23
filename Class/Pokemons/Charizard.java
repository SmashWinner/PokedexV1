package Class.Pokemons;

import Interfaces.*;
public class Charizard extends Charmeleon implements Volador{
    private static String nombre = "Charizard";
    private static String num = "0006";
    private static String descripcion = "Pokémon de tipo fuego/Volador";

    public Charizard(){
        super(nombre, num, descripcion);
        
    }

    public Charizard(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);
      
    }
}
