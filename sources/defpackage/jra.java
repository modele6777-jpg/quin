package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jra extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jra(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$accountId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        jra jraVar = new jra(this.$accountId, xn2Var);
        jraVar.L$0 = obj;
        return jraVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Boolean bool = Boolean.TRUE;
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        String str = this.$accountId;
        List list = bsa.a;
        isa isaVar = new isa(ub3.i("ReminderTimesMigratedV2:", str));
        if (!pa7.t(p79Var.c(isaVar), bool)) {
            for (hs3 hs3Var : t72.I(xqa.i, xqa.j, xqa.k, xqa.l)) {
                hs3 hs3VarK = bsa.k(hs3Var, str);
                String str2 = (String) p79Var.c(hs3Var.a);
                if (str2 != null) {
                    if (v4e.Q(str2)) {
                        str2 = null;
                    }
                    if (str2 != null && p79Var.c(hs3VarK.a) == null) {
                        p79Var.f(hs3VarK.a, str2);
                    }
                }
                p79Var.d(hs3Var.a);
            }
            p79Var.f(isaVar, Boolean.TRUE);
        }
        String str3 = this.$accountId;
        isa isaVar2 = new isa(ub3.i("NotificationTouchpointsMigratedV1:", str3));
        if (!pa7.t(p79Var.c(isaVar2), bool)) {
            for (hs3 hs3Var2 : bsa.a) {
                hs3 hs3VarJ = bsa.j(hs3Var2, str3);
                Boolean bool2 = (Boolean) p79Var.c(hs3Var2.a);
                if (bool2 != null && p79Var.c(hs3VarJ.a) == null) {
                    p79Var.f(hs3VarJ.a, bool2);
                }
                p79Var.d(hs3Var2.a);
            }
            hs3 hs3Var3 = xqa.V0;
            hs3 hs3VarI = bsa.i(hs3Var3, str3);
            String str4 = (String) p79Var.c(hs3Var3.a);
            if (str4 != null) {
                String str5 = v4e.Q(str4) ? null : str4;
                if (str5 != null && p79Var.c(hs3VarI.a) == null) {
                    p79Var.f(hs3VarI.a, str5);
                }
            }
            p79Var.d(hs3Var3.a);
            p79Var.f(isaVar2, Boolean.TRUE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        jra jraVar = (jra) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        jraVar.r(wefVar);
        return wefVar;
    }
}
