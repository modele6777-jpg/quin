package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class el implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ r0 c;

    public /* synthetic */ el(r0 r0Var, String str, int i) {
        this.a = i;
        this.c = r0Var;
        this.b = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        String str = this.b;
        r0 r0Var = this.c;
        switch (i) {
            case 0:
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", "next_step", "pathway", "spread_select");
                l1fVar.a(str, "spread_tier");
                az1 az1VarC = r0Var.C();
                if (az1VarC != null) {
                    bm8.H(new iy9("triggered_by", "new_reading"), new iy9("divination_type", az1VarC.a.a), new iy9("session_id", az1VarC.b)).forEach(new al(new gl(2, l1fVar, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 0), 0));
                }
                return wefVar;
            case 1:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a(str, "btn");
                fc4 fc4Var = r0Var.H0;
                if (fc4Var != null) {
                    l1fVar2.a(fc4Var.a, "chat_id");
                    return wefVar;
                }
                pa7.g0("divinationKey");
                throw null;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                r0Var.X0(new et8(str, str2, false));
                return wefVar;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                uc4 uc4Var = r0Var.f;
                fc4 fc4Var2 = r0Var.H0;
                if (fc4Var2 == null) {
                    pa7.g0("divinationKey");
                    throw null;
                }
                ((gq3) uc4Var).i(fc4Var2.a, false);
                r0Var.X0(new et8(str, str3, true));
                return wefVar;
            default:
                r0Var.x(str);
                return wefVar;
        }
    }

    public /* synthetic */ el(String str, r0 r0Var, int i) {
        this.a = i;
        this.b = str;
        this.c = r0Var;
    }
}
