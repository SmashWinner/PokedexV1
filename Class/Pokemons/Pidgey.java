package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;
import Interfaces.Volador;

public class Pidgey extends Pokemon implements Normal, Volador{
    private static String nombre = "Pidgey";
    private static String num = "0016";
    private static String descripcion = "Pokémon de tipo normal/volador";
    
    public Pidgey(){
        super(nombre, num);
        this.setDescripcion(descripcion); 
     }
 
     public Pidgey(String nombre, String num, String descripcion){
         super(nombre, num);
         this.setDescripcion(descripcion); 
     }
}
