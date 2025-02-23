package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Psiquico;

public class Mew extends Pokemon implements Psiquico{
    private static String nombre = "Mew";
    private static String num = "0151";
    private static String descripcion = "Pokémon de tipo Psiquico";

    public Mew(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Mew(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
