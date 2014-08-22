/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorentidade;

/**
 *
 */
public class ValidadorClienteStrategy implements ValidadorStrategy{
    
    @Override
    public boolean isValidate(Entidade e)
    {
        if(!(e instanceof Cliente))
        {
            return false;
        }
        Cliente c = (Cliente) e;
        if(c.getMatricula() != 0)
        {
            return true;
        }
        return false;
    }
    
}
