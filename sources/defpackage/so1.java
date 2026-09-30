package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class so1 {
    public final im1 a;

    public so1() {
        HashSet hashSet = new HashSet();
        k79 k79VarJ = k79.j();
        ArrayList arrayList = new ArrayList();
        m89 m89VarA = m89.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        bs9 bs9VarD = bs9.d(k79VarJ);
        ArrayList arrayList3 = new ArrayList(arrayList);
        wde wdeVar = wde.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = m89VarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.a = new im1(arrayList2, bs9VarD, -1, arrayList3, new wde(arrayMap));
    }
}
