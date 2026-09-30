package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class szb {
    public static final szb d = new szb(0, false, false);
    public static final szb e = new szb(500, true, false);
    public static final szb f;
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
        new szb(100L, true, false);
        f = new szb(0L, false, true);
    }

    public szb(long j, boolean z, boolean z2) {
        this.b = z;
        this.a = j;
        if (z2) {
            ok8.k("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
