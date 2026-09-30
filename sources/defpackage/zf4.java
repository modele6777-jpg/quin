package defpackage;

import java.util.Set;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zf4 {
    public static final long[] a = {0, 1000, 2000, 4000, 8000, 10000, 10000};
    public static final Set b = qd0.I0(new String[]{UsageBillingBalance.SOURCE_VIP_MONTH, UsageBillingBalance.SOURCE_VIP_YEAR, UsageBillingBalance.SOURCE_VIP_WEEK});
    public static final Set c = qd0.I0(new String[]{UsageBillingBalance.SOURCE_ADDON_A, UsageBillingBalance.SOURCE_ADDON_B});

    public static final v27 a(yc4 yc4Var) {
        return new v27(new ec4(yc4Var.a, yc4Var.c, yc4Var.d, yc4Var.f, yc4Var.g, yc4Var.e, yc4Var.i, yc4Var.j, yc4Var.k, yc4Var.l, yc4Var.m, yc4Var.n, yc4Var.o, yc4Var.s, yc4Var.b), new sc3(2, yc4Var.h));
    }

    public static final boolean b(Throwable th) {
        th.getClass();
        Throwable thB = nzc.b(th);
        jzc jzcVar = thB instanceof jzc ? (jzc) thB : null;
        if (jzcVar == null) {
            return false;
        }
        String message = jzcVar.getMessage();
        if (message == null) {
            message = "";
        }
        return jzcVar.getCode() == 400 && c5e.C(v4e.o0(message).toString(), "clarifying card already drawn", true);
    }

    public static final boolean c(Throwable th) {
        th.getClass();
        Throwable thB = nzc.b(th);
        jzc jzcVar = thB instanceof jzc ? (jzc) thB : null;
        if (jzcVar != null && jzcVar.getCode() == 400) {
            String message = jzcVar.getMessage();
            if (message == null) {
                message = "";
            }
            if (c5e.v(v4e.o0(message).toString(), "Reading already created", true)) {
                return true;
            }
        }
        return false;
    }
}
