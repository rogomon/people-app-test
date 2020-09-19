package Rogomon;

//Project Object Model dependencies added: mysql connector j

public class PeopleAppMySQL
{
    public static void main(String[] args) {

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }

        catch (Exception ex1)
        {
        System.out.println("Exception: Failed to register the Class.forName(\"com.mysql.cj.jdbc.Driver\")");
        }

        try
        {
            String url = "jdbc:mysql://localhost/COREJAVA";
            String username = "rodrigo";
            String password = "r0gmysql";

            java.sql.Connection conn = java.sql.DriverManager.getConnection(url, username, password);
        }

        catch (java.sql.SQLException ex2)
        {
        System.out.println("SQLException: Failed to connect to the database");
        }

        System.out.println();
        System.out.println("Lista de Pessoas de referência");
        System.out.println();

    }
}
