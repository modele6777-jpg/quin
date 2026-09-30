package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ixc {
    public static final Comparator[] a;
    public static final dxc b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        byte b2 = 0;
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new y85(8, new y85(7, i == 0 ? ww2.g : ww2.d));
            i++;
        }
        a = comparatorArr;
        b = new dxc(3, b2);
    }

    public static final void a(ywc ywcVar, ArrayList arrayList, c1 c1Var, c1 c1Var2, q69 q69Var) {
        twc twcVar = ywcVar.d;
        Object objG = twcVar.a.g(cxc.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) c1Var2.d(ywcVar)).booleanValue()) && ((Boolean) c1Var.d(ywcVar)).booleanValue()) {
            arrayList.add(ywcVar);
        }
        if (zBooleanValue) {
            q69Var.i(ywcVar.f, b(ywcVar, c1Var, c1Var2, ywcVar.i((4 & 1) != 0 ? !ywcVar.b : false, (4 & 2) == 0)));
            return;
        }
        List listI = ywcVar.i((4 & 1) != 0 ? !ywcVar.b : false, (4 & 2) == 0);
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            a((ywc) listI.get(i), arrayList, c1Var, c1Var2, q69Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00db  */
    public static final ArrayList b(ywc ywcVar, c1 c1Var, c1 c1Var2, List list) {
        int i;
        q69 q69Var = v67.a;
        q69 q69Var2 = new q69();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((ywc) list.get(i2), arrayList, c1Var, c1Var2, q69Var2);
        }
        int i3 = 1;
        char c = ywcVar.c.P0 == cv7.b ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                ywc ywcVar2 = (ywc) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new iy9(ywcVar2.h(), t72.K(ywcVar2)));
                    break;
                }
                float f = ywcVar2.h().b;
                float f2 = ywcVar2.h().d;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        hkb hkbVar = (hkb) ((iy9) arrayList2.get(i6)).d();
                        float f3 = hkbVar.b;
                        i = i3;
                        float f4 = hkbVar.d;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new iy9(new hkb(Math.max(hkbVar.a, 0.0f), Math.max(hkbVar.b, f), Math.min(hkbVar.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((iy9) arrayList2.get(i6)).e()));
                            ((List) ((iy9) arrayList2.get(i6)).e()).add(ywcVar2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new iy9(ywcVar2.h(), t72.K(ywcVar2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        }
        w72.f0(arrayList2, ww2.v);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            iy9 iy9Var = (iy9) arrayList2.get(i8);
            w72.f0((List) iy9Var.e(), comparator);
            arrayList3.addAll((Collection) iy9Var.e());
        }
        w72.f0(arrayList3, new qu(21));
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) q69Var2.b(((ywc) arrayList3.get(size5)).f);
            if (list2 != null) {
                if (((Boolean) c1Var2.d(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
