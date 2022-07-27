//Java Program to demonstrate why we need method overriding  
//Here, we are calling the method of parent class with child  
//class object.  
//Creating a parent class  
class Program{  
  void run(){System.out.println("Program is running");}  
}  
//Creating a child class  
class MethodOverriding extends Program{  
  public static void main(String args[]){  
  //creating an instance of child class  
  MethodOverriding obj = new MethodOverriding();  
  //calling the method with child class instance  
  obj.run();  
  }  
}
