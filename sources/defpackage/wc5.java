package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wc5 {
    public static final /* synthetic */ int c = 0;
    public final spd a = new spd(16);
    public boolean b;

    static {
        new wc5(0);
    }

    public wc5(int i) {
        a();
        a();
    }

    public static void b(j72 j72Var, w9g w9gVar, int i, Object obj) {
        if (w9gVar == w9g.c) {
            j72Var.m(i, 3);
            ((t56) ((tt8) obj)).q(j72Var);
            j72Var.m(i, 4);
        }
        j72Var.m(i, w9gVar.b());
        switch (w9gVar.ordinal()) {
            case 0:
                j72Var.j(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                j72Var.i(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                j72Var.o(((Long) obj).longValue());
                break;
            case 3:
                j72Var.o(((Long) obj).longValue());
                break;
            case 4:
                j72Var.k(((Integer) obj).intValue());
                break;
            case 5:
                j72Var.j(((Long) obj).longValue());
                break;
            case 6:
                j72Var.i(((Integer) obj).intValue());
                break;
            case 7:
                j72Var.f(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof y61)) {
                    j72Var.l((String) obj);
                } else {
                    j72Var.h((y61) obj);
                }
                break;
            case 9:
                ((t56) ((tt8) obj)).q(j72Var);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                tt8 tt8Var = (tt8) obj;
                j72Var.n(((t56) tt8Var).g(null));
                ((t56) tt8Var).q(j72Var);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof y61)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    j72Var.n(length);
                    j72Var.g(bArr, 0, length);
                } else {
                    j72Var.h((y61) obj);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                j72Var.n(((Integer) obj).intValue());
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (!(obj instanceof k87)) {
                    j72Var.k(((Integer) obj).intValue());
                } else {
                    j72Var.k(((k87) obj).a());
                }
                break;
            case 14:
                j72Var.i(((Integer) obj).intValue());
                break;
            case 15:
                j72Var.j(((Long) obj).longValue());
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                j72Var.n((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                j72Var.o((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        spd spdVar;
        if (this.b) {
            return;
        }
        int i = 0;
        while (true) {
            spdVar = this.a;
            if (i >= spdVar.b.size()) {
                break;
            }
            Map.Entry entryD = spdVar.d(i);
            if (entryD.getValue() instanceof t56) {
                t56 t56Var = (t56) entryD.getValue();
                t56Var.getClass();
                u0b u0bVar = u0b.c;
                u0bVar.getClass();
                u0bVar.a(t56Var.getClass()).b(t56Var);
                t56Var.m();
            }
            i++;
        }
        if (!spdVar.d) {
            if (spdVar.b.size() > 0) {
                spdVar.d(0).getKey().getClass();
                r3.f();
                return;
            } else {
                Iterator it = spdVar.e().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    r3.f();
                    return;
                }
            }
        }
        if (!spdVar.d) {
            spdVar.c = spdVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(spdVar.c);
            spdVar.f = spdVar.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(spdVar.f);
            spdVar.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        wc5 wc5Var = new wc5();
        spd spdVar = this.a;
        if (spdVar.b.size() > 0) {
            Map.Entry entryD = spdVar.d(0);
            if (entryD.getKey() != null) {
                r3.f();
                return null;
            }
            entryD.getValue();
            throw null;
        }
        Iterator it = spdVar.e().iterator();
        if (!it.hasNext()) {
            return wc5Var;
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
        if (obj instanceof wc5) {
            return this.a.equals(((wc5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public wc5() {
    }
}
