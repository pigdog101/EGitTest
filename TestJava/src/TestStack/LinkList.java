package TestStack;

import java.util.Stack;

public class LinkList {
    public Node head;
    public int length;
	public LinkList() {
		super();
		length = 0;
		head = new Node();
	}
	public static void main(String[] args) throws Exception {
    LinkList ll = new LinkList();
    ll.insert(0, 1);
    ll.insert(1, 2); 
    ll.insert(2, 3);
    ll.remove(1);
    
    System.out.println(ll.get(1));
    
	}
	public Integer length() {
		return this.length;
	}
    public void insert(int i, Object o) throws Exception {
    	Node p = head;
    	int j = -1;
    	while(p!=null&&j<i-1) {
    		p = p.next;
    		++j;
    	}
    	if(p==null||j>i-1) {
    		throw new Exception("插入位置不对"); 
    	}
    	Node s = new Node(o);
    	s.next = p.next;
    	p.next = s;
    	this.length++;
    }
    public Object get(int i) throws Exception {
    	Node top = head.next;
    	if(i>length) {
    		throw new Exception("查找的位置超出范围");
    	}
        for(int j=0;j<i;j++) {
        	top = top.next;
        }
		return top.data;
    }
    public int indexOf(Object o) {
    	Node top = head.next;
    	int j = 0;
    	while(top!=null&&!top.data.equals(o))
    	{
    		j++;
    		top = top.next;
    	}
    	if(top!=null)
    	{
    		return j;
    	}
    	else {
    		return -1;
    	}
    }
    public void remove(int i) throws Exception {
    	Node top = head;
    	int j = -1;
    	while(top.next!=null&&j<i-1) {
    		top = top.next;
    		j++;
    	}
    	if(top.next==null||j>i+1) {
    		throw new Exception("删除位置不合法");
    	}
    	top.next = top.next.next;
    }
}
