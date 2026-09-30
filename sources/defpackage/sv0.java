package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sv0 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ jse b;

    public /* synthetic */ sv0(jse jseVar, int i) {
        this.a = i;
        this.b = jseVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        int i = this.a;
        bw2 bw2Var = bw2.a;
        jse jseVar = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                Object objO = jgb.O(new sre(null, tiaVar, jseVar), xn2Var);
                if (objO != bw2Var) {
                    objO = wefVar;
                }
                return objO == bw2Var ? objO : wefVar;
            case 1:
                Object objO2 = jgb.O(new ese(null, tiaVar, jseVar, true), xn2Var);
                if (objO2 != bw2Var) {
                    objO2 = wefVar;
                }
                return objO2 == bw2Var ? objO2 : wefVar;
            default:
                Object objO3 = jgb.O(new ese(null, tiaVar, jseVar, false), xn2Var);
                if (objO3 != bw2Var) {
                    objO3 = wefVar;
                }
                return objO3 == bw2Var ? objO3 : wefVar;
        }
    }
}
