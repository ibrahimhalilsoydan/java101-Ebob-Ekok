import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n1 Sayısını giriniz :");
        int n1 = input.nextInt();

        System.out.print("n2 Sayısını giriniz :");
        int n2 = input.nextInt();

        int ebob=1, ekok=1;
        int i =1;

        while (i <= n1){

            if (n1% i==0 && n2%i== 0){

                ebob =i;

            }
            i++;
        }System.out.println("EBOB :"+ebob);


        while (i<= n1 * n2){

            if (i%n1==0 && i%n2==0){
                ekok=i;
                break;
            }
            i++;
        } System.out.print("EKOK :" + ekok);
    }

}
