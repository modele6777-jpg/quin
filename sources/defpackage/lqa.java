package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lqa extends gbe implements l26 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ pqa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqa(pqa pqaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = pqaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new lqa(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        pqa pqaVar;
        d99 d99Var;
        h86 h86Var;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            jzb.q(obj);
            pqa pqaVar2 = this.this$0;
            f99 f99Var = pqaVar2.b;
            this.L$0 = f99Var;
            this.L$1 = pqaVar2;
            this.label = 1;
            if (f99Var.b(this) == bw2Var) {
                return bw2Var;
            }
            pqaVar = pqaVar2;
            d99Var = f99Var;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pqaVar = (pqa) this.L$1;
            d99Var = (d99) this.L$0;
            jzb.q(obj);
        }
        try {
            synchronized (pqaVar.a) {
                hs3 hs3Var = xqa.z0;
                boolean zBooleanValue = ((Boolean) z5c.I(nu4.a, new kqa(hs3Var.a, hs3Var.b, null))).booleanValue();
                boolean z2 = pqaVar.d;
                if (!zBooleanValue && !z2) {
                    z = false;
                }
                h86Var = new h86(zBooleanValue, z2, z);
            }
            d99Var.h(null);
            return h86Var;
        } catch (Throwable th) {
            d99Var.h(null);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lqa) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
