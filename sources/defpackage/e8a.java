package defpackage;

import ai.askquin.ui.onboard.PendingUserProfile;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e8a extends gbe implements l26 {
    final /* synthetic */ l26 $transform;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8a(l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$transform = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        e8a e8aVar = new e8a(this.$transform, xn2Var);
        e8aVar.L$0 = obj;
        return e8aVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        PendingUserProfile pendingUserProfile;
        isa isaVar;
        Object dzbVar;
        p79 p79Var = (p79) this.L$0;
        int i = this.label;
        String strD = null;
        if (i == 0) {
            jzb.q(obj);
            isa isaVar2 = xqa.h.a;
            String str = (String) p79Var.c(isaVar2);
            if (str == null) {
                pendingUserProfile = null;
            } else {
                if (v4e.Q(str)) {
                    str = null;
                }
                if (str != null) {
                    try {
                        xh7 xh7Var = fzc.a;
                        xh7Var.getClass();
                        dzbVar = (PendingUserProfile) xh7Var.b(PendingUserProfile.Companion.serializer(), str);
                    } catch (Throwable th) {
                        dzbVar = new dzb(th);
                    }
                    if (dzbVar instanceof dzb) {
                        dzbVar = null;
                    }
                    pendingUserProfile = (PendingUserProfile) dzbVar;
                } else {
                    pendingUserProfile = null;
                }
            }
            l26 l26Var = this.$transform;
            this.L$0 = p79Var;
            this.L$1 = isaVar2;
            this.L$2 = pendingUserProfile;
            this.label = 1;
            Object objZ = l26Var.z(pendingUserProfile, this);
            bw2 bw2Var = bw2.a;
            if (objZ == bw2Var) {
                return bw2Var;
            }
            obj = objZ;
            isaVar = isaVar2;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pendingUserProfile = (PendingUserProfile) this.L$2;
            isaVar = (isa) this.L$1;
            jzb.q(obj);
        }
        PendingUserProfile pendingUserProfileCopy$default = (PendingUserProfile) obj;
        if (pendingUserProfileCopy$default != null) {
            xh7 xh7Var2 = fzc.a;
            if (!pendingUserProfileCopy$default.equals(pendingUserProfile)) {
                pendingUserProfileCopy$default = PendingUserProfile.copy$default(pendingUserProfileCopy$default, null, null, null, false, null, ib8.i(), 31, null);
            }
            xh7Var2.getClass();
            strD = xh7Var2.d(PendingUserProfile.Companion.serializer(), pendingUserProfileCopy$default);
        }
        if (strD == null) {
            strD = "";
        }
        p79Var.e(isaVar, strD);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((e8a) k((xn2) obj2, (p79) obj)).r(wef.a);
    }
}
