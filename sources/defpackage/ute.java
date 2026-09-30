package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ute {
    public final vpe a;
    public l26 b;
    public final vpe c;
    public final vz9 d;
    public final vz9 e;
    public final vz9 f;
    public final vz9 g;
    public final n31 h;

    public ute() {
        vpe vpeVar = new vpe();
        this.a = vpeVar;
        this.c = vpeVar;
        qk6 qk6Var = qk6.L0;
        this.d = new vz9(null, qk6Var);
        this.e = new vz9(null, qk6Var);
        this.f = new vz9(null, qk6Var);
        this.g = q1c.f(new yi4(0.0f));
        this.h = new n31();
    }

    public final long a(long j) {
        hkb hkbVarM;
        bv7 bv7VarE = e();
        hkb hkbVar = hkb.e;
        if (bv7VarE != null) {
            if (bv7VarE.h()) {
                bv7 bv7VarB = b();
                hkbVarM = bv7VarB != null ? bv7VarB.M(bv7VarE, true) : null;
            } else {
                hkbVarM = hkbVar;
            }
            if (hkbVarM != null) {
                hkbVar = hkbVarM;
            }
        }
        return xxb.n(j, hkbVar);
    }

    public final bv7 b() {
        return (bv7) this.f.getValue();
    }

    public final ste c() {
        return (ste) this.c.getValue();
    }

    public final int d(long j, boolean z) {
        ste steVarC = c();
        if (steVarC == null) {
            return -1;
        }
        if (z) {
            j = a(j);
        }
        return steVarC.b.g(xxb.p(this, j));
    }

    public final bv7 e() {
        return (bv7) this.d.getValue();
    }

    public final boolean f(long j) {
        ste steVarC = c();
        if (steVarC == null) {
            return false;
        }
        long jP = xxb.p(this, a(j));
        int iE = steVarC.b.e(Float.intBitsToFloat((int) (4294967295L & jP)));
        int i = (int) (jP >> 32);
        return Float.intBitsToFloat(i) >= steVarC.h(iE) && Float.intBitsToFloat(i) <= steVarC.i(iE);
    }
}
