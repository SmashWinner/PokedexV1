package Class.Pokemons;

import Interfaces.Tierra;

public class Nidoqueen extends Nidorina implements Tierra{
    private static String nombre = "Nidoqueen";
    private static String num = "0031";
    private static String descripcion = "Pokémon de tipo Veneno/Tierra";

    public Nidoqueen(){
        super(nombre, num, descripcion);
    }

    public Nidoqueen(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);

    }
    
}
