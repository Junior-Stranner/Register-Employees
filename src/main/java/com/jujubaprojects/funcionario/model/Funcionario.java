package com.jujubaprojects.funcionario.model;

public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private double salHora;
    private double horasTrab,salario;

    
    public Funcionario(int id, String nome, String cargo, double salHora, double horasTrab,double salario) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salHora = salHora;
        this.horasTrab = horasTrab;
        this.salario = salario;
    }
    public Funcionario(){
        this.id = 0;
        this.nome = "";
        this.cargo = "";
        this.salHora = 0.0;
        this.horasTrab = 0.0;
        this.salario = 0.0;

    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public double getSalHora() {
        return salHora;
    }


    public void setSalHora(double salHora) {
        this.salHora = salHora;
    }


    public double getHorasTrab() {
        return horasTrab;
    }


    public void setHorasTrab(double horasTrab) {
        this.horasTrab = horasTrab;
    }

    public double getSalario(){
         return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }

    
}
