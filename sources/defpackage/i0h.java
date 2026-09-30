package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0h {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final oid a;

    public i0h(oid oidVar) {
        this.a = oidVar;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        oa7.A(atomicReference);
        oa7.v(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.i() ? str : g(str, ok8.y, ok8.t, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.i() ? str : g(str, ym8.i, ym8.h, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (this.a.i()) {
            return str.startsWith("_exp_") ? ib8.j("experiment_id(", str, ")") : g(str, if9.r, if9.q, d);
        }
        return str;
    }

    public final String d(hsg hsgVar) {
        String string;
        oid oidVar = this.a;
        if (!oidVar.i()) {
            return hsgVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(hsgVar.c);
        sb.append(",name=");
        sb.append(a(hsgVar.a));
        sb.append(",params=");
        esg esgVar = hsgVar.b;
        if (esgVar == null) {
            string = null;
        } else {
            string = !oidVar.i() ? esgVar.a.toString() : e(esgVar.f());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.a.i()) {
            return bundle.toString();
        }
        StringBuilder sbO = ub3.o("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbO.length() != 8) {
                sbO.append(", ");
            }
            sbO.append(b(str));
            sbO.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbO.append(strF);
        }
        sbO.append("}]");
        return sbO.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbO = ub3.o("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbO.length() != 1) {
                    sbO.append(", ");
                }
                sbO.append(strE);
            }
        }
        sbO.append("]");
        return sbO.toString();
    }
}
