package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qi6 {
    public ArrayList a = new ArrayList(20);

    public void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        xdc.p(str);
        xdc.q(str2, str);
        xdc.g(this, str, str2);
    }

    public void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.a = arrayList;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.a;
        if (zIsEmpty) {
            arrayList2.addAll(list);
            return;
        }
        int size = arrayList2.size() - 1;
        vtd vtdVar = (vtd) this.a.get(size);
        vtd vtdVar2 = (vtd) list.get(0);
        int i = vtdVar.c;
        int i2 = vtdVar.d;
        int i3 = i + i2;
        int i4 = vtdVar2.c;
        ArrayList arrayList3 = this.a;
        if (i3 != i4) {
            arrayList3.addAll(list);
        } else {
            arrayList3.set(size, new vtd(vtdVar.a, vtdVar.b, i, i2 + vtdVar2.d));
            this.a.addAll(list.subList(1, list.size()));
        }
    }

    public void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b(((sf9) it.next()).d());
        }
    }

    public void d(String str) {
        int iN = v4e.N(str, ':', 1, 4);
        if (iN != -1) {
            xdc.g(this, str.substring(0, iN), str.substring(iN + 1));
        } else if (str.charAt(0) == ':') {
            xdc.g(this, "", str.substring(1));
        } else {
            xdc.g(this, "", str);
        }
    }

    public String e(String str) {
        str.getClass();
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 2;
        int iG = z7f.G(size, 0, -2);
        if (iG > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iG) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public void f(String str) {
        str.getClass();
        ArrayList arrayList = this.a;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }
}
