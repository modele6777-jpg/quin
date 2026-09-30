package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gw1 extends cw1 {
    public final wj5 d;

    public gw1(int i, i41 i41Var, pv2 pv2Var, wj5 wj5Var) {
        super(pv2Var, i, i41Var);
        this.d = wj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[RETURN] */
    @Override // defpackage.cw1, defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        Object objB;
        int i = this.b;
        bw2 bw2Var = bw2.a;
        if (i == -3) {
            pv2 context = xn2Var.getContext();
            Boolean bool = Boolean.FALSE;
            he2 he2Var = new he2(29);
            pv2 pv2Var = this.a;
            pv2 pv2VarP0 = !((Boolean) pv2Var.V0(he2Var, bool)).booleanValue() ? context.p0(pv2Var) : y7h.v(context, pv2Var, false);
            if (pa7.t(pv2VarP0, context)) {
                Object objL = l(xj5Var, xn2Var);
                if (objL == bw2Var) {
                    return objL;
                }
            } else {
                hj6 hj6Var = hj6.Z;
                if (pa7.t(pv2VarP0.F0(hj6Var), context.F0(hj6Var))) {
                    pv2 context2 = xn2Var.getContext();
                    if (!(xj5Var instanceof byc) && !(xj5Var instanceof rg9)) {
                        xj5Var = new gz(xj5Var, context2);
                    }
                    Object objN = z5c.N(pv2VarP0, xj5Var, dwe.b(pv2VarP0), new fw1(this, null), xn2Var);
                    if (objN == bw2Var) {
                        return objN;
                    }
                } else {
                    objB = super.b(xj5Var, xn2Var);
                    if (objB == bw2Var) {
                        return objB;
                    }
                }
            }
        } else {
            objB = super.b(xj5Var, xn2Var);
            if (objB == bw2Var) {
                return objB;
            }
        }
        return wef.a;
    }

    @Override // defpackage.cw1
    public final Object f(awa awaVar, xn2 xn2Var) {
        Object objL = l(new byc(awaVar), xn2Var);
        return objL == bw2.a ? objL : wef.a;
    }

    public abstract Object l(xj5 xj5Var, xn2 xn2Var);

    @Override // defpackage.cw1
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
