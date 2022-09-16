public class cal {
    public int sum(int a[][],int n, int k){
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                result+=a[i][j];
            }
        }
        return result;

    }
    public float average(int a[][], int n, int k){
        float result = 0;
        result = ((float)sum(a, n, k))/(n*k);
        return result;
    }
}
