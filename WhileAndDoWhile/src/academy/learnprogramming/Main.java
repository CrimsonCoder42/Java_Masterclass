package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        int count = 1;
//        while(count != 6) {
//            System.out.println("count value is " + count);
//            count++;
//
//        }
//
//        count = 0;
//        while(true) {
//            if(count == 5) {
//                break;
//            }
//
//            System.out.println("Count value = " + count);
//            count++;
//        }

//        int count = 1;
//        do{
//            System.out.println("Count value was " + count);
//            count++;
//        } while(count !=6);

        int number =4;
        int finsihNumber = 20;
        int total = 0;

        while(number <= finsihNumber) {

            number++;

            if (isEvenNumber(number)) {
                total++;
                System.out.println("Even number " + number);

            if (total == 5){
                System.out.println("Even  numbers found = "+ total);
                break;
            }
            }



        }

    }

    public static boolean isEvenNumber(int num) {

        if (num < 1) {
            return false;
        }

        if(num % 2 == 0) {
            return true;
        }
        return false;
    }


}
