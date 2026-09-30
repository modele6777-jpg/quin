package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vr6 implements u25 {
    public static final si6 f;
    public final hm9 a;
    public final t25 b;
    public final ta0 c;
    public int d;
    public final zy1 e;

    static {
        si6 si6Var = si6.b;
        f = y41.G("OkHttp-Response-Body", "Truncated");
    }

    public vr6(hm9 hm9Var, t25 t25Var, ta0 ta0Var) {
        ta0Var.getClass();
        this.a = hm9Var;
        this.b = t25Var;
        this.c = ta0Var;
        this.e = new zy1((yhb) ta0Var.d);
    }

    @Override // defpackage.u25
    public final mtd a(ryb rybVar) {
        btb btbVar = rybVar.a;
        if (!ss6.a(rybVar)) {
            return k(btbVar.a, 0L);
        }
        String strC = rybVar.f.c("Transfer-Encoding");
        if (strC == null) {
            strC = null;
        }
        if ("chunked".equalsIgnoreCase(strC)) {
            ct6 ct6Var = btbVar.a;
            if (this.d == 4) {
                this.d = 5;
                return new sr6(this, ct6Var);
            }
            cva.t(this.d, "state: ");
            return null;
        }
        long jE = keg.e(rybVar);
        if (jE != -1) {
            return k(btbVar.a, jE);
        }
        ct6 ct6Var2 = btbVar.a;
        if (this.d != 4) {
            cva.t(this.d, "state: ");
            return null;
        }
        this.d = 5;
        this.b.e();
        ct6Var2.getClass();
        return new ur6(this, ct6Var2);
    }

    @Override // defpackage.u25
    public final void b(btb btbVar) {
        btbVar.getClass();
        Proxy.Type type = this.b.h().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(btbVar.b);
        sb.append(' ');
        ct6 ct6Var = btbVar.a;
        if (ct6Var.f() || type != Proxy.Type.HTTP) {
            String strB = ct6Var.b();
            String strD = ct6Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(ct6Var);
        }
        sb.append(" HTTP/1.1");
        l(btbVar.c, sb.toString());
    }

    @Override // defpackage.u25
    public final void c() {
        ((xhb) this.c.b).flush();
    }

    @Override // defpackage.u25
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.u25
    public final boolean d() {
        return this.d == 6;
    }

    @Override // defpackage.u25
    public final long e(ryb rybVar) {
        if (!ss6.a(rybVar)) {
            return 0L;
        }
        String strC = rybVar.f.c("Transfer-Encoding");
        if (strC == null) {
            strC = null;
        }
        if ("chunked".equalsIgnoreCase(strC)) {
            return -1L;
        }
        return keg.e(rybVar);
    }

    @Override // defpackage.u25
    public final wkd f(btb btbVar, long j) {
        btbVar.getClass();
        if ("chunked".equalsIgnoreCase(btbVar.c.c("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new rr6(this);
            }
            cva.t(this.d, "state: ");
            return null;
        }
        if (j == -1) {
            qc0.p("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = 2;
            return new wa5(this);
        }
        cva.t(this.d, "state: ");
        return null;
    }

    @Override // defpackage.u25
    public final pyb g(boolean z) {
        zy1 zy1Var = this.e;
        yhb yhbVar = (yhb) zy1Var.c;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            cva.t(this.d, "state: ");
            return null;
        }
        try {
            String strG0 = yhbVar.g0(zy1Var.b);
            zy1Var.b -= (long) strG0.length();
            os osVarJ = jcc.j(strG0);
            int i2 = osVarJ.b;
            pyb pybVar = new pyb();
            pybVar.b = (a1b) osVarJ.c;
            pybVar.c = i2;
            pybVar.d = (String) osVarJ.d;
            qi6 qi6Var = new qi6();
            while (true) {
                String strG1 = yhbVar.g0(zy1Var.b);
                zy1Var.b -= (long) strG1.length();
                if (strG1.length() == 0) {
                    break;
                }
                qi6Var.d(strG1);
            }
            pybVar.f = xdc.j(xdc.h(qi6Var));
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return pybVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return pybVar;
            }
            this.d = 3;
            return pybVar;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.h().a.h.i()), e);
        }
    }

    @Override // defpackage.u25
    public final void h() {
        ((xhb) this.c.b).flush();
    }

    @Override // defpackage.u25
    public final rsd i() {
        return this.c;
    }

    @Override // defpackage.u25
    public final t25 j() {
        return this.b;
    }

    public final tr6 k(ct6 ct6Var, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new tr6(this, ct6Var, j);
        }
        cva.t(this.d, "state: ");
        return null;
    }

    public final void l(si6 si6Var, String str) {
        if (this.d != 0) {
            cva.t(this.d, "state: ");
            return;
        }
        ta0 ta0Var = this.c;
        xhb xhbVar = (xhb) ta0Var.b;
        xhbVar.i0(str);
        xhbVar.i0("\r\n");
        int size = si6Var.size();
        int i = 0;
        while (true) {
            xhb xhbVar2 = (xhb) ta0Var.b;
            if (i >= size) {
                xhbVar2.i0("\r\n");
                this.d = 1;
                return;
            } else {
                xhbVar2.i0(xdc.i(si6Var, i));
                xhbVar2.i0(": ");
                xhbVar2.i0(xdc.k(si6Var, i));
                xhbVar2.i0("\r\n");
                i++;
            }
        }
    }
}
