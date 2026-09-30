package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w88 implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final vz9 a;
    public final vz9 b;

    public w88(z88 z88Var) {
        Boolean bool = Boolean.FALSE;
        this.a = q1c.f(bool);
        this.b = q1c.f(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.a.setValue(Boolean.valueOf(z88.c(accessibilityManager)));
        this.b.setValue(Boolean.valueOf(z88.d(accessibilityManager)));
    }
}
