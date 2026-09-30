package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v3c extends gu7 implements a26 {
    final /* synthetic */ x3c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3c(x3c x3cVar) {
        super(1);
        this.this$0 = x3cVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        x3c x3cVar = this.this$0;
        return Double.valueOf(x3cVar.n.b(mh3.m(dDoubleValue, x3cVar.e, x3cVar.f)));
    }
}
