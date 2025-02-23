
import Class.Pokemons.*;
import Class.*;
import Menu.*;

public class Main{

    public static void main(String[] args){
        //Creamos los objetos de los pokemons
        cargarPokemons();

        //Empezammos el menu
        Menu.menu();
    }


    public static void cargarPokemons(){
        Pokemon.setPokemon(new Bulbasaur());
        Pokemon.setPokemon(new Ivysaur());
        Pokemon.setPokemon(new Venusaur());
        Pokemon.setPokemon(new Charmander());
        Pokemon.setPokemon(new Charmeleon());
        Pokemon.setPokemon(new Charizard());
        Pokemon.setPokemon(new Squirtle());
        Pokemon.setPokemon(new Wartortle());
        Pokemon.setPokemon(new Blastoise());
        Pokemon.setPokemon(new Caterpie());
        Pokemon.setPokemon(new Metapod());
        Pokemon.setPokemon(new Butterfree());
        Pokemon.setPokemon(new Weedle());
        Pokemon.setPokemon(new Kakuna());
        Pokemon.setPokemon(new Beedrill());
        Pokemon.setPokemon(new Pidgey());
        Pokemon.setPokemon(new Pidgeotto());
        Pokemon.setPokemon(new Pidgeot());
        Pokemon.setPokemon(new Rattata());
        Pokemon.setPokemon(new Raticate());
        Pokemon.setPokemon(new Spearow());
        Pokemon.setPokemon(new Fearow());
        Pokemon.setPokemon(new Ekans());
        Pokemon.setPokemon(new Arbok());
        Pokemon.setPokemon(new Pikachu());
        Pokemon.setPokemon(new Raichu());
        Pokemon.setPokemon(new Sandshrew());
        Pokemon.setPokemon(new Sandslash());
        Pokemon.setPokemon(new NidoranF());
        Pokemon.setPokemon(new Nidorina());
        Pokemon.setPokemon(new Nidoqueen());
        Pokemon.setPokemon(new NidoranM());
        Pokemon.setPokemon(new Nidorino());
        Pokemon.setPokemon(new Nidoking());
        Pokemon.setPokemon(new Clefairy());
        Pokemon.setPokemon(new Clefable());
        Pokemon.setPokemon(new Vulpix());
        Pokemon.setPokemon(new Ninetales());
        Pokemon.setPokemon(new Jigglypuff());
        Pokemon.setPokemon(new Wigglytuff());
        Pokemon.setPokemon(new Zubat());
        Pokemon.setPokemon(new Golbat());
        Pokemon.setPokemon(new Oddish());
        Pokemon.setPokemon(new Gloom());
        Pokemon.setPokemon(new Vileplume());
        Pokemon.setPokemon(new Paras());
        Pokemon.setPokemon(new Parasect());
        Pokemon.setPokemon(new Venonat());
        Pokemon.setPokemon(new Venomoth());
        Pokemon.setPokemon(new Diglett());
        Pokemon.setPokemon(new Dugtrio());
    }
}