package ai.askquin.ui.paywall.upgrade;

import defpackage.aw2;
import defpackage.bm8;
import defpackage.bsa;
import defpackage.bw2;
import defpackage.ca2;
import defpackage.d99;
import defpackage.dg7;
import defpackage.dw2;
import defpackage.eab;
import defpackage.eh5;
import defpackage.eqa;
import defpackage.f99;
import defpackage.fab;
import defpackage.fzc;
import defpackage.hf8;
import defpackage.hs3;
import defpackage.ih5;
import defpackage.iy9;
import defpackage.jzb;
import defpackage.lh5;
import defpackage.lyd;
import defpackage.mh5;
import defpackage.mo3;
import defpackage.n16;
import defpackage.n3d;
import defpackage.nu4;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.q9b;
import defpackage.qc0;
import defpackage.qh6;
import defpackage.qu4;
import defpackage.rab;
import defpackage.rp3;
import defpackage.s72;
import defpackage.t7;
import defpackage.t72;
import defpackage.v4e;
import defpackage.wef;
import defpackage.xh7;
import defpackage.xqa;
import defpackage.ynb;
import defpackage.z5c;
import defpackage.zn2;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.function.BiFunction;
import tech.chatmind.api.LimitedQuota;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements lh5, hf8 {
    public static final /* synthetic */ int g = 0;
    public final t7 a;
    public final q9b b;
    public final fab c;
    public final aw2 d;
    public final f99 e = new f99();
    public final LinkedHashMap f = new LinkedHashMap();

    public s(t7 t7Var, q9b q9bVar, fab fabVar, aw2 aw2Var, mh5 mh5Var) {
        this.a = t7Var;
        this.b = q9bVar;
        this.c = fabVar;
        this.d = aw2Var;
    }

    public static boolean g(FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState, QuotaUsage quotaUsage, Set set, Instant instant) {
        String str;
        Object next;
        FiveCardUpgradePending pending = fiveCardUpgradeManager$ReadingState.getPending();
        if (pending == null || (str = (String) s72.x0(pending.getOrderIds())) == null) {
            return false;
        }
        List<String> orderIds = pending.getOrderIds();
        if (orderIds == null || !orderIds.isEmpty()) {
            Iterator<T> it = orderIds.iterator();
            while (it.hasNext()) {
                if (set.contains((String) it.next())) {
                    return false;
                }
            }
        }
        if (pending.getRemainingReadings() == 0) {
            return true;
        }
        List<String> orderIds2 = pending.getOrderIds();
        List<LimitedQuota> list = pu4.a;
        if (orderIds2 == null || !orderIds2.isEmpty()) {
            for (String str2 : orderIds2) {
                List<LimitedQuota> before = fiveCardUpgradeManager$ReadingState.getBefore();
                if (before == null) {
                    before = list;
                }
                if (before.isEmpty()) {
                    return false;
                }
                for (LimitedQuota limitedQuota : before) {
                    if (!pa7.t(limitedQuota.getOrderId(), str2) || !n16.H(limitedQuota, instant)) {
                    }
                }
                return false;
            }
        }
        List<LimitedQuota> limitedQuotaList = quotaUsage.getLimitedQuotaList();
        if (limitedQuotaList != null) {
            list = limitedQuotaList;
        }
        Iterator<T> it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!pa7.t(((LimitedQuota) next).getOrderId(), str));
        LimitedQuota limitedQuota2 = (LimitedQuota) next;
        if (limitedQuota2 == null) {
            return pending.getRemainingReadings() == 0;
        }
        return n16.J(limitedQuota2, instant) && limitedQuota2.getTotalCount() - limitedQuota2.getUsedCount() == pending.getRemainingReadings();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084 A[Catch: all -> 0x00a6, TryCatch #0 {all -> 0x00a6, blocks: (B:21:0x006f, B:22:0x007e, B:24:0x0084, B:26:0x009a, B:29:0x00a8), top: B:43:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[LOOP:0: B:35:0x00c2->B:48:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00be -> B:35:0x00c2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.lang.String r10, defpackage.zn2 r11) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.paywall.upgrade.s.a(java.lang.String, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:14:0x0042, B:48:0x0116, B:21:0x0058, B:31:0x0091, B:34:0x009d, B:35:0x00b8, B:37:0x00be, B:39:0x00d8, B:41:0x00de, B:42:0x00f1, B:43:0x00f5, B:45:0x00ff, B:27:0x007e), top: B:53:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00be A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:14:0x0042, B:48:0x0116, B:21:0x0058, B:31:0x0091, B:34:0x009d, B:35:0x00b8, B:37:0x00be, B:39:0x00d8, B:41:0x00de, B:42:0x00f1, B:43:0x00f5, B:45:0x00ff, B:27:0x007e), top: B:53:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:14:0x0042, B:48:0x0116, B:21:0x0058, B:31:0x0091, B:34:0x009d, B:35:0x00b8, B:37:0x00be, B:39:0x00d8, B:41:0x00de, B:42:0x00f1, B:43:0x00f5, B:45:0x00ff, B:27:0x007e), top: B:53:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0113, code lost:
    
        if (p(r1, r5, r6, r2) == r8) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [ai.askquin.ui.paywall.upgrade.s, hf8] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v5, types: [d99] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r25, defpackage.zn2 r26) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.paywall.upgrade.s.b(java.lang.String, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:45:0x00ac, B:47:0x00b6, B:49:0x00bc, B:51:0x00c2, B:54:0x00ce, B:55:0x00d2, B:57:0x00d8, B:59:0x00e4, B:61:0x00ea, B:63:0x00f0, B:68:0x00fa), top: B:73:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:45:0x00ac, B:47:0x00b6, B:49:0x00bc, B:51:0x00c2, B:54:0x00ce, B:55:0x00d2, B:57:0x00d8, B:59:0x00e4, B:61:0x00ea, B:63:0x00f0, B:68:0x00fa), top: B:73:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, zn2 zn2Var) throws Throwable {
        h hVar;
        String str2;
        d99 d99Var;
        Throwable th;
        d99 d99Var2;
        String str3;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountState;
        Map<String, FiveCardUpgradeManager$ReadingState> readings;
        Collection<FiveCardUpgradeManager$ReadingState> collectionValues;
        Collection<FiveCardUpgradeManager$ReadingState> collection;
        Iterator<T> it;
        FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState;
        if (zn2Var instanceof h) {
            hVar = (h) zn2Var;
            int i = hVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.label = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, zn2Var);
            }
        } else {
            hVar = new h(this, zn2Var);
        }
        Object objL = hVar.result;
        int i2 = hVar.label;
        boolean z = true;
        Object obj = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(objL);
                if (!e(str)) {
                    return Boolean.FALSE;
                }
                hVar.L$0 = str;
                f99 f99Var = this.e;
                hVar.L$1 = f99Var;
                hVar.label = 1;
                if (f99Var.b(hVar) != obj) {
                    str2 = str;
                    d99Var = f99Var;
                }
                return obj;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) hVar.L$1;
                str3 = (String) hVar.L$0;
                try {
                    jzb.q(objL);
                    fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) ((Map) objL).get(str3);
                    if (fiveCardUpgradeManager$AccountState != null && (readings = fiveCardUpgradeManager$AccountState.getReadings()) != null && (collectionValues = readings.values()) != null) {
                        collection = collectionValues;
                        if (collection.isEmpty()) {
                            it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    fiveCardUpgradeManager$ReadingState = (FiveCardUpgradeManager$ReadingState) it.next();
                                    if (fiveCardUpgradeManager$ReadingState.getSuppressed() && (fiveCardUpgradeManager$ReadingState.getPending() != null || (fiveCardUpgradeManager$ReadingState.getSucceeded() && !fiveCardUpgradeManager$ReadingState.getConfirmed()))) {
                                        d99Var = d99Var2;
                                        d99Var2 = d99Var;
                                        Boolean boolValueOf = Boolean.valueOf(z);
                                        d99Var2.h(null);
                                        return boolValueOf;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    d99Var2.h(null);
                    return boolValueOf2;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99Var = (d99) hVar.L$1;
            str2 = (String) hVar.L$0;
            jzb.q(objL);
            Set setKeySet = this.f.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator it2 = setKeySet.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (pa7.t(((iy9) it2.next()).d(), str2)) {
                        }
                    }
                    d99Var2 = d99Var;
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    d99Var2.h(null);
                    return boolValueOf3;
                }
            }
            hVar.L$0 = str2;
            hVar.L$1 = d99Var;
            hVar.label = 2;
            objL = l(hVar);
            if (objL != obj) {
                d99Var2 = d99Var;
                str3 = str2;
                fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) ((Map) objL).get(str3);
                if (fiveCardUpgradeManager$AccountState != null) {
                    collection = collectionValues;
                    if (collection.isEmpty()) {
                        it = collection.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                fiveCardUpgradeManager$ReadingState = (FiveCardUpgradeManager$ReadingState) it.next();
                                if (fiveCardUpgradeManager$ReadingState.getSuppressed()) {
                                }
                            }
                        }
                    }
                }
                z = false;
                Boolean boolValueOf4 = Boolean.valueOf(z);
                d99Var2.h(null);
                return boolValueOf4;
            }
            return obj;
        } catch (Throwable th3) {
            d99 d99Var3 = d99Var;
            th = th3;
            d99Var2 = d99Var3;
            d99Var2.h(null);
            throw th;
        }
    }

    public final boolean e(String str) {
        ca2.a.getClass();
        if (ca2.c || v4e.Q(str)) {
            return false;
        }
        mo3 mo3Var = (mo3) this.a;
        return mo3Var.b() && pa7.t(mo3Var.a(), str);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0102 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0032, B:43:0x00ab, B:73:0x0120, B:46:0x00bb, B:49:0x00cc, B:51:0x00d6, B:53:0x00de, B:56:0x00e5, B:58:0x00eb, B:60:0x00f5, B:62:0x00fb, B:65:0x0102, B:66:0x0106, B:68:0x010c), top: B:82:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x010c A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0032, B:43:0x00ab, B:73:0x0120, B:46:0x00bb, B:49:0x00cc, B:51:0x00d6, B:53:0x00de, B:56:0x00e5, B:58:0x00eb, B:60:0x00f5, B:62:0x00fb, B:65:0x0102, B:66:0x0106, B:68:0x010c), top: B:82:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:0x011d A[SYNTHETIC] */
    public final Object f(FiveCardUpgradePending fiveCardUpgradePending, zn2 zn2Var) {
        i iVar;
        QuotaUsage quotaUsageB;
        d99 d99Var;
        d99 d99Var2;
        QuotaUsage quotaUsageB2;
        FiveCardUpgradePending fiveCardUpgradePending2;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountState;
        FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState;
        QuotaUsage quotaUsageB3;
        List<String> orderIds;
        Iterator<T> it;
        if (zn2Var instanceof i) {
            iVar = (i) zn2Var;
            int i = iVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.label = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, zn2Var);
            }
        } else {
            iVar = new i(this, zn2Var);
        }
        Object obj = iVar.result;
        int i2 = iVar.label;
        q9b q9bVar = this.b;
        boolean z = false;
        Object obj2 = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                if (!e(fiveCardUpgradePending.getAccountId()) || ((quotaUsageB = ((eab) q9bVar).b()) != null && quotaUsageB.getHasSubscription())) {
                    return Boolean.FALSE;
                }
                iVar.L$0 = fiveCardUpgradePending;
                d99Var = this.e;
                iVar.L$1 = d99Var;
                iVar.label = 1;
                if (d99Var.b(iVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) iVar.L$1;
                fiveCardUpgradePending2 = (FiveCardUpgradePending) iVar.L$0;
                try {
                    jzb.q(obj);
                    fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) ((Map) obj).get(fiveCardUpgradePending2.getAccountId());
                    if (fiveCardUpgradeManager$AccountState != null && (fiveCardUpgradeManager$ReadingState = fiveCardUpgradeManager$AccountState.getReadings().get(fiveCardUpgradePending2.getReadingId())) != null && e(fiveCardUpgradePending2.getAccountId()) && (((quotaUsageB3 = ((eab) q9bVar).b()) == null || !quotaUsageB3.getHasSubscription()) && !fiveCardUpgradeManager$ReadingState.getSuppressed() && pa7.t(fiveCardUpgradeManager$ReadingState.getPending(), fiveCardUpgradePending2))) {
                        orderIds = fiveCardUpgradePending2.getOrderIds();
                        if (orderIds == null || !orderIds.isEmpty()) {
                            it = orderIds.iterator();
                            do {
                                if (it.hasNext()) {
                                }
                            } while (!fiveCardUpgradeManager$AccountState.getExposedOrderIds().contains((String) it.next()));
                        }
                        z = true;
                        break;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    d99Var2.h(null);
                    return boolValueOf;
                } catch (Throwable th) {
                    th = th;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99 d99Var3 = (d99) iVar.L$1;
            FiveCardUpgradePending fiveCardUpgradePending3 = (FiveCardUpgradePending) iVar.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            fiveCardUpgradePending = fiveCardUpgradePending3;
            if (e(fiveCardUpgradePending.getAccountId()) && ((quotaUsageB2 = ((eab) q9bVar).b()) == null || !quotaUsageB2.getHasSubscription())) {
                iVar.L$0 = fiveCardUpgradePending;
                iVar.L$1 = d99Var;
                iVar.label = 2;
                Object objL = l(iVar);
                if (objL != obj2) {
                    fiveCardUpgradePending2 = fiveCardUpgradePending;
                    d99Var2 = d99Var;
                    obj = objL;
                    fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) ((Map) obj).get(fiveCardUpgradePending2.getAccountId());
                    if (fiveCardUpgradeManager$AccountState != null) {
                        orderIds = fiveCardUpgradePending2.getOrderIds();
                        if (orderIds == null) {
                            it = orderIds.iterator();
                            do {
                                if (it.hasNext()) {
                                    z = true;
                                    break;
                                }
                            } while (!fiveCardUpgradeManager$AccountState.getExposedOrderIds().contains((String) it.next()));
                        } else {
                            it = orderIds.iterator();
                            do {
                                if (it.hasNext()) {
                                    z = true;
                                    break;
                                }
                            } while (!fiveCardUpgradeManager$AccountState.getExposedOrderIds().contains((String) it.next()));
                        }
                    }
                }
                return obj2;
            }
            d99Var2 = d99Var;
            Boolean boolValueOf2 = Boolean.valueOf(z);
            d99Var2.h(null);
            return boolValueOf2;
        } catch (Throwable th2) {
            th = th2;
            d99Var2 = d99Var;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0210  */
    /* JADX WARN: Code duplicated, block: B:107:0x022c  */
    /* JADX WARN: Code duplicated, block: B:111:0x023d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0258  */
    /* JADX WARN: Code duplicated, block: B:120:0x0271  */
    /* JADX WARN: Code duplicated, block: B:123:0x027e A[Catch: all -> 0x0290, TryCatch #0 {all -> 0x0290, blocks: (B:121:0x0278, B:123:0x027e, B:125:0x0288, B:130:0x0294), top: B:158:0x0278 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0288 A[Catch: all -> 0x0290, TryCatch #0 {all -> 0x0290, blocks: (B:121:0x0278, B:123:0x027e, B:125:0x0288, B:130:0x0294), top: B:158:0x0278 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c0 A[Catch: all -> 0x005e, TryCatch #4 {all -> 0x005e, blocks: (B:13:0x0059, B:150:0x0341, B:134:0x02b6, B:136:0x02c0, B:137:0x02c6, B:139:0x02d2, B:141:0x02ec, B:143:0x02f2, B:146:0x02f9), top: B:160:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:139:0x02d2 A[Catch: all -> 0x005e, TryCatch #4 {all -> 0x005e, blocks: (B:13:0x0059, B:150:0x0341, B:134:0x02b6, B:136:0x02c0, B:137:0x02c6, B:139:0x02d2, B:141:0x02ec, B:143:0x02f2, B:146:0x02f9), top: B:160:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:140:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f2 A[Catch: all -> 0x005e, TryCatch #4 {all -> 0x005e, blocks: (B:13:0x0059, B:150:0x0341, B:134:0x02b6, B:136:0x02c0, B:137:0x02c6, B:139:0x02d2, B:141:0x02ec, B:143:0x02f2, B:146:0x02f9), top: B:160:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:146:0x02f9 A[Catch: all -> 0x005e, TryCatch #4 {all -> 0x005e, blocks: (B:13:0x0059, B:150:0x0341, B:134:0x02b6, B:136:0x02c0, B:137:0x02c6, B:139:0x02d2, B:141:0x02ec, B:143:0x02f2, B:146:0x02f9), top: B:160:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0340  */
    /* JADX WARN: Code duplicated, block: B:169:0x0207 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ec A[PHI: r1 r3 r13 r14
  0x00ec: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v1 java.lang.Object) binds: [B:43:0x0133, B:30:0x00e9] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r3v10 d99) = (r3v7 d99), (r3v14 d99) binds: [B:43:0x0133, B:30:0x00e9] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r13v5 java.lang.String) = (r13v2 java.lang.String), (r13v8 java.lang.String) binds: [B:43:0x0133, B:30:0x00e9] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r14v4 java.lang.String) = (r14v1 java.lang.String), (r14v6 java.lang.String) binds: [B:43:0x0133, B:30:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0141 A[Catch: all -> 0x0154, TryCatch #2 {all -> 0x0154, blocks: (B:45:0x0137, B:47:0x0141, B:49:0x0147, B:51:0x014f), top: B:162:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0158  */
    /* JADX WARN: Code duplicated, block: B:57:0x015b  */
    /* JADX WARN: Code duplicated, block: B:58:0x015d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Code duplicated, block: B:63:0x0179  */
    /* JADX WARN: Code duplicated, block: B:66:0x0189 A[PHI: r1 r3 r14
  0x0189: PHI (r1v21 java.lang.Object) = (r1v13 java.lang.Object), (r1v1 java.lang.Object) binds: [B:64:0x0185, B:28:0x00cf] A[DONT_GENERATE, DONT_INLINE]
  0x0189: PHI (r3v15 ??) = (r3v50 ??), (r3v51 ??) binds: [B:64:0x0185, B:28:0x00cf] A[DONT_GENERATE, DONT_INLINE]
  0x0189: PHI (r14v7 java.lang.String) = (r14v4 java.lang.String), (r14v8 java.lang.String) binds: [B:64:0x0185, B:28:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0195  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01df  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f1  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x0210, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0163, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v33, types: [d99] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r30v0, types: [ai.askquin.ui.paywall.upgrade.s, hf8] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3, types: [d99] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v4, types: [d99] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    public final Object h(String str, String str2, zn2 zn2Var) throws Throwable {
        j jVar;
        String str3;
        String str4;
        d99 d99Var;
        d99 d99Var2;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountState;
        List<LimitedQuota> before;
        boolean z;
        Map<String, FiveCardUpgradeManager$ReadingState> readings;
        FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState;
        ?? r3;
        QuotaUsage quotaUsage;
        ?? r13;
        QuotaUsage quotaUsage2;
        Instant instantNow;
        List<LimitedQuota> limitedQuotaList;
        List<LimitedQuota> list;
        List<LimitedQuota> limitedQuotaList2;
        ArrayList arrayList;
        Instant instant;
        d99 d99Var3;
        List list2;
        int i;
        String orderId;
        ?? r14;
        ?? r4;
        String str5;
        QuotaUsage quotaUsageB;
        Object objL;
        d99 d99Var4;
        ?? r5;
        int i2;
        List list3;
        Map map;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountState2;
        FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState2;
        FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState3;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountStateCopy$default;
        List list4;
        ?? r1;
        ?? r6;
        ?? r7;
        if (zn2Var instanceof j) {
            jVar = (j) zn2Var;
            int i3 = jVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.label = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, zn2Var);
            }
        } else {
            jVar = new j(this, zn2Var);
        }
        Object objL2 = jVar.result;
        ?? r8 = jVar.label;
        f99 f99Var = this.e;
        int i4 = 0;
        wef wefVar = wef.a;
        Map map2 = null;
        boolean z2 = false;
        boolean z3 = false;
        bw2 bw2Var = bw2.a;
        try {
            try {
                switch (r8) {
                    case 0:
                        jzb.q(objL2);
                        if (e(str)) {
                            jVar.L$0 = str;
                            jVar.L$1 = str2;
                            jVar.L$2 = f99Var;
                            jVar.label = 1;
                            if (f99Var.b(jVar) != bw2Var) {
                                str3 = str;
                                str4 = str2;
                                d99Var = f99Var;
                                jVar.L$0 = str3;
                                jVar.L$1 = str4;
                                jVar.L$2 = d99Var;
                                jVar.label = 2;
                                objL2 = l(jVar);
                                if (objL2 != bw2Var) {
                                    String str6 = str4;
                                    d99Var2 = d99Var;
                                    r8 = str6;
                                    try {
                                        fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) ((Map) objL2).get(str3);
                                        if (fiveCardUpgradeManager$AccountState != null || (readings = fiveCardUpgradeManager$AccountState.getReadings()) == null || (fiveCardUpgradeManager$ReadingState = readings.get(r8)) == null) {
                                            before = null;
                                        } else {
                                            before = fiveCardUpgradeManager$ReadingState.getBefore();
                                        }
                                        if (before != null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        d99Var2.h(null);
                                        if (z) {
                                            d().e("Five-card baseline reused: reading=" + r8);
                                            return wefVar;
                                        }
                                        jVar.L$0 = str3;
                                        jVar.L$1 = r8;
                                        jVar.L$2 = null;
                                        jVar.label = 3;
                                        objL2 = j(jVar);
                                        if (objL2 != bw2Var) {
                                            r3 = r8;
                                            quotaUsage = (QuotaUsage) objL2;
                                            if (e(str3)) {
                                                if (quotaUsage == null) {
                                                    jVar.L$0 = null;
                                                    jVar.L$1 = null;
                                                    jVar.L$2 = null;
                                                    jVar.label = 4;
                                                    if (b(str3, jVar) == bw2Var) {
                                                    }
                                                } else {
                                                    jVar.L$0 = str3;
                                                    jVar.L$1 = r3;
                                                    jVar.L$2 = quotaUsage;
                                                    jVar.label = 5;
                                                    if (k(str3, quotaUsage, jVar) != bw2Var) {
                                                        r13 = r3;
                                                        quotaUsage2 = quotaUsage;
                                                        if (!quotaUsage2.getHasSubscription()) {
                                                            instantNow = Instant.now();
                                                            limitedQuotaList = quotaUsage2.getLimitedQuotaList();
                                                            list = pu4.a;
                                                            if (limitedQuotaList == null) {
                                                                limitedQuotaList = list;
                                                            }
                                                            if (!limitedQuotaList.isEmpty()) {
                                                                for (LimitedQuota limitedQuota : limitedQuotaList) {
                                                                    if (!pa7.t(limitedQuota.getCategory(), LimitedQuota.CATEGORY_TIME_MEMBERSHIP) && limitedQuota.getTotalCount() == 5 && (((orderId = limitedQuota.getOrderId()) == null || v4e.Q(orderId)) && (i4 = i4 + 1) < 0)) {
                                                                        t72.Y();
                                                                        throw null;
                                                                    }
                                                                }
                                                            }
                                                            if (i4 > 0) {
                                                                d().e("Five-card orders skipped without orderId: count=" + i4);
                                                            }
                                                            limitedQuotaList2 = quotaUsage2.getLimitedQuotaList();
                                                            if (limitedQuotaList2 != null) {
                                                                list = limitedQuotaList2;
                                                            }
                                                            arrayList = new ArrayList();
                                                            for (Object obj : list) {
                                                                instantNow.getClass();
                                                                if (n16.H((LimitedQuota) obj, instantNow)) {
                                                                    arrayList.add(obj);
                                                                }
                                                            }
                                                            if (!arrayList.isEmpty()) {
                                                                jVar.L$0 = str3;
                                                                jVar.L$1 = r13;
                                                                jVar.L$2 = null;
                                                                jVar.L$3 = instantNow;
                                                                jVar.L$4 = arrayList;
                                                                jVar.L$5 = f99Var;
                                                                jVar.I$0 = i4;
                                                                jVar.label = 6;
                                                                if (f99Var.b(jVar) != bw2Var) {
                                                                    int i5 = i4;
                                                                    instant = instantNow;
                                                                    d99Var3 = f99Var;
                                                                    list2 = arrayList;
                                                                    i = i5;
                                                                    r14 = r13;
                                                                    r4 = r14;
                                                                    str5 = str3;
                                                                    try {
                                                                        r1 = d99Var3;
                                                                        if (e(str5)) {
                                                                            quotaUsageB = ((eab) this.b).b();
                                                                            if (quotaUsageB == null && quotaUsageB.getHasSubscription()) {
                                                                                r1 = d99Var3;
                                                                            } else {
                                                                                jVar.L$0 = str5;
                                                                                jVar.L$1 = r4;
                                                                                jVar.L$2 = null;
                                                                                jVar.L$3 = instant;
                                                                                jVar.L$4 = list2;
                                                                                jVar.L$5 = d99Var3;
                                                                                jVar.I$0 = i;
                                                                                jVar.label = 7;
                                                                                objL = l(jVar);
                                                                                if (objL != bw2Var) {
                                                                                    int i6 = i;
                                                                                    d99Var4 = d99Var3;
                                                                                    objL2 = objL;
                                                                                    r5 = r4;
                                                                                    i2 = i6;
                                                                                    list3 = list2;
                                                                                    map = (Map) objL2;
                                                                                    fiveCardUpgradeManager$AccountState2 = (FiveCardUpgradeManager$AccountState) map.get(str5);
                                                                                    if (fiveCardUpgradeManager$AccountState2 == null) {
                                                                                        fiveCardUpgradeManager$AccountState2 = new FiveCardUpgradeManager$AccountState(map2, (Set) (z3 ? 1 : 0), 3, (rp3) (z2 ? 1 : 0));
                                                                                    }
                                                                                    fiveCardUpgradeManager$ReadingState2 = fiveCardUpgradeManager$AccountState2.getReadings().get(r5);
                                                                                    if (fiveCardUpgradeManager$ReadingState2 == null) {
                                                                                        fiveCardUpgradeManager$ReadingState3 = new FiveCardUpgradeManager$ReadingState((List) null, (String) null, false, false, false, (FiveCardUpgradePending) null, 63, (rp3) null);
                                                                                    } else {
                                                                                        fiveCardUpgradeManager$ReadingState3 = fiveCardUpgradeManager$ReadingState2;
                                                                                    }
                                                                                    r6 = d99Var4;
                                                                                    if (fiveCardUpgradeManager$ReadingState3.getBefore() == null) {
                                                                                        if (!fiveCardUpgradeManager$ReadingState3.getSuppressed()) {
                                                                                            fiveCardUpgradeManager$AccountStateCopy$default = FiveCardUpgradeManager$AccountState.copy$default(fiveCardUpgradeManager$AccountState2, bm8.M(fiveCardUpgradeManager$AccountState2.getReadings(), new iy9(r5, FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingState3, list3, instant.toString(), false, false, false, null, 60, null))), null, 2, null);
                                                                                            jVar.L$0 = null;
                                                                                            jVar.L$1 = r5;
                                                                                            jVar.L$2 = null;
                                                                                            jVar.L$3 = null;
                                                                                            jVar.L$4 = list3;
                                                                                            jVar.L$5 = d99Var4;
                                                                                            jVar.L$6 = null;
                                                                                            jVar.L$7 = null;
                                                                                            jVar.L$8 = null;
                                                                                            jVar.I$0 = i2;
                                                                                            jVar.label = 8;
                                                                                            if (p(map, str5, fiveCardUpgradeManager$AccountStateCopy$default, jVar) != bw2Var) {
                                                                                                list4 = list3;
                                                                                                r8 = d99Var4;
                                                                                                r7 = r5;
                                                                                                d().e("Five-card baseline captured: reading=" + r7 + " orderCount=" + list4.size());
                                                                                                r6 = r8;
                                                                                            }
                                                                                        } else {
                                                                                            r6 = d99Var4;
                                                                                        }
                                                                                    }
                                                                                    r1 = r6;
                                                                                }
                                                                            }
                                                                            break;
                                                                        }
                                                                        r1.h(null);
                                                                        return wefVar;
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        r8 = d99Var3;
                                                                        r8.h(null);
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r8 = d99Var2;
                                        r8.h(null);
                                        throw th;
                                    }
                                }
                                break;
                            }
                            r3 = r8;
                            return bw2Var;
                        }
                        return wefVar;
                    case 1:
                        d99Var = (d99) jVar.L$2;
                        str4 = (String) jVar.L$1;
                        str3 = (String) jVar.L$0;
                        jzb.q(objL2);
                        jVar.L$0 = str3;
                        jVar.L$1 = str4;
                        jVar.L$2 = d99Var;
                        jVar.label = 2;
                        objL2 = l(jVar);
                        if (objL2 != bw2Var) {
                            String str7 = str4;
                            d99Var2 = d99Var;
                            r8 = str7;
                            fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) ((Map) objL2).get(str3);
                            if (fiveCardUpgradeManager$AccountState != null) {
                                before = null;
                            } else {
                                before = null;
                            }
                            if (before != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            d99Var2.h(null);
                            if (z) {
                                d().e("Five-card baseline reused: reading=" + r8);
                                return wefVar;
                            }
                            jVar.L$0 = str3;
                            jVar.L$1 = r8;
                            jVar.L$2 = null;
                            jVar.label = 3;
                            objL2 = j(jVar);
                            if (objL2 != bw2Var) {
                                r3 = r8;
                                quotaUsage = (QuotaUsage) objL2;
                                if (e(str3)) {
                                    if (quotaUsage == null) {
                                        jVar.L$0 = null;
                                        jVar.L$1 = null;
                                        jVar.L$2 = null;
                                        jVar.label = 4;
                                        if (b(str3, jVar) == bw2Var) {
                                        }
                                    } else {
                                        jVar.L$0 = str3;
                                        jVar.L$1 = r3;
                                        jVar.L$2 = quotaUsage;
                                        jVar.label = 5;
                                        if (k(str3, quotaUsage, jVar) != bw2Var) {
                                            r13 = r3;
                                            quotaUsage2 = quotaUsage;
                                            if (!quotaUsage2.getHasSubscription()) {
                                                instantNow = Instant.now();
                                                limitedQuotaList = quotaUsage2.getLimitedQuotaList();
                                                list = pu4.a;
                                                if (limitedQuotaList == null) {
                                                    limitedQuotaList = list;
                                                }
                                                if (!limitedQuotaList.isEmpty()) {
                                                    while (r15.hasNext()) {
                                                        if (!pa7.t(limitedQuota.getCategory(), LimitedQuota.CATEGORY_TIME_MEMBERSHIP)) {
                                                        }
                                                    }
                                                }
                                                if (i4 > 0) {
                                                    d().e("Five-card orders skipped without orderId: count=" + i4);
                                                }
                                                limitedQuotaList2 = quotaUsage2.getLimitedQuotaList();
                                                if (limitedQuotaList2 != null) {
                                                    list = limitedQuotaList2;
                                                }
                                                arrayList = new ArrayList();
                                                while (r4.hasNext()) {
                                                    instantNow.getClass();
                                                    if (n16.H((LimitedQuota) obj, instantNow)) {
                                                        arrayList.add(obj);
                                                    }
                                                }
                                                if (!arrayList.isEmpty()) {
                                                    jVar.L$0 = str3;
                                                    jVar.L$1 = r13;
                                                    jVar.L$2 = null;
                                                    jVar.L$3 = instantNow;
                                                    jVar.L$4 = arrayList;
                                                    jVar.L$5 = f99Var;
                                                    jVar.I$0 = i4;
                                                    jVar.label = 6;
                                                    if (f99Var.b(jVar) != bw2Var) {
                                                        int i7 = i4;
                                                        instant = instantNow;
                                                        d99Var3 = f99Var;
                                                        list2 = arrayList;
                                                        i = i7;
                                                        r14 = r13;
                                                        r4 = r14;
                                                        str5 = str3;
                                                        r1 = d99Var3;
                                                        if (e(str5)) {
                                                            quotaUsageB = ((eab) this.b).b();
                                                            if (quotaUsageB == null) {
                                                            }
                                                            jVar.L$0 = str5;
                                                            jVar.L$1 = r4;
                                                            jVar.L$2 = null;
                                                            jVar.L$3 = instant;
                                                            jVar.L$4 = list2;
                                                            jVar.L$5 = d99Var3;
                                                            jVar.I$0 = i;
                                                            jVar.label = 7;
                                                            objL = l(jVar);
                                                            if (objL != bw2Var) {
                                                                int i8 = i;
                                                                d99Var4 = d99Var3;
                                                                objL2 = objL;
                                                                r5 = r4;
                                                                i2 = i8;
                                                                list3 = list2;
                                                                map = (Map) objL2;
                                                                fiveCardUpgradeManager$AccountState2 = (FiveCardUpgradeManager$AccountState) map.get(str5);
                                                                if (fiveCardUpgradeManager$AccountState2 == null) {
                                                                    fiveCardUpgradeManager$AccountState2 = new FiveCardUpgradeManager$AccountState(map2, (Set) (z3 ? 1 : 0), 3, (rp3) (z2 ? 1 : 0));
                                                                }
                                                                fiveCardUpgradeManager$ReadingState2 = fiveCardUpgradeManager$AccountState2.getReadings().get(r5);
                                                                if (fiveCardUpgradeManager$ReadingState2 == null) {
                                                                    fiveCardUpgradeManager$ReadingState3 = new FiveCardUpgradeManager$ReadingState((List) null, (String) null, false, false, false, (FiveCardUpgradePending) null, 63, (rp3) null);
                                                                } else {
                                                                    fiveCardUpgradeManager$ReadingState3 = fiveCardUpgradeManager$ReadingState2;
                                                                }
                                                                r6 = d99Var4;
                                                                if (fiveCardUpgradeManager$ReadingState3.getBefore() == null) {
                                                                    if (!fiveCardUpgradeManager$ReadingState3.getSuppressed()) {
                                                                        fiveCardUpgradeManager$AccountStateCopy$default = FiveCardUpgradeManager$AccountState.copy$default(fiveCardUpgradeManager$AccountState2, bm8.M(fiveCardUpgradeManager$AccountState2.getReadings(), new iy9(r5, FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingState3, list3, instant.toString(), false, false, false, null, 60, null))), null, 2, null);
                                                                        jVar.L$0 = null;
                                                                        jVar.L$1 = r5;
                                                                        jVar.L$2 = null;
                                                                        jVar.L$3 = null;
                                                                        jVar.L$4 = list3;
                                                                        jVar.L$5 = d99Var4;
                                                                        jVar.L$6 = null;
                                                                        jVar.L$7 = null;
                                                                        jVar.L$8 = null;
                                                                        jVar.I$0 = i2;
                                                                        jVar.label = 8;
                                                                        if (p(map, str5, fiveCardUpgradeManager$AccountStateCopy$default, jVar) != bw2Var) {
                                                                            list4 = list3;
                                                                            r8 = d99Var4;
                                                                            r7 = r5;
                                                                            d().e("Five-card baseline captured: reading=" + r7 + " orderCount=" + list4.size());
                                                                            r6 = r8;
                                                                        }
                                                                    } else {
                                                                        r6 = d99Var4;
                                                                    }
                                                                }
                                                                r1 = r6;
                                                            }
                                                            break;
                                                        }
                                                        r1.h(null);
                                                        return wefVar;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return wefVar;
                            }
                        }
                        r3 = r8;
                        return bw2Var;
                    case 2:
                        d99Var = (d99) jVar.L$2;
                        str4 = (String) jVar.L$1;
                        str3 = (String) jVar.L$0;
                        jzb.q(objL2);
                        String str8 = str4;
                        d99Var2 = d99Var;
                        r8 = str8;
                        fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) ((Map) objL2).get(str3);
                        if (fiveCardUpgradeManager$AccountState != null) {
                            before = null;
                        } else {
                            before = null;
                        }
                        if (before != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        d99Var2.h(null);
                        if (z) {
                            d().e("Five-card baseline reused: reading=" + r8);
                            return wefVar;
                        }
                        jVar.L$0 = str3;
                        jVar.L$1 = r8;
                        jVar.L$2 = null;
                        jVar.label = 3;
                        objL2 = j(jVar);
                        if (objL2 != bw2Var) {
                            r3 = r8;
                            quotaUsage = (QuotaUsage) objL2;
                            if (e(str3)) {
                                if (quotaUsage == null) {
                                    jVar.L$0 = null;
                                    jVar.L$1 = null;
                                    jVar.L$2 = null;
                                    jVar.label = 4;
                                    if (b(str3, jVar) == bw2Var) {
                                    }
                                } else {
                                    jVar.L$0 = str3;
                                    jVar.L$1 = r3;
                                    jVar.L$2 = quotaUsage;
                                    jVar.label = 5;
                                    if (k(str3, quotaUsage, jVar) != bw2Var) {
                                        r13 = r3;
                                        quotaUsage2 = quotaUsage;
                                        if (!quotaUsage2.getHasSubscription()) {
                                            instantNow = Instant.now();
                                            limitedQuotaList = quotaUsage2.getLimitedQuotaList();
                                            list = pu4.a;
                                            if (limitedQuotaList == null) {
                                                limitedQuotaList = list;
                                            }
                                            if (!limitedQuotaList.isEmpty()) {
                                                while (r15.hasNext()) {
                                                    if (!pa7.t(limitedQuota.getCategory(), LimitedQuota.CATEGORY_TIME_MEMBERSHIP)) {
                                                    }
                                                }
                                            }
                                            if (i4 > 0) {
                                                d().e("Five-card orders skipped without orderId: count=" + i4);
                                            }
                                            limitedQuotaList2 = quotaUsage2.getLimitedQuotaList();
                                            if (limitedQuotaList2 != null) {
                                                list = limitedQuotaList2;
                                            }
                                            arrayList = new ArrayList();
                                            while (r4.hasNext()) {
                                                instantNow.getClass();
                                                if (n16.H((LimitedQuota) obj, instantNow)) {
                                                    arrayList.add(obj);
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                jVar.L$0 = str3;
                                                jVar.L$1 = r13;
                                                jVar.L$2 = null;
                                                jVar.L$3 = instantNow;
                                                jVar.L$4 = arrayList;
                                                jVar.L$5 = f99Var;
                                                jVar.I$0 = i4;
                                                jVar.label = 6;
                                                if (f99Var.b(jVar) != bw2Var) {
                                                    int i9 = i4;
                                                    instant = instantNow;
                                                    d99Var3 = f99Var;
                                                    list2 = arrayList;
                                                    i = i9;
                                                    r14 = r13;
                                                    r4 = r14;
                                                    str5 = str3;
                                                    r1 = d99Var3;
                                                    if (e(str5)) {
                                                        quotaUsageB = ((eab) this.b).b();
                                                        if (quotaUsageB == null) {
                                                        }
                                                        jVar.L$0 = str5;
                                                        jVar.L$1 = r4;
                                                        jVar.L$2 = null;
                                                        jVar.L$3 = instant;
                                                        jVar.L$4 = list2;
                                                        jVar.L$5 = d99Var3;
                                                        jVar.I$0 = i;
                                                        jVar.label = 7;
                                                        objL = l(jVar);
                                                        if (objL != bw2Var) {
                                                            int i10 = i;
                                                            d99Var4 = d99Var3;
                                                            objL2 = objL;
                                                            r5 = r4;
                                                            i2 = i10;
                                                            list3 = list2;
                                                            map = (Map) objL2;
                                                            fiveCardUpgradeManager$AccountState2 = (FiveCardUpgradeManager$AccountState) map.get(str5);
                                                            if (fiveCardUpgradeManager$AccountState2 == null) {
                                                                fiveCardUpgradeManager$AccountState2 = new FiveCardUpgradeManager$AccountState(map2, (Set) (z3 ? 1 : 0), 3, (rp3) (z2 ? 1 : 0));
                                                            }
                                                            fiveCardUpgradeManager$ReadingState2 = fiveCardUpgradeManager$AccountState2.getReadings().get(r5);
                                                            if (fiveCardUpgradeManager$ReadingState2 == null) {
                                                                fiveCardUpgradeManager$ReadingState3 = new FiveCardUpgradeManager$ReadingState((List) null, (String) null, false, false, false, (FiveCardUpgradePending) null, 63, (rp3) null);
                                                            } else {
                                                                fiveCardUpgradeManager$ReadingState3 = fiveCardUpgradeManager$ReadingState2;
                                                            }
                                                            r6 = d99Var4;
                                                            if (fiveCardUpgradeManager$ReadingState3.getBefore() == null) {
                                                                if (!fiveCardUpgradeManager$ReadingState3.getSuppressed()) {
                                                                    fiveCardUpgradeManager$AccountStateCopy$default = FiveCardUpgradeManager$AccountState.copy$default(fiveCardUpgradeManager$AccountState2, bm8.M(fiveCardUpgradeManager$AccountState2.getReadings(), new iy9(r5, FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingState3, list3, instant.toString(), false, false, false, null, 60, null))), null, 2, null);
                                                                    jVar.L$0 = null;
                                                                    jVar.L$1 = r5;
                                                                    jVar.L$2 = null;
                                                                    jVar.L$3 = null;
                                                                    jVar.L$4 = list3;
                                                                    jVar.L$5 = d99Var4;
                                                                    jVar.L$6 = null;
                                                                    jVar.L$7 = null;
                                                                    jVar.L$8 = null;
                                                                    jVar.I$0 = i2;
                                                                    jVar.label = 8;
                                                                    if (p(map, str5, fiveCardUpgradeManager$AccountStateCopy$default, jVar) != bw2Var) {
                                                                        list4 = list3;
                                                                        r8 = d99Var4;
                                                                        r7 = r5;
                                                                        d().e("Five-card baseline captured: reading=" + r7 + " orderCount=" + list4.size());
                                                                        r6 = r8;
                                                                    }
                                                                } else {
                                                                    r6 = d99Var4;
                                                                }
                                                            }
                                                            r1 = r6;
                                                        }
                                                        break;
                                                    }
                                                    r1.h(null);
                                                    return wefVar;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return wefVar;
                        }
                        r3 = r8;
                        return bw2Var;
                    case 3:
                        String str9 = (String) jVar.L$1;
                        String str10 = (String) jVar.L$0;
                        jzb.q(objL2);
                        str3 = str10;
                        r3 = str9;
                        r3 = r8;
                        quotaUsage = (QuotaUsage) objL2;
                        if (e(str3)) {
                            if (quotaUsage == null) {
                                jVar.L$0 = null;
                                jVar.L$1 = null;
                                jVar.L$2 = null;
                                jVar.label = 4;
                                if (b(str3, jVar) == bw2Var) {
                                }
                            } else {
                                jVar.L$0 = str3;
                                jVar.L$1 = r3;
                                jVar.L$2 = quotaUsage;
                                jVar.label = 5;
                                if (k(str3, quotaUsage, jVar) != bw2Var) {
                                    r13 = r3;
                                    quotaUsage2 = quotaUsage;
                                    if (!quotaUsage2.getHasSubscription()) {
                                        instantNow = Instant.now();
                                        limitedQuotaList = quotaUsage2.getLimitedQuotaList();
                                        list = pu4.a;
                                        if (limitedQuotaList == null) {
                                            limitedQuotaList = list;
                                        }
                                        if (!limitedQuotaList.isEmpty()) {
                                            while (r15.hasNext()) {
                                                if (!pa7.t(limitedQuota.getCategory(), LimitedQuota.CATEGORY_TIME_MEMBERSHIP)) {
                                                }
                                            }
                                        }
                                        if (i4 > 0) {
                                            d().e("Five-card orders skipped without orderId: count=" + i4);
                                        }
                                        limitedQuotaList2 = quotaUsage2.getLimitedQuotaList();
                                        if (limitedQuotaList2 != null) {
                                            list = limitedQuotaList2;
                                        }
                                        arrayList = new ArrayList();
                                        while (r4.hasNext()) {
                                            instantNow.getClass();
                                            if (n16.H((LimitedQuota) obj, instantNow)) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            jVar.L$0 = str3;
                                            jVar.L$1 = r13;
                                            jVar.L$2 = null;
                                            jVar.L$3 = instantNow;
                                            jVar.L$4 = arrayList;
                                            jVar.L$5 = f99Var;
                                            jVar.I$0 = i4;
                                            jVar.label = 6;
                                            if (f99Var.b(jVar) != bw2Var) {
                                                int i11 = i4;
                                                instant = instantNow;
                                                d99Var3 = f99Var;
                                                list2 = arrayList;
                                                i = i11;
                                                r14 = r13;
                                                r4 = r14;
                                                str5 = str3;
                                                r1 = d99Var3;
                                                if (e(str5)) {
                                                    quotaUsageB = ((eab) this.b).b();
                                                    if (quotaUsageB == null) {
                                                    }
                                                    jVar.L$0 = str5;
                                                    jVar.L$1 = r4;
                                                    jVar.L$2 = null;
                                                    jVar.L$3 = instant;
                                                    jVar.L$4 = list2;
                                                    jVar.L$5 = d99Var3;
                                                    jVar.I$0 = i;
                                                    jVar.label = 7;
                                                    objL = l(jVar);
                                                    if (objL != bw2Var) {
                                                        int i12 = i;
                                                        d99Var4 = d99Var3;
                                                        objL2 = objL;
                                                        r5 = r4;
                                                        i2 = i12;
                                                        list3 = list2;
                                                        map = (Map) objL2;
                                                        fiveCardUpgradeManager$AccountState2 = (FiveCardUpgradeManager$AccountState) map.get(str5);
                                                        if (fiveCardUpgradeManager$AccountState2 == null) {
                                                            fiveCardUpgradeManager$AccountState2 = new FiveCardUpgradeManager$AccountState(map2, (Set) (z3 ? 1 : 0), 3, (rp3) (z2 ? 1 : 0));
                                                        }
                                                        fiveCardUpgradeManager$ReadingState2 = fiveCardUpgradeManager$AccountState2.getReadings().get(r5);
                                                        if (fiveCardUpgradeManager$ReadingState2 == null) {
                                                            fiveCardUpgradeManager$ReadingState3 = new FiveCardUpgradeManager$ReadingState((List) null, (String) null, false, false, false, (FiveCardUpgradePending) null, 63, (rp3) null);
                                                        } else {
                                                            fiveCardUpgradeManager$ReadingState3 = fiveCardUpgradeManager$ReadingState2;
                                                        }
                                                        r6 = d99Var4;
                                                        if (fiveCardUpgradeManager$ReadingState3.getBefore() == null) {
                                                            if (!fiveCardUpgradeManager$ReadingState3.getSuppressed()) {
                                                                fiveCardUpgradeManager$AccountStateCopy$default = FiveCardUpgradeManager$AccountState.copy$default(fiveCardUpgradeManager$AccountState2, bm8.M(fiveCardUpgradeManager$AccountState2.getReadings(), new iy9(r5, FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingState3, list3, instant.toString(), false, false, false, null, 60, null))), null, 2, null);
                                                                jVar.L$0 = null;
                                                                jVar.L$1 = r5;
                                                                jVar.L$2 = null;
                                                                jVar.L$3 = null;
                                                                jVar.L$4 = list3;
                                                                jVar.L$5 = d99Var4;
                                                                jVar.L$6 = null;
                                                                jVar.L$7 = null;
                                                                jVar.L$8 = null;
                                                                jVar.I$0 = i2;
                                                                jVar.label = 8;
                                                                if (p(map, str5, fiveCardUpgradeManager$AccountStateCopy$default, jVar) != bw2Var) {
                                                                    list4 = list3;
                                                                    r8 = d99Var4;
                                                                    r7 = r5;
                                                                    d().e("Five-card baseline captured: reading=" + r7 + " orderCount=" + list4.size());
                                                                    r6 = r8;
                                                                }
                                                            } else {
                                                                r6 = d99Var4;
                                                            }
                                                        }
                                                        r1 = r6;
                                                    }
                                                    break;
                                                }
                                                r1.h(null);
                                                return wefVar;
                                            }
                                        }
                                    }
                                }
                            }
                            r3 = r8;
                            return bw2Var;
                        }
                        return wefVar;
                    case 4:
                        jzb.q(objL2);
                        return wefVar;
                    case 5:
                        quotaUsage2 = (QuotaUsage) jVar.L$2;
                        String str11 = (String) jVar.L$1;
                        str3 = (String) jVar.L$0;
                        jzb.q(objL2);
                        r13 = str11;
                        if (!quotaUsage2.getHasSubscription()) {
                            instantNow = Instant.now();
                            limitedQuotaList = quotaUsage2.getLimitedQuotaList();
                            list = pu4.a;
                            if (limitedQuotaList == null) {
                                limitedQuotaList = list;
                            }
                            if (!limitedQuotaList.isEmpty()) {
                                while (r15.hasNext()) {
                                    if (!pa7.t(limitedQuota.getCategory(), LimitedQuota.CATEGORY_TIME_MEMBERSHIP)) {
                                    }
                                }
                            }
                            if (i4 > 0) {
                                d().e("Five-card orders skipped without orderId: count=" + i4);
                            }
                            limitedQuotaList2 = quotaUsage2.getLimitedQuotaList();
                            if (limitedQuotaList2 != null) {
                                list = limitedQuotaList2;
                            }
                            arrayList = new ArrayList();
                            while (r4.hasNext()) {
                                instantNow.getClass();
                                if (n16.H((LimitedQuota) obj, instantNow)) {
                                    arrayList.add(obj);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                jVar.L$0 = str3;
                                jVar.L$1 = r13;
                                jVar.L$2 = null;
                                jVar.L$3 = instantNow;
                                jVar.L$4 = arrayList;
                                jVar.L$5 = f99Var;
                                jVar.I$0 = i4;
                                jVar.label = 6;
                                if (f99Var.b(jVar) != bw2Var) {
                                    int i13 = i4;
                                    instant = instantNow;
                                    d99Var3 = f99Var;
                                    list2 = arrayList;
                                    i = i13;
                                    r14 = r13;
                                    r4 = r14;
                                    str5 = str3;
                                    r1 = d99Var3;
                                    if (e(str5)) {
                                        quotaUsageB = ((eab) this.b).b();
                                        if (quotaUsageB == null) {
                                        }
                                        jVar.L$0 = str5;
                                        jVar.L$1 = r4;
                                        jVar.L$2 = null;
                                        jVar.L$3 = instant;
                                        jVar.L$4 = list2;
                                        jVar.L$5 = d99Var3;
                                        jVar.I$0 = i;
                                        jVar.label = 7;
                                        objL = l(jVar);
                                        if (objL != bw2Var) {
                                            int i14 = i;
                                            d99Var4 = d99Var3;
                                            objL2 = objL;
                                            r5 = r4;
                                            i2 = i14;
                                            list3 = list2;
                                            map = (Map) objL2;
                                            fiveCardUpgradeManager$AccountState2 = (FiveCardUpgradeManager$AccountState) map.get(str5);
                                            if (fiveCardUpgradeManager$AccountState2 == null) {
                                                fiveCardUpgradeManager$AccountState2 = new FiveCardUpgradeManager$AccountState(map2, (Set) (z3 ? 1 : 0), 3, (rp3) (z2 ? 1 : 0));
                                            }
                                            fiveCardUpgradeManager$ReadingState2 = fiveCardUpgradeManager$AccountState2.getReadings().get(r5);
                                            if (fiveCardUpgradeManager$ReadingState2 == null) {
                                                fiveCardUpgradeManager$ReadingState3 = new FiveCardUpgradeManager$ReadingState((List) null, (String) null, false, false, false, (FiveCardUpgradePending) null, 63, (rp3) null);
                                            } else {
                                                fiveCardUpgradeManager$ReadingState3 = fiveCardUpgradeManager$ReadingState2;
                                            }
                                            r6 = d99Var4;
                                            if (fiveCardUpgradeManager$ReadingState3.getBefore() == null) {
                                                if (!fiveCardUpgradeManager$ReadingState3.getSuppressed()) {
                                                    fiveCardUpgradeManager$AccountStateCopy$default = FiveCardUpgradeManager$AccountState.copy$default(fiveCardUpgradeManager$AccountState2, bm8.M(fiveCardUpgradeManager$AccountState2.getReadings(), new iy9(r5, FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingState3, list3, instant.toString(), false, false, false, null, 60, null))), null, 2, null);
                                                    jVar.L$0 = null;
                                                    jVar.L$1 = r5;
                                                    jVar.L$2 = null;
                                                    jVar.L$3 = null;
                                                    jVar.L$4 = list3;
                                                    jVar.L$5 = d99Var4;
                                                    jVar.L$6 = null;
                                                    jVar.L$7 = null;
                                                    jVar.L$8 = null;
                                                    jVar.I$0 = i2;
                                                    jVar.label = 8;
                                                    if (p(map, str5, fiveCardUpgradeManager$AccountStateCopy$default, jVar) != bw2Var) {
                                                        list4 = list3;
                                                        r8 = d99Var4;
                                                        r7 = r5;
                                                        d().e("Five-card baseline captured: reading=" + r7 + " orderCount=" + list4.size());
                                                        r6 = r8;
                                                    }
                                                } else {
                                                    r6 = d99Var4;
                                                }
                                            }
                                            r1 = r6;
                                        }
                                        break;
                                    }
                                    r1.h(null);
                                    return wefVar;
                                }
                                r3 = r8;
                                return bw2Var;
                            }
                        }
                        return wefVar;
                    case 6:
                        i = jVar.I$0;
                        d99 d99Var5 = (d99) jVar.L$5;
                        List list5 = (List) jVar.L$4;
                        instant = (Instant) jVar.L$3;
                        String str12 = (String) jVar.L$1;
                        str3 = (String) jVar.L$0;
                        jzb.q(objL2);
                        d99Var3 = d99Var5;
                        list2 = list5;
                        r14 = str12;
                        r4 = r14;
                        str5 = str3;
                        r1 = d99Var3;
                        if (e(str5)) {
                            quotaUsageB = ((eab) this.b).b();
                            if (quotaUsageB == null) {
                                break;
                            }
                            jVar.L$0 = str5;
                            jVar.L$1 = r4;
                            jVar.L$2 = null;
                            jVar.L$3 = instant;
                            jVar.L$4 = list2;
                            jVar.L$5 = d99Var3;
                            jVar.I$0 = i;
                            jVar.label = 7;
                            objL = l(jVar);
                            if (objL != bw2Var) {
                                int i15 = i;
                                d99Var4 = d99Var3;
                                objL2 = objL;
                                r5 = r4;
                                i2 = i15;
                                list3 = list2;
                                map = (Map) objL2;
                                fiveCardUpgradeManager$AccountState2 = (FiveCardUpgradeManager$AccountState) map.get(str5);
                                if (fiveCardUpgradeManager$AccountState2 == null) {
                                    fiveCardUpgradeManager$AccountState2 = new FiveCardUpgradeManager$AccountState(map2, (Set) (z3 ? 1 : 0), 3, (rp3) (z2 ? 1 : 0));
                                }
                                fiveCardUpgradeManager$ReadingState2 = fiveCardUpgradeManager$AccountState2.getReadings().get(r5);
                                if (fiveCardUpgradeManager$ReadingState2 == null) {
                                    fiveCardUpgradeManager$ReadingState3 = new FiveCardUpgradeManager$ReadingState((List) null, (String) null, false, false, false, (FiveCardUpgradePending) null, 63, (rp3) null);
                                } else {
                                    fiveCardUpgradeManager$ReadingState3 = fiveCardUpgradeManager$ReadingState2;
                                }
                                r6 = d99Var4;
                                if (fiveCardUpgradeManager$ReadingState3.getBefore() == null) {
                                    if (!fiveCardUpgradeManager$ReadingState3.getSuppressed()) {
                                        fiveCardUpgradeManager$AccountStateCopy$default = FiveCardUpgradeManager$AccountState.copy$default(fiveCardUpgradeManager$AccountState2, bm8.M(fiveCardUpgradeManager$AccountState2.getReadings(), new iy9(r5, FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingState3, list3, instant.toString(), false, false, false, null, 60, null))), null, 2, null);
                                        jVar.L$0 = null;
                                        jVar.L$1 = r5;
                                        jVar.L$2 = null;
                                        jVar.L$3 = null;
                                        jVar.L$4 = list3;
                                        jVar.L$5 = d99Var4;
                                        jVar.L$6 = null;
                                        jVar.L$7 = null;
                                        jVar.L$8 = null;
                                        jVar.I$0 = i2;
                                        jVar.label = 8;
                                        if (p(map, str5, fiveCardUpgradeManager$AccountStateCopy$default, jVar) != bw2Var) {
                                            list4 = list3;
                                            r8 = d99Var4;
                                            r7 = r5;
                                            d().e("Five-card baseline captured: reading=" + r7 + " orderCount=" + list4.size());
                                            r6 = r8;
                                        }
                                    } else {
                                        r6 = d99Var4;
                                    }
                                }
                                r1 = r6;
                                break;
                            }
                            r3 = r8;
                            return bw2Var;
                        }
                        r1.h(null);
                        return wefVar;
                    case 7:
                        int i16 = jVar.I$0;
                        d99 d99Var6 = (d99) jVar.L$5;
                        list2 = (List) jVar.L$4;
                        instant = (Instant) jVar.L$3;
                        String str13 = (String) jVar.L$1;
                        str5 = (String) jVar.L$0;
                        try {
                            jzb.q(objL2);
                            i2 = i16;
                            d99Var4 = d99Var6;
                            r5 = str13;
                            list3 = list2;
                            map = (Map) objL2;
                            fiveCardUpgradeManager$AccountState2 = (FiveCardUpgradeManager$AccountState) map.get(str5);
                            if (fiveCardUpgradeManager$AccountState2 == null) {
                                fiveCardUpgradeManager$AccountState2 = new FiveCardUpgradeManager$AccountState(map2, (Set) (z3 ? 1 : 0), 3, (rp3) (z2 ? 1 : 0));
                            }
                            fiveCardUpgradeManager$ReadingState2 = fiveCardUpgradeManager$AccountState2.getReadings().get(r5);
                            if (fiveCardUpgradeManager$ReadingState2 == null) {
                                fiveCardUpgradeManager$ReadingState3 = new FiveCardUpgradeManager$ReadingState((List) null, (String) null, false, false, false, (FiveCardUpgradePending) null, 63, (rp3) null);
                            } else {
                                fiveCardUpgradeManager$ReadingState3 = fiveCardUpgradeManager$ReadingState2;
                            }
                            r6 = d99Var4;
                            if (fiveCardUpgradeManager$ReadingState3.getBefore() == null) {
                                if (!fiveCardUpgradeManager$ReadingState3.getSuppressed()) {
                                    fiveCardUpgradeManager$AccountStateCopy$default = FiveCardUpgradeManager$AccountState.copy$default(fiveCardUpgradeManager$AccountState2, bm8.M(fiveCardUpgradeManager$AccountState2.getReadings(), new iy9(r5, FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingState3, list3, instant.toString(), false, false, false, null, 60, null))), null, 2, null);
                                    jVar.L$0 = null;
                                    jVar.L$1 = r5;
                                    jVar.L$2 = null;
                                    jVar.L$3 = null;
                                    jVar.L$4 = list3;
                                    jVar.L$5 = d99Var4;
                                    jVar.L$6 = null;
                                    jVar.L$7 = null;
                                    jVar.L$8 = null;
                                    jVar.I$0 = i2;
                                    jVar.label = 8;
                                    if (p(map, str5, fiveCardUpgradeManager$AccountStateCopy$default, jVar) != bw2Var) {
                                        list4 = list3;
                                        r8 = d99Var4;
                                        r7 = r5;
                                        d().e("Five-card baseline captured: reading=" + r7 + " orderCount=" + list4.size());
                                        r6 = r8;
                                        break;
                                    }
                                    r3 = r8;
                                    return bw2Var;
                                }
                                r6 = d99Var4;
                            }
                            r1 = r6;
                            r1.h(null);
                            return wefVar;
                        } catch (Throwable th3) {
                            th = th3;
                            r8 = d99Var6;
                            r8.h(null);
                            throw th;
                        }
                    case 8:
                        d99 d99Var7 = (d99) jVar.L$5;
                        list4 = (List) jVar.L$4;
                        String str14 = (String) jVar.L$1;
                        jzb.q(objL2);
                        r8 = d99Var7;
                        r7 = str14;
                        d().e("Five-card baseline captured: reading=" + r7 + " orderCount=" + list4.size());
                        r6 = r8;
                        r1 = r6;
                        r1.h(null);
                        return wefVar;
                    default:
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[LOOP:0: B:83:0x0149->B:116:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0183 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x011b A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00d7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x009d A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0078 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x006e, B:29:0x0078, B:30:0x007e, B:32:0x008d, B:46:0x00b9, B:48:0x00c7, B:66:0x00ff, B:68:0x010b, B:82:0x013b, B:83:0x0149, B:85:0x014f, B:89:0x015e, B:91:0x0174, B:104:0x019e, B:94:0x017f, B:95:0x0183, B:97:0x0189, B:99:0x0195, B:102:0x019a, B:103:0x019d, B:71:0x0116, B:72:0x011b, B:74:0x0121, B:76:0x0131, B:79:0x0136, B:80:0x0139, B:51:0x00d2, B:52:0x00d7, B:54:0x00dd, B:56:0x00e9, B:58:0x00ef, B:60:0x00f5, B:63:0x00fa, B:64:0x00fd, B:35:0x0098, B:36:0x009d, B:38:0x00a3, B:40:0x00af, B:43:0x00b4, B:44:0x00b7), top: B:111:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0098 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x006e, B:29:0x0078, B:30:0x007e, B:32:0x008d, B:46:0x00b9, B:48:0x00c7, B:66:0x00ff, B:68:0x010b, B:82:0x013b, B:83:0x0149, B:85:0x014f, B:89:0x015e, B:91:0x0174, B:104:0x019e, B:94:0x017f, B:95:0x0183, B:97:0x0189, B:99:0x0195, B:102:0x019a, B:103:0x019d, B:71:0x0116, B:72:0x011b, B:74:0x0121, B:76:0x0131, B:79:0x0136, B:80:0x0139, B:51:0x00d2, B:52:0x00d7, B:54:0x00dd, B:56:0x00e9, B:58:0x00ef, B:60:0x00f5, B:63:0x00fa, B:64:0x00fd, B:35:0x0098, B:36:0x009d, B:38:0x00a3, B:40:0x00af, B:43:0x00b4, B:44:0x00b7), top: B:111:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x006e, B:29:0x0078, B:30:0x007e, B:32:0x008d, B:46:0x00b9, B:48:0x00c7, B:66:0x00ff, B:68:0x010b, B:82:0x013b, B:83:0x0149, B:85:0x014f, B:89:0x015e, B:91:0x0174, B:104:0x019e, B:94:0x017f, B:95:0x0183, B:97:0x0189, B:99:0x0195, B:102:0x019a, B:103:0x019d, B:71:0x0116, B:72:0x011b, B:74:0x0121, B:76:0x0131, B:79:0x0136, B:80:0x0139, B:51:0x00d2, B:52:0x00d7, B:54:0x00dd, B:56:0x00e9, B:58:0x00ef, B:60:0x00f5, B:63:0x00fa, B:64:0x00fd, B:35:0x0098, B:36:0x009d, B:38:0x00a3, B:40:0x00af, B:43:0x00b4, B:44:0x00b7), top: B:111:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x006e, B:29:0x0078, B:30:0x007e, B:32:0x008d, B:46:0x00b9, B:48:0x00c7, B:66:0x00ff, B:68:0x010b, B:82:0x013b, B:83:0x0149, B:85:0x014f, B:89:0x015e, B:91:0x0174, B:104:0x019e, B:94:0x017f, B:95:0x0183, B:97:0x0189, B:99:0x0195, B:102:0x019a, B:103:0x019d, B:71:0x0116, B:72:0x011b, B:74:0x0121, B:76:0x0131, B:79:0x0136, B:80:0x0139, B:51:0x00d2, B:52:0x00d7, B:54:0x00dd, B:56:0x00e9, B:58:0x00ef, B:60:0x00f5, B:63:0x00fa, B:64:0x00fd, B:35:0x0098, B:36:0x009d, B:38:0x00a3, B:40:0x00af, B:43:0x00b4, B:44:0x00b7), top: B:111:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x006e, B:29:0x0078, B:30:0x007e, B:32:0x008d, B:46:0x00b9, B:48:0x00c7, B:66:0x00ff, B:68:0x010b, B:82:0x013b, B:83:0x0149, B:85:0x014f, B:89:0x015e, B:91:0x0174, B:104:0x019e, B:94:0x017f, B:95:0x0183, B:97:0x0189, B:99:0x0195, B:102:0x019a, B:103:0x019d, B:71:0x0116, B:72:0x011b, B:74:0x0121, B:76:0x0131, B:79:0x0136, B:80:0x0139, B:51:0x00d2, B:52:0x00d7, B:54:0x00dd, B:56:0x00e9, B:58:0x00ef, B:60:0x00f5, B:63:0x00fa, B:64:0x00fd, B:35:0x0098, B:36:0x009d, B:38:0x00a3, B:40:0x00af, B:43:0x00b4, B:44:0x00b7), top: B:111:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0116 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x006e, B:29:0x0078, B:30:0x007e, B:32:0x008d, B:46:0x00b9, B:48:0x00c7, B:66:0x00ff, B:68:0x010b, B:82:0x013b, B:83:0x0149, B:85:0x014f, B:89:0x015e, B:91:0x0174, B:104:0x019e, B:94:0x017f, B:95:0x0183, B:97:0x0189, B:99:0x0195, B:102:0x019a, B:103:0x019d, B:71:0x0116, B:72:0x011b, B:74:0x0121, B:76:0x0131, B:79:0x0136, B:80:0x0139, B:51:0x00d2, B:52:0x00d7, B:54:0x00dd, B:56:0x00e9, B:58:0x00ef, B:60:0x00f5, B:63:0x00fa, B:64:0x00fd, B:35:0x0098, B:36:0x009d, B:38:0x00a3, B:40:0x00af, B:43:0x00b4, B:44:0x00b7), top: B:111:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0121 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x006e, B:29:0x0078, B:30:0x007e, B:32:0x008d, B:46:0x00b9, B:48:0x00c7, B:66:0x00ff, B:68:0x010b, B:82:0x013b, B:83:0x0149, B:85:0x014f, B:89:0x015e, B:91:0x0174, B:104:0x019e, B:94:0x017f, B:95:0x0183, B:97:0x0189, B:99:0x0195, B:102:0x019a, B:103:0x019d, B:71:0x0116, B:72:0x011b, B:74:0x0121, B:76:0x0131, B:79:0x0136, B:80:0x0139, B:51:0x00d2, B:52:0x00d7, B:54:0x00dd, B:56:0x00e9, B:58:0x00ef, B:60:0x00f5, B:63:0x00fa, B:64:0x00fd, B:35:0x0098, B:36:0x009d, B:38:0x00a3, B:40:0x00af, B:43:0x00b4, B:44:0x00b7), top: B:111:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x006e, B:29:0x0078, B:30:0x007e, B:32:0x008d, B:46:0x00b9, B:48:0x00c7, B:66:0x00ff, B:68:0x010b, B:82:0x013b, B:83:0x0149, B:85:0x014f, B:89:0x015e, B:91:0x0174, B:104:0x019e, B:94:0x017f, B:95:0x0183, B:97:0x0189, B:99:0x0195, B:102:0x019a, B:103:0x019d, B:71:0x0116, B:72:0x011b, B:74:0x0121, B:76:0x0131, B:79:0x0136, B:80:0x0139, B:51:0x00d2, B:52:0x00d7, B:54:0x00dd, B:56:0x00e9, B:58:0x00ef, B:60:0x00f5, B:63:0x00fa, B:64:0x00fd, B:35:0x0098, B:36:0x009d, B:38:0x00a3, B:40:0x00af, B:43:0x00b4, B:44:0x00b7), top: B:111:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:94:0x017f A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x006e, B:29:0x0078, B:30:0x007e, B:32:0x008d, B:46:0x00b9, B:48:0x00c7, B:66:0x00ff, B:68:0x010b, B:82:0x013b, B:83:0x0149, B:85:0x014f, B:89:0x015e, B:91:0x0174, B:104:0x019e, B:94:0x017f, B:95:0x0183, B:97:0x0189, B:99:0x0195, B:102:0x019a, B:103:0x019d, B:71:0x0116, B:72:0x011b, B:74:0x0121, B:76:0x0131, B:79:0x0136, B:80:0x0139, B:51:0x00d2, B:52:0x00d7, B:54:0x00dd, B:56:0x00e9, B:58:0x00ef, B:60:0x00f5, B:63:0x00fa, B:64:0x00fd, B:35:0x0098, B:36:0x009d, B:38:0x00a3, B:40:0x00af, B:43:0x00b4, B:44:0x00b7), top: B:111:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0189 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x006e, B:29:0x0078, B:30:0x007e, B:32:0x008d, B:46:0x00b9, B:48:0x00c7, B:66:0x00ff, B:68:0x010b, B:82:0x013b, B:83:0x0149, B:85:0x014f, B:89:0x015e, B:91:0x0174, B:104:0x019e, B:94:0x017f, B:95:0x0183, B:97:0x0189, B:99:0x0195, B:102:0x019a, B:103:0x019d, B:71:0x0116, B:72:0x011b, B:74:0x0121, B:76:0x0131, B:79:0x0136, B:80:0x0139, B:51:0x00d2, B:52:0x00d7, B:54:0x00dd, B:56:0x00e9, B:58:0x00ef, B:60:0x00f5, B:63:0x00fa, B:64:0x00fd, B:35:0x0098, B:36:0x009d, B:38:0x00a3, B:40:0x00af, B:43:0x00b4, B:44:0x00b7), top: B:111:0x002f }] */
    public final Object i(String str, zn2 zn2Var) throws Throwable {
        k kVar;
        d99 d99Var;
        Throwable th;
        d99 d99Var2;
        String str2;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountState;
        Collection<FiveCardUpgradeManager$ReadingState> collectionValues;
        Iterator<T> it;
        int i;
        Collection<FiveCardUpgradeManager$ReadingState> collectionValues2;
        int i2;
        Set setKeySet;
        Iterator it2;
        int i3;
        Iterator<T> it3;
        FiveCardUpgradePending fiveCardUpgradePending;
        Collection<FiveCardUpgradeManager$ReadingState> collectionValues3;
        Iterator<T> it4;
        FiveCardUpgradePending pending;
        if (zn2Var instanceof k) {
            kVar = (k) zn2Var;
            int i4 = kVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kVar.label = i4 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, zn2Var);
            }
        } else {
            kVar = new k(this, zn2Var);
        }
        Object obj = kVar.result;
        int i5 = kVar.label;
        Map map = null;
        byte b = 0;
        byte b2 = 0;
        Object obj2 = bw2.a;
        try {
            if (i5 == 0) {
                jzb.q(obj);
                kVar.L$0 = str;
                d99Var = this.e;
                kVar.L$1 = d99Var;
                kVar.label = 1;
                if (d99Var.b(kVar) != obj2) {
                }
                return obj2;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) kVar.L$1;
                str2 = (String) kVar.L$0;
                try {
                    jzb.q(obj);
                    fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) ((Map) obj).get(str2);
                    if (fiveCardUpgradeManager$AccountState == null) {
                        fiveCardUpgradeManager$AccountState = new FiveCardUpgradeManager$AccountState(map, (Set) (b2 == true ? 1 : 0), 3, (rp3) (b == true ? 1 : 0));
                    }
                    collectionValues = fiveCardUpgradeManager$AccountState.getReadings().values();
                    int i6 = 0;
                    if ((collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        it = collectionValues.iterator();
                        int i7 = 0;
                        while (it.hasNext()) {
                            if (((FiveCardUpgradeManager$ReadingState) it.next()).getBefore() == null && (i7 = i7 + 1) < 0) {
                                t72.Y();
                                throw null;
                            }
                        }
                        i = i7;
                    } else {
                        i = 0;
                    }
                    collectionValues2 = fiveCardUpgradeManager$AccountState.getReadings().values();
                    if ((collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                        int i8 = 0;
                        for (FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState : collectionValues2) {
                            if (!fiveCardUpgradeManager$ReadingState.getSucceeded() && !fiveCardUpgradeManager$ReadingState.getConfirmed() && !fiveCardUpgradeManager$ReadingState.getSuppressed() && (i8 = i8 + 1) < 0) {
                                t72.Y();
                                throw null;
                            }
                        }
                        i2 = i8;
                    } else {
                        i2 = 0;
                    }
                    setKeySet = this.f.keySet();
                    if ((setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                        it2 = setKeySet.iterator();
                        int i9 = 0;
                        while (it2.hasNext()) {
                            if (!pa7.t(((iy9) it2.next()).d(), str2) && (i9 = i9 + 1) < 0) {
                                t72.Y();
                                throw null;
                            }
                        }
                        i3 = i9;
                    } else {
                        i3 = 0;
                    }
                    it3 = fiveCardUpgradeManager$AccountState.getReadings().values().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            fiveCardUpgradePending = null;
                            break;
                        }
                        pending = ((FiveCardUpgradeManager$ReadingState) it3.next()).getPending();
                        if (pending != null) {
                            fiveCardUpgradePending = pending;
                            break;
                        }
                    }
                    int size = fiveCardUpgradeManager$AccountState.getExposedOrderIds().size();
                    collectionValues3 = fiveCardUpgradeManager$AccountState.getReadings().values();
                    if ((collectionValues3 instanceof Collection) || !collectionValues3.isEmpty()) {
                        it4 = collectionValues3.iterator();
                        while (it4.hasNext()) {
                            if (!((FiveCardUpgradeManager$ReadingState) it4.next()).getSuppressed() && (i6 = i6 + 1) < 0) {
                                t72.Y();
                                throw null;
                            }
                        }
                    }
                    eh5 eh5Var = new eh5(i, i2, i3, fiveCardUpgradePending, size, i6);
                    d99Var2.h(null);
                    return eh5Var;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99 d99Var3 = (d99) kVar.L$1;
            String str3 = (String) kVar.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            str = str3;
            kVar.L$0 = str;
            kVar.L$1 = d99Var;
            kVar.label = 2;
            Object objL = l(kVar);
            if (objL != obj2) {
                str2 = str;
                d99Var2 = d99Var;
                obj = objL;
                fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) ((Map) obj).get(str2);
                if (fiveCardUpgradeManager$AccountState == null) {
                    fiveCardUpgradeManager$AccountState = new FiveCardUpgradeManager$AccountState(map, (Set) (b2 == true ? 1 : 0), 3, (rp3) (b == true ? 1 : 0));
                }
                collectionValues = fiveCardUpgradeManager$AccountState.getReadings().values();
                int i10 = 0;
                if (collectionValues instanceof Collection) {
                    it = collectionValues.iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        if (((FiveCardUpgradeManager$ReadingState) it.next()).getBefore() == null) {
                            t72.Y();
                            throw null;
                        }
                    }
                    i = i11;
                } else {
                    it = collectionValues.iterator();
                    int i12 = 0;
                    while (it.hasNext()) {
                        if (((FiveCardUpgradeManager$ReadingState) it.next()).getBefore() == null) {
                            t72.Y();
                            throw null;
                        }
                    }
                    i = i12;
                }
                collectionValues2 = fiveCardUpgradeManager$AccountState.getReadings().values();
                if (collectionValues2 instanceof Collection) {
                    int i13 = 0;
                    while (r1.hasNext()) {
                        if (!fiveCardUpgradeManager$ReadingState.getSucceeded()) {
                            t72.Y();
                            throw null;
                        }
                    }
                    i2 = i13;
                } else {
                    int i14 = 0;
                    while (r1.hasNext()) {
                        if (!fiveCardUpgradeManager$ReadingState.getSucceeded()) {
                            t72.Y();
                            throw null;
                        }
                    }
                    i2 = i14;
                }
                setKeySet = this.f.keySet();
                if (setKeySet instanceof Collection) {
                    it2 = setKeySet.iterator();
                    int i15 = 0;
                    while (it2.hasNext()) {
                        if (!pa7.t(((iy9) it2.next()).d(), str2)) {
                            t72.Y();
                            throw null;
                        }
                    }
                    i3 = i15;
                } else {
                    it2 = setKeySet.iterator();
                    int i16 = 0;
                    while (it2.hasNext()) {
                        if (!pa7.t(((iy9) it2.next()).d(), str2)) {
                            t72.Y();
                            throw null;
                        }
                    }
                    i3 = i16;
                }
                it3 = fiveCardUpgradeManager$AccountState.getReadings().values().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        fiveCardUpgradePending = null;
                        break;
                    }
                    pending = ((FiveCardUpgradeManager$ReadingState) it3.next()).getPending();
                    if (pending != null) {
                        fiveCardUpgradePending = pending;
                        break;
                    }
                }
                int size2 = fiveCardUpgradeManager$AccountState.getExposedOrderIds().size();
                collectionValues3 = fiveCardUpgradeManager$AccountState.getReadings().values();
                if (collectionValues3 instanceof Collection) {
                    it4 = collectionValues3.iterator();
                    while (it4.hasNext()) {
                        if (!((FiveCardUpgradeManager$ReadingState) it4.next()).getSuppressed()) {
                            t72.Y();
                            throw null;
                        }
                    }
                } else {
                    it4 = collectionValues3.iterator();
                    while (it4.hasNext()) {
                        if (!((FiveCardUpgradeManager$ReadingState) it4.next()).getSuppressed()) {
                            t72.Y();
                            throw null;
                        }
                    }
                }
                eh5 eh5Var2 = new eh5(i, i2, i3, fiveCardUpgradePending, size2, i10);
                d99Var2.h(null);
                return eh5Var2;
            }
            return obj2;
        } catch (Throwable th3) {
            th = th3;
            d99Var2 = d99Var;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(zn2 zn2Var) {
        l lVar;
        if (zn2Var instanceof l) {
            lVar = (l) zn2Var;
            int i = lVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.label = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, zn2Var);
            }
        } else {
            lVar = new l(this, zn2Var);
        }
        Object objB = lVar.result;
        int i2 = lVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objB);
                fab fabVar = this.c;
                lVar.label = 1;
                objB = ((rab) fabVar).b(lVar);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objB);
            }
            return (QuotaUsage) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            d().h("Failed to confirm five-card upgrade quota", e2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b2 A[Catch: all -> 0x0281, TryCatch #0 {all -> 0x0281, blocks: (B:106:0x02ca, B:107:0x02d8, B:109:0x02de, B:111:0x02ea, B:113:0x02f0, B:116:0x02f7, B:117:0x02fb, B:119:0x0301, B:37:0x00b6, B:40:0x00c2, B:99:0x02ac, B:101:0x02b2, B:63:0x015e, B:64:0x017d, B:76:0x01cc, B:77:0x01dd, B:79:0x01e3, B:84:0x0215, B:86:0x021b, B:88:0x0221, B:91:0x0229, B:93:0x023b, B:97:0x0289, B:98:0x02a8), top: B:132:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:109:0x02de A[Catch: all -> 0x0281, TryCatch #0 {all -> 0x0281, blocks: (B:106:0x02ca, B:107:0x02d8, B:109:0x02de, B:111:0x02ea, B:113:0x02f0, B:116:0x02f7, B:117:0x02fb, B:119:0x0301, B:37:0x00b6, B:40:0x00c2, B:99:0x02ac, B:101:0x02b2, B:63:0x015e, B:64:0x017d, B:76:0x01cc, B:77:0x01dd, B:79:0x01e3, B:84:0x0215, B:86:0x021b, B:88:0x0221, B:91:0x0229, B:93:0x023b, B:97:0x0289, B:98:0x02a8), top: B:132:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02ea A[Catch: all -> 0x0281, TryCatch #0 {all -> 0x0281, blocks: (B:106:0x02ca, B:107:0x02d8, B:109:0x02de, B:111:0x02ea, B:113:0x02f0, B:116:0x02f7, B:117:0x02fb, B:119:0x0301, B:37:0x00b6, B:40:0x00c2, B:99:0x02ac, B:101:0x02b2, B:63:0x015e, B:64:0x017d, B:76:0x01cc, B:77:0x01dd, B:79:0x01e3, B:84:0x0215, B:86:0x021b, B:88:0x0221, B:91:0x0229, B:93:0x023b, B:97:0x0289, B:98:0x02a8), top: B:132:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02f0 A[Catch: all -> 0x0281, TryCatch #0 {all -> 0x0281, blocks: (B:106:0x02ca, B:107:0x02d8, B:109:0x02de, B:111:0x02ea, B:113:0x02f0, B:116:0x02f7, B:117:0x02fb, B:119:0x0301, B:37:0x00b6, B:40:0x00c2, B:99:0x02ac, B:101:0x02b2, B:63:0x015e, B:64:0x017d, B:76:0x01cc, B:77:0x01dd, B:79:0x01e3, B:84:0x0215, B:86:0x021b, B:88:0x0221, B:91:0x0229, B:93:0x023b, B:97:0x0289, B:98:0x02a8), top: B:132:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02f7 A[Catch: all -> 0x0281, TryCatch #0 {all -> 0x0281, blocks: (B:106:0x02ca, B:107:0x02d8, B:109:0x02de, B:111:0x02ea, B:113:0x02f0, B:116:0x02f7, B:117:0x02fb, B:119:0x0301, B:37:0x00b6, B:40:0x00c2, B:99:0x02ac, B:101:0x02b2, B:63:0x015e, B:64:0x017d, B:76:0x01cc, B:77:0x01dd, B:79:0x01e3, B:84:0x0215, B:86:0x021b, B:88:0x0221, B:91:0x0229, B:93:0x023b, B:97:0x0289, B:98:0x02a8), top: B:132:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0301 A[Catch: all -> 0x0281, TRY_LEAVE, TryCatch #0 {all -> 0x0281, blocks: (B:106:0x02ca, B:107:0x02d8, B:109:0x02de, B:111:0x02ea, B:113:0x02f0, B:116:0x02f7, B:117:0x02fb, B:119:0x0301, B:37:0x00b6, B:40:0x00c2, B:99:0x02ac, B:101:0x02b2, B:63:0x015e, B:64:0x017d, B:76:0x01cc, B:77:0x01dd, B:79:0x01e3, B:84:0x0215, B:86:0x021b, B:88:0x0221, B:91:0x0229, B:93:0x023b, B:97:0x0289, B:98:0x02a8), top: B:132:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0311  */
    /* JADX WARN: Code duplicated, block: B:137:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:? A[LOOP:1: B:117:0x02fb->B:144:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0102 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2 A[Catch: all -> 0x0281, TRY_LEAVE, TryCatch #0 {all -> 0x0281, blocks: (B:106:0x02ca, B:107:0x02d8, B:109:0x02de, B:111:0x02ea, B:113:0x02f0, B:116:0x02f7, B:117:0x02fb, B:119:0x0301, B:37:0x00b6, B:40:0x00c2, B:99:0x02ac, B:101:0x02b2, B:63:0x015e, B:64:0x017d, B:76:0x01cc, B:77:0x01dd, B:79:0x01e3, B:84:0x0215, B:86:0x021b, B:88:0x0221, B:91:0x0229, B:93:0x023b, B:97:0x0289, B:98:0x02a8), top: B:132:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8 A[Catch: all -> 0x004b, TRY_ENTER, TryCatch #1 {all -> 0x004b, blocks: (B:14:0x0046, B:21:0x0060, B:42:0x00c8, B:44:0x00d6, B:57:0x010b, B:58:0x0126, B:60:0x012c, B:61:0x0157, B:47:0x00e0, B:48:0x00e4, B:50:0x00ea, B:52:0x00f6, B:54:0x00fc, B:56:0x0102, B:66:0x0183, B:74:0x01c7, B:69:0x019d, B:73:0x01b3, B:82:0x020d, B:90:0x0227), top: B:134:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0 A[Catch: all -> 0x004b, TryCatch #1 {all -> 0x004b, blocks: (B:14:0x0046, B:21:0x0060, B:42:0x00c8, B:44:0x00d6, B:57:0x010b, B:58:0x0126, B:60:0x012c, B:61:0x0157, B:47:0x00e0, B:48:0x00e4, B:50:0x00ea, B:52:0x00f6, B:54:0x00fc, B:56:0x0102, B:66:0x0183, B:74:0x01c7, B:69:0x019d, B:73:0x01b3, B:82:0x020d, B:90:0x0227), top: B:134:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[Catch: all -> 0x004b, TryCatch #1 {all -> 0x004b, blocks: (B:14:0x0046, B:21:0x0060, B:42:0x00c8, B:44:0x00d6, B:57:0x010b, B:58:0x0126, B:60:0x012c, B:61:0x0157, B:47:0x00e0, B:48:0x00e4, B:50:0x00ea, B:52:0x00f6, B:54:0x00fc, B:56:0x0102, B:66:0x0183, B:74:0x01c7, B:69:0x019d, B:73:0x01b3, B:82:0x020d, B:90:0x0227), top: B:134:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6 A[Catch: all -> 0x004b, TryCatch #1 {all -> 0x004b, blocks: (B:14:0x0046, B:21:0x0060, B:42:0x00c8, B:44:0x00d6, B:57:0x010b, B:58:0x0126, B:60:0x012c, B:61:0x0157, B:47:0x00e0, B:48:0x00e4, B:50:0x00ea, B:52:0x00f6, B:54:0x00fc, B:56:0x0102, B:66:0x0183, B:74:0x01c7, B:69:0x019d, B:73:0x01b3, B:82:0x020d, B:90:0x0227), top: B:134:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x012c A[Catch: all -> 0x004b, LOOP:2: B:58:0x0126->B:60:0x012c, LOOP_END, TryCatch #1 {all -> 0x004b, blocks: (B:14:0x0046, B:21:0x0060, B:42:0x00c8, B:44:0x00d6, B:57:0x010b, B:58:0x0126, B:60:0x012c, B:61:0x0157, B:47:0x00e0, B:48:0x00e4, B:50:0x00ea, B:52:0x00f6, B:54:0x00fc, B:56:0x0102, B:66:0x0183, B:74:0x01c7, B:69:0x019d, B:73:0x01b3, B:82:0x020d, B:90:0x0227), top: B:134:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x015e A[Catch: all -> 0x0281, TRY_ENTER, TryCatch #0 {all -> 0x0281, blocks: (B:106:0x02ca, B:107:0x02d8, B:109:0x02de, B:111:0x02ea, B:113:0x02f0, B:116:0x02f7, B:117:0x02fb, B:119:0x0301, B:37:0x00b6, B:40:0x00c2, B:99:0x02ac, B:101:0x02b2, B:63:0x015e, B:64:0x017d, B:76:0x01cc, B:77:0x01dd, B:79:0x01e3, B:84:0x0215, B:86:0x021b, B:88:0x0221, B:91:0x0229, B:93:0x023b, B:97:0x0289, B:98:0x02a8), top: B:132:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0183 A[Catch: all -> 0x004b, TRY_ENTER, TryCatch #1 {all -> 0x004b, blocks: (B:14:0x0046, B:21:0x0060, B:42:0x00c8, B:44:0x00d6, B:57:0x010b, B:58:0x0126, B:60:0x012c, B:61:0x0157, B:47:0x00e0, B:48:0x00e4, B:50:0x00ea, B:52:0x00f6, B:54:0x00fc, B:56:0x0102, B:66:0x0183, B:74:0x01c7, B:69:0x019d, B:73:0x01b3, B:82:0x020d, B:90:0x0227), top: B:134:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x019c  */
    /* JADX WARN: Code duplicated, block: B:69:0x019d A[Catch: all -> 0x004b, TryCatch #1 {all -> 0x004b, blocks: (B:14:0x0046, B:21:0x0060, B:42:0x00c8, B:44:0x00d6, B:57:0x010b, B:58:0x0126, B:60:0x012c, B:61:0x0157, B:47:0x00e0, B:48:0x00e4, B:50:0x00ea, B:52:0x00f6, B:54:0x00fc, B:56:0x0102, B:66:0x0183, B:74:0x01c7, B:69:0x019d, B:73:0x01b3, B:82:0x020d, B:90:0x0227), top: B:134:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e3 A[Catch: all -> 0x0281, TRY_LEAVE, TryCatch #0 {all -> 0x0281, blocks: (B:106:0x02ca, B:107:0x02d8, B:109:0x02de, B:111:0x02ea, B:113:0x02f0, B:116:0x02f7, B:117:0x02fb, B:119:0x0301, B:37:0x00b6, B:40:0x00c2, B:99:0x02ac, B:101:0x02b2, B:63:0x015e, B:64:0x017d, B:76:0x01cc, B:77:0x01dd, B:79:0x01e3, B:84:0x0215, B:86:0x021b, B:88:0x0221, B:91:0x0229, B:93:0x023b, B:97:0x0289, B:98:0x02a8), top: B:132:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [ai.askquin.ui.paywall.upgrade.s, hf8] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [d99] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final Object k(String str, QuotaUsage quotaUsage, zn2 zn2Var) {
        m mVar;
        String str2;
        QuotaUsage quotaUsage2;
        f99 f99Var;
        d99 d99Var;
        QuotaUsage quotaUsage3;
        String str3;
        ?? r9;
        FiveCardUpgradePending fiveCardUpgradePending;
        Map map;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountState;
        Instant instantNow;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountStateCopy$default;
        String key;
        FiveCardUpgradeManager$ReadingState value;
        FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingStateCopy$default;
        FiveCardUpgradePending pending;
        Set<String> exposedOrderIds;
        FiveCardUpgradePending fiveCardUpgradePending2;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountState2;
        Collection<FiveCardUpgradeManager$ReadingState> collectionValues;
        LinkedHashMap linkedHashMap3;
        ?? r10;
        Iterator it;
        FiveCardUpgradePending pending2;
        List<String> orderIds;
        Iterator it2;
        ?? r3;
        if (zn2Var instanceof m) {
            mVar = (m) zn2Var;
            int i = mVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mVar.label = i - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, zn2Var);
            }
        } else {
            mVar = new m(this, zn2Var);
        }
        Object obj = mVar.result;
        ?? r4 = mVar.label;
        int i2 = 2;
        Set set = null;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (r4 == 0) {
                    jzb.q(obj);
                    if (!e(str)) {
                        return null;
                    }
                    str2 = str;
                    mVar.L$0 = str2;
                    quotaUsage2 = quotaUsage;
                    mVar.L$1 = quotaUsage2;
                    f99Var = this.e;
                    mVar.L$2 = f99Var;
                    mVar.label = 1;
                    if (f99Var.b(mVar) != bw2Var) {
                    }
                    d99Var = f99Var;
                    return bw2Var;
                }
                if (r4 == 1) {
                    d99 d99Var2 = (d99) mVar.L$2;
                    QuotaUsage quotaUsage4 = (QuotaUsage) mVar.L$1;
                    String str4 = (String) mVar.L$0;
                    jzb.q(obj);
                    str2 = str4;
                    d99Var = d99Var2;
                    quotaUsage2 = quotaUsage4;
                } else {
                    if (r4 == 2) {
                        d99 d99Var3 = (d99) mVar.L$2;
                        QuotaUsage quotaUsage5 = (QuotaUsage) mVar.L$1;
                        str3 = (String) mVar.L$0;
                        jzb.q(obj);
                        quotaUsage3 = quotaUsage5;
                        r4 = d99Var3;
                        try {
                            map = (Map) obj;
                            fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) map.get(str3);
                            if (fiveCardUpgradeManager$AccountState == null) {
                                r9 = r4;
                                fiveCardUpgradePending = null;
                                r10 = r9;
                                r10.h(set);
                                return fiveCardUpgradePending;
                            }
                            if (quotaUsage3.getHasSubscription()) {
                                collectionValues = fiveCardUpgradeManager$AccountState.getReadings().values();
                                if ((collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                                    for (FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState : collectionValues) {
                                        if (fiveCardUpgradeManager$ReadingState.getPending() == null || (fiveCardUpgradeManager$ReadingState.getSucceeded() && !fiveCardUpgradeManager$ReadingState.getConfirmed())) {
                                            d().e("Five-card upgrade discarded after subscription became active");
                                            break;
                                        }
                                    }
                                }
                                Map<String, FiveCardUpgradeManager$ReadingState> readings = fiveCardUpgradeManager$AccountState.getReadings();
                                linkedHashMap3 = new LinkedHashMap(bm8.F(readings.size()));
                                for (Object obj2 : readings.entrySet()) {
                                    linkedHashMap3.put(((Map.Entry) obj2).getKey(), FiveCardUpgradeManager$ReadingState.copy$default((FiveCardUpgradeManager$ReadingState) ((Map.Entry) obj2).getValue(), null, null, false, true, false, null, 23, null));
                                }
                                fiveCardUpgradeManager$AccountStateCopy$default = FiveCardUpgradeManager$AccountState.copy$default(fiveCardUpgradeManager$AccountState, linkedHashMap3, null, 2, null);
                            } else {
                                instantNow = Instant.now();
                                Map<String, FiveCardUpgradeManager$ReadingState> readings2 = fiveCardUpgradeManager$AccountState.getReadings();
                                linkedHashMap = new LinkedHashMap(bm8.F(readings2.size()));
                                for (Object obj3 : readings2.entrySet()) {
                                    Object key2 = ((Map.Entry) obj3).getKey();
                                    fiveCardUpgradeManager$ReadingStateCopy$default = (FiveCardUpgradeManager$ReadingState) ((Map.Entry) obj3).getValue();
                                    if (fiveCardUpgradeManager$ReadingStateCopy$default.getPending() == null) {
                                        pending = fiveCardUpgradeManager$ReadingStateCopy$default.getPending();
                                        exposedOrderIds = fiveCardUpgradeManager$AccountState.getExposedOrderIds();
                                        instantNow.getClass();
                                        if (g(fiveCardUpgradeManager$ReadingStateCopy$default, quotaUsage3, exposedOrderIds, instantNow)) {
                                            fiveCardUpgradePending2 = pending;
                                        } else {
                                            fiveCardUpgradePending2 = null;
                                        }
                                        fiveCardUpgradeManager$ReadingStateCopy$default = FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingStateCopy$default, null, null, false, false, false, fiveCardUpgradePending2, 31, null);
                                    }
                                    linkedHashMap.put(key2, fiveCardUpgradeManager$ReadingStateCopy$default);
                                }
                                linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                                for (Map.Entry<String, FiveCardUpgradeManager$ReadingState> entry : fiveCardUpgradeManager$AccountState.getReadings().entrySet()) {
                                    key = entry.getKey();
                                    value = entry.getValue();
                                    if (value.getSuppressed()) {
                                        linkedHashMap2.put(key, FiveCardUpgradeManager$ReadingState.copy$default(value, null, null, false, true, false, null, 23, null));
                                    } else if (!value.getSucceeded() && !value.getConfirmed()) {
                                        List<LimitedQuota> before = value.getBefore();
                                        if (before == null) {
                                            before = pu4.a;
                                        }
                                        Set<String> exposedOrderIds2 = fiveCardUpgradeManager$AccountState.getExposedOrderIds();
                                        instantNow.getClass();
                                        FiveCardUpgradePending fiveCardUpgradePendingC = n16.C(str3, key, before, quotaUsage3, exposedOrderIds2, instantNow);
                                        if (fiveCardUpgradePendingC != null) {
                                            d().e("Five-card upgrade pending: reading=" + key + " remaining=" + fiveCardUpgradePendingC.getRemainingReadings() + " orderCount=" + fiveCardUpgradePendingC.getOrderIds().size());
                                            final a aVar = new a(key, fiveCardUpgradePendingC);
                                            linkedHashMap2.replaceAll(new BiFunction() { // from class: ai.askquin.ui.paywall.upgrade.b
                                                @Override // java.util.function.BiFunction
                                                public final Object apply(Object obj4, Object obj5) {
                                                    return (FiveCardUpgradeManager$ReadingState) aVar.z(obj4, obj5);
                                                }
                                            });
                                        }
                                        linkedHashMap2.put(key, FiveCardUpgradeManager$ReadingState.copy$default(value, null, null, false, true, false, fiveCardUpgradePendingC, 23, null));
                                        quotaUsage3 = quotaUsage3;
                                        instantNow = instantNow;
                                        i2 = 2;
                                        set = null;
                                    }
                                }
                                fiveCardUpgradeManager$AccountStateCopy$default = FiveCardUpgradeManager$AccountState.copy$default(fiveCardUpgradeManager$AccountState, linkedHashMap2, set, i2, set);
                            }
                            r4 = r4;
                            if (!pa7.t(fiveCardUpgradeManager$AccountStateCopy$default, fiveCardUpgradeManager$AccountState)) {
                                mVar.L$0 = set;
                                mVar.L$1 = set;
                                mVar.L$2 = r4;
                                mVar.L$3 = set;
                                mVar.L$4 = fiveCardUpgradeManager$AccountStateCopy$default;
                                mVar.L$5 = set;
                                mVar.label = 3;
                                if (p(map, str3, fiveCardUpgradeManager$AccountStateCopy$default, mVar) != bw2Var) {
                                    fiveCardUpgradeManager$AccountState2 = fiveCardUpgradeManager$AccountStateCopy$default;
                                    r3 = r4;
                                }
                                d99Var = f99Var;
                                return bw2Var;
                            }
                            it = fiveCardUpgradeManager$AccountStateCopy$default.getReadings().values().iterator();
                            do {
                                if (!it.hasNext()) {
                                    pending2 = null;
                                    break;
                                }
                                pending2 = ((FiveCardUpgradeManager$ReadingState) it.next()).getPending();
                                if (pending2 == null) {
                                    pending2 = null;
                                    break;
                                }
                                orderIds = pending2.getOrderIds();
                                if (orderIds != null || !orderIds.isEmpty()) {
                                    it2 = orderIds.iterator();
                                    while (it2.hasNext()) {
                                        if (fiveCardUpgradeManager$AccountStateCopy$default.getExposedOrderIds().contains((String) it2.next())) {
                                            pending2 = null;
                                            break;
                                            break;
                                        }
                                    }
                                }
                            } while (pending2 == null);
                            fiveCardUpgradePending = pending2;
                            r10 = r4;
                            set = null;
                            r10.h(set);
                            return fiveCardUpgradePending;
                        } catch (Throwable th) {
                            th = th;
                            set = null;
                            r4.h(set);
                            throw th;
                        }
                    }
                    if (r4 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fiveCardUpgradeManager$AccountState2 = (FiveCardUpgradeManager$AccountState) mVar.L$4;
                    d99 d99Var4 = (d99) mVar.L$2;
                    jzb.q(obj);
                    r3 = d99Var4;
                }
                fiveCardUpgradeManager$AccountStateCopy$default = fiveCardUpgradeManager$AccountState2;
                r4 = r3;
                it = fiveCardUpgradeManager$AccountStateCopy$default.getReadings().values().iterator();
                do {
                    if (!it.hasNext()) {
                        pending2 = null;
                        break;
                    }
                    pending2 = ((FiveCardUpgradeManager$ReadingState) it.next()).getPending();
                    if (pending2 == null) {
                        pending2 = null;
                        break;
                        break;
                    }
                    orderIds = pending2.getOrderIds();
                    if (orderIds != null) {
                        it2 = orderIds.iterator();
                        while (it2.hasNext()) {
                            if (fiveCardUpgradeManager$AccountStateCopy$default.getExposedOrderIds().contains((String) it2.next())) {
                                pending2 = null;
                                break;
                                break;
                            }
                        }
                    } else {
                        it2 = orderIds.iterator();
                        while (it2.hasNext()) {
                            if (fiveCardUpgradeManager$AccountStateCopy$default.getExposedOrderIds().contains((String) it2.next())) {
                                pending2 = null;
                                break;
                                break;
                            }
                        }
                    }
                } while (pending2 == null);
                fiveCardUpgradePending = pending2;
                r10 = r4;
                set = null;
                r10.h(set);
                return fiveCardUpgradePending;
                d99Var = f99Var;
                r9 = d99Var;
                if (e(str2)) {
                    mVar.L$0 = str2;
                    mVar.L$1 = quotaUsage2;
                    mVar.L$2 = d99Var;
                    mVar.label = 2;
                    Object objL = l(mVar);
                    if (objL != bw2Var) {
                        quotaUsage3 = quotaUsage2;
                        r4 = d99Var;
                        str3 = str2;
                        obj = objL;
                        map = (Map) obj;
                        fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) map.get(str3);
                        if (fiveCardUpgradeManager$AccountState == null) {
                            r9 = r4;
                            fiveCardUpgradePending = null;
                            r10 = r9;
                        } else {
                            if (quotaUsage3.getHasSubscription()) {
                                collectionValues = fiveCardUpgradeManager$AccountState.getReadings().values();
                                if (collectionValues instanceof Collection) {
                                    while (r10.hasNext()) {
                                        if (fiveCardUpgradeManager$ReadingState.getPending() == null) {
                                        }
                                        d().e("Five-card upgrade discarded after subscription became active");
                                    }
                                } else {
                                    while (r10.hasNext()) {
                                        if (fiveCardUpgradeManager$ReadingState.getPending() == null) {
                                        }
                                        d().e("Five-card upgrade discarded after subscription became active");
                                    }
                                }
                                Map<String, FiveCardUpgradeManager$ReadingState> readings3 = fiveCardUpgradeManager$AccountState.getReadings();
                                linkedHashMap3 = new LinkedHashMap(bm8.F(readings3.size()));
                                while (r10.hasNext()) {
                                    linkedHashMap3.put(((Map.Entry) obj2).getKey(), FiveCardUpgradeManager$ReadingState.copy$default((FiveCardUpgradeManager$ReadingState) ((Map.Entry) obj2).getValue(), null, null, false, true, false, null, 23, null));
                                }
                                fiveCardUpgradeManager$AccountStateCopy$default = FiveCardUpgradeManager$AccountState.copy$default(fiveCardUpgradeManager$AccountState, linkedHashMap3, null, 2, null);
                            } else {
                                instantNow = Instant.now();
                                Map<String, FiveCardUpgradeManager$ReadingState> readings4 = fiveCardUpgradeManager$AccountState.getReadings();
                                linkedHashMap = new LinkedHashMap(bm8.F(readings4.size()));
                                while (r10.hasNext()) {
                                    Object key3 = ((Map.Entry) obj3).getKey();
                                    fiveCardUpgradeManager$ReadingStateCopy$default = (FiveCardUpgradeManager$ReadingState) ((Map.Entry) obj3).getValue();
                                    if (fiveCardUpgradeManager$ReadingStateCopy$default.getPending() == null) {
                                        pending = fiveCardUpgradeManager$ReadingStateCopy$default.getPending();
                                        exposedOrderIds = fiveCardUpgradeManager$AccountState.getExposedOrderIds();
                                        instantNow.getClass();
                                        if (g(fiveCardUpgradeManager$ReadingStateCopy$default, quotaUsage3, exposedOrderIds, instantNow)) {
                                            fiveCardUpgradePending2 = pending;
                                        } else {
                                            fiveCardUpgradePending2 = null;
                                        }
                                        fiveCardUpgradeManager$ReadingStateCopy$default = FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingStateCopy$default, null, null, false, false, false, fiveCardUpgradePending2, 31, null);
                                    }
                                    linkedHashMap.put(key3, fiveCardUpgradeManager$ReadingStateCopy$default);
                                }
                                linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                                while (r15.hasNext()) {
                                    key = entry.getKey();
                                    value = entry.getValue();
                                    if (value.getSuppressed()) {
                                        linkedHashMap2.put(key, FiveCardUpgradeManager$ReadingState.copy$default(value, null, null, false, true, false, null, 23, null));
                                    } else if (!value.getSucceeded()) {
                                    }
                                }
                                fiveCardUpgradeManager$AccountStateCopy$default = FiveCardUpgradeManager$AccountState.copy$default(fiveCardUpgradeManager$AccountState, linkedHashMap2, set, i2, set);
                            }
                            r4 = r4;
                            if (!pa7.t(fiveCardUpgradeManager$AccountStateCopy$default, fiveCardUpgradeManager$AccountState)) {
                                mVar.L$0 = set;
                                mVar.L$1 = set;
                                mVar.L$2 = r4;
                                mVar.L$3 = set;
                                mVar.L$4 = fiveCardUpgradeManager$AccountStateCopy$default;
                                mVar.L$5 = set;
                                mVar.label = 3;
                                if (p(map, str3, fiveCardUpgradeManager$AccountStateCopy$default, mVar) != bw2Var) {
                                    fiveCardUpgradeManager$AccountState2 = fiveCardUpgradeManager$AccountStateCopy$default;
                                    r3 = r4;
                                    fiveCardUpgradeManager$AccountStateCopy$default = fiveCardUpgradeManager$AccountState2;
                                    r4 = r3;
                                }
                            }
                            it = fiveCardUpgradeManager$AccountStateCopy$default.getReadings().values().iterator();
                            do {
                                if (!it.hasNext()) {
                                    pending2 = null;
                                    break;
                                }
                                pending2 = ((FiveCardUpgradeManager$ReadingState) it.next()).getPending();
                                if (pending2 == null) {
                                    pending2 = null;
                                    break;
                                    break;
                                }
                                orderIds = pending2.getOrderIds();
                                if (orderIds != null) {
                                    it2 = orderIds.iterator();
                                    while (it2.hasNext()) {
                                        if (fiveCardUpgradeManager$AccountStateCopy$default.getExposedOrderIds().contains((String) it2.next())) {
                                            pending2 = null;
                                            break;
                                            break;
                                        }
                                    }
                                } else {
                                    it2 = orderIds.iterator();
                                    while (it2.hasNext()) {
                                        if (fiveCardUpgradeManager$AccountStateCopy$default.getExposedOrderIds().contains((String) it2.next())) {
                                            pending2 = null;
                                            break;
                                            break;
                                        }
                                    }
                                }
                            } while (pending2 == null);
                            fiveCardUpgradePending = pending2;
                            r10 = r4;
                            set = null;
                        }
                    }
                    d99Var = f99Var;
                    return bw2Var;
                }
                fiveCardUpgradePending = null;
                r10 = r9;
                r10.h(set);
                return fiveCardUpgradePending;
            } catch (Throwable th2) {
                th = th2;
                r4 = d99Var;
                set = null;
                r4.h(set);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(zn2 zn2Var) throws Throwable {
        n nVar;
        if (zn2Var instanceof n) {
            nVar = (n) zn2Var;
            int i = nVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nVar.label = i - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, zn2Var);
            }
        } else {
            nVar = new n(this, zn2Var);
        }
        Object objI = nVar.result;
        int i2 = nVar.label;
        if (i2 == 0) {
            jzb.q(objI);
            nVar.label = 1;
            hs3 hs3Var = xqa.D;
            objI = z5c.I(nu4.a, new eqa(hs3Var.a, hs3Var.b, null));
            bw2 bw2Var = bw2.a;
            if (objI == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objI);
        }
        String str = (String) objI;
        if (v4e.Q(str)) {
            return qu4.a;
        }
        xh7 xh7Var = fzc.a;
        xh7Var.getClass();
        return xh7Var.b(new qh6(p4e.a, FiveCardUpgradeManager$AccountState.Companion.serializer(), 1), str);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc A[EDGE_INSN: B:58:0x00fc->B:76:0x0144 BREAK  A[LOOP:0: B:60:0x0102->B:93:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x0114  */
    /* JADX WARN: Code duplicated, block: B:68:0x011f  */
    /* JADX WARN: Code duplicated, block: B:74:0x013a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144 A[EDGE_INSN: B:90:0x0144->B:76:0x0144 BREAK  A[LOOP:0: B:60:0x0102->B:93:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ai.askquin.ui.paywall.upgrade.s] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v5, types: [d99] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    public final Object m(String str, String str2, zn2 zn2Var) {
        o oVar;
        ?? r13;
        ?? r4;
        d99 d99Var;
        String str3;
        QuotaUsage quotaUsage;
        ?? r3;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountState;
        List<LimitedQuota> before;
        pu4 pu4Var;
        Iterator it;
        LimitedQuota limitedQuota;
        List<LimitedQuota> limitedQuotaList;
        Iterator it2;
        Object next;
        LimitedQuota limitedQuota2;
        Map<String, FiveCardUpgradeManager$ReadingState> readings;
        FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState;
        if (zn2Var instanceof o) {
            oVar = (o) zn2Var;
            int i = oVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oVar.label = i - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, zn2Var);
            }
        } else {
            oVar = new o(this, zn2Var);
        }
        Object objJ = oVar.result;
        int i2 = oVar.label;
        int i3 = 1;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(objJ);
                oVar.L$0 = str;
                oVar.L$1 = str2;
                oVar.label = 1;
                objJ = j(oVar);
                if (objJ != bw2Var) {
                }
                r13 = str;
                return bw2Var;
            }
            if (i2 == 1) {
                str2 = (String) oVar.L$1;
                String str4 = (String) oVar.L$0;
                jzb.q(objJ);
                r13 = str4;
            } else {
                if (i2 == 2) {
                    d99 d99Var2 = (d99) oVar.L$3;
                    quotaUsage = (QuotaUsage) oVar.L$2;
                    str3 = (String) oVar.L$1;
                    String str5 = (String) oVar.L$0;
                    jzb.q(objJ);
                    r4 = str5;
                    d99Var = d99Var2;
                    oVar.L$0 = r4;
                    oVar.L$1 = str3;
                    oVar.L$2 = quotaUsage;
                    oVar.L$3 = d99Var;
                    oVar.label = 3;
                    objJ = l(oVar);
                    if (objJ == bw2Var) {
                        r3 = r4;
                        str = d99Var;
                    }
                    r13 = str;
                    return bw2Var;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jzb.q(objJ);
                    return objJ;
                }
                d99 d99Var3 = (d99) oVar.L$3;
                quotaUsage = (QuotaUsage) oVar.L$2;
                str3 = (String) oVar.L$1;
                String str6 = (String) oVar.L$0;
                jzb.q(objJ);
                r3 = str6;
                str = d99Var3;
            }
            fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) ((Map) objJ).get(r3);
            if (fiveCardUpgradeManager$AccountState != null || (readings = fiveCardUpgradeManager$AccountState.getReadings()) == null || (fiveCardUpgradeManager$ReadingState = readings.get(str3)) == null) {
                before = null;
            } else {
                before = fiveCardUpgradeManager$ReadingState.getBefore();
            }
            pu4Var = pu4.a;
            if (before == null) {
                before = pu4Var;
            }
            str.h(null);
            if (before.isEmpty()) {
                it = before.iterator();
                do {
                    if (it.hasNext()) {
                        i3 = 0;
                        break;
                    }
                    limitedQuota = (LimitedQuota) it.next();
                    limitedQuotaList = quotaUsage.getLimitedQuotaList();
                    if (limitedQuotaList == null) {
                        limitedQuotaList = pu4Var;
                    }
                    it2 = limitedQuotaList.iterator();
                    do {
                        if (it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!pa7.t(((LimitedQuota) next).getOrderId(), limitedQuota.getOrderId()));
                    limitedQuota2 = (LimitedQuota) next;
                    if (limitedQuota2 != null) {
                        break;
                    }
                } while (limitedQuota2.getUsedCount() <= limitedQuota.getUsedCount());
            } else {
                i3 = 0;
                break;
            }
            if (i3 == 0 || before.isEmpty()) {
                return quotaUsage;
            }
            oVar.L$0 = null;
            oVar.L$1 = null;
            oVar.L$2 = null;
            oVar.L$3 = null;
            oVar.I$0 = i3;
            oVar.label = 4;
            Object objJ2 = j(oVar);
            if (objJ2 != bw2Var) {
                return objJ2;
            }
            r13 = str;
            return bw2Var;
            r13 = str;
            QuotaUsage quotaUsage2 = (QuotaUsage) objJ;
            if (quotaUsage2 == null) {
                return null;
            }
            if (!e(r13) || quotaUsage2.getHasSubscription()) {
                return quotaUsage2;
            }
            oVar.L$0 = r13;
            oVar.L$1 = str2;
            oVar.L$2 = quotaUsage2;
            f99 f99Var = this.e;
            oVar.L$3 = f99Var;
            oVar.label = 2;
            if (f99Var.b(oVar) != bw2Var) {
                r4 = r13;
                d99Var = f99Var;
                str3 = str2;
                quotaUsage = quotaUsage2;
                oVar.L$0 = r4;
                oVar.L$1 = str3;
                oVar.L$2 = quotaUsage;
                oVar.L$3 = d99Var;
                oVar.label = 3;
                objJ = l(oVar);
                if (objJ == bw2Var) {
                    r3 = r4;
                    str = d99Var;
                    fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) ((Map) objJ).get(r3);
                    if (fiveCardUpgradeManager$AccountState != null) {
                        before = null;
                    } else {
                        before = null;
                    }
                    pu4Var = pu4.a;
                    if (before == null) {
                        before = pu4Var;
                    }
                    str.h(null);
                    if (before.isEmpty()) {
                        it = before.iterator();
                        do {
                            if (it.hasNext()) {
                                i3 = 0;
                                break;
                            }
                            limitedQuota = (LimitedQuota) it.next();
                            limitedQuotaList = quotaUsage.getLimitedQuotaList();
                            if (limitedQuotaList == null) {
                                limitedQuotaList = pu4Var;
                            }
                            it2 = limitedQuotaList.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!pa7.t(((LimitedQuota) next).getOrderId(), limitedQuota.getOrderId()));
                            limitedQuota2 = (LimitedQuota) next;
                            if (limitedQuota2 != null) {
                                break;
                                break;
                            }
                        } while (limitedQuota2.getUsedCount() <= limitedQuota.getUsedCount());
                    } else {
                        i3 = 0;
                        break;
                    }
                    if (i3 == 0) {
                    }
                    return quotaUsage;
                }
            }
            r13 = str;
            return bw2Var;
        } catch (Throwable th) {
            str.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[LOOP:2: B:65:0x011d->B:106:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:14:0x0049, B:93:0x01de, B:94:0x020b, B:21:0x005f, B:42:0x00c0, B:45:0x00d0, B:48:0x00e2, B:50:0x00ec, B:52:0x00f4, B:55:0x00fc, B:57:0x0102, B:59:0x010c, B:61:0x0112, B:70:0x0135, B:71:0x0160, B:73:0x0166, B:75:0x0181, B:77:0x0187, B:80:0x018e, B:81:0x0192, B:83:0x0198, B:85:0x01a6, B:88:0x01bf, B:89:0x01c4, B:64:0x0119, B:65:0x011d, B:67:0x0123, B:31:0x0092, B:33:0x009c, B:35:0x00a5, B:38:0x00ad), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:14:0x0049, B:93:0x01de, B:94:0x020b, B:21:0x005f, B:42:0x00c0, B:45:0x00d0, B:48:0x00e2, B:50:0x00ec, B:52:0x00f4, B:55:0x00fc, B:57:0x0102, B:59:0x010c, B:61:0x0112, B:70:0x0135, B:71:0x0160, B:73:0x0166, B:75:0x0181, B:77:0x0187, B:80:0x018e, B:81:0x0192, B:83:0x0198, B:85:0x01a6, B:88:0x01bf, B:89:0x01c4, B:64:0x0119, B:65:0x011d, B:67:0x0123, B:31:0x0092, B:33:0x009c, B:35:0x00a5, B:38:0x00ad), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0102 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:14:0x0049, B:93:0x01de, B:94:0x020b, B:21:0x005f, B:42:0x00c0, B:45:0x00d0, B:48:0x00e2, B:50:0x00ec, B:52:0x00f4, B:55:0x00fc, B:57:0x0102, B:59:0x010c, B:61:0x0112, B:70:0x0135, B:71:0x0160, B:73:0x0166, B:75:0x0181, B:77:0x0187, B:80:0x018e, B:81:0x0192, B:83:0x0198, B:85:0x01a6, B:88:0x01bf, B:89:0x01c4, B:64:0x0119, B:65:0x011d, B:67:0x0123, B:31:0x0092, B:33:0x009c, B:35:0x00a5, B:38:0x00ad), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0112 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:14:0x0049, B:93:0x01de, B:94:0x020b, B:21:0x005f, B:42:0x00c0, B:45:0x00d0, B:48:0x00e2, B:50:0x00ec, B:52:0x00f4, B:55:0x00fc, B:57:0x0102, B:59:0x010c, B:61:0x0112, B:70:0x0135, B:71:0x0160, B:73:0x0166, B:75:0x0181, B:77:0x0187, B:80:0x018e, B:81:0x0192, B:83:0x0198, B:85:0x01a6, B:88:0x01bf, B:89:0x01c4, B:64:0x0119, B:65:0x011d, B:67:0x0123, B:31:0x0092, B:33:0x009c, B:35:0x00a5, B:38:0x00ad), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0119 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:14:0x0049, B:93:0x01de, B:94:0x020b, B:21:0x005f, B:42:0x00c0, B:45:0x00d0, B:48:0x00e2, B:50:0x00ec, B:52:0x00f4, B:55:0x00fc, B:57:0x0102, B:59:0x010c, B:61:0x0112, B:70:0x0135, B:71:0x0160, B:73:0x0166, B:75:0x0181, B:77:0x0187, B:80:0x018e, B:81:0x0192, B:83:0x0198, B:85:0x01a6, B:88:0x01bf, B:89:0x01c4, B:64:0x0119, B:65:0x011d, B:67:0x0123, B:31:0x0092, B:33:0x009c, B:35:0x00a5, B:38:0x00ad), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0123 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:14:0x0049, B:93:0x01de, B:94:0x020b, B:21:0x005f, B:42:0x00c0, B:45:0x00d0, B:48:0x00e2, B:50:0x00ec, B:52:0x00f4, B:55:0x00fc, B:57:0x0102, B:59:0x010c, B:61:0x0112, B:70:0x0135, B:71:0x0160, B:73:0x0166, B:75:0x0181, B:77:0x0187, B:80:0x018e, B:81:0x0192, B:83:0x0198, B:85:0x01a6, B:88:0x01bf, B:89:0x01c4, B:64:0x0119, B:65:0x011d, B:67:0x0123, B:31:0x0092, B:33:0x009c, B:35:0x00a5, B:38:0x00ad), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0166 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:14:0x0049, B:93:0x01de, B:94:0x020b, B:21:0x005f, B:42:0x00c0, B:45:0x00d0, B:48:0x00e2, B:50:0x00ec, B:52:0x00f4, B:55:0x00fc, B:57:0x0102, B:59:0x010c, B:61:0x0112, B:70:0x0135, B:71:0x0160, B:73:0x0166, B:75:0x0181, B:77:0x0187, B:80:0x018e, B:81:0x0192, B:83:0x0198, B:85:0x01a6, B:88:0x01bf, B:89:0x01c4, B:64:0x0119, B:65:0x011d, B:67:0x0123, B:31:0x0092, B:33:0x009c, B:35:0x00a5, B:38:0x00ad), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0181 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:14:0x0049, B:93:0x01de, B:94:0x020b, B:21:0x005f, B:42:0x00c0, B:45:0x00d0, B:48:0x00e2, B:50:0x00ec, B:52:0x00f4, B:55:0x00fc, B:57:0x0102, B:59:0x010c, B:61:0x0112, B:70:0x0135, B:71:0x0160, B:73:0x0166, B:75:0x0181, B:77:0x0187, B:80:0x018e, B:81:0x0192, B:83:0x0198, B:85:0x01a6, B:88:0x01bf, B:89:0x01c4, B:64:0x0119, B:65:0x011d, B:67:0x0123, B:31:0x0092, B:33:0x009c, B:35:0x00a5, B:38:0x00ad), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x0198 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:14:0x0049, B:93:0x01de, B:94:0x020b, B:21:0x005f, B:42:0x00c0, B:45:0x00d0, B:48:0x00e2, B:50:0x00ec, B:52:0x00f4, B:55:0x00fc, B:57:0x0102, B:59:0x010c, B:61:0x0112, B:70:0x0135, B:71:0x0160, B:73:0x0166, B:75:0x0181, B:77:0x0187, B:80:0x018e, B:81:0x0192, B:83:0x0198, B:85:0x01a6, B:88:0x01bf, B:89:0x01c4, B:64:0x0119, B:65:0x011d, B:67:0x0123, B:31:0x0092, B:33:0x009c, B:35:0x00a5, B:38:0x00ad), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01bd A[LOOP:1: B:81:0x0192->B:87:0x01bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x01dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [ai.askquin.ui.paywall.upgrade.s, hf8] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v5, types: [d99] */
    public final Object n(FiveCardUpgradePending fiveCardUpgradePending, zn2 zn2Var) {
        p pVar;
        FiveCardUpgradePending fiveCardUpgradePending2;
        f99 f99Var;
        d99 d99Var;
        FiveCardUpgradePending fiveCardUpgradePending3;
        d99 d99Var2;
        Map map;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountState;
        FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState;
        QuotaUsage quotaUsageB;
        List<String> orderIds;
        Iterator it;
        LinkedHashSet linkedHashSetM;
        String accountId;
        LinkedHashMap linkedHashMap;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountStateCopy;
        FiveCardUpgradePending fiveCardUpgradePending4;
        FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingStateCopy$default;
        FiveCardUpgradePending pending;
        List<String> orderIds2;
        Iterator it2;
        d99 d99Var3;
        if (zn2Var instanceof p) {
            pVar = (p) zn2Var;
            int i = pVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pVar.label = i - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, zn2Var);
            }
        } else {
            pVar = new p(this, zn2Var);
        }
        Object obj = pVar.result;
        ?? r3 = pVar.label;
        q9b q9bVar = this.b;
        boolean z = false;
        bw2 bw2Var = bw2.a;
        try {
            if (r3 == 0) {
                jzb.q(obj);
                if (!e(fiveCardUpgradePending.getAccountId())) {
                    return Boolean.FALSE;
                }
                fiveCardUpgradePending2 = fiveCardUpgradePending;
                pVar.L$0 = fiveCardUpgradePending2;
                f99Var = this.e;
                pVar.L$1 = f99Var;
                pVar.label = 1;
                if (f99Var.b(pVar) != bw2Var) {
                }
                d99Var = f99Var;
                return bw2Var;
            }
            if (r3 == 1) {
                d99 d99Var4 = (d99) pVar.L$1;
                FiveCardUpgradePending fiveCardUpgradePending5 = (FiveCardUpgradePending) pVar.L$0;
                jzb.q(obj);
                fiveCardUpgradePending2 = fiveCardUpgradePending5;
                d99Var = d99Var4;
            } else {
                if (r3 == 2) {
                    d99 d99Var5 = (d99) pVar.L$1;
                    fiveCardUpgradePending3 = (FiveCardUpgradePending) pVar.L$0;
                    jzb.q(obj);
                    d99Var2 = d99Var5;
                    map = (Map) obj;
                    fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) map.get(fiveCardUpgradePending3.getAccountId());
                    if (fiveCardUpgradeManager$AccountState != null || (fiveCardUpgradeManager$ReadingState = fiveCardUpgradeManager$AccountState.getReadings().get(fiveCardUpgradePending3.getReadingId())) == null) {
                        r3 = d99Var2;
                    } else if (e(fiveCardUpgradePending3.getAccountId())) {
                        quotaUsageB = ((eab) q9bVar).b();
                        if (quotaUsageB == null && quotaUsageB.getHasSubscription()) {
                            r3 = d99Var2;
                            r3 = d99Var2;
                        } else {
                            r3 = d99Var2;
                            r3 = d99Var2;
                            r3 = d99Var2;
                            if (!fiveCardUpgradeManager$ReadingState.getSuppressed() && pa7.t(fiveCardUpgradeManager$ReadingState.getPending(), fiveCardUpgradePending3)) {
                                orderIds = fiveCardUpgradePending3.getOrderIds();
                                if (orderIds == null && orderIds.isEmpty()) {
                                    r3 = d99Var2;
                                } else {
                                    r3 = d99Var2;
                                    r3 = d99Var2;
                                    it = orderIds.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (fiveCardUpgradeManager$AccountState.getExposedOrderIds().contains((String) it.next())) {
                                                r3 = d99Var2;
                                            }
                                        }
                                    }
                                }
                                linkedHashSetM = n3d.m(fiveCardUpgradeManager$AccountState.getExposedOrderIds(), fiveCardUpgradePending3.getOrderIds());
                                accountId = fiveCardUpgradePending3.getAccountId();
                                Map<String, FiveCardUpgradeManager$ReadingState> readings = fiveCardUpgradeManager$AccountState.getReadings();
                                linkedHashMap = new LinkedHashMap(bm8.F(readings.size()));
                                for (Object obj2 : readings.entrySet()) {
                                    Object key = ((Map.Entry) obj2).getKey();
                                    fiveCardUpgradeManager$ReadingStateCopy$default = (FiveCardUpgradeManager$ReadingState) ((Map.Entry) obj2).getValue();
                                    pending = fiveCardUpgradeManager$ReadingStateCopy$default.getPending();
                                    if (pending != null && (orderIds2 = pending.getOrderIds()) != null && !orderIds2.isEmpty()) {
                                        it2 = orderIds2.iterator();
                                        while (it2.hasNext()) {
                                            if (linkedHashSetM.contains((String) it2.next())) {
                                                fiveCardUpgradeManager$ReadingStateCopy$default = FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingStateCopy$default, null, null, false, false, false, null, 31, null);
                                                break;
                                            }
                                        }
                                    }
                                    linkedHashMap.put(key, fiveCardUpgradeManager$ReadingStateCopy$default);
                                }
                                fiveCardUpgradeManager$AccountStateCopy = fiveCardUpgradeManager$AccountState.copy(linkedHashMap, linkedHashSetM);
                                pVar.L$0 = fiveCardUpgradePending3;
                                pVar.L$1 = d99Var2;
                                pVar.L$2 = null;
                                pVar.L$3 = null;
                                pVar.L$4 = null;
                                pVar.L$5 = null;
                                pVar.label = 3;
                                if (p(map, accountId, fiveCardUpgradeManager$AccountStateCopy, pVar) != bw2Var) {
                                    fiveCardUpgradePending4 = fiveCardUpgradePending3;
                                    d99Var3 = d99Var2;
                                }
                                d99Var = f99Var;
                                return bw2Var;
                            }
                        }
                    }
                    r3 = d99Var2;
                    r3 = d99Var2;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    r3.h(null);
                    return boolValueOf;
                }
                if (r3 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99 d99Var6 = (d99) pVar.L$1;
                fiveCardUpgradePending4 = (FiveCardUpgradePending) pVar.L$0;
                jzb.q(obj);
                d99Var3 = d99Var6;
            }
            d().e("Five-card upgrade exposure committed: reading=" + fiveCardUpgradePending4.getReadingId() + " orderCount=" + fiveCardUpgradePending4.getOrderIds().size());
            z = true;
            r3 = d99Var3;
            r3 = d99Var2;
            r3 = d99Var2;
            Boolean boolValueOf2 = Boolean.valueOf(z);
            r3.h(null);
            return boolValueOf2;
            d99Var = f99Var;
            r3 = d99Var;
            if (e(fiveCardUpgradePending2.getAccountId())) {
                QuotaUsage quotaUsageB2 = ((eab) q9bVar).b();
                if (quotaUsageB2 == null || !quotaUsageB2.getHasSubscription()) {
                    pVar.L$0 = fiveCardUpgradePending2;
                    pVar.L$1 = d99Var;
                    pVar.label = 2;
                    Object objL = l(pVar);
                    if (objL != bw2Var) {
                        fiveCardUpgradePending3 = fiveCardUpgradePending2;
                        obj = objL;
                        d99Var2 = d99Var;
                        map = (Map) obj;
                        fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) map.get(fiveCardUpgradePending3.getAccountId());
                        if (fiveCardUpgradeManager$AccountState != null) {
                            r3 = d99Var2;
                        } else if (e(fiveCardUpgradePending3.getAccountId())) {
                            quotaUsageB = ((eab) q9bVar).b();
                            if (quotaUsageB == null) {
                                r3 = d99Var2;
                                r3 = d99Var2;
                                r3 = d99Var2;
                                if (!fiveCardUpgradeManager$ReadingState.getSuppressed()) {
                                    orderIds = fiveCardUpgradePending3.getOrderIds();
                                    if (orderIds == null) {
                                        r3 = d99Var2;
                                        r3 = d99Var2;
                                        it = orderIds.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                linkedHashSetM = n3d.m(fiveCardUpgradeManager$AccountState.getExposedOrderIds(), fiveCardUpgradePending3.getOrderIds());
                                                accountId = fiveCardUpgradePending3.getAccountId();
                                                Map<String, FiveCardUpgradeManager$ReadingState> readings2 = fiveCardUpgradeManager$AccountState.getReadings();
                                                linkedHashMap = new LinkedHashMap(bm8.F(readings2.size()));
                                                while (r12.hasNext()) {
                                                    Object key2 = ((Map.Entry) obj2).getKey();
                                                    fiveCardUpgradeManager$ReadingStateCopy$default = (FiveCardUpgradeManager$ReadingState) ((Map.Entry) obj2).getValue();
                                                    pending = fiveCardUpgradeManager$ReadingStateCopy$default.getPending();
                                                    if (pending != null) {
                                                        it2 = orderIds2.iterator();
                                                        while (it2.hasNext()) {
                                                            if (linkedHashSetM.contains((String) it2.next())) {
                                                                fiveCardUpgradeManager$ReadingStateCopy$default = FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingStateCopy$default, null, null, false, false, false, null, 31, null);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    linkedHashMap.put(key2, fiveCardUpgradeManager$ReadingStateCopy$default);
                                                }
                                                fiveCardUpgradeManager$AccountStateCopy = fiveCardUpgradeManager$AccountState.copy(linkedHashMap, linkedHashSetM);
                                                pVar.L$0 = fiveCardUpgradePending3;
                                                pVar.L$1 = d99Var2;
                                                pVar.L$2 = null;
                                                pVar.L$3 = null;
                                                pVar.L$4 = null;
                                                pVar.L$5 = null;
                                                pVar.label = 3;
                                                if (p(map, accountId, fiveCardUpgradeManager$AccountStateCopy, pVar) != bw2Var) {
                                                    fiveCardUpgradePending4 = fiveCardUpgradePending3;
                                                    d99Var3 = d99Var2;
                                                    d().e("Five-card upgrade exposure committed: reading=" + fiveCardUpgradePending4.getReadingId() + " orderCount=" + fiveCardUpgradePending4.getOrderIds().size());
                                                    z = true;
                                                    r3 = d99Var3;
                                                }
                                            } else if (fiveCardUpgradeManager$AccountState.getExposedOrderIds().contains((String) it.next())) {
                                                r3 = d99Var2;
                                            }
                                        }
                                    } else {
                                        r3 = d99Var2;
                                        r3 = d99Var2;
                                        it = orderIds.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                linkedHashSetM = n3d.m(fiveCardUpgradeManager$AccountState.getExposedOrderIds(), fiveCardUpgradePending3.getOrderIds());
                                                accountId = fiveCardUpgradePending3.getAccountId();
                                                Map<String, FiveCardUpgradeManager$ReadingState> readings3 = fiveCardUpgradeManager$AccountState.getReadings();
                                                linkedHashMap = new LinkedHashMap(bm8.F(readings3.size()));
                                                while (r12.hasNext()) {
                                                    Object key3 = ((Map.Entry) obj2).getKey();
                                                    fiveCardUpgradeManager$ReadingStateCopy$default = (FiveCardUpgradeManager$ReadingState) ((Map.Entry) obj2).getValue();
                                                    pending = fiveCardUpgradeManager$ReadingStateCopy$default.getPending();
                                                    if (pending != null) {
                                                        it2 = orderIds2.iterator();
                                                        while (it2.hasNext()) {
                                                            if (linkedHashSetM.contains((String) it2.next())) {
                                                                fiveCardUpgradeManager$ReadingStateCopy$default = FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingStateCopy$default, null, null, false, false, false, null, 31, null);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    linkedHashMap.put(key3, fiveCardUpgradeManager$ReadingStateCopy$default);
                                                }
                                                fiveCardUpgradeManager$AccountStateCopy = fiveCardUpgradeManager$AccountState.copy(linkedHashMap, linkedHashSetM);
                                                pVar.L$0 = fiveCardUpgradePending3;
                                                pVar.L$1 = d99Var2;
                                                pVar.L$2 = null;
                                                pVar.L$3 = null;
                                                pVar.L$4 = null;
                                                pVar.L$5 = null;
                                                pVar.label = 3;
                                                if (p(map, accountId, fiveCardUpgradeManager$AccountStateCopy, pVar) != bw2Var) {
                                                    fiveCardUpgradePending4 = fiveCardUpgradePending3;
                                                    d99Var3 = d99Var2;
                                                    d().e("Five-card upgrade exposure committed: reading=" + fiveCardUpgradePending4.getReadingId() + " orderCount=" + fiveCardUpgradePending4.getOrderIds().size());
                                                    z = true;
                                                    r3 = d99Var3;
                                                }
                                            } else if (fiveCardUpgradeManager$AccountState.getExposedOrderIds().contains((String) it.next())) {
                                                r3 = d99Var2;
                                            }
                                        }
                                    }
                                }
                            } else {
                                r3 = d99Var2;
                                r3 = d99Var2;
                                r3 = d99Var2;
                                if (!fiveCardUpgradeManager$ReadingState.getSuppressed()) {
                                    orderIds = fiveCardUpgradePending3.getOrderIds();
                                    if (orderIds == null) {
                                        r3 = d99Var2;
                                        r3 = d99Var2;
                                        it = orderIds.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                linkedHashSetM = n3d.m(fiveCardUpgradeManager$AccountState.getExposedOrderIds(), fiveCardUpgradePending3.getOrderIds());
                                                accountId = fiveCardUpgradePending3.getAccountId();
                                                Map<String, FiveCardUpgradeManager$ReadingState> readings4 = fiveCardUpgradeManager$AccountState.getReadings();
                                                linkedHashMap = new LinkedHashMap(bm8.F(readings4.size()));
                                                while (r12.hasNext()) {
                                                    Object key4 = ((Map.Entry) obj2).getKey();
                                                    fiveCardUpgradeManager$ReadingStateCopy$default = (FiveCardUpgradeManager$ReadingState) ((Map.Entry) obj2).getValue();
                                                    pending = fiveCardUpgradeManager$ReadingStateCopy$default.getPending();
                                                    if (pending != null) {
                                                        it2 = orderIds2.iterator();
                                                        while (it2.hasNext()) {
                                                            if (linkedHashSetM.contains((String) it2.next())) {
                                                                fiveCardUpgradeManager$ReadingStateCopy$default = FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingStateCopy$default, null, null, false, false, false, null, 31, null);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    linkedHashMap.put(key4, fiveCardUpgradeManager$ReadingStateCopy$default);
                                                }
                                                fiveCardUpgradeManager$AccountStateCopy = fiveCardUpgradeManager$AccountState.copy(linkedHashMap, linkedHashSetM);
                                                pVar.L$0 = fiveCardUpgradePending3;
                                                pVar.L$1 = d99Var2;
                                                pVar.L$2 = null;
                                                pVar.L$3 = null;
                                                pVar.L$4 = null;
                                                pVar.L$5 = null;
                                                pVar.label = 3;
                                                if (p(map, accountId, fiveCardUpgradeManager$AccountStateCopy, pVar) != bw2Var) {
                                                    fiveCardUpgradePending4 = fiveCardUpgradePending3;
                                                    d99Var3 = d99Var2;
                                                    d().e("Five-card upgrade exposure committed: reading=" + fiveCardUpgradePending4.getReadingId() + " orderCount=" + fiveCardUpgradePending4.getOrderIds().size());
                                                    z = true;
                                                    r3 = d99Var3;
                                                }
                                            } else if (fiveCardUpgradeManager$AccountState.getExposedOrderIds().contains((String) it.next())) {
                                                r3 = d99Var2;
                                            }
                                        }
                                    } else {
                                        r3 = d99Var2;
                                        r3 = d99Var2;
                                        it = orderIds.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                linkedHashSetM = n3d.m(fiveCardUpgradeManager$AccountState.getExposedOrderIds(), fiveCardUpgradePending3.getOrderIds());
                                                accountId = fiveCardUpgradePending3.getAccountId();
                                                Map<String, FiveCardUpgradeManager$ReadingState> readings5 = fiveCardUpgradeManager$AccountState.getReadings();
                                                linkedHashMap = new LinkedHashMap(bm8.F(readings5.size()));
                                                while (r12.hasNext()) {
                                                    Object key5 = ((Map.Entry) obj2).getKey();
                                                    fiveCardUpgradeManager$ReadingStateCopy$default = (FiveCardUpgradeManager$ReadingState) ((Map.Entry) obj2).getValue();
                                                    pending = fiveCardUpgradeManager$ReadingStateCopy$default.getPending();
                                                    if (pending != null) {
                                                        it2 = orderIds2.iterator();
                                                        while (it2.hasNext()) {
                                                            if (linkedHashSetM.contains((String) it2.next())) {
                                                                fiveCardUpgradeManager$ReadingStateCopy$default = FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingStateCopy$default, null, null, false, false, false, null, 31, null);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    linkedHashMap.put(key5, fiveCardUpgradeManager$ReadingStateCopy$default);
                                                }
                                                fiveCardUpgradeManager$AccountStateCopy = fiveCardUpgradeManager$AccountState.copy(linkedHashMap, linkedHashSetM);
                                                pVar.L$0 = fiveCardUpgradePending3;
                                                pVar.L$1 = d99Var2;
                                                pVar.L$2 = null;
                                                pVar.L$3 = null;
                                                pVar.L$4 = null;
                                                pVar.L$5 = null;
                                                pVar.label = 3;
                                                if (p(map, accountId, fiveCardUpgradeManager$AccountStateCopy, pVar) != bw2Var) {
                                                    fiveCardUpgradePending4 = fiveCardUpgradePending3;
                                                    d99Var3 = d99Var2;
                                                    d().e("Five-card upgrade exposure committed: reading=" + fiveCardUpgradePending4.getReadingId() + " orderCount=" + fiveCardUpgradePending4.getOrderIds().size());
                                                    z = true;
                                                    r3 = d99Var3;
                                                }
                                            } else if (fiveCardUpgradeManager$AccountState.getExposedOrderIds().contains((String) it.next())) {
                                                r3 = d99Var2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    d99Var = f99Var;
                    return bw2Var;
                }
                r3 = d99Var;
            }
            r3 = d99Var2;
            r3 = d99Var2;
            Boolean boolValueOf3 = Boolean.valueOf(z);
            r3.h(null);
            return boolValueOf3;
        } catch (Throwable th) {
            r3.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0123  */
    /* JADX WARN: Code duplicated, block: B:60:0x0152 A[Catch: all -> 0x014f, TRY_LEAVE, TryCatch #1 {all -> 0x014f, blocks: (B:53:0x0127, B:55:0x0147, B:60:0x0152), top: B:68:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [ai.askquin.ui.paywall.upgrade.s, hf8] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final Object o(String str, String str2, zn2 zn2Var) throws Throwable {
        q qVar;
        String str3;
        d99 d99Var;
        String str4;
        Map map;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountState;
        FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState;
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountStateCopy$default;
        String str5;
        String str6;
        d99 d99Var2;
        iy9 iy9Var;
        dg7 dg7Var;
        LinkedHashMap linkedHashMap = this.f;
        if (zn2Var instanceof q) {
            qVar = (q) zn2Var;
            int i = qVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.label = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, zn2Var);
            }
        } else {
            qVar = new q(this, zn2Var);
        }
        Object objL = qVar.result;
        ?? r4 = qVar.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            if (r4 == 0) {
                jzb.q(objL);
                ca2.a.getClass();
                if (ca2.c || v4e.Q(str)) {
                    return wefVar;
                }
                qVar.L$0 = str;
                qVar.L$1 = str2;
                f99 f99Var = this.e;
                qVar.L$2 = f99Var;
                qVar.label = 1;
                if (f99Var.b(qVar) != bw2Var) {
                    str3 = str2;
                    d99Var = f99Var;
                    str4 = str;
                }
                return bw2Var;
            }
            try {
                if (r4 == 1) {
                    d99Var = (d99) qVar.L$2;
                    str3 = (String) qVar.L$1;
                    str4 = (String) qVar.L$0;
                    jzb.q(objL);
                } else {
                    if (r4 == 2) {
                        d99Var = (d99) qVar.L$2;
                        str3 = (String) qVar.L$1;
                        str4 = (String) qVar.L$0;
                        jzb.q(objL);
                        map = (Map) objL;
                        fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) map.get(str4);
                        if (fiveCardUpgradeManager$AccountState != null && (fiveCardUpgradeManager$ReadingState = fiveCardUpgradeManager$AccountState.getReadings().get(str3)) != null && fiveCardUpgradeManager$ReadingState.getBefore() != null && !fiveCardUpgradeManager$ReadingState.getSuppressed() && !fiveCardUpgradeManager$ReadingState.getConfirmed()) {
                            fiveCardUpgradeManager$AccountStateCopy$default = FiveCardUpgradeManager$AccountState.copy$default(fiveCardUpgradeManager$AccountState, bm8.M(fiveCardUpgradeManager$AccountState.getReadings(), new iy9(str3, FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingState, null, null, true, false, false, null, 59, null))), null, 2, null);
                            qVar.L$0 = str4;
                            qVar.L$1 = str3;
                            qVar.L$2 = d99Var;
                            qVar.L$3 = null;
                            qVar.L$4 = null;
                            qVar.L$5 = null;
                            qVar.label = 3;
                            if (p(map, str4, fiveCardUpgradeManager$AccountStateCopy$default, qVar) != bw2Var) {
                                str5 = str3;
                                str6 = str4;
                            }
                            return bw2Var;
                        }
                        d99Var.h(null);
                        return wefVar;
                    }
                    if (r4 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d99Var = (d99) qVar.L$2;
                    str5 = (String) qVar.L$1;
                    str6 = (String) qVar.L$0;
                    jzb.q(objL);
                }
                d().e("Five-card reading success accepted: reading=" + str5);
                iy9Var = new iy9(str6, str5);
                dg7Var = (dg7) linkedHashMap.get(iy9Var);
                if (dg7Var != null || !dg7Var.b()) {
                    lyd lydVarV = ynb.V(this.d, null, dw2.b, new ih5(this, str6, str5, iy9Var, null), 1);
                    linkedHashMap.put(iy9Var, lydVarV);
                    lydVarV.start();
                }
                d99Var = d99Var2;
                d99Var.h(null);
                return wefVar;
            } catch (Throwable th) {
                th = th;
                r4 = d99Var2;
                r4.h(null);
                throw th;
            }
            d99Var2 = d99Var;
            qVar.L$0 = str4;
            qVar.L$1 = str3;
            qVar.L$2 = d99Var;
            qVar.label = 2;
            objL = l(qVar);
            if (objL != bw2Var) {
                map = (Map) objL;
                fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) map.get(str4);
                if (fiveCardUpgradeManager$AccountState != null) {
                    fiveCardUpgradeManager$AccountStateCopy$default = FiveCardUpgradeManager$AccountState.copy$default(fiveCardUpgradeManager$AccountState, bm8.M(fiveCardUpgradeManager$AccountState.getReadings(), new iy9(str3, FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingState, null, null, true, false, false, null, 59, null))), null, 2, null);
                    qVar.L$0 = str4;
                    qVar.L$1 = str3;
                    qVar.L$2 = d99Var;
                    qVar.L$3 = null;
                    qVar.L$4 = null;
                    qVar.L$5 = null;
                    qVar.label = 3;
                    if (p(map, str4, fiveCardUpgradeManager$AccountStateCopy$default, qVar) != bw2Var) {
                        str5 = str3;
                        str6 = str4;
                        d99Var2 = d99Var;
                        d().e("Five-card reading success accepted: reading=" + str5);
                        iy9Var = new iy9(str6, str5);
                        dg7Var = (dg7) linkedHashMap.get(iy9Var);
                        if (dg7Var != null) {
                            lyd lydVarV2 = ynb.V(this.d, null, dw2.b, new ih5(this, str6, str5, iy9Var, null), 1);
                            linkedHashMap.put(iy9Var, lydVarV2);
                            lydVarV2.start();
                        } else {
                            lyd lydVarV3 = ynb.V(this.d, null, dw2.b, new ih5(this, str6, str5, iy9Var, null), 1);
                            linkedHashMap.put(iy9Var, lydVarV3);
                            lydVarV3.start();
                        }
                        d99Var = d99Var2;
                    }
                }
                d99Var.h(null);
                return wefVar;
            }
            return bw2Var;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Object p(Map map, String str, FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountState, zn2 zn2Var) {
        xh7 xh7Var = fzc.a;
        Map mapM = bm8.M(map, new iy9(str, fiveCardUpgradeManager$AccountState));
        xh7Var.getClass();
        return bsa.n(xqa.D.a, xh7Var.d(new qh6(p4e.a, FiveCardUpgradeManager$AccountState.Companion.serializer(), 1), mapM), zn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cc A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:14:0x004a, B:47:0x0138, B:21:0x0064, B:38:0x00c2, B:40:0x00cc, B:41:0x00d1, B:43:0x00dd, B:44:0x00f2), top: B:57:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:14:0x004a, B:47:0x0138, B:21:0x0064, B:38:0x00c2, B:40:0x00cc, B:41:0x00d1, B:43:0x00dd, B:44:0x00f2), top: B:57:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0135, code lost:
    
        if (p(r1, r11, r7, r3) == r10) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [ai.askquin.ui.paywall.upgrade.s, hf8] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [d99] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [d99] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.String r25, java.lang.String r26, defpackage.zn2 r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.paywall.upgrade.s.q(java.lang.String, java.lang.String, zn2):java.lang.Object");
    }
}
