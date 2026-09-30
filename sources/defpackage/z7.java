package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z7 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf3 b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ z7(wf3 wf3Var, a26 a26Var, int i) {
        this.a = i;
        this.b = wf3Var;
        this.c = a26Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        a26 a26Var = this.c;
        wf3 wf3Var = this.b;
        switch (i) {
            case 0:
                Long lB = ((xf3) wf3Var).b();
                if (lB != null) {
                    long jLongValue = lB.longValue();
                    th5 th5Var = cye.b;
                    th5Var.getClass();
                    w57 w57Var = w57.a;
                    a26Var.d(gcc.c(gcc.E(mh3.x(jLongValue), th5Var).a(), th5Var).toString());
                }
                break;
            default:
                Long lB2 = ((xf3) wf3Var).b();
                if (lB2 != null) {
                    long jLongValue2 = lB2.longValue();
                    th5 th5Var2 = cye.b;
                    th5Var2.getClass();
                    w57 w57Var2 = w57.a;
                    a26Var.d(gcc.E(mh3.x(jLongValue2), th5Var2).a());
                }
                break;
        }
        return wefVar;
    }
}
