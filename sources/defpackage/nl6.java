package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nl6 extends gbe implements p26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ ol6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl6(xn2 xn2Var, ol6 ol6Var) {
        super(5, xn2Var);
        this.this$0 = ol6Var;
    }

    @Override // defpackage.p26
    public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        nl6 nl6Var = new nl6((xn2) obj5, this.this$0);
        nl6Var.L$0 = (List) obj;
        nl6Var.L$1 = (List) obj2;
        nl6Var.Z$0 = zBooleanValue;
        nl6Var.Z$1 = zBooleanValue2;
        return nl6Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        m8b m8bVarD = this.this$0.d();
        StringBuilder sbN = ib8.n(list.size(), list2.size(), "HistoryViewModel: list: ", ", qd: ", ", loadingMore=");
        sbN.append(z);
        sbN.append(", hasMore=");
        sbN.append(z2);
        m8bVarD.e(sbN.toString());
        qk6 qk6Var = this.this$0.e;
        uj3 uj3Var = new uj3(1, this.this$0.b, tc4.class, "loadContent", "loadContent(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0, 23);
        qk6Var.getClass();
        List listB1 = s72.b1(list, new y85(3, qk6Var));
        ArrayList arrayList = new ArrayList(t72.u(listB1, 10));
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            arrayList.add(cc4.a((lc4) it.next(), uj3Var));
        }
        ArrayList arrayList2 = new ArrayList(t72.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(cc4.b((x6b) it2.next()));
        }
        List listB2 = s72.b1(s72.Q0(arrayList, arrayList2), new ww2(25));
        this.this$0.e.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : listB2) {
            w57 w57VarC = ((bc4) obj2).c();
            th5 th5Var = cye.b;
            ma8 ma8VarA = gcc.E(w57VarC, fbc.d()).a();
            Object arrayList3 = linkedHashMap.get(ma8VarA);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(ma8VarA, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        r9a r9aVar = r9a.d;
        r9aVar.getClass();
        q9a q9aVarF = r9aVar;
        if (!linkedHashMap.isEmpty()) {
            s9a s9aVar = new s9a(r9aVar);
            s9aVar.putAll(linkedHashMap);
            q9aVarF = s9aVar.f();
        }
        return (!((r2) q9aVarF).isEmpty() || z2) ? new el6(q9aVarF, z, z2) : cl6.a;
    }
}
