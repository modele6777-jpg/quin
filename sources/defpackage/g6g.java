package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g6g {
    public static final List a = t72.I("is_drawn", "date", "card_key", "card_name", "affirmation", "is_reversed", "skin_folder", "skin_requires_download", "account_id");
    public static final List b = t72.I("ai.askquin.widget.DailyFortuneWidgetReceiver", "ai.askquin.widget.DailyFortuneWidgetWideReceiver", "ai.askquin.widget.QuickDecisionWidgetReceiver");
    public static final List c = t72.I("ai.askquin.widget.DailyFortuneWidgetReceiver", "ai.askquin.widget.DailyFortuneWidgetWideReceiver");

    public static boolean a(Context context, String str) {
        Object dzbVar;
        try {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            if (appWidgetManager == null) {
                return false;
            }
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context.getPackageName(), str));
            hf8.Q.getClass();
            m8b m8bVarA = ef8.a("WidgetPrefs");
            appWidgetIds.getClass();
            m8bVarA.e("AppWidget ids for " + str + ": " + qd0.E0(appWidgetIds));
            dzbVar = Boolean.valueOf(!(appWidgetIds.length == 0));
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Object obj = Boolean.FALSE;
        if (dzbVar instanceof dzb) {
            dzbVar = obj;
        }
        return ((Boolean) dzbVar).booleanValue();
    }

    public static boolean b(Context context) {
        context.getClass();
        List list = c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a(context, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        hs3 hs3Var = xqa.A;
        String str = (String) z5c.I(nu4.a, new e6g(hs3Var.a, hs3Var.b, null));
        context.getClass();
        str.getClass();
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        return f(context, localDateNow, str) != null;
    }

    public static d6g d(SharedPreferences sharedPreferences, String str, LocalDate localDate, String str2) {
        String string;
        String strG = g(str, "account_id");
        if (!sharedPreferences.contains(strG) || !pa7.t(sharedPreferences.getString(strG, null), str2) || !sharedPreferences.getBoolean(g(str, "is_drawn"), false) || (string = sharedPreferences.getString(g(str, "date"), null)) == null || !string.equals(localDate.toString())) {
            return null;
        }
        String string2 = sharedPreferences.getString(g(str, "card_key"), "");
        String str3 = string2 == null ? "" : string2;
        String string3 = sharedPreferences.getString(g(str, "card_name"), "");
        String str4 = string3 == null ? "" : string3;
        String string4 = sharedPreferences.getString(g(str, "affirmation"), "");
        String str5 = string4 == null ? "" : string4;
        boolean z = sharedPreferences.getBoolean(g(str, "is_reversed"), false);
        String string5 = sharedPreferences.getString(g(str, "skin_folder"), "rider_waite");
        return new d6g(str2, string, str3, str4, str5, z, string5 == null ? "rider_waite" : string5, sharedPreferences.getBoolean(g(str, "skin_requires_download"), false));
    }

    public static void e(Context context) {
        context.getClass();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            ComponentName componentName = new ComponentName(context.getPackageName(), (String) it.next());
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
            appWidgetIds.getClass();
            if (appWidgetIds.length != 0) {
                Intent intent = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
                intent.putExtra("appWidgetIds", appWidgetIds);
                intent.setComponent(componentName);
                context.sendBroadcast(intent);
            }
        }
    }

    public static d6g f(Context context, LocalDate localDate, String str) {
        context.getClass();
        str.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("daily_fortune_widget", 0);
        sharedPreferences.getClass();
        d6g d6gVarD = d(sharedPreferences, "", localDate, str);
        return d6gVarD == null ? d(sharedPreferences, "next_", localDate, str) : d6gVarD;
    }

    public static String g(String str, String str2) {
        return tec.l(str, str2);
    }

    public static void h(Context context, TarotSkinIdentify tarotSkinIdentify) {
        context.getClass();
        tarotSkinIdentify.getClass();
        context.getSharedPreferences("daily_fortune_widget", 0).edit().putString("skin_folder", tarotSkinIdentify.getFolder()).putBoolean("skin_requires_download", tarotSkinIdentify.getRequiresDownload()).apply();
        e(context);
    }
}
