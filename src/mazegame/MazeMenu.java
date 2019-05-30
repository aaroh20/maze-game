
package mazegame;

import java.io.*;
public class MazeMenu
{
    public static void main(String args[]) throws IOException
    {
        MazeMenu mu=new MazeMenu();
        mu.menu();
                
    }
    public static void menu()throws IOException
    {
        try
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            int option;
            boolean b=false;
            MazeMenu obj1=new MazeMenu();
            System.out.println("Maze Game\n");
            System.out.println("*********\n");
            System.out.println("Choose an option.\n");
            System.out.println("1. Play the Maze Game.\n");
            System.out.println("2. View Instructions.\n");
            System.out.println("3. Exit the Maze Game.\n");
            System.out.print("Type your choice: ");
            option = Integer.parseInt(br.readLine()); //gets users option
            while(b==false)
            {
                switch(option)
                {
                    case 1:
                    System.out.print('\f');
                    Mazes obj2=new Mazes();
                    obj2.playMaze();
                    break;
                    case 2:
                    System.out.print('\f');
                    Instructions obj3=new Instructions();
                    obj3.inst();
                    break;
                    case 3:
                    System.out.println("\f");
                    System.out.print("****************\n\n\n   THANK YOU\n\n\n****************");
                    break;
                }//switch ends
                if(option>3)
                {
                    System.out.println("\nWrong choice");
                    System.out.print("Enter your choice again :");
                    option = Integer.parseInt(br.readLine()); //gets users option
                    b=false;
                }
                else
                break;
            }
        }//try ends
        catch(Exception e)
        {
            System.out.println("\nException has occured.....Please restart the program");
        }        
    }   
}