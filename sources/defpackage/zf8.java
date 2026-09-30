package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zf8 extends gbe implements l26 {
    final /* synthetic */ qne $observer;
    final /* synthetic */ tia $this_detectDownAndDragGesturesWithObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf8(tia tiaVar, qne qneVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_detectDownAndDragGesturesWithObserver = tiaVar;
        this.$observer = qneVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        zf8 zf8Var = new zf8(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, xn2Var);
        zf8Var.L$0 = obj;
        return zf8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        aw2 aw2Var = (aw2) this.L$0;
        xf8 xf8Var = new xf8(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null);
        dw2 dw2Var = dw2.d;
        ynb.V(aw2Var, null, dw2Var, xf8Var, 1);
        return ynb.V(aw2Var, null, dw2Var, new yf8(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zf8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
