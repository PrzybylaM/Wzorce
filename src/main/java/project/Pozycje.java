package project;

public class Pozycje {

    private String nazwa;
    private float cenaPizzy;

    Pozycje(String nazwa, float cenaPizzy){
        this.nazwa = nazwa;
        this.cenaPizzy = cenaPizzy;
    }

    public String getNazwa() {
        return nazwa;
    }

    public float getCenaPizzy() {
        return cenaPizzy;
    }
}
