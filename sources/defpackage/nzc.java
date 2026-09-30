package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class nzc {
    public static final rob a = new rob("authorization|cookie|set-cookie|password|passcode|secret|token|email|phone|uid|chat.?id|nickname|question|content", 0);
    public static final rob b = new rob("(?i)bearer\\s+[a-z0-9._~+/=-]+");
    public static final rob c = new rob("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}", 0);
    public static final rob d = new rob("(?<![A-Za-z0-9])\\+?\\d[\\d -]{7,}\\d(?![A-Za-z0-9])");
    public static final rob e = new rob("(?i)([\"'](?:authorization|cookie|set-cookie|password|passcode|secret|token|email|phone|uid|chat.?id|nickname|question|content|code|shareUrl|share_url)[\"']\\s*:\\s*)([\"'][^\"']*[\"']|[^,}\\s]+)");
    public static final Set f = qd0.I0(new String[]{"code", "shareurl", "share_url"});

    public static final String a(String str) {
        byte[] bytes = str.getBytes(ox1.a);
        bytes.getClass();
        int length = bytes.length;
        int i = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (length <= 1024) {
            return str;
        }
        while (i > 0 && (bytes[i] & 192) == 128) {
            i--;
        }
        return new String(Arrays.copyOf(bytes, i), ox1.a);
    }

    public static final Throwable b(Throwable th) {
        String strA1;
        v41 v41VarP0;
        th.getClass();
        if (th instanceof qs6) {
            try {
                qs6 qs6Var = (qs6) th;
                qyb qybVar = qs6Var.a;
                vyb vybVar = qybVar.c;
                if (vybVar == null || (v41VarP0 = vybVar.P0()) == null) {
                    strA1 = null;
                } else {
                    yhb yhbVarPeek = v41VarP0.peek();
                    f41 f41Var = yhbVarPeek.b;
                    f41Var.h1(yhbVarPeek.a);
                    strA1 = f41Var.a1();
                }
                if (strA1 != null) {
                    xh7 xh7Var = fzc.a;
                    xh7Var.getClass();
                    NullableServerResponse nullableServerResponse = (NullableServerResponse) xh7Var.b(NullableServerResponse.Companion.serializer(nh7.Companion.serializer()), strA1);
                    kzc kzcVarC = c(strA1);
                    int iA = qs6Var.a();
                    int errorCode = nullableServerResponse.getErrorCode();
                    String errorMessage = nullableServerResponse.getErrorMessage();
                    Boolean boolValueOf = Boolean.valueOf(nullableServerResponse.getError());
                    String str = kzcVarC.e;
                    String str2 = kzcVarC.a;
                    String strC = qybVar.a.f.c("x-trace-id");
                    errorMessage.getClass();
                    return new ysb(iA, errorCode, errorMessage, boolValueOf, str, str2, strC, true);
                }
            } catch (Throwable unused) {
            }
        }
        return th;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    public static final kzc c(String str) {
        Object dzbVar;
        String str2;
        String strA;
        String str3;
        nh7 nh7Var;
        String string;
        nh7 nh7Var2;
        String strC;
        nh7 nh7Var3;
        String strC2;
        nh7 nh7Var4;
        String strC3;
        str.getClass();
        try {
            dzbVar = fzc.a.e(str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        String strA2 = null;
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        nh7 nh7Var5 = (nh7) dzbVar;
        String strE = e(str);
        ti7 ti7Var = nh7Var5 instanceof ti7 ? (ti7) nh7Var5 : null;
        nh7 nh7VarD = ti7Var != null ? d(ti7Var) : null;
        ti7 ti7Var2 = nh7VarD instanceof ti7 ? (ti7) nh7VarD : null;
        if (v4e.Q(strE)) {
            strE = null;
        }
        String strA3 = strE != null ? a(strE) : null;
        if (ti7Var == null || (nh7Var4 = (nh7) ti7Var.get("errorCode")) == null) {
            str2 = null;
        } else {
            yi7 yi7Var = nh7Var4 instanceof yi7 ? (yi7) nh7Var4 : null;
            if (yi7Var != null) {
                e37 e37Var = oh7.a;
                if (yi7Var instanceof qi7) {
                    strC3 = null;
                } else {
                    strC3 = yi7Var.c();
                }
            } else {
                strC3 = null;
            }
            str2 = strC3;
        }
        if (ti7Var == null || (nh7Var3 = (nh7) ti7Var.get("errorMessage")) == null) {
            strA = null;
        } else {
            yi7 yi7Var2 = nh7Var3 instanceof yi7 ? (yi7) nh7Var3 : null;
            if (yi7Var2 != null) {
                e37 e37Var2 = oh7.a;
                if (yi7Var2 instanceof qi7) {
                    strC2 = null;
                } else {
                    strC2 = yi7Var2.c();
                }
            } else {
                strC2 = null;
            }
            if (strC2 != null) {
                strA = a(f(strC2));
            } else {
                strA = null;
            }
        }
        if (ti7Var == null || (nh7Var2 = (nh7) ti7Var.get("error")) == null) {
            str3 = null;
        } else {
            yi7 yi7Var3 = nh7Var2 instanceof yi7 ? (yi7) nh7Var2 : null;
            if (yi7Var3 != null) {
                e37 e37Var3 = oh7.a;
                if (yi7Var3 instanceof qi7) {
                    strC = null;
                } else {
                    strC = yi7Var3.c();
                }
            } else {
                strC = null;
            }
            str3 = strC;
        }
        if (ti7Var2 != null && (nh7Var = (nh7) ti7Var2.get("data")) != null) {
            if (nh7Var instanceof qi7) {
                nh7Var = null;
            }
            if (nh7Var != null && (string = nh7Var.toString()) != null) {
                strA2 = a(string);
            }
        }
        return new kzc(strA3, str2, strA, str3, strA2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final nh7 d(nh7 nh7Var) {
        if (nh7Var instanceof ti7) {
            Map map = (Map) nh7Var;
            LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                String str = (String) entry.getKey();
                nh7 nh7Var2 = (nh7) entry.getValue();
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                linkedHashMap.put(key, (f.contains(lowerCase) || a.a(str)) ? oh7.c("[REDACTED]") : d(nh7Var2));
            }
            return new ti7(linkedHashMap);
        }
        if (!(nh7Var instanceof yg7)) {
            if (nh7Var instanceof yi7) {
                yi7 yi7Var = (yi7) nh7Var;
                return yi7Var.d() ? oh7.c(f(yi7Var.c())) : yi7Var;
            }
            ap.c();
            return null;
        }
        Iterable iterable = (Iterable) nh7Var;
        ArrayList arrayList = new ArrayList(t72.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(d((nh7) it.next()));
        }
        return new yg7(arrayList);
    }

    public static final String e(String str) {
        Object dzbVar;
        nh7 nh7VarD;
        String string;
        str.getClass();
        try {
            dzbVar = fzc.a.e(str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        nh7 nh7Var = (nh7) dzbVar;
        return (nh7Var == null || (nh7VarD = d(nh7Var)) == null || (string = nh7VarD.toString()) == null) ? f(str) : string;
    }

    public static final String f(String str) {
        return d.h(c.h(b.h(e.i(str, new fnc(27)), "Bearer [REDACTED]"), "[REDACTED]"), "[REDACTED]");
    }
}
