package HashMap_TreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class ex05 {
    public static int solution(int n, int k, int[] arr){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt=0;
        for(int x : Tset){
            cnt++;
            if(cnt==k) answer=x;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(solution(n,k,arr));
    }
}


// Tset.add()
// Tset.remove(143)
// Tset.size > 키 값의 갯수
// Tset.first() > 젤 앞의 자료 
// Tset.last() > 가장 뒤의 자료