package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uj2 implements mpa {
    public final ArrayList a;

    public uj2(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.mpa
    public final boolean test(Object obj) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((mpa) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
