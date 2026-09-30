package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tbc implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ tbc(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0401 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0403 A[LOOP:2: B:117:0x03bc->B:130:0x0403, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0406 A[SYNTHETIC] */
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        a10 a10Var;
        Object objA;
        switch (this.a) {
            case 0:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 1:
                rcc rccVar = (rcc) obj2;
                Map map = rccVar.a;
                w79 w79Var = rccVar.b;
                Object[] objArr = w79Var.b;
                Object[] objArr2 = w79Var.c;
                long[] jArr = w79Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map mapD = ((ucc) objArr2[i4]).d();
                                    if (mapD.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapD);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 2:
                return obj2;
            case 3:
                k00 k00Var = (k00) obj2;
                return t72.q(k00Var.b, sdc.a(k00Var.a, sdc.b, (pcc) obj));
            case 4:
                return Integer.valueOf(((mne) obj2).a);
            case 5:
                cte cteVar = (cte) obj2;
                return t72.q(Float.valueOf(cteVar.a), Float.valueOf(cteVar.b));
            case 6:
                pcc pccVar = (pcc) obj;
                ete eteVar = (ete) obj2;
                wue wueVar = new wue(eteVar.a);
                rdc rdcVar = sdc.x;
                return t72.q(sdc.a(wueVar, rdcVar, pccVar), sdc.a(new wue(eteVar.b), rdcVar, pccVar));
            case 7:
                return Integer.valueOf(((ar5) obj2).a);
            case 8:
                k68 k68Var = (k68) obj2;
                return t72.q(k68Var.a, sdc.a(k68Var.b, sdc.j, (pcc) obj));
            case 9:
                return Float.valueOf(((ou0) obj2).a);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                pcc pccVar2 = (pcc) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(sdc.a((j00) list.get(i5), sdc.c, pccVar2));
                }
                return arrayList;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                eue eueVar = (eue) obj2;
                return t72.q(Integer.valueOf((int) (eueVar.a >> 32)), Integer.valueOf((int) (eueVar.a & 4294967295L)));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                pcc pccVar3 = (pcc) obj;
                o4d o4dVar = (o4d) obj2;
                return t72.q(sdc.a(new y72(o4dVar.a), sdc.r, pccVar3), sdc.a(new hl9(o4dVar.b), sdc.z, pccVar3), Float.valueOf(o4dVar.c));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return Integer.valueOf(((jme) obj2).a);
            case 14:
                return Integer.valueOf(((pne) obj2).a);
            case 15:
                return Integer.valueOf(((ft6) obj2).a);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return Integer.valueOf(((wq5) obj2).a);
            case 17:
                return Integer.valueOf(((xq5) obj2).a);
            case 18:
                wue wueVar2 = (wue) obj2;
                return wueVar2 != null ? wue.a(wueVar2.a, wue.c) : false ? Boolean.FALSE : t72.q(Float.valueOf(wue.c(wueVar2.a)), sdc.a(new xue(wue.b(wueVar2.a)), sdc.y, (pcc) obj));
            case 19:
                j68 j68Var = (j68) obj2;
                return t72.q(j68Var.a, sdc.a(j68Var.b, sdc.j, (pcc) obj));
            case 20:
                long j2 = ((xue) obj2).a;
                if (xue.a(j2, 8589934592L)) {
                    return 0;
                }
                if (xue.a(j2, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 21:
                hl9 hl9Var = (hl9) obj2;
                return hl9Var != null ? hl9.c(hl9Var.a, 9205357640488583168L) : false ? Boolean.FALSE : t72.q(Float.valueOf(Float.intBitsToFloat((int) (hl9Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (hl9Var.a & 4294967295L))));
            case 22:
                pcc pccVar4 = (pcc) obj;
                j00 j00Var = (j00) obj2;
                Object obj4 = j00Var.a;
                if (obj4 instanceof ty9) {
                    a10Var = a10.a;
                } else if (obj4 instanceof xtd) {
                    a10Var = a10.b;
                } else if (obj4 instanceof ftf) {
                    a10Var = a10.c;
                } else if (obj4 instanceof shf) {
                    a10Var = a10.d;
                } else if (obj4 instanceof k68) {
                    a10Var = a10.e;
                } else if (obj4 instanceof j68) {
                    a10Var = a10.f;
                } else {
                    if (!(obj4 instanceof m4e)) {
                        cva.f();
                        return null;
                    }
                    a10Var = a10.g;
                }
                switch (a10Var.ordinal()) {
                    case 0:
                        obj4.getClass();
                        objA = sdc.a((ty9) obj4, sdc.h, pccVar4);
                        break;
                    case 1:
                        obj4.getClass();
                        objA = sdc.a((xtd) obj4, sdc.i, pccVar4);
                        break;
                    case 2:
                        obj4.getClass();
                        objA = sdc.a((ftf) obj4, sdc.d, pccVar4);
                        break;
                    case 3:
                        obj4.getClass();
                        objA = sdc.a((shf) obj4, sdc.e, pccVar4);
                        break;
                    case 4:
                        obj4.getClass();
                        objA = sdc.a((k68) obj4, sdc.f, pccVar4);
                        break;
                    case 5:
                        obj4.getClass();
                        objA = sdc.a((j68) obj4, sdc.g, pccVar4);
                        break;
                    case 6:
                        obj4.getClass();
                        objA = ((m4e) obj4).a;
                        break;
                    default:
                        ap.c();
                        return null;
                }
                return t72.q(a10Var, objA, Integer.valueOf(j00Var.b), Integer.valueOf(j00Var.c), j00Var.d);
            case 23:
                pcc pccVar5 = (pcc) obj;
                List list2 = ((sd8) obj2).a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList2.add(sdc.a((rd8) list2.get(i6), sdc.B, pccVar5));
                }
                return arrayList2;
            case 24:
                return ((rd8) obj2).a.toLanguageTag();
            case 25:
                pcc pccVar6 = (pcc) obj;
                y58 y58Var = (y58) obj2;
                return t72.q(sdc.a(new v58(y58Var.a), sdc.D, pccVar6), sdc.a(new x58(y58Var.b), sdc.E, pccVar6), sdc.a(new w58(y58Var.c), sdc.F, pccVar6));
            case 26:
                return Float.valueOf(((v58) obj2).a);
            case 27:
                return Integer.valueOf(((x58) obj2).a);
            case 28:
                return Integer.valueOf(((w58) obj2).a);
            default:
                return ((ftf) obj2).a;
        }
    }
}
