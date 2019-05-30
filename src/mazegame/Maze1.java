/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import java.io.*;
public class Maze1
{
    public void playMaze1()throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader (isr);
        int i,j,n1=0,n2=2;char c;int n,k=0;
        boolean found=false;
        String maze1[][]=new String[5][7];
        while(found==false)
        {
            System.out.println("\t\tL E V E L 1\n\n*******************************************\n");
            System.out.print("1)    ");
            for(i=0;i<5;i++)
            {
                for(j=0;j<7;j++)
                {
                    if(i==0 && j==2)
                    maze1[i][j]="S ";
                    else if(n1==i && n2==j && i>0)
                    maze1[i][j]="@ ";
                    else if(i==1 && j==5)
                    maze1[i][j]="F ";
                    else if(i==1&&j==2||i==1&&j==1||i==3&&j==3||i==3&&j==2||i==3&&j==5
                    ||i==3&&j==4||i==2&&j==1||i==3&&j==1||i==2&&j==5)
                    maze1[i][j]="  ";
                    else
                    maze1[i][j]="# ";
                    System.out.print(maze1[i][j]);
                }
                System.out.println();
                System.out.print("      ");
            }
            System.out.println();
            System.out.println("Enter the direction you wish to move in and the distance\n");
            System.out.println("i.e D3 = move down 3 spaces\n");
            System.out.print("U - Up, D - Down, L - Left, R - Right :");
            c=(char)br.read();
            n=Integer.parseInt(br.readLine());
            System.out.println();
            boolean flag=false;
            while(flag==false)
            {
                switch(c)
                {
                    case 'u':
                    case 'U':
                    k=0;
                    for(int x=0;x<n;x++)
                    {
                        n1--;
                        k++;
                        if(maze1[n1][n2]=="# ")
                        {
                            n1+=k;
                            System.out.println("WARNING.....Walk through walls not allowed");
                            System.out.print("Enter the direction again :");
                            c=(char)br.read();
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
                        if(maze1[n1][n2]=="# ")
                        {
                            System.out.println("WARNING.....Walk through walls not allowed");
                            n1-=k;
                            System.out.print("Enter the direction again :");
                            c=(char)br.read();
                            n=Integer.parseInt(br.readLine());
                            flag=false;
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
                        if(maze1[n1][n2]=="# ")
                        {
                            System.out.println("WARNING.....Walk through walls not allowed");
                            n2-=k;
                            System.out.print("Enter the direction again :");
                            c=(char)br.read();
                            n=Integer.parseInt(br.readLine());
                            flag=false;
                            System.out.println("\n");
                            break;
                        }
                        else
                        flag=true;
                    }
                    break;
                    case 'l':
                    case 'L':
                    k=0;
                    for(int x=0;x<n;x++)
                    {
                        --n2;
                        k++;
                        if(maze1[n1][n2]=="# ")
                        {
                            System.out.println("WARNING.....Walk through walls not allowed");
                            n2+=k;
                            System.out.print("Enter the direction again :");
                            c=(char)br.read();
                            n=Integer.parseInt(br.readLine());
                            flag=false;
                            System.out.println("\n");
                            break;
                        }
                        else
                        flag=true;
                    }
                    break;
                    default:
                    System.out.println("WARNING...wrong input\n");
                    System.out.print("Enter the direction again :");
                    c=(char)br.read();
                    n=Integer.parseInt(br.readLine());
                    System.out.println("\n");
                }//switch ends
                if(flag==false)
                continue;
            }//while ends
            if(n1==1 && n2==5)
            {
                found=true;
                System.out.print("\f");
                System.out.println("\t\tL E V E L 1\n\n*******************************************\n");
                System.out.print("1)    ");
                for(i=0;i<5;i++)
                {
                    for(j=0;j<7;j++)
                    {
                        if(i==0 && j==2)
                        maze1[i][j]="S ";
                        else if(i==n1 && j==n2 && i>0)
                        maze1[i][j]="@ ";
                        else if(i==1 && j==5)
                        maze1[i][j]="F ";
                        else if(i==1&&j==2||i==1&&j==1||i==3&&j==3||i==3&&j==2||i==3&&j==5
                        ||i==3&&j==4||i==2&&j==1||i==3&&j==1||i==2&&j==5)
                        maze1[i][j]="  ";
                        else
                        maze1[i][j]="# ";
                        System.out.print(maze1[i][j]);
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
                    Maze2 obj5=new Maze2();
                    obj5.playMaze2();
                }
                else
                System.out.println("Error....Please Restart the program");
                break;
            }//if ends
            System.out.print("\f");
        }//while ends
    }//playMaze1 ends
}//class ends
