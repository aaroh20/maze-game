/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import java.io.*;
public class Maze4
{
    public void playMaze4()throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int i,j,n1=1,n2=0;
        boolean found=false,flag=false;
        String maze4[][]=new String[17][27];
        while(found==false)
        {
            System.out.println("\t\t\tL E V E L 4\n\n*************************************************\n");
            System.out.print("4)    ");
            for(i=0;i<17;i++)
            {
                for(j=0;j<27;j++)
                {
                    if(i==1 && j==0)
                    maze4[i][j]="S ";
                    else if(i==n1 && j==n2 && i>0)
                    maze4[i][j]="@ ";
                    else if(i==16 && j==25)
                    maze4[i][j]="F ";
                    else if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==1&&j==4||i==1&&j==5||i==1&&j==6||i==1&&j==7||i==1&&j==9||i==1&&j==11||i==1&&j==12||
                    i==1&&j==13||i==1&&j==14||i==1&&j==15||i==1&&j==16||i==1&&j==17||i==1&&j==18||i==1&&j==19||i==1&&j==21||i==1&&j==22||i==1&&j==23||
                    i==1&&j==24||i==1&&j==25||
                    i==2&&j==1||i==2&&j==3||i==2&&j==7||i==2&&j==9||i==2&&j==11||i==2&&j==17||i==2&&j==19||i==2&&j==21||i==2&&j==23||
                    i==2&&j==25||
                    i==3&&j==1||i==3&&j==3||i==3&&j==5||i==3&&j==6||i==3&&j==7||i==3&&j==9||i==3&&j==10||i==3&&j==11||
                    i==3&&j==13||i==3&&j==14||i==3&&j==15||i==3&&j==17||i==3&&j==19||i==3&&j==20||i==3&&j==21||i==3&&j==23||
                    i==3&&j==25||
                    i==4&&j==3||i==4&&j==5||i==4&&j==13||i==4&&j==15||i==4&&j==23||
                    i==4&&j==25||
                    i==5&&j==1||i==5&&j==2||i==5&&j==3||i==5&&j==5||i==5&&j==6||i==5&&j==7||i==5&&j==8||i==5&&j==9||i==5&&j==10||i==5&&j==11||i==5&&j==12||
                    i==5&&j==13||i==5&&j==15||i==5&&j==16||i==5&&j==17||i==5&&j==18||i==5&&j==19||i==5&&j==20||i==5&&j==21||i==5&&j==22||i==5&&j==23||
                    i==5&&j==25||
                    i==6&&j==1||i==6&&j==5||i==6&&j==25||
                    i==7&&j==1||i==7&&j==2||i==7&&j==3||i==7&&j==5||i==7&&j==7||i==7&&j==8||i==7&&j==9||i==7&&j==11||i==7&&j==12||
                    i==7&&j==13||i==7&&j==14||i==7&&j==15||i==7&&j==17||i==7&&j==18||i==7&&j==19||i==7&&j==20||i==7&&j==21||i==7&&j==23||
                    i==7&&j==24||i==7&&j==25||
                    i==8&&j==1||i==8&&j==3||i==8&&j==7||i==8&&j==9||i==8&&j==11||i==8&&j==17||i==8&&j==21||i==8&&j==23||
                    i==9&&j==1||i==9&&j==3||i==9&&j==4||i==9&&j==5||i==9&&j==6||i==9&&j==7||i==9&&j==9||i==9&&j==11||i==9&&j==12||
                    i==9&&j==13||i==9&&j==15||i==9&&j==16||i==9&&j==17||i==9&&j==18||i==9&&j==19||i==9&&j==21||i==9&&j==22||i==9&&j==23||
                    i==9&&j==24||i==9&&j==25||
                    i==10&&j==1||i==10&&j==9||i==10&&j==11||i==10&&j==13||i==10&&j==15||i==10&&j==25||
                    i==11&&j==1||i==11&&j==2||i==11&&j==3||i==11&&j==5||i==11&&j==6||i==11&&j==7||i==11&&j==9||i==11&&j==11||i==11&&j==13||i==11&&j==14||i==11&&j==15||i==11&&j==17||i==11&&j==18||i==11&&j==19||i==11&j==20||i==11&&j==21||i==11&&j==22||i==11&&j==23||
                    i==11&&j==25||
                    i==12&&j==3||i==12&&j==7||i==12&&j==9||i==12&&j==11||i==12&&j==17||i==12&&j==23||
                    i==13&&j==1||i==13&&j==3||i==13&&j==4||i==13&&j==5||i==13&&j==6||i==13&&j==7||i==13&&j==9||i==13&&j==11||i==13&&j==12||
                    i==13&&j==13||i==13&&j==14||i==13&&j==15||i==13&&j==17||i==13&&j==19||i==13&&j==21||i==13&&j==22||i==13&&j==23||
                    i==13&&j==25||
                    i==14&&j==1||i==14&&j==7||i==14&&j==9||i==14&&j==17||i==14&&j==19||i==14&&j==21||i==14&&j==25||
                    i==15&&j==1||i==15&&j==2||i==15&&j==3||i==15&&j==4||i==15&&j==5||i==15&&j==6||i==15&&j==7||i==15&&j==9||i==15&&j==10||i==15&&j==11||i==15&&j==12||
                    i==15&&j==13||i==15&&j==14||i==15&&j==15||i==15&&j==16||i==15&&j==17||i==15&&j==18||i==15&&j==19||i==15&&j==21||i==15&&j==22||i==15&&j==23||
                    i==15&&j==24||i==15&&j==25)
                    maze4[i][j]="  ";
                    else
                    maze4[i][j]="# ";
                    System.out.print(maze4[i][j]);
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
                        if(maze4[n1][n2]=="# ")
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
                        if(maze4[n1][n2]=="# ")
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
                        if(maze4[n1][n2]=="# ")
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
                        if(maze4[n1][n2]=="# ")
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
                }//switch ends
                if(flag==false)
                continue;
            }//while ends
            if(n1==16 && n2==25)
            {
                found=true;
                System.out.print("\f");
                System.out.println("\t\t\tL E V E L 4\n\n*************************************************\n");
                System.out.print("4)    ");
                for(i=0;i<17;i++)
                {
                    for(j=0;j<27;j++)
                    {
                        if(i==1 && j==0)
                        maze4[i][j]="S ";
                        else if(i==n1 && j==n2 && i>0)
                        maze4[i][j]="@ ";
                        else if(i==16 && j==25)
                        maze4[i][j]="F ";
                        else if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==1&&j==4||i==1&&j==5||i==1&&j==6||i==1&&j==7||i==1&&j==9||i==1&&j==11||i==1&&j==12||
                        i==1&&j==13||i==1&&j==14||i==1&&j==15||i==1&&j==16||i==1&&j==17||i==1&&j==18||i==1&&j==19||i==1&&j==21||i==1&&j==22||i==1&&j==23||
                        i==1&&j==24||i==1&&j==25||
                        i==2&&j==1||i==2&&j==3||i==2&&j==7||i==2&&j==9||i==2&&j==11||i==2&&j==17||i==2&&j==19||i==2&&j==21||i==2&&j==23||
                        i==2&&j==25||
                        i==3&&j==1||i==3&&j==3||i==3&&j==5||i==3&&j==6||i==3&&j==7||i==3&&j==9||i==3&&j==10||i==3&&j==11||
                        i==3&&j==13||i==3&&j==14||i==3&&j==15||i==3&&j==17||i==3&&j==19||i==3&&j==20||i==3&&j==21||i==3&&j==23||
                        i==3&&j==25||
                        i==4&&j==3||i==4&&j==5||i==4&&j==13||i==4&&j==15||i==4&&j==23||
                        i==4&&j==25||
                        i==5&&j==1||i==5&&j==2||i==5&&j==3||i==5&&j==5||i==5&&j==6||i==5&&j==7||i==5&&j==8||i==5&&j==9||i==5&&j==10||i==5&&j==11||i==5&&j==12||
                        i==5&&j==13||i==5&&j==15||i==5&&j==16||i==5&&j==17||i==5&&j==18||i==5&&j==19||i==5&&j==20||i==5&&j==21||i==5&&j==22||i==5&&j==23||
                        i==5&&j==25||
                        i==6&&j==1||i==6&&j==5||i==6&&j==25||
                        i==7&&j==1||i==7&&j==2||i==7&&j==3||i==7&&j==5||i==7&&j==7||i==7&&j==8||i==7&&j==9||i==7&&j==11||i==7&&j==12||
                        i==7&&j==13||i==7&&j==14||i==7&&j==15||i==7&&j==17||i==7&&j==18||i==7&&j==19||i==7&&j==20||i==7&&j==21||i==7&&j==23||
                        i==7&&j==24||i==7&&j==25||
                        i==8&&j==1||i==8&&j==3||i==8&&j==7||i==8&&j==9||i==8&&j==11||i==8&&j==17||i==8&&j==21||i==8&&j==23||
                        i==9&&j==1||i==9&&j==3||i==9&&j==4||i==9&&j==5||i==9&&j==6||i==9&&j==7||i==9&&j==9||i==9&&j==11||i==9&&j==12||
                        i==9&&j==13||i==9&&j==15||i==9&&j==16||i==9&&j==17||i==9&&j==18||i==9&&j==19||i==9&&j==21||i==9&&j==22||i==9&&j==23||
                        i==9&&j==24||i==9&&j==25||
                        i==10&&j==1||i==10&&j==9||i==10&&j==11||i==10&&j==13||i==10&&j==15||i==10&&j==25||
                        i==11&&j==1||i==11&&j==2||i==11&&j==3||i==11&&j==5||i==11&&j==6||i==11&&j==7||i==11&&j==9||i==11&&j==11||i==11&&j==13||i==11&&j==14||i==11&&j==15||i==11&&j==17||i==11&&j==18||i==11&&j==19||i==11&j==20||i==11&&j==21||i==11&&j==22||i==11&&j==23||
                        i==11&&j==25||
                        i==12&&j==3||i==12&&j==7||i==12&&j==9||i==12&&j==11||i==12&&j==17||i==12&&j==23||
                        i==13&&j==1||i==13&&j==3||i==13&&j==4||i==13&&j==5||i==13&&j==6||i==13&&j==7||i==13&&j==9||i==13&&j==11||i==13&&j==12||
                        i==13&&j==13||i==13&&j==14||i==13&&j==15||i==13&&j==17||i==13&&j==19||i==13&&j==21||i==13&&j==22||i==13&&j==23||
                        i==13&&j==25||
                        i==14&&j==1||i==14&&j==7||i==14&&j==9||i==14&&j==17||i==14&&j==19||i==14&&j==21||i==14&&j==25||
                        i==15&&j==1||i==15&&j==2||i==15&&j==3||i==15&&j==4||i==15&&j==5||i==15&&j==6||i==15&&j==7||i==15&&j==9||i==15&&j==10||i==15&&j==11||i==15&&j==12||
                        i==15&&j==13||i==15&&j==14||i==15&&j==15||i==15&&j==16||i==15&&j==17||i==15&&j==18||i==15&&j==19||i==15&&j==21||i==15&&j==22||i==15&&j==23||
                        i==15&&j==24||i==15&&j==25)
                        maze4[i][j]="  ";
                        else
                        maze4[i][j]="# ";
                        System.out.print(maze4[i][j]);
                    }
                    System.out.println();
                    System.out.print("      ");
                }   
                System.out.println("\nCongratulations!!!\n\nYou have escaped from all the mazes\n");
                System.out.print("Press 'B' to go back");
                char a=(char)br.read();
                if(a=='B' || a=='b')
                {
                    System.out.print("\f");
                    Mazes obj6=new Mazes();
                    obj6.playMaze();
                }
                else
                System.out.println("Error...Please Restart the program");              
                break;
            }//if ends
            System.out.print("\f");
        }//while ends
    }//playMaze4 ends
}//class ends

