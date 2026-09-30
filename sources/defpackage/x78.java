package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x78 extends b0 {
    public final p78 a = new p78();
    public final int b;
    public boolean c;

    public x78(int i) {
        this.b = i;
    }

    @Override // defpackage.b0
    public final boolean c(yz0 yz0Var) {
        if (!this.c) {
            return true;
        }
        return true;
    }

    @Override // defpackage.b0
    public final yz0 f() {
        return this.a;
    }

    @Override // defpackage.b0
    public final boolean h() {
        return true;
    }

    @Override // defpackage.b0
    public final c72 j(hg4 hg4Var) {
        if (hg4Var.i) {
            if (this.a.b == null) {
                return null;
            }
            yz0 yz0VarF = hg4Var.g().f();
            this.c = (yz0VarF instanceof ny9) || (yz0VarF instanceof p78);
            return c72.a(hg4Var.f);
        }
        int i = hg4Var.h;
        int i2 = this.b;
        if (i >= i2) {
            return new c72(-1, hg4Var.d + i2, false);
        }
        return null;
    }
}
