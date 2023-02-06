public class Arithmetic {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 10;

        System.out.println(num1 + num2); //30
        System.out.println(num1 - num2); //10
        System.out.println(num1 * num2); //200
        System.out.println(num1 / num2); //2
        System.out.println(num1 % num2); //0

        //Increment
        int a = 10;
            a++; // means increase value of a by 1
        System.out.println(a); //11

        //Pre-Increment
        int c = 7;
        int d = ++c; //First increment then print
        System.out.println(d);//8
        System.out.println(c);//8

        //Post-Increment
        int e = 18;
        int f = e++; //First e value(18) assign to f then increment e value by 1
        System.out.println(f); //18
        System.out.println(e); //19


        //Decrement
        int b = 6;
            b--; // means decrease value of b by 1
        System.out.println(b); //5

        //Pre-Decrement
        int g = 7;
        int h = --g; //First increment then print
        System.out.println(h);//6
        System.out.println(g);//6

        //Post-Decrement
        int i = 18;
        int j = i--; //First e value(18) assign to f then increment e value by 1
        System.out.println(j); //18
        System.out.println(i); //17


    }
}
