/*
*By: Caesar R. Watts-Hall
*Date: February 16, 2019
*Class: JAVA II
*Instructor: Dr.Primo
*Assignment: Lab Assignment #1
*Due Date: February 28, 2019 @ 11:55PM
*/
//START
package lab4_crwhhashtable;
import java.util.Scanner;

public class crwhHTTest {
    
public static void main(String[] args) {
        Scanner crwhScanner = new Scanner(System.in);
        System.out.println("C.R.W.H. HashTable Program");
        System.out.println("-----------------------------------------");
          System.out.print("Please enter the size of the hash-table: ");

        //Hash Table creation
        Lab4_crwhHashTable myHashTable = new Lab4_crwhHashTable(crwhScanner.nextInt());

        char crwhCharacters;
        
        //HashTable Ooperation functions
        do {
            System.out.println("\n");
            System.out.println("-------------------------------------");
            System.out.println(" ****** HashTable Menu ****** ");
            System.out.println("-------------------------------------");
            System.out.println(" (1) Insert # into the array ");
            System.out.println(" (2) Remove # from the array ");
            System.out.println(" (3) Container Check ");
            System.out.println(" (4) Clear the whole array ");
            System.out.println("-------------------------------------");
              System.out.print(" Answer: ");

            int choice = crwhScanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n");
                    System.out.println("---------------------------------------");
                      System.out.print("Enter the integer / element to insert: ");
                    
                    myHashTable.crwhInsertion(crwhScanner.nextInt());
                    break;

                case 2:
                    System.out.println("\n");
                    System.out.println("---------------------------------------");
                      System.out.print("Enter the integer / element to delete: ");
                    
                    myHashTable.crwhDeletion(crwhScanner.nextInt());
                    break;

                case 3:
                    System.out.println("\n");
                    System.out.println("-------------------------------------------");
                      System.out.print("Enter integer element to check if present: ");
                    
                    System.out.println("Contains : " + myHashTable.crwhCheckContainer(crwhScanner.nextInt()));
                    break;

                case 4:
                    myHashTable.crwhClearance();
                    System.out.println("\n");
                    System.out.println("----------------------------------------");
                    System.out.println("Report: The Hash-Table has been cleared!");
                    System.out.println("----------------------------------------");
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("ERROR: WRONG ENTRY!");

                    break;
            }

            // This will display hash table //
            myHashTable.printTable();
            System.out.println("\n");
            System.out.print("Continue? ['Y' or 'N']: ");
            crwhCharacters = crwhScanner.next().charAt(0);
        } while (crwhCharacters == 'Y' || crwhCharacters == 'y');
    }
}
//END