package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wc1 {
    public final re1 a;
    public final qwe b;
    public final Map c;
    public final Map d;
    public final d3e e;
    public final i4e f;
    public final boolean g;
    public final int h;
    public final Object i;
    public boolean j;
    public uc1 k;
    public final ns l;

    public wc1(re1 re1Var, qwe qweVar, Map map, Map map2, d3e d3eVar, i4e i4eVar, boolean z) {
        re1Var.getClass();
        qweVar.getClass();
        map.getClass();
        map2.getClass();
        i4eVar.getClass();
        this.a = re1Var;
        this.b = qweVar;
        this.c = map;
        this.d = map2;
        this.e = d3eVar;
        this.f = i4eVar;
        this.g = z;
        wh0 wh0Var = xc1.a;
        wh0Var.getClass();
        this.h = wh0.b.incrementAndGet(wh0Var);
        this.i = new Object();
        List list = d3eVar.f;
        ns nsVarD = null;
        if (!list.isEmpty()) {
            a3e a3eVar = (a3e) s72.v0(list);
            Surface inputSurface = re1Var.getInputSurface();
            if (inputSurface == null) {
                qc0.p("inputSurface is required to create instance of imageWriter.");
                throw null;
            }
            try {
                nsVarD = feg.D(inputSurface, a3eVar.a, new y2e(a3eVar.b), qweVar.a());
            } catch (RuntimeException e) {
                b1.e("CXCP", "Failed to create ImageWriter for session " + this.a + "! Reprocessing will not be supported!", e);
            }
            if (nsVarD != null) {
                Log.d("CXCP", "Created ImageWriter " + nsVarD + " for session " + this.a);
            }
        }
        this.l = nsVarD;
    }

    public final void a(uc1 uc1Var) {
        Log.d("CXCP", "Waiting for the last repeating request sequence: " + uc1Var);
        if (((wef) this.b.b(2000L, new vc1(uc1Var, null))) == null) {
            b1.d("CXCP", this + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + uc1Var);
        }
    }

    public final uc1 b(boolean z, List list, Map map, Map map2, Map map3, kd9 kd9Var, List list2) {
        CaptureRequest.Builder builderH0;
        ArrayMap arrayMap;
        Iterator it;
        long j;
        boolean zA;
        boolean zIsTerminated;
        boolean z2;
        Iterator it2;
        boolean z3;
        boolean z4;
        Map map4 = map3;
        list.getClass();
        map2.getClass();
        map4.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        re1 re1Var = this.a;
        d3e d3eVar = this.e;
        if (list.isEmpty()) {
            qc0.p("build(...) should never be called with an empty request list!");
            return null;
        }
        if (re1Var instanceof ep) {
            Iterator it3 = list.iterator();
            Boolean bool = null;
            Boolean bool2 = null;
            while (it3.hasNext()) {
                ctb ctbVar = (ctb) it3.next();
                List list3 = ctbVar.a;
                if (list3 == null || !list3.isEmpty()) {
                    Iterator it4 = list3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            int i = ((e3e) it4.next()).a;
                            ArrayList arrayList3 = d3eVar.v;
                            if (arrayList3 == null || !arrayList3.isEmpty()) {
                                Iterator it5 = arrayList3.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        c3e c3eVar = (c3e) it5.next();
                                        it2 = it3;
                                        bu9 bu9Var = c3eVar.g;
                                        cu9 cu9Var = c3eVar.i;
                                        if (!(bu9Var == null ? false : bu9.a(bu9Var.a, 1L))) {
                                            if (!(cu9Var == null ? false : cu9.a(cu9Var.a, 0L)) && cu9Var != null) {
                                                it3 = it2;
                                                it4 = it4;
                                                it5 = it5;
                                                arrayList = arrayList;
                                                arrayList2 = arrayList2;
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            }
                            it3 = it3;
                            it4 = it4;
                            arrayList = arrayList;
                            arrayList2 = arrayList2;
                        } else {
                            it2 = it3;
                            arrayList = arrayList;
                            arrayList2 = arrayList2;
                            z3 = false;
                        }
                    }
                } else {
                    it2 = it3;
                    arrayList = arrayList;
                    arrayList2 = arrayList2;
                    z3 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z3);
                if (bool != null && !bool.equals(boolValueOf)) {
                    b1.d("CXCP", "The previous high speed request and the current high speed request must both have a preview stream use case or hint. Previous request contains preview stream use case or hint: " + bool.booleanValue() + ". Current request contains preview stream use case or hint: " + z3 + '.');
                }
                List list4 = ctbVar.a;
                if (list4 == null || !list4.isEmpty()) {
                    Iterator it6 = list4.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            int i2 = ((e3e) it6.next()).a;
                            ArrayList arrayList4 = d3eVar.v;
                            if (arrayList4 == null || !arrayList4.isEmpty()) {
                                Iterator it7 = arrayList4.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        c3e c3eVar2 = (c3e) it7.next();
                                        bu9 bu9Var2 = c3eVar2.g;
                                        if (!(bu9Var2 == null ? false : bu9.a(bu9Var2.a, 3L))) {
                                            cu9 cu9Var2 = c3eVar2.i;
                                            if (!(cu9Var2 == null ? false : cu9.a(cu9Var2.a, 1L))) {
                                                it7 = it7;
                                            }
                                        }
                                        z4 = true;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            z4 = false;
                        }
                    }
                } else {
                    z4 = false;
                }
                Object objValueOf = Boolean.valueOf(z4);
                Boolean bool3 = bool2;
                if (bool3 != null && !bool3.equals(objValueOf)) {
                    b1.d("CXCP", "The previous high speed request and the current high speed request do not have the same video stream use case. Previous request contains video stream use case: " + bool3.booleanValue() + ". Current request contains video stream use case: " + z4 + '.');
                }
                ArrayList arrayList5 = d3eVar.v;
                if (arrayList5 == null || !arrayList5.isEmpty()) {
                    Iterator it8 = arrayList5.iterator();
                    while (it8.hasNext()) {
                        if (!((c3e) it8.next()).a()) {
                            b1.d("CXCP", "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are " + d3eVar.v);
                            return null;
                        }
                    }
                }
                bool2 = objValueOf;
                bool = boolValueOf;
                it3 = it2;
                arrayList = arrayList;
                arrayList2 = arrayList2;
            }
        }
        ArrayList arrayList6 = arrayList;
        ArrayList arrayList7 = arrayList2;
        if (list.isEmpty()) {
            qc0.p("build(...) should never be called with an empty request list!");
            return null;
        }
        Iterator it9 = list.iterator();
        do {
            char c = '!';
            if (!it9.hasNext()) {
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    ctb ctbVar2 = (ctb) it10.next();
                    Log.d("CXCP", "Building CaptureRequest for " + ctbVar2);
                    ttb ttbVar = ctbVar2.e;
                    int i3 = ttbVar != null ? ttbVar.a : 1;
                    re1 re1Var2 = this.a;
                    q47 q47Var = ctbVar2.f;
                    if (q47Var != null) {
                        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) q47Var.b.H0(job.a.b(TotalCaptureResult.class));
                        if (totalCaptureResult == null) {
                            r82.e(q47Var.b, " as TotalCaptureResult", "Failed to unwrap FrameInfo ");
                            return null;
                        }
                        builderH0 = re1Var2.m0().E(totalCaptureResult);
                    } else {
                        builderH0 = re1Var2.m0().h0(i3);
                    }
                    if (builderH0 == null) {
                        if (q47Var != null) {
                            Log.i("CXCP", "Failed to create a ReprocessingCaptureRequest.Builder from " + q47Var.b + c);
                        } else {
                            Log.i("CXCP", "Failed to create a CaptureRequest.Builder from " + ((Object) ttb.b(i3)) + c);
                        }
                        builderH0 = null;
                    }
                    if (builderH0 == null) {
                        return null;
                    }
                    ru8 ru8Var = ih1.b;
                    Object obj = map4.get(ru8Var);
                    if (obj == null) {
                        obj = map.get(ru8Var);
                    }
                    builderH0.setTag(obj);
                    int size = ctbVar2.a.size();
                    boolean z5 = false;
                    for (int i4 = 0; i4 < size; i4++) {
                        Surface surface = (Surface) arrayMap4.get(ctbVar2.a.get(i4));
                        if (surface != null) {
                            builderH0.addTarget(surface);
                            z5 = true;
                        }
                    }
                    if (!z5) {
                        qc0.p("Check failed.");
                        return null;
                    }
                    q47 q47Var2 = ctbVar2.f;
                    if (q47Var2 != null) {
                        if (this.l == null) {
                            b1.d("CXCP", "Failed to queue request to ImageWriter - No ImageWriter available!");
                            return null;
                        }
                        kx6 kx6Var = q47Var2.a;
                        synchronized (this.i) {
                            if (this.j) {
                                b1.l("CXCP", this + " disconnected. " + kx6Var + " can't be queued to " + this.l);
                                return null;
                            }
                            Log.d("CXCP", "Queuing image " + kx6Var + " for reprocessing to ImageWriter " + this.l);
                            ns nsVar = this.l;
                            nsVar.getClass();
                            try {
                                Image image = (Image) kx6Var.H0(job.a.b(Image.class));
                                if (image == null) {
                                    b1.l("CXCP", "Failed to unwrap image wrapper " + kx6Var);
                                } else {
                                    nsVar.a.queueInputImage(image);
                                    vtb.w(builderH0, ctbVar2.b);
                                }
                            } catch (Throwable th) {
                                b1.l("CXCP", "Failed to queue image to " + nsVar + " due to error " + th.getMessage() + ". Ignoring failure and closing " + kx6Var);
                                if (kx6Var instanceof AutoCloseable) {
                                    kx6Var.close();
                                } else {
                                    if (!(kx6Var instanceof ExecutorService)) {
                                        cva.s();
                                        return null;
                                    }
                                    ExecutorService executorService = (ExecutorService) kx6Var;
                                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z6 = false;
                                        while (!zIsTerminated) {
                                            try {
                                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z6) {
                                                    executorService.shutdownNow();
                                                    z6 = true;
                                                }
                                            }
                                        }
                                        if (z6) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                }
                            }
                            Log.d("CXCP", "Failed to queue image " + kx6Var + " for reprocessing to ImageWriter " + this.l);
                            return null;
                        }
                    }
                    vtb.w(builderH0, map);
                    vtb.w(builderH0, map2);
                    vtb.w(builderH0, ctbVar2.b);
                    vtb.w(builderH0, map4);
                    yh0 yh0Var = xc1.c;
                    yh0Var.getClass();
                    long jIncrementAndGet = yh0.b.incrementAndGet(yh0Var);
                    CaptureRequest captureRequestBuild = builderH0.build();
                    captureRequestBuild.getClass();
                    re1 re1Var3 = this.a;
                    if (re1Var3 instanceof ep) {
                        ep epVar = (ep) re1Var3;
                        fp fpVar = epVar.a;
                        arrayMap = arrayMap3;
                        try {
                            Trace.beginSection("CXCP#createHighSpeedRequestList");
                            List<CaptureRequest> listCreateHighSpeedRequestList = epVar.e.createHighSpeedRequestList(captureRequestBuild);
                            try {
                                Trace.endSection();
                            } catch (IllegalArgumentException unused2) {
                                b1.l("CXCP", "Failed to createHighSpeedRequestList from " + fpVar + " because the output surface was destroyed before calling createHighSpeedRequestList.");
                                listCreateHighSpeedRequestList = null;
                            } catch (IllegalStateException unused3) {
                                b1.l("CXCP", "Failed to createHighSpeedRequestList. " + fpVar + " may be closed.");
                                listCreateHighSpeedRequestList = null;
                            } catch (UnsupportedOperationException unused4) {
                                b1.l("CXCP", "Failed to createHighSpeedRequestList from " + fpVar + " because the output surface was not available.");
                                listCreateHighSpeedRequestList = null;
                            }
                            if (listCreateHighSpeedRequestList == null) {
                                return null;
                            }
                            List list5 = ctbVar2.a;
                            if (list5 == null || !list5.isEmpty()) {
                                Iterator it11 = list5.iterator();
                                while (true) {
                                    if (it11.hasNext()) {
                                        int i5 = ((e3e) it11.next()).a;
                                        ArrayList arrayList8 = this.e.v;
                                        if (arrayList8 == null || !arrayList8.isEmpty()) {
                                            Iterator it12 = arrayList8.iterator();
                                            while (true) {
                                                if (it12.hasNext()) {
                                                    c3e c3eVar3 = (c3e) it12.next();
                                                    bu9 bu9Var3 = c3eVar3.g;
                                                    if (bu9Var3 == null ? false : bu9.a(bu9Var3.a, 3L)) {
                                                        j = 1;
                                                    } else {
                                                        cu9 cu9Var3 = c3eVar3.i;
                                                        if (cu9Var3 == null) {
                                                            zA = false;
                                                            j = 1;
                                                        } else {
                                                            j = 1;
                                                            zA = cu9.a(cu9Var3.a, 1L);
                                                        }
                                                        if (!zA) {
                                                            it11 = it11;
                                                            it12 = it12;
                                                        }
                                                    }
                                                    int size2 = listCreateHighSpeedRequestList.size();
                                                    int i6 = 0;
                                                    while (i6 < size2) {
                                                        int i7 = size2;
                                                        int i8 = i6;
                                                        td1 td1Var = new td1(this.a, listCreateHighSpeedRequestList.get(i6), map, map2, map4, arrayMap4, z, ctbVar2, jIncrementAndGet);
                                                        arrayList7.add(listCreateHighSpeedRequestList.get(i8));
                                                        arrayList6.add(td1Var);
                                                        i6 = i8 + 1;
                                                        size2 = i7;
                                                        map4 = map3;
                                                        it10 = it10;
                                                        j = j;
                                                    }
                                                    map4 = map3;
                                                    it10 = it10;
                                                    arrayMap3 = arrayMap;
                                                }
                                            }
                                        }
                                        it11 = it11;
                                        map4 = map3;
                                        arrayList6 = arrayList6;
                                        arrayList7 = arrayList7;
                                        it10 = it10;
                                    }
                                    c = '!';
                                }
                            }
                            it = it10;
                            ArrayList arrayList9 = arrayList7;
                            arrayList6 = arrayList6;
                            map4 = map3;
                            td1 td1Var2 = new td1(this.a, listCreateHighSpeedRequestList.get(0), map, map2, map4, arrayMap4, z, ctbVar2, jIncrementAndGet);
                            arrayList9.add(listCreateHighSpeedRequestList.get(0));
                            arrayList6.add(td1Var2);
                            arrayList7 = arrayList9;
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    } else {
                        arrayMap = arrayMap3;
                        it = it10;
                        map4 = map3;
                        td1 td1Var3 = new td1(re1Var3, captureRequestBuild, map, map2, map4, arrayMap4, z, ctbVar2, jIncrementAndGet);
                        arrayList7.add(captureRequestBuild);
                        arrayList6.add(td1Var3);
                    }
                    it10 = it;
                    arrayMap3 = arrayMap;
                    arrayMap2 = arrayMap2;
                    c = '!';
                }
                return new uc1(this.a.m0().x(), z, arrayList7, arrayList6, list2, kd9Var, arrayMap2, arrayMap3, this.e, this.f);
            }
            ctb ctbVar3 = (ctb) it9.next();
            z2 = false;
            for (e3e e3eVar : ctbVar3.a) {
                int i9 = e3eVar.a;
                if (!arrayMap4.containsKey(e3eVar)) {
                    Surface surface2 = (Surface) this.c.get(e3eVar);
                    if (surface2 != null) {
                        arrayMap2.put(surface2, e3eVar);
                        arrayMap4.put(e3eVar, surface2);
                        xj1 xj1VarB = this.e.b(i9);
                        if (xj1VarB == null) {
                            qc0.p("Required value was null.");
                            return null;
                        }
                        for (c3e c3eVar4 : xj1VarB.b) {
                            Object obj2 = this.d.get(new qt9(c3eVar4.a));
                            if (obj2 == null) {
                                qc0.p("Required value was null.");
                                return null;
                            }
                            arrayMap3.put((Surface) obj2, new qt9(c3eVar4.a));
                        }
                    } else {
                        continue;
                    }
                }
                z2 = true;
            }
            if (!z2) {
                Log.i("CXCP", "  Failed to bind any surfaces for " + ctbVar3 + '!');
                return null;
            }
        } while (z2);
        qc0.p("Check failed.");
        return null;
    }

    public final void c() {
        uc1 uc1Var;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.i) {
                try {
                    if (this.j) {
                        uc1Var = null;
                    } else {
                        this.j = true;
                        ns nsVar = this.l;
                        if (nsVar != null) {
                            ks0.u(nsVar);
                        }
                        Surface inputSurface = this.a.getInputSurface();
                        if (inputSurface != null) {
                            inputSurface.release();
                        }
                        uc1Var = this.k;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.g && uc1Var != null) {
                a(uc1Var);
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006b A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    public final Integer d(uc1 uc1Var) {
        boolean z;
        re1 re1Var;
        ArrayList arrayList;
        Integer numQ0;
        synchronized (this.i) {
            if (this.j) {
                b1.l("CXCP", this + " disconnected. " + uc1Var + " won't be submitted");
                return null;
            }
            if (uc1Var.c.size() == 1) {
                re1 re1Var2 = this.a;
                if (re1Var2 instanceof ep) {
                    z = uc1Var.b;
                    re1Var = this.a;
                    arrayList = uc1Var.c;
                    if (z) {
                        numQ0 = re1Var.K0(arrayList, uc1Var);
                    } else {
                        numQ0 = re1Var.Q0(arrayList, uc1Var);
                    }
                } else if (uc1Var.b) {
                    if (this.g) {
                        this.k = uc1Var;
                    }
                    numQ0 = re1Var2.O0((CaptureRequest) uc1Var.c.get(0), uc1Var);
                } else {
                    numQ0 = re1Var2.K((CaptureRequest) uc1Var.c.get(0), uc1Var);
                }
            } else {
                z = uc1Var.b;
                re1Var = this.a;
                arrayList = uc1Var.c;
                if (z) {
                    numQ0 = re1Var.K0(arrayList, uc1Var);
                } else {
                    numQ0 = re1Var.Q0(arrayList, uc1Var);
                }
            }
            return numQ0;
        }
    }

    public final String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.h;
    }
}
