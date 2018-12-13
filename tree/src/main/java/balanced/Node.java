package balanced;

import java.util.HashSet;

/**
 * Created by zhangbin on 2018/12/13.
 */
public class Node<T extends BaseKeyWord> {

    private int layer;//当前节点所在层数，根节点为0依次递增

    private int type;//节点类型0-根结点，1-子节点（非叶子节点），2叶子节点

    private String address;//节点地址

    private String p_address;//父节点地址

    private T[] keys;//关键字列表

    private Node[] childNodes;//子节点列表


}
