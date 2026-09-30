package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nt0 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ot0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt0(ot0 ot0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ot0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        nt0 nt0Var = new nt0(this.this$0, xn2Var);
        nt0Var.L$0 = obj;
        return nt0Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            awa awaVar = (awa) this.L$0;
            ot0 ot0Var = this.this$0;
            mt0 mt0Var = new mt0(ot0Var, awaVar);
            gl2 gl2Var = ot0Var.a;
            synchronized (gl2Var.c) {
                try {
                    if (gl2Var.d.add(mt0Var)) {
                        if (gl2Var.d.size() == 1) {
                            gl2Var.e = gl2Var.a();
                            ff8.h().e(hl2.a, gl2Var.getClass().getSimpleName() + ": initial state = " + gl2Var.e);
                            gl2Var.c();
                        }
                        mt0Var.a(gl2Var.e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            v6 v6Var = new v6(18, this.this$0, mt0Var);
            this.label = 1;
            if (i7h.k(awaVar, v6Var, this) == bw2Var) {
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
        return ((nt0) k((xn2) obj2, (awa) obj)).r(wef.a);
    }
}
