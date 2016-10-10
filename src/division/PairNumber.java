package division;

class PairNumber {
	private int topNumber;
	private int bottomNumber;
	
	PairNumber(int topNumber, int bottomNumber) {
		this.topNumber = topNumber;
		this.bottomNumber = bottomNumber;
	}
	
	int getTopNumber(){
		return topNumber;
	}
	
	int getBottomNumber(){
		return bottomNumber;
	}
			
	int getSubtraction(){
		return topNumber - bottomNumber;
	}
	
	
}
