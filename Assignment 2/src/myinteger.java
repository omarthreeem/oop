public class myinteger
{    int value;
    public myinteger (int n){
        value=n;
    }
    public boolean isEven (){
        if (value % 2 == 0)
            return true;
        return false;
    }
    public boolean isOdd (){
        if (value % 2 != 0)
            return true;
        return false;
    }
    public boolean isPrime (){
        for (int i = 2; i < value ; i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven (int x){
        if (x % 2 == 0)
            return true;
        return false;
    }
    public static boolean isOdd (int x){
        if (x % 2 != 0)
            return true;
        return false;
    }
    public static boolean isPrime (int x){
        for (int i = 2; i < x ; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven (myinteger myInteger){
        if (myInteger.value % 2 == 0)
            return true;
        return false;
    }
    public static boolean isOdd (myinteger myInteger){
        if (myInteger.value % 2 != 0)
            return true;
        return false;
    }
    public static boolean isPrime (myinteger myInteger){
        for (int i = 2; i < myInteger.value ; i++) {
            if (myInteger.value % i == 0)
                return false;
        }
        return true;
    }

    public boolean equals (int x){
        if (value == x)
            return true;
        return false;
    }
    public boolean equals (myinteger myInteger){
        if (value == myInteger.value)
            return true;
        return false;
    }
}