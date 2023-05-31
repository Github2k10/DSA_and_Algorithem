// There is a coding Tournament where 4 clubs are going to compete. Since
// the team selection is very critical in this competition,Rohit asked 
// Harshit to help him in the team selection process.
  
// There is a long queue of students from four clubs. Each student of a cl
// ub have a different roll number. Whenever a new student will come, he
// will search for his clubmate from the end of the queue. As soon as he
// will find any of the club-mate in the queue, he will stand behind him, 
// otherwise he will stand at the end of the queue. At any moment Harshit
// will ask the student, who is standing in front of the queue, to come and
// give his name and Harshit will remove him from the queue. There are
// Q operations of one of the following types:
// E a b: A new student of club a whose roll number is b will stand in queue
// according to the method mentioned above.
// D: Harshit will ask the student, who is standing in front of the queue, to
// come and put his name and Harshit will remove him from the queue


import java.util.*;

public class Main{
    static void print(Map<Integer, List<Integer>> map){
        Iterator<Integer> i = map.keySet().iterator();
        int n = i.next();
        
        List<Integer> list = map.get(n);
        
        System.out.println(n + " " + list.get(0));
        list.remove(0);
        
        if(list.isEmpty()){
            map.remove(n);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            String ch = sc.next();
            
            if(ch.equals("E")) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                if(map.containsKey(a)){
                    map.get(a).add(b);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(b);
                    map.put(a, list);
                }
                
            } else {
                if(!map.isEmpty()){
                    print(map);
                }
            }
        }
    }
}


// Sample Input :
// 5
// E l l
// E 2 1
// E 1 2
// D
// D

// Sample Output :
// 1 1
// 1 2
