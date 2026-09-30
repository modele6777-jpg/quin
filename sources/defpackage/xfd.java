package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xfd implements PointerInputEventHandler {
    public final /* synthetic */ egd a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ x16 c;

    public xfd(egd egdVar, x16 x16Var, x16 x16Var2) {
        this.a = egdVar;
        this.b = x16Var;
        this.c = x16Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        egd egdVar = this.a;
        if (egdVar.a() != hgd.e || egdVar.b()) {
            return wef.a;
        }
        imb imbVar = new imb();
        lmb lmbVar = new lmb();
        lmbVar.element = 0L;
        return rk4.h(tiaVar, new h6b(22, imbVar, lmbVar), new v74(9), new v74(10), new iq1(lmbVar, imbVar, egdVar, tiaVar, this.b, this.c, 10), xn2Var);
    }
}
