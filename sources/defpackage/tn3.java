package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tn3 extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ mo3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn3(mo3 mo3Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mo3Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        tn3 tn3Var = new tn3(this.this$0, xn2Var);
        tn3Var.L$0 = obj;
        return tn3Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str = (String) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        mo3 mo3Var = this.this$0;
        mo3Var.getClass();
        str.getClass();
        mo3Var.a.setValue(str);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        tn3 tn3Var = (tn3) k((xn2) obj2, (String) obj);
        wef wefVar = wef.a;
        tn3Var.r(wefVar);
        return wefVar;
    }
}
