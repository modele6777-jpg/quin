package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ap3 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ bp3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap3(bp3 bp3Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = bp3Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ap3 ap3Var = new ap3(this.this$0, xn2Var);
        ap3Var.L$0 = obj;
        return ap3Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object value;
        xha xhaVar;
        long jK;
        long jD;
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        if (i != 0 && i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        while (jgb.Y(aw2Var)) {
            bp3 bp3Var = this.this$0;
            y45 y45Var = bp3Var.b;
            if (y45Var != null) {
                s0e s0eVar = bp3Var.X;
                if (((xha) s0eVar.getValue()).a || ((xha) s0eVar.getValue()).b) {
                    long jP = y45Var.p();
                    do {
                        value = s0eVar.getValue();
                        xhaVar = (xha) value;
                        jK = y45Var.k();
                        if (jK < 0) {
                            jK = 0;
                        }
                        jD = y45Var.d();
                        if (jD < 0) {
                            jD = 0;
                        }
                    } while (!s0eVar.l(value, xha.a(xhaVar, false, false, jK, jD, jP == -9223372036854775807L ? xhaVar.e : jP, null, 35)));
                }
            }
            this.L$0 = aw2Var;
            this.label = 1;
            Object objQ = vfh.q(200L, this);
            bw2 bw2Var = bw2.a;
            if (objQ == bw2Var) {
                return bw2Var;
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ap3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
