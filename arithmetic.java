public class arithmetic {
    public static void main(String[] args) {

        int age = 19; // = operator assign right side value (19) in age variable
        System.out.println(age);

        int mark1, mark2, mark3, mark4;
            mark1 = mark2 = mark3 = mark4= 10;
        System.out.println(mark1+ " " +mark2+ " " +mark3+ " " +mark4);

        int a = 10;
            a += 5;// ==> a = a+5; = 10+5;
        System.out.println(a); //15

        int b = 4;
            b -= 2; // means b = b-2 = 4-2 ;
        System.out.println(b); //2

        int c = 6;
            c *= 2; //c = c*2 = 6*2
        System.out.println(c); //12

        int d = 15;
            d /= 3; //means d = d/3 = 15/3 = 5
        System.out.println(d); //5

        int e = 3;
            e %= 2; //means e = e % 2 = 3 % 2 = 1(remainder)
        System.out.println(e); //1


    }
}