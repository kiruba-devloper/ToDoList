package ControllerModule;

import java.util.ArrayList;

public class Model {
	private ArrayList<String> list = new ArrayList<>();
	
	public ArrayList<String> getList(){
		return list;
	}
	
	public void setList(String li) {
		list.add(li);
	}
	
}
