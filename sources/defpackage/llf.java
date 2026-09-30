package defpackage;

import tech.chatmind.api.User;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class llf extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        llf llfVar = new llf(2, xn2Var);
        llfVar.L$0 = obj;
        return llfVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        User user = (User) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            String id = user.getId();
            boolean zIsNewUser = user.isNewUser();
            this.L$0 = null;
            this.label = 1;
            Object objA = p57.a.a(id, zIsNewUser, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((llf) k((xn2) obj2, (User) obj)).r(wef.a);
    }
}
