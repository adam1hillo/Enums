package be.vdab.jpfhfdst18;

public class Main {
    public static void main(String[] args) {
        Seizoen zaaiSeizoen = Seizoen.LENTE;

        System.out.println(zaaiSeizoen);


        for (Seizoen seizoen : Seizoen.values()) {
            System.out.println(seizoen);
        }

        var zwemSeizoen = Seizoen.valueOf("ZOMER");
        System.out.println(zwemSeizoen);
        System.out.println(zwemSeizoen.ordinal());

        Seizoen skiSeizoen = Seizoen.WINTER;
        System.out.println(skiSeizoen.getBeginMaand());
    }
}
