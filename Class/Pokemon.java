package Class;
import java.util.ArrayList;
import java.util.UUID;

public abstract class Pokemon {
    public Pokemon(){

    }
    public Pokemon(String nombre, String num){
        this.nombre = nombre;
        this.num = num;
        this.id = UUID.randomUUID().toString();
        //Pokemon.setPokemon(pokemon);
    }

    public static ArrayList<Pokemon> pokemons = new ArrayList<>();
    private String nombre;
    private String num;
    private String id;
    private String descripcion;

    //Getters
    public String getNombre(){return this.nombre;}
    public String getId(){return this.id;}
    public String getNum(){return this.num;}
    public String getDescripcion(){return this.descripcion;}

    public static ArrayList<Pokemon> getPokemons(){
        return pokemons;
    }

    //Setters
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setDescripcion(String descripcion){this.descripcion = descripcion;}

    public static void setPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }
}
