package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wk4 extends gbe implements l26 {
    final /* synthetic */ mmb $event;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ yk4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk4(mmb mmbVar, yk4 yk4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$event = mmbVar;
        this.this$0 = yk4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        wk4 wk4Var = new wk4(this.$event, this.this$0, xn2Var);
        wk4Var.L$0 = obj;
        return wk4Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004f -> B:24:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0055 -> B:26:0x0056). Please report as a decompilation issue!!! */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        a26 a26Var;
        Object obj2;
        mmb mmbVar;
        xj4 xj4Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            a26Var = (a26) this.L$0;
            obj2 = this.$event.element;
            if (!(obj2 instanceof wj4) || (obj2 instanceof tj4)) {
                return wef.a;
            }
            uj4 uj4Var = obj2 instanceof uj4 ? (uj4) obj2 : null;
            if (uj4Var != null) {
                a26Var.d(uj4Var);
            }
            mmbVar = this.$event;
            r41 r41Var = this.this$0.J0;
            if (r41Var != null) {
                this.L$0 = a26Var;
                this.L$1 = mmbVar;
                this.label = 1;
                obj = r41Var.m(this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                xj4Var = null;
            }
            mmbVar.element = xj4Var;
            obj2 = this.$event.element;
            if (obj2 instanceof wj4) {
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mmbVar = (mmb) this.L$1;
        a26Var = (a26) this.L$0;
        jzb.q(obj);
        xj4Var = (xj4) obj;
        mmbVar.element = xj4Var;
        obj2 = this.$event.element;
        if (obj2 instanceof wj4) {
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wk4) k((xn2) obj2, (a26) obj)).r(wef.a);
    }
}
