package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tfa extends gbe implements l26 {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ yfa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfa(long j, xn2 xn2Var, yfa yfaVar, CharSequence charSequence) {
        super(2, xn2Var);
        this.this$0 = yfaVar;
        this.$text = charSequence;
        this.$selection = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        tfa tfaVar = new tfa(this.$selection, xn2Var, this.this$0, this.$text);
        tfaVar.L$0 = obj;
        return tfaVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            yfa yfaVar = this.this$0;
            CharSequence charSequence = this.$text;
            long j = this.$selection;
            this.label = 1;
            Object objB = yfaVar.b(charSequence, j, textClassifier, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
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
        return ((tfa) k((xn2) obj2, (TextClassifier) obj)).r(wef.a);
    }
}
