package com.example.tulanmap;

public class MostrarDatos {
    private String texto,nombreruta;
    private  int imgCombi;

    public MostrarDatos() {
    }

    public MostrarDatos(String texto, String nombreruta, int imgCombi) {
        this.texto = texto;
        this.nombreruta = nombreruta;
        this.imgCombi = imgCombi;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getNombreruta() {
        return nombreruta;
    }

    public void setNombreruta(String nombreruta) {
        this.nombreruta = nombreruta;
    }

    public int getImgCombi() {
        return imgCombi;
    }

    public void setImgCombi(int imgCombi) {
        this.imgCombi = imgCombi;
    }
}
