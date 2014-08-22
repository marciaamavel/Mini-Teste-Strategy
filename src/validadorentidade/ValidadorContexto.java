/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorentidade;

/**
 *
 * @author Gilberto
 */
public class ValidadorContexto {
    private ValidadorStrategy vs = null;
    
    public void setValidador(ValidadorStrategy v)
    {
        this.vs = v;
    }
    
    public ValidadorStrategy getValidador()
    {
        return this.vs;
    }
    
}
