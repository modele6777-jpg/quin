package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kp4 extends gbe implements l26 {
    final /* synthetic */ String $commonError;
    final /* synthetic */ e89 $drawnCard$delegate;
    final /* synthetic */ e89 $isCardRevealed$delegate;
    final /* synthetic */ e89 $isConfirming$delegate;
    final /* synthetic */ a26 $randomNewCard;
    final /* synthetic */ sdd $this_DrawnCardContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp4(sdd sddVar, e89 e89Var, a26 a26Var, e89 e89Var2, e89 e89Var3, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_DrawnCardContent = sddVar;
        this.$isConfirming$delegate = e89Var;
        this.$randomNewCard = a26Var;
        this.$drawnCard$delegate = e89Var2;
        this.$isCardRevealed$delegate = e89Var3;
        this.$commonError = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kp4(this.$this_DrawnCardContent, this.$isConfirming$delegate, this.$randomNewCard, this.$drawnCard$delegate, this.$isCardRevealed$delegate, this.$commonError, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            e89 e89Var = this.$isConfirming$delegate;
            a26 a26Var = this.$randomNewCard;
            e89 e89Var2 = this.$drawnCard$delegate;
            e89 e89Var3 = this.$isCardRevealed$delegate;
            String str = this.$commonError;
            this.label = 1;
            Object objD = g21.d(e89Var, a26Var, e89Var2, e89Var3, str, this);
            bw2 bw2Var = bw2.a;
            if (objD == bw2Var) {
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
        return ((kp4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
