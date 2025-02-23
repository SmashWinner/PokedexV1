package Class.Pokemons;
import Class.Pokemon;
import Interfaces.*;


public class Bulbasaur extends Pokemon implements Planta, Veneno{
    private static String nombre = "Bulbasaur";
    private static String num = "0001";
    private static String descripcion = "Pokémon de tipo Planta/Veneno";


    public Bulbasaur(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Bulbasaur(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    
}
