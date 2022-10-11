public class Luxe{
String moviename;  //instance variable-Global variable
int time;                     
boolean hit;
 
public Luxe(String MN,int T,boolean H) //constructor
            {
                            moviename="MN";  //initialize variable-local variable
                            time=T;
                            hit=H;
                            System.out.println("moviename  "+ MN+"\n"+T+"\n"+H);
                            }

public static void main(String[] args){

Luxe obj=new Luxe("ps",10,true);     //constructor calling statement
//obj.moviename="ps";            //constructor should not be used in this way
//obj.time=10;         
//obj.hit=true;

          }
}
