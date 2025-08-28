import java.lang.System;
import java.util.*;
abstract class DepartmentFaculty
{
    String departmentName;
    String facultyName;
    double years_exp;
    DepartmentFaculty(String a,String b,double c)
    {
        departmentName=a;
        facultyName=b;
        years_exp=c;
    }
    DepartmentFaculty(String a,String b)
    {
        departmentName=a;
        facultyName=b;
    }
    public String toString()
    {
        return ("DEPARTMENT NAME :"+departmentName+"\nFACULTY NAME  :"+facultyName+"\nYEARS EXPPERIENCE:"+years_exp);
    }
}
class TeachingFaculty extends DepartmentFaculty
{
    String designation;
    double salary;
    TeachingFaculty(String a,String b,double c,String d,double e)
    {
        super(a,b,c);
        designation=d;
        salary=e;
    }
    public String toString()
    {
     return (super.toString()+"\nDESIGNATION: "+designation+"\nSALARY: "+salary);
    }
}
class NonTeachingFaculty extends DepartmentFaculty
{
    String designation;
    double wagesperday;
    int no_days;
    double ca;
    NonTeachingFaculty(String a,String b,double c,int d,String e)
    {
        super(a,b);
        designation=e;
        wagesperday=c;
        no_days=d;
    }
    double calculateSalary()
    {
        ca=no_days*wagesperday;
        return ca;
    }
    public String toString()
    {
         return(super.toString()+"\nDESIGNATION :"+designation+"\nWAGESPERDAY: "+wagesperday+"\nNO OF DAYS: "+no_days+"\nSALARY: "+calculateSalary());
    }
}
class faculty
{
    public static void main(String args[])
    {
        DepartmentFaculty tf=new TeachingFaculty("CSE","THIRU",3.5,"CHENNAI",2000000);
        System.out.println(tf);
        DepartmentFaculty ntf=new NonTeachingFaculty("cse","THIRU",29.00,2,"MADURAI");
        System.out.println(ntf);
    }
}