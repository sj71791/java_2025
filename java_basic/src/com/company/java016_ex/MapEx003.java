package com.company.java016_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

class Fruit{
	private int no;
    private String name;
	public Fruit() { super(); }
	public Fruit(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + "]";
	}
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	/*@Override public int hashCode() { return Objects.hash(name, no); }
	//1.hashcode(객체확인) 2.equals값비교
	
	@Override 
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name) && no == other.no;
	}   */
	
}
public class MapEx003 {
	public static void main(String[] args) {
		Map< Fruit, Integer > map = new HashMap<>();
		
			
	    map.put( new Fruit(1, "Apple")  , 1);
	    map.put( new Fruit(1, "Apple")  , 1);
	    map.put( new Fruit(2, "Banana") , 2);
		 
	    Iterator<Fruit> iter=map.keySet().iterator();
	    while(iter.hasNext()) {
	    	Fruit f=iter.next();
	    	System.out.println(f+"\t"+map.get(f));
	    }
	    System.out.println("Total : " + map.size());
	}
}
