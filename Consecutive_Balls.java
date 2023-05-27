// Sachin has N balls. Each ball has an integer not less than 2 written on it. H
// e will insert them in a cylinder one by one. The integer written on the i-th ball is ai.

// The balls are made of special material. When k balls with k (k>2) written on
// them line up in a row, all these k balls will disappear.
// For each i (1<= i <= n), find the number of balls after inserting the i-th ball.

import java.util.*;

class data{
    int val;
    int feq;
    
    public data(){}
    public data(int val, int feq){
        this.val = val;
        this.feq = feq;
    }
}

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        
        for(int a = 0; a < test; a++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            Stack<data> stack = new Stack<>();
            
            int c = 0;
            
            for(int i = 0; i < n; i++){
                int k = arr[i];
                
                if(stack.isEmpty()){
                    stack.push(new data(k, 1));
                    c++;
                } else if(stack.peek().val == k){
                    stack.peek().feq += 1;
                    c++;
                } else {
                    stack.push(new data(k, 1));
                    c++;
                }
                
                if(stack.peek().feq == k){
                    stack.pop();
                    c -= k;
                }
                
                System.out.print(c + " ");
            }
            
            System.out.println();
        }
    }
}


// Input Data:
// 2
// 5
// 3 2 3 2 2
// 8
// 3 4 4 4 4 4 4 4


// Output:
// 1 2 3 4 3 
// 1 2 3 4 1 2 3 4 
