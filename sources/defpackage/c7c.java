package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c7c implements zt0, zl2 {
    public final oi8 a;
    public final du0 b;
    public z4d c;

    public c7c(oi8 oi8Var, eu0 eu0Var, b7c b7cVar) {
        this.a = oi8Var;
        du0 du0VarC0 = b7cVar.a.c0();
        this.b = du0VarC0;
        eu0Var.d(du0VarC0);
        du0VarC0.a(this);
    }

    public static int d(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.zt0
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.zl2
    public final void b(List list, List list2) {
    }
}
