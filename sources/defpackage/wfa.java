package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wfa extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ yfa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfa(yfa yfaVar, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = yfaVar;
        this.$block = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wfa(this.this$0, this.$block, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009e A[RETURN] */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        yfa yfaVar;
        d99 d99Var;
        d99 d99Var2;
        TextClassifier textClassifier;
        Object objS;
        int i = this.label;
        gr4 gr4Var = gr4.MILLISECONDS;
        bw2 bw2Var = bw2.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                yfaVar = this.this$0;
                d99Var = yfaVar.e;
                this.L$0 = d99Var;
                this.L$1 = yfaVar;
                this.label = 1;
                if (d99Var.b(this) != bw2Var) {
                }
                return bw2Var;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        jzb.q(obj);
                        return obj;
                    }
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) this.L$0;
                try {
                    jzb.q(obj);
                    textClassifier = (TextClassifier) obj;
                    d99Var = d99Var2;
                    d99Var.h(null);
                    qfc qfcVar = ar4.b;
                    long jU = y41.U(200L, gr4Var);
                    ufa ufaVar = new ufa(textClassifier, this.$block, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    objS = rs0.S(vfh.R(jU), ufaVar, this);
                    if (objS == bw2Var) {
                        return bw2Var;
                    }
                    return objS;
                } catch (Throwable th) {
                    th = th;
                    d99Var2.h(null);
                    throw th;
                }
            }
            yfaVar = (yfa) this.L$1;
            d99 d99Var3 = (d99) this.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            textClassifier = yfaVar.f;
            if (textClassifier == null || textClassifier.isDestroyed()) {
                qfc qfcVar2 = ar4.b;
                long jU2 = y41.U(300L, gr4Var);
                vfa vfaVar = new vfa(yfaVar, null);
                this.L$0 = d99Var;
                this.L$1 = null;
                this.label = 2;
                Object objS2 = rs0.S(vfh.R(jU2), vfaVar, this);
                if (objS2 != bw2Var) {
                    d99Var2 = d99Var;
                    obj = objS2;
                    textClassifier = (TextClassifier) obj;
                    d99Var = d99Var2;
                    d99Var.h(null);
                    qfc qfcVar3 = ar4.b;
                    long jU3 = y41.U(200L, gr4Var);
                    ufa ufaVar2 = new ufa(textClassifier, this.$block, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    objS = rs0.S(vfh.R(jU3), ufaVar2, this);
                    if (objS == bw2Var) {
                        return objS;
                    }
                }
            } else {
                d99Var.h(null);
                qfc qfcVar4 = ar4.b;
                long jU4 = y41.U(200L, gr4Var);
                ufa ufaVar3 = new ufa(textClassifier, this.$block, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                objS = rs0.S(vfh.R(jU4), ufaVar3, this);
                if (objS == bw2Var) {
                    return objS;
                }
            }
            return bw2Var;
        } catch (Throwable th2) {
            th = th2;
            d99Var2 = d99Var;
            d99Var2.h(null);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wfa) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
