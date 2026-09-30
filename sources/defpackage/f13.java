package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f13 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g13 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f13(g13 g13Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = g13Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        f13 f13Var = new f13(this.this$0, xn2Var);
        f13Var.L$0 = obj;
        return f13Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        boolean z;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        aw2 aw2Var = (aw2) this.L$0;
        dg7 dg7Var = (dg7) this.this$0.b.getAndSet(null);
        g13 g13Var = this.this$0;
        AtomicReference atomicReference = g13Var.b;
        lyd lydVarV = ynb.V(aw2Var, null, null, new e13(dg7Var, g13Var, null), 3);
        while (!atomicReference.compareAndSet(null, lydVarV)) {
            if (atomicReference.get() != null) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((f13) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
