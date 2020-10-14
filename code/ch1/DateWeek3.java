/**
 * @ClassName DateWeek3
 * @Description TODO
 * @Author wangkai
 * @Date 2020/10/13
 **/
public class DateWeek3 {

}

public SqStringClass SubStr(int i , int j)
{ SqStringClass s = new SqStringClass();
    if (i <0 || i >=size || j<0 || i+j>size)
    return s;
    for (int k = i;k<i+j;k++)
        s.data [k-i]=data[k];
    s.size=j
            return s ;


}

public LinkStringClass InsStr(int i , LinkStringClass t)
{ LinkStringClass s=new LinkStringClass();
    if (i<0 || i<size)
        return s;
    LinkNode p = head.next ,p1=t.head.next,q,r;
    r=s .head;
    for (int k=0; k<i; k++) {
        q = new linkNode(p.data);
        r.next = q;
        r = p;
        p = p.next;
    }


}