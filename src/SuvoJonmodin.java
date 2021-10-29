import java.util.concurrent.TimeUnit;

public class SuvoJonmodin {

    public static void main(String[] args) throws InterruptedException {


        String su = "\u09B6\u09C1";
        char vo = '\u09AD';
        char jj ='\u099C';
        String nm = "\u09A8\u09CD\u09AE";
        String di = "\u09A6\u09BF";
        char  nn = '\u09A8';
        String mo = "\u09AE\u09CB";
        char ho = '\u09B9';
        char rr = '\u09B0';
        char space = ' ';
        int delay = 100;

        System.out.print(su);
        TimeUnit.MILLISECONDS.sleep(delay);
        System.out.print(vo);
        TimeUnit.MILLISECONDS.sleep(delay);
        System.out.print(space);
        TimeUnit.MILLISECONDS.sleep(delay);
        System.out.print(jj);
        TimeUnit.MILLISECONDS.sleep(delay);
        System.out.print(nm);
        TimeUnit.MILLISECONDS.sleep(delay);
        System.out.print(di);
        TimeUnit.MILLISECONDS.sleep(delay);
        System.out.print(nn);
        TimeUnit.MILLISECONDS.sleep(delay);
        System.out.print(space);
        TimeUnit.MILLISECONDS.sleep(delay);
        System.out.print(mo);
        TimeUnit.MILLISECONDS.sleep(delay);
        System.out.print(ho);
        TimeUnit.MILLISECONDS.sleep(delay);
        System.out.println(rr);
    }
}
