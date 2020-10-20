public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quills;

    public Bed(String style, int pillows, int height, int sheets, int quills) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quills = quills;
    }

    public void make() {
        System.out.println("Bed -> Making Bed");
    }
}
