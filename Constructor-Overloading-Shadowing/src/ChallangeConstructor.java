public class ChallangeConstructor {
        public static void main(String[] args) {

            String brand = "macOS";

            if (brand.equalsIgnoreCase("asus")){
                Brand brand1 = new Brand("ASUS");
                brand1.laptopBrand = "ASUS";
                Specification specification1 = new Specification("FX 505 DT", "AMD Ryzen 5");
                Specification specification2 = new Specification(5, 500);
                System.out.println("I have laptop " .concat(brand1.laptopBrand) + ", type " .concat(specification1.type) + ", processor " .concat(specification1.processor) + ", RAM " .concat(String.valueOf(specification2.ram)) + ", Storage " .concat(String.valueOf(specification2.storage)));

            } else if (brand.equalsIgnoreCase("lenovo")){
                Brand brand2 = new Brand("LENOVO");
                brand2.laptopBrand = "LENOVO";
                Specification specification3 = new Specification("ThinkPad X13 Yoga", "Intel Evo");
                Specification specification4 = new Specification(16, 1);
                System.out.println("I have laptop " .concat(brand2.laptopBrand) + ", type " .concat(specification3.type) + ", processor " .concat(specification3.processor) + ", RAM " .concat(String.valueOf(specification4.ram)) + ", Storage " .concat(String.valueOf(specification4.storage)));

            }else {
                System.out.println("Brand name not found");
            }
        }
    }
    class Brand{
        String laptopBrand;

        Brand(String brandName){
            System.out.println("Brand name : " + brandName);
        }
    }

    class Specification{

        // property
        String type;
        String processor;
        Integer ram;
        Integer storage;

        // overloading constructor
        Specification(String type, String processor){
            this.type = type;
            this.processor = processor;
        }
        Specification(Integer ram, Integer storage){
            this.ram = ram;
            this.storage = storage;
        }
    }