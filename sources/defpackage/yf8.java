package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yf8 extends gbe implements l26 {
    final /* synthetic */ qne $observer;
    final /* synthetic */ tia $this_detectDownAndDragGesturesWithObserver;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf8(tia tiaVar, qne qneVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_detectDownAndDragGesturesWithObserver = tiaVar;
        this.$observer = qneVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yf8(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        final int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        tia tiaVar = this.$this_detectDownAndDragGesturesWithObserver;
        final qne qneVar = this.$observer;
        this.label = 1;
        final int i3 = 0;
        Object objH = rk4.h(tiaVar, new uf8(qneVar, 0), new x16() { // from class: vf8
            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i3;
                wef wefVar2 = wef.a;
                qne qneVar2 = qneVar;
                switch (i4) {
                    case 0:
                        qneVar2.b();
                        break;
                    default:
                        qneVar2.onCancel();
                        break;
                }
                return wefVar2;
            }
        }, new x16() { // from class: vf8
            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i2;
                wef wefVar2 = wef.a;
                qne qneVar2 = qneVar;
                switch (i4) {
                    case 0:
                        qneVar2.b();
                        break;
                    default:
                        qneVar2.onCancel();
                        break;
                }
                return wefVar2;
            }
        }, new wf8(0, qneVar), this);
        bw2 bw2Var = bw2.a;
        if (objH != bw2Var) {
            objH = wefVar;
        }
        return objH == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((yf8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
