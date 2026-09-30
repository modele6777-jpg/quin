package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dk0 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ gk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk0(gk0 gk0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = gk0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        dk0 dk0Var = new dk0(this.this$0, xn2Var);
        dk0Var.L$0 = obj;
        return dk0Var;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        bk0 bk0Var = bk0.b;
        if (i == 0) {
            jzb.q(obj);
            goa goaVar = this.this$0.w;
            if (goaVar != null) {
                goaVar.d(new Integer(0));
            }
            if (jgb.Y(aw2Var) || this.this$0.b != bk0Var) {
                return wef.a;
            }
            this.L$0 = aw2Var;
            this.label = 1;
            Object objQ = vfh.q(1000L, this);
            bw2 bw2Var = bw2.a;
            if (objQ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        gk0 gk0Var = this.this$0;
        if (gk0Var.b == bk0Var) {
            int i2 = gk0Var.c + 1;
            gk0Var.c = i2;
            goa goaVar2 = gk0Var.w;
            if (goaVar2 != null) {
                goaVar2.d(new Integer(i2));
            }
            gk0 gk0Var2 = this.this$0;
            if (gk0Var2.c >= 60) {
                gk0Var2.f();
                coa coaVar = this.this$0.y;
                if (coaVar != null) {
                    coaVar.invoke();
                }
            }
        }
        if (jgb.Y(aw2Var)) {
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dk0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
