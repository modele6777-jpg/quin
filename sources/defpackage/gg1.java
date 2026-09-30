package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gg1 implements hf1, AutoCloseable {
    public final h99 a;
    public final ud6 b;
    public final ho2 c;
    public final eg1 d;
    public final fg1 e;
    public final int f;

    public gg1(h99 h99Var, ud6 ud6Var, ho2 ho2Var, qy5 qy5Var, eg1 eg1Var, fg1 fg1Var) {
        h99Var.getClass();
        ud6Var.getClass();
        ho2Var.getClass();
        qy5Var.getClass();
        eg1Var.getClass();
        fg1Var.getClass();
        this.a = h99Var;
        this.b = ud6Var;
        this.c = ho2Var;
        this.d = eg1Var;
        this.e = fg1Var;
        wh0 wh0Var = hg1.a;
        wh0Var.getClass();
        this.f = wh0.b.incrementAndGet(wh0Var);
    }

    public static za2 E(gg1 gg1Var, long j, int i) {
        Map map;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = (i & 1) != 0 ? null : bool;
        Boolean bool3 = (i & 4) != 0 ? null : bool;
        long j2 = (i & 32) != 0 ? 3000000000L : j;
        if (gg1Var.a.a()) {
            r82.e(gg1Var, " after close.", "Cannot call unlock3A on ");
            return null;
        }
        ho2 ho2Var = gg1Var.c;
        Long l = new Long(j2);
        za2 za2Var = ho2.p;
        ud6 ud6Var = ho2Var.a;
        xg1 xg1Var = yg1.o;
        yg1 yg1Var = ho2Var.b;
        xg1Var.getClass();
        Boolean bool4 = !xg1.a(yg1Var) ? null : bool;
        if (!pa7.t(bool2, bool) && !pa7.t(bool4, bool) && !pa7.t(bool3, bool)) {
            return y7h.b(new fzb(0, null));
        }
        if (ud6Var.c.l() == null) {
            return za2Var;
        }
        if (pa7.t(bool4, bool)) {
            Log.d("CXCP", "unlock3A - sending a request to unlock af first.");
            if (!ud6Var.e(ho2.m)) {
                Log.d("CXCP", "unlock3A - failed to send a request to unlock af first.");
                return za2Var;
            }
            de6.b(ho2Var.c, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767);
        }
        boolean zT = pa7.t(bool2, bool);
        boolean zT2 = pa7.t(bool4, bool);
        boolean zT3 = pa7.t(bool3, bool);
        if (zT || zT2 || zT3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (zT) {
                linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, ho2.q);
            }
            if (zT2) {
                linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, ho2.r);
            }
            if (zT3) {
                linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, ho2.s);
            }
            map = linkedHashMap;
        } else {
            map = qu4.a;
        }
        gzb gzbVar = new gzb(new xq2(1, map), 60, l);
        y88 y88Var = ho2Var.d;
        y88Var.getClass();
        y88Var.a.add(gzbVar);
        Boolean bool5 = pa7.t(bool2, bool) ? Boolean.FALSE : null;
        Boolean bool6 = pa7.t(bool3, bool) ? Boolean.FALSE : null;
        if (bool5 != null || bool6 != null) {
            Log.d("CXCP", "unlock3A - updating graph state, aeLock=" + bool5 + ", awbLock=" + bool6);
            de6.b(ho2Var.c, null, null, null, null, null, null, null, bool5, null, bool6, 383);
        }
        ud6Var.f(ho2Var.c.a());
        return gzbVar.d;
    }

    public static za2 h(gg1 gg1Var, final boolean z, final boolean z2, long j) {
        if (gg1Var.a.a()) {
            r82.e(gg1Var, " after close.", "Cannot call lock3AForCapture on ");
            return null;
        }
        ho2 ho2Var = gg1Var.c;
        ho2Var.getClass();
        Map map = ho2.o;
        Map map2 = z ? map : ho2.n;
        a26 a26Var = new a26() { // from class: fo2
            /* JADX WARN: Code duplicated, block: B:11:0x0034  */
            /* JADX WARN: Code duplicated, block: B:28:0x0079  */
            /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
            @Override // defpackage.a26
            public final Object d(Object obj) {
                boolean zO0;
                boolean z3;
                boolean zContains;
                es esVar = (es) obj;
                esVar.getClass();
                CaptureResult.Key key = CaptureResult.CONTROL_AF_MODE;
                key.getClass();
                CaptureResult captureResult = esVar.a;
                Integer num = (Integer) captureResult.get(key);
                if (num != null) {
                    int iIntValue = num.intValue();
                    List list = uh.b;
                    if (iIntValue == 0) {
                        zO0 = true;
                    } else if (z) {
                        CaptureResult.Key key2 = CaptureResult.CONTROL_AF_STATE;
                        key2.getClass();
                        Object obj2 = captureResult.get(key2);
                        List list2 = ho2.i;
                        if (obj2 != null) {
                            zO0 = list2.contains(obj2);
                        } else {
                            zO0 = true;
                        }
                    } else if (iIntValue == 3 || iIntValue == 4) {
                        List list3 = ho2.f;
                        CaptureResult.Key key3 = CaptureResult.CONTROL_AF_STATE;
                        key3.getClass();
                        zO0 = s72.o0(list3, captureResult.get(key3));
                    } else {
                        zO0 = true;
                    }
                } else {
                    zO0 = false;
                }
                CaptureResult.Key key4 = CaptureResult.CONTROL_AE_MODE;
                key4.getClass();
                Integer num2 = (Integer) captureResult.get(key4);
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    List list4 = th.b;
                    if (iIntValue2 != 0) {
                        CaptureResult.Key key5 = CaptureResult.CONTROL_AE_STATE;
                        key5.getClass();
                        Object obj3 = captureResult.get(key5);
                        if (!(obj3 != null ? ho2.j.contains(obj3) : true)) {
                            z3 = false;
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                CaptureResult.Key key6 = CaptureResult.CONTROL_AWB_MODE;
                key6.getClass();
                Integer num3 = (Integer) captureResult.get(key6);
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                List list5 = vr0.b;
                boolean z4 = z2;
                if (z4 && num3 == null) {
                    zContains = false;
                } else if (!z4 || iIntValue3 == 0) {
                    zContains = true;
                } else {
                    CaptureResult.Key key7 = CaptureResult.CONTROL_AWB_STATE;
                    key7.getClass();
                    Object obj4 = captureResult.get(key7);
                    List list6 = ho2.k;
                    if (obj4 != null) {
                        zContains = list6.contains(obj4);
                    } else {
                        zContains = true;
                    }
                }
                Log.d("CXCP", "lock3AForCapture state " + ((Object) yy5.a(captureResult.getFrameNumber())) + ": meetsAeCondition = " + z3 + ", meetsAfCondition = " + zO0 + ", meetsAwbCondition = " + zContains);
                return Boolean.valueOf(z3 && zO0 && zContains);
            }
        };
        y88 y88Var = ho2Var.d;
        za2 za2Var = ho2.p;
        ud6 ud6Var = ho2Var.a;
        if (ud6Var.c.l() == null) {
            return za2Var;
        }
        if (map2 != null) {
            map = map2;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            pa7.t(((Map.Entry) it.next()).getValue(), 1);
        }
        gzb gzbVar = new gzb(a26Var, 60, Long.valueOf(j));
        y88Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = y88Var.a;
        copyOnWriteArrayList.add(gzbVar);
        Log.d("CXCP", "lock3AForCapture - sending a request to trigger ae precapture metering and af.");
        if (ud6Var.e(map)) {
            ud6Var.f(ho2Var.c.a());
            return gzbVar.d;
        }
        copyOnWriteArrayList.remove(gzbVar);
        return za2Var;
    }

    public final za2 G(boolean z) {
        if (this.a.a()) {
            r82.e(this, " after close.", "Cannot call unlock3APostCapture on ");
            return null;
        }
        za2 za2Var = ho2.p;
        ho2 ho2Var = this.c;
        ud6 ud6Var = ho2Var.a;
        if (ud6Var.c.l() != null) {
            Log.d("CXCP", "unlock3APostCapture - sending a request to reset af and ae precapture metering.");
            if (ud6Var.e(z ? ho2.u : ho2.t)) {
                gzb gzbVar = z ? new gzb(ho2.v, null, null) : new gzb(qu4.a);
                y88 y88Var = ho2Var.d;
                y88Var.getClass();
                y88Var.a.add(gzbVar);
                ud6Var.f(ho2Var.c.a());
                return gzbVar.d;
            }
        }
        return za2Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d.a) {
        }
        synchronized (this.e.a) {
        }
        this.a.b();
    }

    public final za2 l() {
        th thVar = null;
        if (this.a.a()) {
            r82.e(this, " after close.", "Cannot call setTorchOn on ");
            return null;
        }
        ho2 ho2Var = this.c;
        th thVar2 = ((k0e) ho2Var.c.a.a).a;
        List list = th.b;
        int i = 1;
        if ((thVar2 == null || thVar2.a != 1) && (thVar2 == null || thVar2.a != 0)) {
            thVar = new th(i);
        }
        return ho2.b(ho2Var, thVar, null, null, new yi5(2), null, null, null, 118);
    }

    public final String toString() {
        return "CameraGraph.Session-" + this.f;
    }

    public final void u() {
        if (this.a.a()) {
            r82.e(this, " after close.", "Cannot call stopRepeating on ");
        } else {
            this.b.d(null);
        }
    }

    public final void x(List list) {
        Object next;
        list.getClass();
        if (this.a.a()) {
            r82.e(this, " after close.", "Cannot call submit on ");
            return;
        }
        if (list.isEmpty()) {
            qc0.p("Cannot call submit with an empty list of Requests!");
            return;
        }
        ud6 ud6Var = this.b;
        ud6Var.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ctb) next).f == null);
        ctb ctbVar = (ctb) next;
        if (ctbVar == null || ud6Var.b.d != null) {
            td6 td6Var = ud6Var.c;
            if (td6Var.g.c(new gd6(list))) {
                return;
            }
            td6Var.b(list);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot submit ");
        sb.append(ctbVar);
        q47 q47Var = ctbVar.f;
        sb.append(" with input request ");
        sb.append(q47Var);
        sb.append(" to ");
        sb.append(ud6Var);
        sb.append(" because CameraGraph was not configured to support reprocessing");
        throw new IllegalStateException(sb.toString().toString());
    }
}
