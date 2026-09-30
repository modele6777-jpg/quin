package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lq7 {
    public int a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList(0);
    public final LinkedHashMap d = new LinkedHashMap(0);
    public final ArrayList e = new ArrayList(0);
    public final ArrayList f;

    public lq7(int i) {
        this.a = i;
        wu8.a.getClass();
        List listA = vu8.a();
        ArrayList arrayList = new ArrayList(t72.u(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((tk7) ((wu8) it.next())).getClass();
            arrayList.add(new hk7());
        }
        this.f = arrayList;
    }
}
