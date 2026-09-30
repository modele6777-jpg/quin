package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class umd extends gbe implements l26 {
    int label;
    final /* synthetic */ and this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umd(and andVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = andVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new umd(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                and andVar = this.this$0;
                this.label = 1;
                obj = andVar.i(this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            yof yofVar = (yof) obj;
            and andVar2 = this.this$0;
            if (andVar2.Z0) {
                andVar2.C(yofVar);
            } else {
                andVar2.u(yofVar, andVar2.Y0);
            }
            this.this$0.X0.setValue(Boolean.FALSE);
            return wef.a;
        } catch (Throwable th) {
            and andVar3 = this.this$0;
            int i2 = and.q1;
            andVar3.X0.setValue(Boolean.FALSE);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((umd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
