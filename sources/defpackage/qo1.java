package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qo1 implements qe1 {
    public final ud6 a;
    public final fo1 b;
    public final a82 c;
    public final bk1 d;
    public final uce e;
    public final wf1 f;
    public final d3e g;
    public final qwe h;
    public final aw2 i;
    public final int j;
    public final Object k;
    public final zh0 l;
    public final Map m;
    public final Map n;
    public sye o;
    public final e1d p;
    public lf1 q;
    public go1 r;
    public Map s;
    public LinkedHashMap t;
    public ho1 u;
    public final CountDownLatch v;
    public boolean w;
    public final CountDownLatch x;
    public Map y;
    public final LinkedHashMap z;

    public qo1(ud6 ud6Var, fo1 fo1Var, a82 a82Var, bk1 bk1Var, uce uceVar, wf1 wf1Var, qn4 qn4Var, d3e d3eVar, i4e i4eVar, qwe qweVar, aw2 aw2Var) {
        fo1Var.getClass();
        bk1Var.getClass();
        uceVar.getClass();
        i4eVar.getClass();
        qweVar.getClass();
        aw2Var.getClass();
        this.a = ud6Var;
        this.b = fo1Var;
        this.c = a82Var;
        this.d = bk1Var;
        this.e = uceVar;
        this.f = wf1Var;
        this.g = d3eVar;
        this.h = qweVar;
        this.i = aw2Var;
        wh0 wh0Var = ro1.a;
        wh0Var.getClass();
        this.j = wh0.b.incrementAndGet(wh0Var);
        this.k = new Object();
        this.l = vpf.o(Boolean.FALSE);
        this.m = Collections.synchronizedMap(new HashMap());
        this.n = Collections.synchronizedMap(new HashMap());
        this.p = qn4Var != null ? new e1d(qn4Var) : null;
        this.u = ho1.a;
        this.v = new CountDownLatch(1);
        this.x = new CountDownLatch(1);
        this.z = new LinkedHashMap();
    }

    @Override // defpackage.g1d
    public final void a() throws Exception {
        if (this.l.a(Boolean.FALSE, Boolean.TRUE)) {
            Log.d("CXCP", this + " session finalizing");
            Trace.beginSection(this + "#onSessionFinalized");
            n();
            m(0L);
            Trace.endSection();
        }
    }

    @Override // defpackage.g1d
    public final void b() {
        Log.d("CXCP", this + " session disconnecting");
        Trace.beginSection(this + "#onSessionDisconnected");
        k();
        try {
            Trace.beginSection(this + "#onSessionDisconnected Await");
            this.v.await();
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.qe1
    public final void c(re1 re1Var) {
        Log.d("CXCP", this + " Active");
    }

    @Override // defpackage.qe1
    public final void d(re1 re1Var) throws Exception {
        Log.d("CXCP", this + " Closed");
        Trace.beginSection(this + "#onClosed");
        n();
        this.x.countDown();
        e1d e1dVar = this.p;
        if (e1dVar != null) {
            e1dVar.b();
        }
        Trace.endSection();
    }

    @Override // defpackage.qe1
    public final void e(re1 re1Var) {
        Log.d("CXCP", this + " Ready");
    }

    @Override // defpackage.qe1
    public final void f(re1 re1Var) {
        Log.d("CXCP", this + " CaptureQueueEmpty");
    }

    @Override // defpackage.qe1
    public final void g(re1 re1Var) {
        Log.d("CXCP", this + " Configured");
        Trace.beginSection(this + "#configure");
        i(re1Var);
        this.x.countDown();
        e1d e1dVar = this.p;
        if (e1dVar != null) {
            e1dVar.b();
        }
        Trace.endSection();
    }

    @Override // defpackage.qe1
    public final void h(re1 re1Var) throws Exception {
        b1.l("CXCP", this + " Configuration Failed");
        Trace.beginSection(this + "#onConfigureFailed");
        this.a.a(new zd6(9, false));
        n();
        this.x.countDown();
        e1d e1dVar = this.p;
        if (e1dVar != null) {
            e1dVar.b();
        }
        Trace.endSection();
    }

    public final void i(re1 re1Var) {
        synchronized (this.k) {
            try {
                go1 go1Var = this.r;
                if (go1Var == null && re1Var != null) {
                    a82 a82Var = this.c;
                    Map map = this.m;
                    map.getClass();
                    Map map2 = this.n;
                    map2.getClass();
                    wc1 wc1VarW = a82Var.w(re1Var, map, map2);
                    go1 go1Var2 = new go1(re1Var, new vd6(wc1VarW), wc1VarW);
                    this.r = go1Var2;
                    go1Var = go1Var2;
                }
                if (this.u == ho1.c && go1Var != null) {
                    boolean z = (this.s == null || this.t == null) ? false : true;
                    if (z) {
                        l(false);
                    }
                    synchronized (this.k) {
                        this.e.getClass();
                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        sye syeVar = this.o;
                        syeVar.getClass();
                        Log.i("CXCP", "Configured " + this + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((jElapsedRealtimeNanos - syeVar.a) / 1000000.0d)}, 1)));
                        this.a.b(go1Var.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Map map) {
        map.getClass();
        synchronized (this.k) {
            try {
                ho1 ho1Var = this.u;
                if (ho1Var != ho1.d && ho1Var != ho1.e) {
                    Map map2 = this.y;
                    if (map2 == null) {
                        map2 = qu4.a;
                    }
                    p(map2, map);
                    this.y = map;
                    Map map3 = this.s;
                    if (map3 != null && this.t == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (map3.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (linkedHashMap.size() == map3.size()) {
                            this.t = linkedHashMap;
                            ynb.V(this.i, null, null, new jo1(this, null), 3);
                        }
                    }
                    ynb.V(this.i, null, null, new ko1(this, null), 3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.k) {
            try {
                ho1 ho1Var = this.u;
                ho1 ho1Var2 = ho1.d;
                if (ho1Var != ho1Var2 && ho1Var != ho1.e) {
                    this.u = ho1Var2;
                    go1 go1Var = this.r;
                    boolean z = false;
                    if (go1Var != null) {
                        this.r = null;
                    } else {
                        if (this.f.d && this.w) {
                            z = true;
                        }
                        go1Var = null;
                    }
                    e1d e1dVar = this.p;
                    if (e1dVar != null) {
                        e1dVar.b();
                    }
                    if (z) {
                        Log.d("CXCP", "Waiting for CameraCaptureSession configuration");
                        if (((wef) this.h.b(3000L, new mo1(this, null))) == null) {
                            b1.d("CXCP", "Waiting for CameraCaptureSession configuration timed out");
                        }
                        synchronized (this.k) {
                            go1Var = this.r;
                            this.r = null;
                        }
                    }
                    Trace.beginSection(this.a + "#onGraphStopping");
                    ud6 ud6Var = this.a;
                    Log.d("CXCP", ud6Var + " onGraphStopping");
                    ud6Var.e.m(ce6.b);
                    ud6Var.c.W(null);
                    for (fe6 fe6Var : ud6Var.d) {
                        fe6Var.a.b(fe6Var.a(), ce6.b);
                    }
                    Trace.endSection();
                    if (go1Var != null) {
                        vd6 vd6Var = go1Var.b;
                        Log.d("CXCP", this + " Shutdown");
                        Trace.beginSection(this + "#shutdown");
                        if (this.f.a && ((wef) this.h.b(2000L, new no1(this, vd6Var, null))) == null) {
                            b1.d("CXCP", "Failed to abort captures in 2000ms");
                        }
                        Trace.beginSection(this + "#disconnect");
                        go1Var.c.c();
                        Trace.endSection();
                        if (this.f.d && ((wef) this.h.b(3000L, new lo1(this, go1Var, null))) == null) {
                            b1.d("CXCP", "Failed to close the capture session in 3000ms");
                        }
                        Trace.beginSection(this.a + "#onGraphStopped");
                        this.a.c();
                        Trace.endSection();
                        Trace.endSection();
                    } else {
                        Trace.beginSection(this.a + "#onGraphStopped");
                        this.a.c();
                        Trace.endSection();
                    }
                    this.v.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(boolean z) {
        go1 go1Var;
        Map map;
        LinkedHashMap linkedHashMap;
        boolean z2;
        synchronized (this.k) {
            go1Var = this.r;
            map = this.s;
            linkedHashMap = this.t;
        }
        if (go1Var == null || map == null || linkedHashMap == null) {
            return;
        }
        Trace.beginSection(this + "#finalizeOutputConfigurations");
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        for (Map.Entry entry : map.entrySet()) {
            e3e e3eVar = (e3e) entry.getKey();
            int i = e3eVar.a;
            ot otVar = (ot) entry.getValue();
            Object obj = linkedHashMap.get(e3eVar);
            if (obj == null) {
                qc0.p("Required value was null.");
                return;
            } else {
                otVar.getClass();
                otVar.a.addSurface((Surface) obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add((ot) ((Map.Entry) it.next()).getValue());
        }
        go1Var.a.z0(s72.j1(linkedHashSet));
        synchronized (this.k) {
            try {
                if (this.u == ho1.c) {
                    this.m.putAll(linkedHashMap);
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (true) {
                        z2 = true;
                        if (!it2.hasNext()) {
                            this.e.getClass();
                            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Finalized ");
                            ArrayList arrayList = new ArrayList(map.size());
                            Iterator it3 = map.entrySet().iterator();
                            while (it3.hasNext()) {
                                e3e e3eVar2 = (e3e) ((Map.Entry) it3.next()).getKey();
                                int i2 = e3eVar2.a;
                                arrayList.add(e3eVar2);
                            }
                            sb.append(arrayList);
                            sb.append(" for ");
                            sb.append(this);
                            sb.append(" in ");
                            sb.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)));
                            Log.i("CXCP", sb.toString());
                            break;
                        }
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        int i3 = ((e3e) entry2.getKey()).a;
                        Surface surface = (Surface) entry2.getValue();
                        xj1 xj1VarB = this.g.b(i3);
                        if (xj1VarB == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (xj1VarB.b.size() != 1) {
                            throw new IllegalStateException("Cannot finalize a multi-output stream!");
                        }
                        Map map2 = this.n;
                        map2.getClass();
                        map2.put(new qt9(((c3e) s72.X0(xj1VarB.b)).a), surface);
                    }
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2 && z) {
            ud6 ud6Var = this.a;
            Log.d("CXCP", ud6Var + " onGraphModified");
            ud6Var.c.g.c(fd6.b);
        }
        Trace.endSection();
    }

    public final void m(long j) throws Exception {
        List<AutoCloseable> listJ1;
        boolean zIsTerminated;
        if (j != 0) {
            ynb.V(this.i, null, null, new oo1(j, this, null), 3);
            return;
        }
        Log.d("CXCP", "Finalizing " + this);
        synchronized (this.k) {
            listJ1 = s72.j1(this.z.values());
            this.z.clear();
        }
        for (AutoCloseable autoCloseable : listJ1) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    cva.s();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0027  */
    public final void n() throws Exception {
        long j;
        boolean z;
        int i;
        k();
        synchronized (this.k) {
            try {
                ho1 ho1Var = this.u;
                ho1 ho1Var2 = ho1.e;
                j = 0;
                if (ho1Var != ho1Var2) {
                    z = true;
                    if (this.q != null && this.w && (i = this.f.c) != 1) {
                        if (i == 2) {
                            j = 2000;
                        } else {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                this.q = null;
                this.u = ho1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:53:0x0124  */
    /* JADX WARN: Code duplicated, block: B:62:0x0137 A[Catch: all -> 0x01c9, TryCatch #1 {all -> 0x01c9, blocks: (B:55:0x0127, B:57:0x012d, B:60:0x0133, B:62:0x0137, B:64:0x015b, B:66:0x019a, B:67:0x01a7, B:69:0x01ad, B:71:0x01bd, B:76:0x01ce, B:78:0x01d8, B:82:0x01e1, B:83:0x01f8, B:84:0x01f9), top: B:98:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x015b A[Catch: all -> 0x01c9, TryCatch #1 {all -> 0x01c9, blocks: (B:55:0x0127, B:57:0x012d, B:60:0x0133, B:62:0x0137, B:64:0x015b, B:66:0x019a, B:67:0x01a7, B:69:0x01ad, B:71:0x01bd, B:76:0x01ce, B:78:0x01d8, B:82:0x01e1, B:83:0x01f8, B:84:0x01f9), top: B:98:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x019a A[Catch: all -> 0x01c9, TryCatch #1 {all -> 0x01c9, blocks: (B:55:0x0127, B:57:0x012d, B:60:0x0133, B:62:0x0137, B:64:0x015b, B:66:0x019a, B:67:0x01a7, B:69:0x01ad, B:71:0x01bd, B:76:0x01ce, B:78:0x01d8, B:82:0x01e1, B:83:0x01f8, B:84:0x01f9), top: B:98:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01ad A[Catch: all -> 0x01c9, TryCatch #1 {all -> 0x01c9, blocks: (B:55:0x0127, B:57:0x012d, B:60:0x0133, B:62:0x0137, B:64:0x015b, B:66:0x019a, B:67:0x01a7, B:69:0x01ad, B:71:0x01bd, B:76:0x01ce, B:78:0x01d8, B:82:0x01e1, B:83:0x01f8, B:84:0x01f9), top: B:98:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e1 A[Catch: all -> 0x01c9, TRY_ENTER, TryCatch #1 {all -> 0x01c9, blocks: (B:55:0x0127, B:57:0x012d, B:60:0x0133, B:62:0x0137, B:64:0x015b, B:66:0x019a, B:67:0x01a7, B:69:0x01ad, B:71:0x01bd, B:76:0x01ce, B:78:0x01d8, B:82:0x01e1, B:83:0x01f8, B:84:0x01f9), top: B:98:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0109, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x015b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x01e1, please report this as an issue */
    public final Object o(zn2 zn2Var) {
        po1 po1Var;
        mmb mmbVarD;
        mmb mmbVar;
        mmb mmbVar2;
        mmb mmbVar3;
        lf1 lf1Var;
        String strX;
        String strB;
        lf1 lf1Var2;
        String strX2;
        eo1 eo1VarA;
        ho1 ho1Var;
        Map map;
        Map map2;
        LinkedHashMap linkedHashMap;
        if (zn2Var instanceof po1) {
            po1Var = (po1) zn2Var;
            int i = po1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                po1Var.label = i - Integer.MIN_VALUE;
            } else {
                po1Var = new po1(this, zn2Var);
            }
        } else {
            po1Var = new po1(this, zn2Var);
        }
        Object obj = po1Var.result;
        bw2 bw2Var = bw2.a;
        int i2 = po1Var.label;
        try {
            if (i2 == 0) {
                mmbVarD = ks0.d(obj);
                mmbVar = new mmb();
                synchronized (this.k) {
                    if (this.u != ho1.a) {
                        return wef.a;
                    }
                    mmbVarD.element = this.y;
                    lf1 lf1Var3 = this.q;
                    mmbVar.element = lf1Var3;
                    if (mmbVarD.element != null && lf1Var3 != null) {
                        this.u = ho1.b;
                        this.w = true;
                        this.e.getClass();
                        this.o = new sye(SystemClock.elapsedRealtimeNanos());
                        e1d e1dVar = this.p;
                        if (e1dVar != null) {
                            Log.d("CXCP", "Awaiting session lock");
                            po1Var.L$0 = mmbVarD;
                            po1Var.L$1 = mmbVar;
                            po1Var.label = 1;
                            if (e1dVar.a(po1Var) == bw2Var) {
                                return bw2Var;
                            }
                            mmbVar2 = mmbVarD;
                            mmbVar3 = mmbVar;
                        }
                        StringBuilder sb = new StringBuilder("Creating CameraCaptureSession from ");
                        lf1Var = (lf1) mmbVar.element;
                        if (lf1Var != null) {
                            strX = lf1Var.x();
                        } else {
                            strX = null;
                        }
                        if (strX == null) {
                            strB = "null";
                        } else {
                            strB = ig1.b(strX);
                        }
                        sb.append((Object) strB);
                        sb.append(" using ");
                        sb.append(this);
                        sb.append(" with ");
                        sb.append(mmbVarD.element);
                        Log.i("CXCP", sb.toString());
                        StringBuilder sb2 = new StringBuilder("CameraDevice-");
                        lf1Var2 = (lf1) mmbVar.element;
                        if (lf1Var2 != null) {
                            strX2 = lf1Var2.x();
                        } else {
                            strX2 = null;
                        }
                        Trace.beginSection(ks0.l(sb2, strX2, "#createCaptureSession"));
                        fo1 fo1Var = this.b;
                        Object obj2 = mmbVar.element;
                        obj2.getClass();
                        Object obj3 = mmbVarD.element;
                        obj3.getClass();
                        eo1VarA = fo1Var.a((lf1) obj2, (Map) obj3, this);
                        Trace.endSection();
                        if (!(eo1VarA instanceof do1)) {
                            b1.d("CXCP", "Failed to create capture session for " + this + '!');
                            return wef.a;
                        }
                        synchronized (this.k) {
                            try {
                                ho1Var = this.u;
                                if (ho1Var != ho1.d && ho1Var != ho1.e) {
                                    if (ho1Var == ho1.b) {
                                        throw new IllegalStateException(("Unexpected state: " + this.u).toString());
                                    }
                                    this.u = ho1.c;
                                    Map map3 = this.m;
                                    Object obj4 = mmbVarD.element;
                                    obj4.getClass();
                                    map3.putAll((Map) obj4);
                                    this.n.putAll(((do1) eo1VarA).b);
                                    map = ((do1) eo1VarA).a;
                                    if (!map.isEmpty()) {
                                        Log.i("CXCP", "Created " + this + " with " + s72.j1(((Map) mmbVarD.element).keySet()) + ". Waiting to finalize " + s72.j1(map.keySet()));
                                        this.s = map;
                                        map2 = this.y;
                                        if (map2 != null) {
                                            linkedHashMap = new LinkedHashMap();
                                            for (Map.Entry entry : map2.entrySet()) {
                                                if (map.containsKey(entry.getKey())) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                        } else {
                                            linkedHashMap = null;
                                        }
                                        if (linkedHashMap != null && linkedHashMap.size() == map.size()) {
                                            this.t = linkedHashMap;
                                        }
                                    }
                                    i(null);
                                    return wef.a;
                                }
                                Log.i("CXCP", "Warning: " + this + " was " + this.u + " while configuration was in progress.");
                                return wef.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return wef.a;
                }
            }
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar3 = (mmb) po1Var.L$1;
            mmbVar2 = (mmb) po1Var.L$0;
            jzb.q(obj);
            Trace.beginSection(ks0.l(sb2, strX2, "#createCaptureSession"));
            fo1 fo1Var2 = this.b;
            Object obj5 = mmbVar.element;
            obj5.getClass();
            Object obj6 = mmbVarD.element;
            obj6.getClass();
            eo1VarA = fo1Var2.a((lf1) obj5, (Map) obj6, this);
            Trace.endSection();
            if (!(eo1VarA instanceof do1)) {
                b1.d("CXCP", "Failed to create capture session for " + this + '!');
                return wef.a;
            }
            synchronized (this.k) {
                ho1Var = this.u;
                if (ho1Var != ho1.d) {
                    if (ho1Var == ho1.b) {
                        throw new IllegalStateException(("Unexpected state: " + this.u).toString());
                    }
                    this.u = ho1.c;
                    Map map4 = this.m;
                    Object obj7 = mmbVarD.element;
                    obj7.getClass();
                    map4.putAll((Map) obj7);
                    this.n.putAll(((do1) eo1VarA).b);
                    map = ((do1) eo1VarA).a;
                    if (!map.isEmpty()) {
                        Log.i("CXCP", "Created " + this + " with " + s72.j1(((Map) mmbVarD.element).keySet()) + ". Waiting to finalize " + s72.j1(map.keySet()));
                        this.s = map;
                        map2 = this.y;
                        if (map2 != null) {
                            linkedHashMap = new LinkedHashMap();
                            while (r13.hasNext()) {
                                if (map.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else {
                            linkedHashMap = null;
                        }
                        if (linkedHashMap != null) {
                            this.t = linkedHashMap;
                        }
                    }
                    i(null);
                    return wef.a;
                }
                Log.i("CXCP", "Warning: " + this + " was " + this.u + " while configuration was in progress.");
                return wef.a;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
        mmbVarD = mmbVar2;
        mmbVar = mmbVar3;
        StringBuilder sb3 = new StringBuilder("Creating CameraCaptureSession from ");
        lf1Var = (lf1) mmbVar.element;
        if (lf1Var != null) {
            strX = lf1Var.x();
        } else {
            strX = null;
        }
        if (strX == null) {
            strB = "null";
        } else {
            strB = ig1.b(strX);
        }
        sb3.append((Object) strB);
        sb3.append(" using ");
        sb3.append(this);
        sb3.append(" with ");
        sb3.append(mmbVarD.element);
        Log.i("CXCP", sb3.toString());
        StringBuilder sb4 = new StringBuilder("CameraDevice-");
        lf1Var2 = (lf1) mmbVar.element;
        if (lf1Var2 != null) {
            strX2 = lf1Var2.x();
        } else {
            strX2 = null;
        }
    }

    public final void p(Map map, Map map2) throws Exception {
        Surface surface;
        AutoCloseable autoCloseable;
        boolean zIsTerminated;
        Set setO1 = s72.o1(map.values());
        Set setO2 = s72.o1(map2.values());
        Iterator it = n3d.l(setO1, setO2).iterator();
        do {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.z;
            if (!zHasNext) {
                for (Surface surface2 : n3d.l(setO2, setO1)) {
                    linkedHashMap.put(surface2, this.d.a(surface2));
                }
                return;
            }
            surface = (Surface) it.next();
            autoCloseable = (AutoCloseable) linkedHashMap.remove(surface);
            if (autoCloseable == null) {
                autoCloseable = null;
            } else if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    cva.s();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        } while (autoCloseable != null);
        r82.e(surface, " doesn't have a matching surface token!", "Surface ");
    }

    public final String toString() {
        return "CaptureSessionState-" + this.j;
    }
}
