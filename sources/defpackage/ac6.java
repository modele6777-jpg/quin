package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ac6 extends bc6 {
    public static final Object d = new Object();
    public static final ac6 e = new ac6();
    public a97 c;

    public static AlertDialog d(Activity activity, int i, oig oigVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(fig.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(ai.askquin.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(ai.askquin.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(ai.askquin.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, oigVar);
        }
        String strA = fig.a(activity, i);
        if (strA != null) {
            builder.setTitle(strA);
        }
        b1.n("GoogleApiAvailability", tec.e(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof nx5) {
                zx5 zx5VarQ = ((nx5) activity).q();
                z8e z8eVar = new z8e();
                oa7.B(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                z8eVar.x1 = alertDialog;
                if (onCancelListener != null) {
                    z8eVar.y1 = onCancelListener;
                }
                z8eVar.u1 = false;
                z8eVar.v1 = true;
                hs0 hs0Var = new hs0(zx5VarQ);
                hs0Var.o = true;
                hs0Var.f(0, z8eVar, str);
                hs0Var.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        dy4 dy4Var = new dy4();
        oa7.B(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dy4Var.a = alertDialog;
        if (onCancelListener != null) {
            dy4Var.b = onCancelListener;
        }
        dy4Var.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i, new iig(super.a(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        g(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void e(Activity activity, v48 v48Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i, new lig(super.a(i, activity, "d"), v48Var), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        g(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        b1.n("GoogleApiAvailability", tec.f(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new big(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                b1.l("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? fig.e(context, "common_google_play_services_resolution_required_title") : fig.a(context, i);
        if (strE == null) {
            strE = context.getResources().getString(ai.askquin.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? fig.d(context, "common_google_play_services_resolution_required_text", fig.c(context)) : fig.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        oa7.A(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        ih9 ih9Var = new ih9(context, null);
        ih9Var.m = true;
        ih9Var.c(16, true);
        ih9Var.e = ih9.b(strE);
        hh9 hh9Var = new hh9(4);
        hh9Var.c = ih9.b(strD);
        ih9Var.e(hh9Var);
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = m93.n;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            m93.n = boolValueOf;
        }
        boolean zBooleanValue = boolValueOf.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            ih9Var.v.icon = i3;
            ih9Var.j = 2;
            if (m93.H(context)) {
                ih9Var.b.add(new eh9(resources.getString(ai.askquin.R.string.common_open_on_phone), pendingIntent));
            } else {
                ih9Var.g = pendingIntent;
            }
        } else {
            ih9Var.v.icon = R.drawable.stat_sys_warning;
            ih9Var.v.tickerText = ih9.b(resources.getString(ai.askquin.R.string.common_google_play_services_notification_ticker));
            ih9Var.v.when = System.currentTimeMillis();
            ih9Var.g = pendingIntent;
            ih9Var.f = ih9.b(strD);
        }
        synchronized (d) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(ai.askquin.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        ih9Var.t = "com.google.android.gms.availability";
        Notification notificationA = ih9Var.a();
        if (i == 1 || i == 2 || i == 3) {
            sc6.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
    }
}
