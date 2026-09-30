package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xfa extends gbe implements l26 {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ yfa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfa(long j, xn2 xn2Var, yfa yfaVar, CharSequence charSequence) {
        super(2, xn2Var);
        this.$text = charSequence;
        this.$selection = j;
        this.this$0 = yfaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        xfa xfaVar = new xfa(this.$selection, xn2Var, this.this$0, this.$text);
        xfaVar.L$0 = obj;
        return xfaVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        long j;
        d99 d99Var;
        qme qmeVar;
        yfa yfaVar;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            TextSelection.Request.Builder defaultLocales = new TextSelection.Request.Builder(this.$text, eue.g(this.$selection), eue.f(this.$selection)).setDefaultLocales(this.this$0.d());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jB = u3c.b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            bw2 bw2Var = bw2.a;
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                yfa yfaVar2 = this.this$0;
                CharSequence charSequence = this.$text;
                this.J$0 = jB;
                this.label = 2;
                if (yfaVar2.b(charSequence, jB, textClassifier, this) != bw2Var) {
                    j = jB;
                }
            } else {
                yfa yfaVar3 = this.this$0;
                CharSequence charSequence2 = this.$text;
                TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
                textClassification.getClass();
                qme qmeVarC = yfaVar3.c(charSequence2, jB, textClassification);
                yfa yfaVar4 = this.this$0;
                d99Var = yfaVar4.e;
                this.L$0 = qmeVarC;
                this.L$1 = d99Var;
                this.L$2 = yfaVar4;
                this.J$0 = jB;
                this.label = 1;
                if (d99Var.b(this) != bw2Var) {
                    qmeVar = qmeVarC;
                    yfaVar = yfaVar4;
                    j = jB;
                    yfaVar.g.setValue(qmeVar);
                }
            }
            return bw2Var;
        }
        if (i == 1) {
            j = this.J$0;
            yfaVar = (yfa) this.L$2;
            d99Var = (d99) this.L$1;
            qmeVar = (qme) this.L$0;
            jzb.q(obj);
            try {
                yfaVar.g.setValue(qmeVar);
            } finally {
                d99Var.h(null);
            }
        } else {
            if (i != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            jzb.q(obj);
        }
        return new eue(j);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xfa) k((xn2) obj2, (TextClassifier) obj)).r(wef.a);
    }
}
