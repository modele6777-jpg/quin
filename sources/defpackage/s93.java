package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s93 extends gbe implements l26 {
    final /* synthetic */ x16 $onExit;
    final /* synthetic */ String $segmentId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s93(String str, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$segmentId = str;
        this.$onExit = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new s93(this.$segmentId, this.$onExit, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ConcurrentHashMap concurrentHashMap = xfb.a;
        xfb.e(0, this.$segmentId, (6 & 2) != 0 ? null : "reading_done");
        this.$onExit.invoke();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        s93 s93Var = (s93) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        s93Var.r(wefVar);
        return wefVar;
    }
}
