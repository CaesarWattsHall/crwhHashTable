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

class Lab4_crwhHashTable {
int[] crwhArray;
    int crwhCapacity;
 
    // Here is the constructor(s).
    public Lab4_crwhHashTable(int crwhCapacity)
    {
        this.crwhCapacity = crwhGreatPrime(crwhCapacity);
        crwhArray = new int[this.crwhCapacity];
    }
 
    //INSERTION
    public void crwhInsertion(int ele)
    {
        crwhArray[ele % crwhCapacity] = ele;
    }
 
    //CLEARANCE
    public void crwhClearance()
    {
        crwhArray = new int[crwhCapacity];
    }
 
    //CHECK CONTAINER
    public boolean crwhCheckContainer(int ele)
    {
        return crwhArray[ele % crwhCapacity] == ele;
    }
 
    //DELETION
    public void crwhDeletion(int ele)
    {
        if (crwhArray[ele % crwhCapacity] == ele)
            crwhArray[ele % crwhCapacity] = 0;
        else
            System.out.println("\nERROR: Element cannot be found!\n");
    }
 
    // Lets generate the next Prime number, within the function. //
  @SuppressWarnings("empty-statement")
    private static int crwhGreatPrime( int n )
    {
        if (n % 2 == 0)
            n++;
        for (; !isPrime(n); n += 2);
 
        return n;
    }
 
    // Function to check if given number is prime //
    private static boolean isPrime(int n)
    {
        if (n == 2 || n == 3)
            return true;
        if (n == 1 || n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
 
    // This'll relay the decided function from the table //
    public void printTable()
    {
        System.out.println("\n");
        System.out.print("Heres the HashTable Result: ");

        for (int i = 0; i < crwhCapacity; i++)
            System.out.print(crwhArray[i] +" ");
        System.out.println();
    }
}  
//END