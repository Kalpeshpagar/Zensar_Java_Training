public class LambdaArithmetic {
  
        public static void main(String[] args) {
           A a1= (a,b)->(a%b);
           System.out.println(a1.module(10, 3));
        }
    }


interface A {
    public abstract int module(int a, int b);
}
