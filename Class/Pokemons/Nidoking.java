package Class.Pokemons;

import Interfaces.Tierra;

public class Nidoking extends Nidorino implements Tierra{
    private static String nombre = "Nidoking";
    private static String num = "0034";
    private static String descripcion = "Pokémon de tipo Veneno/Tierra";

    public Nidoking(){
        super(nombre, num, descripcion);
    }

    public Nidoking(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);

    }
}
