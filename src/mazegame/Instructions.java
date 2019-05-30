
package mazegame;
import java.io.*;
public class Instructions
{
    public void inst()throws IOException
    {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (isr);
        
        int j;
        String inst[]={"To beat the Maze Game you have to move your character\n","through the maze and reach the exit in as few moves as possible.\n","Your character is displayed as a @\n","The maze exit is displayed as a F\n","Reach the exit and you have won escaped the maze.\n","To control your character type the direction you want to go\n","and how many spaces you want to move\n",
        "for example 'D3' will move your character\n","down 3 spaces.\n","Remember you can't walk through walls!\n","Press enter to go back to main menu"};
        System.out.println("***********************************\n");
        System.out.println("            INSTRUCTION             \n");
        System.out.println("************************************");
        int len=inst.length;
        for(int i=0;i<len;i++)
        {
            String c=inst[i];
            for(j=0;j<99999999;j++);
            System.out.println(c);
        }
        char a=(char)br.read();
        System.out.print('\f');
        MazeMenu obj1=new MazeMenu();
        obj1.menu(); 
    }
}