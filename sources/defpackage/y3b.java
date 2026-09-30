package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y3b {
    public final Class a;
    public final Class b;

    public y3b(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static y3b a(Class cls) {
        return new y3b(x3b.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y3b.class != obj.getClass()) {
            return false;
        }
        y3b y3bVar = (y3b) obj;
        if (this.b.equals(y3bVar.b)) {
            return this.a.equals(y3bVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == x3b.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
