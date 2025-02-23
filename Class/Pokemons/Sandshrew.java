package Class.Pokemons;

import Class.Pokemon;

public class Sandshrew extends Pokemon{
    private static String nombre = "Sandshrew";
    private static String num = "0027";
    private static String descripcion = "Pokémon de tipo Tierra";


    public Sandshrew(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Sandshrew(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
