package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fo6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy9 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fo6(fy9 fy9Var, boolean z, int i) {
        this.a = i;
        this.b = fy9Var;
        this.c = z;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        boolean z = this.c;
        switch (i) {
            case 0:
                h81 h81Var = (h81) obj;
                h81Var.getClass();
                return h81Var.a(new fo6(this.b, z, 1));
            default:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                long jF = sn4Var.f();
                fy9 fy9Var = this.b;
                fy9.h(fy9Var, sn4Var, jF, 0.0f, 6);
                if (z) {
                    fy9.h(fy9Var, sn4Var, sn4Var.f(), 0.2f, 4);
                }
                return wef.a;
        }
    }
}
