

public class SamsungGalaxyS21 extends Samsung {
    private String imei;

    public String getImei(){
        return imei;
    }

    public SamsungGalaxyS21(String imei){
        this.imei=imei;
    }

    @Override
    public String toString() {
        return "SamsungGalaxyS21{" +
                "imei='" + imei + '\'' +
                '}';
    }
}