package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fu1 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;

    public /* synthetic */ fu1(int i, x16 x16Var) {
        this.a = i;
        this.b = x16Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        int i = this.a;
        x16 x16Var = this.b;
        switch (i) {
            case 0:
                return ffe.e(tiaVar, null, null, null, new p9(7, x16Var), xn2Var, 7);
            case 1:
                return ffe.e(tiaVar, new p9(15, x16Var), null, null, null, xn2Var, 14);
            case 2:
                return ffe.e(tiaVar, new p9(20, x16Var), null, null, null, xn2Var, 14);
            default:
                Object objE = ffe.e(tiaVar, null, null, null, new p9(22, x16Var), xn2Var, 7);
                return objE == bw2.a ? objE : wef.a;
        }
    }
}
