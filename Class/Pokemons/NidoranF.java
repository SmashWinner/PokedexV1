package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Veneno;

public class NidoranF extends Pokemon implements Veneno{
    private static String nombre = "Nidoran♀";
    private static String num = "0029";
    private static String descripcion = "Pokémon de tipo Veneno";

    public NidoranF(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public NidoranF(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
