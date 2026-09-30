package defpackage;

import ai.askquin.datastore.model.LocalStorage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bd8 extends gbe implements l26 {
    final /* synthetic */ boolean $hasNewMessage;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd8(boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.$hasNewMessage = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        bd8 bd8Var = new bd8(this.$hasNewMessage, xn2Var);
        bd8Var.L$0 = obj;
        return bd8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        LocalStorage localStorage = (LocalStorage) this.L$0;
        if (this.label == 0) {
            jzb.q(obj);
            return LocalStorage.copy$default(localStorage, null, null, null, null, this.$hasNewMessage, 0, false, null, null, false, null, 0, null, null, null, false, false, null, null, null, null, false, 4194287, null);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bd8) k((xn2) obj2, (LocalStorage) obj)).r(wef.a);
    }
}
