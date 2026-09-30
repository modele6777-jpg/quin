package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xi1 {
    public static final xi1 b;
    public static final xi1 c;
    public final LinkedHashSet a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new x38(0));
        b = new xi1(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new x38(1));
        c = new xi1(linkedHashSet2);
    }

    public xi1(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (x38 x38Var : this.a) {
            List<kg1> listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            x38Var.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (kg1 kg1Var : listUnmodifiableList) {
                ok8.k("The camera info doesn't contain internal implementation.", kg1Var instanceof ng1);
                if (kg1Var.m() == x38Var.a) {
                    arrayList3.add(kg1Var);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Integer num = null;
        for (x38 x38Var : this.a) {
            if (x38Var instanceof x38) {
                Integer numValueOf = Integer.valueOf(x38Var.a);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    qc0.p("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final pg1 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((pg1) it.next()).b());
        }
        ArrayList arrayListA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            pg1 pg1Var = (pg1) it2.next();
            if (arrayListA.contains(pg1Var.b())) {
                linkedHashSet2.add(pg1Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (pg1) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            ng1 ng1VarQ = ((pg1) it4.next()).q();
            sb.append(" Id:" + ng1VarQ.d() + "  Lens:" + ng1VarQ.m());
        }
        String string = sb.toString();
        LinkedHashSet<x38> linkedHashSet3 = this.a;
        StringBuilder sb2 = new StringBuilder(tec.e(linkedHashSet3.size(), "PhyId:null  Filters:"));
        for (x38 x38Var : linkedHashSet3) {
            sb2.append(" Id:");
            x38Var.getClass();
            sb2.append(x38.b);
            if (x38Var instanceof x38) {
                sb2.append(" LensFilter:");
                sb2.append(x38Var.a);
            }
        }
        qc0.j(ub3.k("No available camera can be found. ", string, " ", sb2.toString()));
        return null;
    }
}
