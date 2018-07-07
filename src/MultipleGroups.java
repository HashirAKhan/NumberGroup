import java.util.*;

public class MultipleGroups implements NumberGroup {
	private List<NumberGroup> groupList;

	public MultipleGroups(List<NumberGroup> list){
		groupList = list;
	}

	public boolean contains(int number){
		for (NumberGroup group : groupList){
			if (group.contains(number)){
				return true;
			}
		}

		return false;
	}
}
