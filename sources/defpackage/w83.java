package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w83 extends gbe implements l26 {
    final /* synthetic */ o9 $accountProfileRepository;
    final /* synthetic */ Context $context;
    final /* synthetic */ e89 $isSubmitting$delegate;
    final /* synthetic */ x16 $onDismiss;
    final /* synthetic */ d83 $promptMode;
    final /* synthetic */ e89 $step$delegate;
    final /* synthetic */ h83 $submission;
    final /* synthetic */ gpf $userRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w83(h83 h83Var, d83 d83Var, Context context, gpf gpfVar, o9 o9Var, x16 x16Var, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$submission = h83Var;
        this.$promptMode = d83Var;
        this.$context = context;
        this.$userRequester = gpfVar;
        this.$accountProfileRepository = o9Var;
        this.$onDismiss = x16Var;
        this.$step$delegate = e89Var;
        this.$isSubmitting$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new w83(this.$submission, this.$promptMode, this.$context, this.$userRequester, this.$accountProfileRepository, this.$onDismiss, this.$step$delegate, this.$isSubmitting$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        w83 w83Var;
        Throwable th;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                jzb.q(obj);
                w83Var = this;
                e89 e89Var = w83Var.$isSubmitting$delegate;
                y6c y6cVar = z83.a;
                e89Var.setValue(Boolean.FALSE);
                return wef.a;
            } catch (Throwable th2) {
                th = th2;
                w83Var = this;
                e89 e89Var2 = w83Var.$isSubmitting$delegate;
                y6c y6cVar2 = z83.a;
                e89Var2.setValue(Boolean.FALSE);
                throw th;
            }
        }
        jzb.q(obj);
        try {
            d83 d83Var = this.$promptMode;
            Context context = this.$context;
            gpf gpfVar = this.$userRequester;
            o9 o9Var = this.$accountProfileRepository;
            x16 x16Var = this.$onDismiss;
            e89 e89Var3 = this.$step$delegate;
            h83 h83Var = this.$submission;
            this.label = 1;
            w83Var = this;
            try {
                Object objE = z83.e(d83Var, context, gpfVar, o9Var, x16Var, e89Var3, h83Var, w83Var);
                bw2 bw2Var = bw2.a;
                if (objE == bw2Var) {
                    return bw2Var;
                }
                e89 e89Var4 = w83Var.$isSubmitting$delegate;
                y6c y6cVar3 = z83.a;
                e89Var4.setValue(Boolean.FALSE);
                return wef.a;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                e89 e89Var5 = w83Var.$isSubmitting$delegate;
                y6c y6cVar4 = z83.a;
                e89Var5.setValue(Boolean.FALSE);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            w83Var = this;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((w83) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
