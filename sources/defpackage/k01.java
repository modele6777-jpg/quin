package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k01 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public k01(b0... b0VarArr) {
        this.a = -1;
        this.b = -1;
        this.c = 0;
        this.d = b0VarArr;
    }

    public static final void B(int i) throws bng {
        if ((i & 3) == 0) {
            return;
        }
        s8f.q("Failed to parse the message.");
    }

    public static final void C(int i) throws bng {
        if ((i & 7) == 0) {
            return;
        }
        s8f.q("Failed to parse the message.");
    }

    public void A(int i) throws bng {
        if (((amg) this.d).e() == i) {
            return;
        }
        s8f.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public int D() {
        int iL = this.c;
        if (iL != 0) {
            this.a = iL;
            this.c = 0;
        } else {
            iL = ((amg) this.d).l();
            this.a = iL;
        }
        if (iL == 0 || iL == this.b) {
            return Integer.MAX_VALUE;
        }
        return iL >>> 3;
    }

    public xlg E() {
        w(2);
        return ((amg) this.d).y();
    }

    public void F(zmg zmgVar) throws bng {
        int iL;
        amg amgVar = (amg) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                zmgVar.add(Double.valueOf(amgVar.o()));
                if (amgVar.d()) {
                    return;
                } else {
                    iL = amgVar.l();
                }
            } while (iL == this.a);
            this.c = iL;
            return;
        }
        if (i != 2) {
            s8f.m();
            return;
        }
        int iA = amgVar.A();
        C(iA);
        int iE = amgVar.e() + iA;
        do {
            zmgVar.add(Double.valueOf(amgVar.o()));
        } while (amgVar.e() < iE);
    }

    public void G(zmg zmgVar) throws bng {
        int iL;
        amg amgVar = (amg) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int iA = amgVar.A();
            B(iA);
            int iE = amgVar.e() + iA;
            do {
                zmgVar.add(Float.valueOf(amgVar.p()));
            } while (amgVar.e() < iE);
            return;
        }
        if (i != 5) {
            s8f.m();
            return;
        }
        do {
            zmgVar.add(Float.valueOf(amgVar.p()));
            if (amgVar.d()) {
                return;
            } else {
                iL = amgVar.l();
            }
        } while (iL == this.a);
        this.c = iL;
    }

    public void H(zmg zmgVar) throws bng {
        int iL;
        int iL2;
        amg amgVar = (amg) this.d;
        boolean z = zmgVar instanceof fng;
        int i = this.a;
        if (z) {
            fng fngVar = (fng) zmgVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    s8f.m();
                    return;
                }
                int iE = amgVar.e() + amgVar.A();
                do {
                    fngVar.e(amgVar.q());
                } while (amgVar.e() < iE);
                A(iE);
                return;
            }
            do {
                fngVar.e(amgVar.q());
                if (amgVar.d()) {
                    return;
                } else {
                    iL2 = amgVar.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    s8f.m();
                    return;
                }
                int iE2 = amgVar.e() + amgVar.A();
                do {
                    zmgVar.add(Long.valueOf(amgVar.q()));
                } while (amgVar.e() < iE2);
                A(iE2);
                return;
            }
            do {
                zmgVar.add(Long.valueOf(amgVar.q()));
                if (amgVar.d()) {
                    return;
                } else {
                    iL = amgVar.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public synchronized mj a() {
        mj mjVar;
        try {
            int i = this.b + 1;
            this.b = i;
            int i2 = this.c;
            if (i2 > 0) {
                mj[] mjVarArr = (mj[]) this.d;
                int i3 = i2 - 1;
                this.c = i3;
                mjVar = mjVarArr[i3];
                mjVar.getClass();
                ((mj[]) this.d)[this.c] = null;
            } else {
                mj mjVar2 = new mj(new byte[65536], 0);
                mj[] mjVarArr2 = (mj[]) this.d;
                if (i > mjVarArr2.length) {
                    this.d = (mj[]) Arrays.copyOf(mjVarArr2, mjVarArr2.length * 2);
                }
                mjVar = mjVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return mjVar;
    }

    public int b(int i) {
        return ((rr9) this.d).n[this.b + i];
    }

    public Object c(int i) {
        return ((rr9) this.d).p[this.c + i];
    }

    public synchronized void d(y21 y21Var) {
        while (y21Var != null) {
            mj[] mjVarArr = (mj[]) this.d;
            int i = this.c;
            this.c = i + 1;
            mj mjVar = (mj) y21Var.c;
            mjVar.getClass();
            mjVarArr[i] = mjVar;
            this.b--;
            y21Var = (y21) y21Var.d;
            if (y21Var == null || ((mj) y21Var.c) == null) {
                y21Var = null;
            }
        }
    }

    public synchronized void e(int i) {
        boolean z = i < this.a;
        this.a = i;
        if (z) {
            f();
        }
    }

    public synchronized void f() {
        int iMax = Math.max(0, pqf.e(this.a, 65536) - this.b);
        int i = this.c;
        if (iMax >= i) {
            return;
        }
        Arrays.fill((mj[]) this.d, iMax, i, (Object) null);
        this.c = iMax;
    }

    public void g(zmg zmgVar) throws bng {
        int iL;
        int iL2;
        amg amgVar = (amg) this.d;
        boolean z = zmgVar instanceof fng;
        int i = this.a;
        if (z) {
            fng fngVar = (fng) zmgVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    s8f.m();
                    return;
                }
                int iE = amgVar.e() + amgVar.A();
                do {
                    fngVar.e(amgVar.r());
                } while (amgVar.e() < iE);
                A(iE);
                return;
            }
            do {
                fngVar.e(amgVar.r());
                if (amgVar.d()) {
                    return;
                } else {
                    iL2 = amgVar.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    s8f.m();
                    return;
                }
                int iE2 = amgVar.e() + amgVar.A();
                do {
                    zmgVar.add(Long.valueOf(amgVar.r()));
                } while (amgVar.e() < iE2);
                A(iE2);
                return;
            }
            do {
                zmgVar.add(Long.valueOf(amgVar.r()));
                if (amgVar.d()) {
                    return;
                } else {
                    iL = amgVar.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void h(zmg zmgVar) throws bng {
        int iL;
        int iL2;
        amg amgVar = (amg) this.d;
        boolean z = zmgVar instanceof pmg;
        int i = this.a;
        if (z) {
            pmg pmgVar = (pmg) zmgVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    s8f.m();
                    return;
                }
                int iE = amgVar.e() + amgVar.A();
                do {
                    pmgVar.e(amgVar.s());
                } while (amgVar.e() < iE);
                A(iE);
                return;
            }
            do {
                pmgVar.e(amgVar.s());
                if (amgVar.d()) {
                    return;
                } else {
                    iL2 = amgVar.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    s8f.m();
                    return;
                }
                int iE2 = amgVar.e() + amgVar.A();
                do {
                    zmgVar.add(Integer.valueOf(amgVar.s()));
                } while (amgVar.e() < iE2);
                A(iE2);
                return;
            }
            do {
                zmgVar.add(Integer.valueOf(amgVar.s()));
                if (amgVar.d()) {
                    return;
                } else {
                    iL = amgVar.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void i(zmg zmgVar) throws bng {
        int iL;
        int iL2;
        amg amgVar = (amg) this.d;
        boolean z = zmgVar instanceof fng;
        int i = this.a;
        if (z) {
            fng fngVar = (fng) zmgVar;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    s8f.m();
                    return;
                }
                int iA = amgVar.A();
                C(iA);
                int iE = amgVar.e() + iA;
                do {
                    fngVar.e(amgVar.t());
                } while (amgVar.e() < iE);
                return;
            }
            do {
                fngVar.e(amgVar.t());
                if (amgVar.d()) {
                    return;
                } else {
                    iL2 = amgVar.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    s8f.m();
                    return;
                }
                int iA2 = amgVar.A();
                C(iA2);
                int iE2 = amgVar.e() + iA2;
                do {
                    zmgVar.add(Long.valueOf(amgVar.t()));
                } while (amgVar.e() < iE2);
                return;
            }
            do {
                zmgVar.add(Long.valueOf(amgVar.t()));
                if (amgVar.d()) {
                    return;
                } else {
                    iL = amgVar.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void j(zmg zmgVar) throws bng {
        int iL;
        int iL2;
        amg amgVar = (amg) this.d;
        boolean z = zmgVar instanceof pmg;
        int i = this.a;
        if (z) {
            pmg pmgVar = (pmg) zmgVar;
            int i2 = i & 7;
            if (i2 == 2) {
                int iA = amgVar.A();
                B(iA);
                int iE = amgVar.e() + iA;
                do {
                    pmgVar.e(amgVar.u());
                } while (amgVar.e() < iE);
                return;
            }
            if (i2 != 5) {
                s8f.m();
                return;
            }
            do {
                pmgVar.e(amgVar.u());
                if (amgVar.d()) {
                    return;
                } else {
                    iL2 = amgVar.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iA2 = amgVar.A();
                B(iA2);
                int iE2 = amgVar.e() + iA2;
                do {
                    zmgVar.add(Integer.valueOf(amgVar.u()));
                } while (amgVar.e() < iE2);
                return;
            }
            if (i3 != 5) {
                s8f.m();
                return;
            }
            do {
                zmgVar.add(Integer.valueOf(amgVar.u()));
                if (amgVar.d()) {
                    return;
                } else {
                    iL = amgVar.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void k(zmg zmgVar) throws bng {
        int iL;
        amg amgVar = (amg) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                zmgVar.add(Boolean.valueOf(amgVar.v()));
                if (amgVar.d()) {
                    return;
                } else {
                    iL = amgVar.l();
                }
            } while (iL == this.a);
            this.c = iL;
            return;
        }
        if (i != 2) {
            s8f.m();
            return;
        }
        int iE = amgVar.e() + amgVar.A();
        do {
            zmgVar.add(Boolean.valueOf(amgVar.v()));
        } while (amgVar.e() < iE);
        A(iE);
    }

    public void l(zmg zmgVar, boolean z) throws ang {
        String strW;
        int iL;
        amg amgVar = (amg) this.d;
        if ((this.a & 7) != 2) {
            s8f.m();
            return;
        }
        do {
            if (z) {
                w(2);
                strW = amgVar.x();
            } else {
                w(2);
                strW = amgVar.w();
            }
            zmgVar.add(strW);
            if (amgVar.d()) {
                return;
            } else {
                iL = amgVar.l();
            }
        } while (iL == this.a);
        this.c = iL;
    }

    public void m(zmg zmgVar, yng yngVar, hmg hmgVar) throws bng {
        int iL;
        int i = this.a;
        if ((i & 7) != 2) {
            s8f.m();
            return;
        }
        do {
            omg omgVarB = yngVar.b();
            x(omgVarB, yngVar, hmgVar);
            yngVar.c(omgVarB);
            zmgVar.add(omgVarB);
            amg amgVar = (amg) this.d;
            if (amgVar.d() || this.c != 0) {
                return;
            } else {
                iL = amgVar.l();
            }
        } while (iL == i);
        this.c = iL;
    }

    public void n(zmg zmgVar, yng yngVar, hmg hmgVar) throws ang {
        int iL;
        int i = this.a;
        if ((i & 7) != 3) {
            s8f.m();
            return;
        }
        do {
            omg omgVarB = yngVar.b();
            y(omgVarB, yngVar, hmgVar);
            yngVar.c(omgVarB);
            zmgVar.add(omgVarB);
            amg amgVar = (amg) this.d;
            if (amgVar.d() || this.c != 0) {
                return;
            } else {
                iL = amgVar.l();
            }
        } while (iL == i);
        this.c = iL;
    }

    public void o(zmg zmgVar) throws ang {
        int iL;
        if ((this.a & 7) != 2) {
            s8f.m();
            return;
        }
        do {
            zmgVar.add(E());
            amg amgVar = (amg) this.d;
            if (amgVar.d()) {
                return;
            } else {
                iL = amgVar.l();
            }
        } while (iL == this.a);
        this.c = iL;
    }

    public void p(zmg zmgVar) throws bng {
        int iL;
        int iL2;
        amg amgVar = (amg) this.d;
        boolean z = zmgVar instanceof pmg;
        int i = this.a;
        if (z) {
            pmg pmgVar = (pmg) zmgVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    s8f.m();
                    return;
                }
                int iE = amgVar.e() + amgVar.A();
                do {
                    pmgVar.e(amgVar.A());
                } while (amgVar.e() < iE);
                A(iE);
                return;
            }
            do {
                pmgVar.e(amgVar.A());
                if (amgVar.d()) {
                    return;
                } else {
                    iL2 = amgVar.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    s8f.m();
                    return;
                }
                int iE2 = amgVar.e() + amgVar.A();
                do {
                    zmgVar.add(Integer.valueOf(amgVar.A()));
                } while (amgVar.e() < iE2);
                A(iE2);
                return;
            }
            do {
                zmgVar.add(Integer.valueOf(amgVar.A()));
                if (amgVar.d()) {
                    return;
                } else {
                    iL = amgVar.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void q(zmg zmgVar) throws bng {
        int iL;
        int iL2;
        amg amgVar = (amg) this.d;
        boolean z = zmgVar instanceof pmg;
        int i = this.a;
        if (z) {
            pmg pmgVar = (pmg) zmgVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    s8f.m();
                    return;
                }
                int iE = amgVar.e() + amgVar.A();
                do {
                    pmgVar.e(amgVar.B());
                } while (amgVar.e() < iE);
                A(iE);
                return;
            }
            do {
                pmgVar.e(amgVar.B());
                if (amgVar.d()) {
                    return;
                } else {
                    iL2 = amgVar.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    s8f.m();
                    return;
                }
                int iE2 = amgVar.e() + amgVar.A();
                do {
                    zmgVar.add(Integer.valueOf(amgVar.B()));
                } while (amgVar.e() < iE2);
                A(iE2);
                return;
            }
            do {
                zmgVar.add(Integer.valueOf(amgVar.B()));
                if (amgVar.d()) {
                    return;
                } else {
                    iL = amgVar.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void r(zmg zmgVar) throws bng {
        int iL;
        int iL2;
        amg amgVar = (amg) this.d;
        boolean z = zmgVar instanceof pmg;
        int i = this.a;
        if (z) {
            pmg pmgVar = (pmg) zmgVar;
            int i2 = i & 7;
            if (i2 == 2) {
                int iA = amgVar.A();
                B(iA);
                int iE = amgVar.e() + iA;
                do {
                    pmgVar.e(amgVar.C());
                } while (amgVar.e() < iE);
                return;
            }
            if (i2 != 5) {
                s8f.m();
                return;
            }
            do {
                pmgVar.e(amgVar.C());
                if (amgVar.d()) {
                    return;
                } else {
                    iL2 = amgVar.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iA2 = amgVar.A();
                B(iA2);
                int iE2 = amgVar.e() + iA2;
                do {
                    zmgVar.add(Integer.valueOf(amgVar.C()));
                } while (amgVar.e() < iE2);
                return;
            }
            if (i3 != 5) {
                s8f.m();
                return;
            }
            do {
                zmgVar.add(Integer.valueOf(amgVar.C()));
                if (amgVar.d()) {
                    return;
                } else {
                    iL = amgVar.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void s(zmg zmgVar) throws bng {
        int iL;
        int iL2;
        amg amgVar = (amg) this.d;
        boolean z = zmgVar instanceof fng;
        int i = this.a;
        if (z) {
            fng fngVar = (fng) zmgVar;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    s8f.m();
                    return;
                }
                int iA = amgVar.A();
                C(iA);
                int iE = amgVar.e() + iA;
                do {
                    fngVar.e(amgVar.D());
                } while (amgVar.e() < iE);
                return;
            }
            do {
                fngVar.e(amgVar.D());
                if (amgVar.d()) {
                    return;
                } else {
                    iL2 = amgVar.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    s8f.m();
                    return;
                }
                int iA2 = amgVar.A();
                C(iA2);
                int iE2 = amgVar.e() + iA2;
                do {
                    zmgVar.add(Long.valueOf(amgVar.D()));
                } while (amgVar.e() < iE2);
                return;
            }
            do {
                zmgVar.add(Long.valueOf(amgVar.D()));
                if (amgVar.d()) {
                    return;
                } else {
                    iL = amgVar.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void t(zmg zmgVar) throws bng {
        int iL;
        int iL2;
        amg amgVar = (amg) this.d;
        boolean z = zmgVar instanceof pmg;
        int i = this.a;
        if (z) {
            pmg pmgVar = (pmg) zmgVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    s8f.m();
                    return;
                }
                int iE = amgVar.e() + amgVar.A();
                do {
                    pmgVar.e(amgVar.E());
                } while (amgVar.e() < iE);
                A(iE);
                return;
            }
            do {
                pmgVar.e(amgVar.E());
                if (amgVar.d()) {
                    return;
                } else {
                    iL2 = amgVar.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    s8f.m();
                    return;
                }
                int iE2 = amgVar.e() + amgVar.A();
                do {
                    zmgVar.add(Integer.valueOf(amgVar.E()));
                } while (amgVar.e() < iE2);
                A(iE2);
                return;
            }
            do {
                zmgVar.add(Integer.valueOf(amgVar.E()));
                if (amgVar.d()) {
                    return;
                } else {
                    iL = amgVar.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void u(zmg zmgVar) throws bng {
        int iL;
        int iL2;
        amg amgVar = (amg) this.d;
        boolean z = zmgVar instanceof fng;
        int i = this.a;
        if (z) {
            fng fngVar = (fng) zmgVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    s8f.m();
                    return;
                }
                int iE = amgVar.e() + amgVar.A();
                do {
                    fngVar.e(amgVar.F());
                } while (amgVar.e() < iE);
                A(iE);
                return;
            }
            do {
                fngVar.e(amgVar.F());
                if (amgVar.d()) {
                    return;
                } else {
                    iL2 = amgVar.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    s8f.m();
                    return;
                }
                int iE2 = amgVar.e() + amgVar.A();
                do {
                    zmgVar.add(Long.valueOf(amgVar.F()));
                } while (amgVar.e() < iE2);
                A(iE2);
                return;
            }
            do {
                zmgVar.add(Long.valueOf(amgVar.F()));
                if (amgVar.d()) {
                    return;
                } else {
                    iL = amgVar.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void v(hng hngVar, psd psdVar, hmg hmgVar) {
        int i;
        int i2;
        w(2);
        amg amgVar = (amg) this.d;
        int iA = amgVar.a(amgVar.A());
        Object obj = psdVar.c;
        Object objZ = "";
        Object objZ2 = obj;
        while (true) {
            try {
                int iD = D();
                if (iD == Integer.MAX_VALUE || amgVar.d()) {
                    break;
                }
                boolean zN = false;
                if (iD == 1) {
                    objZ = z((log) psdVar.b, null, null);
                } else if (iD != 2) {
                    try {
                        if (!((amgVar.d() || (i2 = this.a) == this.b) ? false : amgVar.n(i2))) {
                            throw new bng("Unable to parse map entry.");
                        }
                    } catch (ang e) {
                        if (!amgVar.d() && (i = this.a) != this.b) {
                            zN = amgVar.n(i);
                        }
                        if (!zN) {
                            throw new bng("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objZ2 = z((log) psdVar.d, obj.getClass(), hmgVar);
                }
            } catch (Throwable th) {
                amgVar.b(iA);
                throw th;
            }
        }
        hngVar.put(objZ, objZ2);
        amgVar.b(iA);
    }

    public void w(int i) {
        if ((this.a & 7) == i) {
            return;
        }
        s8f.m();
    }

    public void x(Object obj, yng yngVar, hmg hmgVar) throws bng {
        amg amgVar = (amg) this.d;
        int iA = amgVar.A();
        if (amgVar.a + amgVar.b >= 100) {
            s8f.q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iA2 = amgVar.a(iA);
        amgVar.a++;
        yngVar.g(obj, this, hmgVar);
        amgVar.m(0);
        amgVar.a--;
        amgVar.b(iA2);
    }

    public void y(Object obj, yng yngVar, hmg hmgVar) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            yngVar.g(obj, this, hmgVar);
            if (this.a != this.b) {
                throw new bng("Failed to parse the message.");
            }
            this.b = i;
        } catch (Throwable th) {
            this.b = i;
            throw th;
        }
    }

    public Object z(log logVar, Class cls, hmg hmgVar) throws bng {
        amg amgVar = (amg) this.d;
        log logVar2 = log.a;
        switch (logVar.ordinal()) {
            case 0:
                w(1);
                return Double.valueOf(amgVar.o());
            case 1:
                w(5);
                return Float.valueOf(amgVar.p());
            case 2:
                w(0);
                return Long.valueOf(amgVar.r());
            case 3:
                w(0);
                return Long.valueOf(amgVar.q());
            case 4:
                w(0);
                return Integer.valueOf(amgVar.s());
            case 5:
                w(1);
                return Long.valueOf(amgVar.t());
            case 6:
                w(5);
                return Integer.valueOf(amgVar.u());
            case 7:
                w(0);
                return Boolean.valueOf(amgVar.v());
            case 8:
                w(2);
                return amgVar.x();
            case 9:
            default:
                qc0.j("unsupported field type.");
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                w(2);
                yng yngVarA = vng.c.a(cls);
                omg omgVarB = yngVarA.b();
                x(omgVarB, yngVarA, hmgVar);
                yngVarA.c(omgVarB);
                return omgVarB;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return E();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                w(0);
                return Integer.valueOf(amgVar.A());
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                w(0);
                return Integer.valueOf(amgVar.B());
            case 14:
                w(5);
                return Integer.valueOf(amgVar.C());
            case 15:
                w(1);
                return Long.valueOf(amgVar.D());
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                w(0);
                return Integer.valueOf(amgVar.E());
            case 17:
                w(0);
                return Long.valueOf(amgVar.F());
        }
    }

    public k01(amg amgVar) {
        this.c = 0;
        this.d = amgVar;
        amgVar.c = this;
    }
}
