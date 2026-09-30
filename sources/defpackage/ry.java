package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ry extends gu7 implements a26 {
    final /* synthetic */ long $currentSize;
    final /* synthetic */ ty this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry(ty tyVar, long j) {
        super(1);
        this.this$0 = tyVar;
        this.$currentSize = j;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j;
        ze5 ze5Var;
        i3f i3fVar = (i3f) obj;
        boolean zT = pa7.t(i3fVar.b(), this.this$0.G0.b());
        ty tyVar = this.this$0;
        if (zT) {
            j = this.$currentSize;
            if (!e77.b(tyVar.N0, -9223372034707292160L)) {
                j = tyVar.N0;
            }
        } else {
            h0e h0eVar = (h0e) tyVar.G0.d.g(i3fVar.b());
            j = h0eVar != null ? ((e77) h0eVar.getValue()).a : 0L;
        }
        h0e h0eVar2 = (h0e) this.this$0.G0.d.g(i3fVar.d());
        long j2 = h0eVar2 != null ? ((e77) h0eVar2.getValue()).a : 0L;
        ild ildVar = (ild) this.this$0.F0.getValue();
        return (ildVar == null || (ze5Var = (ze5) ildVar.b.z(new e77(j), new e77(j2))) == null) ? b21.P(0.0f, 400.0f, 5, null) : ze5Var;
    }
}
