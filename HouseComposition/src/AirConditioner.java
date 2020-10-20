public class AirConditioner {
    private String name;
    private String remote;

    public AirConditioner(String name, String remote) {
        this.name = name;
        this.remote = remote;
    }

    public void switchOn(){
        System.out.println("Switching on Air Conditioner");
    }
}
