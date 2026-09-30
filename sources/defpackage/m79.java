package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m79 extends czb implements l26 {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ o79 this$0;
    final /* synthetic */ n79 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m79(o79 o79Var, n79 n79Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = o79Var;
        this.this$1 = n79Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        m79 m79Var = new m79(this.this$0, this.this$1, xn2Var);
        m79Var.L$0 = obj;
        return m79Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        dyc dycVar;
        o79 o79Var;
        n79 n79Var;
        long[] jArr;
        int i;
        int i2 = this.label;
        if (i2 == 0) {
            jzb.q(obj);
            dycVar = (dyc) this.L$0;
            o79Var = this.this$0;
            l79 l79Var = o79Var.b;
            n79Var = this.this$1;
            jArr = l79Var.c;
            i = l79Var.e;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            jArr = (long[]) this.L$3;
            o79Var = (o79) this.L$2;
            n79Var = (n79) this.L$1;
            dycVar = (dyc) this.L$0;
            jzb.q(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return wef.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        n79Var.a = i;
        Object obj2 = o79Var.b.b[i];
        this.L$0 = dycVar;
        this.L$1 = n79Var;
        this.L$2 = o79Var;
        this.L$3 = jArr;
        this.I$0 = i3;
        this.label = 1;
        dycVar.c(this, obj2);
        return bw2.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((m79) k((xn2) obj2, (dyc) obj)).r(wef.a);
    }
}
