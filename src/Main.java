public class Main {
    public static void main(String[] args) {
        int t = 0;
        int v = 0;
        int p = 0;
        int r = p - v;
        int o = 0;

        boolean stop = false;

        while (!stop){

            p = v;
            v = t * (t-20) * (t-100) + 120000;

             if (p - v > r) {
                 r = p - v;
                 o = t;
             }

            if (t == 100)
                stop = true;
            else
                t++;


        }
        System.out.println(o);
    }
}