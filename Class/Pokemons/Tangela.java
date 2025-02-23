package Class.Pokemons;


import Class.Pokemon;
import Interfaces.Planta;

public class Tangela extends Pokemon implements Planta{
    private static String nombre = "Tangela";
    private static String num = "0114";
    private static String descripcion = "Pokémon de tipo Planta";

    public Tangela(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Tangela(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
