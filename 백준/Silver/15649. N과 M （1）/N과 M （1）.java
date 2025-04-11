
import java.io.*;

import java.util.*;


public class Main {

    public static void recursive(int n, int m, int cnt, int[] list, boolean[] visited){

        //m개를 선택했을 경우 프린트
        if (cnt == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i<=n; i++){
            if(!visited[i]){
                visited[i] = true;
                list[cnt] = i; // 현재 위치에 숫자 저장
                recursive(n, m, cnt + 1, list, visited);
                visited[i] = false; // 백트래킹 (복원)
            }
            
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] list = new int[m];
        boolean[] visited = new boolean[n + 1];

        recursive(n, m, 0, list, visited);



    }


}