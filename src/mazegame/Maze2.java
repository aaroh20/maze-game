
package mazegame;

import java.io.*;
public class Maze2
{
    public void playMaze2()throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader (isr);
        int i,j,n1=6,n2=6;char ch;int n;
        boolean found=false;
        String maze2[][]=new String[8][8];
        while(found==false)
        {
            System.out.println("\t\tL E V E L 2\n\n*******************************************\n");
            System.out.print("2)    ");
            for(i=0;i<8;i++)
            {
                for(j=0;j<8;j++)
                {
                    if(i==6 && j==6)
                    maze2[i][j]="S ";
                    else if((i==n1 && j==n2) && i>0)
                    maze2[i][j]="@ ";
                    else if(i==1 && j==1)
                    maze2[i][j]="F ";
                    else if(i==1&&j==2||i==1&&j==3||i==1&&j==4||i==1&&j==5||i==1&&j==6||i==2&&j==6||i==3&&j==2||i==3&&j==3||i==3&&j==4||i==3&&j==5||i==3&&j==6
                    ||i==4&&j==1||i==4&&j==2||i==5&&j==1||i==5&&j==3||i==5&&j==4||i==5&&j==5||i==5&&j==6||i==6&&j==1||i==6&&j==2||i==6&&j==3)
                    maze2[i][j]="  ";
                    else
                    maze2[i][j]="# ";
                    System.out.print(maze2[i][j]);
                }
                System.out.println();
                System.out.print("      ");
            }//for loop ends
            System.out.println();
            System.out.println("Enter the direction you wish to move in and the distance\n");
            System.out.println("i.e D3 = move down 3 spaces\n");
            System.out.print("U - Up, D - Down, L - Left, R - Right: ");
            ch=(char)br.read();
            n=Integer.parseInt(br.readLine());
            System.out.println();
            boolean flag=false;int k;
            while(flag==false)
            {
                switch(ch)
                {
                    case 'u':
                    case 'U':
                    k=0;
                    for(int x=0;x<n;x++)
                    {
                        n1--;
                        k++;
                        if(maze2[n1][n2]=="# ")
                        {
                            n1+=k;
                            System.out.println("WARNING.....Walk through walls not allowed");
                            System.out.print("Enter the direction again :");
                            ch=(char)br.read();
                            flag=false;
                            n=Integer.parseInt(br.readLine());
                            System.out.println("\n");
                            break;
                        }
                        else
                        flag=true;
                    }//for loop ends
                    break;
                    case 'd':
                    case 'D':
                    k=0;
                    for(int x=0;x<n;x++)
                    {
                        n1++;
                        k++;
                        if(maze2[n1][n2]=="# ")
                        {
                            n1-=k;
                            System.out.println("WARNING.....Walk through walls not allowed");
                            System.out.print("Enter the direction again :");
                            ch=(char)br.read();
                            flag=false;
                            n=Integer.parseInt(br.readLine());
                            System.out.println("\n");
                            break;
                        }
                        else
                        flag=true;
                    }//for loop ends
                    break;
                    case 'r':
                    case 'R':
                    k=0;
                    for(int x=0;x<n;x++)
                    {
                        ++n2;
                        k++;
                        if(maze2[n1][n2]=="# ")
                        {
                            n2-=k;
                            System.out.println("WARNING.....Walk through walls not allowed");
                            System.out.print("Enter the direction again :");
                            ch=(char)br.read();
                            flag=false;
                            n=Integer.parseInt(br.readLine());
                            System.out.println("\n");
                            break;
                        }
                        else
                        flag=true;
                    }//for loop ends
                    break;
                    case 'l':
                    case 'L':
                    k=0;
                    for(int x=0;x<n;x++)
                    {
                        --n2;
                        k++;
                        if(maze2[n1][n2]=="# ")
                        {
                            n2+=k;
                            System.out.println("WARNING.....Walk through walls not allowed");
                            System.out.print("Enter the direction again :");
                            ch=(char)br.read();
                            flag=false;
                            n=Integer.parseInt(br.readLine());
                            System.out.println("\n");
                            break;
                        }
                        else
                        flag=true;
                    }//for loop ends
                    break;
                    default:
                    System.out.println("WARNING.....wrong input");
                    System.out.print("Enter the direction again :");
                    ch=(char)br.read();
                    n=Integer.parseInt(br.readLine());
                    System.out.println("\n");
                }//switch ends
                if(flag==false)
                continue;
            }//while ends
            if(n1==1 && n2==1)
            {
                found=true;
                System.out.print("\f");
                System.out.println("\t\tL E V E L 2\n\n*******************************************\n");
                System.out.print("2)    ");
                for(i=0;i<8;i++)
                {
                    for(j=0;j<8;j++)
                    {
                        if(i==6 && j==6)
                        maze2[i][j]="S ";
                        else if(i==n1 && j==n2 && i>0)
                        maze2[i][j]="@ ";
                        else if(i==1 && j==1)
                        maze2[i][j]="F ";
                        else if(i==1&&j==2||i==1&&j==3||i==1&&j==4||i==1&&j==5||i==1&&j==6||i==2&&j==6||i==3&&j==2||i==3&&j==3||i==3&&j==4||i==3&&j==5||i==3&&j==6
                        ||i==4&&j==1||i==4&&j==2||i==5&&j==1||i==5&&j==3||i==5&&j==4||i==5&&j==5||i==5&&j==6||i==6&&j==1||i==6&&j==2||i==6&&j==3)
                        maze2[i][j]="  ";
                        else
                        maze2[i][j]="# ";
                        System.out.print(maze2[i][j]);
                     }
                     System.out.println();
                     System.out.print("      ");
                 }
                 System.out.println("\nCongratulations!!!\n\nYou have escaped from the maze\n");
                 System.out.print("Enter 'B' to go back OR enter 'N' to go to the next level :");
                 char a=(char)br.read();
                 if(a=='B' || a=='b')
                 {
                     System.out.print("\f");
                     Mazes obj2=new Mazes();
                     obj2.playMaze();
                 }
                 else if(a=='N' || a=='n')
                 {
                     System.out.print("\f");
                     Maze3 obj6=new Maze3();
                     obj6.playMaze3();
                 }
                 else
                 System.out.println("Error....Please Restart the program");
                 break;
            }//if ends
            System.out.print("\f");
        }//while loop ends
    }//playMaze2 ends 
}//class ends