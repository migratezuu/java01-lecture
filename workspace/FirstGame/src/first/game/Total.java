package first.game;

import java.util.ArrayList;
import java.util.List;

public class Total {

	private List<NameConcept> NameList;

	public Total() {
		NameList = new ArrayList<>();
	
	}
	
	public List<NameConcept> getNameList(){
		return NameList;
	}
	
	
	

	@Override
	public String toString() {

		return "플레이 이력" + "\n"+ NameList;
		
	}
}