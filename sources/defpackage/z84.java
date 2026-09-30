package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z84 implements b94 {
    public final int a;

    public /* synthetic */ z84(int i) {
        this.a = i;
    }

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        qc0.j("px must be > 0.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z84) {
            return this.a == ((z84) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return tec.f(this.a, "Pixels(px=", ")");
    }
}
