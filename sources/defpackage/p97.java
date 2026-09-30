package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p97 extends gbe implements l26 {
    final /* synthetic */ m97 $record;
    int label;
    final /* synthetic */ u97 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p97(u97 u97Var, m97 m97Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = u97Var;
        this.$record = m97Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new p97(this.this$0, this.$record, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            s7 s7Var = this.this$0.d;
            wj5 wj5VarB = s7.b();
            o97 o97Var = o97.a;
            this.label = 1;
            obj = tm7.E(wj5VarB, o97Var, this);
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
        String str = (String) obj;
        if (str == null) {
            return wef.a;
        }
        u97 u97Var = this.this$0;
        Object obj2 = u97Var.f;
        m97 m97Var = this.$record;
        synchronized (obj2) {
            if (v4e.Q(m97Var.a.a) && u97Var.g.get(m97Var.a) == m97Var) {
                l97 l97Var = new l97(str, m97Var.a.b);
                if (u97Var.g.get(l97Var) == null) {
                    u97Var.g.remove(m97Var.a);
                    m97Var.a = l97Var;
                    u97Var.g.put(l97Var, m97Var);
                }
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((p97) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
