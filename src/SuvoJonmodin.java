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
        for(int i=0;i<16;i++){
            System.out.print(hbd[i]);
            TimeUnit.MILLISECONDS.sleep(delay);
        }

//        System.out.print(sh);
//        TimeUnit.MILLISECONDS.sleep(delay);
//        System.out.print(uu);
//        TimeUnit.MILLISECONDS.sleep(delay);
//        System.out.print(vv);
//        TimeUnit.MILLISECONDS.sleep(delay);
//
//        System.out.print(space);
//
//        TimeUnit.MILLISECONDS.sleep(delay);
//        System.out.print(jj);
//        TimeUnit.MILLISECONDS.sleep(delay);
//        System.out.print(nn);
//        TimeUnit.MILLISECONDS.sleep(delay);
//        System.out.print(hnt);
//        TimeUnit.MILLISECONDS.sleep(delay);
//        System.out.print(mm);
//        TimeUnit.MILLISECONDS.sleep(delay);
//        System.out.print(dd);
//        TimeUnit.MILLISECONDS.sleep(delay);
//        System.out.print(ii);
//        TimeUnit.MILLISECONDS.sleep(delay);
//        System.out.print(nn);
//        TimeUnit.MILLISECONDS.sleep(delay);
//        System.out.print(space);
//        TimeUnit.MILLISECONDS.sleep(delay);
//
//        System.out.print(mm);
//        TimeUnit.MILLISECONDS.sleep(delay);
//        System.out.print(oo);
//        TimeUnit.MILLISECONDS.sleep(delay);
//        System.out.print(hh);
//        TimeUnit.MILLISECONDS.sleep(delay);
//        System.out.println(rr);
    }
}
