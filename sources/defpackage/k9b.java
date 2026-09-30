package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k9b {
    public final ArrayList a;

    public k9b(ArrayList arrayList) {
        this.a = new ArrayList(arrayList);
    }

    public static String d(k9b k9bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = k9bVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((g9b) it.next()).getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public final boolean a(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((g9b) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final g9b b(Class cls) {
        for (g9b g9bVar : this.a) {
            if (g9bVar.getClass() == cls) {
                return g9bVar;
            }
        }
        return null;
    }

    public final ArrayList c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (g9b g9bVar : this.a) {
            if (cls.isAssignableFrom(g9bVar.getClass())) {
                arrayList.add(g9bVar);
            }
        }
        return arrayList;
    }
}
