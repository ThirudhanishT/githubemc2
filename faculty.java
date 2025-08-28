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
        return ("DEPARTMENT NAME :"+departmentName+"\nFACULTY NAME  :"facultyName+"\nYEARS EXPPERIENCE:"+years_exp);
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
     return ("DEPARTMENT NAME :"+departmentName+"\nFACULTY NAME  :"facultyName+"\nYEARS EXPPERIENCE:"+years_exp+"\nDESIGNATION: "+d+"SALARY: "+salary);
    }
}
class NonTeachingFaculty extends DepartmentFaculty
{
    String designation;
    double wagesperday;
    int no_days;
    double c;
    NonTeachingFaculty(String a,String b,double c,int d,String e)
    {
        super(a,b);
        designation=e;
        wagesperday=c;
        no_days=d;
    }
    double calculateSalary()
    {
        c=no_days*wagesperday;
    }
    public String toString()
    {
         return ("DEPARTMENT NAME :"+departmentName+"\nFACULTY NAME  :"facultyName+"\nDESIGNATION :"+e+"\nWAGESPERDAY: "+c+"\nNO OF DAYS: "+d+"SALARY: "+c);
    }
}