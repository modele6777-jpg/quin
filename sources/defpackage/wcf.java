package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wcf extends gbe implements n26 {
    final /* synthetic */ e8d $format;
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcf(e8d e8dVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.$format = e8dVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        wcf wcfVar = new wcf(this.$format, (xn2) obj3);
        wcfVar.L$0 = (g8d) obj;
        wcfVar.I$0 = iIntValue;
        return wcfVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        g8d g8dVar = (g8d) this.L$0;
        int i = this.I$0;
        if (this.label == 0) {
            jzb.q(obj);
            return s.Q(g8dVar, i, this.$format == e8d.Long ? 67108864 : 8388608);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
