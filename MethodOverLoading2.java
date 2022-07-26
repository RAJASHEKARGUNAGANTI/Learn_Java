package Learn_Java;

public class MethodOverLoading2 {
    public void vehicle()
    {
        System.out.println("This is a vehicle with zero doors and wheels");
    }
    public void vehicle(int doors)
    {
        System.out.println("Doors of a car = "+doors);
    }
    public void vehicle(int doors,int wheels)
    { System.out.println("This is a bus ");

    }

    public static void main(String[] args) {
        MethodOverLoading2 ob = new MethodOverLoading2();
        ob.vehicle();
        ob.vehicle(2);
        ob.vehicle(2,4);
    }

}
