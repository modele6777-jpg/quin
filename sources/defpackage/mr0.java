package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mr0 implements l95 {
    public final /* synthetic */ int a;
    public final d0a b;
    public final kkd c;

    public mr0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new d0a(4);
                this.c = new kkd(-1, -1, "image/webp");
                break;
            default:
                this.b = new d0a(4);
                this.c = new kkd(-1, -1, "image/avif");
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
        d0a d0aVar = this.b;
        switch (i) {
            case 0:
                rq3 rq3Var = (rq3) m95Var;
                rq3Var.j(4, false);
                d0aVar.J(4);
                rq3Var.d(d0aVar.a, 0, 4, false);
                if (d0aVar.B() == 1718909296) {
                    d0aVar.J(4);
                    rq3Var.d(d0aVar.a, 0, 4, false);
                    if (d0aVar.B() == 1635150182) {
                        return true;
                    }
                }
                return false;
            default:
                d0aVar.J(4);
                rq3 rq3Var2 = (rq3) m95Var;
                rq3Var2.d(d0aVar.a, 0, 4, false);
                if (d0aVar.B() == 1380533830) {
                    rq3Var2.j(4, false);
                    d0aVar.J(4);
                    rq3Var2.d(d0aVar.a, 0, 4, false);
                    if (d0aVar.B() == 1464156752) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        int i = this.a;
        kkd kkdVar = this.c;
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
        kkd kkdVar = this.c;
        switch (i) {
            case 0:
                break;
        }
        return kkdVar.e(m95Var, d82Var);
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        int i = this.a;
        kkd kkdVar = this.c;
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
