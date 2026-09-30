package ai.askquin.notification;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.ap;
import defpackage.dzb;
import defpackage.e73;
import defpackage.hf8;
import defpackage.hs3;
import defpackage.ih9;
import defpackage.lbb;
import defpackage.lw2;
import defpackage.mbb;
import defpackage.nh9;
import defpackage.nu4;
import defpackage.pa7;
import defpackage.s72;
import defpackage.ua3;
import defpackage.v4e;
import defpackage.va3;
import defpackage.wa3;
import defpackage.xa3;
import defpackage.xqa;
import defpackage.y93;
import defpackage.ya3;
import defpackage.ym8;
import defpackage.ynb;
import defpackage.z5c;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class DailyNotificationSchedulerReceiver extends BroadcastReceiver implements hf8 {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object next;
        Object dzbVar;
        LocalDate localDate;
        boolean zEquals;
        context.getClass();
        intent.getClass();
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        localDateTimeNow.getClass();
        boolean booleanExtra = intent.getBooleanExtra("test", false);
        boolean booleanExtra2 = intent.getBooleanExtra("bypass_daily_fortune_completion_suppression", false);
        String stringExtra = intent.getStringExtra("daily_reminder_kind");
        ya3.a.getClass();
        Iterator it = ya3.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((ya3) next).d(), stringExtra));
        ya3 ya3Var = (ya3) next;
        if (ya3Var == null) {
            ya3Var = ya3.Today;
        }
        ya3 ya3Var2 = ya3Var;
        String stringExtra2 = intent.getStringExtra("daily_fortune_target_date");
        if (stringExtra2 != null) {
            try {
                dzbVar = LocalDate.parse(stringExtra2);
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            localDate = (LocalDate) dzbVar;
        } else {
            localDate = null;
        }
        if (!booleanExtra2) {
            y93.a.i(context, ya3Var2);
        }
        if (localDate == null) {
            d().b("Skipped " + ya3Var2.d() + " notification without a valid target date");
            return;
        }
        int iOrdinal = ya3Var2.ordinal();
        if (iOrdinal == 0) {
            zEquals = localDate.equals(localDateTimeNow.toLocalDate());
        } else {
            if (iOrdinal != 1) {
                ap.c();
                return;
            }
            zEquals = localDateTimeNow.toLocalTime().compareTo(e73.a) >= 0 && localDate.equals(localDateTimeNow.toLocalDate().plusDays(1L));
        }
        if (!zEquals) {
            d().e("Skipped stale " + ya3Var2.d() + " notification for " + localDate);
            return;
        }
        if (!booleanExtra2) {
            hs3 hs3Var = xqa.m;
            String str = (String) z5c.I(nu4.a, new va3(hs3Var.a, hs3Var.b, null));
            str.getClass();
            List listD0 = v4e.d0(str, new char[]{','}, 6);
            if (!listD0.isEmpty()) {
                Iterator it2 = listD0.iterator();
                while (it2.hasNext()) {
                    if (pa7.t(v4e.o0((String) it2.next()).toString(), localDate.toString())) {
                        d().e("Suppressed " + ya3Var2.d() + " notification for completed date " + localDate);
                        return;
                    }
                }
            }
        }
        d().e("Received " + ya3Var2.d() + " notification schedule for " + localDate);
        LocalDate localDate2 = localDateTimeNow.toLocalDate();
        localDate2.getClass();
        List list = ua3.a;
        lbb lbbVar = mbb.a;
        xa3 xa3Var = (xa3) s72.S0(list);
        xa3Var.getClass();
        int iOrdinal2 = ya3Var2.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 != 1) {
                ap.c();
                return;
            } else {
                List list2 = ua3.b;
                xa3Var = (xa3) list2.get((localDate2.getDayOfYear() - 1) % list2.size());
            }
        }
        int i = xa3Var.b;
        int i2 = xa3Var.a;
        int i3 = xa3Var.c;
        String str2 = xa3Var.d;
        str2.getClass();
        ih9 ih9VarR = ym8.r(context, i, i3, String.format(Locale.ROOT, "%s_%02d", Arrays.copyOf(new Object[]{str2, Integer.valueOf(i2)}, 2)), i2 + 10001 + (ya3Var2 == ya3.Tomorrow ? 100 : 0), ya3Var2, localDate);
        if (booleanExtra) {
            ih9VarR.c(2, true);
            ih9VarR.w = true;
            ih9VarR.m = true;
        }
        Notification notificationA = ih9VarR.a();
        notificationA.getClass();
        nh9 nh9Var = new nh9(context);
        try {
            nh9Var.a(ya3Var2.a(), notificationA);
        } catch (SecurityException e) {
            d().c("Failed to show daily notification", e);
        }
        if (booleanExtra) {
            ynb.V(lw2.a, null, null, new wa3(nh9Var, ya3Var2, null), 3);
        }
    }
}
