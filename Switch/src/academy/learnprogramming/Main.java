package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int value = 3;

        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue =3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            default:
                System.out.println("Was not 1 or 2");
        }

    }
}
