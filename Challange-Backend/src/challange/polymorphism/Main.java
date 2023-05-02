package challange.polymorphism;

public class Main {

    public static void main(String[] args) {

        Hewan hewan = new Hewan();
        System.out.println(hewan.suaraHewan());

        hewan = new Tikus();
        System.out.println(hewan.suaraHewan());
        hewan = new Kucing();
        System.out.println(hewan.suaraHewan());

    }
}
