package view;

import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setCodigo(1345);
        p1.setDescricao("Leite Nestle");
        p1.setValor(9.99);

        Produto p2 = new Produto();
        p2.setCodigo(1302);
        p2.setDescricao("Chocolate em pó");
        p2.setValor(3.99);

        Produto p3 = new Produto();
        p3.setCodigo(1256);
        p3.setDescricao("Vinho");
        p3.setValor(29.99);

        ItemPedido i1 = new ItemPedido();
        i1.setProduto(p1);
        i1.setQuantidade(10);

        ItemPedido i2 = new ItemPedido();
        i2.setProduto(p2);
        i2.setQuantidade(3);

        ItemPedido i3 = new ItemPedido();
        i3.setProduto(p3);
        i3.setQuantidade(2);

        Pedido pedido = new Pedido();
        pedido.setNumeroNota(123464);
        pedido.adicionarItem(i1);
        pedido.adicionarItem(i2);
        pedido.adicionarItem(i3);

        System.out.println("Nota fiscal: " + pedido.getNumeroNota() + "\n");

        for (ItemPedido item : pedido.getItems()) {
            System.out.println(
                    item.getProduto().getDescricao() + "\n" +
                    item.getProduto().getCodigo() + "\n" +
                    item.getProduto().getValor() + "\n" +
                    item.getQuantidade() + "\n"
            );
        }

        System.out.println("Valor Total: "+pedido.getValorTotal());
    }
}
