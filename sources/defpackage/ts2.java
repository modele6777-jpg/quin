package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ts2 extends gbe implements l26 {
    final /* synthetic */ r0 $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts2(r0 r0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$vm = r0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ts2(this.$vm, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        String strU = this.$vm.U();
        r0 r0Var = this.$vm;
        if (strU != null) {
            r0.l(r0Var, strU, null, 2);
        } else if (!((Boolean) r0Var.J0.getValue()).booleanValue()) {
            ConcurrentHashMap concurrentHashMap = xfb.a;
            String str = r0Var.I0;
            str.getClass();
            xfb.a.remove(str);
            xfb.b.remove(str);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ts2 ts2Var = (ts2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ts2Var.r(wefVar);
        return wefVar;
    }
}
