package Class.Pokemons;

public class Golem extends Graveler{
    private static String nombre = "Golem";
    private static String num = "0076";
    private static String descripcion = "Pokémon de tipo Roca/Tierra";

    
    public Golem(){
        super(nombre, num, descripcion);
    }

    public Golem(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);

    }
}
