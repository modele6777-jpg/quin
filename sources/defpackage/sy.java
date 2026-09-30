package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sy extends gu7 implements a26 {
    final /* synthetic */ long $currentSize;
    final /* synthetic */ ty this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy(ty tyVar, long j) {
        super(1);
        this.this$0 = tyVar;
        this.$currentSize = j;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j;
        boolean zT = pa7.t(obj, this.this$0.G0.b());
        ty tyVar = this.this$0;
        if (zT) {
            j = this.$currentSize;
            if (!e77.b(tyVar.N0, -9223372034707292160L)) {
                j = tyVar.N0;
            }
        } else {
            h0e h0eVar = (h0e) tyVar.G0.d.g(obj);
            j = h0eVar != null ? ((e77) h0eVar.getValue()).a : 0L;
        }
        return new e77(j);
    }
}
