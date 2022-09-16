import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        data array1 =new data();
        System.out.println("Enter value:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[][] mang = new int[n][k];
        for(int i=0;i<n;i++ ){
            for(int j=0;j<k;j++){
                System.out.print("m["+i+"]["+j+"]=");
                mang[i][j]=sc.nextInt();
            }
        }
        array1.setA(mang);
        for(int i=0;i<n;i++ ){
            for(int j=0;j<k;j++){
                System.out.print(mang[i][j]+" ");
                
            }
            System.out.println("");
        }
        cal cal = new cal();
        System.out.println("average: "+cal.average(array1.getA(),n,k));
        System.out.println("sum:"+cal.sum(array1.getA(),n,k));
    }
}
