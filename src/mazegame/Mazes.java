/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import java.io.*;
public class Mazes
{
    public void playMaze()throws IOException
    {
        try
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            System.out.println("Different mazes to play\n");
            System.out.println("*************************\n");        
            System.out.println("Choose a Difficulty Level\n\n1)LEVEL 1\n\n2)LEVEL 2\n\n3)LEVEL 3\n\n4)LEVEL 4\n\n5)Go to Main Menu\n");
            System.out.print("Enter your choice :");
            int ch=Integer.parseInt(br.readLine());
            while(true)
            { 
                switch(ch)
                {
                    case 1:System.out.print("\f");
                    Maze1 obj4=new Maze1();
                    obj4.playMaze1();
                    break;
                    case 2:System.out.print("\f");
                    Maze2 obj5=new Maze2();
                    obj5.playMaze2();
                    break;
                    case 3:System.out.print("\f");
                    Maze3 obj6=new Maze3();
                    obj6.playMaze3();
                    break;
                    case 4:System.out.print("\f");
                    Maze4 obj7=new Maze4();
                    obj7.playMaze4();
                    break;
                    case 5:System.out.print("\f");
                    MazeMenu obj1=new MazeMenu();
                    obj1.menu();
                    break;
                    }
                if(ch>5)
                {
                    System.out.println("\nWrong choice");
                    System.out.print("Enter your choice again :");
                    ch = Integer.parseInt(br.readLine()); //gets users option
                }
                else
                break;
            }//while ends
        }//try ends
        catch(Exception e)
        {
            System.out.println("\nException has occured.....Please restart the program");
        }
    }
}