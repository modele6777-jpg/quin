package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mu1 implements PointerInputEventHandler {
    public final /* synthetic */ float a;
    public final /* synthetic */ er1 b;
    public final /* synthetic */ aw2 c;
    public final /* synthetic */ n69 d;
    public final /* synthetic */ nu1 e;
    public final /* synthetic */ n69 f;
    public final /* synthetic */ gh6 g;
    public final /* synthetic */ jx h;

    public mu1(float f, er1 er1Var, aw2 aw2Var, n69 n69Var, nu1 nu1Var, n69 n69Var2, gh6 gh6Var, jx jxVar) {
        this.a = f;
        this.b = er1Var;
        this.c = aw2Var;
        this.d = n69Var;
        this.e = nu1Var;
        this.f = n69Var2;
        this.g = gh6Var;
        this.h = jxVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        final float f = this.a;
        final er1 er1Var = this.b;
        final aw2 aw2Var = this.c;
        final n69 n69Var = this.d;
        final nu1 nu1Var = this.e;
        final n69 n69Var2 = this.f;
        final gh6 gh6Var = this.g;
        final jx jxVar = this.h;
        return rk4.i(tiaVar, null, new x16() { // from class: ku1
            @Override // defpackage.x16
            public final Object invoke() {
                qz9 qz9Var = (qz9) n69Var;
                if (Math.abs(qz9Var.j()) > f) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("playcard_gesture"), new au1(nu1Var, 1), 2);
                    float f2 = qz9Var.j() > 0.0f ? 1.0f : -1.0f;
                    ((qz9) n69Var2).k(f2);
                    er1 er1Var2 = er1Var;
                    float f3 = (f2 * 180.0f) + er1Var2.a;
                    er1Var2.a = f3;
                    ynb.V(aw2Var, null, null, new lu1(gh6Var, jxVar, f3, er1Var2, null), 3);
                }
                qz9Var.k(0.0f);
                return wef.a;
            }
        }, new hu1(n69Var, 1), new iu1(n69Var, 1), xn2Var, 1);
    }
}
