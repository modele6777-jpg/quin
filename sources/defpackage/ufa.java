package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ufa extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    final /* synthetic */ TextClassifier $textClassificationSession;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufa(TextClassifier textClassifier, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$textClassificationSession = textClassifier;
        this.$block = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ufa(this.$textClassificationSession, this.$block, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
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
        TextClassifier textClassifier = this.$textClassificationSession;
        if (textClassifier == null) {
            return null;
        }
        l26 l26Var = this.$block;
        this.label = 1;
        Object objZ = l26Var.z(textClassifier, this);
        bw2 bw2Var = bw2.a;
        return objZ == bw2Var ? bw2Var : objZ;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ufa) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
