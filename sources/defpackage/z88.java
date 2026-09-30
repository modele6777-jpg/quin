package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z88 implements AccessibilityManager.AccessibilityStateChangeListener, h0e {
    public final boolean a;
    public final boolean b;
    public final vz9 c = q1c.f(Boolean.FALSE);
    public final x88 d;
    public final w88 e;

    public z88(boolean z, boolean z2, boolean z3) {
        this.a = z2;
        this.b = z3;
        w88 w88Var = null;
        this.d = z ? new x88() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            w88Var = new w88(this);
        }
        this.e = w88Var;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && v4e.F(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && v4e.F(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public final void f(AccessibilityManager accessibilityManager) {
        w88 w88Var;
        this.c.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
        accessibilityManager.addAccessibilityStateChangeListener(this);
        x88 x88Var = this.d;
        if (x88Var != null) {
            x88Var.a.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
            accessibilityManager.addTouchExplorationStateChangeListener(x88Var);
        }
        if (Build.VERSION.SDK_INT < 33 || (w88Var = this.e) == null) {
            return;
        }
        w88Var.a.setValue(Boolean.valueOf(c(accessibilityManager)));
        w88Var.b.setValue(Boolean.valueOf(d(accessibilityManager)));
        accessibilityManager.addAccessibilityServicesStateChangeListener(w88Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    @Override // defpackage.h0e
    public final Object getValue() {
        boolean z;
        if (((Boolean) this.c.getValue()).booleanValue()) {
            z = true;
            x88 x88Var = this.d;
            if (x88Var == null || !((Boolean) x88Var.a.getValue()).booleanValue()) {
                boolean z2 = this.a;
                w88 w88Var = this.e;
                if ((!z2 || w88Var == null || !((Boolean) w88Var.a.getValue()).booleanValue()) && (!this.b || w88Var == null || !((Boolean) w88Var.b.getValue()).booleanValue())) {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void h(AccessibilityManager accessibilityManager) {
        w88 w88Var;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        x88 x88Var = this.d;
        if (x88Var != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(x88Var);
        }
        if (Build.VERSION.SDK_INT < 33 || (w88Var = this.e) == null) {
            return;
        }
        accessibilityManager.removeAccessibilityServicesStateChangeListener(w88Var);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }
}
