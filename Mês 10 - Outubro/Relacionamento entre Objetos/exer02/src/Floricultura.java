import java.util.ArrayList;
import java.util.List;

public class Floricultura {

    private List<Flor> flores;

    public Floricultura(){
        flores = new ArrayList<Flor>();
    }
    public void adicionarFlor (Flor f){
        flores.add(f);
    }
    public List<Flor> floresCliente(String nomeCliente){
        List<Flor> florCliente = new ArrayList<>();
        for(Flor f: flores){
            if(f.getNomeCliente().equals(nomeCliente)){
                florCliente.add(f);
            }
        }
        return florCliente;

    }
}
