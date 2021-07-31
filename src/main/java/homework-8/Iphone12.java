

public class Iphone12 extends homework.Apple {
    private String imei;

    public Iphone12(String imei){
        this.imei=imei;
    }

    public String getImei(){
        return imei;
    }

    @Override
    public String toString() {
        return "Iphone12{" +
                "imei='" + imei + '\'' +
                '}';
    }
}
