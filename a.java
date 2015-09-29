import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class a {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        String a,b;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String [] cads = br.readLine().split(" ");
            a=cads[0];
            b=cads[1];
            int cont = 0;
            for (int j = 0; j < a.length(); j++) {
                if(a.charAt(j)!=b.charAt(j)){
                    cont++;
                }
            }
            System.out.println(cont);
        }
    }
}
