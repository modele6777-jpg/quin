package defpackage;

import ai.askquin.ui.share.SharedDivination;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.RedeemPopup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s48 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s48(RedeemPopup redeemPopup, a26 a26Var, x16 x16Var, int i) {
        this.a = 9;
        this.b = redeemPopup;
        this.e = a26Var;
        this.d = x16Var;
        this.c = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws Throwable {
        int i;
        char c;
        long jX;
        int i2 = this.a;
        int i3 = this.c;
        wef wefVar = wef.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i2) {
            case 0:
                ((Integer) obj2).intValue();
                t72.i((x48) obj5, (c58) obj4, (a26) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case 1:
                ((Integer) obj2).getClass();
                t72.g((f48) obj4, (x48) obj5, (x16) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case 2:
                ((Integer) obj2).intValue();
                t72.k((x48) obj5, (g58) obj4, (a26) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case 3:
                ((Integer) obj2).getClass();
                rxg.k((dd2) obj5, (j09) obj4, (q78) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case 4:
                ((Integer) obj2).getClass();
                z5c.d((c4c) obj5, (String) obj4, (ha2) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case 5:
                ((Integer) obj2).getClass();
                k99.j(k99.P(i3 | 1), (x16) obj5, (x16) obj4, (a26) obj3, (l46) obj);
                return wefVar;
            case 6:
                ((Integer) obj2).getClass();
                bm8.o((l5a) obj5, this.c, (j09) obj4, (Integer) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 7:
                ((Integer) obj2).getClass();
                jgb.A((j09) obj5, (ac4) obj4, (x16) obj3, (l46) obj, k99.P(65), this.c);
                return wefVar;
            case 8:
                ((Integer) obj2).getClass();
                nk8.k((String) obj5, (khb) obj4, (j09) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case 9:
                ((Integer) obj2).getClass();
                z7f.j((RedeemPopup) obj5, (a26) obj3, (x16) obj4, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).intValue();
                ksb.g((x16) obj5, (x16) obj4, (dsb) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                ((rcc) obj5).b(obj4, (dd2) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                hgc.a((String) obj5, (String) obj4, (x16) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                b4d.j((j09) obj5, (Integer) obj4, (dd2) obj3, (l46) obj, k99.P(385), this.c);
                return wefVar;
            case 14:
                ((Integer) obj2).getClass();
                t6d.b((j09) obj5, (qhe) obj4, (a26) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case 15:
                ((Integer) obj2).getClass();
                j7d.b((j09) obj5, (SharedDivination) obj4, (a26) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                jrb.c((nqd) obj5, (j09) obj4, (dd2) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case 17:
                ((Integer) obj2).getClass();
                jrb.a((fqd) obj5, (j09) obj4, (dd2) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case 18:
                s7d s7dVar = (s7d) obj5;
                vz9 vz9Var = s7dVar.b;
                aue aueVar = (aue) obj4;
                p7d p7dVar = (p7d) obj3;
                r6e r6eVar = (r6e) obj;
                kl2 kl2Var = (kl2) obj2;
                r6eVar.getClass();
                RuntimeException runtimeExceptionA = s7dVar.a();
                qu4 qu4Var = qu4.a;
                if (runtimeExceptionA != null) {
                    return r6eVar.n0(0, 0, qu4Var, new znd(12));
                }
                int iD0 = r6eVar.D0(392.0f);
                Integer numValueOf = Integer.valueOf(kl2.h(kl2Var.a));
                if (!kl2.d(kl2Var.a)) {
                    numValueOf = null;
                }
                int iMax = Math.max(iD0, numValueOf != null ? numValueOf.intValue() : 0);
                try {
                    try {
                        try {
                            bo8 bo8VarN = new os(r6eVar, aueVar).n(p7dVar, iMax);
                            double d = bo8VarN.b;
                            if (Math.abs(d) <= Double.MAX_VALUE && d >= 0.0d) {
                                if (iMax <= 0 || d == 0.0d) {
                                    c = ' ';
                                    jX = 0;
                                } else if (i3 < 4) {
                                    qc0.j("Failed requirement.");
                                } else if (d <= 2.147483647E9d) {
                                    jX = dj6.x(i3, (((long) iMax) << 32) | (((long) ((int) Math.ceil(d))) & 4294967295L));
                                    c = ' ';
                                } else {
                                    double d2 = iMax;
                                    c = ' ';
                                    double dSqrt = Math.sqrt(((double) i3) / ((d2 * d) * 4.0d));
                                    if (dSqrt > 1.0d) {
                                        dSqrt = 1.0d;
                                    }
                                    double dMax = 16384.0d / Math.max(d2, d);
                                    if (dMax > 1.0d) {
                                        dMax = 1.0d;
                                    }
                                    double dMin = Math.min(dSqrt, dMax);
                                    int iFloor = (int) Math.floor(d2 * dMin);
                                    if (iFloor < 1) {
                                        iFloor = 1;
                                    }
                                    int iFloor2 = (int) Math.floor(dMin * d);
                                    jX = (((long) (iFloor2 >= 1 ? iFloor2 : 1)) & 4294967295L) | (((long) iFloor) << 32);
                                }
                                int i4 = (int) (jX >> c);
                                float f = i4 / iMax;
                                int i5 = (int) (jX & 4294967295L);
                                double d3 = i5;
                                if (d < 1.0d) {
                                    d = 1.0d;
                                }
                                q7d q7dVar = new q7d(bo8VarN, f, (float) (d3 / d));
                                s7dVar.a = q7dVar;
                                return r6eVar.n0(i4, i5, qu4Var, new i2e(0, bo8VarN, q7dVar));
                            }
                            qc0.j("Failed requirement.");
                            return null;
                        } catch (IllegalArgumentException e) {
                            e = e;
                            i = 0;
                            vz9Var.setValue(e);
                            return r6eVar.n0(i, i, qu4Var, new znd(13));
                        }
                    } catch (IllegalStateException e2) {
                        if (e2 instanceof CancellationException) {
                            throw e2;
                        }
                        vz9Var.setValue(e2);
                        return r6eVar.n0(0, 0, qu4Var, new znd(14));
                    }
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    i = 0;
                }
                break;
            case 19:
                ((Integer) obj2).getClass();
                m6e.b((q6e) obj5, (j09) obj4, (l26) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case 20:
                ((Integer) obj2).getClass();
                arb.c((r55) obj5, (x16) obj4, (x16) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            case 21:
                ((Integer) obj2).getClass();
                ((yte) obj5).b((Object[]) obj4, (a26) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
            default:
                ((Integer) obj2).getClass();
                v2c.h((u4g) obj5, (x16) obj4, (x16) obj3, (l46) obj, k99.P(i3 | 1));
                return wefVar;
        }
    }

    public /* synthetic */ s48(f48 f48Var, x48 x48Var, x16 x16Var, int i) {
        this.a = 1;
        this.d = f48Var;
        this.b = x48Var;
        this.e = x16Var;
        this.c = i;
    }

    public /* synthetic */ s48(j09 j09Var, Object obj, m26 m26Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = j09Var;
        this.d = obj;
        this.e = m26Var;
        this.c = i2;
    }

    public /* synthetic */ s48(l5a l5aVar, int i, j09 j09Var, Integer num, int i2) {
        this.a = 6;
        this.b = l5aVar;
        this.c = i;
        this.d = j09Var;
        this.e = num;
    }

    public /* synthetic */ s48(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i;
    }
}
