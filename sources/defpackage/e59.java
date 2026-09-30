package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e59 implements sw3 {
    public ste a;
    public final /* synthetic */ f59 b;

    public e59(f59 f59Var) {
        this.b = f59Var;
    }

    @Override // defpackage.sw3
    public final float Q0(long j) {
        if (!wue.d(j)) {
            return getDensity() * F(j);
        }
        f59 f59Var = this.b;
        if (wue.d(f59Var.l.a.b)) {
            qc0.p("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            return 0.0f;
        }
        if (wue.a(f59Var.l.a.b, wue.c)) {
            qc0.p("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            return 0.0f;
        }
        return wue.c(j) * Q0(f59Var.l.a.b);
    }

    public final ste a(long j, long j2) {
        long jH;
        f59 f59Var = this.b;
        mue mueVar = f59Var.l;
        long jA = wue.d(j2) ? g59.a(f59Var.l.a.b, j2) : j2;
        if (!wue.a(jA, f59Var.l.a.b)) {
            f59Var.f(mue.a(f59Var.l, 0L, jA, null, null, 0L, null, 0, 0L, null, null, 16777213));
        }
        if (f59Var.f > 1) {
            cv7 cv7Var = f59Var.n;
            cv7Var.getClass();
            jH = f59Var.h(j, cv7Var);
        } else {
            jH = j;
        }
        cv7 cv7Var2 = f59Var.n;
        cv7Var2.getClass();
        b59 b59VarB = f59Var.b(jH, cv7Var2);
        cv7 cv7Var3 = f59Var.n;
        cv7Var3.getClass();
        ste steVarG = f59Var.g(cv7Var3, jH, b59VarB);
        this.a = steVarG;
        f59Var.f(mueVar);
        return steVarG;
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        sw3 sw3Var = this.b.k;
        sw3Var.getClass();
        return sw3Var.getDensity();
    }

    @Override // defpackage.sw3
    public final float h0() {
        sw3 sw3Var = this.b.k;
        sw3Var.getClass();
        return sw3Var.h0();
    }
}
