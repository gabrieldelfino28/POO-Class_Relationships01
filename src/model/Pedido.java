package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroNota;
    private double valorTotal;
    private List<ItemPedido> items;

    public Pedido() {
        items = new ArrayList<>();
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public double getValorTotal() {
        double valorUnitario;
        for (ItemPedido item : items){
            valorUnitario = item.getProduto().getValor() * item.getQuantidade();
            valorTotal += valorUnitario;
        }
        return valorTotal;
    }

    public void adicionarItem(ItemPedido item) {
        items.add(item);
    }
}
