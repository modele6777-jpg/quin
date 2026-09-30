package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vxb extends gbe implements l26 {
    final /* synthetic */ mmb $bitmap;
    final /* synthetic */ int $resourceId;
    final /* synthetic */ Resources $resources;
    final /* synthetic */ int $sampleSize;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(mmb mmbVar, Resources resources, int i, int i2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$bitmap = mmbVar;
        this.$resources = resources;
        this.$resourceId = i;
        this.$sampleSize = i2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vxb(this.$bitmap, this.$resources, this.$resourceId, this.$sampleSize, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Bitmap bitmapDecodeResource = null;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        mmb mmbVar = this.$bitmap;
        try {
            Resources resources = this.$resources;
            int i = this.$resourceId;
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i2 = this.$sampleSize;
            options.inSampleSize = i2;
            if (i2 > 1) {
                options.inScaled = false;
            }
            bitmapDecodeResource = BitmapFactory.decodeResource(resources, i, options);
        } catch (Exception unused) {
        }
        mmbVar.element = bitmapDecodeResource;
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        vxb vxbVar = (vxb) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        vxbVar.r(wefVar);
        return wefVar;
    }
}
