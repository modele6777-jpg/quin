package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class te3 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j18 b;

    public /* synthetic */ te3(j18 j18Var, int i) {
        this.a = i;
        this.b = j18Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int iJ;
        int i;
        c18 c18Var;
        Object next;
        int i2 = this.a;
        boolean z = true;
        j18 j18Var = this.b;
        switch (i2) {
            case 0:
                iJ = j18Var.e.b.j();
                break;
            case 1:
                List list = j18Var.h().l;
                if (list.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((c18) it.next()).k.equals("daily_fortune")) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                b18 b18VarH = j18Var.h();
                List list2 = b18VarH.l;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    c18 c18Var2 = (c18) obj;
                    int i3 = c18Var2.p;
                    if (i3 > 0 && (i = c18Var2.o) < b18VarH.n && i + i3 > b18VarH.m) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((c18) it2.next()).k);
                }
                return arrayList2;
            case 3:
                iJ = j18Var.h().o;
                break;
            case 4:
                iJ = ((b18) j18Var.f.getValue()).k;
                break;
            case 5:
                return Boolean.valueOf(j18Var.e.b.j() == 0 && j18Var.e.c.j() == 0);
            case 6:
                b18 b18VarH2 = j18Var.h();
                if (b18VarH2.o != 0 && ((c18Var = (c18) s72.H0(b18VarH2.l)) == null || c18Var.a != b18VarH2.o - 1 || c18Var.o + c18Var.p > b18VarH2.n)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                b18 b18VarH3 = j18Var.h();
                int i4 = (((int) (b18VarH3.i() & 4294967295L)) / 2) + b18VarH3.m;
                Iterator it3 = b18VarH3.l.iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        c18 c18Var3 = (c18) next;
                        int iAbs = Math.abs(((c18Var3.p / 2) + c18Var3.o) - i4);
                        do {
                            Object next2 = it3.next();
                            c18 c18Var4 = (c18) next2;
                            int iAbs2 = Math.abs(((c18Var4.p / 2) + c18Var4.o) - i4);
                            if (iAbs > iAbs2) {
                                next = next2;
                                iAbs = iAbs2;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next = null;
                }
                c18 c18Var5 = (c18) next;
                return new iy9(Boolean.valueOf(j18Var.j.a()), c18Var5 != null ? Integer.valueOf(c18Var5.a) : null);
        }
        return Integer.valueOf(iJ);
    }
}
