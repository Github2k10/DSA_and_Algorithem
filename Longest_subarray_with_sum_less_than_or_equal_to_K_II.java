// Longest subarray with sum less than or equal to K- II
// Time complexity = O(n^2)





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class Main{
    static class  FastReader{
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
            
            return st.nextToken();
        }
        
        int nextInt(){
            return Integer.parseInt(next());
        }
    }
    
    public static void main(String args[]){
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        
        int test = sc.nextInt();
        
        for(int a = 0; a < test; a++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int max = -1;
            
            int[] arr = new int[n];
            
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            for(int i = 0; i < n; i++){
                long sum = 0;
                for(int j = i; j < n; j++){
                    sum += arr[j];
                    
                    if(sum > k) break;
                    
                    if(sum <= k) max = Math.max(max, j - i + 1);
                }
            }
            
            out.println(max);
        }
        
        out.close();
    }
}
