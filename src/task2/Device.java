package task2;

import java.util.Objects;

public class Device {

    String manufacturer;
    float price;
    String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public Device() {

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "manufacturer =" + manufacturer + ", price=" + price + ", serialNumber=" + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;

        return this.getManufacturer().equals(device.getManufacturer()) && this.getSerialNumber().equals(device.getSerialNumber()) && this.getPrice() == device.getPrice();
    }

//

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }
}
