package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class reb implements PointerInputEventHandler {
    public final /* synthetic */ phb a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ ufb c;
    public final /* synthetic */ qwc d;
    public final /* synthetic */ e89 e;
    public final /* synthetic */ e89 f;

    public reb(phb phbVar, e89 e89Var, ufb ufbVar, qwc qwcVar, e89 e89Var2, e89 e89Var3) {
        this.a = phbVar;
        this.b = e89Var;
        this.c = ufbVar;
        this.d = qwcVar;
        this.e = e89Var2;
        this.f = e89Var3;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        return k99.s(tiaVar, new qeb(this.a, this.b, this.c, this.d, this.e, this.f, null), xn2Var);
    }
}
