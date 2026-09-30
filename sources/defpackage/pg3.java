package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = yg3.class)
public final class pg3 extends ng3 {
    public static final og3 Companion = new og3();
    public final int b;

    public pg3(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        qc0.o(tec.f(i, "Unit duration must be positive, but was ", " days."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pg3) {
            return this.b == ((pg3) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ 65536;
    }

    public final String toString() {
        int i = this.b;
        return i % 7 == 0 ? ug3.a(i / 7, "WEEK") : ug3.a(i, "DAY");
    }
}
