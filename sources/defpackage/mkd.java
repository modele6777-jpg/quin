package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mkd implements tvc {
    public final boolean a;
    public final int b;
    public final int c;
    public final vuc d;
    public final guc e;

    public mkd(boolean z, int i, int i2, vuc vucVar, guc gucVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = vucVar;
        this.e = gucVar;
    }

    @Override // defpackage.tvc
    public final int a() {
        return 1;
    }

    @Override // defpackage.tvc
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.tvc
    public final guc c() {
        return this.e;
    }

    @Override // defpackage.tvc
    public final guc d(long j) {
        guc gucVar = this.e;
        if (j == gucVar.a) {
            return gucVar;
        }
        return null;
    }

    @Override // defpackage.tvc
    public final vuc e() {
        return this.d;
    }

    @Override // defpackage.tvc
    public final guc f() {
        return this.e;
    }

    @Override // defpackage.tvc
    public final int g() {
        return this.c;
    }

    @Override // defpackage.tvc
    public final guc h() {
        return this.e;
    }

    @Override // defpackage.tvc
    public final c03 i() {
        int i = this.b;
        int i2 = this.c;
        if (i < i2) {
            return c03.b;
        }
        return i > i2 ? c03.a : this.e.b();
    }

    @Override // defpackage.tvc
    public final guc k() {
        return this.e;
    }

    @Override // defpackage.tvc
    public final int l() {
        return this.b;
    }

    @Override // defpackage.tvc
    public final boolean m(tvc tvcVar) {
        if (this.d == null || tvcVar == null || !(tvcVar instanceof mkd)) {
            return true;
        }
        mkd mkdVar = (mkd) tvcVar;
        if (this.b != mkdVar.b || this.c != mkdVar.c || this.a != mkdVar.a) {
            return true;
        }
        guc gucVar = mkdVar.e;
        guc gucVar2 = this.e;
        return (gucVar2.a == gucVar.a && gucVar2.c == gucVar.c && gucVar2.d == gucVar.d) ? false : true;
    }

    @Override // defpackage.tvc
    public final y69 n(vuc vucVar) {
        boolean z = vucVar.c;
        uuc uucVar = vucVar.b;
        uuc uucVar2 = vucVar.a;
        if ((!z && uucVar2.b > uucVar.b) || (z && uucVar2.b <= uucVar.b)) {
            vucVar = vuc.a(vucVar, null, null, !z, 3);
        }
        long j = this.e.a;
        y69 y69Var = of8.a;
        y69 y69Var2 = new y69();
        y69Var2.i(j, vucVar);
        return y69Var2;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + i() + ", info=\n\t" + this.e + ")";
    }

    @Override // defpackage.tvc
    public final void j(wq6 wq6Var) {
    }
}
