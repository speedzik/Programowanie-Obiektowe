public class Main {
    public static void main(String[] args){
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibonacci_r(10));
        System.out.println(f.fibonacci_i(10));
        for (int i = 0; i < 1000; i++){
            if(f.fibonacci_i(i) != f.fibonacci_r(i)){
                System.out.println("RÓŻNE");
            }
        }
    }
}
