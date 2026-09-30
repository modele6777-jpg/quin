package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n48 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o48 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n48(o48 o48Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = o48Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        n48 n48Var = new n48(this.this$0, xn2Var);
        n48Var.L$0 = obj;
        return n48Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        aw2 aw2Var = (aw2) this.L$0;
        if (((a58) this.this$0.a).i.compareTo(g48.b) >= 0) {
            o48 o48Var = this.this$0;
            o48Var.a.a(o48Var);
        } else {
            tq.n(aw2Var.getCoroutineContext(), null);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        n48 n48Var = (n48) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        n48Var.r(wefVar);
        return wefVar;
    }
}
