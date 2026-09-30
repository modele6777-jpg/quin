package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.dailycard.model.DailyCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wo6 extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kq6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo6(kq6 kq6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = kq6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        wo6 wo6Var = new wo6(this.this$0, xn2Var);
        wo6Var.L$0 = obj;
        return wo6Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        List list = (List) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            gd8 gd8Var = this.this$0.b;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    dzbVar = ka8.a(ma8.Companion, ((DailyCard) it.next()).getDate());
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                if (dzbVar instanceof dzb) {
                    dzbVar = null;
                }
                ma8 ma8Var = (ma8) dzbVar;
                if (ma8Var != null) {
                    arrayList.add(ma8Var);
                }
            }
            this.L$0 = null;
            this.label = 1;
            Object objI = gd8Var.i(arrayList, this);
            bw2 bw2Var = bw2.a;
            if (objI == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wo6) k((xn2) obj2, (List) obj)).r(wef.a);
    }
}
