/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.profemariostomas.diurno1009.modelos;

import java.util.ArrayList;

/**
 *
 * @author luk0s
 */
public class Trabajador {
    private String run;
    private String nombre;
    private Integer edad;
    private String afp;
    private String sexo;
    private ArrayList<String> bonos;

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList<String> getBonos() {
        return bonos;
    }

    public void setBonos(ArrayList<String> bonos) {
        this.bonos = bonos;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "run=" + run + ", nombre=" + nombre + ", edad=" + edad + ", afp=" + afp + ", sexo=" + sexo + ", bonos=" + bonos + '}';
    }
    
    
}
