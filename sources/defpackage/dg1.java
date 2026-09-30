package defpackage;

import android.content.res.TypedArray;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dg1 implements yf1 {
    public final aw2 X;
    public final ho2 Y;
    public final sh0 Z;
    public final ud6 a;
    public final ud6 b;
    public final d3e c;
    public final jae d;
    public final gc1 e;
    public final sy5 f;
    public final qy5 g;
    public final lk0 v;
    public final bg1 w;
    public final eg1 x;
    public final fg1 y;
    public final yd6 z;

    public dg1(uf1 uf1Var, yg1 yg1Var, ud6 ud6Var, ud6 ud6Var2, d3e d3eVar, jae jaeVar, gc1 gc1Var, sy5 sy5Var, qy5 qy5Var, lk0 lk0Var, bg1 bg1Var, eg1 eg1Var, fg1 fg1Var, yd6 yd6Var, aw2 aw2Var, ho2 ho2Var) {
        String strA;
        ArrayList arrayList = uf1Var.d;
        int i = uf1Var.h;
        yg1Var.getClass();
        ud6Var.getClass();
        ud6Var2.getClass();
        d3eVar.getClass();
        List list = d3eVar.f;
        jaeVar.getClass();
        gc1Var.getClass();
        sy5Var.getClass();
        qy5Var.getClass();
        lk0Var.getClass();
        eg1Var.getClass();
        fg1Var.getClass();
        yd6Var.getClass();
        aw2Var.getClass();
        ho2Var.getClass();
        this.a = ud6Var;
        this.b = ud6Var2;
        this.c = d3eVar;
        this.d = jaeVar;
        this.e = gc1Var;
        this.f = sy5Var;
        this.g = qy5Var;
        this.v = lk0Var;
        this.w = bg1Var;
        this.x = eg1Var;
        this.y = fg1Var;
        this.z = yd6Var;
        this.X = aw2Var;
        this.Y = ho2Var;
        this.Z = vpf.m(false);
        String str = uf1Var.a;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        nc1 nc1Var = (nc1) yg1Var;
        Integer num = (Integer) nc1Var.c(key);
        String str2 = "External";
        String str3 = "Unknown";
        String str4 = (num != null && num.intValue() == 0) ? "Front" : (num != null && num.intValue() == 1) ? "Back" : (num != null && num.intValue() == 2) ? "External" : "Unknown";
        CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key2.getClass();
        Integer num2 = (Integer) nc1Var.c(key2);
        if (num2 != null && num2.intValue() == 0) {
            str2 = "Limited";
        } else if (num2 != null && num2.intValue() == 1) {
            str2 = "Full";
        } else if (num2 != null && num2.intValue() == 2) {
            str2 = "Legacy";
        } else if (num2 != null && num2.intValue() == 3) {
            str2 = "Level 3";
        } else if (num2 == null || num2.intValue() != 4) {
            str2 = "Unknown";
        }
        if (i == 1) {
            str3 = "High Speed";
        } else if (i == 0) {
            str3 = "Normal";
        } else if (i == 2) {
            str3 = "Extension";
        }
        CameraCharacteristics.Key key3 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key3.getClass();
        int[] iArr = (int[]) nc1Var.c(key3);
        String str5 = (iArr == null || !qd0.T(iArr, 11)) ? "Physical" : "Logical";
        StringBuilder sb = new StringBuilder();
        sb.append(this + " (Camera " + str + ")\n");
        StringBuilder sbO = ib8.o("  Facing:    ", str4, " (", str5, ", ");
        sbO.append(str2);
        sbO.append(")\n");
        sb.append(sbO.toString());
        sb.append("  Mode:      " + str3 + '\n');
        sb.append("Outputs:\n");
        Iterator it = d3eVar.g.iterator();
        while (true) {
            int i2 = 12;
            if (!it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                List<a3e> list2 = list;
                if (!list2.isEmpty()) {
                    sb.append("Inputs:\n");
                    for (a3e a3eVar : list2) {
                        sb.append(" ");
                        sb.append(v4e.V(12, "Input-" + a3eVar.a));
                        sb.append(v4e.V(12, y2e.b(a3eVar.b)));
                        sb.append(v4e.V(12, String.valueOf(1)));
                        sb.append("\n");
                    }
                }
                sb.append("Session Template: " + ttb.a(uf1Var.f) + '\n');
                cgg.o(sb, "Session Parameters", uf1Var.g);
                sb.append("Default Template: " + ttb.a(1) + '\n');
                cgg.o(sb, "Default Parameters", uf1Var.i);
                cgg.o(sb, "Required Parameters", uf1Var.l);
                Log.i("CXCP", sb.toString());
                if (i3 == 1) {
                    if (this.c.v.isEmpty()) {
                        qc0.j("Cannot create a HIGH_SPEED CameraGraph without outputs.");
                        throw null;
                    }
                    int size = this.c.v.size();
                    d3e d3eVar2 = this.c;
                    if (size > 2) {
                        ho7.y(d3eVar2.v, "Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ");
                        throw null;
                    }
                    ArrayList arrayList3 = d3eVar2.v;
                    if (arrayList3 == null || !arrayList3.isEmpty()) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            if (!((c3e) it2.next()).a()) {
                                ho7.y(this.c.v, "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ");
                                throw null;
                            }
                        }
                    }
                }
                if (arrayList2 != null) {
                    if (arrayList2.isEmpty()) {
                        qc0.j("At least one InputConfiguration is required for reprocessing");
                        throw null;
                    }
                    if (Build.VERSION.SDK_INT < 31 && arrayList2.size() > 1) {
                        qc0.j("Multi resolution reprocessing not supported under Android S");
                        throw null;
                    }
                }
                if (this.c.e.isEmpty()) {
                    return;
                }
                this.d.b();
                return;
            }
            Iterator it3 = ((xj1) it.next()).b.iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    t72.Z();
                    throw null;
                }
                c3e c3eVar = (c3e) next;
                sb.append("  ");
                if (i4 == 0) {
                    xj1 xj1Var = c3eVar.j;
                    if (xj1Var == null) {
                        pa7.g0("stream");
                        throw null;
                    }
                    strA = e3e.a(xj1Var.a);
                } else {
                    strA = "";
                }
                sb.append(v4e.V(i2, strA));
                int i6 = c3eVar.a;
                String str6 = c3eVar.d;
                sb.append(v4e.V(i2, qt9.a(i6)));
                String string = c3eVar.b.toString();
                string.getClass();
                sb.append(v4e.V(i2, string));
                sb.append(v4e.V(16, y2e.a(c3eVar.c)));
                au9 au9Var = c3eVar.e;
                if (au9Var != null) {
                    sb.append(" [" + ((Object) au9.a(au9Var.a)) + ']');
                }
                zt9 zt9Var = c3eVar.f;
                Iterator it4 = it;
                ArrayList arrayList4 = arrayList;
                if (zt9Var != null) {
                    sb.append(" [" + ((Object) zt9.a(zt9Var.a)) + ']');
                }
                bu9 bu9Var = c3eVar.g;
                int i7 = i;
                if (bu9Var != null) {
                    long j = bu9Var.a;
                    StringBuilder sb2 = new StringBuilder(" [");
                    sb2.append((Object) ("StreamUseCase(value=" + j + ')'));
                    sb2.append(']');
                    sb.append(sb2.toString());
                }
                cu9 cu9Var = c3eVar.i;
                if (cu9Var != null) {
                    long j2 = cu9Var.a;
                    StringBuilder sb3 = new StringBuilder(" [");
                    sb3.append((Object) ("StreamUseHint(value=" + j2 + ')'));
                    sb3.append(']');
                    sb.append(sb3.toString());
                }
                if (!pa7.t(str6, str)) {
                    sb.append(" [");
                    sb.append(new ig1(str6));
                    sb.append("]");
                }
                sb.append("\n");
                it = it4;
                it3 = it3;
                i = i7;
                arrayList = arrayList4;
                i4 = i5;
                list = list;
                i2 = 12;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.Z.a()) {
            Trace.beginSection(this + "#close");
            StringBuilder sb = new StringBuilder("Closing ");
            sb.append(this);
            Log.i("CXCP", sb.toString());
            this.a.c.close();
            gc1 gc1Var = this.e;
            synchronized (gc1Var.q) {
                try {
                    if (!gc1Var.c()) {
                        gc1Var.s = gf1.q;
                        Log.d("CXCP", "Closed " + gc1Var);
                        eyf eyfVar = gc1Var.y;
                        qo1 qo1Var = gc1Var.z;
                        gc1Var.y = null;
                        gc1Var.z = null;
                        lyd lydVar = gc1Var.w;
                        if (lydVar != null) {
                            lydVar.h(null);
                        }
                        lyd lydVar2 = gc1Var.B;
                        if (lydVar2 != null) {
                            lydVar2.h(null);
                        }
                        gc1Var.B = null;
                        lyd lydVar3 = gc1Var.C;
                        if (lydVar3 != null) {
                            lydVar3.h(null);
                        }
                        gc1Var.C = null;
                        lyd lydVar4 = gc1Var.D;
                        if (lydVar4 != null) {
                            lydVar4.h(null);
                        }
                        gc1Var.D = null;
                        ks0.u(gc1Var.g);
                        gc1Var.b(qo1Var, eyfVar);
                        uf1 uf1Var = gc1Var.d;
                        if (uf1Var.n.e || gc1Var.l.a(uf1Var.a)) {
                            Log.d("CXCP", "Quirk: Closing " + ((Object) ig1.b(gc1Var.d.a)) + " during " + gc1Var + "#close");
                            gc1Var.j.a(gc1Var.d.a);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f.close();
            this.g.close();
            this.d.close();
            this.c.close();
            lk0 lk0Var = this.v;
            lk0Var.getClass();
            synchronized (lk0Var.c) {
                mk0 mk0VarA = lk0Var.a();
                lk0Var.d.remove(this);
                mk0 mk0VarA2 = lk0Var.a();
                if (mk0VarA2 != null && !mk0VarA2.equals(mk0VarA)) {
                    vv2 vv2Var = lk0Var.b;
                    qn2 qn2Var = lk0Var.a;
                    kk0 kk0Var = new kk0(lk0Var, mk0VarA2, null);
                    vv2Var.getClass();
                    qn2Var.getClass();
                    ynb.V(qn2Var, null, dw2.d, new j99(vv2Var, kk0Var, null), 1);
                }
            }
            jgb.I(this.X, null);
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(zn2 zn2Var) {
        cg1 cg1Var;
        if (zn2Var instanceof cg1) {
            cg1Var = (cg1) zn2Var;
            int i = cg1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cg1Var.label = i - Integer.MIN_VALUE;
            } else {
                cg1Var = new cg1(this, zn2Var);
            }
        } else {
            cg1Var = new cg1(this, zn2Var);
        }
        Object objA = cg1Var.result;
        int i2 = cg1Var.label;
        if (i2 == 0) {
            jzb.q(objA);
            cg1Var.label = 1;
            objA = this.z.a(cg1Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objA);
        }
        return new gg1((h99) objA, this.a, this.Y, this.g, this.x, this.y);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0133  */
    public final void l(int i, Surface surface) throws Exception {
        String str;
        AutoCloseable autoCloseable;
        boolean zIsTerminated;
        Trace.beginSection(((Object) e3e.a(i)) + "#setSurface");
        if (surface != null && !surface.isValid()) {
            b1.l("CXCP", this + "#setSurface: " + surface + " is invalid");
        }
        jae jaeVar = this.d;
        if (jaeVar.d.keySet().contains(new e3e(i))) {
            StringBuilder sb = new StringBuilder("Cannot configure surface for ");
            sb.append((Object) e3e.a(i));
            qc0.m(sb, ", it is permanently assigned to ", jaeVar.d.get(new e3e(i)));
            return;
        }
        synchronized (jaeVar.e) {
            if (!jaeVar.w) {
                if (surface != null) {
                    str = "Configured " + ((Object) e3e.a(i)) + " with " + surface;
                } else {
                    str = "Removed surface for " + ((Object) e3e.a(i));
                }
                Log.i("CXCP", str);
                LinkedHashMap linkedHashMap = jaeVar.f;
                if (surface == null) {
                    Surface surface2 = (Surface) linkedHashMap.remove(new e3e(i));
                    if (!jaeVar.v || surface2 == null) {
                        autoCloseable = null;
                    } else {
                        autoCloseable = (AutoCloseable) jaeVar.g.remove(surface2);
                    }
                } else {
                    Surface surface3 = (Surface) linkedHashMap.get(new e3e(i));
                    jaeVar.f.put(new e3e(i), surface);
                    if (!jaeVar.v || pa7.t(surface3, surface)) {
                        autoCloseable = null;
                    } else {
                        if (jaeVar.g.containsKey(surface)) {
                            throw new IllegalStateException(("Surface (" + surface + ") is already in use!").toString());
                        }
                        autoCloseable = (AutoCloseable) z7f.q(jaeVar.g).remove(surface3);
                        jaeVar.g.put(surface, jaeVar.c.a(surface));
                    }
                }
                jaeVar.b();
                if (autoCloseable != null) {
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
            } else if (surface != null) {
                b1.l("CXCP", "Refusing to configure " + ((Object) e3e.a(i)) + " with " + surface + " after close!");
            }
        }
        Trace.endSection();
    }

    public final String toString() {
        return this.w.a;
    }
}
