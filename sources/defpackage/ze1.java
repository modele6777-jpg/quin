package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ze1 extends gbe implements l26 {
    final /* synthetic */ pif $camera$inlined;
    final /* synthetic */ int $captureMode$inlined;
    final /* synthetic */ la1 $completer;
    final /* synthetic */ int $flashType$inlined;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ bf1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze1(la1 la1Var, xn2 xn2Var, pif pifVar, int i, bf1 bf1Var, int i2) {
        super(2, xn2Var);
        this.$completer = la1Var;
        this.$camera$inlined = pifVar;
        this.$captureMode$inlined = i;
        this.this$0 = bf1Var;
        this.$flashType$inlined = i2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ze1(this.$completer, xn2Var, this.$camera$inlined, this.$captureMode$inlined, this.this$0, this.$flashType$inlined);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        la1 la1Var;
        Object objC;
        pif pifVar;
        int i;
        la1 la1Var2;
        int i2 = this.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            la1Var = this.$completer;
            pif pifVar2 = this.$camera$inlined;
            int i3 = this.$captureMode$inlined;
            xi5 xi5Var = this.this$0.c;
            this.L$0 = la1Var;
            this.L$1 = pifVar2;
            this.I$0 = i3;
            this.label = 1;
            objC = xi5Var.c(this);
            if (objC != bw2Var) {
                pifVar = pifVar2;
                i = i3;
            }
            return bw2Var;
        }
        if (i2 == 1) {
            i = this.I$0;
            pif pifVar3 = (pif) this.L$1;
            la1 la1Var3 = (la1) this.L$0;
            jzb.q(obj);
            objC = obj;
            la1Var = la1Var3;
            pifVar = pifVar3;
        } else {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            la1Var2 = (la1) this.L$0;
            jzb.q(obj);
        }
        la1Var2.b(obj);
        return wef.a;
        int iIntValue = ((Number) objC).intValue();
        int i4 = this.$flashType$inlined;
        this.L$0 = la1Var;
        this.L$1 = null;
        this.label = 2;
        dn1 dn1VarA = ((pm1) ((xif) pifVar).k.getValue()).a(i, iIntValue, i4);
        if (dn1VarA != bw2Var) {
            la1 la1Var4 = la1Var;
            obj = dn1VarA;
            la1Var2 = la1Var4;
            la1Var2.b(obj);
            return wef.a;
        }
        return bw2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ze1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
