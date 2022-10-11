public class Number{
String num1;
int num2;

public Number() //constructor with no parameter
      {  
           String num1="java";
          System.out.println("java");
     }

Number(String n1,int n2)   //constructor with two parameter
      {  
            num1=n1;
            num2=n2;
           System.out.println("num "+n1+"\n"+n2);
      }
      
 private void getvalue(int a,int b)  //method  signature-not constructor
        {
          System.out.println("a is "+a+"\n"+"b is "+b);
       }     

public static void main(String[] args){

Number a=new Number();
Number b=new Number("Ramya",25);
a.getvalue(19,21);
//b.getvalue(20);
          }
} 




