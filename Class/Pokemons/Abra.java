package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Psiquico;

public class Abra extends Pokemon implements Psiquico{
    private static String nombre = "Abra";
    private static String num = "0063";
    private static String descripcion = "Pokémon de tipo Psiquico";

    public Abra(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Abra(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
