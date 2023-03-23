public class Main {
    public static void main(String[] args) {
        myinteger m1 = new myinteger(2);
        myinteger m2 = new myinteger(9);

        System.out.println(m1.isEven());
        System.out.println(myinteger.isOdd(5));
        System.out.println(myinteger.isPrime(m1));
        System.out.println(m1.equals(3));
        System.out.println(m1.equals(m2));
    }
}