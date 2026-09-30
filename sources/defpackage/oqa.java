package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oqa extends gbe implements l26 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ pqa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqa(pqa pqaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = pqaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new oqa(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        pqa pqaVar;
        d99 d99Var;
        Throwable th;
        d99 d99Var2;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                pqaVar = this.this$0;
                d99Var = pqaVar.b;
                this.L$0 = d99Var;
                this.L$1 = pqaVar;
                this.label = 1;
                if (d99Var.b(this) != bw2Var) {
                }
                return bw2Var;
            }
            if (i != 1) {
                if (i != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) this.L$0;
                try {
                    jzb.q(obj);
                    d99Var2.h(null);
                    return wef.a;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            pqaVar = (pqa) this.L$1;
            d99 d99Var3 = (d99) this.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            synchronized (pqaVar.a) {
                pqaVar.d = false;
                pqaVar.c++;
            }
            hs3 hs3Var = xqa.z0;
            Boolean bool = Boolean.FALSE;
            isa isaVar = hs3Var.a;
            this.L$0 = d99Var;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (bsa.o(isaVar, bool, this) != bw2Var) {
                d99Var2 = d99Var;
                d99Var2.h(null);
                return wef.a;
            }
            return bw2Var;
        } catch (Throwable th3) {
            d99 d99Var4 = d99Var;
            th = th3;
            d99Var2 = d99Var4;
            d99Var2.h(null);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((oqa) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
