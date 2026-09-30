package defpackage;

import ai.askquin.datastore.model.UserProfile;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eof extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        eof eofVar = new eof(2, xn2Var);
        eofVar.L$0 = obj;
        return eofVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        UserProfile userProfile = (UserProfile) this.L$0;
        if (this.label == 0) {
            jzb.q(obj);
            return UserProfile.copy$default(userProfile, null, null, null, null, null, pu4.a, n2f.a, null, null, null, null, 1951, null);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((eof) k((xn2) obj2, (UserProfile) obj)).r(wef.a);
    }
}
