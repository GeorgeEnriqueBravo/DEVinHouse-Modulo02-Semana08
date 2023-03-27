package br.com.senai.exemplospringaula4.repository;

import br.com.senai.exemplospringaula4.model.Conta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContaRepository {
    private static List<Conta> contaList = new ArrayList<>();

    ClienteRepository clienteList;

    public List<Conta> encontrarContas(){
        return contaList;
    }

    public Conta encontrarContaId(Integer id){
        return contaList.get(id);
    }

    public boolean salvarConta(Integer id, Conta conta){
        return contaList.add(conta);
    }

//    public boolean salvarConta(Integer id, Conta conta){
//
//        if (clienteList.encontrarClienteId(id).equals(conta.getId_cliente())) {
//            return contaList.add(conta);
//        }
//        return false;
//    }

    public boolean deletarContaId(Integer id){
        return contaList.remove(encontrarContaId(id));
    }

    public void atualizarContaId(Integer id, Conta conta){
        contaList.add(id,conta);
    }

    public String sacarDinheiroConta(Integer id, Double valor) {

        try{
            if (contaList.get(id).getSaldo() >= valor) {
                contaList.get(id).setSaldo(contaList.get(id).getSaldo() - valor);
                return "Saque efetuado com sucesso";
            } else {
                return "Valor não suficiente para saque";
            }
        } catch (IndexOutOfBoundsException erro) {
            return "Conta não encontrada";
        }


    }

    public String depositarDinheiroConta(Integer id, Double valor) {
        try {
            contaList.get(id).setSaldo(contaList.get(id).getSaldo() + valor);
            return "Depósito efetuado com sucesso";
        } catch (IndexOutOfBoundsException erro) {
            return "Conta não encontrada";
        }
    }

}
