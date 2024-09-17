package br.edu.ifnmg.proxy;

/**
 *
 * @author analu
 */

public class User {

    private String name;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    
    public User() {
    }

    public User(String name) {
        this.name = name;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//</editor-fold>

}
