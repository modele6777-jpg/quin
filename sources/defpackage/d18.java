package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d18 implements fhc {
    public final /* synthetic */ int a;
    public final /* synthetic */ fhc b;
    public final /* synthetic */ zhc c;

    public /* synthetic */ d18(fhc fhcVar, zhc zhcVar, int i) {
        this.a = i;
        this.c = zhcVar;
        this.b = fhcVar;
    }

    @Override // defpackage.fhc
    public final float a(float f) {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.a(f);
    }

    public final int b(int i) {
        Object obj;
        int i2 = this.a;
        zhc zhcVar = this.c;
        switch (i2) {
            case 0:
                b18 b18VarH = ((j18) zhcVar).h();
                if (b18VarH.l.isEmpty()) {
                    return 0;
                }
                int iC = c();
                if (i > e() || iC > i) {
                    return ((i - c()) * nk8.A(b18VarH)) - d();
                }
                List list = b18VarH.l;
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        obj = list.get(i3);
                        if (((c18) obj).a != i) {
                            i3++;
                        }
                    } else {
                        obj = null;
                    }
                }
                c18 c18Var = (c18) obj;
                if (c18Var != null) {
                    return c18Var.o;
                }
                return 0;
            default:
                yx9 yx9Var = (yx9) zhcVar;
                return (int) (mh3.q(kn2.D(yx9Var) + ((long) ym8.L(((yx9Var.n() * (i - ((sz9) yx9Var.d.c).j())) - (((qz9) yx9Var.d.d).j() * yx9Var.n())) + 0.0f)), yx9Var.h, yx9Var.g) - kn2.D(yx9Var));
        }
    }

    public final int c() {
        int i = this.a;
        zhc zhcVar = this.c;
        switch (i) {
            case 0:
                return ((j18) zhcVar).e.b.j();
            default:
                return ((yx9) zhcVar).e;
        }
    }

    public final int d() {
        int i = this.a;
        zhc zhcVar = this.c;
        switch (i) {
            case 0:
                return ((j18) zhcVar).e.c.j();
            default:
                return ((yx9) zhcVar).f;
        }
    }

    public final int e() {
        int i = this.a;
        zhc zhcVar = this.c;
        switch (i) {
            case 0:
                c18 c18Var = (c18) s72.H0(((j18) zhcVar).h().l);
                if (c18Var != null) {
                    return c18Var.a;
                }
                return 0;
            default:
                return ((ao8) s72.F0(((yx9) zhcVar).k().a)).a;
        }
    }

    public final void f(int i, int i2) {
        int i3 = this.a;
        zhc zhcVar = this.c;
        switch (i3) {
            case 0:
                ((j18) zhcVar).k(i, i2);
                break;
            default:
                yx9 yx9Var = (yx9) zhcVar;
                float fN = yx9Var.n();
                yx9Var.t(fN != 0.0f ? i2 / fN : 0.0f, i, true);
                break;
        }
    }
}
