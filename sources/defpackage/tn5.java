package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tn5 extends gbe implements l26 {
    final /* synthetic */ e89 $isFocused;
    final /* synthetic */ m77 $this_collectIsFocusedAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn5(m77 m77Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_collectIsFocusedAsState = m77Var;
        this.$isFocused = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tn5(this.$this_collectIsFocusedAsState, this.$isFocused, xn2Var);
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
        ncd ncdVar = ((u69) this.$this_collectIsFocusedAsState).a;
        ij4 ij4Var = new ij4(arrayList, this.$isFocused, 2);
        this.label = 1;
        ncdVar.b(ij4Var, this);
        return bw2.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tn5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
