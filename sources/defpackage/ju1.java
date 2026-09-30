package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ju1 implements PointerInputEventHandler {
    public final /* synthetic */ float a;
    public final /* synthetic */ nu1 b;
    public final /* synthetic */ gh6 c;
    public final /* synthetic */ e89 d;
    public final /* synthetic */ tt1 e;
    public final /* synthetic */ x16 f;
    public final /* synthetic */ n69 g;

    public ju1(float f, nu1 nu1Var, gh6 gh6Var, e89 e89Var, tt1 tt1Var, x16 x16Var, n69 n69Var) {
        this.a = f;
        this.b = nu1Var;
        this.c = gh6Var;
        this.d = e89Var;
        this.e = tt1Var;
        this.f = x16Var;
        this.g = n69Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        float f = this.a;
        nu1 nu1Var = this.b;
        gh6 gh6Var = this.c;
        e89 e89Var = this.d;
        tt1 tt1Var = this.e;
        x16 x16Var = this.f;
        n69 n69Var = this.g;
        return rk4.j(tiaVar, null, new gu1(f, nu1Var, gh6Var, e89Var, tt1Var, x16Var, n69Var), new hu1(n69Var, 0), new iu1(n69Var, 0), xn2Var, 1);
    }
}
