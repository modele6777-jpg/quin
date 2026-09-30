package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pjf implements ajf {
    public static final za2 l = y7h.b(new fzb(4, null));
    public static final za2 m;
    public final h1b a;
    public final h1b b;
    public final ckf c;
    public final h1b d;
    public final lkf e;
    public final uk1 f;
    public volatile boolean g;
    public final ace h;
    public final ace i;
    public final ace j;
    public final LinkedHashMap k;

    static {
        za2 za2Var = new za2();
        za2Var.h(null);
        m = za2Var;
    }

    public pjf(h1b h1bVar, h1b h1bVar2, ckf ckfVar, h1b h1bVar3, lkf lkfVar, uk1 uk1Var) {
        h1bVar.getClass();
        h1bVar2.getClass();
        ckfVar.getClass();
        h1bVar3.getClass();
        lkfVar.getClass();
        this.a = h1bVar;
        this.b = h1bVar2;
        this.c = ckfVar;
        this.d = h1bVar3;
        this.e = lkfVar;
        this.f = uk1Var;
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        final int i = 0;
        this.h = new ace(new x16(this) { // from class: bjf
            public final /* synthetic */ pjf b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i2 = i;
                pjf pjfVar = this.b;
                switch (i2) {
                    case 0:
                        return (pm1) pjfVar.a.get();
                    case 1:
                        return (kkf) pjfVar.d.get();
                    default:
                        return (ujf) pjfVar.b.get();
                }
            }
        });
        final int i2 = 1;
        this.i = new ace(new x16(this) { // from class: bjf
            public final /* synthetic */ pjf b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                pjf pjfVar = this.b;
                switch (i3) {
                    case 0:
                        return (pm1) pjfVar.a.get();
                    case 1:
                        return (kkf) pjfVar.d.get();
                    default:
                        return (ujf) pjfVar.b.get();
                }
            }
        });
        final int i3 = 2;
        this.j = new ace(new x16(this) { // from class: bjf
            public final /* synthetic */ pjf b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i3;
                pjf pjfVar = this.b;
                switch (i4) {
                    case 0:
                        return (pm1) pjfVar.a.get();
                    case 1:
                        return (kkf) pjfVar.d.get();
                    default:
                        return (ujf) pjfVar.b.get();
                }
            }
        });
        this.k = new LinkedHashMap();
    }

    public static ArrayList l(int i, String str) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            za2 za2Var = new za2();
            za2Var.i0(new jv6(2, str, null));
            arrayList.add(za2Var);
        }
        return arrayList;
    }

    public static cjf m(LinkedHashMap linkedHashMap) {
        cjf cjfVar = new cjf((vd9) null, (LinkedHashMap) (0 == true ? 1 : 0), new ttb(1), 7);
        mx4 mx4Var = zif.e;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            cjf cjfVar2 = (cjf) linkedHashMap.get((zif) l2Var.next());
            if (cjfVar2 != null) {
                cjfVar.a.y((k79) cjfVar2.a.b);
                cjfVar.b.putAll(cjfVar2.b);
                cjfVar.c.addAll(cjfVar2.c);
                ttb ttbVar = cjfVar2.d;
                if (ttbVar != null) {
                    cjfVar.d = ttbVar;
                }
            }
        }
        return cjfVar;
    }

    @Override // defpackage.ajf
    public final nu3 a() {
        za2 za2VarN = this.g ? null : n(new kjf(this, null));
        return za2VarN == null ? l : za2VarN;
    }

    @Override // defpackage.ajf
    public final nu3 c(Collection collection, boolean z) {
        collection.getClass();
        za2 za2VarN = this.g ? null : n(new ojf(collection, z, this, null));
        return za2VarN == null ? m : za2VarN;
    }

    @Override // defpackage.ajf
    public final void close() {
        this.g = true;
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControl: closed");
        }
        ujf ujfVar = (ujf) this.j.getValue();
        synchronized (ujfVar.c) {
            try {
                if (ujfVar.g) {
                    ujfVar.g = false;
                    za2 za2Var = ujfVar.d;
                    if (za2Var != null) {
                        za2Var.i0(new CancellationException("UseCaseCameraState closed"));
                    }
                    ujfVar.d = null;
                }
                while (!ujfVar.f.isEmpty()) {
                    ((za2) ((rjf) ujfVar.f.removeFirst()).b).i0(new CancellationException("UseCaseCameraState closed"));
                    ujfVar.q.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ajf
    public final Object d(gbe gbeVar) {
        kkf kkfVar = (kkf) this.i.getValue();
        kkfVar.getClass();
        return kkf.a(kkfVar, gbeVar);
    }

    @Override // defpackage.ajf
    public final nu3 e(int i) {
        za2 za2VarN = this.g ? null : n(new jjf(this, i, null));
        return za2VarN == null ? l : za2VarN;
    }

    @Override // defpackage.ajf
    public final nu3 f(List list, zif zifVar) {
        list.getClass();
        zifVar.getClass();
        za2 za2VarN = this.g ? null : n(new fjf(this, zifVar, list, null));
        return za2VarN == null ? m : za2VarN;
    }

    @Override // defpackage.ajf
    public final nu3 g(Map map, zif zifVar, ph2 ph2Var) {
        map.getClass();
        zifVar.getClass();
        ph2Var.getClass();
        if (this.g) {
            return m;
        }
        if (pa7.t(this.e.d.get(), Boolean.TRUE)) {
            return ynb.y(this.e.f, null, new ljf(this, zifVar, map, ph2Var, null), 1);
        }
        ho7.w(Thread.currentThread().getName(), "Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: ");
        return null;
    }

    @Override // defpackage.ajf
    public final List h(List list, int i, int i2, int i3) {
        List list2;
        list.getClass();
        ArrayList arrayList = null;
        if (this.g) {
            list2 = list;
        } else {
            int size = list.size();
            list2 = list;
            ejf ejfVar = new ejf(this, list2, i, i2, i3, null);
            lkf lkfVar = this.e;
            lkfVar.getClass();
            dw2 dw2Var = pa7.t(lkfVar.d.get(), Boolean.TRUE) ? dw2.d : dw2.a;
            ArrayList arrayList2 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList2.add(new za2());
            }
            ynb.V(lkfVar.f, null, dw2Var, new hjf(ejfVar, arrayList2, null), 1);
            arrayList = arrayList2;
        }
        return arrayList == null ? l(list2.size(), "Capture request is cancelled on closed CameraGraph") : arrayList;
    }

    @Override // defpackage.ajf
    public final nu3 i(qh2 qh2Var, Map map) {
        qh2Var.getClass();
        map.getClass();
        za2 za2VarN = this.g ? null : n(new mjf(this, qh2Var, map, null));
        return za2VarN == null ? m : za2VarN;
    }

    @Override // defpackage.ajf
    public final nu3 j(Map map, zif zifVar, ph2 ph2Var) {
        map.getClass();
        zifVar.getClass();
        ph2Var.getClass();
        za2 za2VarN = !this.g ? n(new ijf(this, zifVar, map, ph2Var, null)) : null;
        return za2VarN == null ? m : za2VarN;
    }

    @Override // defpackage.ajf
    public final nu3 k() {
        za2 za2VarN = this.g ? null : n(new djf(this, null));
        return za2VarN == null ? l : za2VarN;
    }

    public final za2 n(a26 a26Var) {
        lkf lkfVar = this.e;
        lkfVar.getClass();
        dw2 dw2Var = pa7.t(lkfVar.d.get(), Boolean.TRUE) ? dw2.d : dw2.a;
        za2 za2Var = new za2();
        ynb.V(lkfVar.f, null, dw2Var, new gjf(za2Var, null, a26Var), 1);
        return za2Var;
    }

    public final Object o(zif zifVar, Map map, ph2 ph2Var, gbe gbeVar) {
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl#setParametersAsync: [" + zifVar + "] values = " + map + ", optionPriority = " + ph2Var);
        }
        LinkedHashMap linkedHashMap = this.k;
        Object obj = linkedHashMap.get(zifVar);
        vd9 vd9Var = null;
        boolean z = false;
        boolean z2 = false;
        Object obj2 = obj;
        if (obj == null) {
            cjf cjfVar = new cjf(vd9Var, (LinkedHashMap) (z2 ? 1 : 0), (ttb) (z ? 1 : 0), 15);
            linkedHashMap.put(zifVar, cjfVar);
            obj2 = cjfVar;
        }
        cjf cjfVar2 = (cjf) obj2;
        vd9 vd9Var2 = new vd9(8);
        vd9Var2.y((k79) cjfVar2.a.b);
        map.getClass();
        ph2Var.getClass();
        for (Map.Entry entry : map.entrySet()) {
            CaptureRequest.Key key = (CaptureRequest.Key) entry.getKey();
            ((k79) vd9Var2.b).n(af1.D(key), ph2Var, entry.getValue());
        }
        linkedHashMap.put(zifVar, new cjf(vd9Var2, bm8.Y(cjfVar2.b), s72.n1(cjfVar2.c), cjfVar2.d));
        return p(m(linkedHashMap), null, gbeVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object p(cjf cjfVar, LinkedHashSet linkedHashSet, zn2 zn2Var) {
        njf njfVar;
        int i;
        if (zn2Var instanceof njf) {
            njfVar = (njf) zn2Var;
            int i2 = njfVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                njfVar.label = i2 - Integer.MIN_VALUE;
            } else {
                njfVar = new njf(this, zn2Var);
            }
        } else {
            njfVar = new njf(this, zn2Var);
        }
        njf njfVar2 = njfVar;
        Object objC = njfVar2.result;
        bw2 bw2Var = bw2.a;
        int i3 = njfVar2.label;
        nu3 nu3Var = null;
        if (i3 == 0) {
            jzb.q(objC);
            if (!this.g) {
                uk1 uk1Var = this.f;
                no0 no0Var = tc1.a;
                if (uk1Var.a.a(tc1.a, null) != null) {
                    r3.f();
                    return null;
                }
                pm1 pm1Var = (pm1) this.h.getValue();
                ttb ttbVar = cjfVar.d;
                ttbVar.getClass();
                if (ttbVar.a != -1) {
                    ttb ttbVar2 = cjfVar.d;
                    ttbVar2.getClass();
                    i = ttbVar2.a;
                } else {
                    i = 1;
                }
                pm1Var.b(i);
                ujf ujfVar = (ujf) this.j.getValue();
                LinkedHashMap linkedHashMapD0 = af1.d0(cjfVar.a.g());
                ru8 ru8Var = yde.a;
                m89 m89VarA = m89.a();
                for (Map.Entry entry : cjfVar.b.entrySet()) {
                    m89VarA.a.put((String) entry.getKey(), entry.getValue());
                }
                Map mapG = bm8.G(new iy9(ru8Var, m89VarA));
                ttb ttbVar3 = cjfVar.d;
                Set set = cjfVar.c;
                njfVar2.label = 1;
                objC = ujfVar.c(linkedHashMapD0, mapG, linkedHashSet, ttbVar3, set, njfVar2);
                if (objC == bw2Var) {
                    return bw2Var;
                }
            }
            if (nu3Var == null) {
                return m;
            }
            return nu3Var;
        }
        if (i3 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(objC);
        nu3Var = (nu3) objC;
        if (nu3Var == null) {
            return m;
        }
        return nu3Var;
    }
}
