package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.qa.bridge.QaResult;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nx8 extends gbe implements l26 {
    int label;
    final /* synthetic */ ox8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx8(ox8 ox8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ox8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new nx8(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            rw8 rw8Var = this.this$0.a;
            this.label = 1;
            obj = rw8Var.a(this);
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        hw8 hw8Var = (hw8) obj;
        ui7 ui7Var = new ui7();
        jgb.d0(ui7Var, "entitled", Boolean.valueOf(hw8Var.a.a()));
        ui7Var.a(oh7.b(new Integer(hw8Var.a.a)), "confirmedUnlockedCount");
        jgb.d0(ui7Var, "annualActive", Boolean.valueOf(hw8Var.a.b));
        jgb.d0(ui7Var, "storageFull", Boolean.valueOf(hw8Var.e));
        zw8 zw8Var = zw8.a;
        jgb.d0(ui7Var, "defaultMixed", Boolean.valueOf(zw8.a()));
        jgb.d0(ui7Var, "selectionPageAvailable", Boolean.valueOf(od4.a0 != null));
        jgb.d0(ui7Var, "allDecksContractAvailable", Boolean.TRUE);
        ArrayList arrayList = new ArrayList();
        Iterator it = hw8Var.b.b.iterator();
        while (it.hasNext()) {
            yi7 yi7VarC = oh7.c(((TarotSkinIdentify) it.next()).name());
            yi7VarC.getClass();
            arrayList.add(yi7VarC);
        }
        ui7Var.a(new yg7(arrayList), "owned");
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = hw8Var.b.a().iterator();
        while (it2.hasNext()) {
            yi7 yi7VarC2 = oh7.c(((TarotSkinIdentify) it2.next()).name());
            yi7VarC2.getClass();
            arrayList2.add(yi7VarC2);
        }
        ui7Var.a(new yg7(arrayList2), "pool");
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = hw8Var.c.iterator();
        while (it3.hasNext()) {
            yi7 yi7VarC3 = oh7.c(((TarotSkinIdentify) it3.next()).name());
            yi7VarC3.getClass();
            arrayList3.add(yi7VarC3);
        }
        ui7Var.a(new yg7(arrayList3), "missing");
        ui7Var.a(oh7.b(new Integer(n3d.l(hw8Var.b.a(), hw8Var.c).size())), "readyDeckCount");
        jgb.d0(ui7Var, "resourcesReady", Boolean.valueOf(hw8Var.a()));
        jgb.d0(ui7Var, "downloading", Boolean.valueOf(hw8Var.f));
        return new QaResult.Ok(new ti7(ui7Var.a));
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((nx8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
