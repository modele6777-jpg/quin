package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jw8 extends gbe implements l26 {
    final /* synthetic */ a26 $confirm;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw8(xn2 xn2Var, a26 a26Var) {
        super(2, xn2Var);
        this.$confirm = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jw8(xn2Var, this.$confirm);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ui7 ui7Var;
        String str;
        ui7 ui7Var2;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            a26 a26Var = this.$confirm;
            ui7Var = new ui7();
            this.L$0 = ui7Var;
            this.L$1 = null;
            str = "enteredDrawing";
            this.L$2 = "enteredDrawing";
            this.L$3 = ui7Var;
            this.label = 1;
            obj = a26Var.d(this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
            ui7Var2 = ui7Var;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ui7Var = (ui7) this.L$3;
            str = (String) this.L$2;
            ui7Var2 = (ui7) this.L$0;
            jzb.q(obj);
        }
        jgb.d0(ui7Var, str, (Boolean) obj);
        return new QaResult.Ok(new ti7(ui7Var2.a));
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jw8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
