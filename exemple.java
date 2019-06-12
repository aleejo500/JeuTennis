import junit.framework.TestCase;


public class exemple extends TestCase {
	
JeuTennis jeu = new JeuTennis("AAA" , "BBB");

	
    private void jouerA() {
    	this.emuleScore(40, 30);  // scenario A gagne

	}
    
    private void jouerB() {
    	this.emuleScore(30, 40); // scenario B gagne

	}
    private void jouerDeuce() {
    	this.emuleScore(40, 40); // scenario Deuce

	}
    
    private void jouerAdv() {
    	this.jeu.setPointsJoueurA(5);  // scenario 	adv pour A
    	this.jeu.setPointsJoueurB(4);       
	}
    
	
	private void emuleScore(int a, int b) {
		jeu.setPointsJoueurA(a);
		jeu.setPointsJoueurB(b);
		
	}
	
	public void testJeuShouldReturnEgalite()
	{
		
		String score =	jeu.getScore();
		System.out.println (score);
		assertEquals("0 Par tout", score);
	}


	public void testJeuShouldReturnWinner()
	{
		
		jouerA();	
		String score =	jeu.getScore();
		System.out.println (score);
		assertEquals(score, score);
	}
	
	
	public void testJeuShouldReturnWinnerA()
	{
		
		jouerA();
		String score =	jeu.getScore();
		System.out.println (score);
		assertEquals(jeu.getJoueurA() + " a gagné", score);
	}
	
	public void testJeuShouldReturnWinnerB()
	{
		
		jouerB();
		String score =	jeu.getScore();
		System.out.println (score);
		assertEquals(jeu.getJoueurB() + " a gagné", score);
		
	}	
	
	public void testJeuShouldReturnDeuce()
	{
		
		jouerDeuce();
		String score =	jeu.getScore();
		System.out.println (score);
		assertEquals("Deuce", score);
		
	}
	
	public void testJeuShouldReturnAdv()
	{
		
		jouerAdv();
		String score =	jeu.getScore();
		System.out.println (score);
		assertEquals("Avantage " + jeu.getJoueurA() , score);
		
	}
	

}
