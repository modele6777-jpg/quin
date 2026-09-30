package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ww8 extends gbe implements l26 {
    final /* synthetic */ String $skin;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww8(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$skin = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ww8 ww8Var = new ww8(this.$skin, xn2Var);
        ww8Var.L$0 = obj;
        return ww8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        p79Var.e(zw8.c, this.$skin);
        p79Var.e(zw8.b, Boolean.FALSE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ww8 ww8Var = (ww8) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        ww8Var.r(wefVar);
        return wefVar;
    }
}
