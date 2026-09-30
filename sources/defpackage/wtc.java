package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wtc {
    public final Object a;
    public final n26 b;
    public final n26 c;
    public final Object d;
    public final gbe e;
    public final n26 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ ytc i;

    public wtc(ytc ytcVar, Object obj, n26 n26Var, n26 n26Var2, Object obj2, gbe gbeVar, n26 n26Var3) {
        this.i = ytcVar;
        this.a = obj;
        this.b = n26Var;
        this.c = n26Var2;
        this.d = obj2;
        this.e = gbeVar;
        this.f = n26Var3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof rtc) {
            ((rtc) obj).h(this.h, this.i.a);
            return;
        }
        ta4 ta4Var = obj instanceof ta4 ? (ta4) obj : null;
        if (ta4Var != null) {
            ta4Var.a();
        }
    }
}
