/**
 * Created by damian on 02/09/16.
 */
public class Par<A,B> {

    private A first;
    private B second;

    public Par(A i, B i1) {
        this.first=i;
        this.second=i1;
    }

    public A first() {
        return this.first;
    }

    public B second() {
        return this.second;
    }



}
