public class Kendaraan {
        public static void main(String[] args) {

            Mobil mobil = new Kendaraan.Mobil();
            Motor motor = new Kendaraan.Motor();

            // set value property
            mobil.merkMobil = "Porsche";
            mobil.varianMobil = "718 Cayman GT4 RS";
            motor.merkMotor = "Yamaha";
            motor.varianMotor = "R1";

            // get value property + method
            System.out.println("================MOBIL================");
            System.out.println("Merk mobil saya   : " .concat(mobil.merkMobil));   // -> concat
            System.out.println("Varian mobil saya : " .concat(mobil.varianMobil));
            System.out.println("\n");
            mobil.maju();
            mobil.mundur();
            System.out.println("Mobil : " .concat(mobil.kiri()));
            System.out.println("Mobil : " .concat(mobil.kanan()));
            System.out.println("\n");

            System.out.println("================MOTOR================");
            System.out.println("Merk motor saya   : " .concat(motor.merkMotor));
            System.out.println("Varian motor saya : " .concat(motor.varianMotor));
            System.out.println("\n");
            motor.maju();
            motor.mundur();
            System.out.println("Motor : " .concat(motor.kiri()));
            System.out.println("Motor : " .concat(motor.kanan()));
        }

        static class Mobil{

            // property
            String merkMobil;
            String varianMobil;

            // method tidak mengembalikan nilai
            void maju(){
                System.out.println("Mobil : Maju...");
            }
            void mundur(){
                System.out.println("Mobil : Mundur...");
            }

            // method mengembalikan nilai
            String kiri(){
                return "Belok kiri...";
            }
            String kanan(){
                return "Belok kanan...";
            }
        }

        static class Motor{

            // property
            String merkMotor;
            String varianMotor;

            // method tidak mengembalikan nilai
            void maju(){
                System.out.println("Motor : Maju...");
            }

            void mundur(){
                System.out.println("Motor : Mundur...");
            }

            // method mengembalikan nilai
            String kiri(){
                return "Belok kiri...";
            }

            String kanan(){
                return "Belok kanan...";
            }
        }
}