package defpackage;

import ai.askquin.datastore.model.UserProfile;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gof extends gbe implements l26 {
    final /* synthetic */ String $bios;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gof(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$bios = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        gof gofVar = new gof(this.$bios, xn2Var);
        gofVar.L$0 = obj;
        return gofVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        UserProfile userProfile = (UserProfile) this.L$0;
        if (this.label == 0) {
            jzb.q(obj);
            return UserProfile.copy$default(userProfile, null, null, null, this.$bios, null, null, null, null, null, null, null, 2039, null);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gof) k((xn2) obj2, (UserProfile) obj)).r(wef.a);
    }
}
