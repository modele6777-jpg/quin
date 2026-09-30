package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o21 implements n21, w8g {
    public static final o21 a = new o21();
    public static final o21 b = new o21();

    @Override // defpackage.n21
    public Rect i(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // defpackage.w8g
    public s8g j(Activity activity, tw3 tw3Var) {
        n21.i.getClass();
        return new s8g(new h21(m21.a().i(activity)), tw3Var.b(activity));
    }

    @Override // defpackage.w8g
    public s8g r(Context context, tw3 tw3Var) {
        context.getClass();
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new s8g(bounds, f);
    }
}
