package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zb1 implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc1 b;

    public /* synthetic */ zb1(gc1 gc1Var, int i) {
        this.a = i;
        this.b = gc1Var;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        gc1 gc1Var = this.b;
        switch (i) {
            case 0:
                vj1 vj1Var = (vj1) obj;
                if (vj1Var instanceof rj1) {
                    if (((rj1) vj1Var).a.equals(gc1Var.d.a)) {
                        gc1Var.d(vj1Var);
                        return wefVar;
                    }
                    qc0.p("Check failed.");
                } else {
                    if (!(vj1Var instanceof tj1)) {
                        return wefVar;
                    }
                    if (pa7.t(((tj1) vj1Var).a, gc1Var.d.a)) {
                        gc1Var.d(vj1Var);
                        return wefVar;
                    }
                    qc0.p("Check failed.");
                }
                return null;
            default:
                gc1Var.d(sj1.a);
                return wefVar;
        }
    }
}
