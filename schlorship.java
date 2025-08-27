import java.lang.System;
import java.util.*;
class Student
{
    int TotalNumberOfStudent;
    int TotalNumberOfScholarshipsAwarded;
    int ScholarshipPerStudent;
    double TotalScholarshipAmount;
    double DonationReceived;
    double Unutilized;
    Student(int a,int b,int c,double d,double e)
    {
        TotalNumberOfStudent=a;
        TotalNumberOfScholarshipsAwarded=b;
        ScholarshipPerStudent=c;
        TotalScholarshipAmount=d;
        DonationReceived=e;
    }
    void registerScholarship(int n)
    {
        if(n>10)
        {
            ScholarshipPerStudent=ScholarshipPerStudent-((ScholarshipPerStudent*5)/100);
            TotalScholarshipAmount=ScholarshipPerStudent*TotalNumberOfStudent;
        }
    }
    void displayUnutilizedDonations()
    {
        Unutilized=DonationReceived-TotalScholarshipAmount;
    }
    public String toString()
    {
        return ("TOTAL STUDENT :"+TotalNumberOfStudent+"\nTOTAL SCHOLARSHIP AWARDED: "+TotalNumberOfScholarshipsAwarded+"\nScholarship Per Student: "+ScholarshipPerStudent+"\nTOTAL SCHOLARSGIP AMOUNT: "+TotalScholarshipAmount+"\nDonation Received: "+DonationReceived+"\nUnutilized: "+Unutilized);
    }
}
class schlorship
{
    public static void main(String args[])
    {
        Student s1=new Student(100,50,2000,100000.00,120000.00);
        System.out.println(s1);
    }
}
