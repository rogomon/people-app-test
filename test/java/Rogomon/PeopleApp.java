package Rogomon;

public class PeopleApp
{
    public static void main(String[] args)
    {
        //título
        System.out.println();
        System.out.println("Lista de Pessoas de referência");
        System.out.println();

        //declarando objetos
        People obj1 = new People();
        People obj2 = new People();
        java.util.ArrayList<People> list = new java.util.ArrayList<People>();

        //adicionando dados
        obj1.name = "Adriana Ventura";
        obj1.position = "1";
        obj1.category = "Políticos";

        obj2.name = "Marcel Van Hattem";
        obj2.position = "2";
        obj2.category = "Políticos";

        //adicionando objetos no arraylist
        list.add(obj1);
        list.add(obj2);

        //loop para leitura do arraylist
        for (People item : list)
        {
            System.out.println(item.position);
            System.out.println(item.name);
            System.out.println(item.category);
            System.out.println();
        }

        System.out.println("Novo item?(s/n)");


    }
}