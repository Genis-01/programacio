package tema5.hores;

public class Hores {
    private int h;
    private int m;
    private int s;

    
    public Hores(int h, int m, int s) {
        setH(h);
        setM(m);
        setS(s);
    }
    public Hores(int h, int m) {
        setH(h);
        setM(m);
        setS(0);
    }
    public Hores(int h) {
        setH(h);
        setM(0);
        setS(0);
    }

    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    public int getM() {
        return m;
    }
    public void setM(int m) {
        this.m = m;
    }
    public int getS() {
        return s;
    }
    public void setS(int s) {
        this.s = s;
    }


    public void anyadirS(int n){
        int h = getH();
        int m = getM();
        int s = getS();

        for (int i = 0; i < n; i++) {
            s++;
            if (s>59) {
                s=0;
                m++;
                if (m>59) {
                    m=0;
                    h++;
                    if (h > 23) {
                    h=0;
                }
                }
            }
            System.out.println(String.format("%02d", h) +":"+String.format("%02d", m)+":"+String.format("%02d", s));
        }
        setH(h);
        setM(m);
        setS(s);
    }


}
