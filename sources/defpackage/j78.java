package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j78 extends l78 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // defpackage.l78
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) wff.j(j, obj);
        if (list instanceof v18) {
            objUnmodifiableList = ((v18) list).l();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof l67) && (list instanceof n87)) {
                l4 l4Var = (l4) ((n87) list);
                boolean z = l4Var.a;
                if (z && z) {
                    l4Var.a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        wff.p(j, obj, objUnmodifiableList);
    }

    @Override // defpackage.l78
    public final void b(long j, Object obj, Object obj2) {
        List list;
        List list2;
        List listG;
        List list3 = (List) wff.j(j, obj2);
        int size = list3.size();
        List list4 = (List) wff.j(j, obj);
        if (list4.isEmpty()) {
            if (list4 instanceof v18) {
                listG = new u18(size);
            } else {
                listG = ((list4 instanceof l67) && (list4 instanceof n87)) ? ((n87) list4).G(size) : new ArrayList(size);
            }
            wff.p(j, obj, listG);
            list2 = listG;
        } else {
            if (c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                wff.p(j, obj, arrayList);
                list = arrayList;
            } else if (list4 instanceof kff) {
                kff kffVar = (kff) list4;
                u18 u18Var = new u18(kffVar.size() + size);
                u18Var.addAll(kffVar);
                wff.p(j, obj, u18Var);
                list = u18Var;
            } else if ((list4 instanceof l67) && (list4 instanceof n87)) {
                n87 n87Var = (n87) list4;
                if (!((l4) n87Var).a) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    n87 n87VarG = n87Var.G(list4.size() + size);
                    wff.p(j, obj, n87VarG);
                    list2 = n87VarG;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        wff.p(j, obj, list3);
    }
}
