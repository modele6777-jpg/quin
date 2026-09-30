package defpackage;

import ai.askquin.R;
import ai.askquin.ui.fourseasons.notification.FourSeasonsNotificationReceiver;
import android.app.AlarmManager;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Set;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qv5 implements hf8 {
    public static final qv5 a = new qv5();
    public static final f99 b = new f99();

    public static void a(Context context) {
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        AlarmManager alarmManager = (AlarmManager) systemService;
        nh9 nh9Var = new nh9(context);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 20001, new Intent(context, (Class<?>) FourSeasonsNotificationReceiver.class), 201326592);
        broadcast.getClass();
        alarmManager.cancel(broadcast);
        NotificationManager notificationManager = nh9Var.b;
        notificationManager.cancel(null, 20001);
        mx4 mx4Var = mic.f;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            yic yicVarC = rmc.c((mic) l2Var.next());
            alarmManager.cancel(j(context, yicVarC));
            notificationManager.cancel(null, h(yicVarC));
        }
    }

    public static int h(yic yicVar) {
        return yicVar.b.ordinal() + ((yicVar.a % 100) * 10) + 20000;
    }

    public static void i(Context context, LocalDateTime localDateTime, int i) {
        String strA;
        boolean zContains;
        qv5 qv5Var = a;
        if ((i & 2) != 0) {
            Long l = g3b.a;
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            zoneIdSystemDefault.getClass();
            localDateTime = g3b.a(zoneIdSystemDefault);
        }
        ZoneId zoneIdSystemDefault2 = ZoneId.systemDefault();
        zoneIdSystemDefault2.getClass();
        context.getClass();
        localDateTime.getClass();
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        AlarmManager alarmManager = (AlarmManager) systemService;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 20001, new Intent(context, (Class<?>) FourSeasonsNotificationReceiver.class), 201326592);
        broadcast.getClass();
        alarmManager.cancel(broadcast);
        yic yicVarK = k();
        if (yicVarK == null) {
            a(context);
            return;
        }
        String strA2 = yicVarK.a();
        if (strA2 == null) {
            return;
        }
        PendingIntent pendingIntentJ = j(context, yicVarK);
        hs3 hs3Var = xqa.X0;
        nv5 nv5Var = new nv5(hs3Var.a, hs3Var.b, null);
        nu4 nu4Var = nu4.a;
        if (!((Boolean) z5c.I(nu4Var, nv5Var)).booleanValue()) {
            alarmManager.cancel(pendingIntentJ);
            return;
        }
        kpc kpcVarB = jpc.b(yicVarK, localDateTime);
        hs3 hs3Var2 = xqa.A;
        Object objI = z5c.I(nu4Var, new hv5(hs3Var2.a, hs3Var2.b, null));
        if (v4e.Q((String) objI)) {
            objI = null;
        }
        String str = (String) objI;
        if (str == null || (strA = yicVarK.a()) == null) {
            zContains = false;
        } else {
            hs3 hs3Var3 = xqa.Z0;
            zContains = ((Set) z5c.I(nu4Var, new iv5(hs3Var3.a, hs3Var3.b, null))).contains(str + "#" + strA);
        }
        kpc kpcVar = zContains ? null : kpcVarB;
        if (kpcVar == null) {
            alarmManager.cancel(pendingIntentJ);
            return;
        }
        LocalDateTime localDateTime2 = kpcVar.b;
        if (jpc.a(yicVarK) == null) {
            alarmManager.cancel(pendingIntentJ);
            qv5Var.d().g("Seasonal reminder content unavailable for " + strA2 + "; schedule not armed");
            return;
        }
        alarmManager.setAndAllowWhileIdle(0, localDateTime2.atZone(zoneIdSystemDefault2).toInstant().toEpochMilli(), pendingIntentJ);
        qv5Var.d().e("Scheduled " + strA2 + " reminder at " + localDateTime2);
    }

    public static PendingIntent j(Context context, yic yicVar) {
        int iH = h(yicVar);
        Intent intent = new Intent(context, (Class<?>) FourSeasonsNotificationReceiver.class);
        int i = yicVar.a;
        SolarTerm solarTerm = yicVar.b;
        intent.setData(Uri.parse("quin://seasonal-reminder/" + i + "/" + solarTerm.getWireValue()));
        intent.putExtra("seasonal_year", i);
        intent.putExtra("seasonal_term", solarTerm.getWireValue());
        PendingIntent broadcast = PendingIntent.getBroadcast(context, iH, intent, 201326592);
        broadcast.getClass();
        return broadcast;
    }

    public static yic k() {
        hs3 hs3Var = xqa.Y0;
        ov5 ov5Var = new ov5(hs3Var.a, hs3Var.b, null);
        nu4 nu4Var = nu4.a;
        String str = (String) z5c.I(nu4Var, ov5Var);
        if (!v4e.Q(str)) {
            List listD0 = v4e.d0(str, new char[]{'#'}, 2);
            hs3 hs3Var2 = xqa.A;
            String str2 = (String) z5c.I(nu4Var, new pv5(hs3Var2.a, hs3Var2.b, null));
            if (!v4e.Q(str2) && pa7.t(s72.y0(0, listD0), str2)) {
                yic yicVar = yic.c;
                String str3 = (String) s72.y0(1, listD0);
                return drb.m((String) s72.y0(2, listD0), str3 != null ? c5e.D(str3) : null);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x006e, B:29:0x007b), top: B:36:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Context context, zn2 zn2Var) throws Throwable {
        dv5 dv5Var;
        d99 d99Var;
        d99 d99Var2;
        Throwable th;
        Context context2;
        boolean zBooleanValue;
        qv5 qv5Var;
        if (zn2Var instanceof dv5) {
            dv5Var = (dv5) zn2Var;
            int i = dv5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dv5Var.label = i - Integer.MIN_VALUE;
            } else {
                dv5Var = new dv5(this, zn2Var);
            }
        } else {
            dv5Var = new dv5(this, zn2Var);
        }
        Object obj = dv5Var.result;
        int i2 = dv5Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                dv5Var.L$0 = context;
                d99Var = b;
                dv5Var.L$1 = d99Var;
                dv5Var.label = 1;
                if (d99Var.b(dv5Var) != bw2Var) {
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) dv5Var.L$1;
                context2 = (Context) dv5Var.L$0;
                try {
                    jzb.q(obj);
                    Boolean bool = (Boolean) obj;
                    zBooleanValue = bool.booleanValue();
                    qv5Var = a;
                    a(context2);
                    if (!zBooleanValue) {
                        qv5Var.d().b("Failed to clear account seasonal reminder state");
                    }
                    d99Var2.h(null);
                    return bool;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99 d99Var3 = (d99) dv5Var.L$1;
            Context context3 = (Context) dv5Var.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            context = context3;
            jw5 jw5Var = jw5.a;
            dv5Var.L$0 = context;
            dv5Var.L$1 = d99Var;
            dv5Var.label = 2;
            Object objA = jw5Var.a(dv5Var);
            if (objA != bw2Var) {
                Context context4 = context;
                d99Var2 = d99Var;
                obj = objA;
                context2 = context4;
                Boolean bool2 = (Boolean) obj;
                zBooleanValue = bool2.booleanValue();
                qv5Var = a;
                a(context2);
                if (!zBooleanValue) {
                    qv5Var.d().b("Failed to clear account seasonal reminder state");
                }
                d99Var2.h(null);
                return bool2;
            }
            return bw2Var;
        } catch (Throwable th3) {
            d99Var2 = d99Var;
            th = th3;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x007b, B:29:0x0088), top: B:37:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Application application, zn2 zn2Var) throws Throwable {
        ev5 ev5Var;
        d99 d99Var;
        Context context;
        d99 d99Var2;
        Throwable th;
        Context context2;
        boolean zBooleanValue;
        qv5 qv5Var;
        if (zn2Var instanceof ev5) {
            ev5Var = (ev5) zn2Var;
            int i = ev5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ev5Var.label = i - Integer.MIN_VALUE;
            } else {
                ev5Var = new ev5(this, zn2Var);
            }
        } else {
            ev5Var = new ev5(this, zn2Var);
        }
        Object obj = ev5Var.result;
        int i2 = ev5Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                ev5Var.L$0 = application;
                d99Var = b;
                ev5Var.L$1 = d99Var;
                ev5Var.label = 1;
                if (d99Var.b(ev5Var) != bw2Var) {
                }
                context = application;
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) ev5Var.L$1;
                Context context3 = (Context) ev5Var.L$0;
                try {
                    jzb.q(obj);
                    context2 = context3;
                    Boolean bool = (Boolean) obj;
                    zBooleanValue = bool.booleanValue();
                    qv5Var = a;
                    a(context2);
                    if (!zBooleanValue) {
                        qv5Var.d().b("Failed to clear seasonal reminder state");
                    }
                    d99Var2.h(null);
                    return bool;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99 d99Var3 = (d99) ev5Var.L$1;
            Context context4 = (Context) ev5Var.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            context = context4;
            context = application;
            jw5 jw5Var = jw5.a;
            ev5Var.L$0 = context;
            ev5Var.L$1 = d99Var;
            ev5Var.label = 2;
            gw5 gw5Var = jw5.b;
            gw5Var.getClass();
            Object objA = gw5Var.a("clear reminder", new cw5(gw5Var, null), ev5Var);
            if (objA != bw2Var) {
                Context context5 = context;
                d99Var2 = d99Var;
                obj = objA;
                context2 = context5;
                Boolean bool2 = (Boolean) obj;
                zBooleanValue = bool2.booleanValue();
                qv5Var = a;
                a(context2);
                if (!zBooleanValue) {
                    qv5Var.d().b("Failed to clear seasonal reminder state");
                }
                d99Var2.h(null);
                return bool2;
            }
            context = application;
            return bw2Var;
        } catch (Throwable th3) {
            d99Var2 = d99Var;
            th = th3;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(yic yicVar, zn2 zn2Var) throws Throwable {
        fv5 fv5Var;
        d99 d99Var;
        d99 d99Var2;
        Throwable th;
        if (zn2Var instanceof fv5) {
            fv5Var = (fv5) zn2Var;
            int i = fv5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fv5Var.label = i - Integer.MIN_VALUE;
            } else {
                fv5Var = new fv5(this, zn2Var);
            }
        } else {
            fv5Var = new fv5(this, zn2Var);
        }
        Object obj = fv5Var.result;
        int i2 = fv5Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                fv5Var.L$0 = yicVar;
                d99Var = b;
                fv5Var.L$1 = d99Var;
                fv5Var.label = 1;
                if (d99Var.b(fv5Var) != bw2Var) {
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) fv5Var.L$1;
                try {
                    jzb.q(obj);
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    d99Var2.h(null);
                    return bool;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99 d99Var3 = (d99) fv5Var.L$1;
            yic yicVar2 = (yic) fv5Var.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            yicVar = yicVar2;
            if (yicVar.b() != null && yicVar.a() != null) {
                hs3 hs3Var = xqa.A;
                Object objI = z5c.I(nu4.a, new gv5(hs3Var.a, hs3Var.b, null));
                if (v4e.Q((String) objI)) {
                    objI = null;
                }
                String str = (String) objI;
                if (str == null) {
                    Boolean bool2 = Boolean.FALSE;
                    d99Var.h(null);
                    return bool2;
                }
                jw5 jw5Var = jw5.a;
                String str2 = str + "#" + yicVar.a + "#" + yicVar.b.getWireValue();
                fv5Var.L$0 = null;
                fv5Var.L$1 = d99Var;
                fv5Var.L$2 = null;
                fv5Var.label = 2;
                gw5 gw5Var = jw5.b;
                gw5Var.getClass();
                Object objA = gw5Var.a("enable reminder", new ew5(gw5Var, str2, null), fv5Var);
                if (objA != bw2Var) {
                    d99Var2 = d99Var;
                    obj = objA;
                    Boolean bool3 = (Boolean) obj;
                    bool3.getClass();
                    d99Var2.h(null);
                    return bool3;
                }
                return bw2Var;
            }
            Boolean bool4 = Boolean.FALSE;
            d99Var.h(null);
            return bool4;
        } catch (Throwable th3) {
            d99Var2 = d99Var;
            th = th3;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(yic yicVar, String str, zn2 zn2Var) {
        jv5 jv5Var;
        boolean zBooleanValue;
        if (zn2Var instanceof jv5) {
            jv5Var = (jv5) zn2Var;
            int i = jv5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jv5Var.label = i - Integer.MIN_VALUE;
            } else {
                jv5Var = new jv5(this, zn2Var);
            }
        } else {
            jv5Var = new jv5(this, zn2Var);
        }
        Object objA = jv5Var.result;
        int i2 = jv5Var.label;
        if (i2 == 0) {
            jzb.q(objA);
            String strA = yicVar.a();
            if (strA != null) {
                jw5 jw5Var = jw5.a;
                String strJ = ub3.j(str, "#", strA);
                jv5Var.L$0 = null;
                jv5Var.L$1 = null;
                jv5Var.L$2 = null;
                jv5Var.label = 1;
                gw5 gw5Var = jw5.b;
                gw5Var.getClass();
                objA = gw5Var.a("mark reminder delivered", new aw5(gw5Var, strJ, null), jv5Var);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                zBooleanValue = false;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(objA);
        zBooleanValue = ((Boolean) objA).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x025d A[Catch: all -> 0x0111, SecurityException -> 0x0267, TRY_LEAVE, TryCatch #2 {all -> 0x0111, blocks: (B:105:0x0255, B:107:0x025d, B:26:0x00a5, B:33:0x00b6, B:38:0x00c2, B:42:0x00de, B:48:0x00ea, B:50:0x0106, B:60:0x0121, B:62:0x0127, B:65:0x0139, B:67:0x0146, B:70:0x0158, B:72:0x016e, B:74:0x0174, B:77:0x0186, B:79:0x0194, B:82:0x01b6, B:84:0x01c2, B:86:0x01e1, B:87:0x01e3, B:101:0x0216, B:102:0x0229, B:97:0x020b, B:98:0x0210, B:90:0x01f7, B:56:0x0116), top: B:123:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object g(Context context, yic yicVar, boolean z, zn2 zn2Var) throws Throwable {
        kv5 kv5Var;
        d99 d99Var;
        yic yicVar2;
        boolean z2;
        Context context2;
        d99 d99Var2;
        String strA;
        Object obj;
        int i;
        boolean z3;
        boolean z4;
        SecurityException e;
        if (zn2Var instanceof kv5) {
            kv5Var = (kv5) zn2Var;
            int i2 = kv5Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kv5Var.label = i2 - Integer.MIN_VALUE;
            } else {
                kv5Var = new kv5(this, zn2Var);
            }
        } else {
            kv5Var = new kv5(this, zn2Var);
        }
        Object objF = kv5Var.result;
        int i3 = kv5Var.label;
        qv5 qv5Var = a;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (i3 == 0) {
                    jzb.q(objF);
                    kv5Var.L$0 = context;
                    kv5Var.L$1 = yicVar;
                    d99Var = b;
                    kv5Var.L$2 = d99Var;
                    kv5Var.Z$0 = z;
                    kv5Var.label = 1;
                    if (d99Var.b(kv5Var) == bw2Var) {
                        return bw2Var;
                    }
                    yicVar2 = yicVar;
                    z2 = z;
                    context2 = context;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            qc0.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d99Var2 = (d99) kv5Var.L$2;
                        try {
                            jzb.q(objF);
                            d99Var = d99Var2;
                            z3 = true;
                            if (!((Boolean) objF).booleanValue()) {
                                qv5Var.d().b("Notification delivered but campaign delivery state was not persisted");
                            }
                            z4 = z3;
                            d99Var2 = d99Var;
                        } catch (SecurityException e2) {
                            e = e2;
                            try {
                                qv5Var.d().c("Failed to show four seasons notification", e);
                                z4 = false;
                            } catch (Throwable th) {
                                th = th;
                                obj = null;
                                d99Var2.h(obj);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = null;
                            d99Var2.h(obj);
                            throw th;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        d99Var2.h(null);
                        return boolValueOf;
                    }
                    z2 = kv5Var.Z$0;
                    d99Var = (d99) kv5Var.L$2;
                    yicVar2 = (yic) kv5Var.L$1;
                    context2 = (Context) kv5Var.L$0;
                    jzb.q(objF);
                }
                if (strA == null) {
                    Boolean bool = Boolean.FALSE;
                    d99Var.h(null);
                    return bool;
                }
                if (yicVar2.b() == null) {
                    Boolean bool2 = Boolean.FALSE;
                    d99Var.h(null);
                    return bool2;
                }
                hs3 hs3Var = xqa.A;
                lv5 lv5Var = new lv5(hs3Var.a, hs3Var.b, null);
                nu4 nu4Var = nu4.a;
                Object objI = z5c.I(nu4Var, lv5Var);
                if (v4e.Q((String) objI)) {
                    objI = null;
                }
                String str = (String) objI;
                if (str == null) {
                    Boolean bool3 = Boolean.FALSE;
                    d99Var.h(null);
                    return bool3;
                }
                if (z2) {
                    hs3 hs3Var2 = xqa.X0;
                    if (((Boolean) z5c.I(nu4Var, new mv5(hs3Var2.a, hs3Var2.b, null))).booleanValue()) {
                        if (!pa7.t(k(), yicVar2)) {
                        }
                    }
                    Boolean bool4 = Boolean.FALSE;
                    d99Var.h(null);
                    return bool4;
                }
                hpc hpcVarA = jpc.a(yicVar2);
                if (hpcVarA == null) {
                    qv5Var.d().g("Seasonal reminder content unavailable for ".concat(strA));
                    Boolean bool5 = Boolean.FALSE;
                    d99Var.h(null);
                    return bool5;
                }
                nh9 nh9Var = new nh9(context2);
                NotificationManager notificationManager = nh9Var.b;
                if (!notificationManager.areNotificationsEnabled()) {
                    qv5Var.d().g("Seasonal reminder notifications disabled for ".concat(strA));
                    Boolean bool6 = Boolean.FALSE;
                    d99Var.h(null);
                    return bool6;
                }
                notificationManager.createNotificationChannel(new NotificationChannel("four_seasons_reminder", context2.getString(R.string.four_seasons_notification_channel_name), 4));
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("four_seasons_reminder");
                if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                    qv5Var.d().g("Seasonal reminder notification channel disabled for ".concat(strA));
                    Boolean bool7 = Boolean.FALSE;
                    d99Var.h(null);
                    return bool7;
                }
                Intent launchIntentForPackage = context2.getPackageManager().getLaunchIntentForPackage(context2.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.setFlags(603979776);
                    launchIntentForPackage.putExtra("triggered_by", "four_seasons");
                    launchIntentForPackage.putExtra("seasonal_year", yicVar2.a);
                    launchIntentForPackage.putExtra("seasonal_term", yicVar2.b.getWireValue());
                } else {
                    launchIntentForPackage = null;
                }
                PendingIntent activity = launchIntentForPackage != null ? PendingIntent.getActivity(context2, h(yicVar2), launchIntentForPackage, 201326592) : null;
                ih9 ih9Var = new ih9(context2, "four_seasons_reminder");
                ih9Var.e = ih9.b(context2.getString(hpcVarA.a));
                ih9Var.f = ih9.b(context2.getString(hpcVarA.b));
                if (activity != null) {
                    ih9Var.g = activity;
                }
                ih9Var.v.icon = R.drawable.notification_small_icon;
                ih9Var.p = "recommendation";
                mic micVarB = yicVar2.b();
                int i4 = micVarB == null ? -1 : cv5.a[micVarB.ordinal()];
                if (i4 == -1) {
                    i = 0;
                } else if (i4 == 1) {
                    i = -7235563;
                } else {
                    if (i4 != 2) {
                        throw new rf9();
                    }
                    i = -6788075;
                }
                ih9Var.r = i;
                z3 = true;
                ih9Var.n = true;
                ih9Var.o = true;
                ih9Var.c(16, true);
                Notification notificationA = ih9Var.a();
                notificationA.getClass();
                try {
                    nh9Var.a(h(yicVar2), notificationA);
                    kv5Var.L$0 = null;
                    kv5Var.L$1 = null;
                    kv5Var.L$2 = d99Var;
                    kv5Var.L$3 = null;
                    kv5Var.L$4 = null;
                    kv5Var.L$5 = null;
                    kv5Var.L$6 = null;
                    kv5Var.L$7 = null;
                    kv5Var.L$8 = null;
                    kv5Var.L$9 = null;
                    kv5Var.Z$0 = z2;
                    kv5Var.label = 2;
                    objF = qv5Var.f(yicVar2, str, kv5Var);
                    if (objF == bw2Var) {
                        return bw2Var;
                    }
                    if (!((Boolean) objF).booleanValue()) {
                        qv5Var.d().b("Notification delivered but campaign delivery state was not persisted");
                    }
                    z4 = z3;
                    d99Var2 = d99Var;
                } catch (SecurityException e3) {
                    e = e3;
                    d99Var2 = d99Var;
                    qv5Var.d().c("Failed to show four seasons notification", e);
                    z4 = false;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z4);
                d99Var2.h(null);
                return boolValueOf2;
            } catch (Throwable th3) {
                th = th3;
                obj = null;
                d99Var2 = d99Var;
                d99Var2.h(obj);
                throw th;
            }
            strA = yicVar2.a();
        } catch (Throwable th4) {
            th = th4;
            d99Var2 = d99Var;
            obj = null;
            d99Var2.h(obj);
            throw th;
        }
    }
}
