public class Fib{
    public static void main(String[] args){
        int n1 = 1, n2 = 0, n3 = 0;
        for (int i = 1; i < 15; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            if(i>1){
                n2 = n1;
                n1 = n3;
            }
        }
    }
}