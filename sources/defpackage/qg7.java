package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qg7 extends h36 implements n26 {
    public static final qg7 a = new qg7(3, rg7.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        Object objK;
        wef wefVar;
        rg7 rg7Var = (rg7) obj;
        ytc ytcVar = (ytc) obj2;
        int i = rg7.c;
        do {
            objK = rg7Var.K();
            boolean z = objK instanceof x07;
            wefVar = wef.a;
            if (!z) {
                ytcVar.e = wefVar;
                return wefVar;
            }
        } while (rg7Var.c0(objK) < 0);
        ytcVar.c = tq.E(rg7Var, true, new ng7(rg7Var, ytcVar));
        return wefVar;
    }
}
