package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zy1 implements m95, n95, an9 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ zy1(c2h c2hVar, long j) {
        this.a = 7;
        this.c = c2hVar;
        oa7.x("health_monitor");
        oa7.v(j > 0);
        this.b = j;
    }

    @Override // defpackage.m95
    public boolean a(byte[] bArr, int i, int i2, boolean z) {
        return ((m95) this.c).a(bArr, 0, i2, z);
    }

    @Override // defpackage.m95
    public boolean c(int i, boolean z) {
        return ((m95) this.c).c(i, true);
    }

    @Override // defpackage.m95
    public boolean d(byte[] bArr, int i, int i2, boolean z) {
        return ((m95) this.c).d(bArr, i, i2, z);
    }

    @Override // defpackage.m95
    public long e() {
        return ((m95) this.c).e() - this.b;
    }

    @Override // defpackage.m95
    public void f(int i) {
        ((m95) this.c).f(i);
    }

    @Override // defpackage.m95
    public int g(int i) {
        return ((m95) this.c).g(i);
    }

    @Override // defpackage.m95
    public long getLength() {
        return ((m95) this.c).getLength() - this.b;
    }

    @Override // defpackage.m95
    public long getPosition() {
        return ((m95) this.c).getPosition() - this.b;
    }

    @Override // defpackage.m95
    public int h(byte[] bArr, int i, int i2) {
        return ((m95) this.c).h(bArr, i, i2);
    }

    @Override // defpackage.n95
    public void j() {
        ((n95) this.c).j();
    }

    @Override // defpackage.m95
    public void k() {
        ((m95) this.c).k();
    }

    @Override // defpackage.m95
    public void l(int i) {
        ((m95) this.c).l(i);
    }

    @Override // defpackage.n95
    public k1f n(int i, int i2) {
        return ((n95) this.c).n(i, i2);
    }

    @Override // defpackage.m95
    public void o(byte[] bArr, int i, int i2) {
        ((m95) this.c).o(bArr, i, i2);
    }

    public void p(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        zy1 zy1Var = (zy1) this.c;
        if (zy1Var != null) {
            zy1Var.p(i - 64);
        }
    }

    @Override // defpackage.n95
    public void q(xsc xscVar) {
        ((n95) this.c).q(new mzd(this, xscVar, xscVar));
    }

    @Override // defpackage.an9
    public /* synthetic */ void r(Exception exc) {
        psd psdVar = (psd) this.c;
        ((AtomicLong) psdVar.d).set(this.b);
    }

    @Override // defpackage.sb3
    public int read(byte[] bArr, int i, int i2) {
        return ((m95) this.c).read(bArr, i, i2);
    }

    @Override // defpackage.m95
    public void readFully(byte[] bArr, int i, int i2) {
        ((m95) this.c).readFully(bArr, i, i2);
    }

    public int s(int i) {
        zy1 zy1Var = (zy1) this.c;
        if (zy1Var == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + zy1Var.s(i - 64);
    }

    public void t() {
        if (((zy1) this.c) == null) {
            this.c = new zy1(0);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((zy1) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((zy1) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public boolean u(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        t();
        return ((zy1) this.c).u(i - 64);
    }

    public void v(int i, boolean z) {
        if (i >= 64) {
            t();
            ((zy1) this.c).v(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            y(i);
        } else {
            p(i);
        }
        if (z2 || ((zy1) this.c) != null) {
            t();
            ((zy1) this.c).v(0, z2);
        }
    }

    public boolean w(int i) {
        if (i >= 64) {
            t();
            return ((zy1) this.c).w(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        zy1 zy1Var = (zy1) this.c;
        if (zy1Var != null) {
            if (zy1Var.u(0)) {
                y(63);
            }
            ((zy1) this.c).w(0);
        }
        return z;
    }

    public void x() {
        this.b = 0L;
        zy1 zy1Var = (zy1) this.c;
        if (zy1Var != null) {
            zy1Var.x();
        }
    }

    public void y(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            t();
            ((zy1) this.c).y(i - 64);
        }
    }

    public void z() {
        c2h c2hVar = (c2h) this.c;
        c2hVar.A0();
        ((w3h) c2hVar.b).y.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = c2hVar.E0().edit();
        editorEdit.remove("health_monitor:count");
        editorEdit.remove("health_monitor:value");
        editorEdit.putLong("health_monitor:start", jCurrentTimeMillis);
        editorEdit.apply();
    }

    public /* synthetic */ zy1(psd psdVar, long j) {
        this.a = 6;
        this.c = psdVar;
        this.b = j;
    }

    public /* synthetic */ zy1(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public zy1(yhb yhbVar) {
        this.a = 1;
        this.c = yhbVar;
        this.b = 262144L;
    }

    public zy1(m95 m95Var, long j) {
        this.a = 4;
        this.c = m95Var;
        pa7.A(m95Var.getPosition() >= j);
        this.b = j;
    }

    public zy1(int i) {
        this.a = i;
        switch (i) {
            case 3:
                break;
            default:
                this.b = 0L;
                break;
        }
    }
}
