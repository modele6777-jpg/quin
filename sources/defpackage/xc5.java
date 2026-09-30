package defpackage;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xc5 {
    public static final xc5 c = new xc5(0);
    public final tpd a = new tpd(16);
    public boolean b;

    public xc5(int i) {
        f();
    }

    public static int c(x9g x9gVar, Object obj) {
        switch (x9gVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return p90.t(((Long) obj).longValue());
            case 3:
                return p90.t(((Long) obj).longValue());
            case 4:
                return p90.p(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes(Constants.ENCODING);
                    return p90.s(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    cva.q("UTF-8 not supported.", e);
                    return 0;
                }
            case 9:
                return ((ut8) obj).e();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return p90.r((ut8) obj);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (obj instanceof z61) {
                    z61 z61Var = (z61) obj;
                    return z61Var.size() + p90.s(z61Var.size());
                }
                byte[] bArr = (byte[]) obj;
                return p90.s(bArr.length) + bArr.length;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return p90.s(((Integer) obj).intValue());
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return obj instanceof j87 ? p90.p(((j87) obj).a()) : p90.p(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                return p90.s((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return p90.t((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static int d(r56 r56Var, Object obj) {
        x9g x9gVar = r56Var.b;
        int i = r56Var.a;
        if (!r56Var.c) {
            int iU = p90.u(i);
            if (x9gVar == x9g.c) {
                iU *= 2;
            }
            return c(x9gVar, obj) + iU;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iU2 = p90.u(i);
            if (x9gVar == x9g.c) {
                iU2 *= 2;
            }
            iC += c(x9gVar, obj2) + iU2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        r56 r56Var = (r56) entry.getKey();
        if (r56Var.b.a() != aag.w) {
            return true;
        }
        if (r56Var.c) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((ut8) it.next()).b()) {
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof ut8)) {
            qc0.j("Wrong object type used with protocol message reflection.");
            return false;
        }
        if (((ut8) value).b()) {
            return true;
        }
        return false;
    }

    public static Object h(g72 g72Var, x9g x9gVar) {
        switch (x9gVar.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(g72Var.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(g72Var.i()));
            case 2:
                return Long.valueOf(g72Var.l());
            case 3:
                return Long.valueOf(g72Var.l());
            case 4:
                return Integer.valueOf(g72Var.k());
            case 5:
                return Long.valueOf(g72Var.j());
            case 6:
                return Integer.valueOf(g72Var.i());
            case 7:
                return Boolean.valueOf(g72Var.l() != 0);
            case 8:
                int iK = g72Var.k();
                int i = g72Var.b;
                int i2 = g72Var.d;
                if (iK > i - i2 || iK <= 0) {
                    return iK == 0 ? "" : new String(g72Var.h(iK), Constants.ENCODING);
                }
                String str = new String(g72Var.a, i2, iK, Constants.ENCODING);
                g72Var.d += iK;
                return str;
            case 9:
                qc0.j("readPrimitiveField() cannot handle nested groups.");
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                qc0.j("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return g72Var.f();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return Integer.valueOf(g72Var.k());
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                qc0.j("readPrimitiveField() cannot handle enums.");
                return null;
            case 14:
                return Integer.valueOf(g72Var.i());
            case 15:
                return Long.valueOf(g72Var.j());
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                int iK2 = g72Var.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = g72Var.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    public static void j(x9g x9gVar, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (x9gVar.a()) {
            case a:
                z2 = obj instanceof Integer;
                break;
            case b:
                z2 = obj instanceof Long;
                break;
            case c:
                z2 = obj instanceof Float;
                break;
            case d:
                z2 = obj instanceof Double;
                break;
            case e:
                z2 = obj instanceof Boolean;
                break;
            case f:
                z2 = obj instanceof String;
                break;
            case g:
                if (!(obj instanceof z61) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case v:
                if (!(obj instanceof Integer) && !(obj instanceof j87)) {
                    z = false;
                }
                z2 = z;
                break;
            case w:
                z2 = obj instanceof ut8;
                break;
        }
        if (z2) {
            return;
        }
        qc0.j("Wrong object type used with protocol message reflection.");
    }

    public static void k(p90 p90Var, x9g x9gVar, Object obj) {
        switch (x9gVar.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                p90Var.getClass();
                p90Var.p0(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                p90Var.getClass();
                p90Var.o0(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                p90Var.r0(((Long) obj).longValue());
                break;
            case 3:
                p90Var.r0(((Long) obj).longValue());
                break;
            case 4:
                p90Var.i0(((Integer) obj).intValue());
                break;
            case 5:
                p90Var.p0(((Long) obj).longValue());
                break;
            case 6:
                p90Var.o0(((Integer) obj).intValue());
                break;
            case 7:
                p90Var.l0(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                p90Var.getClass();
                byte[] bytes = ((String) obj).getBytes(Constants.ENCODING);
                p90Var.q0(bytes.length);
                p90Var.n0(bytes);
                break;
            case 9:
                p90Var.getClass();
                ((ut8) obj).d(p90Var);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                p90Var.k0((ut8) obj);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof z61)) {
                    byte[] bArr = (byte[]) obj;
                    p90Var.getClass();
                    p90Var.q0(bArr.length);
                    p90Var.n0(bArr);
                } else {
                    z61 z61Var = (z61) obj;
                    p90Var.getClass();
                    p90Var.q0(z61Var.size());
                    p90Var.m0(z61Var);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                p90Var.q0(((Integer) obj).intValue());
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (!(obj instanceof j87)) {
                    p90Var.i0(((Integer) obj).intValue());
                } else {
                    p90Var.i0(((j87) obj).a());
                }
                break;
            case 14:
                p90Var.o0(((Integer) obj).intValue());
                break;
            case 15:
                p90Var.p0(((Long) obj).longValue());
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                p90Var.q0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                p90Var.r0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(r56 r56Var, Object obj) {
        List arrayList;
        if (!r56Var.c) {
            qc0.j("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        j(r56Var.b, obj);
        tpd tpdVar = this.a;
        Object obj2 = tpdVar.get(r56Var);
        if (obj2 == null) {
            arrayList = new ArrayList();
            tpdVar.put(r56Var, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xc5 clone() {
        tpd tpdVar;
        xc5 xc5Var = new xc5();
        int i = 0;
        while (true) {
            tpdVar = this.a;
            if (i >= tpdVar.b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) tpdVar.b.get(i);
            xc5Var.i((r56) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : tpdVar.d()) {
            xc5Var.i((r56) entry2.getKey(), entry2.getValue());
        }
        return xc5Var;
    }

    public final void f() {
        if (this.b) {
            return;
        }
        tpd tpdVar = this.a;
        if (!tpdVar.d) {
            for (int i = 0; i < tpdVar.b.size(); i++) {
                Map.Entry entry = (Map.Entry) tpdVar.b.get(i);
                if (((r56) entry.getKey()).c) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : tpdVar.d()) {
                if (((r56) entry2.getKey()).c) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!tpdVar.d) {
            tpdVar.c = tpdVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(tpdVar.c);
            tpdVar.d = true;
        }
        this.b = true;
    }

    public final void g(Map.Entry entry) {
        r56 r56Var = (r56) entry.getKey();
        Object value = entry.getValue();
        boolean z = r56Var.c;
        tpd tpdVar = this.a;
        if (z) {
            Object arrayList = tpdVar.get(r56Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            tpdVar.put(r56Var, arrayList);
            return;
        }
        if (r56Var.b.a() != aag.w) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            tpdVar.put(r56Var, value);
            return;
        }
        Object obj2 = tpdVar.get(r56Var);
        if (obj2 != null) {
            tpdVar.put(r56Var, ((ut8) obj2).c().i((u56) ((ut8) value)).f());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        tpdVar.put(r56Var, value);
    }

    public final void i(r56 r56Var, Object obj) {
        boolean z = r56Var.c;
        x9g x9gVar = r56Var.b;
        if (!z) {
            j(x9gVar, obj);
        } else {
            if (!(obj instanceof List)) {
                qc0.j("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(x9gVar, it.next());
            }
            obj = arrayList;
        }
        this.a.put(r56Var, obj);
    }

    public xc5() {
    }
}
