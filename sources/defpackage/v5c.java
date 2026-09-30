package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v5c extends h36 implements l26 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v5c(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        o05 o05VarB;
        m1f m1fVar;
        String str;
        Object dzbVar;
        String strE;
        String str2;
        String str3;
        switch (this.a) {
            case 0:
                return z5c.s((xn2) obj2, (a26) obj, (w5c) this.receiver);
            case 1:
                return z5c.s((xn2) obj2, (a26) obj, (w5c) this.receiver);
            case 2:
                String str4 = (String) obj;
                str4.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str4);
                return wef.a;
            case 3:
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
                int iIntValue = ((Number) obj2).intValue();
                tarotCardChoice.getClass();
                ((jkc) this.receiver).l(tarotCardChoice, iIntValue);
                return wef.a;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str5);
                return wef.a;
            case 5:
                yhd yhdVar = yhd.a;
                yhd yhdVar2 = yhd.c;
                s7a s7aVar = (s7a) obj;
                vhd vhdVar = (vhd) obj2;
                s7aVar.getClass();
                vhdVar.getClass();
                ((x1f) this.receiver).getClass();
                Object obj3 = x1f.c.get();
                Boolean bool = Boolean.FALSE;
                if (!pa7.t(obj3, bool)) {
                    int iOrdinal = vhdVar.ordinal();
                    if (iOrdinal == 0) {
                        Boolean bool2 = (Boolean) x1f.b.get();
                        if (!pa7.t(bool2, bool)) {
                            if (bool2 != null) {
                                if (!bool2.equals(Boolean.TRUE)) {
                                    ap.c();
                                    return null;
                                }
                                o05VarB = x1f.b();
                            }
                            return yhdVar;
                        }
                    } else {
                        if (iOrdinal != 1) {
                            ap.c();
                            return null;
                        }
                        o05VarB = x1f.a();
                    }
                    whd whdVar = o05VarB instanceof whd ? (whd) o05VarB : null;
                    if (whdVar != null && whdVar.d(s7aVar)) {
                        int iOrdinal2 = vhdVar.ordinal();
                        if (iOrdinal2 == 0) {
                            m1fVar = m1f.a;
                        } else {
                            if (iOrdinal2 != 1) {
                                ap.c();
                                return null;
                            }
                            m1fVar = m1f.b;
                        }
                        iec.m("sign_up_completed", m1fVar, new trd(19, s7aVar));
                        return yhd.b;
                    }
                    return yhdVar;
                }
                return yhdVar2;
            case 6:
                return ((ypa) this.receiver).a((l26) obj, (xn2) obj2);
            case 7:
                Map map = (Map) obj;
                xn2 xn2Var = (xn2) obj2;
                ((ihd) this.receiver).getClass();
                wef wefVar = wef.a;
                if (!ihd.b.get() || (str = (String) map.get("uid")) == null) {
                    return wefVar;
                }
                String str6 = !v4e.Q(str) ? str : null;
                if (str6 == null) {
                    return wefVar;
                }
                iy9 iy9Var = new iy9("notification_permission", xh9.a().a());
                il ilVar = il.a;
                LinkedHashMap linkedHashMapL = bm8.L(bm8.L(bm8.H(iy9Var, new iy9("app_state", il.a()), new iy9("app_version", "5.23.0")), hkg.j0()), map);
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strI = ib8.i();
                try {
                    x1f x1fVar = x1f.a;
                    o05 o05VarB2 = x1f.b();
                    hy8 hy8Var = o05VarB2 instanceof hy8 ? (hy8) o05VarB2 : null;
                    if (hy8Var == null || !hy8Var.c.get() || v4e.Q(str6)) {
                        dzbVar = null;
                    } else {
                        synchronized (hy8Var.b.a) {
                            AtomicBoolean atomicBoolean = hy8Var.c;
                            tx8 tx8Var = hy8Var.a;
                            if (atomicBoolean.get() && (strE = tx8Var.e()) != null) {
                                if (v4e.Q(strE)) {
                                    str2 = null;
                                }
                                if (str2 == null) {
                                    str2 = strE;
                                } else if (!pa7.t(tx8Var.g.a(), str6)) {
                                }
                                str2 = strE;
                                str3 = str2;
                                str3 = null;
                            } else {
                                str2 = strE;
                                str3 = str2;
                                str3 = null;
                            }
                        }
                        dzbVar = str3;
                    }
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                boolean z = dzbVar instanceof dzb;
                Object obj4 = dzbVar;
                if (z) {
                    obj4 = null;
                }
                s7a s7aVar2 = new s7a(str6, linkedHashMapL, jCurrentTimeMillis, strI, (String) obj4, s72.o1(vhd.c));
                fg9 fg9Var = fg9.b;
                js3 js3Var = ga4.a;
                hr3 hr3Var = hr3.c;
                fg9Var.getClass();
                Object objP0 = ynb.p0(i7h.I(fg9Var, hr3Var), new ehd(s7aVar2, null), xn2Var);
                return objP0 == bw2.a ? objP0 : wefVar;
            case 8:
                String str7 = (String) obj;
                str7.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str7);
                return wef.a;
            case 9:
                String str8 = (String) obj;
                str8.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str8);
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                String str9 = (String) obj;
                str9.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str9);
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                tt7 tt7Var = (tt7) obj;
                tt7 tt7Var2 = (tt7) obj2;
                tt7Var.getClass();
                tt7Var2.getClass();
                ((y7f) this.receiver).getClass();
                bf9.b.getClass();
                cf9 cf9Var = af9.b;
                return Boolean.valueOf(cf9Var.b(tt7Var, tt7Var2) && !cf9Var.b(tt7Var2, tt7Var));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                tt7 tt7Var3 = (tt7) obj;
                tt7 tt7Var4 = (tt7) obj2;
                tt7Var3.getClass();
                tt7Var4.getClass();
                return Boolean.valueOf(((cf9) this.receiver).a(tt7Var3, tt7Var4));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                String str10 = (String) obj;
                str10.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str10);
                return wef.a;
            case 14:
                String str11 = (String) obj;
                str11.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str11);
                return wef.a;
            default:
                String str12 = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str12.getClass();
                qmf qmfVar = (qmf) this.receiver;
                qmfVar.getClass();
                ynb.V(hwf.a(qmfVar), null, null, new slf(null, qmfVar, str12, zBooleanValue), 3);
                return wef.a;
        }
    }
}
