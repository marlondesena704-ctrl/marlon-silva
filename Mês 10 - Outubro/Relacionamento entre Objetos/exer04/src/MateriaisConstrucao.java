import java.util.ArrayList;
import java.util.List;

public class MateriaisConstrucao {

    private List<Produto> produto;

    public MateriaisConstrucao() {
        produto = new ArrayList<Produto>();
    }

    public void adicionaProduto(Produto p) {
        produto.add(p);
    }

    public Produto produtoMaisCaro(String nomeMarca) {
        double pMaisCaro = Double.MIN_VALUE;
        Produto pCaro = null;

        for (Produto p : produto) {
            if (p.getPreco() > pMaisCaro && p.getMarca().equalsIgnoreCase(nomeMarca)) {
                pMaisCaro = p.getPreco();
                pCaro = p;
            }
        }
        return pCaro;
    }

    public List<Produto> todosProdutosMarca(String nomeMarca, double min, double max) {
        List<Produto> todosProdutos = new ArrayList<>();
        for (Produto p : produto) {
            if (p.getMarca().equalsIgnoreCase(nomeMarca) && p.getPreco()>min && p.getPreco()<max) {
                todosProdutos.add(p);
            }
        }
        return todosProdutos;

    }
}
