import java.util.ArrayList;
import java.util.Random;

public class Populasyon {









    ArrayList<Birey> p = new ArrayList<>();
    Random r = new Random();

    void populasyanOlustur(int nufus) {
        for (int i = 0; i < nufus; i++) {
            p.add(new Birey(r.nextInt(10) - 5, r.nextInt(10) - 5, r.nextInt(10) - 5));
        }
    }

    void populasyonYaz(int nufus) {
        for (int i = 0; i < nufus; i++) {
            System.out.println(p.get(i).x+", "+p.get(i).y+", "+p.get(i).z+" = "+p.get(i).t);
        }
    }


    void populasyonSirala(int nufus){
        //ArrayList<Birey> buffer = new ArrayList<>();
        Birey b = new Birey(0,0,0);

        for(int i=0;i<nufus-1;i++){
            for(int j=i+1;j<nufus;j++){
                if(p.get(i).t>=p.get(j).t){
                    b = p.get(i);
                    p.set(i,p.get(j));
                    p.set(j,b);
                }
            }
        }
    }

    void caprazla(int nufus){
        Birey b = new Birey(
                (float)(p.get(0).x + p.get(1).x)/2,
                (float)(p.get(0).y + p.get(1).y)/2,
                (float)(p.get(0).z + p.get(1).z)/2);

        if(b.t<p.get(nufus -1).t){
            p.remove(nufus-1);
            p.add(b);
        }

    }

    void mutasyon(int nufus){
        int mbirey = r.nextInt(nufus);
        int mgen = r.nextInt(3);
        if(mgen==0){
            p.get(mbirey).x = r.nextInt(10)-5;
            p.get(mbirey).t = p.get(mbirey).x*p.get(mbirey).x +  p.get(mbirey).y*p.get(mbirey).y + p.get(mbirey).z*p.get(mbirey).z;
        } else  if(mgen==1){
            p.get(mbirey).y = r.nextInt(10)-5;
            p.get(mbirey).t = p.get(mbirey).x*p.get(mbirey).x +  p.get(mbirey).y*p.get(mbirey).y + p.get(mbirey).z*p.get(mbirey).z;
        } else  if(mgen==2){
            p.get(mbirey).z = r.nextInt(10)-5;
            p.get(mbirey).t = p.get(mbirey).x*p.get(mbirey).x +  p.get(mbirey).y*p.get(mbirey).y + p.get(mbirey).z*p.get(mbirey).z;
        }
    }

}
