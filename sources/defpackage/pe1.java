package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pe1 implements vv6 {
    public final oe1 a;

    public pe1(oe1 oe1Var) {
        this.a = oe1Var;
    }

    @Override // defpackage.vv6
    public final int a() {
        return 0;
    }

    @Override // defpackage.vv6
    public final void b(i35 i35Var) {
        this.a.b(i35Var);
    }

    @Override // defpackage.vv6
    public final wde c() {
        return this.a.c();
    }

    @Override // defpackage.vv6
    public final int e() {
        int iB = kv2.B(this.a.e());
        if (iB == 1) {
            return 2;
        }
        if (iB != 2) {
            return iB != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // defpackage.vv6
    public final long i() {
        return this.a.i();
    }
}
