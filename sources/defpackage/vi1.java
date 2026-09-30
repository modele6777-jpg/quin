package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vi1 implements w87 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashSet c = new HashSet();
    public m88 d;
    public la1 e;
    public wo0 f;

    @Override // defpackage.w87
    public final void a(List list) {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f.h(str));
            }
            synchronized (this.a) {
                try {
                    HashSet hashSet2 = new HashSet(this.b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList<pg1> arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((pg1) this.b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : (ArrayList) list) {
                        if (this.b.containsKey(str2)) {
                            linkedHashMap.put(str2, (pg1) this.b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (pg1) map.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(linkedHashMap);
                    for (pg1 pg1Var : arrayList) {
                        if (pg1Var != null) {
                            pg1Var.n();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (ck1 e) {
            throw new dk1("Failed to create CameraInternal", e);
        }
    }

    public final pg1 b(String str) {
        pg1 pg1Var;
        synchronized (this.a) {
            try {
                pg1Var = (pg1) this.b.get(str);
                if (pg1Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pg1Var;
    }

    public final LinkedHashSet c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.a) {
            linkedHashSet = new LinkedHashSet(this.b.values());
        }
        return linkedHashSet;
    }

    public final void d(wo0 wo0Var) {
        this.f = wo0Var;
        synchronized (this.a) {
            try {
                for (String str : wo0Var.g()) {
                    b21.q("CameraRepository", "Added camera: " + str);
                    pg1 pg1Var = (pg1) this.b.put(str, wo0Var.h(str));
                    if (pg1Var != null) {
                        pg1Var.a();
                    }
                }
            } catch (ck1 e) {
                throw new a37(e);
            }
        }
    }
}
