package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ule implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ ule(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0295  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        int iOffsetByCodePoints;
        zte zteVarA;
        xtd xtdVar;
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return str;
            case 1:
                ((Integer) obj).intValue();
                return dpe.a;
            case 2:
                iqe iqeVar = (iqe) obj;
                String str2 = iqeVar.g.b;
                long j = iqeVar.f;
                int i2 = eue.c;
                int i3 = (int) (j & 4294967295L);
                if (i3 > 0) {
                    jt4 jt4VarG = dec.g();
                    if (jt4VarG != null) {
                        int iB = jt4VarG.b(str2, i3 - 1);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i3 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str2, i3, -1);
                        }
                    } else if (i3 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str2, i3, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new iw3(((int) (iqeVar.f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 3:
                iqe iqeVar2 = (iqe) obj;
                String str3 = iqeVar2.g.b;
                long j2 = iqeVar2.f;
                int i4 = eue.c;
                int iD = dec.d((int) (j2 & 4294967295L), str3);
                if (iD != -1) {
                    return new iw3(0, iD - ((int) (iqeVar2.f & 4294967295L)));
                }
                return null;
            case 4:
                iqe iqeVar3 = (iqe) obj;
                Integer numE = iqeVar3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j3 = iqeVar3.f;
                int i5 = eue.c;
                return new iw3(((int) (j3 & 4294967295L)) - iIntValue, 0);
            case 5:
                iqe iqeVar4 = (iqe) obj;
                Integer numD = iqeVar4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j4 = iqeVar4.f;
                int i6 = eue.c;
                return new iw3(0, iIntValue2 - ((int) (j4 & 4294967295L)));
            case 6:
                iqe iqeVar5 = (iqe) obj;
                Integer numC = iqeVar5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j5 = iqeVar5.f;
                int i7 = eue.c;
                return new iw3(((int) (j5 & 4294967295L)) - iIntValue3, 0);
            case 7:
                iqe iqeVar6 = (iqe) obj;
                Integer numB = iqeVar6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j6 = iqeVar6.f;
                int i8 = eue.c;
                return new iw3(0, iIntValue4 - ((int) (j6 & 4294967295L)));
            case 8:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                ks9 ks9Var = ((Boolean) obj2).booleanValue() ? ks9.a : ks9.b;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new pqe(ks9Var, ((Float) obj3).floatValue());
            case 9:
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return Boolean.valueOf(((hkb) obj) == null);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                vea veaVar = sdc.a;
                Boolean bool = Boolean.FALSE;
                k00 k00Var = (pa7.t(obj4, bool) || obj4 == null) ? null : (k00) ((a26) veaVar.c).d(obj4);
                k00Var.getClass();
                Object obj5 = list2.get(1);
                int i9 = eue.c;
                eue eueVar = (pa7.t(obj5, bool) || obj5 == null) ? null : (eue) ((a26) sdc.p.c).d(obj5);
                eueVar.getClass();
                return new zse(k00Var, eueVar.a, (eue) null);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return wefVar;
            case 14:
                return wefVar;
            case 15:
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((ste) obj).getClass();
                return wefVar;
            case 17:
                return wefVar;
            case 18:
                j00 j00Var = (j00) obj;
                Object obj6 = j00Var.a;
                if (!(obj6 instanceof l68) || (zteVarA = ((l68) obj6).a()) == null || (zteVarA.a == null && zteVarA.b == null && zteVarA.c == null && zteVarA.d == null)) {
                    return t72.q(j00Var);
                }
                Object obj7 = j00Var.a;
                obj7.getClass();
                zte zteVarA2 = ((l68) obj7).a();
                if (zteVarA2 == null || (xtdVar = zteVarA2.a) == null) {
                    xtdVar = new xtd(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                }
                return t72.q(j00Var, new j00(xtdVar, j00Var.b, j00Var.c));
            case 19:
                ((hxc) obj).c(cxc.B, wefVar);
                return wefVar;
            case 20:
                ((sn4) obj).getClass();
                return wefVar;
            case 21:
                ((fzb) obj).getClass();
                return wefVar;
            case 22:
                ((l1f) obj).getClass();
                return wefVar;
            case 23:
                ((l1f) obj).getClass();
                return wefVar;
            case 24:
                x8c x8cVar = (x8c) obj;
                x8cVar.getClass();
                return Boolean.valueOf(x8cVar.R0());
            case 25:
                ltc ltcVar = (ltc) obj;
                long j7 = ltcVar.f;
                nsd nsdVar = ltcVar.h;
                if (nsdVar != null) {
                    nsdVar.d(ltcVar, g21.g, ltcVar.g);
                }
                long j8 = ltcVar.f;
                if (j7 != j8) {
                    btc btcVar = ltcVar.o;
                    if (btcVar != null) {
                        if (btcVar.a > j8) {
                            ltcVar.g();
                        } else {
                            btcVar.g = j8;
                            if (btcVar.b == null) {
                                btcVar.h = ym8.M((1.0d - ((double) btcVar.e.a(0))) * ltcVar.f);
                            }
                        }
                    } else if (j8 != 0) {
                        ltcVar.l();
                    }
                }
                return wefVar;
            case 26:
                rf0 rf0Var = (rf0) obj;
                rf0Var.getClass();
                return rf0Var.b.e;
            case 27:
                rf0 rf0Var2 = (rf0) obj;
                rf0Var2.getClass();
                return rf0Var2.b.d;
            case 28:
                x8c x8cVar2 = (x8c) obj;
                x8cVar2.getClass();
                o1d o1dVar = new o1d();
                while (x8cVar2.R0()) {
                    o1dVar.add(Integer.valueOf((int) x8cVar2.getLong(0)));
                }
                return o1dVar.d();
            default:
                hxc hxcVar = (hxc) obj;
                hxcVar.getClass();
                exc.j(hxcVar, 0);
                return wefVar;
        }
    }
}
