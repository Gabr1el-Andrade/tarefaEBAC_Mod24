package tisco.com.fg;

public class ContratoService implements IContratoService {
    @Override
    public String salvar() {
        return "sucesso";
    }

    @Override
    public String buscar() {
        return "Cliente encontrado";
    }

    @Override
    public String excluir() {
        return "Cliente excluido com sucesso";
    }

    @Override
    public Integer atualizar() {
        return 1000;
    }
}
