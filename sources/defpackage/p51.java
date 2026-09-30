package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p51 {
    public static final Map a;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final Set d;

    static {
        ex5 ex5Var = syd.j;
        iy9 iy9Var = new iy9(ex5Var.a(t99.e("name")).i(), tyd.d);
        iy9 iy9Var2 = new iy9(ex5Var.a(t99.e("ordinal")).i(), t99.e("ordinal"));
        iy9 iy9Var3 = new iy9(vpf.t(syd.C, "size"), t99.e("size"));
        dx5 dx5Var = syd.G;
        Map mapH = bm8.H(iy9Var, iy9Var2, iy9Var3, new iy9(vpf.t(dx5Var, "size"), t99.e("size")), new iy9(syd.e.a(t99.e("length")).i(), t99.e("length")), new iy9(vpf.t(dx5Var, UserMetadata.KEYDATA_FILENAME), t99.e("keySet")), new iy9(vpf.t(dx5Var, "values"), t99.e("values")), new iy9(vpf.t(dx5Var, "entries"), t99.e("entrySet")), new iy9(vpf.t(syd.a0, "size"), t99.e("length")), new iy9(vpf.t(syd.b0, "size"), t99.e("length")), new iy9(vpf.t(syd.c0, "size"), t99.e("length")));
        a = mapH;
        Set<Map.Entry> setEntrySet = mapH.entrySet();
        ArrayList<iy9> arrayList = new ArrayList(t72.u(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new iy9(((dx5) entry.getKey()).a.g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (iy9 iy9Var4 : arrayList) {
            t99 t99Var = (t99) iy9Var4.e();
            Object arrayList2 = linkedHashMap.get(t99Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(t99Var, arrayList2);
            }
            ((List) arrayList2).add((t99) iy9Var4.d());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(bm8.F(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), s72.q0((Iterable) entry2.getValue()));
        }
        b = linkedHashMap2;
        Map map = a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            String str = qf7.a;
            j22 j22VarH = qf7.h(((dx5) entry3.getKey()).b().a);
            j22VarH.getClass();
            linkedHashSet.add(j22VarH.a().a((t99) entry3.getValue()));
        }
        Set setKeySet = a.keySet();
        c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(t72.u(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((dx5) it.next()).a.g());
        }
        d = s72.o1(arrayList3);
    }
}
