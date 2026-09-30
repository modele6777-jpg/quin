package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ev implements a26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ev(long j, x16 x16Var, boolean z) {
        this.b = j;
        this.d = x16Var;
        this.c = z;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        long j = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                h81 h81Var = (h81) obj;
                return h81Var.b(new xu((x16) obj2, this.c, i7h.q(h81Var, Float.intBitsToFloat((int) (h81Var.a.f() >> 32)) / 2.0f), new xz0(j, 5), 0));
            default:
                x4d x4dVar = (x4d) obj2;
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                z7f.D(sn4Var, x4dVar, j, this.c ? 1.0f : 0.5f);
                return wef.a;
        }
    }

    public /* synthetic */ ev(x4d x4dVar, long j, boolean z) {
        this.d = x4dVar;
        this.b = j;
        this.c = z;
    }
}
