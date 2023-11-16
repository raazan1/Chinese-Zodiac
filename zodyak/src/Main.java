import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Doğum Yılınızı Giriniz: ");
        int Year = input.nextInt();

        int Calc = Year % 12;

        switch (Calc){
            case 0:
                System.out.printf("Maymun");
                break;
            case 1:
                System.out.printf("Horoz");
                break;
            case 2:
                System.out.printf("Köpek");
                break;
            case 3:
                System.out.printf("Domuz");
                break;
            case 4:
                System.out.printf("Fare");
                break;
            case 5:
                System.out.printf("Öküz");
                break;
            case 6:
                System.out.printf("Kaplan");
                break;
            case 7:
                System.out.printf("Tavşan");
                break;
            case 8:
                System.out.printf("Ejderha");
                break;
            case 9:
                System.out.printf("Yılan");
                break;
            case 10:
                System.out.printf("At");
                break;
            case 11:
                System.out.printf("Koyun");
                break;

        }


    }
}