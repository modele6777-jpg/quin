package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l59 extends gbe implements l26 {
    int label;
    final /* synthetic */ o59 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l59(o59 o59Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = o59Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new l59(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        acd acdVar = (acd) ((bcd) this.this$0.i.getValue());
        return new Integer(acdVar.b.nativeIncrementAndGetCounterValue(acdVar.c));
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((l59) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
