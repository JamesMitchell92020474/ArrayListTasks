/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttasks;

import java.util.ArrayList;

/**
 *
 * @author 92020474
 */
public class ArrayListTasks {

    public static ArrayList<String> shoppingList = new ArrayList<>();//Creating arraylist
    public static ArrayList mixedArrayList = new ArrayList();
    
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

      //Persons Detail List
      //TASK 2: Adding elements to the mixedArrayList
        mixedArrayList.add(1);
        mixedArrayList.add("John Smith");
        mixedArrayList.add(70.2);

        //TASK 2: Creating new Person object
        Person person1 = new Person(Integer.valueOf(mixedArrayList.get(0).toString()),
        mixedArrayList.get(1).toString(), Float.valueOf(mixedArrayList.get(2).toString()));

        //TASK 2: printing our person1's information
        System.out.println("\n" + person1);
    }

    static void printArrayList() {
        //Invoking arraylist object
        shoppingList.forEach((string) -> {
            System.out.println(string);
        });
    }

}
