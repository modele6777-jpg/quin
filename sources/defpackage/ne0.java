package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ne0 extends gbe implements l26 {
    final /* synthetic */ String $assetId;
    final /* synthetic */ String $chatId;
    final /* synthetic */ je0 $manager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne0(je0 je0Var, String str, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$manager = je0Var;
        this.$chatId = str;
        this.$assetId = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ne0(this.$manager, this.$chatId, this.$assetId, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        je0 je0Var = this.$manager;
        String str = this.$chatId;
        String str2 = this.$assetId;
        je0Var.getClass();
        vz9 vz9Var = je0Var.g;
        str.getClass();
        str2.getClass();
        if (!pa7.t((String) vz9Var.getValue(), str2)) {
            je0Var.c();
            vz9Var.setValue(str2);
            je0Var.f = ynb.V(je0Var.c, null, null, new ge0(je0Var, null, je0Var.a(str2), str, str2), 3);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ne0 ne0Var = (ne0) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ne0Var.r(wefVar);
        return wefVar;
    }
}
