package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pb6 implements a26 {
    public final /* synthetic */ int a;
    public final a26 b;

    public /* synthetic */ pb6(a26 a26Var, int i) {
        this.a = i;
        this.b = a26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j;
        switch (this.a) {
            case 0:
                ord ordVar = (ord) obj;
                synchronized (qrd.c) {
                    j = qrd.e;
                    qrd.e = 1 + j;
                }
                return new vhb(j, ordVar, this.b);
            case 1:
                a26 a26Var = this.b;
                tt7 tt7Var = (tt7) obj;
                tt7Var.getClass();
                return a26Var.d(tt7Var).toString();
            default:
                return this.b.d(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
