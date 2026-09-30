package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uw3 implements tw3, w8g {
    public static final uw3 a = new uw3();
    public static final uw3 b = new uw3();

    @Override // defpackage.tw3
    public float b(Context context) {
        context.getClass();
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.w8g
    public s8g j(Activity activity, tw3 tw3Var) {
        n21.i.getClass();
        return new s8g(new h21(m21.a().i(activity)), tw3Var.b(activity));
    }

    @Override // defpackage.w8g
    public s8g r(Context context, tw3 tw3Var) {
        context.getClass();
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new s8g(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
