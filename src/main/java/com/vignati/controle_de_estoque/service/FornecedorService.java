package com.vignati.controle_de_estoque.service;

import com.vignati.controle_de_estoque.model.Fornecedor;
import com.vignati.controle_de_estoque.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> listarFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor buscarFornecedorPorId(int id) {
        return fornecedorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fornecedor não encontrado"));
    }

    public Fornecedor atualizarFornecedor(int id, Fornecedor fornecedor) {
        Fornecedor fornecedorExistente = buscarFornecedorPorId(id);
        fornecedorExistente.setNome(fornecedor.getNome());
        fornecedorExistente.setEndereco(fornecedor.getEndereco());
        fornecedorExistente.setTelefone(fornecedor.getTelefone());
        fornecedorExistente.setEmail(fornecedor.getEmail());
        return fornecedorRepository.save(fornecedorExistente);
    }

    public void excluirFornecedor(int id) {
        Fornecedor fornecedorExistente = buscarFornecedorPorId(id);
        fornecedorRepository.delete(fornecedorExistente);
    }
}
