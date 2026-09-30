package defpackage;

import ai.askquin.notification.DailyNotificationSchedulerReceiver;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y93 implements hf8 {
    public static final y93 a = new y93();

    public static iy9 e() {
        List list = bsa.a;
        LocalTime localTimeK = k99.K(bsa.d(xqa.i));
        if (localTimeK == null) {
            return null;
        }
        return new iy9(Integer.valueOf(localTimeK.getHour()), Integer.valueOf(localTimeK.getMinute()));
    }

    public static iy9 f() {
        List list = bsa.a;
        LocalTime localTimeK = k99.K(bsa.d(xqa.k));
        if (localTimeK == null) {
            return null;
        }
        return new iy9(Integer.valueOf(localTimeK.getHour()), Integer.valueOf(localTimeK.getMinute()));
    }

    public static iy9 g() {
        List list = bsa.a;
        LocalTime localTimeK = k99.K(bsa.d(xqa.l));
        if (localTimeK == null) {
            return null;
        }
        LocalTime localTime = lze.a;
        LocalTime localTimeA = lze.a(localTimeK.getHour(), localTimeK.getMinute());
        if (localTimeA != null) {
            return new iy9(Integer.valueOf(localTimeA.getHour()), Integer.valueOf(localTimeA.getMinute()));
        }
        return null;
    }

    public static iy9 h() {
        List list = bsa.a;
        LocalTime localTimeK = k99.K(bsa.d(xqa.j));
        if (localTimeK == null) {
            return null;
        }
        LocalTime localTime = lze.a;
        LocalTime localTimeA = lze.a(localTimeK.getHour(), localTimeK.getMinute());
        if (localTimeA != null) {
            return new iy9(Integer.valueOf(localTimeA.getHour()), Integer.valueOf(localTimeA.getMinute()));
        }
        return null;
    }

    public static void k(Context context, boolean z) {
        context.getClass();
        LocalDate localDateNow = LocalDate.now();
        ya3 ya3Var = ya3.Today;
        LocalDate localDatePlusDays = localDateNow.plusDays(ya3Var.c());
        Intent intent = new Intent(context, (Class<?>) DailyNotificationSchedulerReceiver.class);
        intent.putExtra("test", z);
        intent.putExtra("bypass_daily_fortune_completion_suppression", true);
        intent.putExtra("daily_reminder_kind", ya3Var.d());
        intent.putExtra("daily_fortune_target_date", localDatePlusDays.toString());
        context.sendBroadcast(intent);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, zn2 zn2Var) {
        t93 t93Var;
        if (zn2Var instanceof t93) {
            t93Var = (t93) zn2Var;
            int i = t93Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                t93Var.label = i - Integer.MIN_VALUE;
            } else {
                t93Var = new t93(this, zn2Var);
            }
        } else {
            t93Var = new t93(this, zn2Var);
        }
        Object obj = t93Var.result;
        int i2 = t93Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            t93Var.L$0 = context;
            t93Var.label = 1;
            List list = bsa.a;
            Object objG = bsa.g(xqa.i, xqa.k, new zea(10), t93Var);
            bw2 bw2Var = bw2.a;
            if (objG == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = (Context) t93Var.L$0;
            jzb.q(obj);
        }
        b(context, ya3.Today);
        return wef.a;
    }

    public final void b(Context context, ya3 ya3Var) {
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        AlarmManager alarmManager = (AlarmManager) systemService;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, ya3Var.b(), new Intent(context, (Class<?>) DailyNotificationSchedulerReceiver.class), 603979776);
        if (broadcast != null) {
            alarmManager.cancel(broadcast);
        }
        d().e("Cleared " + ya3Var.d() + " notification schedule");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Context context, zn2 zn2Var) {
        u93 u93Var;
        if (zn2Var instanceof u93) {
            u93Var = (u93) zn2Var;
            int i = u93Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                u93Var.label = i - Integer.MIN_VALUE;
            } else {
                u93Var = new u93(this, zn2Var);
            }
        } else {
            u93Var = new u93(this, zn2Var);
        }
        Object obj = u93Var.result;
        int i2 = u93Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            u93Var.L$0 = context;
            u93Var.label = 1;
            List list = bsa.a;
            Object objG = bsa.g(xqa.j, xqa.l, new zea(9), u93Var);
            bw2 bw2Var = bw2.a;
            if (objG == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = (Context) u93Var.L$0;
            jzb.q(obj);
        }
        b(context, ya3.Tomorrow);
        return wef.a;
    }

    public final void i(Context context, ya3 ya3Var) {
        iy9 iy9VarE;
        context.getClass();
        int iOrdinal = ya3Var.ordinal();
        if (iOrdinal == 0) {
            iy9VarE = e();
        } else {
            if (iOrdinal != 1) {
                ap.c();
                return;
            }
            iy9VarE = h();
        }
        LocalTime localTimeOf = iy9VarE != null ? LocalTime.of(((Number) iy9VarE.a()).intValue(), ((Number) iy9VarE.b()).intValue()) : null;
        if (localTimeOf == null) {
            b(context, ya3Var);
        } else {
            j(context, ya3Var, localTimeOf);
        }
    }

    public final void j(Context context, ya3 ya3Var, LocalTime localTime) {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        localDateTimeNow.getClass();
        long jC = ya3Var.c();
        localTime.getClass();
        int iCompareTo = localDateTimeNow.toLocalTime().compareTo(localTime);
        LocalDate localDate = localDateTimeNow.toLocalDate();
        if (iCompareTo >= 0) {
            localDate = localDate.plusDays(1L);
        }
        LocalDateTime localDateTimeAtTime = localDate.atTime(localTime);
        localDateTimeAtTime.getClass();
        LocalDate localDatePlusDays = localDate.plusDays(jC);
        localDatePlusDays.getClass();
        d().e("Scheduling " + ya3Var.d() + " notification at " + localDateTimeAtTime + " for " + localDatePlusDays);
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        Intent intent = new Intent(context, (Class<?>) DailyNotificationSchedulerReceiver.class);
        intent.putExtra("daily_reminder_kind", ya3Var.d());
        intent.putExtra("daily_fortune_target_date", localDatePlusDays.toString());
        ((AlarmManager) systemService).set(1, localDateTimeAtTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(), PendingIntent.getBroadcast(context, ya3Var.b(), intent, 201326592));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(Context context, int i, int i2, zn2 zn2Var) {
        v93 v93Var;
        if (zn2Var instanceof v93) {
            v93Var = (v93) zn2Var;
            int i3 = v93Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v93Var.label = i3 - Integer.MIN_VALUE;
            } else {
                v93Var = new v93(this, zn2Var);
            }
        } else {
            v93Var = new v93(this, zn2Var);
        }
        Object obj = v93Var.result;
        int i4 = v93Var.label;
        if (i4 == 0) {
            jzb.q(obj);
            if (k99.K(i + ":" + i2) == null) {
                qc0.o(ks0.k("Invalid daily reminder time: ", i, ":", i2));
                return null;
            }
            v93Var.L$0 = context;
            v93Var.I$0 = i;
            v93Var.I$1 = i2;
            v93Var.label = 1;
            List list = bsa.a;
            Object objM = bsa.m(xqa.i, xqa.k, i + ":" + i2, v93Var);
            bw2 bw2Var = bw2.a;
            if (objM == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i4 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = v93Var.I$1;
            i = v93Var.I$0;
            context = (Context) v93Var.L$0;
            jzb.q(obj);
        }
        LocalTime localTimeOf = LocalTime.of(i, i2);
        localTimeOf.getClass();
        j(context, ya3.Today, localTimeOf);
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9 A[PHI: r1
  0x00f9: PHI (r1v15 java.time.LocalTime) = (r1v10 java.time.LocalTime), (r1v19 java.time.LocalTime) binds: [B:51:0x011b, B:45:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(Context context, LocalTime localTime, LocalTime localTime2, zn2 zn2Var) {
        w93 w93Var;
        LocalTime localTime3;
        LocalTime localTimeA;
        LocalTime localTimeOf;
        LocalTime localTimeOf2;
        LocalTime localTimeOf3;
        String str;
        String str2;
        if (zn2Var instanceof w93) {
            w93Var = (w93) zn2Var;
            int i = w93Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                w93Var.label = i - Integer.MIN_VALUE;
            } else {
                w93Var = new w93(this, zn2Var);
            }
        } else {
            w93Var = new w93(this, zn2Var);
        }
        Object obj = w93Var.result;
        int i2 = w93Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            if (localTime != null) {
                int hour = localTime.getHour();
                int minute = localTime.getMinute();
                StringBuilder sb = new StringBuilder();
                sb.append(hour);
                sb.append(":");
                sb.append(minute);
                localTime3 = k99.K(sb.toString()) != null ? localTime : null;
                if (localTime3 == null) {
                    if (localTime == null) {
                        return Boolean.FALSE;
                    }
                    localTime3 = null;
                }
            } else {
                if (localTime == null) {
                    return Boolean.FALSE;
                }
                localTime3 = null;
            }
            if (localTime2 != null) {
                LocalTime localTime4 = lze.a;
                localTimeA = lze.a(localTime2.getHour(), localTime2.getMinute());
                if (localTimeA == null) {
                    return Boolean.FALSE;
                }
            } else {
                localTimeA = null;
            }
            iy9 iy9VarE = e();
            if (iy9VarE == null || (localTimeOf = LocalTime.of(((Number) iy9VarE.a()).intValue(), ((Number) iy9VarE.b()).intValue())) == null) {
                if (localTime3 != null) {
                    iy9 iy9VarF = f();
                    if (iy9VarF != null && (localTimeOf2 = LocalTime.of(((Number) iy9VarF.a()).intValue(), ((Number) iy9VarF.b()).intValue())) != null) {
                        localTime3 = localTimeOf2;
                    }
                    localTimeOf = localTime3;
                } else {
                    localTimeOf = null;
                }
            }
            iy9 iy9VarH = h();
            if (iy9VarH != null && (localTimeOf3 = LocalTime.of(((Number) iy9VarH.a()).intValue(), ((Number) iy9VarH.b()).intValue())) != null) {
                localTimeA = localTimeOf3;
            } else if (localTimeA != null) {
                iy9 iy9VarG = g();
                if (iy9VarG != null && (localTimeOf3 = LocalTime.of(((Number) iy9VarG.a()).intValue(), ((Number) iy9VarG.b()).intValue())) != null) {
                    localTimeA = localTimeOf3;
                }
            } else {
                localTimeA = null;
            }
            if (localTimeOf != null) {
                str = localTimeOf.getHour() + ":" + localTimeOf.getMinute();
            } else {
                str = null;
            }
            if (localTimeA != null) {
                str2 = localTimeA.getHour() + ":" + localTimeA.getMinute();
            } else {
                str2 = null;
            }
            w93Var.L$0 = context;
            w93Var.L$1 = null;
            w93Var.L$2 = null;
            w93Var.L$3 = null;
            w93Var.L$4 = null;
            w93Var.L$5 = localTimeOf;
            w93Var.L$6 = localTimeA;
            w93Var.label = 1;
            Object objL = bsa.l(str, str2, w93Var);
            bw2 bw2Var = bw2.a;
            if (objL == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            LocalTime localTime5 = (LocalTime) w93Var.L$6;
            LocalTime localTime6 = (LocalTime) w93Var.L$5;
            Context context2 = (Context) w93Var.L$0;
            jzb.q(obj);
            localTimeA = localTime5;
            context = context2;
            localTimeOf = localTime6;
        }
        ya3 ya3Var = ya3.Today;
        if (localTimeOf != null) {
            j(context, ya3Var, localTimeOf);
        } else {
            b(context, ya3Var);
        }
        ya3 ya3Var2 = ya3.Tomorrow;
        if (localTimeA != null) {
            j(context, ya3Var2, localTimeA);
        } else {
            b(context, ya3Var2);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(Context context, int i, int i2, zn2 zn2Var) {
        x93 x93Var;
        LocalTime localTimeA;
        if (zn2Var instanceof x93) {
            x93Var = (x93) zn2Var;
            int i3 = x93Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x93Var.label = i3 - Integer.MIN_VALUE;
            } else {
                x93Var = new x93(this, zn2Var);
            }
        } else {
            x93Var = new x93(this, zn2Var);
        }
        Object obj = x93Var.result;
        int i4 = x93Var.label;
        if (i4 == 0) {
            jzb.q(obj);
            localTimeA = lze.a(i, i2);
            if (localTimeA == null) {
                return Boolean.FALSE;
            }
            String str = i + ":" + i2;
            x93Var.L$0 = context;
            x93Var.L$1 = localTimeA;
            x93Var.I$0 = i;
            x93Var.I$1 = i2;
            x93Var.label = 1;
            List list = bsa.a;
            Object objM = bsa.m(xqa.j, xqa.l, str, x93Var);
            bw2 bw2Var = bw2.a;
            if (objM == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i4 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            LocalTime localTime = (LocalTime) x93Var.L$1;
            Context context2 = (Context) x93Var.L$0;
            jzb.q(obj);
            localTimeA = localTime;
            context = context2;
        }
        j(context, ya3.Tomorrow, localTimeA);
        return Boolean.TRUE;
    }
}
