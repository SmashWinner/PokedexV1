package Menu;
import Class.*;
import Interfaces.*;
import Utils.Colors;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu{
    public static void menu(){
        ArrayList<Pokemon> pokemons = Pokemon.getPokemons();

        String input = "";
        Scanner sc = new Scanner(System.in);
        //input = sc.next();

        while(!input.equalsIgnoreCase("Salir")){ 
            limpiarTerminal(); //Limpiar terminal
            System.out.println(Menu.texto);
            System.out.println(Colors.GREEN + "Que decea realizar? Consular o Salir"+ Colors.RESET);
            input = sc.nextLine();
            if(input.equalsIgnoreCase("consultar")){

                boolean condition = true;
                do{
                //limpiarTerminal(); //Limpiar terminal
                menuConsultar();
                switch (sc.nextInt()) {
                    case 1:
                        //tipoPlanta(pokemons);
                        imprimirTipo(pokemons, Planta.class);
                        break;
                    case 2:
                        imprimirTipo(pokemons, Fuego.class);
                        break;
                    case 3:
                        imprimirTipo(pokemons, Agua.class);
                        break;
                    case 4:
                        imprimirTipo(pokemons, Electrico.class);
                        break;
                    case 5:
                        imprimirTipo(pokemons, Normal.class);
                        break;
                    case 6: 
                        imprimirTodos(pokemons);
                        break;
                    case 7:
                    System.out.println(Colors.RED + "Regresar" + Colors.RESET);
                        condition = false;
                        break;
                
                    default:
                        break;
                }
                sc.nextLine(); //limpiar buffer
                }while(condition);
            }else{
                System.out.println(Colors.RED + "Saliendo..." + Colors.RESET);
            }

        }

        sc.close();
    }

    public static void menuConsultar(){
        System.out.println(Colors.GREEN + "¿Que tipo desea consultar?" + Colors.RESET);
        System.out.println(Colors.CYAN  + "1. Planta"   + Colors.RESET);
        System.out.println(Colors.CYAN   + "2. Fuego"     + Colors.RESET);
        System.out.println(Colors.CYAN  + "3. Agua"     + Colors.RESET);
        System.out.println(Colors.CYAN+ "4. Electrico" + Colors.RESET);
        System.out.println(Colors.CYAN+ "5. Normal"   + Colors.RESET);
        System.out.println(Colors.CYAN+ "6. Todos"   + Colors.RESET);
        System.out.println(Colors.RED + "7. Regresar" + Colors.RESET);
    }

    public static void imprimirTodos(ArrayList<Pokemon> pokemons){
        limpiarTerminal(); //Limpiar terminal
        System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
        System.out.println(Colors.GREEN + "Todos" + Colors.RESET);
        for(Pokemon p : pokemons){
            imprimirDatos(p);
        }
        System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET); 
    }
    public static void imprimirTipo(ArrayList<Pokemon> pokemons, Class<?> tipo){
        limpiarTerminal(); //Limpiar terminal
        System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
        System.out.println(Colors.GREEN + "Tipo " + tipo.getSimpleName() + Colors.RESET);
        for(Pokemon p : pokemons){
            if(tipo.isInstance(p)){
                imprimirDatos(p);
            }    
        }
        System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET); 
        //ASI LO HACIA PRIMERO CON CADA TIPO
        //     System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
        //     System.out.println(Colors.GREEN + "Tipo Normal: " + Colors.RESET);
        //     for(Pokemon p : pokemons){
        //         if(p instanceof Normal){
        //             imprimirDatos(p);
        //         }    
        //     }
        //     System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);  
    }

    public static void imprimirDatos(Pokemon p){
        System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
        System.out.println(Colors.PURPLE + "Nombre: " + Colors.BLUE + p.getNombre() + Colors.PURPLE + " #" + p.getNum() + Colors.RESET);
        System.out.println(Colors.PURPLE +"Descripcion: " + Colors.BLUE + p.getDescripcion());
    }


    public static void limpiarTerminal() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la pantalla.");
        }
    }

    public static String texto ="██████╗░░█████╗░██╗░░██╗███████╗██████╗░███████╗██╗░░██╗\r\n" + //
                                "██╔══██╗██╔══██╗██║░██╔╝██╔════╝██╔══██╗██╔════╝╚██╗██╔╝\r\n" + //
                                "██████╔╝██║░░██║█████═╝░█████╗░░██║░░██║█████╗░░░╚███╔╝░\r\n" + //
                                "██╔═══╝░██║░░██║██╔═██╗░██╔══╝░░██║░░██║██╔══╝░░░██╔██╗░\r\n" + //
                                "██║░░░░░╚█████╔╝██║░╚██╗███████╗██████╔╝███████╗██╔╝╚██╗\r\n" + //
                                "╚═╝░░░░░░╚════╝░╚═╝░░╚═╝╚══════╝╚═════╝░╚══════╝╚═╝░░╚═╝By Smash";
}
