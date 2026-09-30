package defpackage;

import ai.askquin.datastore.model.LocalStorage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zc8 extends gbe implements l26 {
    final /* synthetic */ ma8 $today;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc8(ma8 ma8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$today = ma8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        zc8 zc8Var = new zc8(this.$today, xn2Var);
        zc8Var.L$0 = obj;
        return zc8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        LocalStorage localStorage = (LocalStorage) this.L$0;
        if (this.label == 0) {
            jzb.q(obj);
            return LocalStorage.copy$default(localStorage, null, null, null, null, false, 0, false, this.$today.toString(), null, false, null, 0, null, null, null, false, false, null, null, null, null, false, 4194175, null);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zc8) k((xn2) obj2, (LocalStorage) obj)).r(wef.a);
    }
}
