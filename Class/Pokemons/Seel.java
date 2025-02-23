package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;

public class Seel extends Pokemon implements Agua{
    private static String nombre = "Seel";
    private static String num = "0086";
    private static String descripcion = "Pokémon de tipo Agua";

    public Seel(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Seel(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
