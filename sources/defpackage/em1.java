package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class em1 {
    public final LinkedHashMap a;

    public em1(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d3b d3bVar = (d3b) it.next();
            linkedHashMap.putIfAbsent(d3bVar.getId(), d3bVar);
        }
        this.a = linkedHashMap;
    }
}
