package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w4 extends gbe implements l26 {
    final /* synthetic */ float $x;
    final /* synthetic */ float $y;
    int label;
    final /* synthetic */ y4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(y4 y4Var, float f, float f2, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = y4Var;
        this.$x = f;
        this.$y = f2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new w4(this.this$0, this.$x, this.$y, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            y4 y4Var = this.this$0;
            float f = this.$x;
            float f2 = this.$y;
            long jFloatToRawIntBits = Float.floatToRawIntBits(f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
            this.label = 1;
            Object objB = ohc.b(((yhc) y4Var).g1, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
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
        return ((w4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
