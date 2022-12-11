package task2;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Nokia", 300, "34A7687BC");
        Monitor monitor = new Monitor("Samsung", 1200, "98789AC",12345,12345);
        Device ethr = new EthernetAdapter("Asus",450, "9878923BC", 100,"98738923bnmkjh");
        System.out.println(device);
        System.out.println(monitor);
        System.out.println(ethr);
    }
}
