package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.os.Trace;
import android.util.Log;
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
public final class vd6 {
    public final wc1 a;
    public final int b;
    public final sh0 c;
    public final ArrayList d;
    public final kd9 e;

    public vd6(wc1 wc1Var) {
        this.a = wc1Var;
        wh0 wh0Var = wd6.a;
        wh0Var.getClass();
        this.b = wh0.b.incrementAndGet(wh0Var);
        this.c = vpf.m(false);
        this.d = new ArrayList();
        this.e = new kd9(15, this);
    }

    public final void a() {
        List<uc1> listJ1;
        synchronized (this.d) {
            listJ1 = s72.j1(this.d);
            this.d.clear();
        }
        for (uc1 uc1Var : listJ1) {
            Trace.beginSection("InvokeInternalListeners");
            int size = uc1Var.d.size();
            for (int i = 0; i < size; i++) {
                qtb qtbVar = (qtb) uc1Var.d.get(i);
                int size2 = uc1Var.e.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((atb) uc1Var.e.get(i2)).k0(qtbVar.h());
                }
            }
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = uc1Var.d.size();
            for (int i3 = 0; i3 < size3; i3++) {
                qtb qtbVar2 = (qtb) uc1Var.d.get(i3);
                int size4 = qtbVar2.h().d.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((atb) qtbVar2.h().d.get(i4)).k0(qtbVar2.h());
                }
            }
            Trace.endSection();
        }
        wc1 wc1Var = this.a;
        synchronized (wc1Var.i) {
            Log.d("CXCP", wc1Var + "#abortCaptures");
            wc1Var.a.b0();
        }
    }

    public final wef b() {
        Log.d("CXCP", "Closing " + this);
        boolean zA = this.c.a();
        wef wefVar = wef.a;
        if (zA) {
            this.a.c();
        }
        return wefVar;
    }

    public final void c() {
        wc1 wc1Var = this.a;
        synchronized (wc1Var.i) {
            Log.d("CXCP", wc1Var + "#stopRepeating");
            wc1Var.a.B0();
        }
    }

    public final boolean d(boolean z, List list, Map map, Map map2, Map map3, List list2) throws Throwable {
        Throwable th;
        boolean z2;
        boolean zIsTerminated;
        list.getClass();
        map2.getClass();
        map3.getClass();
        list2.getClass();
        if (this.c.b()) {
            b1.l("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
            return false;
        }
        try {
            Trace.beginSection("CXCP#buildCaptureSequence");
            uc1 uc1VarB = this.a.b(z, list, map, map2, map3, this.e, list2);
            Trace.endSection();
            boolean z3 = true;
            if (uc1VarB == null) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((ctb) it.next()).f != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                ctb ctbVar = (ctb) it2.next();
                                q47 q47Var = ctbVar.f;
                                if (q47Var != null) {
                                    kx6 kx6Var = q47Var.a;
                                    if (kx6Var instanceof AutoCloseable) {
                                        kx6Var.close();
                                    } else {
                                        if (!(kx6Var instanceof ExecutorService)) {
                                            cva.s();
                                            return false;
                                        }
                                        ExecutorService executorService = (ExecutorService) kx6Var;
                                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                                            executorService.shutdown();
                                            boolean z4 = false;
                                            while (!zIsTerminated) {
                                                try {
                                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                } catch (InterruptedException unused) {
                                                    if (!z4) {
                                                        executorService.shutdownNow();
                                                        z4 = true;
                                                    }
                                                }
                                            }
                                            if (z4) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                    }
                                }
                                Iterator it3 = ctbVar.d.iterator();
                                while (it3.hasNext()) {
                                    ((atb) it3.next()).k0(ctbVar);
                                }
                            }
                            return true;
                        }
                    }
                }
                b1.l("CXCP", "Failed to submit " + list + ": " + this + " failed to build CaptureSequence.");
                return false;
            }
            if (this.c.b()) {
                b1.l("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
                return false;
            }
            if (!uc1VarB.b) {
                synchronized (this.d) {
                    this.d.add(uc1VarB);
                }
            }
            try {
                Log.d("CXCP", this + " submitting " + uc1VarB);
                Trace.beginSection("InvokeInternalListeners");
                int size = uc1VarB.d.size();
                for (int i = 0; i < size; i++) {
                    qtb qtbVar = (qtb) uc1VarB.d.get(i);
                    int size2 = uc1VarB.e.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((atb) uc1VarB.e.get(i2)).u(qtbVar);
                    }
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size3 = uc1VarB.d.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    qtb qtbVar2 = (qtb) uc1VarB.d.get(i3);
                    int size4 = qtbVar2.h().d.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        ((atb) qtbVar2.h().d.get(i4)).u(qtbVar2);
                    }
                }
                Trace.endSection();
                synchronized (uc1VarB) {
                    if (!this.c.b()) {
                        try {
                            Trace.beginSection("CXCP#submit(CaptureSequence)");
                            Integer numD = this.a.d(uc1VarB);
                            int iIntValue = numD != null ? numD.intValue() : -1;
                            uc1VarB.m = Integer.valueOf(iIntValue);
                            Trace.endSection();
                            if (iIntValue != -1) {
                                Trace.beginSection("InvokeInternalListeners");
                                int size5 = uc1VarB.d.size();
                                for (int i5 = 0; i5 < size5; i5++) {
                                    qtb qtbVar3 = (qtb) uc1VarB.d.get(i5);
                                    int size6 = uc1VarB.e.size();
                                    for (int i6 = 0; i6 < size6; i6++) {
                                        ((atb) uc1VarB.e.get(i6)).U(qtbVar3);
                                    }
                                }
                                Trace.endSection();
                                Trace.beginSection("InvokeRequestListeners");
                                int size7 = uc1VarB.d.size();
                                for (int i7 = 0; i7 < size7; i7++) {
                                    qtb qtbVar4 = (qtb) uc1VarB.d.get(i7);
                                    int size8 = qtbVar4.h().d.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        ((atb) qtbVar4.h().d.get(i8)).U(qtbVar4);
                                    }
                                }
                                Trace.endSection();
                                try {
                                    Log.d("CXCP", this + " submitted " + uc1VarB);
                                    z2 = true;
                                } catch (CameraAccessException unused2) {
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (z3 || uc1VarB.b) {
                                        throw th;
                                    }
                                    synchronized (this.d) {
                                        this.d.remove(uc1VarB);
                                    }
                                    Trace.beginSection("InvokeInternalListeners");
                                    int size9 = uc1VarB.d.size();
                                    for (int i9 = 0; i9 < size9; i9++) {
                                        qtb qtbVar5 = (qtb) uc1VarB.d.get(i9);
                                        int size10 = uc1VarB.e.size();
                                        for (int i10 = 0; i10 < size10; i10++) {
                                            ((atb) uc1VarB.e.get(i10)).k0(qtbVar5.h());
                                        }
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("InvokeRequestListeners");
                                    int size11 = uc1VarB.d.size();
                                    for (int i11 = 0; i11 < size11; i11++) {
                                        qtb qtbVar6 = (qtb) uc1VarB.d.get(i11);
                                        int size12 = qtbVar6.h().d.size();
                                        for (int i12 = 0; i12 < size12; i12++) {
                                            ((atb) qtbVar6.h().d.get(i12)).k0(qtbVar6.h());
                                        }
                                    }
                                    Trace.endSection();
                                    throw th;
                                }
                            } else {
                                b1.l("CXCP", "Failed to submit " + uc1VarB + ": " + this + " received -1 from submit.");
                                z2 = false;
                                z3 = false;
                            }
                            if (z2 || uc1VarB.b) {
                                return z3;
                            }
                            synchronized (this.d) {
                                this.d.remove(uc1VarB);
                            }
                            Trace.beginSection("InvokeInternalListeners");
                            int size13 = uc1VarB.d.size();
                            for (int i13 = 0; i13 < size13; i13++) {
                                qtb qtbVar7 = (qtb) uc1VarB.d.get(i13);
                                int size14 = uc1VarB.e.size();
                                for (int i14 = 0; i14 < size14; i14++) {
                                    ((atb) uc1VarB.e.get(i14)).k0(qtbVar7.h());
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size15 = uc1VarB.d.size();
                            for (int i15 = 0; i15 < size15; i15++) {
                                qtb qtbVar8 = (qtb) uc1VarB.d.get(i15);
                                int size16 = qtbVar8.h().d.size();
                                for (int i16 = 0; i16 < size16; i16++) {
                                    ((atb) qtbVar8.h().d.get(i16)).k0(qtbVar8.h());
                                }
                            }
                            Trace.endSection();
                            return z3;
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                    b1.l("CXCP", "Failed to submit " + uc1VarB + ": " + this + " is closed.");
                    if (!uc1VarB.b) {
                        synchronized (this.d) {
                            this.d.remove(uc1VarB);
                        }
                        Trace.beginSection("InvokeInternalListeners");
                        int size17 = uc1VarB.d.size();
                        for (int i17 = 0; i17 < size17; i17++) {
                            qtb qtbVar9 = (qtb) uc1VarB.d.get(i17);
                            int size18 = uc1VarB.e.size();
                            for (int i18 = 0; i18 < size18; i18++) {
                                ((atb) uc1VarB.e.get(i18)).k0(qtbVar9.h());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size19 = uc1VarB.d.size();
                        for (int i19 = 0; i19 < size19; i19++) {
                            qtb qtbVar10 = (qtb) uc1VarB.d.get(i19);
                            int size20 = qtbVar10.h().d.size();
                            for (int i20 = 0; i20 < size20; i20++) {
                                ((atb) qtbVar10.h().d.get(i20)).k0(qtbVar10.h());
                            }
                        }
                        Trace.endSection();
                        return false;
                    }
                    return false;
                }
            } catch (CameraAccessException unused3) {
                if (!uc1VarB.b) {
                    synchronized (this.d) {
                        this.d.remove(uc1VarB);
                        Trace.beginSection("InvokeInternalListeners");
                        int size21 = uc1VarB.d.size();
                        for (int i21 = 0; i21 < size21; i21++) {
                            qtb qtbVar11 = (qtb) uc1VarB.d.get(i21);
                            int size22 = uc1VarB.e.size();
                            for (int i22 = 0; i22 < size22; i22++) {
                                ((atb) uc1VarB.e.get(i22)).k0(qtbVar11.h());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size23 = uc1VarB.d.size();
                        for (int i23 = 0; i23 < size23; i23++) {
                            qtb qtbVar12 = (qtb) uc1VarB.d.get(i23);
                            int size24 = qtbVar12.h().d.size();
                            for (int i24 = 0; i24 < size24; i24++) {
                                ((atb) qtbVar12.h().d.get(i24)).k0(qtbVar12.h());
                            }
                        }
                        Trace.endSection();
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                z3 = false;
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    public final String toString() {
        return "GraphRequestProcessor-" + this.b;
    }
}
