package genericAssignment;

public class Pair<K, V> {

	private K key;
	private V value;
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pair<String, String> p1=new Pair<String, String>("1", "one");
System.out.println(p1.getKey()+" "+p1.getValue());

 Pair<String, java.util.Date> p2=new Pair<String, java.util.Date>("2", new java.util.Date());
 System.out.println(p2.getKey()+" "+p2.getValue());
	}

}
