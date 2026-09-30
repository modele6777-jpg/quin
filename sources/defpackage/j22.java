package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j22 {
    public final dx5 a;
    public final dx5 b;
    public final boolean c;

    public j22(dx5 dx5Var, dx5 dx5Var2, boolean z) {
        dx5Var.getClass();
        dx5Var2.getClass();
        this.a = dx5Var;
        this.b = dx5Var2;
        this.c = z;
        dx5Var2.a.c();
    }

    public static final String c(dx5 dx5Var) {
        String str = dx5Var.a.a;
        return v4e.G(str, '/') ? ks0.g('`', "`", str) : str;
    }

    public final dx5 a() {
        dx5 dx5Var = this.a;
        boolean zC = dx5Var.a.c();
        dx5 dx5Var2 = this.b;
        if (zC) {
            return dx5Var2;
        }
        return new dx5(dx5Var.a.a + '.' + dx5Var2.a.a);
    }

    public final String b() {
        dx5 dx5Var = this.a;
        boolean zC = dx5Var.a.c();
        dx5 dx5Var2 = this.b;
        if (zC) {
            return c(dx5Var2);
        }
        return c5e.z(dx5Var.a.a, '.', '/') + "/" + c(dx5Var2);
    }

    public final j22 d(t99 t99Var) {
        t99Var.getClass();
        return new j22(this.a, this.b.a(t99Var), this.c);
    }

    public final j22 e() {
        dx5 dx5VarB = this.b.b();
        if (dx5VarB.a.c()) {
            return null;
        }
        return new j22(this.a, dx5VarB, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j22)) {
            return false;
        }
        j22 j22Var = (j22) obj;
        return pa7.t(this.a, j22Var.a) && pa7.t(this.b, j22Var.b) && this.c == j22Var.c;
    }

    public final t99 f() {
        return this.b.a.g();
    }

    public final boolean g() {
        return !this.b.b().a.c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        boolean zC = this.a.a.c();
        String strB = b();
        return zC ? "/".concat(strB) : strB;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j22(dx5 dx5Var, t99 t99Var) {
        this(dx5Var, cn1.V(t99Var), false);
        dx5Var.getClass();
        t99Var.getClass();
        dx5 dx5Var2 = dx5.c;
    }
}
