// Given an array of non-negative numbers and a non-negative number k, find the number of subarrays having sum less than k.
// Time complexity: O(n)
// Auxiliary Space: O(1)


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.PrintWriter;
 
public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
 
    public static void main(String[] args){
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int test = sc.nextInt();
        
        for(int a = 0; a < test; a++){
            int n = sc.nextInt();
            long k = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            int i = 0;
            int j = 0;
            long c = 0;
            int sum = arr[0];
            
            while(i < n && j < n){
                if(sum < k){
                    j++;
                    
                    if(j >= i){
                        c += j - i;
                    }
                    
                    if(j < n) sum += arr[j]; 
                } else {
                    sum -= arr[i];
                    i++;
                }
            }
            
            
            out.println(c);
        }
        
        out.close();
    }

}
