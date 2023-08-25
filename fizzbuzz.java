
public class fizzbuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++){
            if (i % 3 == 0 && i % 5 ==0){
                System.out.print("FizzBuzz\n");
            }
            else if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0 && i % 5 != 0){
                    System.out.print("Fizz\n");
                }
                else {
                    System.out.print("Buzz\n");
                }
            }
            else {
                System.out.print(i + "\n");
            }
        }
    }
}
