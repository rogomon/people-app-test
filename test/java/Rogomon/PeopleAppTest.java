package Rogomon;

public class PeopleAppTest
{
    public static void main(String[] args)
    {
        //tittle
        System.out.println();
        System.out.println("Lista de Pessoas de referência");
        System.out.println();

        //creating a list for the class People
        java.util.ArrayList<People> list = new java.util.ArrayList<>();

        //adding a new item to the list
        System.out.println("Novo item?(s/n)");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String userInput = scan.next();

        //loop to add new items
        while(userInput.equals("s"))
        {
            People newObj = new People();

            System.out.println("Posição:");
            newObj.position = scan.next();

            System.out.println("Nome:");
            newObj.name = scan.next();

            System.out.println("Categoria:");
            newObj.category = scan.next();

            list.add(newObj);

            //loop to read the ArrayList
            for (People item : list)
            {
                System.out.println(item.position);
                System.out.println(item.name);
                System.out.println(item.category);
                System.out.println();
            }

            System.out.println("Novo item?(s/n)");
            userInput = scan.next();
        }
    }
}