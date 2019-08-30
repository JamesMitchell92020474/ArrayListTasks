/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttasks;

import java.util.ArrayList;
import static java.util.Collections.list;

/**
 *
 * @author 92020474
 */
public class ArrayListTasks {
    
    static ArrayList<String> shoppingList = new ArrayList<>();//Creating arraylist

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      shoppingList.add("Juice");//Adding object in arraylist    
      shoppingList.add("Bread");    
      shoppingList.add("Butter");    
      shoppingList.add("Cheese");
      
      System.out.println("\n" + "List 1:");
      printArrayList();
      
      shoppingList.add("Eggs");    
      shoppingList.add("Onions");
      
      System.out.println("\n" + "List 2:");
      printArrayList();
      
      shoppingList.remove("Bread");    
      shoppingList.remove("Butter");
      
      System.out.println("\n" + "List 3:");
      printArrayList();
    }
    
    static void printArrayList() {
        //Invoking arraylist object
        shoppingList.forEach((string) -> {
            System.out.println(string);
        });
    }
  
}
