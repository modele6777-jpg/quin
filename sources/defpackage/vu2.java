package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vu2 extends gbe implements l26 {
    final /* synthetic */ k31 $bringIntoViewRequester;
    final /* synthetic */ cre $manager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu2(cre creVar, k31 k31Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$manager = creVar;
        this.$bringIntoViewRequester = k31Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vu2(this.$manager, this.$bringIntoViewRequester, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            cre creVar = this.$manager;
            sl9 sl9Var = creVar.b;
            long j = creVar.l().b;
            int i2 = eue.c;
            int iV = sl9Var.v((int) (j >> 32));
            r38 r38Var = creVar.d;
            tte tteVarD = r38Var != null ? r38Var.d() : null;
            tteVarD.getClass();
            ste steVar = tteVarD.a;
            hkb hkbVarC = steVar.c(mh3.o(iV, 0, steVar.a.a.b.length()));
            k31 k31Var = this.$bringIntoViewRequester;
            this.label = 1;
            Object objA = ((n31) k31Var).a(hkbVarC, this);
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
        return ((vu2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
