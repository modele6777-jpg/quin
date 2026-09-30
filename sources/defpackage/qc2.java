package defpackage;

import android.content.ClipData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qc2 extends gbe implements l26 {
    final /* synthetic */ c52 $clipboard;
    final /* synthetic */ String $code;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc2(String str, c52 c52Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$code = str;
        this.$clipboard = c52Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qc2(this.$code, this.$clipboard, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            String str = this.$code;
            ClipData clipDataNewPlainText = ClipData.newPlainText(str, str);
            c52 c52Var = this.$clipboard;
            clipDataNewPlainText.getClass();
            a52 a52Var = new a52(clipDataNewPlainText);
            this.L$0 = null;
            this.label = 1;
            Object objA = c52Var.a(a52Var, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
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
        return ((qc2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
