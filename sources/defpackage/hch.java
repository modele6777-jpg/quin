package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hch {
    public final ich a;
    public int b = 1;
    public long c = a();

    public hch(ich ichVar) {
        this.a = ichVar;
    }

    public final long a() {
        ich ichVar = this.a;
        oa7.A(ichVar);
        long jLongValue = ((Long) bzg.v.a(null)).longValue();
        long jLongValue2 = ((Long) bzg.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        ichVar.E().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
