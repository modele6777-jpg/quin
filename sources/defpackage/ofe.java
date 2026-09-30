package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ofe extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sfe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofe(sfe sfeVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = sfeVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ofe ofeVar = new ofe(this.this$0, xn2Var);
        ofeVar.L$0 = obj;
        return ofeVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws ba5 {
        String str = (String) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        e2a e2aVarA = this.this$0.b.a(str);
        if (e2aVarA != null) {
            return e2aVarA;
        }
        throw new ba5(str);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ofe) k((xn2) obj2, (String) obj)).r(wef.a);
    }
}
