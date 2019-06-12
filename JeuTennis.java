
public class JeuTennis {	

		private int PointsJoueurA = 0;
		private int PointsJoueurB = 0;
		private String joueurA;
		private String joueurB;
		
		public JeuTennis( String joueurA,String joueurB) {
			this.setJoueurA(joueurA);
			this.setJoueurB(joueurB);
		}
		


		private boolean isDeuce() {
			return getPointsJoueurA() >= 3 && getPointsJoueurB() == getPointsJoueurA();
		}
		
		private String gagnant() {
			if (getPointsJoueurA() > getPointsJoueurB()) {
				return getJoueurA();
			} else {
				return getJoueurB();
			}
		}
		
		private boolean hasWinner() {
			if(getPointsJoueurB() >= 4 && getPointsJoueurB() >= getPointsJoueurA() + 2 )
				return true;
			if(getPointsJoueurA() >= 4 && getPointsJoueurA() >= getPointsJoueurB() + 2)
				return true;
			return false;
		}
		
		private boolean hasAdvantage() {
			if (getPointsJoueurB() >= 4 && getPointsJoueurB() == getPointsJoueurA() + 1)
				return true;
			if (getPointsJoueurA() >= 4 && getPointsJoueurA() == getPointsJoueurB() + 1)
				return true;
			
			return false;

		}
		
		
		public String getScore() {

			if (hasWinner()) {
				return gagnant() + " a gagné";
			}
			
			if (hasAdvantage()) { 
				return "Avantage " + gagnant(); 
			}
			
			if (isDeuce())
				return "Deuce";
			
			if(getPointsJoueurA() == getPointsJoueurB()) {
				return String.valueOf(getPointsJoueurA()) + " Par tout";
			}
			
			return String.valueOf(getPointsJoueurA()) + ":" + String.valueOf(getPointsJoueurB());
		}

		public void PointsPourJoueurA() {
			setPointsJoueurA(getPointsJoueurA() + 1);
		}

		public void PointsPourJoueurB() {
			setPointsJoueurB(getPointsJoueurB() + 1);
		}


		public int getPointsJoueurA() {
			return PointsJoueurA;
		}


		public void setPointsJoueurA(int pointsJoueurA) {
			PointsJoueurA = pointsJoueurA;
		}


		public int getPointsJoueurB() {
			return PointsJoueurB;
		}


		public void setPointsJoueurB(int pointsJoueurB) {
			PointsJoueurB = pointsJoueurB;
		}


		public String getJoueurA() {
			return joueurA;
		}


		public void setJoueurA(String joueurA) {
			this.joueurA = joueurA;
		}


		public String getJoueurB() {
			return joueurB;
		}


		public void setJoueurB(String joueurB) {
			this.joueurB = joueurB;
		}

			
}
	
	
	

