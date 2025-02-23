package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;
import Interfaces.Hielo;

public class Lapras extends Pokemon implements Agua, Hielo{
    private static String nombre = "Lapras";
    private static String num = "0131";
    private static String descripcion = "Pokémon de tipo Agua/Hielo";


    public Lapras(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Lapras(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
