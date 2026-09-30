package defpackage;

import android.app.Notification;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.TextAttribute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gq {
    public static boolean a(TextAttribute textAttribute) {
        return textAttribute.isTextSuggestionSelected();
    }

    public static void b(Notification.Action.Builder builder) {
        builder.setEmphasisHint(0);
    }

    public static final void c(ywc ywcVar, AccessibilityEvent accessibilityEvent) {
        twc twcVar = ywcVar.d;
        Object objG = twcVar.a.g(cxc.M);
        if (objG == null) {
            objG = null;
        }
        t47 t47Var = (t47) objG;
        Object objG2 = twcVar.a.g(cxc.I);
        int i = ((eue) (objG2 != null ? objG2 : null)) != null ? 1 : 0;
        if (t47Var != null && t47Var.b) {
            i |= 4;
        }
        if (t47Var != null && t47Var.a) {
            i |= 2;
        }
        accessibilityEvent.setTextChangeTypes(i | accessibilityEvent.getTextChangeTypes());
    }

    public static void d(Notification.Action.Builder builder) {
        builder.setStyleHint(0);
    }
}
