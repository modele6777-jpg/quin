package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c9d extends gbe implements l26 {
    final /* synthetic */ e8d $format;
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $pathway;
    int label;
    final /* synthetic */ bad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9d(bad badVar, String str, e8d e8dVar, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = badVar;
        this.$operationId = str;
        this.$format = e8dVar;
        this.$pathway = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new c9d(this.this$0, this.$operationId, this.$format, this.$pathway, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        boolean zCommit;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        f95 f95Var = f95.a;
        bad badVar = this.this$0;
        Context context = badVar.a;
        String str = this.$operationId;
        String strName = badVar.c.a.name();
        String strName2 = this.$format.name();
        String strA = this.this$0.c.a(this.$format);
        String str2 = this.$pathway;
        long jCurrentTimeMillis = System.currentTimeMillis();
        e95 e95Var = new e95(str, strName, strName2, strA, str2, jCurrentTimeMillis, null, null, null, null, 0, null, false, null, null);
        synchronized (f95Var) {
            try {
                context.getClass();
                e95 e95VarF = f95Var.f(context);
                zCommit = false;
                if (e95VarF == null) {
                    zCommit = context.getApplicationContext().getSharedPreferences("external_share_operation", 0).edit().putString(f95.l(str), f95.q(e95Var).toString()).putString("active_id", str).commit();
                } else if (jCurrentTimeMillis - e95VarF.f >= 1800000) {
                    f95Var.b(context, e95VarF.a);
                    zCommit = context.getApplicationContext().getSharedPreferences("external_share_operation", 0).edit().putString(f95.l(str), f95.q(e95Var).toString()).putString("active_id", str).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Boolean.valueOf(zCommit);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((c9d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
