package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.canhub.cropper.CropImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kz0 implements aw2 {
    public final Context a;
    public final Uri b;
    public final int c;
    public final int d;
    public final WeakReference e;
    public rg7 f = tq.d();

    public kz0(Context context, CropImageView cropImageView, Uri uri) {
        this.a = context;
        this.b = uri;
        this.e = new WeakReference(cropImageView);
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        double d = f > 1.0f ? 1.0d / ((double) f) : 1.0d;
        this.c = (int) (((double) displayMetrics.widthPixels) * d);
        this.d = (int) (((double) displayMetrics.heightPixels) * d);
    }

    @Override // defpackage.aw2
    public final pv2 getCoroutineContext() {
        js3 js3Var = ga4.a;
        wg6 wg6Var = mk8.a;
        rg7 rg7Var = this.f;
        wg6Var.getClass();
        return i7h.I(wg6Var, rg7Var);
    }
}
