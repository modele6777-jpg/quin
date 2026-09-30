package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ubc extends zn2 implements xj5 {
    public final pv2 collectContext;
    public final int collectContextSize;
    public final xj5 collector;
    private xn2<? super wef> completion_;
    private pv2 lastEmissionContext;

    public ubc(xj5 xj5Var, pv2 pv2Var) {
        super(db2.c, nu4.a);
        this.collector = xj5Var;
        this.collectContext = pv2Var;
        this.collectContextSize = ((Number) pv2Var.V0(new tbc(0), 0)).intValue();
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        try {
            Object objX = x(xn2Var, obj);
            return objX == bw2.a ? objX : wef.a;
        } catch (Throwable th) {
            this.lastEmissionContext = new xi4(xn2Var.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.pt0, defpackage.cw2
    public final cw2 e() {
        xn2<? super wef> xn2Var = this.completion_;
        if (xn2Var instanceof cw2) {
            return (cw2) xn2Var;
        }
        return null;
    }

    @Override // defpackage.zn2, defpackage.xn2
    public final pv2 getContext() {
        pv2 pv2Var = this.lastEmissionContext;
        return pv2Var == null ? nu4.a : pv2Var;
    }

    @Override // defpackage.pt0
    public final StackTraceElement o() {
        return null;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Throwable thA = ezb.a(obj);
        if (thA != null) {
            this.lastEmissionContext = new xi4(getContext(), thA);
        }
        xn2<? super wef> xn2Var = this.completion_;
        if (xn2Var != null) {
            xn2Var.g(obj);
        }
        return bw2.a;
    }

    public final Object x(xn2 xn2Var, Object obj) {
        pv2 context = xn2Var.getContext();
        tq.v(context);
        pv2 pv2Var = this.lastEmissionContext;
        if (pv2Var != context) {
            if (pv2Var instanceof xi4) {
                throw new IllegalStateException(w4e.p("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((xi4) pv2Var).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.V0(new wf8(18, this), 0)).intValue() != this.collectContextSize) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.collectContext + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.lastEmissionContext = context;
        }
        this.completion_ = xn2Var;
        n26 n26Var = wbc.a;
        xj5 xj5Var = this.collector;
        xj5Var.getClass();
        Object objM = n26Var.m(xj5Var, obj, this);
        if (!pa7.t(objM, bw2.a)) {
            this.completion_ = null;
        }
        return objM;
    }
}
