package defpackage;

import android.view.Surface;
import com.adjust.sdk.sig.r3;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gu3 implements tuf {
    public final iuf a;
    public final juf b;
    public final ouf c;
    public final ArrayDeque d;
    public final qh5 e;
    public Surface f;
    public rr5 g;
    public long h;
    public ruf i;
    public Executor j;
    public guf k;

    public gu3(iuf iufVar, juf jufVar, ece eceVar) {
        this.a = iufVar;
        this.b = jufVar;
        iufVar.k = eceVar;
        qh5 qh5Var = new qh5(new jv2(25, iufVar));
        this.e = qh5Var;
        this.c = new ouf(new a90(this), iufVar, jufVar, qh5Var);
        this.d = new ArrayDeque();
        this.g = new rr5(new qr5());
        this.h = -9223372036854775807L;
        this.i = ruf.a;
        this.j = new mc0(2);
        this.k = new eu3();
    }

    @Override // defpackage.tuf
    public final boolean b() {
        return true;
    }

    @Override // defpackage.tuf
    public final boolean c() {
        ouf oufVar = this.c;
        long j = oufVar.k;
        return j != -9223372036854775807L && oufVar.j == j;
    }

    @Override // defpackage.tuf
    public final void d() {
        this.b.b();
        iuf iufVar = this.a;
        iufVar.d = false;
        iufVar.h = -9223372036854775807L;
        nuf nufVar = iufVar.b;
        nufVar.d = false;
        kuf kufVar = nufVar.c;
        if (kufVar != null) {
            kufVar.b();
        }
        nufVar.a();
    }

    @Override // defpackage.tuf
    public final void e() {
        this.b.b();
        this.a.d();
    }

    @Override // defpackage.tuf
    public final void f(rr5 rr5Var, long j, int i, List list) {
        pa7.J(list.isEmpty());
        int i2 = rr5Var.w;
        int i3 = rr5Var.x;
        rr5 rr5Var2 = this.g;
        int i4 = rr5Var2.w;
        ouf oufVar = this.c;
        if (i2 != i4 || i3 != rr5Var2.x) {
            p90 p90Var = oufVar.d;
            long j2 = oufVar.i;
            p90Var.f(j2 == -9223372036854775807L ? 0L : j2 + 1, new uuf(i2, i3));
        }
        float f = rr5Var.B;
        if (f != this.g.B) {
            qh5 qh5Var = this.e;
            qh5Var.f = f;
            qh5Var.a.c();
            qh5Var.b.c();
            qh5Var.c = false;
            qh5Var.d = -9223372036854775807L;
            qh5Var.e = 0;
            qh5Var.c();
        }
        this.g = rr5Var;
        if (j != this.h) {
            if (oufVar.f.d == 0) {
                oufVar.b.e(i);
                oufVar.m = j;
            } else {
                p90 p90Var2 = oufVar.e;
                long j3 = oufVar.i;
                p90Var2.f(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.h = j;
        }
    }

    @Override // defpackage.tuf
    public final void g(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tuf
    public final Surface getInputSurface() {
        Surface surface = this.f;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.tuf
    public final void h() {
        ouf oufVar = this.c;
        long j = oufVar.i;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            oufVar.i = Long.MIN_VALUE;
            oufVar.j = Long.MIN_VALUE;
        }
        oufVar.k = j;
    }

    @Override // defpackage.tuf
    public final void i(int i) {
        nuf nufVar = this.a.b;
        if (nufVar.i == i) {
            return;
        }
        nufVar.i = i;
        nufVar.c(true);
    }

    @Override // defpackage.tuf
    public final void j(float f) {
        this.a.g(f);
    }

    @Override // defpackage.tuf
    public final void k() {
        this.f = null;
        this.a.f(null);
    }

    @Override // defpackage.tuf
    public final void l(cp8 cp8Var) {
        this.i = cp8Var;
        this.j = f94.a;
    }

    @Override // defpackage.tuf
    public final boolean m(long j, dp8 dp8Var) {
        this.d.add(dp8Var);
        ouf oufVar = this.c;
        er0 er0Var = oufVar.f;
        int i = er0Var.d;
        long[] jArr = (long[]) er0Var.f;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                r3.l();
                return false;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = er0Var.b;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) er0Var.f, 0, jArr2, i3, i2);
            er0Var.b = 0;
            int i4 = er0Var.d;
            er0Var.c = i4 - 1;
            er0Var.f = jArr2;
            er0Var.e = length - 1;
            i = i4;
            jArr = jArr2;
        }
        int i5 = (er0Var.c + 1) & er0Var.e;
        er0Var.c = i5;
        jArr[i5] = j;
        er0Var.d = i + 1;
        oufVar.i = j;
        oufVar.k = -9223372036854775807L;
        this.j.execute(new j1(27, this));
        return true;
    }

    @Override // defpackage.tuf
    public final boolean n(rr5 rr5Var) {
        return true;
    }

    @Override // defpackage.tuf
    public final void o(boolean z) {
        if (z) {
            iuf iufVar = this.a;
            iufVar.b.b();
            iufVar.f = -9223372036854775807L;
            iufVar.e = Math.min(iufVar.e, 1);
            iufVar.h = -9223372036854775807L;
            iufVar.m = false;
        }
        this.b.b();
        ouf oufVar = this.c;
        p90 p90Var = oufVar.d;
        er0 er0Var = oufVar.f;
        er0Var.b = 0;
        er0Var.c = -1;
        er0Var.d = 0;
        oufVar.i = -9223372036854775807L;
        oufVar.j = -9223372036854775807L;
        oufVar.k = -9223372036854775807L;
        p90 p90Var2 = oufVar.e;
        if (p90Var2.d0() > 0) {
            pa7.A(p90Var2.d0() > 0);
            while (p90Var2.d0() > 1) {
                p90Var2.W();
            }
            Object objW = p90Var2.W();
            objW.getClass();
            oufVar.m = ((Long) objW).longValue();
        }
        if (p90Var.d0() > 0) {
            pa7.A(p90Var.d0() > 0);
            while (p90Var.d0() > 1) {
                p90Var.W();
            }
            Object objW2 = p90Var.W();
            objW2.getClass();
            p90Var.f(0L, (uuf) objW2);
        }
        this.d.clear();
    }

    @Override // defpackage.tuf
    public final void p(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tuf
    public final void q(long j, long j2) throws suf {
        try {
            this.c.a(j, j2);
        } catch (g45 e) {
            throw new suf(e, this.g);
        }
    }

    @Override // defpackage.tuf
    public final void r(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.tuf
    public final boolean s(boolean z) {
        return this.a.b(z);
    }

    @Override // defpackage.tuf
    public final void t(guf gufVar) {
        this.k = gufVar;
    }

    @Override // defpackage.tuf
    public final void u() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tuf
    public final void v(Surface surface, xkd xkdVar) {
        this.f = surface;
        this.a.f(surface);
    }

    @Override // defpackage.tuf
    public final void w() {
        iuf iufVar = this.a;
        if (iufVar.e == 0) {
            iufVar.e = 1;
        }
    }

    @Override // defpackage.tuf
    public final void a() {
    }
}
