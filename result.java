import java.lang.System;
import java.util.*;
class student
{
        String campus;
        String location;
        int roll;
	student(String campus,String location)
	{
		this.campus=campus;
                this.location=location;       
        }
        void display()
        {
                System.out.println("Campus: "+campus);
                System.out.println("Location: "+location);
        }
}
class fulltime extends student
{
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []fulltotal=new int[4];
        int []fullinter=new int[4];
        int []fullexter=new int[4];
        int []roll=new int[n];
        String []grade=new String[3];
        void cal()
        { 
        for(int i=0;i<n;i++)
        {
           System.out.println("Enter details of student "+(i+1) );
           for(int j=0;j<3;j++)
           {
	       System.out.println("Enter your internal mark of "+(j+1)+" course: ");
               int k=scan.nextInt();
               int im=(k*40)/100;
               fullinter[j]=im;
           }
           for(int j=0;j<3;j++)
           {
               System.out.println("Enter your external mark of "+(j+1)+" course: ");
               int l=scan.nextInt();
               int em=(l*60)/100;
               fullexter[j]=em;
           }
           for(int p=0;p<3;p++)
           {
               fulltotal[p]=fullinter[p]+fullexter[p];
               if(fulltotal[p]>90 && fulltotal[p]<=100)
			grade[p]="S";
               else if(fulltotal[p]>80 && fulltotal[p]<=90)
                        grade[p]="A+";
               else if(fulltotal[p]>70 && fulltotal[p]<=80)
                        grade[p]="A";
               else if(fulltotal[p]>60 && fulltotal[p]<=70)
                        grade[p]="B+";
               else if(fulltotal[p]>=50 && fulltotal[p]<=60)
                        grade[p]="B";
               else if(fulltotal[p]<50)
                        grade[p]="U";                   
           }
         }
        }           
         fulltime()
         {
              super("MIT college","Chrompet");
              for(int i=0;i<n;i++)
              {
              System.out.println("Enter the roll no for "+(i+1)+" student");
              int m=scan.nextInt();
              roll[i]=m;
              }
         }
         void display()
         {
              for(int i=0;i<n;i++)
              {
                 System.out.println("The detailes of the FullTime student "+(i+1));
                 System.out.println("Campus: "+campus);
                 System.out.println("Location: "+location);
                 System.out.println("ROLL NO: "+roll[i]);
                 int j=0;
                 while(j<3)
                 {
                     System.out.println("Course "+(j+1)+" Internal: "+fullinter[j]+"  "+"External: "+fullexter[j]+"  "+"Total: "+fulltotal[j]+"  "+"Grade: "+grade[j]);
                     j++;
                 }
              }
         }
}
class partime extends student
{
        Scanner scan=new Scanner(System.in);
        int []partotal=new int[3];
        int []rolls=new int[3];
        String []grade=new String[3];
        int []partinter=new int[3];
        int []partexter=new int[3];
        int n=scan.nextInt();
        void cal()
        { 
        for(int i=0;i<n;i++)
        {
           System.out.println("Enter details of student "+(i+1) );
           for(int j=0;j<3;j++)
           {
	       System.out.println("Enter your internal mark of "+(j+1)+" course: ");
               int k=scan.nextInt();
               int im=(k*50)/100;
               partinter[j]=im;
           }
           for(int j=0;j<3;j++)
           {
               System.out.println("Enter your external mark of "+(j+1)+" course: ");
               int l=scan.nextInt();
               int em=(l*50)/100;
               partexter[j]=em;
           }
           for(int p=0;p<3;p++)
           {
               partotal[p]=partinter[p]+partexter[p];
               if(partotal[p]>90 && partotal[p]<=100)
			grade[p]="S";
               else if(partotal[p]>80 && partotal[p]<=90)
                        grade[p]="A+";
               else if(partotal[p]>70 && partotal[p]<=80)
                        grade[p]="A";
               else if(partotal[p]>60 && partotal[p]<=70)
                        grade[p]="B+";
               else if(partotal[p]>=50 && partotal[p]<=60)
                        grade[p]="B";
               else if(partotal[p]<50)
                        grade[p]="U";                   
           }
         }
        }           
         partime()
         {
              super("MIT college","Chrompet");
              for(int i=0;i<n;i++)
              {
              System.out.println("Enter the roll no for "+(i+1)+" student");
              int m=scan.nextInt();
              rolls[i]=m;
              }
         }
         void display()
         {
              for(int i=0;i<n;i++)
              {
                 System.out.println("The detailes of the FullTime student "+(i+1));
                 System.out.println("Campus: "+campus);
                 System.out.println("Location: "+location);
                 System.out.println("ROLL NO: "+rolls[i]);
                 int j=0;
                 while(j<3)
                 {
                     System.out.println("Course "+(j+1)+" Internal: "+partinter[j]+"  "+"External: "+partexter[j]+"  "+"Total: "+partotal[j]+"  "+"Grade: "+grade[j]);
                     j++;
                 }
              }
         }
}
class result
{
	public static void main(String args[])
        {
             System.out.println("Enter how many Full time students you need: ");
             fulltime s=new fulltime();
             s.cal();
             System.out.println("Enter how many Part time students you need: ");
             partime p=new partime();
             p.cal();
             s.display();
             p.display();
        }
} 
