package Class.Pokemons;

import Interfaces.Hielo;

public class Dewgong extends Seel implements Hielo{

    private static String nombre = "Dewgong";
    private static String num = "0087";
    private static String descripcion = "Pokémon de tipo Agua/Hielo";

    public Dewgong(){
        super(nombre, num, descripcion);
    }

    public Dewgong(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);

    }
    
}
