package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ut5 extends gbe implements l26 {
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ut5 ut5Var = new ut5(2, xn2Var);
        ut5Var.Z$0 = ((Boolean) obj).booleanValue();
        return ut5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        boolean z = this.Z$0;
        if (this.label == 0) {
            jzb.q(obj);
            return Boolean.valueOf(z);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ut5) k((xn2) obj2, bool)).r(wef.a);
    }
}
