package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lkb implements wm2 {
    public final /* synthetic */ int a = 1;
    public final lx b;
    public final boolean c;
    public final sx d;
    public final Object e;

    public lkb(String str, lx lxVar, lx lxVar2, qx qxVar, boolean z) {
        this.b = lxVar;
        this.d = lxVar2;
        this.e = qxVar;
        this.c = z;
    }

    @Override // defpackage.wm2
    public final zl2 a(oi8 oi8Var, uh8 uh8Var, eu0 eu0Var) {
        switch (this.a) {
            case 0:
                return new kkb(oi8Var, eu0Var, this);
            default:
                return new trb(oi8Var, eu0Var, this);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "RectangleShape{position=" + this.d + ", size=" + ((sx) this.e) + '}';
            default:
                return super.toString();
        }
    }

    public lkb(String str, sx sxVar, kx kxVar, lx lxVar, boolean z) {
        this.d = sxVar;
        this.e = kxVar;
        this.b = lxVar;
        this.c = z;
    }
}
