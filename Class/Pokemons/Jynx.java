package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Hielo;
import Interfaces.Psiquico;

public class Jynx extends Pokemon implements Hielo, Psiquico{
    private static String nombre = "Jynx";
    private static String num = "0124";
    private static String descripcion = "Pokémon de tipo Hielo/Psiquico";

    public Jynx(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Jynx(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
    
}
