/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorentidade;

/**
 *
 */
public class ValidadorCursoStrategy  implements ValidadorStrategy{
    
    @Override
    public boolean isValidate(Entidade e)
    {
        if(!(e instanceof Curso))
        {
            return false;
        }
        Curso c = (Curso) e;
        if(c.getId() != 0)
        {
            return true;
        }
        return false;
    }
}
