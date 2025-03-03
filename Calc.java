public class Calc{
   private double num1;
   private double num2;
   
   public Calc(){
      num1 = 0;
      num2 = 0;
   }
   
   public void setNum1(double num){
      num1 = num;
   }
   
   public void setNum2(double num){
      num2 = num;
   }
   
   public double getNum1(){
      return num1;
   }
   
   public double getNum2(){
      return num2;
   }
   
   public double add(){
      double result = num1+num2;
      return result;
   }
   public double subtract(){
      double result = num1-num2;
      return result;
   }
   public double multiply(){
      double result = num1*num2;
      return result;
   }
   public double divide(){
      double result = num1/num2;
      return result;
   }
   
   
   public String toString(){
      return "num1: "+num1+"\nnum2: "+num2;
   }
   
   public static double checkNumber(){
      Scanner scan = new Scanner(System.in);
      double num = 0;
      if(scan.hasNextDouble()){num = scan.nextDouble();} //hasNextDouble is a boolean statement that checks if the next number is a double or not(does not have to include '.'
      
      else{
         System.out.println("Invalid input. Please select a number.");
         num = checkNumber();//Simple recursion, I believe it's called! Learned somewhat about this in highschool.
      }
      
      return num;
   }
   
}
