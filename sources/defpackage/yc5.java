package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yc5 {
    public static final /* synthetic */ int c = 0;
    public final upd a = upd.g();
    public boolean b;

    static {
        new yc5(0);
    }

    public yc5(int i) {
        a();
        a();
    }

    public static void b(m72 m72Var, y9g y9gVar, int i, Object obj) {
        if (y9gVar == y9g.b) {
            m72Var.B(i, 3);
            ((v56) ((vt8) obj)).k(m72Var);
            m72Var.B(i, 4);
        }
        m72Var.B(i, y9gVar.b());
        switch (y9gVar.ordinal()) {
            case 0:
                m72Var.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                m72Var.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                m72Var.F(((Long) obj).longValue());
                break;
            case 3:
                m72Var.F(((Long) obj).longValue());
                break;
            case 4:
                m72Var.w(((Integer) obj).intValue());
                break;
            case 5:
                m72Var.u(((Long) obj).longValue());
                break;
            case 6:
                m72Var.s(((Integer) obj).intValue());
                break;
            case 7:
                m72Var.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof b71)) {
                    m72Var.A((String) obj);
                } else {
                    m72Var.q((b71) obj);
                }
                break;
            case 9:
                ((v56) ((vt8) obj)).k(m72Var);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                vt8 vt8Var = (vt8) obj;
                m72Var.D(((v56) vt8Var).a(null));
                ((v56) vt8Var).k(m72Var);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof b71)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    m72Var.D(length);
                    m72Var.n(bArr, 0, length);
                } else {
                    m72Var.q((b71) obj);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                m72Var.D(((Integer) obj).intValue());
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                m72Var.w(((Integer) obj).intValue());
                break;
            case 14:
                m72Var.s(((Integer) obj).intValue());
                break;
            case 15:
                m72Var.u(((Long) obj).longValue());
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                m72Var.D((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                m72Var.F((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        upd updVar = this.a;
        int size = updVar.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryD = updVar.d(i);
            if (entryD.getValue() instanceof v56) {
                v56 v56Var = (v56) entryD.getValue();
                v56Var.getClass();
                v0b v0bVar = v0b.c;
                v0bVar.getClass();
                v0bVar.a(v56Var.getClass()).b(v56Var);
                v56Var.g();
            }
        }
        if (!updVar.c) {
            if (updVar.a.size() > 0) {
                updVar.d(0).getKey().getClass();
                r3.f();
                return;
            } else {
                Iterator it = updVar.e().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    r3.f();
                    return;
                }
            }
        }
        if (!updVar.c) {
            updVar.b = updVar.b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(updVar.b);
            updVar.e = updVar.e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(updVar.e);
            updVar.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        yc5 yc5Var = new yc5();
        upd updVar = this.a;
        if (updVar.a.size() > 0) {
            Map.Entry entryD = updVar.d(0);
            if (entryD.getKey() != null) {
                r3.f();
                return null;
            }
            entryD.getValue();
            throw null;
        }
        Iterator it = updVar.e().iterator();
        if (!it.hasNext()) {
            return yc5Var;
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
        if (obj instanceof yc5) {
            return this.a.equals(((yc5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public yc5() {
    }
}
