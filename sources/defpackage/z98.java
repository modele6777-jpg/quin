package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z98 extends v69 {
    public final djg l;
    public x48 m;
    public aa8 n;

    public z98(djg djgVar) {
        this.l = djgVar;
        if (djgVar.a == null) {
            djgVar.a = this;
        } else {
            qc0.p("There is already a listener registered");
            throw null;
        }
    }

    @Override // defpackage.q98
    public final void g() {
        djg djgVar = this.l;
        djgVar.b = true;
        djgVar.d = false;
        djgVar.c = false;
        djgVar.i.drainPermits();
        djgVar.d();
    }

    @Override // defpackage.q98
    public final void h() {
        this.l.b = false;
    }

    @Override // defpackage.q98
    public final void j(zk9 zk9Var) {
        super.j(zk9Var);
        this.m = null;
        this.n = null;
    }

    public final void l() {
        x48 x48Var = this.m;
        aa8 aa8Var = this.n;
        if (x48Var == null || aa8Var == null) {
            return;
        }
        super.j(aa8Var);
        e(x48Var, aa8Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
