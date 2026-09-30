package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f01 {
    public final long a;
    public final long b;
    public final long c;
    public final a26 d;

    public f01() {
        long jL = w6c.l(6);
        long jL2 = w6c.l(3);
        long jL3 = w6c.l(6);
        v8 v8Var = v8.K0;
        this.a = jL;
        this.b = jL2;
        this.c = jL3;
        this.d = v8Var;
    }

    public final void a(c4c c4cVar, l46 l46Var, int i) {
        int i2;
        l46Var.h0(2046098125);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(c4cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(this) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            long j = ((y72) this.d.d(new y72(b4c.c(c4cVar, l46Var)))).a;
            long j2 = this.a;
            boolean zF = l46Var.f(j2);
            long j3 = this.c;
            boolean zF2 = zF | l46Var.f(j3);
            long j4 = this.b;
            boolean zF3 = zF2 | l46Var.f(j4) | l46Var.f(j);
            Object objR = l46Var.R();
            if (zF3 || objR == sf2.a) {
                objR = tm7.o(b.p(ynb.d0(sw3Var.F(j2), 0.0f, sw3Var.F(j3), 0.0f, 10, g09.a), sw3Var.F(j4)), j, a7c.a());
                l46Var.p0(objR);
            }
            s21.a((j09) objR, l46Var, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(this, c4cVar, i, 4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f01)) {
            return false;
        }
        f01 f01Var = (f01) obj;
        return wue.a(this.a, f01Var.a) && wue.a(this.b, f01Var.b) && wue.a(this.c, f01Var.c) && this.d.equals(f01Var.d);
    }

    public final int hashCode() {
        xue[] xueVarArr = wue.b;
        return this.d.hashCode() + ib8.b(ib8.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strE = wue.e(this.a);
        String strE2 = wue.e(this.b);
        String strE3 = wue.e(this.c);
        StringBuilder sbO = ib8.o("BarGutter(startMargin=", strE, ", barWidth=", strE2, ", endMargin=");
        sbO.append(strE3);
        sbO.append(", color=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
