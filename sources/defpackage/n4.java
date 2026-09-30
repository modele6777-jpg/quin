package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n4 {
    public static final n4 c;
    public static final n4 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (u4.d) {
            d = null;
            c = null;
        } else {
            d = new n4(null, false);
            c = new n4(null, true);
        }
    }

    public n4(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
