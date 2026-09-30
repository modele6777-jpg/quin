package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ln9 extends h36 implements n26 {
    public static final ln9 a = new ln9(3, mn9.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        mn9 mn9Var = (mn9) obj;
        ytc ytcVar = (ytc) obj2;
        long j = mn9Var.a;
        wef wefVar = wef.a;
        if (j <= 0) {
            ytcVar.e = wefVar;
            return wefVar;
        }
        xu8 xu8Var = new xu8(4, ytcVar, mn9Var);
        ytcVar.getClass();
        pv2 pv2Var = ytcVar.a;
        ytcVar.c = vfh.u(pv2Var).R(j, xu8Var, pv2Var);
        return wefVar;
    }
}
