package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cg4 extends b0 {
    public final /* synthetic */ int a;
    public final yz0 b;

    public cg4(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new bve();
                break;
            default:
                this.b = new bg4();
                break;
        }
    }

    @Override // defpackage.b0
    public boolean c(yz0 yz0Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.c(yz0Var);
        }
    }

    @Override // defpackage.b0
    public final yz0 f() {
        int i = this.a;
        yz0 yz0Var = this.b;
        switch (i) {
            case 0:
                return (bg4) yz0Var;
            default:
                return (bve) yz0Var;
        }
    }

    @Override // defpackage.b0
    public boolean h() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // defpackage.b0
    public final c72 j(hg4 hg4Var) {
        switch (this.a) {
            case 0:
                return c72.a(hg4Var.c);
            default:
                return null;
        }
    }
}
