package first.game;

public class NameConcept {

	private String record;

	public NameConcept(int nameNum) {

		
		switch(nameNum) {
		case 1 : 
			record = "경복궁";
			
			break;
		case 2:
			record = "수영장";
			break;
		case 3:
			record = "스키장";
			break;
		case 4:
			record = "놀이공원";
			break;
		case 5:
			record = "레이싱장";
			break;
		}
	}

	@Override
	public String toString() {
		return record; 
	}
	
	
	
}
