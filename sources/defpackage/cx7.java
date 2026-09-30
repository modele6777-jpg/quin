package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cx7 {
    public final /* synthetic */ int a;
    public final sz9 b;
    public final sz9 c;
    public boolean d;
    public Object e;
    public final wz7 f;

    public cx7(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new sz9(i);
                this.c = new sz9(i2);
                this.f = new wz7(i, 30, 100);
                break;
            default:
                this.b = new sz9(i);
                this.c = new sz9(i2);
                this.f = new wz7(i, 90, 200);
                break;
        }
    }

    public final void a(int i, int i2) {
        int i3 = this.a;
        sz9 sz9Var = this.c;
        wz7 wz7Var = this.f;
        sz9 sz9Var2 = this.b;
        switch (i3) {
            case 0:
                if (i < 0.0f) {
                    l37.a("Index should be non-negative");
                }
                sz9Var2.k(i);
                wz7Var.c(i);
                sz9Var.k(i2);
                break;
            default:
                if (i < 0.0f) {
                    l37.a("Index should be non-negative (" + i + ")");
                }
                sz9Var2.k(i);
                wz7Var.c(i);
                sz9Var.k(i2);
                break;
        }
    }
}
