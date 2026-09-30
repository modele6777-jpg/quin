package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xh9 {
    public static final AtomicReference a = new AtomicReference(wh9.NotDetermined);

    public static wh9 a() {
        Object obj = a.get();
        obj.getClass();
        return (wh9) obj;
    }

    public static wh9 b(Context context, String str, boolean z) {
        context.getClass();
        int i = Build.VERSION.SDK_INT;
        wh9 wh9Var = wh9.Authorized;
        AtomicReference atomicReference = a;
        if (i < 33) {
            atomicReference.set(wh9Var);
            return wh9Var;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("notification_permission_state", 0);
        if (str != null && pa7.t(sharedPreferences.getString("last_system_dialog_occurrence", null), str)) {
            return d(context);
        }
        if (z) {
            SharedPreferences.Editor editorRemove = context.getSharedPreferences("notification_permission_state", 0).edit().putBoolean("decision_recorded", true).remove("explicit_denial").remove("ambiguous_denial").remove("requested");
            if (str != null) {
                editorRemove.putString("last_system_dialog_occurrence", str);
            }
            editorRemove.apply();
            atomicReference.set(wh9Var);
            return wh9Var;
        }
        vb2 vb2VarH = kn2.H(context);
        boolean z2 = (vb2VarH != null ? rd.a0(vb2VarH) : false) || sharedPreferences.getBoolean("ambiguous_denial", false) || sharedPreferences.getBoolean("decision_recorded", false);
        wh9 wh9Var2 = z2 ? wh9.Denied : wh9.NotDetermined;
        SharedPreferences.Editor editorRemove2 = sharedPreferences.edit().putBoolean("decision_recorded", z2).putBoolean("explicit_denial", z2).putBoolean("ambiguous_denial", !z2).remove("requested");
        if (str != null) {
            editorRemove2.putString("last_system_dialog_occurrence", str);
        }
        editorRemove2.apply();
        atomicReference.set(wh9Var2);
        return wh9Var2;
    }

    public static wh9 c(Context context) {
        context.getClass();
        int i = Build.VERSION.SDK_INT;
        wh9 wh9Var = wh9.Authorized;
        AtomicReference atomicReference = a;
        if (i < 33) {
            atomicReference.set(wh9Var);
            return wh9Var;
        }
        boolean zAreNotificationsEnabled = new nh9(context).b.areNotificationsEnabled();
        context.getSharedPreferences("notification_permission_state", 0).edit().putBoolean("decision_recorded", true).putBoolean("explicit_denial", !zAreNotificationsEnabled).remove("ambiguous_denial").remove("requested").apply();
        if (!zAreNotificationsEnabled) {
            wh9Var = wh9.Denied;
        }
        atomicReference.set(wh9Var);
        return wh9Var;
    }

    public static wh9 d(Context context) {
        context.getClass();
        boolean zAreNotificationsEnabled = new nh9(context).b.areNotificationsEnabled();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && zAreNotificationsEnabled) {
            context.getSharedPreferences("notification_permission_state", 0).edit().putBoolean("decision_recorded", true).remove("explicit_denial").remove("ambiguous_denial").remove("requested").apply();
        }
        boolean zE = e(context);
        wh9 wh9Var = wh9.Authorized;
        if (i >= 33 && !zAreNotificationsEnabled) {
            wh9Var = zE ? wh9.Denied : wh9.NotDetermined;
        }
        a.set(wh9Var);
        return wh9Var;
    }

    public static boolean e(Context context) {
        boolean z;
        context.getClass();
        if (!context.getSharedPreferences("notification_permission_state", 0).getBoolean("decision_recorded", false)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("notification_permission_state", 0);
            if (sharedPreferences.getBoolean("explicit_denial", false)) {
                z = true;
            } else {
                vb2 vb2VarH = kn2.H(context);
                z = vb2VarH != null && rd.a0(vb2VarH);
                if (z) {
                    sharedPreferences.edit().putBoolean("decision_recorded", true).putBoolean("explicit_denial", true).apply();
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
