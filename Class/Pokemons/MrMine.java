package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Hada;
import Interfaces.Psiquico;

public class MrMine extends Pokemon implements Psiquico, Hada{

    private static String nombre = "MrMine";
    private static String num = "0122";
    private static String descripcion = "Pokémon de tipo Psiquico/Hada";

    public MrMine(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public MrMine(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    
}
