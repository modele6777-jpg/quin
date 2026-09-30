package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uu7 {
    public static final uu7 a;

    static {
        uu7 uu7Var = new uu7();
        if (yi4.a(0.0f, 0.0f) < 0 || yi4.a(0.0f, 0.0f) < 0 || yi4.a(0.0f, 0.0f) < 0 || yi4.a(0.0f, 0.0f) < 0) {
            h37.a("Layer outsets must be non-negative");
        }
        a = uu7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uu7) && yi4.b(0.0f, 0.0f) && yi4.b(0.0f, 0.0f) && yi4.b(0.0f, 0.0f) && yi4.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + ub3.a(0.0f, ub3.a(0.0f, Float.hashCode(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        String strC = yi4.c(0.0f);
        String strC2 = yi4.c(0.0f);
        return ks0.m(ib8.o("LayerOutsets(left=", strC, ", top=", strC2, ", right="), yi4.c(0.0f), ", bottom=", yi4.c(0.0f), ")");
    }
}
