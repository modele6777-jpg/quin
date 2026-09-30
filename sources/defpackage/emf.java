package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class emf extends gbe implements a26 {
    int label;

    @Override // defpackage.a26
    public final Object d(Object obj) {
        emf emfVar = new emf(1, (xn2) obj);
        wef wefVar = wef.a;
        emfVar.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label == 0) {
            jzb.q(obj);
            return wef.a;
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
