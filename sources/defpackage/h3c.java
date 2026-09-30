package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h3c extends gbe implements l26 {
    final /* synthetic */ r0c $session;
    int label;
    final /* synthetic */ p3c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3c(p3c p3cVar, r0c r0cVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = p3cVar;
        this.$session = r0cVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new h3c(this.this$0, this.$session, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            k2c k2cVar = this.this$0.c;
            String str = this.$session.a;
            w57 w57VarA = z57.a.a();
            this.label = 1;
            k2cVar.getClass();
            Object objF = v4e.Q(str) ? Boolean.FALSE : k2cVar.f(str, Boolean.FALSE, new a2c(k2cVar, str, w57VarA, null), this);
            bw2 bw2Var = bw2.a;
            if (objF == bw2Var) {
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
        return ((h3c) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
