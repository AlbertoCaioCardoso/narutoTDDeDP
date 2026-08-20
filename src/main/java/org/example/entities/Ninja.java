package org.example.entities;

import java.util.Map;

public class Ninja {

    private String name;
    private String aldeia;
    private String cla;
    private int nivelChakra;
    private Map<String, Integer> listaNinjutsos;

    public Ninja(String name, String aldeia, String cla, int nivelChakra){
        this.name = name;
        this.aldeia = aldeia;
        this.cla = cla;
        this.nivelChakra = nivelChakra;
    }

    public String getName() {
        return name;
    }

    public String getAldeia() {
        return aldeia;
    }

    public String getCla() {
        return cla;
    }

    public int getNivelChakra() {
        return nivelChakra;
    }

    public Map<String, Integer> getListaNinjutsos() {
        return listaNinjutsos;
    }

    public void setListaNinjutsos(Map<String, Integer> listaNinjutsos) {
        this.listaNinjutsos = listaNinjutsos;
    }
}
