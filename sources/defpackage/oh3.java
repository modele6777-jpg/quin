package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oh3 implements qz {
    public final tsf a;
    public final y6f b;
    public final Object c;
    public final b00 d;
    public final b00 e;
    public final b00 f;
    public final Object g;
    public final long h;

    public oh3(ph3 ph3Var, y6f y6fVar, Object obj, b00 b00Var) {
        tsf tsfVar = new tsf(((qh3) ph3Var).a);
        this.a = tsfVar;
        this.b = y6fVar;
        this.c = obj;
        b00 b00Var2 = (b00) y6fVar.a.d(obj);
        this.d = b00Var2;
        this.e = y41.g(b00Var);
        a26 a26Var = y6fVar.b;
        b00 b00VarC = tsfVar.d;
        if (b00VarC == null) {
            b00VarC = b00Var2.c();
            tsfVar.d = b00VarC;
        }
        int iB = b00VarC.b();
        int i = 0;
        while (true) {
            b00 b00Var3 = tsfVar.d;
            pj5 pj5Var = tsfVar.a;
            if (i >= iB) {
                if (b00Var3 == null) {
                    pa7.g0("targetVector");
                    throw null;
                }
                this.g = a26Var.d(b00Var3);
                b00 b00VarC2 = tsfVar.c;
                if (b00VarC2 == null) {
                    b00VarC2 = b00Var2.c();
                    tsfVar.c = b00VarC2;
                }
                int iB2 = b00VarC2.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    b00Var2.getClass();
                    jMax = Math.max(jMax, pj5Var.l(b00Var.a(i2)));
                }
                this.h = jMax;
                b00 b00VarG = y41.g(this.a.a(jMax, this.d, b00Var));
                this.f = b00VarG;
                int iB3 = b00VarG.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    b00 b00Var4 = this.f;
                    float fA = b00Var4.a(i3);
                    float f = this.a.e;
                    b00Var4.e(i3, mh3.n(fA, -f, f));
                }
                return;
            }
            if (b00Var3 == null) {
                pa7.g0("targetVector");
                throw null;
            }
            b00Var3.e(i, pj5Var.n(b00Var2.a(i), b00Var.a(i)));
            i++;
        }
    }

    @Override // defpackage.qz
    public final boolean b() {
        return false;
    }

    @Override // defpackage.qz
    public final long c() {
        return this.h;
    }

    @Override // defpackage.qz
    public final y6f d() {
        return this.b;
    }

    @Override // defpackage.qz
    public final b00 e(long j) {
        if (f(j)) {
            return this.f;
        }
        return this.a.a(j, this.d, this.e);
    }

    @Override // defpackage.qz
    public final Object g(long j) {
        if (f(j)) {
            return this.g;
        }
        a26 a26Var = this.b.b;
        tsf tsfVar = this.a;
        b00 b00VarC = tsfVar.b;
        b00 b00Var = this.d;
        if (b00VarC == null) {
            b00VarC = b00Var.c();
            tsfVar.b = b00VarC;
        }
        int iB = b00VarC.b();
        int i = 0;
        while (true) {
            b00 b00Var2 = tsfVar.b;
            if (i >= iB) {
                if (b00Var2 != null) {
                    return a26Var.d(b00Var2);
                }
                pa7.g0("valueVector");
                throw null;
            }
            if (b00Var2 == null) {
                pa7.g0("valueVector");
                throw null;
            }
            b00Var2.e(i, tsfVar.a.i(b00Var.a(i), this.e.a(i), j));
            i++;
        }
    }

    @Override // defpackage.qz
    public final Object h() {
        return this.g;
    }
}
