package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Psiquico;

public class Drowzee extends Pokemon implements Psiquico{
    private static String nombre = "Drowzee";
    private static String num = "0096";
    private static String descripcion = "Pokémon de tipo Psiquico";

    public Drowzee(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Drowzee(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
