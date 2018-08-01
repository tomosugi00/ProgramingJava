package ex1_15;

import java.util.HashMap;

public class ExtendedTable implements Lookup {

	HashMap<String,Object> table = new HashMap<String,Object>();
	
	@Override
	public Object find(String name) {
		return this.table.get(name);
	}

	@Override
	public void add(String name, Object value) {
		this.table.put(name,value);
	}

	@Override
	public void remove(String name) {
		this.table.remove(name);
	}

}
