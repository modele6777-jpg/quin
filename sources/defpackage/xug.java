package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xug {
    public static final xug c;
    public static final xug d;
    public final boolean a;
    public final Throwable b;

    static {
        if (ivg.f) {
            d = null;
            c = null;
        } else {
            d = new xug(null, false);
            c = new xug(null, true);
        }
    }

    public xug(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
