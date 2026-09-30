package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gi3 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ hi3 b;
    public final /* synthetic */ aw2 c;
    public final /* synthetic */ n69 d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ gh6 f;

    public gi3(boolean z, hi3 hi3Var, aw2 aw2Var, n69 n69Var, x16 x16Var, gh6 gh6Var) {
        this.a = z;
        this.b = hi3Var;
        this.c = aw2Var;
        this.d = n69Var;
        this.e = x16Var;
        this.f = gh6Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        if (this.a) {
            return wef.a;
        }
        return k99.s(tiaVar, new fi3(this.b, this.c, this.d, this.e, this.f, null), xn2Var);
    }
}
