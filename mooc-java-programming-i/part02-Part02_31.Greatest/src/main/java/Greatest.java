
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int greate;
        
        if (number1 > number2 && number1 > number3) {
            greate = number1;
        } else if (number2 > number3) {
            greate = number2;
        } else {
            greate = number3;
        }
        
        
        return greate;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
