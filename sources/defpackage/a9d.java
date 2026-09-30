package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a9d extends czb implements l26 {
    final /* synthetic */ rf0 $this_children;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9d(rf0 rf0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_children = rf0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        a9d a9dVar = new a9d(this.$this_children, xn2Var);
        a9dVar.L$0 = obj;
        return a9dVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        rf0 rf0Var;
        dyc dycVar = (dyc) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            rf0Var = this.$this_children.b.b;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rf0 rf0Var2 = (rf0) this.L$1;
            jzb.q(obj);
            rf0Var = rf0Var2.b.e;
        }
        if (rf0Var == null) {
            return wef.a;
        }
        this.L$0 = dycVar;
        this.L$1 = rf0Var;
        this.label = 1;
        dycVar.c(this, rf0Var);
        return bw2.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((a9d) k((xn2) obj2, (dyc) obj)).r(wef.a);
    }
}
