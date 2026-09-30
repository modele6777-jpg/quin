package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u42 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public u42(iu8 iu8Var, e89 e89Var) {
        this.a = 2;
        this.c = iu8Var;
        this.b = e89Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object objE = ffe.e(tiaVar, null, null, null, new yx1((e89) obj2, (a26) obj, 4), xn2Var, 7);
                return objE == bw2Var ? objE : wefVar;
            case 1:
                Object objO = jgb.O(new bv2(tiaVar, (qne) obj2, (cre) obj, null), xn2Var);
                return objO == bw2Var ? objO : wefVar;
            case 2:
                return k99.s(tiaVar, new fu8((iu8) obj, (e89) obj2, null), xn2Var);
            case 3:
                return ffe.e(tiaVar, new p9(29, (x16) obj2), null, null, new lnc(0, (x16) obj), xn2Var, 6);
            case 4:
                Object objS = k99.s(tiaVar, new dwc((fwc) obj2, (yuc) obj, null), xn2Var);
                return objS == bw2Var ? objS : wefVar;
            default:
                obe obeVar = (obe) tiaVar;
                obeVar.getClass();
                return k99.s(tiaVar, new zfd((egd) obj2, vd0.s0(obeVar).Q0.b(), (x16) obj, null), xn2Var);
        }
    }

    public /* synthetic */ u42(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
