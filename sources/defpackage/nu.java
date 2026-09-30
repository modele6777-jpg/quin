package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nu implements xn8 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ nu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        Integer num;
        ArrayList arrayList;
        iy9 iy9Var;
        int i = this.a;
        qu4 qu4Var = qu4.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ila) obj).setParentLayoutDirection((cv7) obj2);
                return zn8Var.n0(0, 0, qu4Var, new z4(29));
            case 1:
                n69 n69Var = (n69) obj2;
                list.getClass();
                ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((tn8) it.next()).v(kl2.a(j, 0, Integer.MAX_VALUE, 0, 0, 12)));
                }
                int iD0 = ((sw3) obj).D0(8.0f);
                Iterator it2 = arrayList2.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    i2 += ((cea) it2.next()).a;
                }
                int size = ((arrayList2.size() - 1) * iD0) + i2;
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((cea) it3.next()).b);
                    while (it3.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((cea) it3.next()).b);
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    num = numValueOf;
                } else {
                    num = null;
                }
                int iIntValue = num != null ? num.intValue() : 0;
                qz9 qz9Var = (qz9) n69Var;
                float f = size / 2.0f;
                if (qz9Var.j() != f) {
                    qz9Var.k(f);
                }
                return zn8Var.n0(size, iIntValue, qu4Var, new vj(arrayList2, iD0, 1));
            default:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Object obj3 = list.get(i3);
                    if (!(((tn8) obj3).E() instanceof fue)) {
                        arrayList3.add(obj3);
                    }
                }
                List list2 = (List) ((x16) obj2).invoke();
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(list2.size());
                    int size3 = list2.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        hkb hkbVar = (hkb) list2.get(i4);
                        if (hkbVar != null) {
                            float f2 = hkbVar.b;
                            float f3 = hkbVar.a;
                            iy9Var = new iy9(((tn8) arrayList3.get(i4)).v(ll2.b(0, (int) Math.floor(hkbVar.c - f3), 0, (int) Math.floor(hkbVar.d - f2), 5)), new w67((((long) Math.round(f2)) & 4294967295L) | (((long) Math.round(f3)) << 32)));
                        } else {
                            iy9Var = null;
                        }
                        ArrayList arrayList5 = arrayList4;
                        if (iy9Var != null) {
                            arrayList5.add(iy9Var);
                        }
                        i4++;
                        arrayList4 = arrayList5;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList6 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    Object obj4 = list.get(i5);
                    if (((tn8) obj4).E() instanceof fue) {
                        arrayList6.add(obj4);
                    }
                }
                return zn8Var.n0(kl2.h(j), kl2.g(j), qu4Var, new i2e(11, arrayList, vd0.k0(arrayList6, (x16) obj)));
        }
    }
}
