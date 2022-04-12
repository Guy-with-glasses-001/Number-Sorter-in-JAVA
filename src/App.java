import java.util.Scanner;

public class App{
    public static void main(String args[]){
        System.out.println(":::    Number Sorter    :::\n");

        System.out.println("How many numbers are there in your list?");
        Scanner scan = new Scanner(System.in);
        byte totalNum = scan.nextByte();

        System.out.println("Now enter the numbers one by one.");
        int num[] = new int[totalNum];
        byte i;
        for(i=0; i<totalNum; i++){
            System.out.print("No " + (i+1) + ": ");
            num[i] = scan.nextInt();
        }

        int temp, j;
        for(i=0; i<totalNum; i++){
            for(j=i+1; j<totalNum; j++){
                temp = 0;
                if(num[i] > num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println("\n\nAfter sorting...\n");
        for(i=0; i<totalNum; i++){
            System.out.println(i+1 + ": " + num[i]);
        }
    }
}