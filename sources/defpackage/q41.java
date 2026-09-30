package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q41 extends zn2 {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r41 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q41(r41 r41Var, zn2 zn2Var) {
        super(zn2Var);
        this.this$0 = r41Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objH = this.this$0.H(null, 0, 0L, this);
        return objH == bw2.a ? objH : new rw1(objH);
    }
}
