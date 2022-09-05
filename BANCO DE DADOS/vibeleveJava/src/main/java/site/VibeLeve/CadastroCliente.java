/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package site.VibeLeve;

import site.Cliente;
import site.Destino;

/**
 *
 * @author User
 */
public class CadastroCliente {
    public static void main(String[] args) {
        Destino tipohosp;
        tipohosp = new Pacote();
        tipohosp.setDestino("Sana");
        tipohosp.setVagas(3);
        
        Cliente cliente1=new Cliente();
        cliente1.setNome("Thássia");
        cliente1.setSobrenome("Lacerda");
        cliente1.setCpf (000000000);
        cliente1.setTelefone ("000000000");
        cliente1.setEmail ("thassialacerdaa@gmail.com");
        cliente1.setDestino ("Sana");
        
        Cliente cliente2=new Cliente();
        cliente2.setNome("Ze");
        cliente2.setSobrenome("Lacerda");
        cliente2.setCpf (000000000);
        cliente2.setTelefone (000000000);
        cliente2.setEmail ("ze@gmail.com");
        cliente2.setDestino ("pacote1");
        
        System.out.print("Dados do cliente 1");
        System.out.print(cliente1.getNome());
        System.out.print(cliente1.getDestino());
          
    }
    }

    class Pacote extends Destino {

        public Pacote() {
        }
    }

    class destino1 {

        private static void setLgar(String sana) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        static void setVagas(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    static void setLugar(String sana) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        public destino1() {
        }
    }

    
}    
