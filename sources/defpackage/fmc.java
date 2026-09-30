package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fmc extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $period;
    int label;
    final /* synthetic */ gmc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmc(String str, gmc gmcVar, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$accountId = str;
        this.this$0 = gmcVar;
        this.$period = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fmc(this.$accountId, this.this$0, this.$period, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!v4e.Q(this.$accountId)) {
            SharedPreferences.Editor editorEdit = this.this$0.a.edit();
            gmc gmcVar = this.this$0;
            String str = this.$accountId;
            String str2 = this.$period;
            gmcVar.getClass();
            if (!editorEdit.putBoolean(gmc.a(str, str2), true).commit()) {
                qc0.p("Check failed.");
                return null;
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        fmc fmcVar = (fmc) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        fmcVar.r(wefVar);
        return wefVar;
    }
}
