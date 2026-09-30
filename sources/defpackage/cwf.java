package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cwf {
    public static void a(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
    }

    public static void b(View view, int i) {
        view.setOutlineSpotShadowColor(i);
    }

    public static boolean c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
