package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w3a extends gbe implements o26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ y3a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3a(y3a y3aVar, xn2 xn2Var) {
        super(4, xn2Var);
        this.this$0 = y3aVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        LinkedHashMap linkedHashMap;
        List listH;
        v2a v2aVar;
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        x5a x5aVar = (x5a) this.L$2;
        ArrayList arrayList = null;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        y3a y3aVar = this.this$0;
        int i = y3a.c1;
        if (list != null) {
            y3aVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((z6e) obj2).h().i()) {
                    arrayList2.add(obj2);
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : arrayList2) {
                int iOrdinal = ((z6e) obj3).h().e().ordinal();
                if (iOrdinal == 0) {
                    v2aVar = v2a.Week;
                } else if (iOrdinal == 1) {
                    v2aVar = v2a.Month;
                } else if (iOrdinal == 2) {
                    v2aVar = v2a.Quarter;
                } else {
                    if (iOrdinal != 3) {
                        ap.c();
                        return null;
                    }
                    v2aVar = v2a.Year;
                }
                Object arrayList3 = linkedHashMap2.get(v2aVar);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap2.put(v2aVar, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            linkedHashMap = new LinkedHashMap(bm8.F(linkedHashMap2.size()));
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                linkedHashMap.put(entry.getKey(), (z6e) s72.x0((List) entry.getValue()));
            }
        } else {
            linkedHashMap = null;
        }
        if (pa7.t(y3aVar.T0, "onboarding_finish")) {
            ca2.a.getClass();
            boolean z = ca2.c;
            thb thbVar = thb.f;
            listH = z ? t72.H(thbVar) : t72.I(thbVar, thb.a, thb.b);
        } else {
            listH = z3a.a;
        }
        if (list2 != null) {
            arrayList = new ArrayList();
            for (Object obj4 : list2) {
                if (s72.o0(listH, ((n07) obj4).g())) {
                    arrayList.add(obj4);
                }
            }
        }
        r3a r3aVar = new r3a(linkedHashMap == null ? qu4.a : linkedHashMap, (linkedHashMap == null || arrayList == null) ? false : true, arrayList == null ? pu4.a : arrayList);
        boolean z2 = x5aVar.b;
        List list3 = x5aVar.c;
        List list4 = x5aVar.d;
        boolean z3 = x5aVar.e;
        boolean z4 = x5aVar.f;
        list3.getClass();
        list4.getClass();
        return new x5a(r3aVar, z2, list3, list4, z3, z4);
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        w3a w3aVar = new w3a(this.this$0, (xn2) obj4);
        w3aVar.L$0 = (List) obj;
        w3aVar.L$1 = (List) obj2;
        w3aVar.L$2 = (x5a) obj3;
        return w3aVar.r(wef.a);
    }
}
