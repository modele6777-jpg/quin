package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jfe implements qz {
    public final psf a;
    public final y6f b;
    public Object c;
    public Object d;
    public b00 e;
    public b00 f;
    public final b00 g;
    public long h;
    public b00 i;

    public jfe(vz vzVar, y6f y6fVar, Object obj, Object obj2, b00 b00Var) {
        this.a = vzVar.a(y6fVar);
        this.b = y6fVar;
        this.c = obj2;
        this.d = obj;
        this.e = (b00) y6fVar.a.d(obj);
        a26 a26Var = y6fVar.a;
        this.f = (b00) a26Var.d(obj2);
        this.g = b00Var != null ? y41.g(b00Var) : ((b00) a26Var.d(obj)).c();
        this.h = -1L;
    }

    public final void a(Object obj) {
        if (pa7.t(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (b00) this.b.a.d(obj);
        this.i = null;
        this.h = -1L;
    }

    @Override // defpackage.qz
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.qz
    public final long c() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long jC = this.a.c(this.e, this.f, this.g);
        this.h = jC;
        return jC;
    }

    @Override // defpackage.qz
    public final y6f d() {
        return this.b;
    }

    @Override // defpackage.qz
    public final b00 e(long j) {
        if (!f(j)) {
            return this.a.i(j, this.e, this.f, this.g);
        }
        b00 b00Var = this.i;
        if (b00Var != null) {
            return b00Var;
        }
        b00 b00VarU = this.a.u(this.e, this.f, this.g);
        this.i = b00VarU;
        return b00VarU;
    }

    @Override // defpackage.qz
    public final Object g(long j) {
        if (f(j)) {
            return this.c;
        }
        b00 b00VarT = this.a.t(j, this.e, this.f, this.g);
        int iB = b00VarT.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(b00VarT.a(i))) {
                gpa.b("AnimationVector cannot contain a NaN. " + b00VarT + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.d(b00VarT);
    }

    @Override // defpackage.qz
    public final Object h() {
        return this.c;
    }

    public final void i(Object obj) {
        if (pa7.t(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (b00) this.b.a.d(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
