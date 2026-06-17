package MiniHamburgueria;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vendavel> pedido = new ArrayList<>();

        pedido.add(new Lanches("Hambúrguer Artesanal", 25, 5));
        pedido.add(new Bebidas("Refrigerante", 6,"300ml"));

        double total = 0;

        for (Vendavel item : pedido) {
            double preco = item.calcularPrecoFinal();

            System.out.println("Item: R$ " + preco);

            total += preco;
        }

        System.out.println("Total do pedido: R$ " + total);
    }
}
