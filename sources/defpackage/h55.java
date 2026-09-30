package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h55 extends gbe implements a26 {
    final /* synthetic */ String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h55(String str, xn2 xn2Var) {
        super(1, xn2Var);
        this.$url = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        h55 h55Var = new h55(this.$url, (xn2) obj);
        wef wefVar = wef.a;
        h55Var.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        k55 k55Var = k55.a;
        try {
            dzbVar = mxb.j(k55.b, this.$url);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        String str = this.$url;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            k55.a.d().h("Failed to mark partial TTS cache for " + str, thA);
        }
        return wef.a;
    }
}
