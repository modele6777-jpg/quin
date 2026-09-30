package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sz3 {
    public static final rz3 a;
    public static final rz3 b;
    public static final rz3 c;
    public static final rz3 d;
    public static final rz3 e;
    public static final rz3 f;
    public static final rz3 g;
    public static final rz3 h;
    public static final rz3 i;
    public static final rz3 j;
    public static final i8c k;
    public static final m8c l;
    public static final gec m;
    public static final y09 n;
    public static final HashMap o;

    static {
        jyf jyfVar = jyf.d;
        rz3 rz3Var = new rz3(jyfVar, 0);
        a = rz3Var;
        kyf kyfVar = kyf.d;
        rz3 rz3Var2 = new rz3(kyfVar, 1);
        b = rz3Var2;
        lyf lyfVar = lyf.d;
        rz3 rz3Var3 = new rz3(lyfVar, 2);
        c = rz3Var3;
        gyf gyfVar = gyf.d;
        rz3 rz3Var4 = new rz3(gyfVar, 3);
        d = rz3Var4;
        myf myfVar = myf.d;
        rz3 rz3Var5 = new rz3(myfVar, 4);
        e = rz3Var5;
        iyf iyfVar = iyf.d;
        rz3 rz3Var6 = new rz3(iyfVar, 5);
        f = rz3Var6;
        fyf fyfVar = fyf.d;
        rz3 rz3Var7 = new rz3(fyfVar, 6);
        g = rz3Var7;
        hyf hyfVar = hyf.d;
        rz3 rz3Var8 = new rz3(hyfVar, 7);
        h = rz3Var8;
        nyf nyfVar = nyf.d;
        rz3 rz3Var9 = new rz3(nyfVar, 8);
        i = rz3Var9;
        Collections.unmodifiableSet(qd0.I0(new rz3[]{rz3Var, rz3Var2, rz3Var4, rz3Var6}));
        HashMap map = new HashMap(6);
        map.put(rz3Var2, 0);
        map.put(rz3Var, 0);
        map.put(rz3Var4, 1);
        map.put(rz3Var3, 1);
        map.put(rz3Var5, 2);
        Collections.unmodifiableMap(map);
        j = rz3Var5;
        int i2 = 27;
        k = new i8c(i2);
        l = new m8c(i2);
        m = new gec(i2);
        try {
            Iterator it = Arrays.asList(new y09[0]).iterator();
            n = it.hasNext() ? (y09) it.next() : y09.a;
            HashMap map2 = new HashMap();
            o = map2;
            map2.put(jyfVar, rz3Var);
            map2.put(kyfVar, rz3Var2);
            map2.put(lyfVar, rz3Var3);
            map2.put(gyfVar, rz3Var4);
            map2.put(myfVar, rz3Var5);
            map2.put(iyfVar, rz3Var6);
            map2.put(fyfVar, rz3Var7);
            map2.put(hyfVar, rz3Var8);
            map2.put(nyfVar, rz3Var9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void a(int i2) {
        String str = i2 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 16 ? 3 : 2];
        if (i2 != 1 && i2 != 3 && i2 != 5 && i2 != 7) {
            switch (i2) {
                case 9:
                    objArr[0] = "from";
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    objArr[0] = "first";
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i2 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i2) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[2] = "compareLocal";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer b(rz3 rz3Var, rz3 rz3Var2) {
        if (rz3Var == null) {
            a(12);
            throw null;
        }
        cd cdVar = rz3Var.a;
        if (rz3Var2 == null) {
            a(13);
            throw null;
        }
        cd cdVar2 = rz3Var2.a;
        Integer numA = cdVar.a(cdVar2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = cdVar2.a(cdVar);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static gm3 c(ejb ejbVar, ea1 ea1Var, bm3 bm3Var) {
        gm3 gm3VarC;
        if (ea1Var == null) {
            a(8);
            throw null;
        }
        if (bm3Var == null) {
            a(9);
            throw null;
        }
        for (gm3 gm3Var = (gm3) ea1Var.a(); gm3Var != null && gm3Var.getVisibility() != f; gm3Var = (gm3) oz3.h(gm3Var, gm3.class, true)) {
            if (!gm3Var.getVisibility().a(ejbVar, gm3Var, bm3Var)) {
                return gm3Var;
            }
        }
        if (!(ea1Var instanceof a7f) || (gm3VarC = c(ejbVar, ((a7f) ea1Var).V0, bm3Var)) == null) {
            return null;
        }
        return gm3VarC;
    }

    public static boolean d(bm3 bm3Var, bm3 bm3Var2) {
        if (bm3Var2 != null) {
            qfc qfcVarE = oz3.e(bm3Var2);
            return qfcVarE != qfc.e && qfcVarE == oz3.e(bm3Var);
        }
        a(7);
        throw null;
    }

    public static boolean e(rz3 rz3Var) {
        if (rz3Var != null) {
            return rz3Var == a || rz3Var == b;
        }
        a(14);
        throw null;
    }

    public static rz3 f(cd cdVar) {
        if (cdVar == null) {
            a(15);
            throw null;
        }
        rz3 rz3Var = (rz3) o.get(cdVar);
        if (rz3Var != null) {
            return rz3Var;
        }
        yg5.l(cdVar, "Inapplicable visibility: ");
        return null;
    }
}
