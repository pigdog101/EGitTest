package TestTree;

public class DeBug {
    public static Bitree bt;
    static {
    	bt = new Bitree();
    	
    }
	public static void main(String[] args) {
    BiTreeNode d = new BiTreeNode('D',null,null);
    BiTreeNode f = new BiTreeNode('F',null,null);
    BiTreeNode b = new BiTreeNode('B',d,null);
    BiTreeNode c = new BiTreeNode('C',f,null);
    BiTreeNode root = new BiTreeNode('A',b,c);
   // bt.preRootTraverse(root);
   // bt.preRootTraverse1(root);
    BiTreeNode btn =bt.searchNode(root, 'C'); 
//    System.out.println(btn.data);
//    System.out.println(bt.countNode(root));
//    System.out.println(bt.id);
//    System.out.println(bt.queueCountNode(root));
   // BiTreeNode root1 = new BiTreeNode('b',b,c);
    //System.out.println(bt.isEqual(root, root1));
	}

}
