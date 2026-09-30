package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ybb extends gbe implements a26 {
    int label;

    @Override // defpackage.a26
    public final Object d(Object obj) {
        new ybb(1, (xn2) obj).r(wef.a);
        return Boolean.TRUE;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label == 0) {
            jzb.q(obj);
            return Boolean.TRUE;
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
