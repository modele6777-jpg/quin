package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ni1 extends gbe implements l26 {
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni1(Uri uri, xn2 xn2Var) {
        super(2, xn2Var);
        this.$uri = uri;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ni1(this.$uri, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws IOException {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        InputStream inputStreamOpenInputStream = cn1.z().getContentResolver().openInputStream(this.$uri);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream.close();
        }
        if (bitmapDecodeStream != null) {
            return ndb.g(xo1.u(bitmapDecodeStream, bitmapDecodeStream.getWidth() > bitmapDecodeStream.getHeight() ? 1.5135136f : 0.66071427f));
        }
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ni1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
