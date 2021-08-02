package homework9;

public class Professor extends Course{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void goToClass() {
        System.out.println("Este prezent");
    }

    @Override
    public void teach() {
        super.teach();
    }
}
