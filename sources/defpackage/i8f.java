package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i8f implements d7f {
    public abstract dsf a();

    public abstract tt7 b();

    public abstract boolean c();

    public abstract i8f d(zt7 zt7Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8f)) {
            return false;
        }
        i8f i8fVar = (i8f) obj;
        return c() == i8fVar.c() && a() == i8fVar.a() && b().equals(i8fVar.b());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (w8f.m(b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == dsf.INVARIANT) {
            return b().toString();
        }
        return a() + " " + b();
    }
}
