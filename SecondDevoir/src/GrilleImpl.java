/**
 *
 * @author Rafik
 */
public class GrilleImpl implements Grille {
	char[] array = new char[] {'1', '2','3', '4', '5', '6', '7', '8', '9'};

/**
* @return vrai si un élément existe dans la grille
*/
static boolean existe(char T[], char val){
	for(int i = 0 ; i<T.length;i++){
		if(val==T[i])
			return true;}
	return false;
	}

/**
* signature de la méthode existe, retourne false si un élément existe dans la grille
* @return vrai si un élément existe dans la grille
*/
static boolean existe(char T[], int val){
	for(int i = 0 ; i<T.length;i++){
		if((char) val==T[i])
			return false;}
	return true;
	}

/**
* @return largeur/hauteur de la grille
*/
public int getDimension() throws IllegalArgumentException {
	return (possible.length)*(possible.length);
	}

/**
* signature de la méthode getDimension
* @return largeur/hauteur de la grille
*/
public int getDimension(int dim) {
	dim = (possible.length)*(possible.length);
	return dim;			
	}

/**
* Affecte une valeur dans la grille
*
* @param x       position x dans la grille
* @param y       position y dans la grille
* @param value
* valeur a mettre dans la case
* @throw IllegalArgumentException si x ou y sont hors bornes (0-8)
* @throw IllegalArgumentException si la valeur est interdite aux vues des
*        autres valeurs de la grille
* @throw IllegalArgumentException si value n'est pas un caractere autorise
*        ('1',...,'9')
*/
public void setValue(int x, int y, char value) throws IllegalArgumentException {
	boolean recherche = existe(array, value);
	if ((x <0 || x >8) || ( y < 0 || y > 8))
		throw new IllegalArgumentException("la valeur des indices (x,y)  de la grille doit être comprise entre 0 et 8");
	else
	{System.out.println("les valeurs des indices (x,y) de la grille sont valides");
	}
	
	if (recherche != true) throw new IllegalArgumentException("la valeur " +value+ " que vous venez de saisir est invalide");
	else
	{System.out.println("la valeur " +value+ " que vous venez de saisir est valide");
	}
	possible[x][y] = value;
}

/**
* Signature de la méthode setValue
*
* @param x       position x dans la grille
* @param y       position y dans la grille
* @param value
* valeur a mettre dans la case
* @throw IllegalArgumentException si x ou y sont hors bornes (0-8)
* @throw IllegalArgumentException si la valeur est interdite aux vues des
*        autres valeurs de la grille
* @throw IllegalArgumentException si value n'est pas un caractere autorise
*        ('1',...,'9')
*/
public void setValue(int x, int y, int value)  {
	boolean recherche = existe(array, (char) value);
	if ((x <0 || x >8) || ( y < 0 || y > 8))
		System.out.println("la valeur des indices (x,y)  de la grille doit être comprise entre 0 et 8");
	else
	{System.out.println("les valeurs des indices (x,y) de la grille sont valides");
	}
	
	if (recherche != false) throw new IllegalArgumentException("la valeur " +value+ " que vous venez de saisir est invalide");
	else
	{System.out.println("la valeur " +value+ " que vous venez de saisir est valide");
	}
	possible[x][y] =    (char) value;
}

/**
* Recupere une valeur de la grille
*
* @param x      position x dans la grille
* @param y      position y dans la grille
* @return valeur dans la case x,y
* @throw IllegalArgumentException si x ou y sont hors bornes (0-8)
*/
public char getValue(int x, int y) throws IllegalArgumentException {
	if ((x <0 || x >8) || ( y < 0 || y > 8))
		throw new IllegalArgumentException("Vous essayer de récupérer une valeur dans la grille aux indices (x,y) non compris entre 0 et 8");
	else
		return possible[x][y];
	}

/**
* Signature de la méthode getValue
*
* @param x      position x dans la grille
* @param y      position y dans la grille
* @return valeur dans la case x,y
* @throw IllegalArgumentException si x ou y sont hors bornes (0-8)
*/
protected char getValue(double x, double y) throws IllegalArgumentException {
	if ((x <0 || x >8) || ( y < 0 || y > 8))
		throw new IllegalArgumentException("Vous essayer de récupérer une valeur dans la grille aux indices (x,y) non compris entre 0 et 8");
	else
		return possible[(int)x][(int)y];
	}

/**
* Test si une grille est terminee
*
* @return true si la grille est complete
*/
public boolean complete() {
	if (possible.length*possible.length == 81)
		return true;
	return false;
	}

/**
* Test si une valeur est possible dans la grille par rapport a ce qu'elle
* contient deja
*
* @param x     position x dans la grille
* @param y     position y dans la grille
* @param value
* valeur a mettre dans la case
* @throw IllegalArgumentException si x ou y sont hors bornes (0-8)
* @throw IllegalArgumentException si value n'est pas un caractere autorise
*        ('1',...,'9',..)
*/
public boolean possible(int x, int y, char value) throws IllegalArgumentException {
	char recup =getValue(x, y);
	boolean verif = existe(array, value);
	if (verif)
		throw new IllegalArgumentException("la valeur n'est pas un caractère autorisé");
	return verif;
	}

//désactiver ce commentaire pour afficher la grille
/*for (int i=0; i<possible.length; i++) {
	System.out.print("\t");
	for (int j=0; j<possible.length; j++) {
		System.out.print(possible[i][j] + " ");
		}
	System.out.println();
	}*/

}
