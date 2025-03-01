import Class.Sistema;
import Menu.*;
/*      
* ██████╗░░█████╗░██╗░░██╗███████╗██████╗░███████╗██╗░░██╗
* ██╔══██╗██╔══██╗██║░██╔╝██╔════╝██╔══██╗██╔════╝╚██╗██╔╝
* ██████╔╝██║░░██║█████═╝░█████╗░░██║░░██║█████╗░░░╚███╔╝░
* ██╔═══╝░██║░░██║██╔═██╗░██╔══╝░░██║░░██║██╔══╝░░░██╔██╗░
* ██║░░░░░╚█████╔╝██║░╚██╗███████╗██████╔╝███████╗██╔╝╚██╗
* ╚═╝░░░░░░╚════╝░╚═╝░░╚═╝╚══════╝╚═════╝░╚══════╝╚═╝░░╚═╝By Smash
 */
public class Main{

    public static void main(String[] args){
        //Creamos los objetos de los pokemons
        Sistema.cargarPokemons();

        //Empezammos el menu
        //GUI.menu(); //<--Menu en la terminal 
        GUIMenu menu = new GUIMenu();
        menu.Menu();    
    }
}