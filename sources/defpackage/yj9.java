package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yj9 implements xn7 {
    public final xn7 a;
    public final oyc b;

    public yj9(xn7 xn7Var) {
        xn7Var.getClass();
        this.a = xn7Var;
        this.b = new oyc(xn7Var.e());
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        if (obj != null) {
            ev4Var.h(this.a, obj);
        } else {
            ev4Var.f();
        }
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        if (om3Var.x()) {
            return om3Var.h(this.a);
        }
        return null;
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && yj9.class == obj.getClass() && pa7.t(this.a, ((yj9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
