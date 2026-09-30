package defpackage;

import ai.askquin.widget.QuickDecisionWidgetReceiver;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.FirebaseCrashlyticsKt;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p2g implements o2g, hf8 {
    public static final p2g a = new p2g();
    public static final p2g b = new p2g();

    public static void b(Context context) {
        ff5 ff5VarG;
        boolean zIsEmpty = ff5.c().isEmpty();
        if (zIsEmpty) {
            synchronized (ff5.k) {
                try {
                    if (ff5.l.containsKey("[DEFAULT]")) {
                        ff5VarG = ff5.d();
                    } else {
                        wf5 wf5VarA = wf5.a(context);
                        if (wf5VarA == null) {
                            b1.l("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                            ff5VarG = null;
                        } else {
                            ff5VarG = ff5.g(context, wf5VarA);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (ff5VarG == null) {
                return;
            }
            FirebaseCrashlytics crashlytics = FirebaseCrashlyticsKt.getCrashlytics(af5.a);
            hs3 hs3Var = xqa.o;
            crashlytics.setCrashlyticsCollectionEnabled(((Boolean) z5c.I(nu4.a, new kf5(hs3Var.a, hs3Var.b, null))).booleanValue());
        }
        x1f x1fVar = x1f.a;
        hs3 hs3Var2 = xqa.A;
        String str = (String) z5c.I(nu4.a, new t1f(hs3Var2.a, hs3Var2.b, null));
        o05 o05VarA = x1f.a();
        uu3 uu3Var = o05VarA instanceof uu3 ? (uu3) o05VarA : null;
        if (uu3Var != null) {
            synchronized (uu3Var) {
                if (uu3Var.b == null) {
                    uu3Var.b = (o05) uu3Var.a.invoke();
                }
            }
        }
        x1f.a().b(str);
        x1f.a().a();
        x1f.a().e(new s1f(k8b.c(), 0));
        ihd ihdVar = ihd.a;
        if (ihd.b.get()) {
            qn2 qn2Var = lw2.a;
            js3 js3Var = ga4.a;
            ynb.V(qn2Var, hr3.c, null, new ghd(2, null), 2);
        }
        l93 l93Var = l93.a;
        l93.a(l93.d, "Failed to deliver Firebase app_open");
        if (zIsEmpty) {
            gg5 gg5VarB = ((bqb) ff5.d().b(bqb.class)).b("firebase");
            gg5VarB.getClass();
            gg5VarB.a().b(new pd4(24));
        }
    }

    public void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) QuickDecisionWidgetReceiver.class);
        intent.setAction("ai.askquin.widget.QD_AUTO_REFRESH");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 10031, intent, 603979776);
        if (broadcast == null) {
            return;
        }
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        ((AlarmManager) systemService).cancel(broadcast);
        broadcast.cancel();
        d().e("Cancelled QD auto-refresh alarm");
    }

    public void c(Context context) {
        SharedPreferences sharedPreferences;
        context.getClass();
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) QuickDecisionWidgetReceiver.class));
        appWidgetIds.getClass();
        if (appWidgetIds.length == 0) {
            a(context);
            return;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("quick_decision_widget", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = appWidgetIds.length;
        int i = 0;
        while (true) {
            sharedPreferences = sharedPreferences2;
            if (i >= length) {
                break;
            }
            int i2 = appWidgetIds[i];
            String string = sharedPreferences.getString(d7b.a(i2, "qd_state"), "initial");
            if (string == null) {
                string = "initial";
            }
            if (!string.equals("initial")) {
                long j = sharedPreferences.getLong(d7b.a(i2, "qd_state_entered_at"), 0L);
                if (j <= 0) {
                    arrayList3.add(Integer.valueOf(i2));
                    j = jCurrentTimeMillis;
                }
                if (j <= 0 || jCurrentTimeMillis - j < 86400000) {
                    arrayList2.add(Long.valueOf(j));
                } else {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            i++;
            sharedPreferences2 = sharedPreferences;
        }
        if (!arrayList3.isEmpty()) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                editorEdit.putLong(d7b.a(((Number) it.next()).intValue(), "qd_state_entered_at"), jCurrentTimeMillis);
            }
            editorEdit.apply();
        }
        if (!arrayList.isEmpty()) {
            d().e("Auto-refreshing expired QD widgets " + arrayList);
            int i3 = QuickDecisionWidgetReceiver.a;
            if (!arrayList.isEmpty()) {
                SharedPreferences.Editor editorEdit2 = context.getSharedPreferences("quick_decision_widget", 0).edit();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    editorEdit2.putString(d7b.a(iIntValue, "qd_state"), "initial");
                    editorEdit2.remove(d7b.a(iIntValue, "qd_state_entered_at"));
                }
                editorEdit2.apply();
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    int iIntValue2 = ((Number) it3.next()).intValue();
                    try {
                        c7b c7bVar = c7b.a;
                        appWidgetManager.getClass();
                        c7b.q(context, appWidgetManager, iIntValue2);
                        c7b.k(context, appWidgetManager, iIntValue2);
                    } catch (Exception e) {
                        hf8.Q.getClass();
                        ef8.a("QDWidgetReceiver").c("Auto-reset failed for widget " + iIntValue2, e);
                    }
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((Number) obj).longValue() > 0) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList(t72.u(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(Long.valueOf(((Number) it4.next()).longValue() + 86400000));
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList5) {
            if (((Number) obj2).longValue() > jCurrentTimeMillis) {
                arrayList6.add(obj2);
            }
        }
        Long l = (Long) s72.K0(arrayList6);
        if (l == null) {
            a(context);
            return;
        }
        long jLongValue = l.longValue();
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        AlarmManager alarmManager = (AlarmManager) systemService;
        Intent intent = new Intent(context, (Class<?>) QuickDecisionWidgetReceiver.class);
        intent.setAction("ai.askquin.widget.QD_AUTO_REFRESH");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 10031, intent, 201326592);
        if (broadcast == null) {
            qc0.j("Required value was null.");
            return;
        }
        alarmManager.setAndAllowWhileIdle(1, jLongValue, broadcast);
        d().e("Scheduled QD auto-refresh at " + jLongValue);
    }
}
