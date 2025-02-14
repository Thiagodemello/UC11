/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeEstoqueTeste;

import java.util.ArrayList;

/**
 *
 * @author thiag
 */
public class Estoque {
public ArrayList<Produto> produtos;

   
    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    
    public void adicionarProduto(String nome, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setQuantidade(produto.getQuantidade() + quantidade);
                return;
            }
        }
        produtos.add(new Produto(nome, quantidade));
    }

    // Remover uma quantidade específica de um produto
    public void removerProduto(String nome, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                if (quantidade > produto.getQuantidade()) {
                    throw new IllegalArgumentException("Quantidade a remover excede a disponível.");
                }
                produto.setQuantidade(produto.getQuantidade() - quantidade);
                if (produto.getQuantidade() == 0) {
                    produtos.remove(produto);
                }
                return;
            }
        }
        throw new IllegalArgumentException("Produto não encontrado no estoque.");
    }

    //consultar quantidade:
    
    public int consultarQuantidade(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto.getQuantidade();
            }
        }
        throw new IllegalArgumentException("Produto não encontrado no estoque.");
    }

    // Mais estocado
    public String produtoMaisEstocado() {
        if (produtos.isEmpty()) {
            throw new IllegalStateException("Estoque está vazio.");
        }

        Produto maisEstocado = produtos.get(0);
        for (Produto produto : produtos) {
            if (produto.getQuantidade() > maisEstocado.getQuantidade()) {
                maisEstocado = produto;
            }
        }
        return maisEstocado.getNome();
    }

    // Limpar todo o estoque
    public void limparEstoque() {
        produtos.clear();
    }
}    

