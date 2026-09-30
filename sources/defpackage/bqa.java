package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bqa extends gbe implements l26 {
    final /* synthetic */ l26 $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqa(l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$transform = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        bqa bqaVar = new bqa(this.$transform, xn2Var);
        bqaVar.L$0 = obj;
        return bqaVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            p79 p79Var = (p79) this.L$0;
            l26 l26Var = this.$transform;
            this.label = 1;
            obj = l26Var.z(p79Var, this);
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
        p79 p79Var2 = (p79) obj;
        p79Var2.getClass();
        ((AtomicBoolean) p79Var2.b.b).set(true);
        return p79Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bqa) k((xn2) obj2, (p79) obj)).r(wef.a);
    }
}
