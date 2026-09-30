package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zne extends gbe implements l26 {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ eoe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zne(eoe eoeVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = eoeVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        zne zneVar = new zne(this.this$0, xn2Var);
        zneVar.I$0 = ((Number) obj).intValue();
        return zneVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        g13 g13Var;
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            if (Math.abs(this.I$0) == 1 && (g13Var = this.this$0.Q0) != null) {
                this.label = 1;
                Object objO = jgb.O(new f13(g13Var, null), this);
                bw2 bw2Var = bw2.a;
                if (objO != bw2Var) {
                    objO = wefVar;
                }
                if (objO == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zne) k((xn2) obj2, Integer.valueOf(((Number) obj).intValue()))).r(wef.a);
    }
}
