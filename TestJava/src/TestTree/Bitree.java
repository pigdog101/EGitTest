package TestTree;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Bitree {
private BiTreeNode root;
public int id = 0;
    public Bitree(BiTreeNode root) {
	super();
	this.root = root;
}

    public Bitree() {
	this(null);
}
/**
 * 中序遍历
 * @param root
 */
    public void inRootTraverse(BiTreeNode root) {
	if(root !=null) {
		preRootTraverse(root.lchild);
		System.out.println(root.data);
		preRootTraverse(root.rchild);
	}
}
    /**
     * 先序遍历
     * @param root
     */
    public void preRootTraverse(BiTreeNode root) {
	if(root !=null) {
		System.out.println(root.data);
		preRootTraverse(root.lchild);
		preRootTraverse(root.rchild);
	}
}
    /**
     * 后序遍历
     * @param root
     */
    public void postRootTraverse(BiTreeNode root) {
	if(root !=null) {
		preRootTraverse(root.lchild);
		preRootTraverse(root.rchild);
		System.out.println(root.data);
	}
}
    /**
     * 先序遍历的非递归方法
     * @param root
     */
	public void preRootTraverse1(BiTreeNode root) {
		Stack ls =  new Stack();
		if(root!=null) {
			ls.push(root);
			while(!ls.isEmpty()) {
				BiTreeNode T  = (BiTreeNode)ls.pop();
				System.out.println(T.data);
				while(T!=null) {
					if(T.lchild!=null) {
						System.out.println(T.lchild.data);
					}
					if(T.rchild!=null) {
						ls.push(T.rchild);
					}
					T = T.lchild;
				}
			}
		}
	}
	/**
	 * 遍历二叉树查找二叉树中的某个对象
	 * @param T
	 * @param o
	 * @return
	 */
    public BiTreeNode searchNode(BiTreeNode T,Object o) {
    	if(T!=null) {
    		if(T.data.equals(o)) {
    			return T;
    		}
    		else {
    			BiTreeNode lresult =searchNode(T.lchild,o);
    			return lresult==null? searchNode(T.rchild,o): lresult;
    		}
    	} 
    	return null;
    }
    /**
     * 计算二叉树的结点个数
     * @param T
     * @return
     */
    public int countNode(BiTreeNode T) {
    	int count = 0;
    	if(T!=null) {
    		count++;
    		count +=countNode(T.lchild);
    		id++;
    		count+=countNode(T.rchild);
    	}
    	return count;
    }
    /**
     * 利用队列计算节点数
     * @param T
     * @return
     */
    public int queueCountNode(BiTreeNode T) {
    	Queue<BiTreeNode> q = new ArrayBlockingQueue<BiTreeNode>(10) ;
    	int count = 0;
    	if (T!=null) {
    		q.offer(T);
    	}
        while(!q.isEmpty()) {
        	BiTreeNode t = q.poll();
        	count++;
        	if(t.lchild!=null) {
        		q.offer(t.lchild);
        	}
        	if(t.rchild!=null) {
        		q.offer(t.rchild);
        	}
        }
        return count;
    }
    /**
     * 获取二叉树 的深度
     * @param T
     * @return
     */
    public int getDepth(BiTreeNode T) {
    	if(T!=null) {
    		int lDepth = getDepth(T.lchild);
    		int rDepth = getDepth(T.rchild);
    	return 1 +(lDepth>rDepth? lDepth : rDepth);
    	}
    	return 0;
    }
    /**
     * 判断二叉树是否相等
     * @param T1
     * @param T2
     * @return
     */
    public boolean isEqual(BiTreeNode T1,BiTreeNode T2) {
    	boolean flag=true;
    	if(T1==null&&T2==null) {
    		return true;
    	}
    	else if(T1!=null&&T2!=null) {
    		if(T1.data.equals(T2.data)) {
    			flag = isEqual(T1.lchild,T2.lchild);
    			flag = isEqual(T1.rchild,T2.rchild);
    		}
    		else {
    			return false;
    		}
    		}
    	return flag;
    }
    /**
     * 使用递归模型计算叶子节点数
     * @param T
     * @return
     */
    public int countNode1(BiTreeNode T) {
    	if(T==null) {
    		return 0;
    		
    	}
    	else {
    		return countNode1(T.lchild) + countNode1(T.rchild) + 1;
    	}
    }
}
