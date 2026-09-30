package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cl4 extends gbe implements l26 {
    final /* synthetic */ e89 $isDragged;
    final /* synthetic */ m77 $this_collectIsDraggedAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl4(m77 m77Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_collectIsDraggedAsState = m77Var;
        this.$isDragged = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new cl4(this.$this_collectIsDraggedAsState, this.$isDragged, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wef.a;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ArrayList arrayList = new ArrayList();
        ncd ncdVar = ((u69) this.$this_collectIsDraggedAsState).a;
        ij4 ij4Var = new ij4(arrayList, this.$isDragged, 1);
        this.label = 1;
        ncdVar.b(ij4Var, this);
        return bw2.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cl4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
