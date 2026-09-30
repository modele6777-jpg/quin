package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fve extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ x16 $onComplete;
    final /* synthetic */ mfc $schemeType;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ lve this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fve(x16 x16Var, lve lveVar, mfc mfcVar, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$onComplete = x16Var;
        this.this$0 = lveVar;
        this.$schemeType = mfcVar;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        fve fveVar = new fve(this.$onComplete, this.this$0, this.$schemeType, this.$context, xn2Var);
        fveVar.L$0 = obj;
        return fveVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                lve lveVar = this.this$0;
                mfc mfcVar = this.$schemeType;
                Context context = this.$context;
                js3 js3Var = ga4.a;
                hr3 hr3Var = hr3.c;
                eve eveVar = new eve(lveVar, mfcVar, context, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objP0 = ynb.p0(hr3Var, eveVar, this);
                bw2 bw2Var = bw2.a;
                if (objP0 == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            dzbVar = wefVar;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null && (thA instanceof CancellationException)) {
            throw thA;
        }
        this.$onComplete.invoke();
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fve) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
