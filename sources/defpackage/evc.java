package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class evc implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ qne b;

    public /* synthetic */ evc(qne qneVar, int i) {
        this.a = i;
        this.b = qneVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        qne qneVar = this.b;
        switch (i) {
            case 0:
                Object objW = xo1.w(tiaVar, qneVar, xn2Var);
                return objW == bw2Var ? objW : wefVar;
            default:
                Object objW2 = xo1.w(tiaVar, qneVar, xn2Var);
                return objW2 == bw2Var ? objW2 : wefVar;
        }
    }
}
