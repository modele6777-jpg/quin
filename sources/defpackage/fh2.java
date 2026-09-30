package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class fh2 implements sr5 {
    public final ArrayList a;

    public fh2(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.sr5
    public as5 a() {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gg9) it.next()).a());
        }
        return arrayList2.size() == 1 ? (as5) s72.X0(arrayList2) : new gh2(0, arrayList2);
    }

    @Override // defpackage.sr5
    public n0a b() {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gg9) it.next()).b());
        }
        return x57.E(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fh2) {
            return this.a.equals(((fh2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ub3.l(new StringBuilder("ConcatenatedFormatStructure("), s72.D0(this.a, ", ", null, null, null, 62), ')');
    }
}
