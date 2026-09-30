package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wc7 extends gbe implements l26 {
    final /* synthetic */ String $code;
    final /* synthetic */ String $codeType;
    final /* synthetic */ boolean $isMember;
    int label;
    final /* synthetic */ yc7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc7(yc7 yc7Var, String str, String str2, boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = yc7Var;
        this.$code = str;
        this.$codeType = str2;
        this.$isMember = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wc7(this.this$0, this.$code, this.$codeType, this.$isMember, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws jzc {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        emb embVar = this.this$0.d;
        String str = this.$code;
        String str2 = this.$codeType;
        Boolean boolValueOf = Boolean.valueOf(this.$isMember);
        this.label = 1;
        Object objA = embVar.a(str, str2, boolValueOf, this);
        bw2 bw2Var = bw2.a;
        return objA == bw2Var ? bw2Var : objA;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wc7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
