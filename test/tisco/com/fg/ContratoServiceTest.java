package tisco.com.fg;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class ContratoServiceTest {
@Test
    public void salvarTest(){
        IContratoService service = new ContratoService();
        String retorno =  service.salvar ();
    Assert.assertEquals("sucesso" , retorno);
}
@Test
public void buscarTest (){
    IContratoService service = new ContratoService();
    String retorno = service.buscar ();
    Assert.assertEquals("Cliente encontrado", retorno);
}
@Test
    public void excluirTest(){
    IContratoService service = new ContratoService();
    String retorno = service.excluir ();
    Assert.assertEquals("Cliente excluido com sucesso", retorno);
}
@Test
    public void atualizarTest(){
    IContratoService service = new ContratoService();
    int retorno = service.atualizar ();
    Assert.assertEquals(1000, retorno);

}

}
