package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g89 implements c1e {
    public f89 a;

    public final boolean a(int i) {
        return (((f89) qrd.s(this.a, this)).c & i) != 0;
    }

    public final void b(int i, boolean z) {
        ird irdVarH;
        int i2 = z ? i : 0;
        int i3 = ((f89) qrd.f(this.a)).c;
        int i4 = ((~i) & i3) | i2;
        if (i3 != i4) {
            f89 f89Var = this.a;
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                ((f89) qrd.w(f89Var, this, irdVarH)).c = i4;
            }
            qrd.l(irdVarH, this);
        }
    }

    @Override // defpackage.c1e
    public final f1e c() {
        return this.a;
    }

    @Override // defpackage.c1e
    public final void f(f1e f1eVar) {
        this.a = (f89) f1eVar;
    }
}
