package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hvc {
    public final long a;
    public final owc b;
    public final long c;
    public ta0 d = ta0.x;
    public x59 e;
    public final n31 f;
    public final j09 g;

    public hvc(long j, owc owcVar, long j2) {
        this.a = j;
        this.b = owcVar;
        this.c = j2;
        n31 n31Var = new n31();
        this.f = n31Var;
        j09 j09VarP = ym8.p(new iwc(owcVar, j, new gvc(this, 3)), n31Var);
        mia.a.getClass();
        this.g = qk2.J(j09VarP, urg.n);
    }

    public final void a() {
        gvc gvcVar = new gvc(this, 0);
        gvc gvcVar2 = new gvc(this, 1);
        gvc gvcVar3 = new gvc(this, 2);
        n31 n31Var = this.f;
        long j = this.a;
        x59 x59Var = new x59(j, gvcVar, gvcVar2, gvcVar3, n31Var);
        owc owcVar = this.b;
        y69 y69Var = owcVar.c;
        if (j == 0) {
            l37.a("The selectable contains an invalid id: " + j);
        }
        if (y69Var.b(j)) {
            l37.a("Another selectable with the id: " + j + " has already subscribed.");
        }
        y69Var.i(j, x59Var);
        owcVar.b.add(x59Var);
        owcVar.a = false;
        this.e = x59Var;
    }

    public final void b() {
        x59 x59Var = this.e;
        if (x59Var != null) {
            owc owcVar = this.b;
            y69 y69Var = owcVar.c;
            long j = x59Var.a;
            if (y69Var.b(j)) {
                owcVar.b.remove(x59Var);
                y69Var.g(j);
                cvc cvcVar = owcVar.j;
                if (cvcVar != null) {
                    cvcVar.d(Long.valueOf(j));
                }
            }
            this.e = null;
        }
    }

    public final void c(ste steVar) {
        cvc cvcVar;
        ste steVar2 = (ste) this.d.d;
        if (steVar2 != null && !pa7.t(steVar2.a.a, steVar.a.a) && (cvcVar = this.b.i) != null) {
            cvcVar.d(Long.valueOf(this.a));
        }
        this.d = ta0.j(this.d, null, steVar, null, 5);
    }
}
