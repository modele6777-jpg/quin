package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class co0 {
    public final long a;
    public final long b;
    public final long c;

    public co0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long j4 = wue.c;
        if (wue.a(j, j4)) {
            qc0.j("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
            throw null;
        }
        if (wue.a(j2, j4)) {
            qc0.j("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
            throw null;
        }
        if (wue.a(j3, j4)) {
            qc0.j("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
            throw null;
        }
        if (xue.a(wue.b(j), wue.b(j2))) {
            w6c.g(j, j2);
            if (Float.compare(wue.c(j), wue.c(j2)) > 0) {
                this.a = j2;
                j = j2;
            }
        }
        if (xue.a(wue.b(j3), 4294967296L)) {
            long jR = w6c.r(4294967296L, 1.0E-4f);
            w6c.g(j3, jR);
            if (Float.compare(wue.c(j3), wue.c(jR)) < 0) {
                qc0.j("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
                throw null;
            }
        }
        if (wue.c(j) < 0.0f) {
            qc0.j("AutoSize.StepBased: minFontSize must not be negative");
            throw null;
        }
        if (wue.c(j2) >= 0.0f) {
            return;
        }
        qc0.j("AutoSize.StepBased: maxFontSize must not be negative");
        throw null;
    }

    public static boolean a(ste steVar) {
        int i = steVar.a.f;
        if (i == 1 || i == 3) {
            return steVar.e() || steVar.d();
        }
        if (i != 4 && i != 5 && i != 2) {
            qc0.j(ib8.j("TextOverflow type ", jzb.s(i), " is not supported."));
            return false;
        }
        int i2 = steVar.b.f;
        if (i2 != 0) {
            if (i2 == 1) {
                return steVar.n(0);
            }
            if (i == 4 || i == 5) {
                return steVar.e() || steVar.d();
            }
            if (i == 2) {
                return steVar.n(i2 - 1);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof co0)) {
            return false;
        }
        co0 co0Var = (co0) obj;
        return wue.a(co0Var.a, this.a) && wue.a(co0Var.b, this.b) && wue.a(co0Var.c, this.c);
    }

    public final int hashCode() {
        xue[] xueVarArr = wue.b;
        return Long.hashCode(this.c) + ib8.b(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
