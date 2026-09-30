package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xl9 implements l95 {
    public n95 a;
    public h3e b;
    public boolean c;

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        try {
            return g(m95Var);
        } catch (l0a unused) {
            return false;
        }
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        h3e h3eVar = this.b;
        if (h3eVar != null) {
            zl9 zl9Var = h3eVar.a;
            am9 am9Var = zl9Var.a;
            am9Var.a = 0;
            am9Var.b = 0L;
            am9Var.c = 0;
            am9Var.d = 0;
            am9Var.e = 0;
            zl9Var.b.J(0);
            zl9Var.c = -1;
            zl9Var.e = false;
            if (j == 0) {
                h3eVar.d(!h3eVar.l);
                return;
            }
            if (h3eVar.h != 0) {
                long j3 = (((long) h3eVar.i) * j2) / 1000000;
                h3eVar.e = j3;
                bm9 bm9Var = h3eVar.d;
                String str = pqf.a;
                bm9Var.f(j3);
                h3eVar.h = 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0172 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) throws l0a {
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!g(m95Var)) {
                throw l0a.a(null, "Failed to determine bitstream type");
            }
            m95Var.k();
        }
        int i = 0;
        if (!this.c) {
            k1f k1fVarN = this.a.n(0, 1);
            this.a.j();
            h3e h3eVar = this.b;
            h3eVar.c = this.a;
            h3eVar.b = k1fVarN;
            h3eVar.d(true);
            this.c = true;
        }
        h3e h3eVar2 = this.b;
        zl9 zl9Var = h3eVar2.a;
        d0a d0aVar = zl9Var.b;
        h3eVar2.b.getClass();
        String str = pqf.a;
        int i2 = h3eVar2.h;
        if (i2 == 0) {
            while (zl9Var.b(m95Var)) {
                long position = m95Var.getPosition();
                long j = h3eVar2.f;
                h3eVar2.k = position - j;
                if (!h3eVar2.c(d0aVar, j, h3eVar2.j)) {
                    rr5 rr5Var = (rr5) h3eVar2.j.b;
                    h3eVar2.i = rr5Var.L;
                    if (!h3eVar2.m) {
                        h3eVar2.b.g(rr5Var);
                        h3eVar2.m = true;
                    }
                    y21 y21Var = (y21) h3eVar2.j.c;
                    if (y21Var == null) {
                        if (m95Var.getLength() == -1) {
                            h3eVar2.d = new g3e(i);
                        } else {
                            am9 am9Var = zl9Var.a;
                            h3eVar2.d = new as3(h3eVar2, h3eVar2.f, m95Var.getLength(), am9Var.d + am9Var.e, am9Var.b, (am9Var.a & 4) != 0);
                        }
                        h3eVar2.h = 2;
                        bArr = d0aVar.a;
                        if (bArr.length == 65025) {
                            return 0;
                        }
                        d0aVar.K(Arrays.copyOf(bArr, Math.max(65025, d0aVar.c)), d0aVar.c);
                        return 0;
                    }
                    h3eVar2.d = y21Var;
                    h3eVar2.h = 2;
                    bArr = d0aVar.a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    d0aVar.K(Arrays.copyOf(bArr, Math.max(65025, d0aVar.c)), d0aVar.c);
                    return 0;
                }
                h3eVar2.f = m95Var.getPosition();
            }
            h3eVar2.h = 3;
            return -1;
        }
        if (i2 == 1) {
            m95Var.l((int) h3eVar2.f);
            h3eVar2.h = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return -1;
            }
            r3.l();
            return 0;
        }
        long jA = h3eVar2.d.a(m95Var);
        if (jA >= 0) {
            d82Var.b = jA;
            return 1;
        }
        if (jA < -1) {
            h3eVar2.a(-(jA + 2));
        }
        if (!h3eVar2.l) {
            xsc xscVarD = h3eVar2.d.d();
            xscVarD.getClass();
            h3eVar2.c.q(xscVarD);
            h3eVar2.b.d(xscVarD.h());
            h3eVar2.l = true;
        }
        if (h3eVar2.k <= 0 && !zl9Var.b(m95Var)) {
            h3eVar2.h = 3;
            return -1;
        }
        h3eVar2.k = 0L;
        long jB = h3eVar2.b(d0aVar);
        if (jB >= 0) {
            long j2 = h3eVar2.g;
            if (j2 + jB >= h3eVar2.e) {
                long j3 = (j2 * 1000000) / ((long) h3eVar2.i);
                h3eVar2.b.e(d0aVar.c, d0aVar);
                h3eVar2.b.a(j3, 1, d0aVar.c, 0, null);
                h3eVar2.e = -1L;
            }
        }
        h3eVar2.g += jB;
        return 0;
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        this.a = n95Var;
    }

    public final boolean g(m95 m95Var) {
        boolean zT;
        am9 am9Var = new am9();
        if (am9Var.a(m95Var, true) && (am9Var.a & 2) == 2) {
            int iMin = Math.min(am9Var.e, 8);
            d0a d0aVar = new d0a(iMin);
            m95Var.o(d0aVar.a, 0, iMin);
            d0aVar.M(0);
            if (d0aVar.a() >= 5 && d0aVar.z() == 127 && d0aVar.B() == 1179402563) {
                this.b = new ai5();
                return true;
            }
            d0aVar.M(0);
            try {
                zT = afc.t(1, d0aVar, true);
            } catch (l0a unused) {
                zT = false;
            }
            if (zT) {
                this.b = new czf();
            } else {
                d0aVar.M(0);
                if (cs9.e(d0aVar, cs9.o)) {
                    this.b = new cs9();
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.l95
    public final void a() {
    }
}
