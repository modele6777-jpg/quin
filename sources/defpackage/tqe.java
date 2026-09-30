package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tqe extends gbe implements l26 {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ cre this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqe(cre creVar, boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = creVar;
        this.$cancelSelection = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tqe(this.this$0, this.$cancelSelection, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        c52 c52Var;
        int i = this.label;
        k00 k00VarJ = null;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        cre creVar = this.this$0;
        boolean z = this.$cancelSelection;
        if (!eue.d(creVar.l().b)) {
            k00VarJ = arb.j(creVar.l());
            if (z) {
                int iF = eue.f(creVar.l().b);
                creVar.c.d(cre.b(creVar.l().a, u3c.b(iF, iF)));
                creVar.r(ug6.a);
            }
        }
        if (k00VarJ != null && (c52Var = this.this$0.g) != null) {
            a52 a52VarH0 = pa7.h0(k00VarJ);
            this.label = 1;
            Object objA = c52Var.a(a52VarH0, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tqe) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
