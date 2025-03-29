/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh;

/**
 *
 * @author 20171TIIMI0173
 */
public class Funcionario {
    private String Nome;
    private String Cpf;
    private double Salario;
    private Data dtNasc;
    private Data dtContr;


    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Cpf
     */
    public String getCpf() {
        return Cpf;
    }

    /**
     * @param Cpf the Cpf to set
     */
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    /**
     * @return the Salario
     */
    public double getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    /**
     * @return the dtNasc
     */
    public Data getDtNasc() {
        return dtNasc;
    }

    /**
     * @param dtNasc the dtNasc to set
     */
    public void setDtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }

    /**
     * @return the dtContr
     */
    public Data getDtContr() {
        return dtContr;
    }

    /**
     * @param dtContr the dtContr to set
     */
    public void setDtContr(Data dtContr) {
        this.dtContr = dtContr;
    }
    
    public Funcionario(String Nome, String Cpf, double Salario, Data dtNasc, Data dtContr){
        this.Cpf = Cpf;
        this.Nome = Nome;
        this.dtNasc = dtNasc;
        this.Salario = Salario;
        this.dtContr = dtContr;
    }
}