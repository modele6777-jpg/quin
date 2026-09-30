package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zr0 {
    public final szc a;
    public final um9 b;

    public zr0(szc szcVar, um9 um9Var) {
        this.a = szcVar;
        this.b = um9Var;
        if ((szcVar == null ? um9Var : szcVar) != null) {
            return;
        }
        qc0.j("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(j6 j6Var) {
        szc szcVar = this.a;
        if (szcVar != null) {
            szc.x(szcVar, (xr0) j6Var.b);
            return;
        }
        um9 um9Var = this.b;
        if (um9Var == null) {
            qc0.p("Unreachable");
            return;
        }
        yr0 yr0Var = (yr0) j6Var.a;
        yr0Var.getClass();
        pm9 pm9Var = new pm9(yr0Var, new rm9(null, yr0Var));
        yr0Var.a.add(pm9Var);
        szc.x(um9Var.b().c, pm9Var);
    }

    public final void b(j6 j6Var) {
        if (this.a != null) {
            ((xr0) j6Var.b).e();
        } else if (this.b != null) {
            ((yr0) j6Var.a).e();
        } else {
            qc0.p("Unreachable");
        }
    }
}
