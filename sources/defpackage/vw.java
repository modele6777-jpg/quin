package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vw implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uvf b;

    public /* synthetic */ vw(uvf uvfVar, int i) {
        this.a = i;
        this.b = uvfVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        uvf uvfVar = this.b;
        switch (i) {
            case 0:
                ax.m(uvfVar);
                return wefVar;
            case 1:
                uvfVar.R0.P();
                return wefVar;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                uvfVar.T0.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                uvf.n(uvfVar);
                return wefVar;
            case 4:
                uvfVar.X0.d(uvfVar.T0);
                return wefVar;
            default:
                uvfVar.W0.d(uvfVar.T0);
                return wefVar;
        }
    }
}
