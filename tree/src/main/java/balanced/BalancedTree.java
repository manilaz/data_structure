package balanced;

/**
 * Created by zhangbin on 2018/12/13.
 */
public class BalancedTree<T extends BaseKeyWord> {

    private int order;//阶数

    private Node<T> rootNode = null;//根节点

    private long count = 0; //节点总数

    /**
     * 创建一个m阶的btree
     * @param order
     */
    public BalancedTree(int order) {
        this.order = order;
    }

    public Node<T> add(T key){

        return null;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Node<T> getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node<T> rootNode) {
        this.rootNode = rootNode;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
