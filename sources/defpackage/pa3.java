package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pa3 extends gbe implements o26 {
    int label;

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label == 0) {
            jzb.q(obj);
            return wef.a;
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj2).getClass();
        ((Boolean) obj3).getClass();
        pa3 pa3Var = new pa3(4, (xn2) obj4);
        wef wefVar = wef.a;
        pa3Var.r(wefVar);
        return wefVar;
    }
}
