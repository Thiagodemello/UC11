/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioestoque;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author thiag
 */
public class estoqueTeste {
public Estoque estoque = new Estoque();
    @BeforeEach
    public void setUp(){
        estoque = new Estoque();
        estoque.produtos.add(new Produto("banana",3));
        estoque.produtos.add(new Produto("Maca",5));
        estoque.produtos.add(new Produto("Manga",10));
        
        
    }
    
    @Test
    public void someEmAddProdutoTest(){
        estoque.adicionarProduto("banana", 1);
        assertEquals(4,estoque.produtos.get(0).quantidade, "A quantidade de bananas precisa ser 4 depois de adicionada");
    }    
    
    @Test
    public void addProdutoTest(){
        estoque.adicionarProduto("Maca", 1);
        assertEquals("Maca",estoque.produtos.get(1).nome, "Um produto com o nome 'maca' deveria ser adicionado!");
        assertEquals(6,estoque.produtos.get(1).quantidade, "Um produto com a quantidade '1 deveria ser adicionado!");
    }
    
    @Test
    public void removerProdutoTest(){
        estoque.removerProduto("banana", 2);
        assertEquals(1, estoque.produtos.get(0).quantidade,"Deveria restar apenas uma banana");
    }
    
     @Test
    public void consultarQuantidadeTest(){
        estoque.consultarQuantidade("banana");
        assertEquals(3, estoque.produtos.get(0).quantidade,"deve aparecer 3 bananas");
    }
    
    @Test
    public void maisEstocadoTest(){
        estoque.produtoMaisEstocado();
        assertEquals("Manga",estoque.produtoMaisEstocado(),"deve aparecer Manga");
    }
    
    @Test
    public void limparEstoqueTest(){
        estoque.limparEstoque();
        assertTrue(estoque.produtos.isEmpty());
    }

   
}
