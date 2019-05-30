
package mazegame;

import java.io.*;
public class Maze3
{
    public void playMaze3()throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int i,j,n1=1,n2=0;
        boolean found=false,flag=false;
        String maze3[][]=new String[12][12];
        while(found==false)
        {
            System.out.println("\t\tL E V E L 3\n\n*******************************************\n");
            System.out.print("3)    ");
            for(i=0;i<12;i++)
            {
                for(j=0;j<12;j++)
                {
                    if(i==1 && j==0)
                    maze3[i][j]="S ";
                    else if(i==n1 && j==n2 && i>0)
                    maze3[i][j]="@ ";
                    else if(i==11 && j==10)
                    maze3[i][j]="F ";
                    else if(i==1&&j==1||i==1&&j==3||i==1&&j==7||
                    i==2&&j==1||i==2&&j==3||i==2&&j==4||i==2&&j==5||i==2&&j==6||i==2&&j==7||
                    i==2&&j==8||i==2&&j==9||i==3&&j==1||i==3&&j==3||i==3&&j==7||i==4&&j==1||
                    i==4&&j==3||i==4&&j==5||i==4&&j==6||i==4&&j==7||i==4&&j==8||i==4&&j==9
                    ||i==4&&j==10||i==5&&j==1||i==5&&j==3||i==5&&j==5||i==6&&j==1||i==6&&j==2||i==6&&j==3||i==6&&j==5||i==6&&j==6||i==6&&j==7
                    ||i==6&&j==8||i==6&&j==9||i==6&&j==10||i==7&&j==3||i==7&&j==10||i==8&&j==1
                    ||i==8&&j==2||i==8&&j==3||i==8&&j==4||i==8&&j==5||i==8&&j==6||
                    i==8&&j==7||i==8&&j==8||i==8&&j==10||i==9&&j==1||i==9&&j==10||i==10&&j==1||i==10&&j==2
                    ||i==10&&j==3||i==10&&j==4||i==10&&j==5||i==10&&j==6||i==10&&j==7
                    ||i==10&&j==10)
                    maze3[i][j]="  ";
                    else
                    maze3[i][j]="# ";
                    System.out.print(maze3[i][j]);
                }
                System.out.println();
                System.out.print("      ");
            }
            System.out.println();
            System.out.println("Enter the direction you wish to move in and the distance\n");
            System.out.println("i.e D3 = move down 3 spaces\n");
            System.out.print("U - Up, D - Down, L - Left, R - Right: ");
            char c=(char)br.read();
            int n=Integer.parseInt(br.readLine());
            System.out.println();
            flag=false;int k;
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
                        if(maze3[n1][n2]=="# ")
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
                        if(maze3[n1][n2]=="# ")
                        {
                            n1-=k;
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
                    case 'r':
                    case 'R':
                    k=0;
                    for(int x=0;x<n;x++)
                    {
                        n2++;
                        k++;
                        if(maze3[n1][n2]=="# ")
                        {
                            n2-=k;
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
                    case 'l':
                    case 'L':
                    k=0;
                    for(int x=0;x<n;x++)
                    {
                        n2--;
                        k++;
                        if(maze3[n1][n2]=="# ")
                        {
                            n2+=k;
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
                    default:
                    System.out.println("WARNING.....wrong input");
                    System.out.print("Enter the direction again :");
                    c=(char)br.read();
                    n=Integer.parseInt(br.readLine());
                    System.out.println("\n");
                }//switch case ends
                if(flag==false)
                continue;
            }//while loop ends
            if(n1==11 && n2==10)
            {
                found=true;
                System.out.print("\f");
                System.out.println("\t\tL E V E L 3\n\n*******************************************\n");
                System.out.print("3)    ");
                for(i=0;i<12;i++)
                {
                    for(j=0;j<12;j++)
                    {
                        if(i==1 && j==0)
                        maze3[i][j]="S ";
                        else if(i==n1 && j==n2 && i>0)
                        maze3[i][j]="@ ";
                        else if(i==11 && j==10)
                        maze3[i][j]="F ";
                        else if(i==1&&j==1||i==1&&j==3||i==1&&j==7||
                        i==2&&j==1||i==2&&j==3||i==2&&j==4||i==2&&j==5||i==2&&j==6||i==2&&j==7||
                        i==2&&j==8||i==2&&j==9||i==3&&j==1||i==3&&j==3||i==3&&j==7||i==4&&j==1||
                        i==4&&j==3||i==4&&j==5||i==4&&j==6||i==4&&j==7||i==4&&j==8||i==4&&j==9
                        ||i==4&&j==10||i==5&&j==1||i==5&&j==3||i==5&&j==5||i==6&&j==1||i==6&&j==2||i==6&&j==3||i==6&&j==5||i==6&&j==6||i==6&&j==7
                        ||i==6&&j==8||i==6&&j==9||i==6&&j==10||i==7&&j==3||i==7&&j==10||i==8&&j==1
                        ||i==8&&j==2||i==8&&j==3||i==8&&j==4||i==8&&j==5||i==8&&j==6||
                        i==8&&j==7||i==8&&j==8||i==8&&j==10||i==9&&j==1||i==9&&j==10||i==10&&j==1||i==10&&j==2
                        ||i==10&&j==3||i==10&&j==4||i==10&&j==5||i==10&&j==6||i==10&&j==7
                        ||i==10&&j==10)
                        maze3[i][j]="  ";
                        else
                        maze3[i][j]="# ";
                        System.out.print(maze3[i][j]);
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
                    Maze4 obj7=new Maze4();
                    obj7.playMaze4();
                }
                else
                System.out.println("Error....Please Restart the program");
                break;
            }//if ends
            System.out.print("\f");
        }//while ends
    }//playMaze3 ends
}//class ends
