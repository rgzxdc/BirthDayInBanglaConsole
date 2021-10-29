import java.util.concurrent.TimeUnit;

public class SuvoJonmodin {

    public static void main(String[] args) throws InterruptedException {

        char sh = '\u09B6';
        char uu = '\u09C1';
        char vv = '\u09AD';
        char jj = '\u099C';
        char nn = '\u09A8';
        char hnt = '\u09CD';
        char mm = '\u09AE';
        char dd = '\u09A6';
        char ii = '\u09BF';
        char oo = '\u09CB';
        char hh = '\u09B9';
        char rr = '\u09B0';
        char space = ' ';
        int delay = 100;

        char[] hbd = {sh,uu,vv,space,jj,nn,hnt,mm,dd,ii,nn,space,mm,oo,hh,rr};

        int n = 0;
        while(n<16) {
            n++;
            System.out.print(hbd[n-1]);
            TimeUnit.MILLISECONDS.sleep(delay);
        }

    }
}
