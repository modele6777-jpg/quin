package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zj3 implements bk3 {
    public final boolean a;
    public final gmd b;
    public final float c;

    public zj3(float f, gmd gmdVar, boolean z) {
        this.a = z;
        this.b = gmdVar;
        this.c = f;
    }

    public final boolean a() {
        return !this.a && this.b == gmd.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj3)) {
            return false;
        }
        zj3 zj3Var = (zj3) obj;
        return this.a == zj3Var.a && this.b == zj3Var.b && Float.compare(this.c, zj3Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Mixed(isLocked=" + this.a + ", downloadState=" + this.b + ", downloadProgress=" + this.c + ")";
    }
}
