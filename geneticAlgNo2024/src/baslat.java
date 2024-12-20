public class baslat {
    public static void main(String[] args) {
        int nufus = 5;
        Populasyon pop = new Populasyon();
        pop.populasyanOlustur(nufus);
        System.out.println("▓ İlk populasyon");
        pop.populasyonYaz(nufus);

        pop.populasyonSirala(nufus);
        System.out.println("▓ İlk populasyon sıralı");
        pop.populasyonYaz(nufus);

        pop.caprazla(nufus);
        System.out.println("▓ Çaprazlama sonrası");
        pop.populasyonYaz(nufus);

        pop.mutasyon(nufus);
        System.out.println("▓  Mutasyon sonrası");
        pop.populasyonYaz(nufus);


        for(int i = 0; i<1000;i++){
            pop.populasyonSirala(nufus);
            pop.caprazla(nufus);
            pop.mutasyon(5);
            System.out.println("▓ "+i +". Jenerasyon");
            pop.populasyonSirala(nufus);
            pop.populasyonYaz(nufus);
        }

        System.out.println("▓ Döngü sonu");
        pop.populasyonSirala(nufus);
        pop.populasyonYaz(nufus);

    }
}
