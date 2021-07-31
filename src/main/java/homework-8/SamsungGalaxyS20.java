

public class SamsungGalaxyS20 extends Samsung{
    private String imei;

    public String getImei(){
        return imei;
    }

    public SamsungGalaxyS20(String imei){
        this.imei=imei;
    }

    @Override
    public String toString() {
        return "SamsungGalaxyS20{" +
                "imei='" + imei + '\'' +
                '}';
    }
}
