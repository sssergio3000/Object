package task2;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Nokia", 300, "34A7687BC");
        Monitor monitor = new Monitor("Samsung", 1200, "98789AC", 12345, 12345);
        Device ethr = new EthernetAdapter("Asus", 450, "9878923BC", 100, "98738923bnmkjh");
        System.out.println(device);
        System.out.println(monitor);
        System.out.println(ethr);
        Device device1 = new Device("Nokia", 301, "34A7687BC");
        System.out.println(device1.equals(device));
        System.out.println(device1.hashCode());
        System.out.println(device.hashCode());

        Device ethrnt = new EthernetAdapter("Asus", 200, "789098", 300, "98789chjuk");
        Device ethrnt1 = new EthernetAdapter("Asus", 200, "789098", 300, "98789chjuk");
        System.out.println("ethrnt:" + ethrnt.hashCode() + " equals ethrnt1" + ethrnt1.hashCode() + ": " + ethrnt1.equals(ethrnt));

        Monitor mon1 = new Monitor("Asus", 200, "789098", 12345, 54321);
        Device mon2 = new Monitor("Asus", 201, "789098", 12345, 54321);
        System.out.println("mon1:" + mon1.hashCode() + " equals mon2: " + mon2.hashCode() + ": " + mon1.equals(mon2));
    }
}
