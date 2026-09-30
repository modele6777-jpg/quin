package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e8e {
    public static final e8e c;
    public boolean a;
    public long b;

    static {
        e8e e8eVar = new e8e();
        e8eVar.b = -9223372036854775807L;
        e8eVar.a = false;
        c = e8eVar;
    }

    public long a() {
        if (this.a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.b - System.nanoTime());
    }
}
