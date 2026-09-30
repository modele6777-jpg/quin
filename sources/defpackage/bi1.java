package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bi1 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bi1(int i, float f, List list, a26 a26Var) {
        this.b = i;
        this.c = f;
        this.d = list;
        this.e = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        Integer numValueOf;
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        int i2 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qn4.k((String) obj4, this.c, (j09) obj3, (l46) obj, k99.P(1 | i2));
                return wef.a;
            default:
                final a26 a26Var = (a26) obj3;
                final r6e r6eVar = (r6e) obj;
                kl2 kl2Var = (kl2) obj2;
                r6eVar.getClass();
                List<List> listP1 = i2 > 0 ? s72.p1(r6eVar.z0(new dd2(new st5((List) obj4, i2, 10), true, -223867091), Boolean.FALSE), i2, i2, true) : pu4.a;
                long j = kl2Var.a;
                if (!kl2.d(j)) {
                    qc0.p("Table must have bounded width");
                    return null;
                }
                final float f = this.c;
                final float fH = (kl2.h(j) - ((i2 + 1) * f)) / i2;
                float size = (listP1.size() + 1) * f;
                int iIntValue = 0;
                long jE = ll2.e(ll2.b(0, ym8.L(fH), 0, 0, 13), j);
                final ArrayList arrayList = new ArrayList(t72.u(listP1, 10));
                for (List list : listP1) {
                    ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((tn8) it.next()).v(jE));
                    }
                    arrayList.add(arrayList2);
                }
                final ArrayList arrayList3 = new ArrayList(t72.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((List) it2.next()).iterator();
                    if (it3.hasNext()) {
                        numValueOf = Integer.valueOf(((cea) it3.next()).b);
                        while (it3.hasNext()) {
                            Integer numValueOf2 = Integer.valueOf(((cea) it3.next()).b);
                            if (numValueOf.compareTo(numValueOf2) < 0) {
                                numValueOf = numValueOf2;
                            }
                        }
                    } else {
                        numValueOf = null;
                    }
                    arrayList3.add(Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0));
                }
                final int iH = kl2.h(j);
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    iIntValue += ((Number) it4.next()).intValue();
                }
                final int iL = ym8.L(iIntValue + size);
                return r6eVar.n0(iH, iL, qu4.a, new a26() { // from class: qjd
                    @Override // defpackage.a26
                    public final Object d(Object obj5) {
                        bea beaVar = (bea) obj5;
                        beaVar.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        float f2 = f;
                        float fFloatValue = f2;
                        int i3 = 0;
                        for (Object obj6 : arrayList) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                t72.Z();
                                throw null;
                            }
                            float f3 = f2 / 2.0f;
                            arrayList4.add(Float.valueOf(fFloatValue - f3));
                            float f4 = f2;
                            for (cea ceaVar : (List) obj6) {
                                if (i3 == 0) {
                                    arrayList5.add(Float.valueOf(f4 - f3));
                                }
                                beaVar.g(ceaVar, ym8.L(f4), ym8.L(fFloatValue), 0.0f);
                                f4 += fH + f2;
                            }
                            if (i3 == 0) {
                                arrayList5.add(Float.valueOf(f4 - f3));
                            }
                            fFloatValue += ((Number) arrayList3.get(i3)).floatValue() + f2;
                            i3 = i4;
                        }
                        arrayList4.add(Float.valueOf(fFloatValue - (f2 / 2.0f)));
                        rde rdeVar = new rde(arrayList4, arrayList5);
                        tn8 tn8Var = (tn8) s72.X0(r6eVar.z0(new dd2(new p4c(8, a26Var, rdeVar), true, -1387549559), Boolean.TRUE));
                        int i5 = iH;
                        boolean z = i5 >= 0;
                        int i6 = iL;
                        if (!(z & (i6 >= 0))) {
                            k37.a("width and height must be >= 0");
                        }
                        beaVar.k(tn8Var.v(ll2.h(i5, i5, i6, i6)), 0, 0, 0.0f);
                        return wef.a;
                    }
                });
        }
    }

    public /* synthetic */ bi1(String str, float f, j09 j09Var, int i) {
        this.d = str;
        this.c = f;
        this.e = j09Var;
        this.b = i;
    }
}
