package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mp4 extends gbe implements l26 {
    final /* synthetic */ e89 $lastSelectedCardIndex$delegate;
    final /* synthetic */ Integer $selectedCardIndex;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp4(Integer num, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$selectedCardIndex = num;
        this.$lastSelectedCardIndex$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mp4(this.$selectedCardIndex, this.$lastSelectedCardIndex$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Integer num = this.$selectedCardIndex;
        if (num != null) {
            this.$lastSelectedCardIndex$delegate.setValue(new Integer(num.intValue()));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        mp4 mp4Var = (mp4) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        mp4Var.r(wefVar);
        return wefVar;
    }
}
