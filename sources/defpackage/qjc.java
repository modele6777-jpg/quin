package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qjc implements PointerInputEventHandler {
    public final /* synthetic */ aw2 a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ e89 c;
    public final /* synthetic */ n69 d;
    public final /* synthetic */ n69 e;
    public final /* synthetic */ e89 f;
    public final /* synthetic */ jx g;

    public qjc(aw2 aw2Var, e89 e89Var, e89 e89Var2, n69 n69Var, n69 n69Var2, e89 e89Var3, jx jxVar) {
        this.a = aw2Var;
        this.b = e89Var;
        this.c = e89Var2;
        this.d = n69Var;
        this.e = n69Var2;
        this.f = e89Var3;
        this.g = jxVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        Object objS = k99.s(tiaVar, new o2f(false, new ojc(this.a, this.b, this.c, this.d, this.e, this.f, this.g), null), xn2Var);
        return objS == bw2.a ? objS : wef.a;
    }
}
