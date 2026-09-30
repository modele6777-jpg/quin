package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mj0 {
    public static final mj0 d = new lj0().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public mj0(lj0 lj0Var) {
        this.a = lj0Var.a;
        this.b = lj0Var.b;
        this.c = lj0Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mj0.class != obj.getClass()) {
            return false;
        }
        mj0 mj0Var = (mj0) obj;
        return this.a == mj0Var.a && this.b == mj0Var.b && this.c == mj0Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
