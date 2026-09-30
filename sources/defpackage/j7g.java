package defpackage;

import ai.askquin.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j7g extends m7g {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final pa5 f = new pa5(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, n7g n7gVar) {
        h72 h72VarJ = j(view);
        if (h72VarJ != null) {
            h72VarJ.d(n7gVar);
            if (h72VarJ.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), n7gVar);
            }
        }
    }

    public static void g(View view, n7g n7gVar, h8g h8gVar, boolean z) {
        h72 h72VarJ = j(view);
        if (h72VarJ != null) {
            h72VarJ.b = h8gVar;
            if (!z) {
                h72VarJ.e(n7gVar);
                z = h72VarJ.a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), n7gVar, h8gVar, z);
            }
        }
    }

    public static void h(View view, h8g h8gVar, List list) {
        h72 h72VarJ = j(view);
        if (h72VarJ != null) {
            h8gVar = h72VarJ.f(h8gVar, list);
            if (h72VarJ.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), h8gVar, list);
            }
        }
    }

    public static void i(View view, n7g n7gVar, lqb lqbVar) {
        h72 h72VarJ = j(view);
        if (h72VarJ != null) {
            h72VarJ.g(n7gVar, lqbVar);
            if (h72VarJ.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), n7gVar, lqbVar);
            }
        }
    }

    public static h72 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof i7g) {
            return ((i7g) tag).a;
        }
        return null;
    }
}
