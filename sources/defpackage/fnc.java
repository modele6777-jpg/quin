package defpackage;

import ai.askquin.services.InAppMessagePollingService;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fnc implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ fnc(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                kv2.y((l1f) obj, "btn", "SR_XZ_physicalPickDeck", "pathway", "SR_XZ_physicalDraw");
                return wefVar;
            case 1:
                kv2.y((l1f) obj, "btn", "SR_XZ_physicalViewReading", "pathway", "SR_XZ_physicalDraw");
                return wefVar;
            case 2:
                kv2.y((l1f) obj, "btn", "SR_XZ_physicalScan", "pathway", "SR_XZ_physicalDraw");
                return wefVar;
            case 3:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.j(1);
                return wefVar;
            case 4:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("SR_XZ_infoQuestion", "page_name");
                return wefVar;
            case 5:
                kv2.y((l1f) obj, "btn", "SR_XZ_infoSkip", "pathway", "SR_XZ_infoQuestion");
                return wefVar;
            case 6:
                kv2.y((l1f) obj, "btn", "SR_XZ_infoStartDraw", "pathway", "SR_XZ_infoQuestion");
                return wefVar;
            case 7:
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.getClass();
                g0cVar2.j(1);
                return wefVar;
            case 8:
                im2 im2Var = (im2) obj;
                im2Var.getClass();
                vv7 vv7Var = (vv7) im2Var;
                vv7Var.a();
                xl1 xl1Var = vv7Var.a;
                if (Float.intBitsToFloat((int) (xl1Var.f() >> 32)) > 0.0f) {
                    float fN = mh3.n(vv7Var.p0(32.0f) / Float.intBitsToFloat((int) (xl1Var.f() >> 32)), 0.0f, 0.5f);
                    Float fValueOf = Float.valueOf(0.0f);
                    long j = y72.j;
                    iy9 iy9Var = new iy9(fValueOf, new y72(j));
                    Float fValueOf2 = Float.valueOf(fN);
                    long j2 = y72.b;
                    sn4.O0(im2Var, gec.E(new iy9[]{iy9Var, new iy9(fValueOf2, new y72(j2)), new iy9(Float.valueOf(1.0f - fN), new y72(j2)), new iy9(Float.valueOf(1.0f), new y72(j))}), 0L, 0L, 0.0f, null, null, 6, 62);
                }
                return wefVar;
            case 9:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a("SR_XZ_infoRelationship", "page_name");
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                kv2.y((l1f) obj, "btn", "SR_XZ_infoRelationshipNext", "pathway", "SR_XZ_infoRelationship");
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                l1fVar3.a("SR_XZ_infoRole", "page_name");
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                kv2.y((l1f) obj, "btn", "SR_XZ_infoRoleNext", "pathway", "SR_XZ_infoRole");
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                im2 im2Var2 = (im2) obj;
                im2Var2.getClass();
                vv7 vv7Var2 = (vv7) im2Var2;
                float fP0 = vv7Var2.p0(zrc.i);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L);
                xl1 xl1Var2 = vv7Var2.a;
                v6c v6cVarA = w6c.a(0.0f, 0.0f, Float.intBitsToFloat((int) (xl1Var2.f() >> 32)), Float.intBitsToFloat((int) (xl1Var2.f() & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                zt ztVarA = cu.a();
                zt.c(ztVarA, v6cVarA);
                ta0 ta0Var = xl1Var2.b;
                long jZ = ta0Var.z();
                ta0Var.p().g();
                try {
                    ((vd9) ta0Var.c).k(ztVarA, 0);
                    ((vv7) im2Var2).a();
                    return wefVar;
                } finally {
                    ks0.t(ta0Var, jZ);
                }
            case 14:
                return new csc(((Boolean) obj).booleanValue());
            case 15:
                wn7[] wn7VarArr = exc.a;
                ((hxc) obj).c(cxc.e, wefVar);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                hl9 hl9Var = (hl9) obj;
                long j3 = hl9Var.a;
                return (9223372034707292159L & j3) != 9205357640488583168L ? new yz(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (hl9Var.a & 4294967295L))) : xvc.a;
            case 17:
                yz yzVar = (yz) obj;
                return new hl9((((long) Float.floatToRawIntBits(yzVar.a)) << 32) | (((long) Float.floatToRawIntBits(yzVar.b)) & 4294967295L));
            case 18:
                return Long.valueOf(((x59) obj).a);
            case 19:
                return new owc(((Long) obj).longValue());
            case 20:
                List list = (List) obj;
                qwc qwcVar = new qwc();
                Object obj2 = list.get(0);
                obj2.getClass();
                List list2 = (List) obj2;
                vea veaVar = k00.e;
                veaVar.getClass();
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    k00 k00Var = (k00) ((a26) veaVar.c).d(list2.get(i2));
                    if (k00Var != null) {
                        arrayList.add(k00Var);
                    }
                }
                qwcVar.c.setValue(arrayList);
                Object obj3 = list.get(1);
                Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
                if (num != null) {
                    Object obj4 = list.get(2);
                    obj4.getClass();
                    long jLongValue = ((Long) obj4).longValue();
                    Object obj5 = list.get(3);
                    obj5.getClass();
                    Object obj6 = list.get(4);
                    obj6.getClass();
                    int iIntValue = ((Integer) obj6).intValue();
                    Object obj7 = list.get(5);
                    obj7.getClass();
                    long jLongValue2 = ((Long) obj7).longValue();
                    Object obj8 = list.get(6);
                    obj8.getClass();
                    Object obj9 = list.get(7);
                    obj9.getClass();
                    qwcVar.a.setValue(new vuc(new uuc(txb.valueOf((String) obj5), num.intValue(), jLongValue), new uuc(txb.valueOf((String) obj8), iIntValue, jLongValue2), ((Boolean) obj9).booleanValue()));
                }
                return qwcVar;
            case 21:
                cyc cycVar = (cyc) obj;
                cycVar.getClass();
                return cycVar.iterator();
            case 22:
                return obj;
            case 23:
                return Boolean.valueOf(obj == null);
            case 24:
                bh7 bh7Var = (bh7) obj;
                bh7Var.getClass();
                bh7Var.c = true;
                bh7Var.f = true;
                bh7Var.a = true;
                bh7Var.b = false;
                hzc hzcVar = new hzc();
                jl9 jl9Var = jl9.a;
                kob kobVar = job.a;
                hzcVar.b(kobVar.b(OffsetDateTime.class), jl9Var);
                hzcVar.b(kobVar.b(LocalDate.class), ra8.a);
                hzcVar.b(kobVar.b(Date.class), je3.a);
                bh7Var.j = new hzc((HashMap) hzcVar.b, (HashMap) hzcVar.c, (HashMap) hzcVar.d, (HashMap) hzcVar.e, (HashMap) hzcVar.f, hzcVar.a);
                return wefVar;
            case 25:
                em7 em7Var = (em7) obj;
                em7Var.getClass();
                xn7 xn7VarO = hfc.o(em7Var);
                if (xn7VarO != null) {
                    return xn7VarO;
                }
                if (af1.R(em7Var).isInterface()) {
                    return new aja(em7Var);
                }
                return null;
            case 26:
                em7 em7Var2 = (em7) obj;
                em7Var2.getClass();
                xn7 xn7VarO2 = hfc.o(em7Var2);
                if (xn7VarO2 == null) {
                    xn7VarO2 = af1.R(em7Var2).isInterface() ? new aja(em7Var2) : null;
                }
                if (xn7VarO2 != null) {
                    return t72.F(xn7VarO2);
                }
                return null;
            case 27:
                um8 um8Var = (um8) obj;
                um8Var.getClass();
                return ((sm8) um8Var.a()).get(1) + "\"[REDACTED]\"";
            case 28:
                ((InAppMessagePollingService) obj).getClass();
                return wefVar;
            default:
                Integer num2 = (Integer) obj;
                num2.getClass();
                ynb.V(lw2.a, null, null, new c2d(xqa.w.a, num2, null), 3);
                return wefVar;
        }
    }
}
