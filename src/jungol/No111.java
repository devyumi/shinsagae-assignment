package jungol.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        System.out.println("sum " + sum);
        System.out.print("avg " + sum / 4);
        br.close();
    }
}
