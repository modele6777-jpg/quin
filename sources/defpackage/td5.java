package defpackage;

import ai.askquin.widget.DailyFortuneWidgetReceiver;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.crashlytics.FirebaseCrashlyticsKt;
import io.sentry.g1;
import io.sentry.l0;
import io.sentry.q4;
import java.time.LocalDate;
import java.time.ZoneId;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class td5 implements hf8 {
    public static final td5 a = new td5();
    public static final td5 b = new td5();

    public static void b(Exception exc) {
        cz1 cz1Var = new cz1(23);
        ThreadLocal threadLocal = ox2.a;
        Integer num = (Integer) threadLocal.get();
        threadLocal.set(Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        try {
            m8b m8bVarD = a.d();
            String message = exc.getMessage();
            if (message == null) {
                message = "somethings go wrong";
            }
            m8bVarD.c(message, exc);
            Integer num2 = (Integer) threadLocal.get();
            int iIntValue = (num2 != null ? num2.intValue() : 1) - 1;
            if (iIntValue == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Integer.valueOf(iIntValue));
            }
            if (kj0.y0(exc)) {
                jv2 jv2Var = new jv2(14, exc);
                g1 g1VarB = q4.b();
                g1VarB.getClass();
                g1VarB.y(exc, new l0(), jv2Var);
                cn1.z();
                if (ff5.c().isEmpty()) {
                    return;
                }
                FirebaseCrashlyticsKt.recordException(FirebaseCrashlyticsKt.getCrashlytics(af5.a), exc, new ks2(4, cz1Var, exc));
            }
        } catch (Throwable th) {
            Integer num3 = (Integer) threadLocal.get();
            int iIntValue2 = (num3 != null ? num3.intValue() : 1) - 1;
            if (iIntValue2 == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Integer.valueOf(iIntValue2));
            }
            throw th;
        }
    }

    public void a(Context context) {
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        Intent intent = new Intent(context, (Class<?>) DailyFortuneWidgetReceiver.class);
        intent.setAction("ai.askquin.widget.MIDNIGHT_REFRESH");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 10030, intent, 201326592);
        broadcast.getClass();
        long epochMilli = LocalDate.now().plusDays(1L).atStartOfDay(ZoneId.systemDefault()).plusSeconds(30L).toInstant().toEpochMilli();
        ((AlarmManager) systemService).setAndAllowWhileIdle(1, epochMilli, broadcast);
        d().e("Scheduled midnight widget refresh at " + epochMilli);
    }
}
