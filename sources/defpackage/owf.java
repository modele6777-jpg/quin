package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class owf {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map mapX = bm8.X(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapX.values().iterator();
        while (it.hasNext()) {
            ((ewf) it.next()).b();
        }
    }

    public final String toString() {
        String strR = job.a.b(owf.class).r();
        if (strR == null) {
            strR = "ViewModelStore";
        }
        int iHashCode = hashCode();
        tq.o(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return strR + "@" + string + "(keys=" + s72.o1(this.a.keySet()) + ")";
    }
}
