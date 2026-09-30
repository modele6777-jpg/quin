package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ur3 {
    public static final yob p;
    public final fye a;
    public final eye b;
    public final k01 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final ny6 m;
    public final ConcurrentHashMap n;
    public long o;

    static {
        ey6 ey6Var = jy6.b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        nk8.n(6, objArr);
        p = jy6.k(6, objArr);
    }

    public ur3() {
        k01 k01Var = new k01();
        k01Var.c = 0;
        k01Var.d = new mj[100];
        a("bufferForPlaybackMs", 1000, "0", 0);
        a("bufferForPlaybackForLocalPlaybackMs", 1000, "0", 0);
        a("bufferForPlaybackAfterRebufferMs", 2000, "0", 0);
        a("bufferForPlaybackAfterRebufferForLocalPlaybackMs", 1000, "0", 0);
        a("minBufferMs", 50000, "bufferForPlaybackMs", 1000);
        a("minBufferForLocalPlaybackMs", 1000, "bufferForPlaybackForLocalPlaybackMs", 1000);
        a("minBufferMs", 50000, "bufferForPlaybackAfterRebufferMs", 2000);
        a("minBufferForLocalPlaybackMs", 1000, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", 1000);
        a("maxBufferMs", 50000, "minBufferMs", 50000);
        a("maxBufferForLocalPlaybackMs", 50000, "minBufferForLocalPlaybackMs", 1000);
        a("backBufferDurationMs", 0, "0", 0);
        this.a = new fye();
        this.b = new eye();
        this.c = k01Var;
        long jH = pqf.H(50000L);
        this.d = jH;
        long jH2 = pqf.H(1000L);
        this.e = jH2;
        this.f = jH;
        this.g = jH;
        this.h = jH2;
        this.i = jH2;
        this.j = pqf.H(2000L);
        this.k = jH2;
        this.l = pqf.H(0L);
        this.n = new ConcurrentHashMap();
        this.m = ny6.c(dpb.g);
        this.o = -1L;
    }

    public static void a(String str, int i, String str2, int i2) {
        if (i >= i2) {
            return;
        }
        qc0.j(rfc.l("%s cannot be less than %s", str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    public final boolean b(t98 t98Var) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        uha uhaVar = t98Var.a;
        tr3 tr3Var = (tr3) this.n.get(uhaVar);
        tr3Var.getClass();
        tr3 tr3Var2 = (tr3) this.n.get(uhaVar);
        tr3Var2.getClass();
        synchronized (tr3Var2) {
            i = tr3Var2.d;
        }
        int i3 = i * 65536;
        tr3 tr3Var3 = (tr3) this.n.get(uhaVar);
        tr3Var3.getClass();
        boolean z3 = i3 >= tr3Var3.c;
        if (uhaVar.equals(uha.c)) {
            return !z3;
        }
        gye gyeVar = t98Var.b;
        lp8 lp8Var = gyeVar.m(gyeVar.g(t98Var.c.a, this.b).c, this.a, 0L).b.b;
        if (lp8Var == null) {
            z = false;
        } else {
            String scheme = lp8Var.a.getScheme();
            if (TextUtils.isEmpty(scheme) || p.contains(scheme)) {
                z = true;
            } else {
                z = false;
            }
        }
        long jMin = z ? this.e : this.d;
        long j = z ? this.g : this.f;
        float f = t98Var.e;
        if (f > 1.0f) {
            jMin = Math.min(pqf.v(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        boolean z4 = z3;
        long j2 = t98Var.d;
        if (j2 < jMax) {
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            if (runtime.totalMemory() >= jMaxMemory) {
                long jFreeMemory = runtime.freeMemory();
                k01 k01Var = this.c;
                synchronized (k01Var) {
                    i2 = k01Var.c * 65536;
                }
                if (jFreeMemory + ((long) i2) >= jMaxMemory / 25) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = true;
            }
            boolean z5 = (z && z2) || !z4;
            tr3Var.b = z5;
            if (!z5 && z && !z2) {
                xo1.D("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!tr3Var.b && t98Var.d < 500000) {
                xo1.V("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z4) {
            tr3Var.b = false;
        }
        return tr3Var.b;
    }

    public final void c() {
        boolean zIsEmpty = this.n.isEmpty();
        k01 k01Var = this.c;
        int i = 0;
        if (zIsEmpty) {
            synchronized (k01Var) {
                k01Var.e(0);
            }
        } else {
            Iterator it = this.n.values().iterator();
            while (it.hasNext()) {
                i += ((tr3) it.next()).c;
            }
            k01Var.e(i);
        }
    }
}
