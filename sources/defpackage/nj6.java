package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nj6 implements l95 {
    public final /* synthetic */ int a;
    public final kkd b;
    public n95 c;
    public l95 d;
    public Pair e;
    public final l95 f;

    public nj6(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = new kkd(65496, 2, "image/jpeg");
                this.f = (i & 1) == 0 ? new ug7() : null;
                break;
            default:
                this.b = new kkd(-1, -1, "image/heif");
                this.f = (i & 1) != 0 ? null : new mj6();
                break;
        }
    }

    @Override // defpackage.l95
    public final void a() {
        int i = this.a;
        l95 l95Var = this.f;
        switch (i) {
            case 0:
                mj6 mj6Var = (mj6) l95Var;
                if (mj6Var != null) {
                    mj6Var.a();
                }
                break;
            default:
                ug7 ug7Var = (ug7) l95Var;
                if (ug7Var != null) {
                    ug7Var.a();
                }
                break;
        }
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        int i = this.a;
        l95 l95Var = this.f;
        switch (i) {
            case 0:
                if (((mj6) l95Var) != null && an1.P(m95Var, true)) {
                    return true;
                }
                ((rq3) m95Var).f = 0;
                return an1.P(m95Var, false);
            default:
                ug7 ug7Var = (ug7) l95Var;
                if (ug7Var != null && ug7Var.b(m95Var)) {
                    return true;
                }
                ((rq3) m95Var).f = 0;
                return this.b.b(m95Var);
        }
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        switch (this.a) {
            case 0:
                l95 l95Var = this.d;
                if (l95Var == null) {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                } else {
                    l95Var.c(j, j2);
                }
                break;
            default:
                l95 l95Var2 = this.d;
                if (l95Var2 == null) {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                } else {
                    l95Var2.c(j, j2);
                }
                break;
        }
    }

    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) {
        int i = this.a;
        l95 l95Var = this.b;
        l95 l95Var2 = this.f;
        switch (i) {
            case 0:
                l95 l95Var3 = this.d;
                if (l95Var3 == null) {
                    mj6 mj6Var = (mj6) l95Var2;
                    pa7.J(l95Var3 == null);
                    mj6Var.getClass();
                    if (an1.P(m95Var, true)) {
                        l95Var = mj6Var;
                    }
                    this.d = l95Var;
                    m95Var.k();
                    Pair pair = this.e;
                    if (pair != null) {
                        this.d.c(((Long) pair.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    l95 l95Var4 = this.d;
                    n95 n95Var = this.c;
                    n95Var.getClass();
                    l95Var4.f(n95Var);
                }
                break;
            default:
                l95 l95Var5 = this.d;
                if (l95Var5 == null) {
                    ug7 ug7Var = (ug7) l95Var2;
                    pa7.J(l95Var5 == null);
                    ug7Var.getClass();
                    if (ug7Var.b(m95Var)) {
                        l95Var = ug7Var;
                    }
                    this.d = l95Var;
                    m95Var.k();
                    Pair pair2 = this.e;
                    if (pair2 != null) {
                        this.d.c(((Long) pair2.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    l95 l95Var6 = this.d;
                    n95 n95Var2 = this.c;
                    n95Var2.getClass();
                    l95Var6.f(n95Var2);
                }
                break;
        }
        return this.d.e(m95Var, d82Var);
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        int i = this.a;
        kkd kkdVar = this.b;
        l95 l95Var = this.f;
        switch (i) {
            case 0:
                this.c = n95Var;
                if (((mj6) l95Var) == null) {
                    this.d = kkdVar;
                    kkdVar.f(n95Var);
                }
                break;
            default:
                this.c = n95Var;
                if (((ug7) l95Var) == null) {
                    this.d = kkdVar;
                    kkdVar.f(n95Var);
                }
                break;
        }
    }
}
