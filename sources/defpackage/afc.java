package defpackage;

import ai.askquin.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.InputDevice;
import android.view.KeyEvent;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class afc {
    public static gx6 a;

    public static final void a(j09 j09Var, l46 l46Var, int i) {
        j09 j09Var2;
        l46Var.h0(-1238294461);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(0.0f, 6.5f, g09Var, 1);
            String strQ = q(R.string.skin_paywall_tab2, l46Var);
            mue mueVar = oue.a;
            nte.b(strQ, j09VarB0, ((e8b) l46Var.k(l8b.a)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a(l46Var), l46Var, 0, 0, 131064);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new do6(i, 8, j09Var2);
        }
    }

    public static qhf b(String str) {
        String str2 = e1a.b;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new qhf(sb.toString(), str2, "file", null, str);
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        r82.g("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final Object d(jja jjaVar, String str, zn2 zn2Var) {
        Object objD = jjaVar.d(str, new ule(24), zn2Var);
        return objD == bw2.a ? objD : wef.a;
    }

    public static final String e(qhf qhfVar) {
        List listF = f(qhfVar);
        String str = qhfVar.b;
        if (listF.isEmpty()) {
            return null;
        }
        String str2 = qhfVar.e;
        str2.getClass();
        if (!c5e.C(str2, str, false)) {
            str = "";
        }
        return s72.D0(listF, qhfVar.b, str, null, null, 60);
    }

    public static final List f(qhf qhfVar) {
        String str = qhfVar.e;
        if (str == null) {
            return pu4.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iN = v4e.N(str, '/', i2, 4);
            if (iN == -1) {
                iN = str.length();
            }
            String strSubstring = str.substring(i2, iN);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iN;
        }
        return arrayList;
    }

    public static int g(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static final boolean h(KeyEvent keyEvent) {
        InputDevice device = keyEvent.getDevice();
        return (device == null || device.isVirtual() || device.getKeyboardType() != 2 || (keyEvent.getFlags() & 2) == 2) ? false : true;
    }

    public static final boolean i(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    public static final String j(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    y7h.o(0, i2, bArr.length);
                    return new String(bArr, 0, i2, ox1.a);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String strSubstring = str.substring(i + 1, i3);
                    tq.o(16);
                    bArr[i2] = (byte) Integer.parseInt(strSubstring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                    bArr[i2] = (byte) str.charAt(i);
                    i2++;
                    i++;
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static final Class k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return k(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object objL0 = qd0.l0(upperBounds);
            objL0.getClass();
            return k((Type) objL0);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return k(genericComponentType);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        sb.append(" has type ");
        qc0.j(tec.j(job.a, type.getClass(), sb));
        return null;
    }

    public static yea l(d0a d0aVar, boolean z, boolean z2) throws l0a {
        if (z) {
            t(3, d0aVar, false);
        }
        d0aVar.x((int) d0aVar.q(), StandardCharsets.UTF_8);
        long jQ = d0aVar.q();
        String[] strArr = new String[(int) jQ];
        for (int i = 0; i < jQ; i++) {
            strArr[i] = d0aVar.x((int) d0aVar.q(), StandardCharsets.UTF_8);
        }
        if (z2 && (d0aVar.z() & 1) == 0) {
            throw l0a.a(null, "framing bit expected to be set");
        }
        return new yea(strArr);
    }

    public static final xn7 m(hzc hzcVar, Class cls, List list) throws IllegalAccessException, InvocationTargetException {
        xn7[] xn7VarArr = (xn7[]) list.toArray(new xn7[0]);
        xn7 xn7VarC = g21.C(cls, (xn7[]) Arrays.copyOf(xn7VarArr, xn7VarArr.length));
        if (xn7VarC != null) {
            return xn7VarC;
        }
        kob kobVar = job.a;
        em7 em7VarB = kobVar.b(cls);
        xn7 xn7Var = (xn7) kua.a.get(em7VarB);
        if (xn7Var != null) {
            return xn7Var;
        }
        xn7 xn7VarC2 = hzcVar.c(em7VarB, list);
        if (xn7VarC2 != null) {
            return xn7VarC2;
        }
        if (cls.isInterface()) {
            return new aja(kobVar.b(cls));
        }
        return null;
    }

    public static final xn7 n(hzc hzcVar, Type type) {
        hzcVar.getClass();
        type.getClass();
        xn7 xn7VarO = o(hzcVar, type, true);
        if (xn7VarO != null) {
            return xn7VarO;
        }
        Class clsK = k(type);
        clsK.getClass();
        throw new yyc(hkg.D0(job.a.b(clsK)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r7 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r7 == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.xn7 o(defpackage.hzc r7, java.lang.reflect.Type r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afc.o(hzc, java.lang.reflect.Type, boolean):xn7");
    }

    public static final String[] p(int i, l46 l46Var) {
        return ((Resources) l46Var.k(uq.c)).getStringArray(i);
    }

    public static final String q(int i, l46 l46Var) {
        return ((Resources) l46Var.k(uq.c)).getString(i);
    }

    public static final String r(int i, Object[] objArr, l46 l46Var) {
        return ((Resources) l46Var.k(uq.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static qhf s(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = e1a.b;
        String strA = !pa7.t(str2, "/") ? c5e.A(str, str2, "/") : str;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strA.length()) {
            char cCharAt = strA.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (strA.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strA.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strA.substring(0, i6);
            strSubstring = strA.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i3 != -1 ? strA.substring(i3, iMin2) : null;
        String strSubstring4 = i4 != -1 ? strA.substring(i4, iMin) : null;
        String strSubstring5 = i2 != -1 ? strA.substring(i2, strA.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strJ = strSubstring2 != null ? j(strSubstring2, bArr) : null;
        String strJ2 = strSubstring != null ? j(strSubstring, bArr) : null;
        String strJ3 = strSubstring3 != null ? j(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            j(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            j(strSubstring5, bArr);
        }
        return new qhf(strA, str2, strJ, strJ2, strJ3);
    }

    public static boolean t(int i, d0a d0aVar, boolean z) throws l0a {
        if (d0aVar.a() < 7) {
            if (z) {
                return false;
            }
            throw l0a.a(null, "too short header: " + d0aVar.a());
        }
        if (d0aVar.z() != i) {
            if (z) {
                return false;
            }
            throw l0a.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (d0aVar.z() == 118 && d0aVar.z() == 111 && d0aVar.z() == 114 && d0aVar.z() == 98 && d0aVar.z() == 105 && d0aVar.z() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw l0a.a(null, "expected characters 'vorbis'");
    }

    public static void u(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static Object v(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        qc0.p(ks0.l(ib8.o("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }
}
