public class Main {
    //1
    public static void main(String[] args) {
        //2
        byte b1=10;
        int int1=10;
        long l1=412412314142124133L;

        char c1='A';

        float f1=5.2f;
        short s1=92;
        double d1=2.55;
        int year = 2021;

        String stringV = "Инсульт";
        System.out.println(methodA(b1,year,f1,s1));
        System.out.println(methodB(year,f1));
        methodC(year);
        System.out.println(methodD(year));
        methodE(stringV);
        methodF(year);

    }
    //3
    public static float methodA(byte a, int b, float c, short d){
        float res = a * (b + (c / d));
        return res;
    }
    //4
    public static boolean methodB(int a, float b){
        if(a + b <10 || a + b >20 ){
            return false;
        }
        return true;
    }
    //5
    public static void methodC(int a){
        if(a<0){
            System.out.println("Минус почка");
        }
        else {
            System.out.println("Надеюсь, сотка");
        }
    }

    //6
    public static boolean methodD(int a){
        if(a<0){
            return true;
        } else {
            return false;
        }
    }
    //7
    public static void methodE(String s){
        System.out.println("Привет, "+ s);
    }

    //8

    public static void methodF(int year){
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println("К сожалению, да");
        }
        else {
            System.out.println("Увы, нет");
        }
    }
}