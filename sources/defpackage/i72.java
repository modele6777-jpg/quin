package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i72 {
    public final h72 a;
    public int b;
    public int c;
    public int d = 0;

    public i72(h72 h72Var) {
        Charset charset = r87.a;
        this.a = h72Var;
        h72Var.b = this;
    }

    public final int a() {
        int iZ = this.d;
        if (iZ != 0) {
            this.b = iZ;
            this.d = 0;
        } else {
            iZ = this.a.z();
            this.b = iZ;
        }
        if (iZ == 0 || iZ == this.c) {
            return Integer.MAX_VALUE;
        }
        return iZ >>> 3;
    }

    public final void b(Object obj, gfc gfcVar, p85 p85Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            gfcVar.f(obj, this, p85Var);
            if (this.b != this.c) {
                throw new ya7("Failed to parse the message.");
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final void c(Object obj, gfc gfcVar, p85 p85Var) throws ya7 {
        h72 h72Var = this.a;
        int iA = h72Var.A();
        if (h72Var.a >= 100) {
            throw new ya7("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iJ = h72Var.j(iA);
        h72Var.a++;
        gfcVar.f(obj, this, p85Var);
        h72Var.a(0);
        h72Var.a--;
        h72Var.h(iJ);
    }

    public final void d(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 0) {
            do {
                ((x0b) o87Var).add(Boolean.valueOf(h72Var.k()));
                if (h72Var.c()) {
                    return;
                } else {
                    iZ = h72Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw ya7.c();
        }
        int iB = h72Var.b() + h72Var.A();
        do {
            ((x0b) o87Var).add(Boolean.valueOf(h72Var.k()));
        } while (h72Var.b() < iB);
        v(iB);
    }

    public final b71 e() throws ya7.a {
        w(2);
        return this.a.l();
    }

    public final void f(o87 o87Var) throws ya7.a {
        int iZ;
        if ((this.b & 7) != 2) {
            throw ya7.c();
        }
        do {
            ((x0b) o87Var).add(e());
            h72 h72Var = this.a;
            if (h72Var.c()) {
                return;
            } else {
                iZ = h72Var.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public final void g(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 1) {
            do {
                ((x0b) o87Var).add(Double.valueOf(h72Var.m()));
                if (h72Var.c()) {
                    return;
                } else {
                    iZ = h72Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw ya7.c();
        }
        int iA = h72Var.A();
        if ((iA & 7) != 0) {
            throw new ya7("Failed to parse the message.");
        }
        int iB = h72Var.b() + iA;
        do {
            ((x0b) o87Var).add(Double.valueOf(h72Var.m()));
        } while (h72Var.b() < iB);
    }

    public final void h(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 0) {
            do {
                ((x0b) o87Var).add(Integer.valueOf(h72Var.n()));
                if (h72Var.c()) {
                    return;
                } else {
                    iZ = h72Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw ya7.c();
        }
        int iB = h72Var.b() + h72Var.A();
        do {
            ((x0b) o87Var).add(Integer.valueOf(h72Var.n()));
        } while (h72Var.b() < iB);
        v(iB);
    }

    public final Object i(y9g y9gVar, Class cls, p85 p85Var) throws ya7 {
        int iOrdinal = y9gVar.ordinal();
        h72 h72Var = this.a;
        switch (iOrdinal) {
            case 0:
                w(1);
                return Double.valueOf(h72Var.m());
            case 1:
                w(5);
                return Float.valueOf(h72Var.q());
            case 2:
                w(0);
                return Long.valueOf(h72Var.s());
            case 3:
                w(0);
                return Long.valueOf(h72Var.B());
            case 4:
                w(0);
                return Integer.valueOf(h72Var.r());
            case 5:
                w(1);
                return Long.valueOf(h72Var.p());
            case 6:
                w(5);
                return Integer.valueOf(h72Var.o());
            case 7:
                w(0);
                return Boolean.valueOf(h72Var.k());
            case 8:
                w(2);
                return h72Var.y();
            case 9:
            default:
                qc0.j("unsupported field type.");
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                w(2);
                gfc gfcVarA = v0b.c.a(cls);
                v56 v56VarD = gfcVarA.d();
                c(v56VarD, gfcVarA, p85Var);
                gfcVarA.b(v56VarD);
                return v56VarD;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return e();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                w(0);
                return Integer.valueOf(h72Var.A());
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                w(0);
                return Integer.valueOf(h72Var.n());
            case 14:
                w(5);
                return Integer.valueOf(h72Var.t());
            case 15:
                w(1);
                return Long.valueOf(h72Var.u());
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                w(0);
                return Integer.valueOf(h72Var.v());
            case 17:
                w(0);
                return Long.valueOf(h72Var.w());
        }
    }

    public final void j(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 2) {
            int iA = h72Var.A();
            if ((iA & 3) != 0) {
                throw new ya7("Failed to parse the message.");
            }
            int iB = h72Var.b() + iA;
            do {
                ((x0b) o87Var).add(Integer.valueOf(h72Var.o()));
            } while (h72Var.b() < iB);
            return;
        }
        if (i != 5) {
            throw ya7.c();
        }
        do {
            ((x0b) o87Var).add(Integer.valueOf(h72Var.o()));
            if (h72Var.c()) {
                return;
            } else {
                iZ = h72Var.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public final void k(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 1) {
            do {
                ((x0b) o87Var).add(Long.valueOf(h72Var.p()));
                if (h72Var.c()) {
                    return;
                } else {
                    iZ = h72Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw ya7.c();
        }
        int iA = h72Var.A();
        if ((iA & 7) != 0) {
            throw new ya7("Failed to parse the message.");
        }
        int iB = h72Var.b() + iA;
        do {
            ((x0b) o87Var).add(Long.valueOf(h72Var.p()));
        } while (h72Var.b() < iB);
    }

    public final void l(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 2) {
            int iA = h72Var.A();
            if ((iA & 3) != 0) {
                throw new ya7("Failed to parse the message.");
            }
            int iB = h72Var.b() + iA;
            do {
                ((x0b) o87Var).add(Float.valueOf(h72Var.q()));
            } while (h72Var.b() < iB);
            return;
        }
        if (i != 5) {
            throw ya7.c();
        }
        do {
            ((x0b) o87Var).add(Float.valueOf(h72Var.q()));
            if (h72Var.c()) {
                return;
            } else {
                iZ = h72Var.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public final void m(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 0) {
            do {
                ((x0b) o87Var).add(Integer.valueOf(h72Var.r()));
                if (h72Var.c()) {
                    return;
                } else {
                    iZ = h72Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw ya7.c();
        }
        int iB = h72Var.b() + h72Var.A();
        do {
            ((x0b) o87Var).add(Integer.valueOf(h72Var.r()));
        } while (h72Var.b() < iB);
        v(iB);
    }

    public final void n(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 0) {
            do {
                ((x0b) o87Var).add(Long.valueOf(h72Var.s()));
                if (h72Var.c()) {
                    return;
                } else {
                    iZ = h72Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw ya7.c();
        }
        int iB = h72Var.b() + h72Var.A();
        do {
            ((x0b) o87Var).add(Long.valueOf(h72Var.s()));
        } while (h72Var.b() < iB);
        v(iB);
    }

    public final void o(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 2) {
            int iA = h72Var.A();
            if ((iA & 3) != 0) {
                throw new ya7("Failed to parse the message.");
            }
            int iB = h72Var.b() + iA;
            do {
                ((x0b) o87Var).add(Integer.valueOf(h72Var.t()));
            } while (h72Var.b() < iB);
            return;
        }
        if (i != 5) {
            throw ya7.c();
        }
        do {
            ((x0b) o87Var).add(Integer.valueOf(h72Var.t()));
            if (h72Var.c()) {
                return;
            } else {
                iZ = h72Var.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public final void p(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 1) {
            do {
                ((x0b) o87Var).add(Long.valueOf(h72Var.u()));
                if (h72Var.c()) {
                    return;
                } else {
                    iZ = h72Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw ya7.c();
        }
        int iA = h72Var.A();
        if ((iA & 7) != 0) {
            throw new ya7("Failed to parse the message.");
        }
        int iB = h72Var.b() + iA;
        do {
            ((x0b) o87Var).add(Long.valueOf(h72Var.u()));
        } while (h72Var.b() < iB);
    }

    public final void q(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 0) {
            do {
                ((x0b) o87Var).add(Integer.valueOf(h72Var.v()));
                if (h72Var.c()) {
                    return;
                } else {
                    iZ = h72Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw ya7.c();
        }
        int iB = h72Var.b() + h72Var.A();
        do {
            ((x0b) o87Var).add(Integer.valueOf(h72Var.v()));
        } while (h72Var.b() < iB);
        v(iB);
    }

    public final void r(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 0) {
            do {
                ((x0b) o87Var).add(Long.valueOf(h72Var.w()));
                if (h72Var.c()) {
                    return;
                } else {
                    iZ = h72Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw ya7.c();
        }
        int iB = h72Var.b() + h72Var.A();
        do {
            ((x0b) o87Var).add(Long.valueOf(h72Var.w()));
        } while (h72Var.b() < iB);
        v(iB);
    }

    public final void s(o87 o87Var, boolean z) throws ya7.a {
        String strX;
        int iZ;
        if ((this.b & 7) != 2) {
            throw ya7.c();
        }
        do {
            h72 h72Var = this.a;
            if (z) {
                w(2);
                strX = h72Var.y();
            } else {
                w(2);
                strX = h72Var.x();
            }
            ((x0b) o87Var).add(strX);
            if (h72Var.c()) {
                return;
            } else {
                iZ = h72Var.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public final void t(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 0) {
            do {
                ((x0b) o87Var).add(Integer.valueOf(h72Var.A()));
                if (h72Var.c()) {
                    return;
                } else {
                    iZ = h72Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw ya7.c();
        }
        int iB = h72Var.b() + h72Var.A();
        do {
            ((x0b) o87Var).add(Integer.valueOf(h72Var.A()));
        } while (h72Var.b() < iB);
        v(iB);
    }

    public final void u(o87 o87Var) throws ya7 {
        int iZ;
        int i = this.b & 7;
        h72 h72Var = this.a;
        if (i == 0) {
            do {
                ((x0b) o87Var).add(Long.valueOf(h72Var.B()));
                if (h72Var.c()) {
                    return;
                } else {
                    iZ = h72Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw ya7.c();
        }
        int iB = h72Var.b() + h72Var.A();
        do {
            ((x0b) o87Var).add(Long.valueOf(h72Var.B()));
        } while (h72Var.b() < iB);
        v(iB);
    }

    public final void v(int i) throws ya7 {
        if (this.a.b() != i) {
            throw ya7.i();
        }
    }

    public final void w(int i) throws ya7.a {
        if ((this.b & 7) != i) {
            throw ya7.c();
        }
    }

    public final boolean x() {
        int i;
        h72 h72Var = this.a;
        if (h72Var.c() || (i = this.b) == this.c) {
            return false;
        }
        return h72Var.C(i);
    }
}
