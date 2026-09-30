package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f2f {
    public static final f2f b;
    public final jy6 a;

    static {
        ey6 ey6Var = jy6.b;
        b = new f2f(yob.e);
        pqf.D(0);
    }

    public f2f(yob yobVar) {
        this.a = jy6.o(yobVar);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            jy6 jy6Var = this.a;
            if (i2 >= jy6Var.size()) {
                return false;
            }
            e2f e2fVar = (e2f) jy6Var.get(i2);
            for (boolean z : e2fVar.e) {
                if (z) {
                    if (e2fVar.b.c != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f2f.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((f2f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
