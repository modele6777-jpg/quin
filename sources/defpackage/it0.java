package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class it0 {
    public static final gt0 c = new gt0(false, false, -1);
    public final boolean a;
    public final boolean b;

    static {
        new it0(true, false, -1);
        new it0(false, true, 76);
        new it0(false, true, 64);
    }

    public it0(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        if (z && z2) {
            qc0.j("Failed requirement.");
            throw null;
        }
    }
}
