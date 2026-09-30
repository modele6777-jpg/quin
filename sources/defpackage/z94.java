package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z94 extends ca4 implements cw2, xn2 {
    public static final /* synthetic */ long v = ud0.a.objectFieldOffset(z94.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final sv2 d;
    public final zn2 e;
    public Object f;
    public final Object g;

    public z94(sv2 sv2Var, zn2 zn2Var) {
        super(-1);
        this.d = sv2Var;
        this.e = zn2Var;
        this.f = aa4.a;
        this.g = dwe.b(zn2Var.getContext());
    }

    @Override // defpackage.cw2
    public final cw2 e() {
        return this.e;
    }

    @Override // defpackage.xn2
    public final void g(Object obj) {
        Throwable thA = ezb.a(obj);
        Object eb2Var = thA == null ? obj : new eb2(thA, false);
        zn2 zn2Var = this.e;
        pv2 context = zn2Var.getContext();
        sv2 sv2Var = this.d;
        if (aa4.c(sv2Var, context)) {
            this.f = eb2Var;
            this.c = 0;
            aa4.b(sv2Var, zn2Var.getContext(), this);
            return;
        }
        vz4 vz4VarA = gwe.a();
        if (vz4VarA.c >= 4294967296L) {
            this.f = eb2Var;
            this.c = 0;
            vz4VarA.e1(this);
            return;
        }
        vz4VarA.f1(true);
        try {
            pv2 context2 = zn2Var.getContext();
            Object objC = dwe.c(context2, this.g);
            try {
                zn2Var.g(obj);
                dwe.a(context2, objC);
                while (vz4VarA.h1()) {
                }
            } catch (Throwable th) {
                dwe.a(context2, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                h(th2);
            } finally {
                vz4VarA.d1(true);
            }
        }
    }

    @Override // defpackage.xn2
    public final pv2 getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.ca4
    public final Object i() {
        Object obj = this.f;
        this.f = aa4.a;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + mh3.Z(this.e) + ']';
    }

    @Override // defpackage.ca4
    public final xn2 c() {
        return this;
    }
}
