package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dvc extends gbe implements l26 {
    final /* synthetic */ c52 $clipboard;
    final /* synthetic */ k00 $textToCopy;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvc(c52 c52Var, k00 k00Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$clipboard = c52Var;
        this.$textToCopy = k00Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dvc(this.$clipboard, this.$textToCopy, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            c52 c52Var = this.$clipboard;
            a52 a52VarH0 = pa7.h0(this.$textToCopy);
            this.label = 1;
            Object objA = c52Var.a(a52VarH0, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dvc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
