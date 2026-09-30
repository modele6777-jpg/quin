package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kp extends CameraDevice.StateCallback {
    public final String a;
    public final yg1 b;
    public final int c;
    public final long d;
    public final uce e;
    public final nd1 f;
    public final hd1 g;
    public final sd1 h;
    public final qwe i;
    public final lk0 j;
    public final CameraDevice.StateCallback k;
    public final a90 l;
    public final int m;
    public final Object n;
    public boolean o;
    public ip p;
    public boolean q;
    public final CountDownLatch r;
    public final long s;
    public sye t;
    public final s0e u;

    public kp(String str, yg1 yg1Var, int i, long j, uce uceVar, nd1 nd1Var, hd1 hd1Var, sd1 sd1Var, qwe qweVar, lk0 lk0Var, CameraDevice.StateCallback stateCallback, a90 a90Var) {
        str.getClass();
        yg1Var.getClass();
        uceVar.getClass();
        nd1Var.getClass();
        hd1Var.getClass();
        sd1Var.getClass();
        qweVar.getClass();
        lk0Var.getClass();
        this.a = str;
        this.b = yg1Var;
        this.c = i;
        this.d = j;
        this.e = uceVar;
        this.f = nd1Var;
        this.g = hd1Var;
        this.h = sd1Var;
        this.i = qweVar;
        this.j = lk0Var;
        this.k = stateCallback;
        this.l = a90Var;
        wh0 wh0Var = cyf.b;
        wh0Var.getClass();
        this.m = wh0.b.incrementAndGet(wh0Var);
        this.n = new Object();
        this.r = new CountDownLatch(1);
        this.u = t0e.a(qj1.a);
        Log.i("CXCP", "Opening " + ((Object) ig1.b(str)));
        this.s = i != 1 ? SystemClock.elapsedRealtimeNanos() : j;
    }

    public static boolean e(sd1 sd1Var, String str, nf1 nf1Var) {
        sd1Var.getClass();
        str.getClass();
        sd1Var.b.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            return false;
        }
        xg1 xg1Var = yg1.o;
        yg1 yg1VarA = ((qd1) sd1Var.a).a(str);
        xg1Var.getClass();
        return xg1.c(yg1VarA) && nf1Var == null;
    }

    public final void a() {
        yi1 yi1Var = (yi1) this.u.getValue();
        lf1 lf1Var = yi1Var instanceof dj1 ? ((dj1) yi1Var).a : null;
        b(lf1Var != null ? (CameraDevice) lf1Var.H0(job.a.b(CameraDevice.class)) : null, new ip(d62.a, null, null, 14));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    public final void b(CameraDevice cameraDevice, ip ipVar) {
        kp kpVar;
        yi1 yi1Var = (yi1) this.u.getValue();
        lf1 lf1Var = yi1Var instanceof dj1 ? ((dj1) yi1Var).a : null;
        synchronized (this.n) {
            if (this.p == null) {
                this.p = ipVar;
                if (this.o) {
                    ipVar = null;
                }
            } else {
                ipVar = null;
            }
        }
        if (ipVar != null) {
            nf1 nf1Var = ipVar.c;
            if (nf1Var != null && ipVar.a != d62.f) {
                this.f.a(nf1Var.a, this.a, false);
            }
            this.u.n(null, new cj1(ipVar.c));
            if (ipVar.a != d62.c) {
                sd1 sd1Var = this.h;
                String str = this.a;
                boolean z = e(sd1Var, str, ipVar.c) && sd1Var.a(str);
                if (z) {
                    synchronized (this.n) {
                        this.q = true;
                    }
                }
                kpVar = this;
                ((kd1) this.g).a(lf1Var, cameraDevice, kpVar, this.j, z, e(this.h, this.a, ipVar.c));
            } else {
                kpVar = this;
            }
            kpVar.u.n(null, kpVar.c(ipVar));
        }
    }

    public final bj1 c(ip ipVar) {
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        sye syeVar = this.t;
        long j = ipVar.b;
        er4 er4Var = syeVar != null ? new er4(syeVar.a - this.d) : null;
        er4 er4Var2 = syeVar != null ? new er4(syeVar.a - this.s) : null;
        er4 er4Var3 = syeVar == null ? null : new er4(j - syeVar.a);
        long j2 = jElapsedRealtimeNanos - j;
        d62 d62Var = ipVar.a;
        int i = this.c - 1;
        return new bj1(this.a, d62Var, Integer.valueOf(i), er4Var, ipVar.d, er4Var2, er4Var3, new er4(j2), ipVar.c);
    }

    public final void d(CameraDevice cameraDevice) {
        Trace.beginSection(((Object) ig1.b(this.a)) + "#onFinalized");
        Log.d("CXCP", this + ": onFinalized");
        b(cameraDevice, new ip(d62.c, null, null, 14));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        if (!pa7.t(cameraDevice.getId(), this.a)) {
            qc0.p("Check failed.");
            return;
        }
        Log.d("CXCP", ((Object) ig1.b(this.a)) + ": onClosed");
        this.r.countDown();
        synchronized (this.n) {
            if (!this.q) {
                d(cameraDevice);
                return;
            }
            Log.i("CXCP", this + "#onClosed: Delaying finalizing.");
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.a;
        if (!pa7.t(id, str)) {
            qc0.p("Check failed.");
            return;
        }
        Trace.beginSection(((Object) ig1.b(str)) + "#onDisconnected");
        Log.d("CXCP", ((Object) ig1.b(str)) + ": onDisconnected");
        this.r.countDown();
        b(cameraDevice, new ip(d62.d, new nf1(6), null, 10));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.a;
        if (!pa7.t(id, str)) {
            qc0.p("Check failed.");
            return;
        }
        Trace.beginSection(((Object) ig1.b(str)) + "#onError-" + i);
        Log.d("CXCP", ((Object) ig1.b(str)) + ": onError " + i);
        this.r.countDown();
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            qc0.j(tec.e(i, "Unexpected StateCallback error code: "));
                            return;
                        }
                    }
                }
            }
        }
        b(cameraDevice, new ip(d62.e, new nf1(i2), null, 10));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onError(cameraDevice, i);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        String strG;
        ip ipVar;
        ip ipVar2;
        cameraDevice.getClass();
        if (!pa7.t(cameraDevice.getId(), this.a)) {
            qc0.p("Check failed.");
            return;
        }
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.t = new sye(jElapsedRealtimeNanos);
        Trace.beginSection(((Object) ig1.b(this.a)) + "#onOpened");
        long j = jElapsedRealtimeNanos - this.s;
        long j2 = jElapsedRealtimeNanos - this.d;
        int i = this.c;
        String str = this.a;
        if (i == 1) {
            StringBuilder sb = new StringBuilder("Opened ");
            sb.append((Object) ig1.b(str));
            sb.append(" in ");
            strG = kv2.p(new Object[]{Double.valueOf(j / 1000000.0d)}, 1, null, "%.3f ms", sb);
        } else {
            StringBuilder sb2 = new StringBuilder("Opened ");
            sb2.append((Object) ig1.b(str));
            sb2.append(" in ");
            sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1)));
            sb2.append(" (");
            sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1)));
            sb2.append(" total) after ");
            strG = tec.g(this.c, " attempts.", sb2);
        }
        Log.i("CXCP", strG);
        synchronized (this.n) {
            ipVar = this.p;
            if (ipVar == null) {
                this.o = true;
            }
        }
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onOpened(cameraDevice);
        }
        if (ipVar != null) {
            hd1 hd1Var = this.g;
            lk0 lk0Var = this.j;
            sd1 sd1Var = this.h;
            String str2 = this.a;
            ((kd1) hd1Var).a(null, cameraDevice, this, lk0Var, e(sd1Var, str2, ipVar.c) && sd1Var.a(str2), e(this.h, this.a, ipVar.c));
            return;
        }
        fp fpVar = new fp(this.b, cameraDevice, this.a, this.f, this.l, this.i);
        lk0 lk0Var2 = this.j;
        lk0Var2.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            synchronized (lk0Var2.c) {
                lk0Var2.e.add(fpVar);
                mk0 mk0VarA = lk0Var2.a();
                if (mk0VarA != null) {
                    vv2 vv2Var = lk0Var2.b;
                    qn2 qn2Var = lk0Var2.a;
                    jk0 jk0Var = new jk0(fpVar, mk0VarA, null);
                    vv2Var.getClass();
                    qn2Var.getClass();
                    ynb.V(qn2Var, null, dw2.d, new j99(vv2Var, jk0Var, null), 1);
                }
            }
        }
        this.u.n(null, new dj1(fpVar));
        synchronized (this.n) {
            this.o = false;
            ipVar2 = this.p;
        }
        if (ipVar2 != null) {
            this.u.n(null, new cj1(ipVar2.c));
            hd1 hd1Var2 = this.g;
            lk0 lk0Var3 = this.j;
            sd1 sd1Var2 = this.h;
            String str3 = this.a;
            ((kd1) hd1Var2).a(fpVar, cameraDevice, this, lk0Var3, e(sd1Var2, str3, ipVar2.c) && sd1Var2.a(str3), e(this.h, this.a, ipVar2.c));
            this.u.n(null, c(ipVar2));
        }
        Trace.endSection();
    }

    public final String toString() {
        return "CameraState-" + this.m;
    }
}
