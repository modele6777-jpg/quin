package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i66 extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k66 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i66(k66 k66Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = k66Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        i66 i66Var = new i66(this.this$0, xn2Var);
        i66Var.L$0 = ((ezb) obj).b();
        return i66Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object obj2 = this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        k66 k66Var = this.this$0;
        if (ezb.a(obj2) != null) {
            k66Var.d.n(null, d66.a);
        }
        k66 k66Var2 = this.this$0;
        if (!(obj2 instanceof dzb)) {
            if (!((Boolean) obj2).booleanValue()) {
                qc0.p("Report not ready. Retrying...");
                return null;
            }
            k66Var2.d.n(null, f66.a);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        i66 i66Var = (i66) k((xn2) obj2, new ezb(((ezb) obj).b()));
        wef wefVar = wef.a;
        i66Var.r(wefVar);
        return wefVar;
    }
}
