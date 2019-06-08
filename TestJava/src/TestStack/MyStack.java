package TestStack;

public class MyStack implements IStack{
	private int top;
	private Object[] stackElem;
    public MyStack( int length) {
    	stackElem = new Object[length];
	}
    @Override
    public void clear() {
    	top=0;
    }
    @Override
    public boolean isEmpty() { 
    	return top==0;
    }
    @Override
    public int length() {
    	return top;
    }
    @Override
    public Object peek() {
    	return stackElem[top-1];
    }
    @Override
    public Object pop() {
    	if(top<1) {
    	return null;
    	}
    	else {
    	return stackElem[--top];
    	}
    }
    @Override
    public void push(Object x) throws Exception {
    	if(top==stackElem.length) {
    		throw new Exception("栈已满");
    	}
    	else {
    		stackElem[top++] = x;
    	}
    }
	public static void main(String[] args) throws Exception {
     MyStack ms = new MyStack(10);
     ms.push(1);
     ms.push(2);
	}
   
}
