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
public class Data {
    private int Dia;
    private int Mes;
    private int Ano;
    
    /**
     * @return the Dia
     */
    public int getDia() {
        return Dia;
    }

    /**
     * @return the Mes
     */
    public int getMes() {
        return Mes;
    }

    /**
     * @return the Ano
     */
    public int getAno() {
        return Ano;
    }

    /**
     * @param Dia the Dia to set
     */
    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    /**
     * @param Mes the Mes to set
     */
    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    /**
     * @param Ano the Ano to set
     */
    public void setAno(int Ano) {
        this.Ano = Ano;
    }
    
    public Data(int Dia, int Mes, int Ano) {
        this.Dia = Dia;
        this.Mes = Mes;
        this.Ano = Ano;
    }
   
    public String getString(){
        return (this.Dia + "/" + this.Mes + "/" + this.Ano);
    }
}
