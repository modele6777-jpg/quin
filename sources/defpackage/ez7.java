package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ez7 extends gbe implements l26 {
    final /* synthetic */ ke6 $layer;
    final /* synthetic */ ze5 $spec;
    int label;
    final /* synthetic */ kz7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez7(kz7 kz7Var, ze5 ze5Var, ke6 ke6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = kz7Var;
        this.$spec = ze5Var;
        this.$layer = ke6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ez7(this.this$0, this.$spec, this.$layer, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        ez7 ez7Var;
        Throwable th;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            try {
                jx jxVar = this.this$0.q;
                try {
                    Float f = new Float(0.0f);
                    ze5 ze5Var = this.$spec;
                    cz7 cz7Var = new cz7(this.$layer, this.this$0, 1);
                    this.label = 1;
                    ez7Var = this;
                    try {
                        Object objB = jx.b(jxVar, f, ze5Var, null, cz7Var, ez7Var, 4);
                        bw2 bw2Var = bw2.a;
                        if (objB == bw2Var) {
                            return bw2Var;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        ez7Var.this$0.j.setValue(Boolean.FALSE);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ez7Var = this;
                    th = th;
                    ez7Var.this$0.j.setValue(Boolean.FALSE);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                ez7Var = this;
                th = th;
                ez7Var.this$0.j.setValue(Boolean.FALSE);
                throw th;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                jzb.q(obj);
                ez7Var = this;
            } catch (Throwable th5) {
                th = th5;
                ez7Var = this;
                ez7Var.this$0.j.setValue(Boolean.FALSE);
                throw th;
            }
        }
        try {
            try {
                ez7Var.this$0.k.setValue(Boolean.TRUE);
                ez7Var.this$0.j.setValue(Boolean.FALSE);
                return wef.a;
            } catch (Throwable th6) {
                th = th6;
                th = th;
                ez7Var.this$0.j.setValue(Boolean.FALSE);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ez7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
