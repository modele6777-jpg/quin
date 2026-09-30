package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iw4 extends gu7 implements a26 {
    final /* synthetic */ a26 $initialWidth = xx.G0;

    public iw4() {
        super(1);
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j = ((e77) obj).a;
        return new e77((((long) ((Number) this.$initialWidth.d(Integer.valueOf((int) (j >> 32)))).intValue()) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L));
    }
}
