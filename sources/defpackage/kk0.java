package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kk0 extends gbe implements l26 {
    final /* synthetic */ mk0 $mode;
    int label;
    final /* synthetic */ lk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk0(lk0 lk0Var, mk0 mk0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = lk0Var;
        this.$mode = mk0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kk0(this.this$0, this.$mode, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Iterator it = this.this$0.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ik0) it.next()).a(this.$mode.a);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        kk0 kk0Var = (kk0) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        kk0Var.r(wefVar);
        return wefVar;
    }
}
