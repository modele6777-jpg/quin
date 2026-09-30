package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rpb extends gbe implements l26 {
    final /* synthetic */ uh8 $composition;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $imageAssetsFolder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpb(uh8 uh8Var, Context context, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$composition = uh8Var;
        this.$context = context;
        this.$imageAssetsFolder = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rpb(this.$composition, this.$context, this.$imageAssetsFolder, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Bitmap bitmapDecodeStream;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        for (ri8 ri8Var : ((HashMap) this.$composition.c()).values()) {
            ri8Var.getClass();
            String str = ri8Var.d;
            if (ri8Var.f == null && c5e.C(str, "data:", false) && v4e.O(str, "base64,", 0, false, 6) > 0) {
                try {
                    byte[] bArrDecode = Base64.decode(str.substring(v4e.N(str, ',', 0, 6) + 1), 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    ri8Var.f = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                } catch (IllegalArgumentException e) {
                    gf8.c("data URL did not have correct base64 format.", e);
                }
            }
            Context context = this.$context;
            String str2 = this.$imageAssetsFolder;
            if (ri8Var.f == null && str2 != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str2 + str);
                    inputStreamOpen.getClass();
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options2);
                    } catch (IllegalArgumentException e2) {
                        gf8.c("Unable to decode image.", e2);
                        bitmapDecodeStream = null;
                    }
                    if (bitmapDecodeStream != null) {
                        ri8Var.f = xqf.d(bitmapDecodeStream, ri8Var.a, ri8Var.b);
                    }
                } catch (IOException e3) {
                    gf8.c("Unable to open asset.", e3);
                }
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        rpb rpbVar = (rpb) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        rpbVar.r(wefVar);
        return wefVar;
    }
}
