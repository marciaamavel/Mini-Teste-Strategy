/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorentidade;

/**
 *
 */
public class ValidadorProdutoStrategy implements ValidadorStrategy{
    
    @Override
    public boolean isValidate(Entidade e)
    {
        if(!(e instanceof Produto))
        {
            return false;
        }
        Produto p = (Produto) e;
        if(p.getValor() > 0)
        {
            return true;
        }
        return false;
    }
}
