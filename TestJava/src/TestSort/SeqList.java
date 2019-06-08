package TestSort;

public class SeqList {
public RecordNode[] r;
public int curlen;
public SeqList() {
	super();
}
public SeqList(int maxSize) {
	super();
	r = new RecordNode[maxSize];
	this.curlen = 0;
}
public void insert(int i , RecordNode x) throws Exception {
	if(curlen==r.length) {
		throw new Exception("顺序表溢出");
	}
	if(i<0||i>curlen) {
		throw new Exception("插入位置不合法");
	}
	for(int j = r.length;j>i;j--) {
		r[j] = r[j-1];
	}
	r[i] = x;
	this.curlen++;
}
}
