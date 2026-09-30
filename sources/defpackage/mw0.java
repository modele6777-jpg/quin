package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mw0 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0f b;

    public /* synthetic */ mw0(d0f d0fVar, int i) {
        this.a = i;
        this.b = d0fVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        d0f d0fVar = this.b;
        switch (i) {
            case 0:
                Object objO = jgb.O(new lw0(tiaVar, d0fVar, null), xn2Var);
                return objO == bw2Var ? objO : wefVar;
            default:
                Object objO2 = jgb.O(new pw0(tiaVar, d0fVar, null), xn2Var);
                return objO2 == bw2Var ? objO2 : wefVar;
        }
    }
}
