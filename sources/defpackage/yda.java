package defpackage;

import android.util.Log;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yda extends gbe implements n26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ zda this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yda(zda zdaVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = zdaVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        yda ydaVar = new yda(this.this$0, (xn2) obj3);
        ydaVar.L$0 = (Throwable) obj2;
        wef wefVar = wef.a;
        ydaVar.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Throwable th = (Throwable) this.L$0;
        b1.e("PipePresenceSrc", "Error in camera ID flow collection.", th);
        if (this.this$0.h.get()) {
            this.this$0.c(null, th);
        } else {
            ok8.j(Log.d("PipePresenceSrc", "Ignoring error because monitoring is stopped."));
        }
        return wef.a;
    }
}
