package defpackage;

import ai.askquin.R;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n7g {
    public m7g a;

    public n7g(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new l7g(oo.b(i, interpolator, j));
        } else {
            this.a = new j7g(i, interpolator, j);
        }
    }

    public static void a(View view, h72 h72Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            l7g.h(view, h72Var);
            return;
        }
        PathInterpolator pathInterpolator = j7g.e;
        View.OnApplyWindowInsetsListener i7gVar = h72Var != null ? new i7g(view, h72Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, i7gVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(i7gVar);
        }
    }
}
