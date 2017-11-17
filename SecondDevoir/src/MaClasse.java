/**
 *
 * @author Rafik
 */
public class MaClasse {
    public static void main(String[] args){
    
        GrilleImpl gi = new GrilleImpl();
        
      //appel de la m�thode getDimension() qui renvoi la dimension de la grille
        int dim = gi.getDimension();
        System.out.println(dim);
        
        //appel de la m�thode getValue()qui r�cup�re une valeur de la grille
        char recupValue = gi.getValue(3.0, 8.0);
        System.out.println("la valeur aux indices que vous avez mentionn� est : "+recupValue);
        
        //appel de la m�thode setValue()qui affecte une valeur dans la grille 
        gi.setValue(0, 8, '3');
        
        //appel de la m�thode complte()qui teste si une grille est termin�e
        boolean compl = gi.complete();
        System.out.println("la grille est-elle compl�te ? "+compl);
        
        //appel de la m�thode possible()qui teste si une valeur est possible dans la grille
        //est possible par rapport � ce qu'elle contient d�j�
        boolean verifier = gi.possible(0, 7, 'a');
        System.out.println(verifier);
        
    }
}