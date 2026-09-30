package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d3e implements AutoCloseable {
    public final uf1 a;
    public final LinkedHashMap b;
    public final List c;
    public final LinkedHashMap d;
    public final fl8 e;
    public final List f;
    public final ArrayList g;
    public final ArrayList v;
    public static final wh0 w = vpf.n(0);
    public static final wh0 x = vpf.n(0);
    public static final wh0 y = vpf.n(0);
    public static final wh0 z = vpf.n(0);
    public static final wh0 X = vpf.n(0);
    public static final List Y = t72.I(af8.N0, af8.O0);
    public static final kv8 Z = new kv8(15);
    public static final List E0 = t72.I(new y2e(0), new y2e(34));
    public static final kv8 F0 = new kv8(16);

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:73:0x016d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [wt9] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7, types: [pu4] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public d3e(yg1 yg1Var, uf1 uf1Var, jy4 jy4Var, vd9 vd9Var) {
        boolean z2;
        uf1 uf1Var2;
        ?? arrayList;
        af8 af8Var;
        ?? r15;
        wt9 wt9Var;
        Integer num;
        yg1Var.getClass();
        vd9Var.getClass();
        this.a = uf1Var;
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (uf1Var.h == 0) {
            yg1.o.getClass();
            if (xg1.c(yg1Var)) {
                z2 = false;
            } else {
                CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
                key.getClass();
                nc1 nc1Var = (nc1) yg1Var;
                Integer num2 = (Integer) nc1Var.c(key);
                if ((num2 != null && num2.intValue() == 0) || (Build.VERSION.SDK_INT >= 28 && (num = (Integer) nc1Var.c(key)) != null && num.intValue() == 4)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
        } else {
            z2 = false;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = uf1Var.c.iterator();
        while (true) {
            af8 af8Var2 = null;
            if (!it.hasNext()) {
                Iterator it2 = this.a.b.iterator();
                while (it2.hasNext()) {
                    wj1 wj1Var = (wj1) it2.next();
                    for (yt9 yt9Var : wj1Var.a) {
                        if (!linkedHashMap.containsKey(yt9Var)) {
                            wh0 wh0Var = z;
                            wh0Var.getClass();
                            int iIncrementAndGet = wh0.b.incrementAndGet(wh0Var);
                            Size size = yt9Var.a;
                            int i = yt9Var.b;
                            String str = yt9Var.c;
                            String str2 = str == null ? this.a.a : str;
                            Integer num3 = (Integer) linkedHashMap3.get(wj1Var);
                            if (z2) {
                                if (yt9Var instanceof wt9) {
                                    wt9Var = (wt9) yt9Var;
                                } else {
                                    r15 = af8Var2;
                                }
                                if (r15 != 0) {
                                    r15 = wt9Var;
                                    af8Var = r15.i;
                                } else {
                                    r15 = wt9Var;
                                    af8Var = af8Var2;
                                }
                            } else {
                                r15 = wt9Var;
                                af8Var = af8Var2;
                            }
                            b3e b3eVar = new b3e(iIncrementAndGet, size, i, str2, num3, af8Var, yt9Var.d, yt9Var.e, yt9Var.f, yt9Var.g, yt9Var.h);
                            linkedHashMap.put(yt9Var, b3eVar);
                            arrayList2.add(b3eVar);
                            it2 = it2;
                            af8Var2 = null;
                        }
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                int size2 = this.a.b.size();
                int i2 = 0;
                while (true) {
                    uf1Var2 = this.a;
                    if (i2 >= size2) {
                        break;
                    }
                    wj1 wj1Var2 = (wj1) uf1Var2.b.get(i2);
                    List list = wj1Var2.a;
                    ArrayList<c3e> arrayList4 = new ArrayList(t72.u(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Object obj = linkedHashMap.get((yt9) it3.next());
                        obj.getClass();
                        b3e b3eVar2 = (b3e) obj;
                        wh0 wh0Var2 = x;
                        wh0Var2.getClass();
                        c3e c3eVar = new c3e(wh0.b.incrementAndGet(wh0Var2), b3eVar2.c, b3eVar2.f, b3eVar2.h, b3eVar2.g, b3eVar2.i, b3eVar2.j, b3eVar2.b, b3eVar2.d);
                        linkedHashMap4.put(c3eVar, b3eVar2);
                        arrayList4.add(c3eVar);
                        size2 = size2;
                    }
                    int i3 = size2;
                    wh0 wh0Var3 = w;
                    wh0Var3.getClass();
                    xj1 xj1Var = new xj1(wh0.b.incrementAndGet(wh0Var3), arrayList4);
                    linkedHashMap2.put(wj1Var2, xj1Var);
                    arrayList3.add(xj1Var);
                    for (c3e c3eVar2 : arrayList4) {
                        c3eVar2.getClass();
                        c3eVar2.j = xj1Var;
                    }
                    Iterator it4 = wj1Var2.a.iterator();
                    while (it4.hasNext()) {
                        Object obj2 = linkedHashMap.get((yt9) it4.next());
                        obj2.getClass();
                        ((b3e) obj2).l.add(xj1Var);
                    }
                    i2++;
                    size2 = i3;
                }
                ArrayList<r47> arrayList5 = uf1Var2.d;
                if (arrayList5 != null) {
                    arrayList = new ArrayList(t72.u(arrayList5, 10));
                    for (r47 r47Var : arrayList5) {
                        wh0 wh0Var4 = y;
                        wh0Var4.getClass();
                        int iIncrementAndGet2 = wh0.b.incrementAndGet(wh0Var4);
                        r47Var.getClass();
                        arrayList.add(new a3e(iIncrementAndGet2, r47Var.b));
                    }
                } else {
                    arrayList = pu4.a;
                }
                this.f = arrayList;
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    ArrayList arrayList8 = ((xj1) obj3).b;
                    if (!arrayList8.isEmpty()) {
                        Iterator it5 = arrayList8.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                bu9 bu9Var = ((c3e) it5.next()).g;
                                if (bu9Var == null ? false : bu9.a(bu9Var.a, 1L)) {
                                    arrayList6.add(obj3);
                                    break;
                                }
                            }
                        }
                    }
                    arrayList7.add(obj3);
                }
                iy9 iy9Var = new iy9(arrayList6, arrayList7);
                List list2 = (List) iy9Var.a();
                List list3 = (List) iy9Var.b();
                if (list2.isEmpty()) {
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj4 : arrayList3) {
                        ArrayList arrayList11 = ((xj1) obj4).b;
                        if (!arrayList11.isEmpty()) {
                            Iterator it6 = arrayList11.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    if (s72.o0(Y, ((c3e) it6.next()).h)) {
                                        arrayList9.add(obj4);
                                        break;
                                    }
                                }
                            }
                        }
                        arrayList10.add(obj4);
                    }
                    iy9 iy9Var2 = new iy9(arrayList9, arrayList10);
                    List list4 = (List) iy9Var2.a();
                    List list5 = (List) iy9Var2.b();
                    if (list4.isEmpty()) {
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj5 : arrayList3) {
                            ArrayList arrayList14 = ((xj1) obj5).b;
                            if (!arrayList14.isEmpty()) {
                                Iterator it7 = arrayList14.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        if (E0.contains(new y2e(((c3e) it7.next()).c))) {
                                            arrayList12.add(obj5);
                                            break;
                                        }
                                    }
                                }
                            }
                            arrayList13.add(obj5);
                        }
                        iy9 iy9Var3 = new iy9(arrayList12, arrayList13);
                        List list6 = (List) iy9Var3.a();
                        List list7 = (List) iy9Var3.b();
                        if (!list6.isEmpty()) {
                            arrayList3 = s72.Q0(s72.b1(list6, F0), list7);
                        }
                    } else {
                        arrayList3 = s72.Q0(s72.b1(list4, Z), list5);
                    }
                } else {
                    arrayList3 = s72.Q0(list2, list3);
                }
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                for (Object obj6 : arrayList3) {
                    ArrayList arrayList17 = ((xj1) obj6).b;
                    if (arrayList17.isEmpty()) {
                        arrayList16.add(obj6);
                        break;
                    }
                    Iterator it8 = arrayList17.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            bu9 bu9Var2 = ((c3e) it8.next()).g;
                            if (bu9Var2 == null ? false : bu9.a(bu9Var2.a, 3L)) {
                                arrayList15.add(obj6);
                                break;
                            }
                        } else {
                            arrayList16.add(obj6);
                            break;
                            break;
                        }
                    }
                }
                iy9 iy9Var4 = new iy9(arrayList15, arrayList16);
                List list8 = (List) iy9Var4.a();
                List list9 = (List) iy9Var4.b();
                if (list8.isEmpty()) {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = new ArrayList();
                    for (Object obj7 : arrayList3) {
                        ArrayList arrayList20 = ((xj1) obj7).b;
                        if (!arrayList20.isEmpty()) {
                            Iterator it9 = arrayList20.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    cu9 cu9Var = ((c3e) it9.next()).i;
                                    if (cu9Var == null ? false : cu9.a(cu9Var.a, 1L)) {
                                        arrayList18.add(obj7);
                                    }
                                }
                            }
                        }
                        arrayList19.add(obj7);
                    }
                    iy9 iy9Var5 = new iy9(arrayList18, arrayList19);
                    List list10 = (List) iy9Var5.a();
                    List list11 = (List) iy9Var5.b();
                    if (!list10.isEmpty()) {
                        arrayList3 = s72.Q0(list11, list10);
                    }
                } else {
                    arrayList3 = s72.Q0(list9, list8);
                }
                this.g = arrayList3;
                ArrayList arrayList21 = new ArrayList(t72.u(arrayList3, 10));
                Iterator it10 = arrayList3.iterator();
                while (it10.hasNext()) {
                    arrayList21.add(new e3e(((xj1) it10.next()).a));
                }
                s72.o1(arrayList21);
                this.b = linkedHashMap2;
                this.c = s72.b1(arrayList2, new y85(9, this));
                this.d = linkedHashMap4;
                ArrayList arrayList22 = this.g;
                ArrayList arrayList23 = new ArrayList();
                Iterator it11 = arrayList22.iterator();
                while (it11.hasNext()) {
                    x72.g0(arrayList23, ((xj1) it11.next()).b);
                }
                this.v = arrayList23;
                fl8 fl8Var = new fl8();
                Iterator it12 = this.a.b.iterator();
                while (it12.hasNext()) {
                    ((wj1) it12.next()).getClass();
                }
                this.e = fl8Var.j();
                return;
            }
            List<wj1> list12 = (List) it.next();
            if (list12.isEmpty()) {
                qc0.p("Check failed.");
                throw null;
            }
            List list13 = this.a.b;
            ArrayList arrayList24 = new ArrayList();
            Iterator it13 = list13.iterator();
            while (it13.hasNext()) {
                x72.g0(arrayList24, ((wj1) it13.next()).a);
            }
            ArrayList arrayList25 = new ArrayList();
            Iterator it14 = arrayList24.iterator();
            while (it14.hasNext()) {
                it14.next();
            }
            ArrayList arrayList26 = new ArrayList();
            Iterator it15 = arrayList25.iterator();
            if (it15.hasNext()) {
                throw kv2.g(it15);
            }
            wh0 wh0Var5 = X;
            wh0Var5.getClass();
            int iIncrementAndGet3 = wh0.b.incrementAndGet(wh0Var5);
            while (arrayList26.contains(Integer.valueOf(iIncrementAndGet3))) {
                iIncrementAndGet3 = wh0.b.incrementAndGet(wh0Var5);
            }
            for (wj1 wj1Var3 : list12) {
                if (linkedHashMap3.containsKey(wj1Var3)) {
                    qc0.p("Check failed.");
                    throw null;
                }
                linkedHashMap3.put(wj1Var3, Integer.valueOf(iIncrementAndGet3));
            }
        }
    }

    public final xj1 b(int i) {
        Object next;
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((xj1) next).a == i) {
                return (xj1) next;
            }
        }
        next = null;
        return (xj1) next;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        for (AutoCloseable autoCloseable : (il8) this.e.values()) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else {
                if (!(autoCloseable instanceof ExecutorService)) {
                    cva.s();
                    return;
                }
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z2 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z2) {
                                executorService.shutdownNow();
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public final wj1 h(int i) {
        Object next;
        Iterator it = this.b.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xj1) ((Map.Entry) next).getValue()).a != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (wj1) entry.getKey();
        }
        return null;
    }

    public final String toString() {
        return "StreamGraph(" + this.b + ')';
    }
}
