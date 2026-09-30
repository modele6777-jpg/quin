package defpackage;

import ai.askquin.ui.popup.dailyfortune.v;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h24 extends gbe implements l26 {
    final /* synthetic */ v $store;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h24(v vVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$store = vVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new h24(this.$store, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            v vVar = this.$store;
            this.label = 1;
            obj = vVar.c(this);
            bw2 bw2Var = bw2.a;
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
        if (obj == null) {
            jcc.k(0, "请先登录账号");
        } else {
            jcc.k(0, "已清除今日运势今日完成状态");
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((h24) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
