// public static void main in Java

public class Main {
  
  public static void main(String[] args) {
    int n = 1;
    int sum = 0;

    while(n <= 10) {
      sum = sum + n;

      if(args.length != 0 &&  /* TO COMPLETE */) {
        System.out.println("n = " + n);
        System.out.println("sum = " + sum);
      }
      n = n + 1;
    }
    
    System.out.println("Sum = " + sum);
  }
}
