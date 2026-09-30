package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tw4 extends gu7 implements a26 {
    final /* synthetic */ h0e $animSlideOffsetState;
    final /* synthetic */ long $currentSize;
    final /* synthetic */ a26 $layerBlock;
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ long $offsetDelta;
    final /* synthetic */ cea $placeable;
    final /* synthetic */ long $target;
    final /* synthetic */ ax4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw4(ax4 ax4Var, f3f f3fVar, long j, long j2, long j3, cea ceaVar, long j4, cw4 cw4Var) {
        super(1);
        this.this$0 = ax4Var;
        this.$animSlideOffsetState = f3fVar;
        this.$measuredSize = j;
        this.$target = j2;
        this.$currentSize = j3;
        this.$placeable = ceaVar;
        this.$offsetDelta = j4;
        this.$layerBlock = cw4Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        bea beaVar = (bea) obj;
        scd scdVar = this.this$0.K0;
        h0e h0eVar = this.$animSlideOffsetState;
        long j = h0eVar != null ? ((w67) h0eVar.getValue()).a : 0L;
        scdVar.d();
        scdVar.d();
        long jD = w67.d(j, 0L);
        if (scdVar.d()) {
            scdVar.j = jD;
        }
        yi yiVar = this.this$0.O0;
        long jD2 = w67.d(yiVar != null ? yiVar.a(this.$target, this.$currentSize, cv7.a) : 0L, jD);
        cea ceaVar = this.$placeable;
        long j2 = this.$offsetDelta;
        beaVar.e(ceaVar);
        ceaVar.b0(w67.d((((long) (((int) (jD2 & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jD2 >> 32)) + ((int) (j2 >> 32)))) << 32), ceaVar.e), 0.0f, this.$layerBlock);
        return wef.a;
    }
}
