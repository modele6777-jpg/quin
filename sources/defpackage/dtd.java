package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dtd extends b41 implements i97 {
    public final long a;

    public dtd(long j) {
        this.a = j;
    }

    @Override // defpackage.b41
    public final void a(float f, long j, dy9 dy9Var) {
        rt rtVar = (rt) dy9Var;
        rtVar.d(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = y72.b(jB, y72.c(jB) * f);
        }
        rtVar.f(jB);
        if (rtVar.c != null) {
            rtVar.j(null);
        }
    }

    @Override // defpackage.i97
    public final Object b(float f, Object obj) {
        if (obj == null) {
            int i = y72.l;
            obj = new dtd(y72.j);
        }
        if (!(obj instanceof dtd)) {
            return null;
        }
        return new dtd(abg.R(this.a, ((dtd) obj).a, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtd)) {
            return false;
        }
        long j = ((dtd) obj).a;
        int i = y72.l;
        return faf.a(this.a, j);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return ib8.j("SolidColor(value=", y72.h(this.a), ")");
    }
}
