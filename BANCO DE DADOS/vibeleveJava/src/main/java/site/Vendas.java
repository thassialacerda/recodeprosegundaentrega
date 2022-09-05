
package site;

import java.util.ArrayList;

public class Vendas extends Viagem{
    int qntPacote;
    String formaPagamento;

    public int getQntPacote() {
        return qntPacote;
    }

    public void setQntPacote(int qntPacote) {
        this.qntPacote = qntPacote;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<cliente> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<cliente> vendas) {
        this.vendas = vendas;
    }
    
    
    ArrayList<cliente> vendas;
    
    void venderPacote(){
    
    }

    private static class cliente {

        public cliente() {
        }
    }
}
