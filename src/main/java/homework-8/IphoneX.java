

public class IphoneX extends Apple{
    private String imei;

    public IphoneX(String imei){
        this.imei=imei;
    }

    public String getImei(){
        return imei;
    }

    @Override
    public String toString() {
        return "IphoneX{" +
                "imei='" + imei + '\'' +
                '}';
    }
}
