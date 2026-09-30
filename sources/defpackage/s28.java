package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s28 {
    public final ConcurrentHashMap.KeySetView a = ConcurrentHashMap.newKeySet();

    public final void a(String str, List list) {
        str.getClass();
        list.getClass();
        ConcurrentHashMap.KeySetView keySetView = this.a;
        keySetView.getClass();
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new n28(str, k99.J((String) it.next())));
        }
        x72.g0(keySetView, arrayList);
    }
}
