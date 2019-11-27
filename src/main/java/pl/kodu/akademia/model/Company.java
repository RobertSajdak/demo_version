package pl.kodu.akademia.model;

public class Company {
    private int id;
    private String nip;
    private String regon;
    private String krs;
    private String nazwa;

    public Company(int id, String nip, String regon, String krs, String nazwa) {
        this.id = id;
        this.nip = nip;
        this.regon = regon;
        this.krs = krs;
        this.nazwa = nazwa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public String getKrs() {
        return krs;
    }

    public void setKrs(String krs) {
        this.krs = krs;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
