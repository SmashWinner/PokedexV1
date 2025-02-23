package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Psiquico;

public class Mewtwo extends Pokemon implements Psiquico {
    private static String nombre = "Mewtwo";
    private static String num = "0150";
    private static String descripcion = "Pokémon de tipo Psiquico";

    public Mewtwo(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Mewtwo(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
