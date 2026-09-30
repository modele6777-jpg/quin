package defpackage;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xs5 {
    public static final LocalDateTime a;
    public static final LocalDateTime b;

    static {
        LocalDateTime localDateTimeOf = LocalDateTime.of(2026, 6, 21, 0, 0);
        localDateTimeOf.getClass();
        a = localDateTimeOf;
        LocalDateTime localDateTimeOf2 = LocalDateTime.of(2026, 6, 22, 0, 0);
        localDateTimeOf2.getClass();
        b = localDateTimeOf2;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    public static qs5 a(ax5 ax5Var, mic micVar, boolean z, int i) {
        btd btdVar = btd.a;
        btd btdVar2 = btd.c;
        qs5 qs5Var = qs5.d;
        jy4 jy4Var = qs5.a;
        qs5 qs5Var2 = qs5.x;
        qs5 qs5Var3 = qs5.f;
        qs5 qs5Var4 = qs5.y;
        btd btdVar3 = btd.b;
        Long l = g3b.a;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        LocalDateTime localDateTimeA = g3b.a(zoneIdSystemDefault);
        boolean z2 = (i & 8) != 0 ? false : z;
        ax5Var.getClass();
        micVar.getClass();
        if (micVar == mic.SummerSolstice2026) {
            ca2.a.getClass();
            if (ca2.c) {
                return qs5Var4;
            }
        }
        int iOrdinal = micVar.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = micVar.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    ap.c();
                    return null;
                }
                int iOrdinal3 = cr0.c(localDateTimeA).ordinal();
                if (iOrdinal3 != 0 && iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        if (iOrdinal3 != 3) {
                            ap.c();
                            return null;
                        }
                        btdVar = btdVar2;
                    } else {
                        btdVar = btdVar3;
                    }
                }
            } else if (!localDateTimeA.isBefore(a)) {
                if (localDateTimeA.isBefore(b)) {
                    btdVar = btdVar3;
                } else {
                    btdVar = btdVar2;
                }
            }
            jy4Var.getClass();
            return jy4.u(btdVar, ax5Var);
        }
        if (iOrdinal != 1) {
            ap.c();
            return null;
        }
        int iOrdinal4 = cr0.c(localDateTimeA).ordinal();
        if (iOrdinal4 == 0) {
            return br0.a[ax5Var.ordinal()] == 5 ? qs5.b : qs5Var;
        }
        if (iOrdinal4 == 1) {
            return br0.a[ax5Var.ordinal()] == 5 ? qs5.c : qs5Var;
        }
        if (iOrdinal4 == 2) {
            jy4Var.getClass();
            return jy4.u(btdVar3, ax5Var);
        }
        if (iOrdinal4 != 3) {
            ap.c();
            return null;
        }
        int iOrdinal5 = ax5Var.ordinal();
        if (iOrdinal5 == 0) {
            return qs5Var4;
        }
        if (iOrdinal5 == 1) {
            return cr0.a(ax5Var, z2) ? qs5Var3 : qs5Var2;
        }
        if (iOrdinal5 == 2) {
            return cr0.a(ax5Var, z2) ? qs5.g : qs5Var2;
        }
        if (iOrdinal5 == 3) {
            return qs5Var3;
        }
        if (iOrdinal5 == 4) {
            return qs5.w;
        }
        ap.c();
        return null;
    }

    public static Long b(mic micVar, int i) {
        Long l = g3b.a;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        LocalDateTime localDateTimeA = g3b.a(zoneIdSystemDefault);
        if ((i & 2) != 0) {
            mic.a.getClass();
            micVar = mic.b;
        }
        micVar.getClass();
        int iOrdinal = micVar.ordinal();
        if (iOrdinal == 0) {
            LocalDateTime localDateTime = a;
            if (localDateTimeA.isBefore(localDateTime)) {
                return Long.valueOf(Duration.between(localDateTimeA, localDateTime).toMillis());
            }
            LocalDateTime localDateTime2 = b;
            if (localDateTimeA.isBefore(localDateTime2)) {
                return Long.valueOf(Duration.between(localDateTimeA, localDateTime2).toMillis());
            }
        } else {
            if (iOrdinal != 1) {
                ap.c();
                return null;
            }
            LocalDateTime localDateTime3 = cr0.a;
            if (!localDateTimeA.isBefore(localDateTime3)) {
                localDateTime3 = cr0.b;
                if (!localDateTimeA.isBefore(localDateTime3)) {
                    localDateTime3 = cr0.c;
                    if (!localDateTimeA.isBefore(localDateTime3)) {
                        localDateTime3 = null;
                    }
                }
            }
            if (localDateTime3 != null) {
                return Long.valueOf(Duration.between(localDateTimeA, localDateTime3).toMillis());
            }
        }
        return null;
    }

    public static void c(boolean z) {
        hs3 hs3Var = xqa.v;
        Boolean boolValueOf = Boolean.valueOf(z);
        ynb.V(lw2.a, null, null, new ws5(hs3Var.a, boolValueOf, null), 3);
    }
}
