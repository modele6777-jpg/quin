package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cob {
    public final Class a;
    public final zr7 b;

    public cob(Class cls, zr7 zr7Var) {
        this.a = cls;
        this.b = zr7Var;
    }

    public final String a() {
        String strReplace = this.a.getName().replace('.', '/');
        strReplace.getClass();
        return strReplace.concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cob) {
            return this.a.equals(((cob) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return cob.class.getName() + ": " + this.a;
    }
}
