package defpackage;

import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class if1 implements w87 {
    public final mf1 a;
    public final Object b;
    public vi1 c;
    public final ArrayList d;
    public int e;
    public boolean f;

    public if1(hh1 hh1Var, mf1 mf1Var) {
        mf1Var.getClass();
        this.a = mf1Var;
        this.b = new Object();
        this.d = new ArrayList();
    }

    @Override // defpackage.w87
    public final void a(List list) throws dk1 {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Set<Set> setC = mf1.c(this.a);
            if (setC == null) {
                setC = xu4.a;
            }
            for (Set set : setC) {
                Set set2 = set;
                ArrayList arrayList = new ArrayList(t72.u(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ig1) it.next()).a);
                }
                Set setO1 = s72.o1(arrayList);
                if (list.containsAll(setO1)) {
                    List listJ1 = s72.j1(set);
                    if (listJ1.size() >= 2) {
                        String str = ((ig1) listJ1.get(0)).a;
                        String str2 = ((ig1) listJ1.get(1)).a;
                        try {
                            if (cn1.G(this.a, str) && cn1.G(this.a, str2)) {
                                linkedHashSet.add(set);
                                if (!linkedHashMap.containsKey(str)) {
                                    linkedHashMap.put(str, new ArrayList());
                                }
                                Object obj = linkedHashMap.get(str);
                                obj.getClass();
                                ((List) obj).add(str2);
                                if (!linkedHashMap.containsKey(str2)) {
                                    linkedHashMap.put(str2, new ArrayList());
                                }
                                Object obj2 = linkedHashMap.get(str2);
                                obj2.getClass();
                                ((List) obj2).add(str);
                            }
                        } catch (a37 e) {
                            if (b21.F(5, "CXCP")) {
                                b1.l("CXCP", "Skipping incompatible concurrent pair: " + set + " due to " + e.getMessage());
                            }
                        }
                    }
                } else if (b21.F(5, "CXCP")) {
                    b1.l("CXCP", "Failed to retrieve concurrent camera: " + setO1 + " from " + list);
                }
            }
            synchronized (this.b) {
            }
        } catch (Exception e2) {
            throw new dk1("Failed to retrieve concurrent camera id info for camera-pipe.", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [pu4] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [if1] */
    public final void b(vi1 vi1Var) throws dk1 {
        ?? arrayList;
        vi1Var.getClass();
        synchronized (this.b) {
            this.c = vi1Var;
        }
        ArrayList arrayListA = mf1.a(this.a);
        if (arrayListA != null) {
            arrayList = new ArrayList(t72.u(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(((ig1) it.next()).a);
            }
        } else {
            arrayList = pu4.a;
        }
        a(arrayList);
    }
}
