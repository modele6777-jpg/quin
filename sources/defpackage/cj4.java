package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cj4 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cj4) && yi4.b(10.0f, 10.0f) && yi4.b(40.0f, 40.0f) && yi4.b(10.0f, 10.0f) && yi4.b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ub3.a(40.0f, ub3.a(10.0f, ub3.a(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strC = yi4.c(10.0f);
        String strC2 = yi4.c(40.0f);
        return ks0.m(ib8.o("DpTouchBoundsExpansion(start=", strC, ", top=", strC2, ", end="), yi4.c(10.0f), ", bottom=", yi4.c(40.0f), ", isLayoutDirectionAware=true)");
    }
}
