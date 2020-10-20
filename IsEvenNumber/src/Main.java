public class Main {
    public static void main(String[] args) {
        /*for(int i = 0; i < 50; i++) {
            System.out.println("Is " + i + " is a even number? " + isEvenNumber(i));
        }*/
        int number = 4;
        int finishNumber = 20;
        int sum = 0;
        int count = 0;
        while(number <= finishNumber) {
            number++;
            if(isEvenNumber(number)) {
                System.out.println("Even number " + number);
                sum += number;
                count++;
                if(count == 5) {
                    break;
                }
            }

        }
        System.out.println("Sum : " + sum);
    }
    public static boolean isEvenNumber(int number) {
        if(number % 2 ==0) {
            return true;
        }
        return false;
    }
}
