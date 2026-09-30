package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l1e implements mm3 {
    public final /* synthetic */ int a;
    public final Object b;

    public l1e() {
        this.a = 1;
        this.b = rbe.d;
    }

    @Override // defpackage.mm3
    public final nm3 a(otd otdVar, as9 as9Var) {
        ImageDecoder.Source sourceW;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bitmap.Config configA = yw6.a(as9Var);
                if ((configA == Bitmap.Config.ARGB_8888 || configA == Bitmap.Config.HARDWARE) && (sourceW = bp.W(otdVar.a, as9Var, false)) != null) {
                    return new n1e(sourceW, otdVar.a, as9Var, (nxc) obj);
                }
                return null;
            default:
                String str = otdVar.b;
                ax6 ax6Var = otdVar.a;
                if (!pa7.t(str, "image/svg+xml")) {
                    v41 v41VarP0 = ax6Var.P0();
                    if (!v41VarP0.I(0L, km3.b) || v41VarP0.f0(1024L, km3.a) == -1) {
                        return null;
                    }
                }
                return new rbe(ax6Var, as9Var, (a26) obj);
        }
    }

    public l1e(nxc nxcVar) {
        this.a = 0;
        this.b = nxcVar;
    }
}
