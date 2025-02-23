package Menu;
import Class.*;
import Interfaces.*;
import Utils.Colors;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu{

    public static void menu(){
        ArrayList<Pokemon> pokemons = Pokemon.getPokemons();

        String input = "";
        Scanner sc = new Scanner(System.in);
        //input = sc.next();
        while(!input.equalsIgnoreCase("Salir")){ 
            System.out.println(Colors.GREEN + "Que decea realizar? Consular o Salir"+ Colors.RESET);
            input = sc.nextLine();
            if(input.equalsIgnoreCase("consultar")){

                boolean condition = true;
                do{
                System.out.println(Colors.GREEN + "¿Qué tipo desea consultar?" + Colors.RESET);
                System.out.println(Colors.CYAN  + "1. Planta"   + Colors.RESET);
                System.out.println(Colors.CYAN   + "2. Fire"     + Colors.RESET);
                System.out.println(Colors.CYAN  + "3. Agua"     + Colors.RESET);
                System.out.println(Colors.CYAN+ "4. Eléctrico" + Colors.RESET);
                System.out.println(Colors.CYAN+ "5. Normal"   + Colors.RESET);
                System.out.println(Colors.RED + "6. Regresar" + Colors.RESET);
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                        System.out.println(Colors.GREEN + "Tipo Planta:"+ Colors.RESET);
                        for(Pokemon p : pokemons){
                            if(p instanceof Planta){
                                System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                                System.out.println(Colors.PURPLE + "Nombre: " + Colors.BLUE + p.getNombre() + Colors.PURPLE + " #" + p.getNum() + Colors.RESET);
                                System.out.println(Colors.PURPLE +"Descripcion: " + Colors.BLUE + p.getDescripcion());
                            }
                        }
                        System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                        break;
                    case 2:
                        System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                        System.out.println(Colors.GREEN + "Tipo fuego: " + Colors.RESET);
                        for(Pokemon p : pokemons){
                            if(p instanceof Fuego){
                                System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                                System.out.println(Colors.PURPLE + "Nombre: " + Colors.BLUE + p.getNombre() + Colors.PURPLE + " #" + p.getNum() + Colors.RESET);
                                System.out.println(Colors.PURPLE +"Descripcion: " + Colors.BLUE + p.getDescripcion());
                            }
                        }
                        System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                        break;
                    case 3:
                        System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET); 
                        System.out.println(Colors.GREEN + "Tipo Agua: " + Colors.RESET);
                        for(Pokemon p : pokemons){
                            if(p instanceof Agua){
                                System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                                System.out.println(Colors.PURPLE + "Nombre: " + Colors.BLUE + p.getNombre() + Colors.PURPLE + " #" + p.getNum() + Colors.RESET);
                                System.out.println(Colors.PURPLE +"Descripcion: " + Colors.BLUE + p.getDescripcion());
                            }
                        }
                        System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                        break;
                    case 4:
                        System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                        System.out.println(Colors.GREEN + "Tipo Ellectrico: " + Colors.RESET);
                        for(Pokemon p : pokemons){
                            if(p instanceof Electrico){
                                System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                                System.out.println(Colors.PURPLE + "Nombre: " + Colors.BLUE + p.getNombre() + Colors.PURPLE + " #" + p.getNum() + Colors.RESET);
                                System.out.println(Colors.PURPLE +"Descripcion: " + Colors.BLUE + p.getDescripcion());
                            }
                        }
                        System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                        break;
                    case 5:
                    System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                    System.out.println(Colors.GREEN + "Tipo Normal: " + Colors.RESET);
                    for(Pokemon p : pokemons){
                        if(p instanceof Normal){
                            System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                            System.out.println(Colors.PURPLE + "Nombre: " + Colors.BLUE + p.getNombre() + Colors.PURPLE + " #" + p.getNum() + Colors.RESET);
                            System.out.println(Colors.PURPLE +"Descripcion: " + Colors.BLUE + p.getDescripcion());
                        }    
                    }
                    System.out.println(Colors.BLUE + "-----------------------------------" + Colors.RESET);
                        break;
                    case 6:
                    System.out.println(Colors.RED + "Regresar" + Colors.RESET);
                        condition = false;
                        break;
                
                    default:
                        break;
                }
                sc.nextLine(); //limpiar buffer
                }while(condition);
            }else{
                System.out.println(Colors.RED + "Comando desconocido" + Colors.RESET);
            }

        }

        sc.close();
    }

}
