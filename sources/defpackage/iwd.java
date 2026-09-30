package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iwd extends ewf {
    public final List b;
    public final boolean c;
    public final sz9 d;
    public final jsd e;

    public iwd(List list, List list2, int i) {
        ArrayList arrayList;
        this.b = list;
        boolean z = i >= 0;
        this.c = z;
        this.d = new sz9(z ? i : 0);
        jsd jsdVar = new jsd();
        if (list2.isEmpty()) {
            int size = list.size();
            arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add("");
            }
        } else {
            arrayList = new ArrayList(s72.c1(list2, list.size()));
            while (arrayList.size() < this.b.size()) {
                arrayList.add("");
            }
        }
        jsdVar.addAll(arrayList);
        this.e = jsdVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final String f() {
        Object obj;
        int iJ = this.d.j();
        if (iJ >= 0) {
            jsd jsdVar = this.e;
            if (iJ < jsdVar.size()) {
                obj = jsdVar.get(iJ);
            } else {
                obj = "";
            }
        } else {
            obj = "";
        }
        return (String) obj;
    }

    public final ArrayList g() {
        jsd jsdVar = this.e;
        ArrayList arrayList = new ArrayList(t72.u(jsdVar, 10));
        ListIterator listIterator = jsdVar.listIterator();
        int i = 0;
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                return arrayList;
            }
            Object next = ql6Var.next();
            int i2 = i + 1;
            if (i < 0) {
                t72.Z();
                throw null;
            }
            String strValueOf = (String) next;
            if (v4e.Q(strValueOf)) {
                strValueOf = String.valueOf(i2);
            }
            arrayList.add(strValueOf);
            i = i2;
        }
    }

    public final boolean h() {
        return this.d.j() == this.b.size() - 1;
    }
}
