package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = c19.class)
public final class rg3 extends ng3 {
    public static final qg3 Companion = new qg3();
    public final int b;

    public rg3(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        qc0.o(tec.f(i, "Unit duration must be positive, but was ", " months."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rg3) {
            return this.b == ((rg3) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ 131072;
    }

    public final String toString() {
        int i = this.b;
        if (i % 1200 == 0) {
            return ug3.a(i / 1200, "CENTURY");
        }
        if (i % 12 == 0) {
            return ug3.a(i / 12, "YEAR");
        }
        return i % 3 == 0 ? ug3.a(i / 3, "QUARTER") : ug3.a(i, "MONTH");
    }
}
