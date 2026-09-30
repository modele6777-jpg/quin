package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eld extends gu7 implements a26 {
    final /* synthetic */ int $height;
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ cea $placeable;
    final /* synthetic */ zn8 $this_measure;
    final /* synthetic */ int $width;
    final /* synthetic */ fld this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eld(fld fldVar, long j, int i, int i2, zn8 zn8Var, cea ceaVar) {
        super(1);
        this.this$0 = fldVar;
        this.$measuredSize = j;
        this.$width = i;
        this.$height = i2;
        this.$this_measure = zn8Var;
        this.$placeable = ceaVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        bea beaVar = (bea) obj;
        this.this$0.getClass();
        long j = this.$measuredSize;
        long j2 = (((long) this.$width) << 32) | (((long) this.$height) & 4294967295L);
        bea.j(beaVar, this.$placeable, (((long) Math.round((1.0f - 1.0f) * ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f))) & 4294967295L) | (((long) Math.round(((this.$this_measure.getLayoutDirection() == cv7.a ? -1.0f : (-1.0f) * (-1.0f)) + 1.0f) * ((((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f))) << 32));
        return wef.a;
    }
}
