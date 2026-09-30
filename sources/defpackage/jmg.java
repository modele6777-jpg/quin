package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jmg {
    public static final /* synthetic */ int c = 0;
    public final aog a = new aog();
    public boolean b;

    static {
        new jmg(0);
    }

    public jmg(int i) {
        a();
        a();
    }

    public static void b(gmg gmgVar, log logVar, int i, Object obj) {
        if (logVar == log.b) {
            gmgVar.d(i, 3);
            ((omg) ((qlg) obj)).d(gmgVar);
            gmgVar.d(i, 4);
            return;
        }
        gmgVar.d(i, logVar.b());
        mog mogVar = mog.a;
        switch (logVar.ordinal()) {
            case 0:
                gmgVar.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                gmgVar.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                gmgVar.t(((Long) obj).longValue());
                break;
            case 3:
                gmgVar.t(((Long) obj).longValue());
                break;
            case 4:
                gmgVar.q(((Integer) obj).intValue());
                break;
            case 5:
                gmgVar.u(((Long) obj).longValue());
                break;
            case 6:
                gmgVar.s(((Integer) obj).intValue());
                break;
            case 7:
                gmgVar.p(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof xlg)) {
                    gmgVar.v((String) obj);
                } else {
                    gmgVar.m((xlg) obj);
                }
                break;
            case 9:
                ((omg) ((qlg) obj)).d(gmgVar);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                gmgVar.o((qlg) obj);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof xlg)) {
                    byte[] bArr = (byte[]) obj;
                    gmgVar.n(bArr, bArr.length);
                } else {
                    gmgVar.m((xlg) obj);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                gmgVar.r(((Integer) obj).intValue());
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (!(obj instanceof qmg)) {
                    gmgVar.q(((Integer) obj).intValue());
                } else {
                    gmgVar.q(((qmg) obj).b());
                }
                break;
            case 14:
                gmgVar.s(((Integer) obj).intValue());
                break;
            case 15:
                gmgVar.u(((Long) obj).longValue());
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                gmgVar.r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                gmgVar.t((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        aog aogVar = this.a;
        int i = aogVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = aogVar.b(i2).b;
            if (obj instanceof omg) {
                omg omgVar = (omg) obj;
                vng.c.a(omgVar.getClass()).c(omgVar);
                omgVar.f();
            }
        }
        Iterator it = aogVar.c().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof omg) {
                omg omgVar2 = (omg) value;
                vng.c.a(omgVar2.getClass()).c(omgVar2);
                omgVar2.f();
            }
        }
        if (!aogVar.d) {
            if (aogVar.b > 0) {
                aogVar.b(0).a.getClass();
                r3.f();
                return;
            } else {
                Iterator it2 = aogVar.c().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    r3.f();
                    return;
                }
            }
        }
        if (!aogVar.d) {
            aogVar.c = aogVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(aogVar.c);
            aogVar.f = aogVar.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(aogVar.f);
            aogVar.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        jmg jmgVar = new jmg();
        aog aogVar = this.a;
        if (aogVar.b > 0) {
            aogVar.b(0).a.getClass();
            r3.f();
            return null;
        }
        Iterator it = aogVar.c().iterator();
        if (!it.hasNext()) {
            return jmgVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            r3.f();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jmg) {
            return this.a.equals(((jmg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public jmg() {
    }
}
