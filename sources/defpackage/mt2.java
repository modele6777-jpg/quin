package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mt2 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ mt2(bd4 bd4Var, List list, a26 a26Var, boolean z, mue mueVar, long j) {
        this.d = bd4Var;
        this.e = list;
        this.f = a26Var;
        this.b = z;
        this.g = mueVar;
        this.c = j;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        List list;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                bd4 bd4Var = (bd4) obj6;
                List list2 = (List) obj5;
                a26 a26Var = (a26) obj4;
                mue mueVar = (mue) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4 dd4Var = bd4Var.b;
                    boolean z = this.b;
                    float f = z ? 56.0f : 52.0f;
                    mue mueVar2 = z ? null : mueVar;
                    y72 y72Var = z ? null : new y72(this.c);
                    dd4 dd4Var2 = bd4Var.b;
                    ad4 ad4Var = dd4Var2 instanceof ad4 ? (ad4) dd4Var2 : null;
                    List list3 = ad4Var != null ? ad4Var.b : null;
                    List listI = pu4.a;
                    if (list3 == null) {
                        list3 = listI;
                    }
                    int size = list2.size() + list3.size();
                    if (1 <= size && size < 6) {
                        listI = t72.H(Integer.valueOf(size));
                    } else if (size == 6) {
                        listI = t72.I(4, 2);
                    } else if (size == 7) {
                        listI = t72.I(5, 2);
                    } else if (size == 8) {
                        listI = t72.I(5, 3);
                    } else if (size == 9) {
                        listI = t72.I(5, 4);
                    } else if (size == 10) {
                        listI = t72.I(5, 5);
                    } else if (size == 11) {
                        listI = t72.I(4, 4, 3);
                    } else if (size == 12) {
                        listI = t72.I(5, 5, 2);
                    } else if (size == 13) {
                        listI = t72.I(5, 5, 3);
                    } else if (size == 14) {
                        listI = t72.I(5, 5, 4);
                    } else if (size == 15) {
                        listI = t72.I(5, 5, 5);
                    } else if (size != 16) {
                        if (size > 0) {
                            int i2 = (size + 4) / 5;
                            ArrayList arrayList = new ArrayList(i2);
                            for (int i3 = 0; i3 < i2; i3++) {
                                arrayList.add(Integer.valueOf(Math.min(5, size - (i3 * 5))));
                            }
                            list = arrayList;
                        }
                        beb.d(null, dd4Var, list2, a26Var, f, 16.0f, 0.0f, 0L, 0.0f, mueVar2, y72Var, list, l46Var, 807075840);
                    } else {
                        listI = t72.I(4, 4, 4, 4);
                    }
                    list = listI;
                    beb.d(null, dd4Var, list2, a26Var, f, 16.0f, 0.0f, 0L, 0.0f, mueVar2, y72Var, list, l46Var, 807075840);
                } else {
                    l46Var.Z();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                c8b.b((j09) obj6, (String) obj5, this.b, (x4d) obj4, this.c, (x16) obj3, (l46) obj, k99.P(7));
                break;
            default:
                ((Integer) obj2).getClass();
                ((uod) obj6).a((t69) obj5, (j09) obj4, (pod) obj3, this.b, this.c, (l46) obj, k99.P(196609));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ mt2(j09 j09Var, String str, boolean z, x4d x4dVar, long j, x16 x16Var, int i) {
        this.d = j09Var;
        this.e = str;
        this.b = z;
        this.f = x4dVar;
        this.c = j;
        this.g = x16Var;
    }

    public /* synthetic */ mt2(uod uodVar, t69 t69Var, j09 j09Var, pod podVar, boolean z, long j, int i) {
        this.d = uodVar;
        this.e = t69Var;
        this.f = j09Var;
        this.g = podVar;
        this.b = z;
        this.c = j;
    }
}
