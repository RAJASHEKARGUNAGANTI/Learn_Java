/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Variables {
    int a;
    float b;


    /*public static void main(int a ,int b) {
        Variables var;
        public void med1(int var.a){
            int c=3 ;
            a = a*c;
        }
        public void med2(int b){
            int d=9;
            b = b/d;
        }
    }*/
    public static void med1(int a) {
        int c = 3;
        a = a * c;
        System.out.println(a + " " + c);

    }

    public static void med2(int b, int a) {
        med1(a);
        int d = 9;
        b = b / d;
        System.out.println(a + " " + b + "  " + d);
    }

    public static void main(String[] args) {
        Variables variables = new Variables();
        variables.med1(3);
        //variables.med2(4, 7);

    }

}
