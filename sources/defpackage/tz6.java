package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.message.model.InAppMessage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tz6 extends gbe implements l26 {
    Object L$0;
    int label;
    final /* synthetic */ uz6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz6(uz6 uz6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = uz6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tz6(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            zt8 zt8Var = this.this$0.a;
            this.label = 1;
            obj = zt8.a(zt8Var, this);
            if (obj != bw2Var) {
            }
        }
        if (i == 1) {
            jzb.q(obj);
        } else {
            if (i != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        List list = (List) obj;
        bz6 bz6Var = this.this$0.b;
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(jgb.i0((InAppMessage) it.next()));
        }
        this.L$0 = null;
        this.label = 2;
        Object objK = urg.K(this, new so5(13, bz6Var, arrayList), bz6Var.a, false, true);
        if (objK != bw2Var) {
            objK = wefVar;
        }
        return objK == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tz6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
