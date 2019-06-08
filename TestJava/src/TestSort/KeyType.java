package TestSort;

public class KeyType implements Comparable<KeyType>{
    public int key;
    
	public KeyType() {
		super();
	}

	public KeyType(int key) {
		super();
		this.key = key;
	}
    public String toString() {
		return key + "";
    	
    }
	@Override 
	public int compareTo(KeyType arg0) {
		return this.key>arg0.key? 1:(this.key==arg0.key?0:-1);
	}

}
