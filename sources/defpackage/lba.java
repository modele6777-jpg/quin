package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lba extends zn2 {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ sba this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lba(sba sbaVar, zn2 zn2Var) {
        super(zn2Var);
        this.this$0 = sbaVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objB = this.this$0.b(null, 0, 0, this);
        return objB == bw2.a ? objB : new ezb(objB);
    }
}
