public class Employee{
String empName;
int empAge;
long empSalary;
public Employee(String emp,int age ,long salary)
        {

              empName=emp;
               empAge=age;
               empSalary=salary;
              System.out.println("emp   "+emp+"\n"+age+"\n"+salary);
        }
public Employee(String emp1,long salary,int age1)
         {
                empName=emp1;
                empSalary=salary;
                empAge=age1;
               System.out.println("emp  "+emp1+"\n"+salary+"\n"+age1);
                   }
public static void main(String[] args){

Employee s1=new Employee("Ramya",21,10000L);
Employee s2=new Employee("Mathavi",2999L,22);
}
}                                                        
