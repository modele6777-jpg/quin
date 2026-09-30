package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nre implements v39 {
    public final x16 a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public boolean d = true;
    public final /* synthetic */ jse e;

    public nre(jse jseVar, x16 x16Var) {
        this.e = jseVar;
        this.a = x16Var;
    }

    @Override // defpackage.v39
    public final boolean a(long j) {
        return true;
    }

    @Override // defpackage.v39
    public final void b() {
        mre mreVar = mre.a;
        jse jseVar = this.e;
        jseVar.q.setValue(mreVar);
        if (this.d) {
            jseVar.r();
        }
    }

    @Override // defpackage.v39
    public final boolean c(long j, wuc wucVar, int i) {
        jse jseVar = this.e;
        ste steVarC = jseVar.b.c();
        if (!jseVar.i || steVarC == null || jseVar.a.d().c.length() == 0) {
            return false;
        }
        this.d = i >= 2;
        jseVar.q.setValue(mre.c);
        this.a.invoke();
        jseVar.v = -1;
        this.b = -1;
        this.c = j;
        this.b = (int) (f(j, wucVar, steVarC, true) >> 32);
        return true;
    }

    @Override // defpackage.v39
    public final boolean d(long j, wuc wucVar) {
        jse jseVar = this.e;
        ute uteVar = jseVar.b;
        z2f z2fVar = jseVar.a;
        ste steVarC = uteVar.c();
        if (!jseVar.i || steVarC == null || z2fVar.d().c.length() == 0) {
            return false;
        }
        if (eue.c(z2fVar.d().d, f(j, wucVar, steVarC, false))) {
            return true;
        }
        this.d = false;
        return true;
    }

    @Override // defpackage.v39
    public final boolean e(long j) {
        jse jseVar = this.e;
        ste steVarC = jseVar.b.c();
        if (!jseVar.i || steVarC == null || jseVar.a.d().c.length() == 0) {
            return false;
        }
        this.d = false;
        this.a.invoke();
        f(j, gec.c, steVarC, false);
        return true;
    }

    public final long f(long j, wuc wucVar, ste steVar, boolean z) {
        int length = steVar.a.a.b.length();
        int iD = this.b;
        jse jseVar = this.e;
        if (iD < 0 || iD > length) {
            iD = jseVar.b.d(this.c, false);
        }
        int i = iD;
        long jB = jseVar.B(jseVar.a.d(), i, jseVar.b.d(j, false), false, wucVar, false, z, null);
        if (this.b == -1 && !eue.d(jB)) {
            this.b = (int) (jB >> 32);
        }
        if (eue.h(jB)) {
            jB = u3c.b((int) (4294967295L & jB), (int) (jB >> 32));
        }
        jseVar.a.j(jB);
        jseVar.x(sue.c);
        return jB;
    }
}
