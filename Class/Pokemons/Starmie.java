package Class.Pokemons;

import Interfaces.Psiquico;

public class Starmie extends Staryu implements Psiquico{
    private static String nombre = "Starmie";
    private static String num = "0121";
    private static String descripcion = "Pokémon de tipo Agua/Psiquico";

    public Starmie(){
        super(nombre, num, descripcion);
    }

    public Starmie(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);

    }

    
}
