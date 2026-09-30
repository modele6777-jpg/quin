package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class myb implements oyb {
    public final Object a;
    public final aw2 b;

    public myb(Object obj, aw2 aw2Var) {
        aw2Var.getClass();
        this.a = obj;
        this.b = aw2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myb)) {
            return false;
        }
        myb mybVar = (myb) obj;
        return this.a.equals(mybVar.a) && pa7.t(this.b, mybVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Progress(data=" + this.a + ", cancelable=" + this.b + ")";
    }
}
