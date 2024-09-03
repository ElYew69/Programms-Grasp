import java.util.Scanner;
public class Objects{
   public static String Month(int monthNum){ 
      String month=""; 
      
      if(monthNum==1){
         month= "January";
      }
      if(monthNum==2){
         month= "February";
      }
      if(monthNum==3){
         month= "March";
      }
      if(monthNum==4){
         month= "April";
      }
      if(monthNum==5){
         month= "May";
      }
      if(monthNum==6){
         month= "June";
      }
      if(monthNum==7){
         month= "July";
      }
      if(monthNum==8){
         month= "August";
      }
      if(monthNum==9){
         month= "September";
      }
      if(monthNum==10){
         month= "October";
      }
      if(monthNum==11){
         month= "November";
      }
      if(monthNum==12){
         month= "December";
      }   
      return month; 
   }
   public static void Verifier(int monthNum){
   Scanner sc = new Scanner(System.in); 
   
      while(sc.hasNextInt()){        
           sc.next();
           if(!(monthNum>0 && monthNum<13)){
               System.out.print("Please enter a number that is between 1-12: ");
               sc.next();
           }
      } 
   }
}