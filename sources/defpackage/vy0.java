package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vy0 extends gbe implements l26 {
    final /* synthetic */ sz0 $bitmapSampled;
    final /* synthetic */ Bitmap $resizedBitmap;
    int label;
    final /* synthetic */ xy0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy0(xy0 xy0Var, Bitmap bitmap, sz0 sz0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = xy0Var;
        this.$resizedBitmap = bitmap;
        this.$bitmapSampled = sz0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vy0(this.this$0, this.$resizedBitmap, this.$bitmapSampled, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            Rect rect = vz0.a;
            xy0 xy0Var = this.this$0;
            Uri uriR = vz0.r(xy0Var.a, this.$resizedBitmap, xy0Var.F0, xy0Var.G0, xy0Var.H0);
            xy0 xy0Var2 = this.this$0;
            ty0 ty0Var = new ty0(this.$resizedBitmap, uriR, null, this.$bitmapSampled.b);
            this.label = 1;
            Object objA = xy0Var2.a(ty0Var, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((vy0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
