package TestSort;

public class DeBug {
	public static void main(String[] args) {
KeyType kt = new KeyType(0);
KeyType kt1 = new KeyType(1);
RecordNode rn = new RecordNode(kt);
RecordNode rn1 = new RecordNode(kt1) ;

System.out.println(rn1.key.compareTo(rn.key));
	}


}
