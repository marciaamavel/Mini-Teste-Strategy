/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorentidade;

/**
 *
 */
public class CadastradorEntidade {

    public static ValidadorContexto vc = new ValidadorContexto();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadastradorEntidade ce = new CadastradorEntidade();
        ce.cadastraCliente();
        ce.cadastraCurso();
        ce.cadastraProduto();
    }
    
    public void cadastraCliente()
    {
        Cliente c = new Cliente();
        c.setName("Joao");
        c.setMatricula(1010);
        
        CadastradorEntidade.vc.setValidador(new ValidadorClienteStrategy());
        if(CadastradorEntidade.vc.getValidador().isValidate(c))
            System.out.println("Clinte validado com sucesso.");
        else
            System.out.println("Erro nos dados cadastrais do Cliente.");
    }
    
    public void cadastraCurso()
    {
        Curso c = new Curso();
        c.setName("POO");
        c.setId(0);
        
        CadastradorEntidade.vc.setValidador(new ValidadorCursoStrategy());
        if(CadastradorEntidade.vc.getValidador().isValidate(c))
            System.out.println("Curso validado com sucesso.");
        else
            System.out.println("Erro nos dados cadastrais do Curso.");
    }
    
    public void cadastraProduto()
    {
        Produto p = new Produto();
        p.setName("Camisa");
        p.setValor(250);
        
        CadastradorEntidade.vc.setValidador(new ValidadorProdutoStrategy());
        if(CadastradorEntidade.vc.getValidador().isValidate(p))
            System.out.println("Produto validado com sucesso.");
        else
            System.out.println("Erro nos dados cadastrais do Produto.");
    }
}
