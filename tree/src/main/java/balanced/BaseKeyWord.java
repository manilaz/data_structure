package balanced;

/**
 * Created by zhangbin on 2018/12/13.
 */
public abstract class BaseKeyWord implements Comparable<BaseKeyWord> {
    protected abstract int getCode();

    public int compareTo(BaseKeyWord o) {
        if(this.getCode()>o.getCode()) return 1;
        return 0;
    }
}
