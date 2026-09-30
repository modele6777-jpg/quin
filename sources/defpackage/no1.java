package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class no1 extends gbe implements a26 {
    final /* synthetic */ vd6 $graphProcessor;
    int label;
    final /* synthetic */ qo1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no1(qo1 qo1Var, vd6 vd6Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = qo1Var;
        this.$graphProcessor = vd6Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        no1 no1Var = new no1(this.this$0, this.$graphProcessor, (xn2) obj);
        wef wefVar = wef.a;
        no1Var.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        String str = this.this$0 + " stopRepeating";
        vd6 vd6Var = this.$graphProcessor;
        try {
            Trace.beginSection(str);
            vd6Var.c();
            Trace.endSection();
            String str2 = this.this$0 + " abortCaptures";
            vd6 vd6Var2 = this.$graphProcessor;
            try {
                Trace.beginSection(str2);
                vd6Var2.a();
                return wef.a;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
