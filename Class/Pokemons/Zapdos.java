package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Electrico;
import Interfaces.Legendario;
import Interfaces.Volador;

public class Zapdos extends Pokemon implements Electrico, Volador, Legendario{
    private static String nombre = "Zapdos";
    private static String num = "0145";
    private static String descripcion = "Pokémon de tipo Electrico/Volador";

    public Zapdos(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Zapdos(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
