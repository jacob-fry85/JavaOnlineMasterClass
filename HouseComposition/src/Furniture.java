public class Furniture {
    private int table;
    private int chair;
    private int door;
    private int laptop;

    public Furniture(int table, int chair, int door, int laptop) {
        this.table = table;
        this.chair = chair;
        this.door = door;
        this.laptop = laptop;
    }

    public void getRest() {
        System.out.println("Open door");
        System.out.println("");
    }

    public void playLaptop() {
        System.out.println("Play Laptop");
    }

    public int getTable() {
        return table;
    }

    public int getChair() {
        return chair;
    }

    public int getDoor() {
        return door;
    }

    public int getLaptop() {
        return laptop;
    }
}
