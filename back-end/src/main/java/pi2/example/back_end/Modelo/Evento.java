package pi2.example.back_end.Modelo;

public class Evento {
    private int id;
    private String desc;

    public Evento() {
    }

    public Evento(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
