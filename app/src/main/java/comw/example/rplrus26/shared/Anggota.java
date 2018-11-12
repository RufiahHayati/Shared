package comw.example.rplrus26.shared;

public class Anggota {

    private String username;

    public Anggota(String name) {
        this.setUsername(name);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername(){
        return username;
    }
}
