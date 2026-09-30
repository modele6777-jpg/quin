package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ff2 extends gbe implements l26 {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ gf2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff2(gf2 gf2Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = gf2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ff2 ff2Var = new ff2(this.this$0, xn2Var);
        ff2Var.F$0 = ((Number) obj).floatValue();
        return ff2Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        boolean z;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            float f = this.F$0;
            Object objG = this.this$0.a.d.a.g(swc.e);
            l26 l26Var = (l26) (objG != null ? objG : null);
            if (l26Var == null) {
                throw kv2.d("Required value was null.");
            }
            hl9 hl9Var = new hl9((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.Z$0 = false;
            this.label = 1;
            obj = l26Var.z(hl9Var, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
            z = false;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            jzb.q(obj);
        }
        long j = ((hl9) obj).a;
        return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ff2) k((xn2) obj2, Float.valueOf(((Number) obj).floatValue()))).r(wef.a);
    }
}
