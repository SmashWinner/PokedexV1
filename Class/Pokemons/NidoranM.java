package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Veneno;

public class NidoranM extends Pokemon implements Veneno{
    private static String nombre = "Nidoran♂";
    private static String num = "0032";
    private static String descripcion = "Pokémon de tipo Veneno";


    public NidoranM(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public NidoranM(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
