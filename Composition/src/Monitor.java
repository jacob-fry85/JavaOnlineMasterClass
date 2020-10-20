public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeSResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeSResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeSResolution = nativeSResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeSResolution() {
        return nativeSResolution;
    }
}
