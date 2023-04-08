import java.util.Scanner;

public class MergeSort{
    
    static void mergeSort(int[] arr, int l, int r){
        if(r > l){
            int m = l + (r - l)/2;
            // System.out.println(m);
            
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            
            merge(arr, l, m, r);
        }
    }
    
    static void merge(int[] arr, int l, int m, int r){
        int[] temp = new int[r - l + 1];
        int i = l;
        int j = m + 1;
        int k = 0;
        
        while(i <= m && j <= r){
            if(arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        
        while(i <= m) temp[k++] = arr[i++];
        while(j <= r) temp[k++] = arr[j++];
        
        k = 0;
        
        for(int a = l; a <= r; a++){
            arr[a] = temp[k++];
        }
        
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, arr.length - 1);
        
        for(int i : arr) System.out.print(i + " ");
        
        sc.close();
    }
}
