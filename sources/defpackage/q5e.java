package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q5e extends gbe implements l26 {
    int label;
    final /* synthetic */ t5e this$0;
    final /* synthetic */ r5e this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5e(t5e t5eVar, r5e r5eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = t5eVar;
        this.this$1 = r5eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new q5e(this.this$0, this.this$1, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        q5e q5eVar;
        Throwable th;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                jzb.q(obj);
                q5eVar = this;
                q5eVar.this$0.a();
                return wef.a;
            } catch (Throwable th2) {
                th = th2;
                q5eVar = this;
                q5eVar.this$0.a();
                throw th;
            }
        }
        jzb.q(obj);
        Object obj2 = this.this$0.a;
        r5e r5eVar = this.this$1;
        synchronized (obj2) {
            if (r5eVar.c == s5e.e) {
                r5eVar.c = s5e.b;
            }
        }
        try {
            try {
                float fFloatValue = ((Number) xo1.g.b.d(this.this$1.b.c.c)).floatValue();
                this.this$1.b = qk2.d(0.0f);
                jx jxVar = this.this$1.b;
                Float f = new Float(1.0f);
                vz vzVar = this.this$1.a;
                Float f2 = new Float(fFloatValue);
                this.label = 1;
                q5eVar = this;
                try {
                    obj = jx.b(jxVar, f, vzVar, f2, null, q5eVar, 8);
                    if (obj == bw2Var) {
                        return bw2Var;
                    }
                    q5eVar.this$0.a();
                    return wef.a;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    q5eVar.this$0.a();
                    throw th;
                }
            } catch (Throwable th4) {
                q5eVar = this;
                th = th4;
                q5eVar.this$0.a();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            q5eVar = this;
            th = th;
            q5eVar.this$0.a();
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((q5e) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
