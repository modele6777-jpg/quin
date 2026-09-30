package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r40 extends gbe implements l26 {
    int label;
    final /* synthetic */ v40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r40(v40 v40Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = v40Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new r40(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                jzb.q(obj);
                c50 c50Var = this.this$0.a;
                int i2 = c50.b;
                ybc ybcVar = new ybc(new w40(c50Var, "2026", null));
                js3 js3Var = ga4.a;
                wj5 wj5VarX = ym8.x(ybcVar, hr3.c);
                this.label = 1;
                obj = tm7.B(wj5VarX, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            f30 f30Var = (f30) obj;
            this.this$0.b.m(f30Var);
            m8b m8bVarD = this.this$0.d();
            v50 v50Var = f30Var.d;
            if (f30Var.a == null) {
                z = false;
            }
            m8bVarD.e("Annual luck info fetched: status=" + v50Var + ", hasUser=" + z);
            return f30Var;
        } catch (Exception e) {
            ynb.h0(e);
            this.this$0.d().c("Failed to fetch annual luck info", e);
            return null;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((r40) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
