package defpackage;

import ai.askquin.ui.popup.dailyfortune.v;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r73 extends gbe implements l26 {
    int label;
    final /* synthetic */ s73 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r73(s73 s73Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = s73Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new r73(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        v vVar = this.this$0.a;
        this.label = 1;
        Object objI = vVar.i(this);
        bw2 bw2Var = bw2.a;
        return objI == bw2Var ? bw2Var : objI;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((r73) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
