package TestTree;

public class BiTreeNode {
public Object data;
public BiTreeNode lchild;
public BiTreeNode rchild;
public BiTreeNode(Object data, BiTreeNode lchild, BiTreeNode rchild) {
	super();
	this.data = data;
	this.lchild = lchild;
	this.rchild = rchild;
}
public BiTreeNode(Object data) {
	super();
	this.data = data;
	this.lchild = null;
	this.rchild = null;
}
public BiTreeNode() {
	this(null,null,null);//this(null); 
}

}
