/**
 *
 * @author Rafik
 */
/**
* Interface d'une grille de sudoku
*/
public interface Grille {
/**
* Caractere de case vide
*/
static final char EMPTY = '@';
//static final char[][] possible = new char[9][9] ;
/**
* Caractere possible a mettre dans la grille
*
* pour une grille 9x9 : 1..9
*
* pour une grille 16x16: 0..9-a..f
*/
static final char[][] possible = new char[][]
                                            {{'1', '2','3', '4', '5', '6', '7', '8','9'},
                                            {'1', '2','3', '4', '5', '6', '7', '8','9'},
                                            {'1', '2','3', '4', '5', '6', '7', '8','9'},
                                            {'1', '2','3', '4', '5', '6', '7', '8','9'},
											{'1', '2','3', '4', '5', '6', '7', '8','9'},
											{'1', '2','3', '4', '5', '6', '7', '8','9'},
											{'1', '2','3', '4', '5', '6', '7', '8','9'},
											{'1', '2','3', '4', '5', '6', '7', '8','9'},
											{'1', '2','3', '4', '5', '6', '7', '8','9'}};




public int getDimension();

public void setValue(int x, int y, char value) throws IllegalArgumentException;

public char getValue(int x, int y) throws IllegalArgumentException;

public boolean complete();

public boolean possible(int x, int y, char value) throws IllegalArgumentException;
}
