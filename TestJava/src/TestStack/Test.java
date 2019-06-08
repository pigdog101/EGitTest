package TestStack;

public class Test {

	public static void main(String[] args) throws Exception {
    MyStack ms = new MyStack(10);
    ms.push(1);
    ms.push(2);
    ms.push(3);
    System.out.println(ms.length());
	}

}
