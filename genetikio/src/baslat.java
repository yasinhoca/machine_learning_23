public class baslat {
    public static void main(String[] args) {
        Populasyon pop = new Populasyon();
        pop.populasyanOlustur(5);
        pop.populasyonYaz(5);
        pop.populasyonSirala(5);
        System.out.println("-------------");
        pop.populasyonYaz(5);
        pop.caprazla();
        System.out.println("-------------");
        pop.populasyonYaz(5);
        pop.mutasyon();
        System.out.println("-------------");
        pop.populasyonYaz(5);

        for(int i = 0; i<1000;i++){
            pop.populasyonSirala(5);
            pop.caprazla();
            pop.mutasyon();
        }

        System.out.println("-------------");
        pop.populasyonSirala(5);
        pop.populasyonYaz(5);


    }
}
