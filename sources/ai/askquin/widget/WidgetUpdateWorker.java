package ai.askquin.widget;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.adjust.sdk.network.ErrorCodes;
import defpackage.ap;
import defpackage.bb3;
import defpackage.bw2;
import defpackage.c7b;
import defpackage.d7b;
import defpackage.ef8;
import defpackage.h5g;
import defpackage.hf8;
import defpackage.ih9;
import defpackage.jzb;
import defpackage.kr5;
import defpackage.m6g;
import defpackage.n6g;
import defpackage.o6g;
import defpackage.ok8;
import defpackage.p2g;
import defpackage.p6g;
import defpackage.q6g;
import defpackage.qc0;
import defpackage.qd0;
import defpackage.r6g;
import defpackage.r88;
import defpackage.s6g;
import defpackage.t6g;
import defpackage.t72;
import defpackage.t88;
import defpackage.td5;
import defpackage.u6g;
import defpackage.v6g;
import defpackage.wef;
import defpackage.xn2;
import defpackage.z7c;
import defpackage.zn2;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lai/askquin/widget/WidgetUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Quin:Quin-5.23.0.291-260918_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class WidgetUpdateWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.work.CoroutineWorker
    public final Object c(xn2 xn2Var) {
        c cVar;
        v6g v6gVar;
        if (xn2Var instanceof c) {
            cVar = (c) xn2Var;
            int i = cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.label = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(this, (zn2) xn2Var);
            }
        } else {
            cVar = new c(this, (zn2) xn2Var);
        }
        Object obj = cVar.result;
        int i2 = cVar.label;
        v6g p6gVar = null;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                bb3 bb3Var = this.b.b;
                bb3Var.getClass();
                String strD = bb3Var.d("type");
                if (strD != null) {
                    switch (strD.hashCode()) {
                        case -1474289171:
                            if (strD.equals("qd_deleted")) {
                                int[] iArrC = bb3Var.c();
                                if (iArrC == null) {
                                    iArrC = new int[0];
                                }
                                p6gVar = new p6g(qd0.E0(iArrC));
                            }
                            break;
                        case -1437311554:
                            if (strD.equals("qd_card_selected")) {
                                p6gVar = new o6g(bb3Var.b(-1, "widget_id"), bb3Var.b(0, "position"));
                            }
                            break;
                        case -1276577361:
                            if (strD.equals("daily_update")) {
                                int[] iArrC2 = bb3Var.c();
                                if (iArrC2 == null) {
                                    iArrC2 = new int[0];
                                }
                                p6gVar = new n6g(qd0.E0(iArrC2), bb3Var.a("track_install"), bb3Var.a("schedule_midnight"));
                            }
                            break;
                        case -530253201:
                            if (strD.equals("qd_schedule_next")) {
                                p6gVar = t6g.a;
                            }
                            break;
                        case 162442224:
                            if (strD.equals("qd_draw")) {
                                p6gVar = new q6g(bb3Var.b(-1, "widget_id"));
                            }
                            break;
                        case 753300515:
                            if (strD.equals("qd_reset")) {
                                p6gVar = new s6g(bb3Var.b(-1, "widget_id"));
                            }
                            break;
                        case 1667118359:
                            if (strD.equals("daily_refresh_all")) {
                                p6gVar = new m6g(bb3Var.a("schedule_midnight"));
                            }
                            break;
                        case 1874081147:
                            if (strD.equals("qd_locale_changed")) {
                                p6gVar = r6g.a;
                            }
                            break;
                        case 1973075061:
                            if (strD.equals("qd_update")) {
                                int[] iArrC3 = bb3Var.c();
                                if (iArrC3 == null) {
                                    iArrC3 = new int[0];
                                }
                                p6gVar = new u6g(qd0.E0(iArrC3), bb3Var.a("track_install"), bb3Var.a("schedule_qd"));
                            }
                            break;
                    }
                }
                if (p6gVar == null) {
                    return new r88();
                }
                try {
                    cVar.L$0 = p6gVar;
                    cVar.label = 1;
                    Object objF = f(p6gVar, cVar);
                    bw2 bw2Var = bw2.a;
                    if (objF == bw2Var) {
                        return bw2Var;
                    }
                    v6gVar = p6gVar;
                } catch (Exception e) {
                    e = e;
                    v6gVar = p6gVar;
                    hf8.Q.getClass();
                    ef8.a("WidgetUpdateWorker").c("Failed to execute widget work " + v6gVar, e);
                    return new t88();
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v6gVar = (v6g) cVar.L$0;
                try {
                    jzb.q(obj);
                } catch (Exception e2) {
                    e = e2;
                    hf8.Q.getClass();
                    ef8.a("WidgetUpdateWorker").c("Failed to execute widget work " + v6gVar, e);
                    return new t88();
                }
            }
            return new t88();
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final Object e() {
        NotificationChannel notificationChannel = new NotificationChannel("widget_update_channel", "Widget Update", 2);
        Context context = this.a;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        ih9 ih9Var = new ih9(context, "widget_update_channel");
        ih9Var.e = ih9.b("Updating widget");
        ih9Var.v.icon = R.drawable.stat_notify_sync;
        ih9Var.c(2, true);
        Notification notificationA = ih9Var.a();
        notificationA.getClass();
        return new kr5(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION, notificationA, 0);
    }

    public final Object f(v6g v6gVar, c cVar) {
        boolean z = v6gVar instanceof m6g;
        wef wefVar = wef.a;
        Context context = this.a;
        if (z) {
            int i = DailyFortuneWidgetReceiver.a;
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            Iterator it = t72.I(DailyFortuneWidgetReceiver.class, DailyFortuneWidgetWideReceiver.class).iterator();
            while (it.hasNext()) {
                int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) it.next()));
                appWidgetIds.getClass();
                for (int i2 : appWidgetIds) {
                    ok8.K(context, appWidgetManager, i2);
                }
            }
            if (((m6g) v6gVar).a) {
                td5.b.a(context);
                return wefVar;
            }
        } else if (v6gVar instanceof n6g) {
            n6g n6gVar = (n6g) v6gVar;
            if (n6gVar.c) {
                td5.b.a(context);
            }
            if (n6gVar.b) {
                h5g.a.f(context);
            }
            AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context);
            Iterator it2 = n6gVar.a.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                int i3 = DailyFortuneWidgetReceiver.a;
                appWidgetManager2.getClass();
                ok8.K(context, appWidgetManager2, iIntValue);
            }
        } else if (v6gVar instanceof u6g) {
            u6g u6gVar = (u6g) v6gVar;
            if (u6gVar.b) {
                h5g.a.f(context);
            }
            if (u6gVar.c) {
                p2g.b.c(context);
            }
            AppWidgetManager appWidgetManager3 = AppWidgetManager.getInstance(context);
            Iterator it3 = u6gVar.a.iterator();
            while (it3.hasNext()) {
                int iIntValue2 = ((Number) it3.next()).intValue();
                c7b c7bVar = c7b.a;
                appWidgetManager3.getClass();
                c7b.q(context, appWidgetManager3, iIntValue2);
            }
        } else {
            if (v6gVar.equals(t6g.a)) {
                p2g.b.c(context);
                return wefVar;
            }
            if (v6gVar instanceof q6g) {
                return new QuickDecisionWidgetReceiver().b(context, ((q6g) v6gVar).a, cVar);
            }
            if (v6gVar instanceof o6g) {
                o6g o6gVar = (o6g) v6gVar;
                return new QuickDecisionWidgetReceiver().a(context, o6gVar.a, o6gVar.b, cVar);
            }
            if (v6gVar instanceof s6g) {
                new QuickDecisionWidgetReceiver();
                int i4 = ((s6g) v6gVar).a;
                context.getSharedPreferences("quick_decision_widget", 0).edit().putString(d7b.a(i4, "qd_state"), "initial").remove(d7b.a(i4, "qd_state_entered_at")).apply();
                p2g.b.c(context);
                QuickDecisionWidgetReceiver.c(context, i4);
                try {
                    AppWidgetManager appWidgetManager4 = AppWidgetManager.getInstance(context);
                    c7b c7bVar2 = c7b.a;
                    appWidgetManager4.getClass();
                    c7b.k(context, appWidgetManager4, i4);
                    return wefVar;
                } catch (Exception e) {
                    hf8.Q.getClass();
                    ef8.a("QDWidgetReceiver").c("Initial-stack refresh failed for widget " + i4, e);
                    return wefVar;
                }
            }
            if (!v6gVar.equals(r6g.a)) {
                if (!(v6gVar instanceof p6g)) {
                    ap.c();
                    return null;
                }
                Iterator it4 = ((p6g) v6gVar).a.iterator();
                while (it4.hasNext()) {
                    int iIntValue3 = ((Number) it4.next()).intValue();
                    List list = d7b.a;
                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("quick_decision_widget", 0).edit();
                    Iterator it5 = d7b.a.iterator();
                    while (it5.hasNext()) {
                        editorEdit.remove(d7b.a(iIntValue3, (String) it5.next()));
                    }
                    editorEdit.apply();
                }
                p2g.b.c(context);
                return wefVar;
            }
            new QuickDecisionWidgetReceiver();
            int[] appWidgetIds2 = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) QuickDecisionWidgetReceiver.class));
            appWidgetIds2.getClass();
            for (int i5 : appWidgetIds2) {
                QuickDecisionWidgetReceiver.c(context, i5);
            }
        }
        return wefVar;
    }
}
