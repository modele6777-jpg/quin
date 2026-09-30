package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xc3 extends gbe implements l26 {
    final /* synthetic */ od3 $this_runCatching;
    final /* synthetic */ mt8 $update;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc3(od3 od3Var, mt8 mt8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_runCatching = od3Var;
        this.$update = mt8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xc3(this.$this_runCatching, this.$update, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            i0e i0eVarF = this.$this_runCatching.h.F();
            if (i0eVarF instanceof cb3) {
                od3 od3Var = this.$this_runCatching;
                mt8 mt8Var = this.$update;
                l26 l26Var = mt8Var.a;
                pv2 pv2Var = mt8Var.d;
                this.label = 1;
                Object objC = od3Var.c().c(new jd3(od3Var, pv2Var, l26Var, null), this);
                if (objC != bw2Var) {
                    return objC;
                }
            } else {
                if (!(i0eVarF instanceof odb) && !(i0eVarF instanceof zaf)) {
                    if (i0eVarF instanceof we5) {
                        throw ((we5) i0eVarF).b;
                    }
                    if (i0eVarF instanceof qf9) {
                        qc0.p("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    ap.c();
                    return null;
                }
                if (i0eVarF != this.$update.c) {
                    throw ((odb) i0eVarF).b;
                }
                od3 od3Var2 = this.$this_runCatching;
                this.label = 2;
                if (od3Var2.f(this) != bw2Var) {
                }
            }
        }
        if (i == 1) {
            jzb.q(obj);
            return obj;
        }
        if (i != 2) {
            if (i == 3) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        od3 od3Var3 = this.$this_runCatching;
        mt8 mt8Var2 = this.$update;
        l26 l26Var2 = mt8Var2.a;
        pv2 pv2Var2 = mt8Var2.d;
        this.label = 3;
        Object objC2 = od3Var3.c().c(new jd3(od3Var3, pv2Var2, l26Var2, null), this);
        return objC2 == bw2Var ? bw2Var : objC2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xc3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
