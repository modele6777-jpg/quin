package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a78 extends b0 {
    public final y68 a;
    public boolean b;
    public int c;

    public a78(y68 y68Var) {
        this.a = y68Var;
    }

    @Override // defpackage.b0
    public final boolean c(yz0 yz0Var) {
        if (!(yz0Var instanceof p78)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
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
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return c72.a(hg4Var.c);
    }
}
