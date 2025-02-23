package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;
import Interfaces.Psiquico;

public class Slowpoke extends Pokemon implements Agua, Psiquico{
    private static String nombre = "Slowpoke";
    private static String num = "0079";
    private static String descripcion = "Pokémon de tipo Agua/Psiquico";

    public Slowpoke(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Slowpoke(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
