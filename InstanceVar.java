package Learn_Java;

public class InstanceVar
{
      String name = "hello";
      double salary = 9000;
    /*public void Employee (String empName){
        name = empName;}*/
    public void printEmp(){
        String fname = "guna";
        name = fname+name;
        System.out.println(name);
        int a =200;
        salary = a + salary;
        System.out.println(salary);
    }
    public void printEmp2(){
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        InstanceVar instanceVar1 = new InstanceVar();
        InstanceVar instanceVar2 = new InstanceVar();

        instanceVar1.printEmp();
        instanceVar2.printEmp2();
        System.out.println(instanceVar1.name);
        System.out.println(instanceVar2.salary);
    }


}