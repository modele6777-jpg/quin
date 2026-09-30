package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pse extends gbe implements a26 {
    final /* synthetic */ jse $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pse(jse jseVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.$this_with = jseVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new pse(this.$this_with, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            jse jseVar = this.$this_with;
            this.label = 1;
            Object objS = jseVar.s(false, this);
            bw2 bw2Var = bw2.a;
            if (objS == bw2Var) {
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
}
