package ai.askquin.widget;

import ai.askquin.data.quickdecision.QuickDecisionCard;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import defpackage.a6c;
import defpackage.bt5;
import defpackage.bw2;
import defpackage.c7b;
import defpackage.d7b;
import defpackage.e7b;
import defpackage.ef8;
import defpackage.g6b;
import defpackage.hf8;
import defpackage.hs3;
import defpackage.j6b;
import defpackage.jzb;
import defpackage.n6b;
import defpackage.nu4;
import defpackage.o6g;
import defpackage.p05;
import defpackage.p2g;
import defpackage.p6g;
import defpackage.pa7;
import defpackage.q6g;
import defpackage.qc0;
import defpackage.qd0;
import defpackage.r6g;
import defpackage.s6g;
import defpackage.s72;
import defpackage.t6g;
import defpackage.u6g;
import defpackage.urg;
import defpackage.v4e;
import defpackage.wef;
import defpackage.x1f;
import defpackage.x6b;
import defpackage.xqa;
import defpackage.y6b;
import defpackage.z5c;
import defpackage.zea;
import defpackage.zn2;
import java.io.IOException;
import java.time.Instant;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class QuickDecisionWidgetReceiver extends AppWidgetProvider {
    public static final /* synthetic */ int a = 0;

    public static void c(Context context, int i) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        try {
            c7b c7bVar = c7b.a;
            appWidgetManager.getClass();
            c7b.q(context, appWidgetManager, i);
        } catch (Exception e) {
            hf8.Q.getClass();
            ef8.a("QDWidgetReceiver").c("Failed to update widget " + i, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(Context context, int i, int i2, zn2 zn2Var) {
        a aVar;
        Object obj;
        String str;
        Object next;
        String string;
        String str2;
        SharedPreferences sharedPreferences;
        QuickDecisionCard quickDecisionCard;
        Context context2 = context;
        int i3 = i;
        if (zn2Var instanceof a) {
            aVar = (a) zn2Var;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, zn2Var);
            }
        } else {
            aVar = new a(this, zn2Var);
        }
        Object obj2 = aVar.result;
        int i5 = aVar.label;
        wef wefVar = wef.a;
        if (i5 == 0) {
            jzb.q(obj2);
            x1f x1fVar = x1f.a;
            x1f.k(p05.a, new bt5("widget_tap", 28), 2);
            SharedPreferences sharedPreferences2 = context2.getSharedPreferences("quick_decision_widget", 0);
            String string2 = sharedPreferences2.getString(d7b.a(i3, "qd_card_keys"), "");
            List listC0 = v4e.c0(string2 != null ? string2 : "", new String[]{","}, 6);
            if (i2 < 0 || i2 >= listC0.size()) {
                obj = (String) s72.x0(listC0);
                if (obj != null) {
                }
                return wefVar;
            }
            obj = listC0.get(i2);
            str = (String) obj;
            QuickDecisionCard quickDecisionCardA = new y6b(context2).a(str);
            if (quickDecisionCardA != null) {
                Iterator<E> it = TarotCardType.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!pa7.t(((TarotCardType) next).getCardKey(), str));
                TarotCardType tarotCardType = (TarotCardType) next;
                if (tarotCardType == null || (string = context2.getString(tarotCardType.getTitleRes())) == null) {
                    string = str;
                }
                g6b g6bVarW = a6c.i(context2).w();
                String strName = quickDecisionCardA.getAnswer().name();
                String tagline = quickDecisionCardA.getTagline();
                String reading = quickDecisionCardA.getReading();
                Instant instantNow = Instant.now();
                instantNow.getClass();
                hs3 hs3Var = xqa.A;
                str2 = string;
                x6b x6bVar = new x6b(0L, str, false, strName, tagline, reading, instantNow, null, null, (String) z5c.I(nu4.a, new e7b(hs3Var.a, hs3Var.b, null)), 385);
                aVar.L$0 = context2;
                aVar.L$1 = sharedPreferences2;
                aVar.L$2 = null;
                aVar.L$3 = str;
                aVar.L$4 = null;
                aVar.L$5 = quickDecisionCardA;
                aVar.L$6 = null;
                aVar.L$7 = str2;
                aVar.L$8 = null;
                aVar.L$9 = null;
                aVar.I$0 = i3;
                aVar.I$1 = i2;
                aVar.label = 1;
                n6b n6bVar = (n6b) g6bVarW;
                Object objK = urg.K(aVar, new j6b(n6bVar, x6bVar, 0), n6bVar.a, false, true);
                bw2 bw2Var = bw2.a;
                if (objK == bw2Var) {
                    return bw2Var;
                }
                sharedPreferences = sharedPreferences2;
                obj2 = objK;
                quickDecisionCard = quickDecisionCardA;
            }
            return wefVar;
        }
        if (i5 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i6 = aVar.I$0;
        String str3 = (String) aVar.L$7;
        quickDecisionCard = (QuickDecisionCard) aVar.L$5;
        String str4 = (String) aVar.L$3;
        sharedPreferences = (SharedPreferences) aVar.L$1;
        Context context3 = (Context) aVar.L$0;
        jzb.q(obj2);
        str = str4;
        str2 = str3;
        i3 = i6;
        context2 = context3;
        sharedPreferences.edit().putString(d7b.a(i3, "qd_state"), "result").putString(d7b.a(i3, "qd_selected_card_key"), str).putString(d7b.a(i3, "qd_answer"), quickDecisionCard.getAnswer().name()).putString(d7b.a(i3, "qd_card_name"), str2).putLong(d7b.a(i3, "qd_db_id"), ((Number) obj2).longValue()).putLong(d7b.a(i3, "qd_state_entered_at"), System.currentTimeMillis()).apply();
        p2g.b.c(context2);
        c(context2, i3);
        return wefVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Context context, int i, zn2 zn2Var) throws IOException {
        b bVar;
        Exception exc;
        if (zn2Var instanceof b) {
            bVar = (b) zn2Var;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, zn2Var);
            }
        } else {
            bVar = new b(this, zn2Var);
        }
        Object obj = bVar.result;
        int i3 = bVar.label;
        int i4 = 1;
        try {
            if (i3 == 0) {
                jzb.q(obj);
                hf8.Q.getClass();
                ef8.a("QDWidgetReceiver").e("handleDraw widgetId=" + i);
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new bt5("spread_tap", 28), 2);
                List listB = new y6b(context).b();
                listB.getClass();
                List listM1 = s72.m1(listB);
                Collections.shuffle(listM1);
                String strD0 = s72.D0(s72.c1(listM1, 3), ",", null, null, new zea(25), 30);
                ef8.a("QDWidgetReceiver").e("handleDraw cards=".concat(strD0));
                context.getSharedPreferences("quick_decision_widget", 0).edit().putString(d7b.a(i, "qd_state"), "selecting").putString(d7b.a(i, "qd_card_keys"), strD0).putLong(d7b.a(i, "qd_state_entered_at"), System.currentTimeMillis()).apply();
                p2g.b.c(context);
                try {
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                    c7b c7bVar = c7b.a;
                    appWidgetManager.getClass();
                    bVar.L$0 = context;
                    bVar.L$1 = null;
                    bVar.L$2 = null;
                    bVar.L$3 = null;
                    bVar.L$4 = null;
                    bVar.L$5 = null;
                    bVar.I$0 = i;
                    bVar.I$1 = 0;
                    bVar.label = 1;
                    Object objA = c7bVar.a(context, appWidgetManager, i, bVar);
                    bw2 bw2Var = bw2.a;
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                } catch (Exception e) {
                    exc = e;
                    i4 = 0;
                    hf8.Q.getClass();
                    ef8.a("QDWidgetReceiver").c("Transition animation failed for widget " + i, exc);
                }
            } else {
                if (i3 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = bVar.I$1;
                i = bVar.I$0;
                Context context2 = (Context) bVar.L$0;
                try {
                    jzb.q(obj);
                    context = context2;
                } catch (Exception e2) {
                    exc = e2;
                    i4 = i5;
                    context = context2;
                    hf8.Q.getClass();
                    ef8.a("QDWidgetReceiver").c("Transition animation failed for widget " + i, exc);
                }
            }
            if (i4 == 0) {
                c(context, i);
            }
            return wef.a;
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        context.getClass();
        iArr.getClass();
        a6c.h(context, new p6g(qd0.E0(iArr)));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        context.getClass();
        super.onEnabled(context);
        a6c.h(context, t6g.a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        super.onReceive(context, intent);
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        hf8.Q.getClass();
        ef8.a("QDWidgetReceiver").e("onReceive action=" + intent.getAction() + " widgetId=" + intExtra);
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -2076683041:
                    if (action.equals("ai.askquin.widget.QD_AUTO_REFRESH")) {
                        a6c.h(context, t6g.a);
                        break;
                    }
                    break;
                case -19011148:
                    if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                        a6c.h(context, r6g.a);
                        break;
                    }
                    break;
                case 241979574:
                    if (action.equals("ai.askquin.widget.QD_CARD_SELECTED")) {
                        a6c.h(context, new o6g(intExtra, intent.getIntExtra("card_position", 0)));
                        break;
                    }
                    break;
                case 745992696:
                    if (action.equals("ai.askquin.widget.QD_DRAW")) {
                        a6c.h(context, new q6g(intExtra));
                    }
                    break;
                case 1663495931:
                    if (action.equals("ai.askquin.widget.QD_RESET")) {
                        a6c.h(context, new s6g(intExtra));
                        break;
                    }
                    break;
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        a6c.h(context, new u6g(qd0.E0(iArr), !(iArr.length == 0), true));
    }
}
