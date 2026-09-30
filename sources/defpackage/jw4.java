package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jw4 extends gu7 implements a26 {
    final /* synthetic */ a26 $initialHeight = xx.I0;

    public jw4() {
        super(1);
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j = ((e77) obj).a;
        int i = (int) (j >> 32);
        return new e77((((long) ((Number) this.$initialHeight.d(Integer.valueOf((int) (j & 4294967295L)))).intValue()) & 4294967295L) | (((long) i) << 32));
    }
}
