package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Planta;
import Interfaces.Psiquico;

public class Exeggcute extends Pokemon implements Planta, Psiquico{

    private static String nombre = "Exeggcute";
    private static String num = "0102";
    private static String descripcion = "Pokémon de tipo Planta/Psiquico";
    
    public Exeggcute(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Exeggcute(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

}
