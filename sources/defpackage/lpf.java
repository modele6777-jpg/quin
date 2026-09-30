package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lpf extends zn2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ npf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpf(npf npfVar, zn2 zn2Var) {
        super(zn2Var);
        this.this$0 = npfVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objE = this.this$0.e(null, this);
        return objE == bw2.a ? objE : new ezb(objE);
    }
}
