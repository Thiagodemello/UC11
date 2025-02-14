/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeEstoqueTeste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author thiag
 */
public class estoqueTest {
public Estoque estoque = new Estoque();
    @BeforeEach
    public void setUp(){
        estoque = new Estoque();
        estoque.produtos.add(new Produto("banana",3));
    }
    
    @Test
    public void someEmAddProdutoTest(){
        estoque.adicionarProduto("banana", 1);
        assertEquals(4,estoque.produtos.get(0).quantidade, "A quantidade de bananas precisa ser 4 depois de adicionada");
    }    
    
    @Test
    public void addProdutoTest(){
        estoque.adicionarProduto("maca", 1);
        assertEquals("maca",estoque.produtos.get(1).nome, "Um produto com o nome 'maca' deveria ser adicionado!");
        assertEquals(1,estoque.produtos.get(1).quantidade, "Um produto com a quantidade '1 deveria ser adicionado!");
    }    
}
