package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Veneno;
import Interfaces.Volador;

public class Zubat extends Pokemon implements Veneno, Volador{
    private static String nombre = "Zubat";
    private static String num = "0041";
    private static String descripcion = "Pokémon de tipo Veneno/Volador";


    public Zubat(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Zubat(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

}
