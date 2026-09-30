package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lcd implements ta4 {
    public final ncd a;
    public final long b;
    public final Object c;
    public final pl1 d;

    public lcd(ncd ncdVar, long j, Object obj, pl1 pl1Var) {
        this.a = ncdVar;
        this.b = j;
        this.c = obj;
        this.d = pl1Var;
    }

    @Override // defpackage.ta4
    public final void a() {
        ncd ncdVar = this.a;
        synchronized (ncdVar) {
            if (this.b >= ncdVar.r()) {
                Object[] objArr = ncdVar.v;
                objArr.getClass();
                long j = this.b;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    ocd.d(objArr, j, ocd.a);
                    ncdVar.m();
                }
            }
        }
    }
}
