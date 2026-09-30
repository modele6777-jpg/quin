package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ii9 extends gbe implements l26 {
    final /* synthetic */ o9 $accountProfileRepository;
    final /* synthetic */ Context $context;
    final /* synthetic */ e89 $isSubmitting$delegate;
    final /* synthetic */ x16 $onSkip;
    final /* synthetic */ e83 $selectionSnapshot;
    final /* synthetic */ gpf $userRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii9(e83 e83Var, Context context, gpf gpfVar, o9 o9Var, x16 x16Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$selectionSnapshot = e83Var;
        this.$context = context;
        this.$userRequester = gpfVar;
        this.$accountProfileRepository = o9Var;
        this.$onSkip = x16Var;
        this.$isSubmitting$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ii9(this.$selectionSnapshot, this.$context, this.$userRequester, this.$accountProfileRepository, this.$onSkip, this.$isSubmitting$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        ii9 ii9Var;
        Throwable th;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                jzb.q(obj);
                ii9Var = this;
                ii9Var.$isSubmitting$delegate.setValue(Boolean.FALSE);
                return wef.a;
            } catch (Throwable th2) {
                th = th2;
                ii9Var = this;
                ii9Var.$isSubmitting$delegate.setValue(Boolean.FALSE);
                throw th;
            }
        }
        jzb.q(obj);
        try {
            Context context = this.$context;
            gpf gpfVar = this.$userRequester;
            o9 o9Var = this.$accountProfileRepository;
            x16 x16Var = this.$onSkip;
            e83 e83Var = this.$selectionSnapshot;
            this.label = 1;
            ii9Var = this;
            try {
                Object objN = pa7.n(context, gpfVar, o9Var, x16Var, e83Var, ii9Var);
                bw2 bw2Var = bw2.a;
                if (objN == bw2Var) {
                    return bw2Var;
                }
                ii9Var.$isSubmitting$delegate.setValue(Boolean.FALSE);
                return wef.a;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                ii9Var.$isSubmitting$delegate.setValue(Boolean.FALSE);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            ii9Var = this;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ii9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
