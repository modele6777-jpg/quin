package defpackage;

import android.content.Context;
import android.os.UserManager;
import com.adjust.sdk.sig.r3;
import java.io.InputStream;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.LimitedQuota;
import tech.chatmind.api.Period;
import tech.chatmind.api.PeriodUnit;
import tech.chatmind.api.TimesMembership;
import tech.chatmind.api.credits.LevelAndKind;
import tech.chatmind.api.credits.QuinSubscription;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;
import tech.chatmind.api.credits.SubscriptionKind;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class drb implements wdh {
    public static final void a(c4c c4cVar, rf0 rf0Var, l46 l46Var, int i) {
        int i2;
        rf0Var.getClass();
        l46Var.h0(1246740314);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (l46Var.g(c4cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(rf0Var) ? 32 : 16;
        }
        int i4 = 1;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            int i5 = i2 & 112;
            boolean z = i5 == 32;
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z || objR == i8cVar) {
                objR = new sf0(rf0Var, 3);
                l46Var.p0(objR);
            }
            a26 a26Var = (a26) objR;
            boolean z2 = i5 == 32;
            Object objR2 = l46Var.R();
            if (z2 || objR2 == i8cVar) {
                objR2 = new sf0(rf0Var, i3);
                l46Var.p0(objR2);
            }
            qde.a(c4cVar, null, a26Var, (a26) objR2, l46Var, i2 & 14);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mgb(c4cVar, rf0Var, i, i4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.time.LocalDateTime] */
    public static final QuinSubscription b(QuotaUsage quotaUsage) {
        Instant instantNow;
        o7e subscriptionLevel;
        SubscriptionKind subscriptionKind;
        String expiredAt;
        TimesMembership timesMembership;
        List<LimitedQuota> limitedQuotaList;
        List<LimitedQuota> limitedQuotaList2;
        LimitedQuota limitedQuota;
        SubscriptionInfo subscription;
        SubscriptionInfo subscription2;
        Period period;
        SubscriptionInfo subscription3;
        if (quotaUsage == null || (subscription3 = quotaUsage.getSubscription()) == null || (instantNow = subscription3.expiredAt()) == null) {
            instantNow = Instant.now();
        }
        ?? localDateTime = instantNow.atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime localDateTimeC = null;
        PeriodUnit periodUnitG = (quotaUsage == null || (subscription2 = quotaUsage.getSubscription()) == null || (period = subscription2.getPeriod()) == null) ? null : g(period);
        o7e o7eVar = o7e.d;
        if (quotaUsage == null || (subscription = quotaUsage.getSubscription()) == null || (subscriptionLevel = subscription.getSubscriptionLevel()) == null) {
            subscriptionLevel = o7eVar;
        }
        if (periodUnitG != null) {
            int i = p7e.a[periodUnitG.ordinal()];
            if (i != 1) {
                subscriptionKind = i != 2 ? SubscriptionKind.Month : SubscriptionKind.Year;
            } else {
                subscriptionKind = SubscriptionKind.Quarter;
            }
            return new QuinSubscription(new LevelAndKind(subscriptionLevel, subscriptionKind), localDateTime);
        }
        if (quotaUsage == null || (limitedQuotaList2 = quotaUsage.getLimitedQuotaList()) == null || (limitedQuota = (LimitedQuota) s72.x0(limitedQuotaList2)) == null || (expiredAt = limitedQuota.getExpiredAt()) == null) {
            expiredAt = (quotaUsage == null || (timesMembership = quotaUsage.getTimesMembership()) == null) ? null : timesMembership.getExpiredAt();
        }
        if (((quotaUsage == null || (limitedQuotaList = quotaUsage.getLimitedQuotaList()) == null) ? null : (LimitedQuota) s72.x0(limitedQuotaList)) == null) {
            if ((quotaUsage != null ? quotaUsage.getTimesMembership() : null) == null) {
                return null;
            }
        }
        LevelAndKind levelAndKind = new LevelAndKind(o7eVar, SubscriptionKind.Count);
        if (expiredAt != null) {
            th5 th5Var = cye.b;
            th5Var.getClass();
            w57 w57Var = w57.a;
            localDateTimeC = gcc.E(mh3.Q(expiredAt), th5Var).c();
        }
        return new QuinSubscription(levelAndKind, localDateTimeC);
    }

    public static final List d(QuotaUsage quotaUsage) {
        SubscriptionInfo subscription;
        Period period;
        PeriodUnit periodUnitG;
        u7e u7eVar = u7e.b;
        u7e u7eVar2 = u7e.c;
        List listI = t72.I(u7eVar, u7eVar2);
        List listI2 = t72.I(u7e.d, u7eVar2);
        List listH = t72.H(u7eVar2);
        if (quotaUsage != null && (subscription = quotaUsage.getSubscription()) != null && (period = subscription.getPeriod()) != null && (periodUnitG = g(period)) != null) {
            if (subscription.getSubscriptionLevel() != o7e.d) {
                if (periodUnitG != PeriodUnit.YEAR) {
                    if (periodUnitG != PeriodUnit.WEEK && periodUnitG != PeriodUnit.DAY) {
                        return listH;
                    }
                }
                return pu4.a;
            }
            int i = p7e.a[periodUnitG.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return listI2;
                }
                return pu4.a;
            }
            return listH;
        }
        return listI;
    }

    public static String e(y61 y61Var) {
        StringBuilder sb = new StringBuilder(y61Var.size());
        for (int i = 0; i < y61Var.size(); i++) {
            byte bA = y61Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        sb.append("\\n");
                        break;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        sb.append("\\f");
                        break;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static yic f(int i, String str) {
        Object next;
        if (i > 0) {
            Iterator<E> it = SolarTerm.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!pa7.t(((SolarTerm) next).getWireValue(), str));
            SolarTerm solarTerm = (SolarTerm) next;
            if (solarTerm != null) {
                if (solarTerm == SolarTerm.UNKNOWN) {
                    solarTerm = null;
                }
                if (solarTerm != null) {
                    return new yic(i, solarTerm);
                }
            }
        }
        return null;
    }

    public static final PeriodUnit g(Period period) {
        period.getClass();
        Integer count = period.getCount();
        return (count != null && count.intValue() == 3 && period.getUnit() == PeriodUnit.MONTH) ? PeriodUnit.QUARTER : period.getUnit();
    }

    public static boolean h(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final o4d i(o4d o4dVar, o4d o4dVar2, float f) {
        return new o4d(abg.R(o4dVar.a, o4dVar2.a, f), ynb.W(o4dVar.b, o4dVar2.b, f), abg.P(o4dVar.c, o4dVar2.c, f));
    }

    public static List j(opd opdVar, int i, opd opdVar2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iT = opdVar.t(i);
        int i2 = i + iT;
        int iF = opdVar.f(opdVar.b, opdVar.q(i));
        int iF2 = opdVar.f(opdVar.b, opdVar.q(i2));
        int i3 = iF2 - iF;
        boolean z5 = i >= 0 && (opdVar.b[(opdVar.q(i) * 5) + 1] & 201326592) != 0;
        opdVar2.v(iT);
        opdVar2.w(i3, opdVar2.t);
        if (opdVar.g < i2) {
            opdVar.A(i2);
        }
        if (opdVar.k < iF2) {
            opdVar.B(iF2, i2);
        }
        int[] iArr = opdVar2.b;
        int i4 = opdVar2.t;
        int i5 = i4 * 5;
        qd0.Y(i5, i * 5, i2 * 5, opdVar.b, iArr);
        Object[] objArr = opdVar2.c;
        int i6 = opdVar2.i;
        System.arraycopy(opdVar.c, iF, objArr, i6, i3);
        int i7 = opdVar2.v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iT;
        int iF3 = i6 - opdVar2.f(iArr, i4);
        int i10 = opdVar2.m;
        int i11 = opdVar2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = opd.h(opdVar2.f(iArr, i13) + iF3, i12 < i13 ? 0 : opdVar2.k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        opdVar2.m = i12;
        int iB = npd.b(opdVar.d, i, opdVar.o());
        int iB2 = npd.b(opdVar.d, i2, opdVar.o());
        if (iB < iB2) {
            ArrayList arrayList = opdVar.d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i15 = iB; i15 < iB2; i15++) {
                f46 f46Var = (f46) arrayList.get(i15);
                f46Var.a += i8;
                arrayList2.add(f46Var);
            }
            opdVar2.d.addAll(npd.b(opdVar2.d, opdVar2.t, opdVar2.o()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = pu4.a;
        }
        if (!list.isEmpty()) {
            HashMap map = opdVar.e;
            HashMap map2 = opdVar2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = opdVar2.v;
        opdVar2.P(i7);
        int iF4 = opdVar.F(opdVar.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iF4 >= 0;
            if (z7) {
                opdVar.Q();
                opdVar.a(iF4 - opdVar.t);
                opdVar.Q();
            }
            opdVar.a(i - opdVar.t);
            boolean zI = opdVar.I();
            if (z7) {
                opdVar.N();
                opdVar.i();
                opdVar.N();
                opdVar.i();
            }
            z4 = zI;
        } else {
            boolean zJ = opdVar.J(i, iT);
            opdVar.K(iF, i3, i - 1);
            z4 = zJ;
        }
        if (z4) {
            wf2.a("Unexpectedly removed anchors");
        }
        int i18 = opdVar2.o;
        int i19 = iArr3[i5 + 1];
        opdVar2.o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            opdVar2.t = i9;
            opdVar2.i = i6 + i3;
        }
        if (z6) {
            opdVar2.V(i7);
        }
        return list;
    }

    public static final Object k(wg7 wg7Var, String str, ti7 ti7Var, xn7 xn7Var) {
        wg7Var.getClass();
        str.getClass();
        return new dj7(wg7Var, ti7Var, str, xn7Var.e()).h(xn7Var);
    }

    public static yic l(String str, Integer num) {
        yic yicVarM = m(str, num);
        if (yicVarM == null) {
            return null;
        }
        mic.a.getClass();
        if (s72.o0(qd0.I0(new mic[]{mic.SummerSolstice2026, mic.b}), yicVarM.b())) {
            return yicVarM;
        }
        return null;
    }

    public static yic m(String str, Integer num) {
        yic yicVarF;
        if (num == null && str == null) {
            return yic.c;
        }
        if (num == null || str == null || (yicVarF = f(num.intValue(), str)) == null || yicVarF.b() == null || yicVarF.a() == null) {
            return null;
        }
        return yicVarF;
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        r82.g(str.concat(" must not be null"));
    }

    public static final InputStream o(vdh vdhVar) {
        ieh iehVarA = vdhVar.a.a(vdhVar.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iehVarA);
        ArrayList arrayList2 = vdhVar.c;
        if (!arrayList2.isEmpty()) {
            int i = tdh.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw kv2.g(it);
            }
            tdh tdhVar = !arrayList3.isEmpty() ? new tdh(iehVarA, arrayList3) : null;
            if (tdhVar != null) {
                arrayList.add(tdhVar);
            }
        }
        Iterator it2 = vdhVar.b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        }
        if (it2.next() != null) {
            r3.f();
            return null;
        }
        throw null;
    }
}
