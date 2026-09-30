package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v01 implements l95 {
    public final /* synthetic */ int a;
    public final kkd b;

    public v01(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new kkd(35152, 2, "image/png");
                break;
            default:
                this.b = new kkd(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // defpackage.l95
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        int i = this.a;
        kkd kkdVar = this.b;
        switch (i) {
            case 0:
                break;
        }
        return kkdVar.b(m95Var);
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        int i = this.a;
        kkd kkdVar = this.b;
        switch (i) {
            case 0:
                kkdVar.c(j, j2);
                break;
            default:
                kkdVar.c(j, j2);
                break;
        }
    }

    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) {
        int i = this.a;
        kkd kkdVar = this.b;
        switch (i) {
            case 0:
                break;
        }
        return kkdVar.e(m95Var, d82Var);
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        int i = this.a;
        kkd kkdVar = this.b;
        switch (i) {
            case 0:
                kkdVar.f(n95Var);
                break;
            default:
                kkdVar.f(n95Var);
                break;
        }
    }

    private final void g() {
    }

    private final void h() {
    }
}
