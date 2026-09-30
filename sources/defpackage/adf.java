package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class adf implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j18 c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ s69 e;
    public final /* synthetic */ s69 f;

    public adf(boolean z, boolean z2, j18 j18Var, x16 x16Var, s69 s69Var, s69 s69Var2) {
        this.a = z;
        this.b = z2;
        this.c = j18Var;
        this.d = x16Var;
        this.e = s69Var;
        this.f = s69Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        if (!this.a) {
            return wef.a;
        }
        return ffe.e(tiaVar, new zcf(this.b, this.c, this.d, this.e, this.f), null, null, null, xn2Var, 14);
    }
}
