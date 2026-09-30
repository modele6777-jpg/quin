package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sl4 extends gbe implements n26 {
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        long j = ((hl9) obj2).a;
        sl4 sl4Var = new sl4(3, (xn2) obj3);
        wef wefVar = wef.a;
        sl4Var.r(wefVar);
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
