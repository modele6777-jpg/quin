package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sr implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object objS = k99.s(tiaVar, new rr((tr) obj, null), xn2Var);
                return objS == bw2Var ? objS : wefVar;
            case 1:
                Object objO = jgb.O(new zz7(tiaVar, (yx9) obj, null), xn2Var);
                return objO == bw2Var ? objO : wefVar;
            case 2:
                Object objL1 = ((obe) tiaVar).l1(new eoa((soa) obj, null), xn2Var);
                return objL1 == bw2Var ? objL1 : wefVar;
            case 3:
                Object objL2 = ((obe) tiaVar).l1(new ovc(null, (a26) obj), xn2Var);
                return objL2 == bw2Var ? objL2 : wefVar;
            case 4:
                Object objV = db6.v(tiaVar, (v39) ((fwc) obj).L0.getValue(), null, xn2Var);
                return objV == bw2Var ? objV : wefVar;
            case 5:
                kwc kwcVar = (kwc) obj;
                Object objV2 = db6.v(tiaVar, kwcVar.K0, kwcVar.J0, xn2Var);
                return objV2 == bw2Var ? objV2 : wefVar;
            case 6:
                gpd gpdVar = (gpd) obj;
                Object objE = ffe.e(tiaVar, null, null, new dpd(gpdVar, null), new xod(gpdVar, 2), xn2Var, 3);
                return objE == bw2Var ? objE : wefVar;
            case 7:
                Object objS2 = k99.s(tiaVar, new e6e((f6e) obj, null), xn2Var);
                return objS2 == bw2Var ? objS2 : wefVar;
            case 8:
                Object objS3 = k99.s(tiaVar, new v4c(null, new vx7(1, (zme) obj, zme.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 29)), xn2Var);
                if (objS3 != bw2Var) {
                    objS3 = wefVar;
                }
                return objS3 == bw2Var ? objS3 : wefVar;
            case 9:
                Object objO2 = jgb.O(new woe((ape) obj, tiaVar, null), xn2Var);
                return objO2 == bw2Var ? objO2 : wefVar;
            default:
                cre creVar = (cre) obj;
                Object objV3 = db6.v(tiaVar, creVar.z, creVar.y, xn2Var);
                return objV3 == bw2Var ? objV3 : wefVar;
        }
    }
}
