public class House {
    private AirConditioner airConditioner;
    private Furniture furniture;

    public House(AirConditioner airConditioner, Furniture furniture) {
        this.airConditioner = airConditioner;
        this.furniture = furniture;
    }

   public void rest(){
        furniture.getRest();
        airConditioner.switchOn();
        furniture.playLaptop();
   }


}
