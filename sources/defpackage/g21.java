package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.share.SharePayload$DrawnCards;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.adjust.sdk.network.ErrorCodes;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import io.sentry.android.core.b1;
import io.sentry.android.navigation.SentryNavigationListener;
import io.sentry.compose.c;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.time.DayOfWeek;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g21 {
    public static final dd2 e;
    public static final ule g;
    public static gx6 h;
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, ErrorCodes.SERVER_RETRY_IN, 1000, 960, 800, 800, 480, Constants.MINIMAL_ERROR_STATUS_CODE, Constants.MINIMAL_ERROR_STATUS_CODE, 2048};
    public static final dd2 b = new dd2(new gd2(10), false, 1862759944);
    public static final dd2 c = new dd2(new yd2(7), false, 864278848);
    public static final dd2 d = new dd2(new ce2(19), false, 32007338);
    public static final y02 f = new y02(4);

    static {
        int i = 25;
        e = new dd2(new de2(i), false, -639760349);
        g = new ule(i);
    }

    public static final boolean A(z17 z17Var) {
        return z17Var.h && !z17Var.d;
    }

    public static final j09 B(j09 j09Var, boolean z, x16 x16Var) {
        j09Var.getClass();
        x16Var.getClass();
        return m93.u(j09Var, new dv(z, x16Var, 2));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    public static final xn7 C(Class cls, xn7... xn7VarArr) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        xn7 xn7Var;
        Field field;
        Object obj2;
        xn7 xn7VarQ;
        Field field2;
        if (cls.isEnum() && cls.getAnnotation(tyc.class) == null && cls.getAnnotation(yia.class) == null) {
            Object[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new wn2(canonicalName, (Enum[]) enumConstants);
        }
        xn7[] xn7VarArr2 = (xn7[]) Arrays.copyOf(xn7VarArr, xn7VarArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        xn7 xn7VarQ2 = obj == null ? null : Q(obj, (xn7[]) Arrays.copyOf(xn7VarArr2, xn7VarArr2.length));
        if (xn7VarQ2 != null) {
            return xn7VarQ2;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 == null || c5e.C(canonicalName2, "java.", false) || c5e.C(canonicalName2, "kotlin.", false)) {
            xn7Var = null;
        } else {
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            Field field3 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Field field4 = declaredFields[i];
                if (pa7.t(field4.getName(), "INSTANCE") && pa7.t(field4.getType(), cls) && Modifier.isStatic(field4.getModifiers())) {
                    if (!z) {
                        z = true;
                        field3 = field4;
                    }
                }
                i++;
                field3 = null;
                break;
            }
            if (field3 == null) {
                xn7Var = null;
            } else {
                Object obj3 = field3.get(null);
                Method[] methods = cls.getMethods();
                methods.getClass();
                int length2 = methods.length;
                Method method = null;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    if (i2 >= length2) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i2];
                    if (pa7.t(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0 && pa7.t(method2.getReturnType(), xn7.class)) {
                            if (!z2) {
                                z2 = true;
                                method = method2;
                            }
                        }
                    }
                    i2++;
                    method = null;
                    break;
                }
                if (method == null) {
                    xn7Var = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof xn7) {
                        xn7Var = (xn7) objInvoke;
                    } else {
                        xn7Var = null;
                    }
                }
            }
        }
        if (xn7Var != null) {
            return xn7Var;
        }
        xn7[] xn7VarArr3 = (xn7[]) Arrays.copyOf(xn7VarArr, xn7VarArr.length);
        Field[] declaredFields2 = cls.getDeclaredFields();
        declaredFields2.getClass();
        int length3 = declaredFields2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                field = null;
                break;
            }
            field = declaredFields2[i3];
            if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(x99.class) != null) {
                break;
            }
            i3++;
        }
        if (field == null) {
            obj2 = null;
        } else {
            try {
                field.setAccessible(true);
                obj2 = field.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (xn7VarQ = Q(obj2, (xn7[]) Arrays.copyOf(xn7VarArr3, xn7VarArr3.length))) == null) {
            try {
                Class<?>[] declaredClasses = cls.getDeclaredClasses();
                declaredClasses.getClass();
                int length4 = declaredClasses.length;
                Class<?> cls2 = null;
                int i4 = 0;
                boolean z3 = false;
                while (true) {
                    if (i4 < length4) {
                        Class<?> cls3 = declaredClasses[i4];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (!z3) {
                                z3 = true;
                                cls2 = cls3;
                            }
                        }
                        i4++;
                    } else if (!z3) {
                    }
                    cls2 = null;
                    break;
                }
                Object obj4 = (cls2 == null || (field2 = cls2.getField("INSTANCE")) == null) ? null : field2.get(null);
                xn7VarQ = obj4 instanceof xn7 ? (xn7) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (xn7VarQ != null) {
            return xn7VarQ;
        }
        if (cls.getAnnotation(yia.class) == null) {
            tyc tycVar = (tyc) cls.getAnnotation(tyc.class);
            if (tycVar == null) {
                return null;
            }
            Class clsWith = tycVar.with();
            kob kobVar = job.a;
            if (!kobVar.b(clsWith).equals(kobVar.b(aja.class))) {
                return null;
            }
        }
        return new aja(job.a.b(cls));
    }

    public static wz D(wz wzVar, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = ((Number) wzVar.b.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f3 = ((xz) wzVar.c).a;
        }
        return new wz(wzVar.a, Float.valueOf(f2), new xz(f3), wzVar.d, wzVar.e, wzVar.f);
    }

    public static final p3f E(n3f n3fVar, Object obj, Object obj2, String str, l46 l46Var, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && l46Var.g(n3fVar)) || (i & 6) == 4;
        Object objR = l46Var.R();
        Object obj3 = sf2.a;
        if (z2 || objR == obj3) {
            objR = new p3f(new o89(obj), n3fVar, ub3.j(n3fVar.c, " > ", str));
            l46Var.p0(objR);
        }
        p3f p3fVar = (p3f) objR;
        if ((i2 <= 4 || !l46Var.g(n3fVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean zG = l46Var.g(p3fVar) | z;
        Object objR2 = l46Var.R();
        if (zG || objR2 == obj3) {
            objR2 = new i2e(15, n3fVar, p3fVar);
            l46Var.p0(objR2);
        }
        af1.g(p3fVar, (a26) objR2, l46Var);
        if (n3fVar.h()) {
            p3fVar.l(obj, obj2);
            return p3fVar;
        }
        p3fVar.s(obj2);
        p3fVar.l.setValue(Boolean.FALSE);
        return p3fVar;
    }

    public static final g3f F(n3f n3fVar, y6f y6fVar, String str, l46 l46Var, int i, int i2) {
        f3f f3fVar;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zG = l46Var.g(n3fVar);
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (zG || objR == obj) {
            objR = new g3f(n3fVar, y6fVar, str);
            l46Var.p0(objR);
        }
        g3f g3fVar = (g3f) objR;
        boolean zG2 = l46Var.g(n3fVar) | l46Var.i(g3fVar);
        Object objR2 = l46Var.R();
        if (zG2 || objR2 == obj) {
            objR2 = new i2e(16, n3fVar, g3fVar);
            l46Var.p0(objR2);
        }
        af1.g(g3fVar, (a26) objR2, l46Var);
        if (n3fVar.h() && (f3fVar = (f3f) g3fVar.b.getValue()) != null) {
            n3f n3fVar2 = g3fVar.c;
            f3fVar.a.i(f3fVar.c.d(n3fVar2.f().b()), f3fVar.c.d(n3fVar2.f().d()), (ze5) f3fVar.b.d(n3fVar2.f()));
        }
        return g3fVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static j6 G(String str, Bundle bundle) throws jf9 {
        bundle.getClass();
        try {
            switch (str.hashCode()) {
                case -1678407252:
                    if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            Object obj = bundle.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            obj.getClass();
                            return obj instanceof byte[] ? new y84(new String((byte[]) obj, ox1.a), bundle, 0) : new y84((String) obj, bundle, 0);
                        } catch (Exception unused) {
                            throw new dz5();
                        }
                    }
                    throw new dz5();
                case -1072734346:
                    if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string = bundle.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string == null) {
                            throw new jf9("The device does not contain a restore credential.");
                        }
                        y84 y84Var = new y84("androidx.credentials.TYPE_RESTORE_CREDENTIAL", bundle);
                        if (string.length() != 0) {
                            try {
                                new JSONObject(string);
                                return y84Var;
                            } catch (Exception unused2) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new dz5();
                case -543568185:
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string3 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            string2.getClass();
                            string3.getClass();
                            return new y84(string3, bundle, 1);
                        } catch (Exception unused3) {
                            throw new dz5();
                        }
                    }
                    throw new dz5();
                case -95037569:
                    if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string4 = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            string4.getClass();
                            return new y84(string4, bundle, 2);
                        } catch (Exception unused4) {
                            throw new dz5();
                        }
                    }
                    throw new dz5();
                default:
                    throw new dz5();
            }
        } catch (dz5 unused5) {
            return new m13(str, bundle);
        }
    }

    public static final k3f H(n3f n3fVar, Object obj, Object obj2, ze5 ze5Var, y6f y6fVar, l46 l46Var, int i) {
        boolean zG = l46Var.g(n3fVar);
        Object objR = l46Var.R();
        Object obj3 = sf2.a;
        if (zG || objR == obj3) {
            ird irdVarJ = iqf.j();
            a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
            ird irdVarL = iqf.l(irdVarJ);
            try {
                b00 b00Var = (b00) y6fVar.a.d(obj2);
                b00Var.d();
                objR = new k3f(n3fVar, obj, b00Var, y6fVar);
                iqf.p(irdVarJ, irdVarL, a26VarE);
                l46Var.p0(objR);
            } catch (Throwable th) {
                iqf.p(irdVarJ, irdVarL, a26VarE);
                throw th;
            }
        }
        k3f k3fVar = (k3f) objR;
        t(n3fVar, k3fVar, obj, obj2, ze5Var, l46Var, 0);
        boolean zG2 = l46Var.g(n3fVar) | l46Var.g(k3fVar);
        Object objR2 = l46Var.R();
        if (zG2 || objR2 == obj3) {
            objR2 = new i2e(18, n3fVar, k3fVar);
            l46Var.p0(objR2);
        }
        af1.g(k3fVar, (a26) objR2, l46Var);
        return k3fVar;
    }

    public static void I(String str, String str2, Object obj) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format(str2, obj));
        }
    }

    public static final j09 J(j09 j09Var) {
        j09Var.getClass();
        return m93.u(j09Var, new a7(6));
    }

    public static void K(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            b1.e(strConcat, str2, exc);
        }
    }

    public static Serializable L(JsonElement jsonElement) {
        if (jsonElement.isJsonObject()) {
            HashMap map = new HashMap();
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            for (String str : asJsonObject.keySet()) {
                map.put(str, L(asJsonObject.get(str)));
            }
            return map;
        }
        if (jsonElement.isJsonArray()) {
            ArrayList arrayList = new ArrayList();
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                arrayList.add(L(it.next()));
            }
            return arrayList;
        }
        if (jsonElement.isJsonNull()) {
            return null;
        }
        if (!jsonElement.isJsonPrimitive()) {
            return jsonElement.toString();
        }
        JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
        if (asJsonPrimitive.isBoolean()) {
            return Boolean.valueOf(asJsonPrimitive.getAsBoolean());
        }
        return asJsonPrimitive.isNumber() ? Double.valueOf(asJsonPrimitive.getAsNumber().doubleValue()) : asJsonPrimitive.getAsString();
    }

    public static final j09 M(l46 l46Var, j09 j09Var) {
        long j;
        j09Var.getClass();
        yv5 yv5Var = bx5.a;
        if (S(l46Var)) {
            l46Var.f0(1152462242);
            j = bx5.b(l46Var).g;
            l46Var.r(false);
        } else {
            l46Var.f0(1152463685);
            j = bx5.b(l46Var).i;
            l46Var.r(false);
        }
        return tm7.n(tm7.o(j09Var, bx5.g(l46Var), f), gec.O(new iy9[]{new iy9(Float.valueOf(0.0f), new y72(j)), new iy9(Float.valueOf(pa7.t(bx5.b(l46Var), bx5.b) ? 0.5f : 0.0f), new y72(j)), new iy9(Float.valueOf(1.0f), new y72(y72.b(j, 0.0f)))}, 0.0f, 0.0f, 14), null, 6);
    }

    public static void N(int i, d0a d0aVar) {
        d0aVar.J(7);
        byte[] bArr = d0aVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static final Object O(tn8 tn8Var) {
        Object objE = tn8Var.E();
        gv7 gv7Var = objE instanceof gv7 ? (gv7) objE : null;
        if (gv7Var != null) {
            return gv7Var.Z;
        }
        return null;
    }

    public static j09 P(j09 j09Var, ii6 ii6Var) {
        j09Var.getClass();
        return j09Var.D(new ei6(ii6Var));
    }

    public static final xn7 Q(Object obj, xn7... xn7VarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (xn7VarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = xn7VarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = xn7.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(xn7VarArr, xn7VarArr.length));
            if (objInvoke instanceof xn7) {
                return (xn7) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean R(d18 d18Var, int i) {
        return i <= d18Var.e() && d18Var.c() <= i;
    }

    public static final boolean S(l46 l46Var) {
        return ((double) abg.T(((m82) l46Var.k(o82.a)).p)) > 0.5d;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static e6 T(zu1 zu1Var) {
        int i;
        int i2;
        int iG = zu1Var.g(16);
        int iG2 = zu1Var.g(16);
        if (iG2 == 65535) {
            iG2 = zu1Var.g(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iG2 + i;
        if (iG == 44097) {
            i3 += 2;
        }
        if (zu1Var.g(2) == 3) {
            do {
                zu1Var.g(2);
            } while (zu1Var.f());
        }
        int iG3 = zu1Var.g(10);
        if (zu1Var.f() && zu1Var.g(3) > 0) {
            zu1Var.o(2);
        }
        int i4 = zu1Var.f() ? 48000 : 44100;
        int iG4 = zu1Var.g(4);
        int[] iArr = a;
        if (i4 == 44100 && iG4 == 13) {
            i2 = iArr[iG4];
        } else if (i4 != 48000 || iG4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iG4];
            int i6 = iG3 % 5;
            if (i6 == 1) {
                if (iG4 != 3 || iG4 == 8) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (i6 != 2) {
                if (i6 == 3) {
                    if (iG4 != 3) {
                    }
                    i2 = i5 + 1;
                } else if (i6 == 4 && (iG4 == 3 || iG4 == 8 || iG4 == 11)) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (iG4 == 8 || iG4 == 11) {
                i2 = i5 + 1;
            } else {
                i2 = i5;
            }
        }
        return new e6(i4, i3, i2);
    }

    public static void U(zu1 zu1Var, d6 d6Var) throws l0a {
        int iG = zu1Var.g(5);
        zu1Var.o(2);
        if (zu1Var.f()) {
            zu1Var.o(5);
        }
        if (iG >= 7 && iG <= 10) {
            zu1Var.n();
        }
        if (zu1Var.f()) {
            int iG2 = zu1Var.g(3);
            if (d6Var.b == -1 && iG >= 0 && iG <= 15 && (iG2 == 0 || iG2 == 1)) {
                d6Var.b = iG;
            }
            if (zu1Var.f()) {
                f0(zu1Var);
            }
        }
    }

    public static void V(zu1 zu1Var, d6 d6Var) throws l0a {
        zu1Var.o(2);
        boolean zF = zu1Var.f();
        int iG = zu1Var.g(8);
        for (int i = 0; i < iG; i++) {
            zu1Var.o(2);
            if (zu1Var.f()) {
                zu1Var.o(5);
            }
            if (zF) {
                zu1Var.o(24);
            } else {
                if (zu1Var.f()) {
                    if (!zu1Var.f()) {
                        zu1Var.o(4);
                    }
                    d6Var.c = zu1Var.g(6) + 1;
                }
                zu1Var.o(4);
            }
        }
        if (zu1Var.f()) {
            zu1Var.o(3);
            if (zu1Var.f()) {
                f0(zu1Var);
            }
        }
    }

    public static final bx9 W(xw9 xw9Var, xw9 xw9Var2, l46 l46Var) {
        xw9Var.getClass();
        cv7 cv7Var = (cv7) l46Var.k(zg2.n);
        return new bx9(ynb.B(xw9Var2, cv7Var) + ynb.B(xw9Var, cv7Var), xw9Var2.d() + xw9Var.d(), ynb.A(xw9Var2, cv7Var) + ynb.A(xw9Var, cv7Var), xw9Var2.a() + xw9Var.a());
    }

    public static final long X(z17 z17Var, ks9 ks9Var, y17 y17Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = z17Var.g;
        if (ks9Var != null) {
            int i = y17Var.a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (ks9Var == ks9.b) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jF = hl9.f(Y(z17Var, ks9Var, y17Var), j2);
        if (z || !z17Var.i) {
            return jF;
        }
        return 0L;
    }

    public static final long Y(z17 z17Var, ks9 ks9Var, y17 y17Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (ks9Var == null) {
            return z17Var.c;
        }
        int i = y17Var.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (z17Var.c >> 32));
        } else {
            if (i != 2) {
                return z17Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (z17Var.c & 4294967295L));
        }
        if (ks9Var == ks9.b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static final n69 Z(ghc ghcVar, l46 l46Var) {
        ghcVar.getClass();
        float fP0 = ((sw3) l46Var.k(zg2.h)).p0(50.0f);
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = new qz9(0.0f);
            l46Var.p0(objR);
        }
        n69 n69Var = (n69) objR;
        boolean zG = l46Var.g(ghcVar) | l46Var.d(fP0);
        Object objR2 = l46Var.R();
        if (zG || objR2 == i8cVar) {
            objR2 = new cd2(ghcVar, fP0, n69Var, null);
            l46Var.p0(objR2);
        }
        af1.o((l26) objR2, l46Var, wef.a);
        return n69Var;
    }

    public static wz a(float f2, float f3, int i) {
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        return new wz(xo1.g, Float.valueOf(f2), new xz(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final r91 a0(YearMonth yearMonth, YearMonth yearMonth2, YearMonth yearMonth3, DayOfWeek dayOfWeek, l46 l46Var, int i) {
        if ((i & 1) != 0) {
            yearMonth = YearMonth.now();
            yearMonth.getClass();
        }
        if ((i & 2) != 0) {
            yearMonth2 = yearMonth;
        }
        if ((i & 4) != 0) {
            yearMonth3 = yearMonth;
        }
        if ((i & 8) != 0) {
            dayOfWeek = tq.y();
        }
        ps9 ps9Var = ps9.a;
        Object[] objArr = {yearMonth, yearMonth2, yearMonth3, dayOfWeek, ps9Var};
        vea veaVar = r91.j;
        boolean zE = l46Var.e(ps9Var.ordinal()) | l46Var.i(yearMonth) | l46Var.i(yearMonth2) | l46Var.e(dayOfWeek.ordinal()) | l46Var.i(yearMonth3);
        Object objR = l46Var.R();
        if (zE || objR == sf2.a) {
            objR = new jr(yearMonth, yearMonth2, dayOfWeek, yearMonth3);
            l46Var.p0(objR);
        }
        return (r91) vfh.J(objArr, veaVar, (x16) objR, l46Var, 0);
    }

    public static vw3 b() {
        return new vw3(1.0f, 1.0f);
    }

    public static final ii6 b0(l46 l46Var) {
        y02 y02Var = th6.a;
        boolean z = Build.VERSION.SDK_INT >= 31;
        Object objR = l46Var.R();
        if (objR == sf2.a) {
            objR = new ii6(z);
            l46Var.p0(objR);
        }
        ii6 ii6Var = (ii6) objR;
        ii6Var.b.setValue(Boolean.valueOf(z));
        return ii6Var;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0283  */
    /* JADX WARN: Code duplicated, block: B:113:0x0287  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:119:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x033f  */
    public static final void c(sdd sddVar, j09 j09Var, int i, oz ozVar, a26 a26Var, l26 l26Var, x16 x16Var, l46 l46Var, int i2) {
        int i3;
        mue mueVarA;
        i8c i8cVar;
        i8c i8cVar2;
        Object objR;
        int i4;
        Object objR2;
        boolean z;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1256951160);
        if ((i2 & 6) == 0) {
            i3 = (l46Var2.g(sddVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.g(j09Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.e(i) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? l46Var2.g(ozVar) : l46Var2.i(ozVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? l46Var2.g(a26Var) : l46Var2.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i3 |= l46Var2.i(l26Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= l46Var2.i(x16Var) ? 1048576 : 524288;
        }
        if (l46Var2.W(i3 & 1, (599187 & i3) != 599186)) {
            Object objR3 = l46Var2.R();
            i8c i8cVar3 = sf2.a;
            if (objR3 == i8cVar3) {
                objR3 = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR3);
            }
            e89 e89Var = (e89) objR3;
            Object objR4 = l46Var2.R();
            if (objR4 == i8cVar3) {
                objR4 = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR4);
            }
            e89 e89Var2 = (e89) objR4;
            Object objR5 = l46Var2.R();
            if (objR5 == i8cVar3) {
                objR5 = af1.E(l46Var2);
                l46Var2.p0(objR5);
            }
            aw2 aw2Var = (aw2) objR5;
            Object objR6 = l46Var2.R();
            if (objR6 == i8cVar3) {
                objR6 = q1c.f(null);
                l46Var2.p0(objR6);
            }
            e89 e89Var3 = (e89) objR6;
            float f2 = ((Boolean) e89Var.getValue()).booleanValue() ? 180.0f : 0.0f;
            x6f x6fVarT = b21.T(1000, 0, null, 6);
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 458752) == 131072);
            Object objR7 = l46Var2.R();
            if (z2 || objR7 == i8cVar3) {
                objR7 = new g01(e89Var3, l26Var, i, 2);
                l46Var2.p0(objR7);
            }
            h0e h0eVarB = vx.b(f2, x6fVarT, "selected_card_rotation", (a26) objR7, l46Var2, 3120, 4);
            String strQ = afc.q(R.string.network_common_error, l46Var2);
            if (k8b.f((e8b) l46Var2.k(l8b.a))) {
                l46Var2.f0(-1986955539);
                mue mueVar = pue.a;
                mueVarA = pue.n(l46Var2);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1986919548);
                mue mueVar2 = pue.a;
                mueVarA = mue.a(pue.n(l46Var2), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183);
                l46Var2.r(false);
            }
            mue mueVar3 = mueVarA;
            c92 c92VarA = a92.a(new uc0(8.0f, false, new jv2(2, ndb.X)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z3 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            jw7 jw7Var = new jw7(1.0f, true);
            boolean zG = l46Var2.g(h0eVarB);
            Object objR8 = l46Var2.R();
            if (zG) {
                i8cVar = i8cVar3;
            } else {
                i8cVar = i8cVar3;
                if (objR8 == i8cVar) {
                }
                i8cVar2 = i8cVar;
                nk8.d(bzd.x(jw7Var, (a26) objR8), ndb.f, af1.b0(-1439419348, new gj3(sddVar, i, ozVar, h0eVarB, e89Var3), l46Var2), l46Var2, 3120, 4);
                j09 j09VarD0 = ynb.d0(24.0f, 0.0f, 24.0f, 24.0f, 2, b.d(b.c(g09.a, 1.0f), 148.0f));
                xn8 xn8VarC = s21.c(ndb.c, false);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarD0);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, xn8VarC);
                dec.l(he2Var2, l46Var2, u8aVarM2);
                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ2);
                boolean z4 = !((Boolean) e89Var2.getValue()).booleanValue();
                x6f x6fVarT2 = b21.T(300, 100, null, 4);
                objR = l46Var2.R();
                i4 = 5;
                if (objR == i8cVar2) {
                    objR = new hl4(i4);
                    l46Var2.p0(objR);
                }
                cx4 cx4VarA = rw4.m(x6fVarT2, (a26) objR).a(rw4.f(b21.T(300, 100, null, 4), 2));
                x6f x6fVarT3 = b21.T(200, 0, null, 6);
                objR2 = l46Var2.R();
                if (objR2 == i8cVar2) {
                    objR2 = new hl4(i4);
                    l46Var2.p0(objR2);
                }
                f45 f45VarA = rw4.o(x6fVarT3, (a26) objR2).a(rw4.g(b21.T(200, 0, null, 6), 2));
                dd2 dd2VarB0 = af1.b0(-229621084, new n53(aw2Var, sddVar, a26Var, strQ, x16Var, e89Var2, e89Var3, e89Var), l46Var2);
                l46Var2 = l46Var2;
                m93.d(z4, null, cx4VarA, f45VarA, null, dd2VarB0, l46Var2, 196608, 18);
                if (((Number) h0eVarB.getValue()).floatValue() > 90.0f || ((TarotCardChoice) e89Var3.getValue()) == null) {
                    z = false;
                } else {
                    z = true;
                }
                m93.d(z, null, rw4.f(b21.T(200, 0, null, 6), 2), null, null, af1.b0(1607992141, new w7(18, e89Var3, mueVar3), l46Var2), l46Var2, 196992, 26);
                l46Var2.r(true);
                l46Var2.r(true);
            }
            objR8 = new wh1(6, h0eVarB);
            l46Var2.p0(objR8);
            i8cVar2 = i8cVar;
            nk8.d(bzd.x(jw7Var, (a26) objR8), ndb.f, af1.b0(-1439419348, new gj3(sddVar, i, ozVar, h0eVarB, e89Var3), l46Var2), l46Var2, 3120, 4);
            j09 j09VarD1 = ynb.d0(24.0f, 0.0f, 24.0f, 24.0f, 2, b.d(b.c(g09.a, 1.0f), 148.0f));
            xn8 xn8VarC2 = s21.c(ndb.c, false);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarD1);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC2);
            dec.l(he2Var2, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ3);
            boolean z5 = !((Boolean) e89Var2.getValue()).booleanValue();
            x6f x6fVarT4 = b21.T(300, 100, null, 4);
            objR = l46Var2.R();
            i4 = 5;
            if (objR == i8cVar2) {
                objR = new hl4(i4);
                l46Var2.p0(objR);
            }
            cx4 cx4VarA2 = rw4.m(x6fVarT4, (a26) objR).a(rw4.f(b21.T(300, 100, null, 4), 2));
            x6f x6fVarT5 = b21.T(200, 0, null, 6);
            objR2 = l46Var2.R();
            if (objR2 == i8cVar2) {
                objR2 = new hl4(i4);
                l46Var2.p0(objR2);
            }
            f45 f45VarA2 = rw4.o(x6fVarT5, (a26) objR2).a(rw4.g(b21.T(200, 0, null, 6), 2));
            dd2 dd2VarB1 = af1.b0(-229621084, new n53(aw2Var, sddVar, a26Var, strQ, x16Var, e89Var2, e89Var3, e89Var), l46Var2);
            l46Var2 = l46Var2;
            m93.d(z5, null, cx4VarA2, f45VarA2, null, dd2VarB1, l46Var2, 196608, 18);
            if (((Number) h0eVarB.getValue()).floatValue() > 90.0f) {
                z = false;
            } else {
                z = false;
            }
            m93.d(z, null, rw4.f(b21.T(200, 0, null, 6), 2), null, null, af1.b0(1607992141, new w7(18, e89Var3, mueVar3), l46Var2), l46Var2, 196992, 26);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fr1(sddVar, j09Var, i, ozVar, a26Var, l26Var, x16Var, i2);
        }
    }

    public static final b41 c0(boolean z, l46 l46Var) {
        b68 b68VarD;
        boolean zH = l46Var.h(z);
        Object objR = l46Var.R();
        if (zH || objR == sf2.a) {
            if (z) {
                long j = y72.e;
                b68VarD = gec.D(t72.I(new y72(j), new y72(y72.b(j, 0.2f)), new y72(j)));
            } else {
                long j2 = y72.e;
                b68VarD = gec.D(t72.I(new y72(y72.b(j2, 0.2f)), new y72(y72.b(j2, 0.14f)), new y72(y72.b(j2, 0.2f))));
            }
            objR = b68VarD;
            l46Var.p0(objR);
        }
        return (b41) objR;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(e89 e89Var, a26 a26Var, e89 e89Var2, e89 e89Var3, String str, zn2 zn2Var) {
        lp4 lp4Var;
        Object dzbVar;
        if (zn2Var instanceof lp4) {
            lp4Var = (lp4) zn2Var;
            int i = lp4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lp4Var.label = i - Integer.MIN_VALUE;
            } else {
                lp4Var = new lp4(zn2Var);
            }
        } else {
            lp4Var = new lp4(zn2Var);
        }
        Object objD = lp4Var.result;
        int i2 = lp4Var.label;
        try {
            if (i2 == 0) {
                jzb.q(objD);
                e89Var.setValue(Boolean.TRUE);
                lp4Var.L$0 = null;
                lp4Var.L$1 = e89Var;
                lp4Var.L$2 = null;
                lp4Var.L$3 = e89Var2;
                lp4Var.L$4 = e89Var3;
                lp4Var.L$5 = str;
                lp4Var.L$6 = null;
                lp4Var.label = 1;
                objD = a26Var.d(lp4Var);
                Object obj = bw2.a;
                if (objD == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) lp4Var.L$5;
                e89Var3 = (e89) lp4Var.L$4;
                e89Var2 = (e89) lp4Var.L$3;
                e89Var = (e89) lp4Var.L$1;
                jzb.q(objD);
            }
            dzbVar = (TarotCardChoice) objD;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (!(dzbVar instanceof dzb)) {
            e89Var2.setValue((TarotCardChoice) dzbVar);
            e89Var3.setValue(Boolean.TRUE);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            e89Var.setValue(Boolean.FALSE);
            String message = thA.getMessage();
            if (message != null) {
                str = message;
            }
            jcc.l(str);
        }
        return wef.a;
    }

    public static final cb9 d0(fc9[] fc9VarArr, l46 l46Var) {
        Context context = (Context) l46Var.k(uq.b);
        Object[] objArrCopyOf = Arrays.copyOf(fc9VarArr, fc9VarArr.length);
        int i = 0;
        vea veaVar = new vea(7, new db9(i), new i06(context, 3));
        boolean zI = l46Var.i(context);
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (zI || objR == obj) {
            objR = new u8(context, 25);
            l46Var.p0(objR);
        }
        cb9 cb9Var = (cb9) vfh.K(objArrCopyOf, veaVar, (x16) objR, l46Var, 0, 4);
        int length = fc9VarArr.length;
        while (i < length) {
            cb9Var.b.s.a(fc9VarArr[i]);
            i++;
        }
        cb9Var.getClass();
        Boolean bool = Boolean.TRUE;
        e89 e89VarI = q1c.i(new SentryNavigationListener(((Boolean) q1c.i(bool, l46Var).getValue()).booleanValue(), ((Boolean) q1c.i(bool, l46Var).getValue()).booleanValue()), l46Var);
        pr4 pr4Var = uq.a;
        h48 h48VarK = ((x48) l46Var.k(cb8.a)).k();
        boolean zI2 = l46Var.i(cb9Var) | l46Var.g(e89VarI) | l46Var.i(h48VarK);
        Object objR2 = l46Var.R();
        if (zI2 || objR2 == obj) {
            objR2 = new c(cb9Var, h48VarK, e89VarI);
            l46Var.p0(objR2);
        }
        af1.h(h48VarK, cb9Var, (a26) objR2, l46Var);
        return cb9Var;
    }

    public static final void e(sdd sddVar, j09 j09Var, xw9 xw9Var, Integer num, boolean z, a26 a26Var, l26 l26Var, x16 x16Var, l46 l46Var, int i) {
        int i2;
        j09 j09Var2;
        a26Var.getClass();
        l26Var.getClass();
        x16Var.getClass();
        l46Var.h0(-1145533537);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(sddVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= l46Var.g(xw9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i3 |= l46Var.g(num) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i3 |= l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i3 |= (262144 & i) == 0 ? l46Var.g(a26Var) : l46Var.i(a26Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= l46Var.i(l26Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= l46Var.i(x16Var) ? 8388608 : 4194304;
        }
        if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(num);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            boolean z2 = (i3 & 7168) == 2048;
            Object objR2 = l46Var.R();
            if (z2 || objR2 == i8cVar) {
                objR2 = new mp4(num, e89Var, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, num);
            Integer num2 = num == null ? (Integer) e89Var.getValue() : num;
            g09 g09Var = g09.a;
            m93.d(z, fdc.w(g09Var, 10.0f).D(b.c), rw4.f(null, 3), rw4.g(b21.T(200, 0, null, 6), 2), null, af1.b0(1331433927, new qi3(num2, sddVar, xw9Var, a26Var, l26Var, x16Var, 2), l46Var), l46Var, ((i3 >> 12) & 14) | 200064, 16);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cc(sddVar, j09Var2, xw9Var, num, z, a26Var, l26Var, x16Var, i);
        }
    }

    public static final n3f e0(s3f s3fVar, String str, l46 l46Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && l46Var.g(s3fVar)) || (i & 6) == 4;
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (z2 || objR == obj) {
            ird irdVarJ = iqf.j();
            a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
            ird irdVarL = iqf.l(irdVarJ);
            try {
                Object p3fVar = new p3f(s3fVar, null, str);
                iqf.p(irdVarJ, irdVarL, a26VarE);
                l46Var.p0(p3fVar);
                objR = p3fVar;
            } catch (Throwable th) {
                iqf.p(irdVarJ, irdVarL, a26VarE);
                throw th;
            }
        }
        n3f n3fVar = (n3f) objR;
        if (s3fVar instanceof ltc) {
            l46Var.f0(-1357398105);
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = af1.E(l46Var);
                l46Var.p0(objR2);
            }
            Object obj2 = (aw2) objR2;
            boolean zI = l46Var.i(obj2) | ((i3 > 4 && l46Var.g(s3fVar)) || (i & 6) == 4);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj) {
                objR3 = new i2e(14, s3fVar, obj2);
                l46Var.p0(objR3);
            }
            af1.g(obj2, (a26) objR3, l46Var);
            ltc ltcVar = (ltc) s3fVar;
            Object value = ltcVar.c.getValue();
            Object value2 = ltcVar.b.getValue();
            if ((i3 <= 4 || !l46Var.g(s3fVar)) && (i & 6) != 4) {
                z = false;
            }
            Object objR4 = l46Var.R();
            if (z || objR4 == obj) {
                objR4 = new r3f(s3fVar, null);
                l46Var.p0(objR4);
            }
            af1.p(value, value2, (l26) objR4, l46Var);
            l46Var.r(false);
        } else {
            l46Var.f0(-1356407283);
            n3fVar.a(s3fVar.b(), l46Var, 0);
            l46Var.r(false);
        }
        boolean zG = l46Var.g(n3fVar);
        Object objR5 = l46Var.R();
        if (zG || objR5 == obj) {
            objR5 = new trd(20, n3fVar);
            l46Var.p0(objR5);
        }
        af1.g(n3fVar, (a26) objR5, l46Var);
        return n3fVar;
    }

    public static final void f(SharePayload$DrawnCards sharePayload$DrawnCards, String str, x16 x16Var, l46 l46Var, int i) {
        int i2;
        sharePayload$DrawnCards.getClass();
        str.getClass();
        x16Var.getClass();
        l46Var.h0(51231005);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(sharePayload$DrawnCards) : l46Var.i(sharePayload$DrawnCards) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new x6d(xad.Screenshot, str, t72.H(e8d.Screenshot));
                l46Var.p0(objR);
            }
            t4c.e(null, sharePayload$DrawnCards.getDivinationId(), (x6d) objR, new ie2(14), x16Var, af1.b0(993125754, new wt(3, sharePayload$DrawnCards), l46Var), l46Var, 197120 | ((i2 << 6) & 57344), 1);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i, sharePayload$DrawnCards, str, x16Var, 17);
        }
    }

    public static void f0(zu1 zu1Var) throws l0a {
        int iG = zu1Var.g(6);
        if (iG < 2 || iG > 42) {
            throw l0a.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iG)));
        }
        zu1Var.o(iG * 8);
    }

    public static final void g(final List list, final l26 l26Var, l46 l46Var, int i) {
        l46Var.h0(-1555577062);
        int i2 = (l46Var.g(list) ? 4 : 2) | i | (l46Var.i(l26Var) ? 32 : 16);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            boolean z = list.size() <= 4;
            final int iO = mh3.o(list.size(), 1, 4);
            final float f2 = iO < 4 ? 16.0f : 8.0f;
            g09 g09Var = g09.a;
            j09 j09VarA0 = ynb.a0(b.c(g09Var, 1.0f), 24.0f, z ? 40.0f : 32.0f);
            c92 c92VarA = a92.a(new uc0(z ? 32.0f : 24.0f, true, new qc0(i3)), ndb.Z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            mh3.a(ib8.f(((e8b) l46Var.k(l8b.a)).q, em2.a), ynb.e, l46Var, 56);
            nk8.d(b.c(g09Var, 1.0f), null, af1.b0(-1062202674, new n26() { // from class: qp4
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    int i4;
                    qp4 qp4Var = this;
                    he2 he2Var = hj6.x;
                    he2 he2Var2 = hj6.X;
                    he2 he2Var3 = hj6.y;
                    he2 he2Var4 = hj6.z;
                    e31 e31Var = (e31) obj;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                    }
                    boolean z2 = true;
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fD = e31Var.d();
                        int i5 = iO;
                        float f3 = f2;
                        float f4 = (fD - ((i5 - 1) * f3)) / i5;
                        if (i5 == 1) {
                            yi4 yi4Var = new yi4(f4);
                            yi4 yi4Var2 = new yi4(200.0f);
                            if (yi4Var.compareTo(yi4Var2) > 0) {
                                yi4Var = yi4Var2;
                            }
                            f4 = yi4Var.a;
                        }
                        c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        g09 g09Var2 = g09.a;
                        j09 j09VarJ2 = m93.J(l46Var2, g09Var2);
                        lf2.q.getClass();
                        l46Var2.j0();
                        boolean z3 = l46Var2.S;
                        ov7 ov7Var = LayoutNode.h1;
                        if (z3) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var4, l46Var2, c92VarA2);
                        dec.l(he2Var3, l46Var2, u8aVarM2);
                        ib8.s(iHashCode2, l46Var2, he2Var2, l46Var2);
                        dec.l(he2Var, l46Var2, j09VarJ2);
                        l46Var2.f0(1492454808);
                        int i6 = 0;
                        for (Object obj4 : s72.p1(list, 4, 4, true)) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                t72.Z();
                                throw null;
                            }
                            List list2 = (List) obj4;
                            j09 j09VarC = b.c(g09Var2, 1.0f);
                            int i8 = i6;
                            t7c t7cVarA = s7c.a(new uc0(f3, true, new jv2(3, ndb.Z)), ndb.y, l46Var2, 0);
                            int iHashCode3 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM3 = l46Var2.m();
                            j09 j09VarJ3 = m93.J(l46Var2, j09VarC);
                            lf2.q.getClass();
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var4, l46Var2, t7cVarA);
                            dec.l(he2Var3, l46Var2, u8aVarM3);
                            ib8.s(iHashCode3, l46Var2, he2Var2, l46Var2);
                            Iterator itS = kv2.s(l46Var2, j09VarJ3, he2Var, -882128895, list2);
                            int i9 = 0;
                            while (itS.hasNext()) {
                                Object next = itS.next();
                                int i10 = i9 + 1;
                                if (i9 < 0) {
                                    t72.Z();
                                    throw null;
                                }
                                TarotCardChoice tarotCardChoice = (TarotCardChoice) next;
                                j09 j09VarP = b.p(g09Var2, f4);
                                l26 l26Var2 = l26Var;
                                int i11 = i8;
                                boolean zG = l46Var2.g(l26Var2) | l46Var2.e(i11) | l46Var2.e(i9);
                                Object objR = l46Var2.R();
                                if (zG || objR == sf2.a) {
                                    i4 = 0;
                                    objR = new rp4(l26Var2, i11, i9, i4);
                                    l46Var2.p0(objR);
                                } else {
                                    i4 = 0;
                                }
                                b21.d(j09VarP, tarotCardChoice, false, null, (a26) objR, 0.0f, null, null, l46Var2, 196608, 204);
                                qp4Var = this;
                                i9 = i10;
                                f3 = f3;
                                ov7Var = ov7Var;
                                i8 = i11;
                                g09Var2 = g09Var2;
                            }
                            l46Var2.r(false);
                            l46Var2.r(true);
                            qp4Var = this;
                            z2 = true;
                            i6 = i7;
                        }
                        l46Var2.r(false);
                        l46Var2.r(z2);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 3078, 6);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o14(list, l26Var, i, 14);
        }
    }

    public static final int g0(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static final void h(SharePayload$DrawnCards sharePayload$DrawnCards, a26 a26Var, l46 l46Var, int i) {
        int i2;
        l46 l46Var2;
        boolean z;
        sharePayload$DrawnCards.getClass();
        l46Var.h0(-350412263);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(sharePayload$DrawnCards) : l46Var.i(sharePayload$DrawnCards) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(a26Var) ? 32 : 16;
        }
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            dd2 dd2VarB0 = af1.b0(1470906266, new sp4(sharePayload$DrawnCards, a26Var, i3), l46Var);
            if (zF) {
                l46Var.f0(1934404141);
                l46Var.r(false);
                z = false;
            } else {
                l46Var.f0(-1738715224);
                z = !S(l46Var);
                l46Var.r(false);
            }
            if (z) {
                l46Var.f0(1934421196);
                l46Var2 = l46Var;
                o7c.a(false, null, dd2VarB0, l46Var2, 390, 2);
                l46Var2.r(false);
            } else {
                l46Var2 = l46Var;
                l46Var2.f0(1934486358);
                dd2VarB0.z(l46Var2, 6);
                l46Var2.r(false);
            }
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tp4(sharePayload$DrawnCards, a26Var, i, i3);
        }
    }

    public static final n3f h0(o89 o89Var, String str, l46 l46Var, int i) {
        return e0(o89Var, str, l46Var, i & 126, 0);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    public static final void i(final SharePayload$DrawnCards sharePayload$DrawnCards, final a26 a26Var, x16 x16Var, l46 l46Var, int i) {
        x16 x16Var2;
        String tarotCardDesc;
        String name;
        a26 a26Var2;
        e89 e89Var;
        l46Var.h0(-939314306);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? l46Var.g(sharePayload$DrawnCards) : l46Var.i(sharePayload$DrawnCards) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= l46Var.i(a26Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            x16Var2 = x16Var;
            i2 |= l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            x16Var2 = x16Var;
        }
        final boolean z = true;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            final boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            final TarotSkinIdentify tarotSkinIdentify = ((die) l46Var.k(snd.a)).a;
            boolean z2 = (i2 & 14) == 4 || ((i2 & 8) != 0 && l46Var.g(sharePayload$DrawnCards));
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            Object obj = objR;
            if (z2 || objR == i8cVar) {
                List<TarotCardChoice> cards = sharePayload$DrawnCards.getCards();
                ArrayList arrayList = new ArrayList(t72.u(cards, 10));
                int i3 = 0;
                for (Object obj2 : cards) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        t72.Z();
                        throw null;
                    }
                    TarotCardChoice tarotCardChoice = (TarotCardChoice) obj2;
                    PatternData patternData = (PatternData) s72.y0(i3, sharePayload$DrawnCards.getPatternData());
                    if (patternData == null || (name = patternData.getName()) == null) {
                        tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                    } else {
                        tarotCardDesc = v4e.Q(name) ? null : name;
                        if (tarotCardDesc == null) {
                            tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                        }
                    }
                    arrayList.add(TarotCardChoice.copy$default(tarotCardChoice, null, false, tarotCardDesc, 3, null));
                    i3 = i4;
                }
                l46Var.p0(arrayList);
                obj = arrayList;
            }
            final List list = (List) obj;
            boolean zG = l46Var.g(list) | l46Var.e(tarotSkinIdentify.ordinal());
            Object objR2 = l46Var.R();
            if (zG || objR2 == i8cVar) {
                objR2 = q1c.f(xu4.a);
                l46Var.p0(objR2);
            }
            final e89 e89Var2 = (e89) objR2;
            boolean zG2 = l46Var.g(list) | l46Var.e(tarotSkinIdentify.ordinal());
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == i8cVar) {
                objR3 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR3);
            }
            e89 e89Var3 = (e89) objR3;
            if (((Set) e89Var2.getValue()).size() != list.size() || ((Boolean) e89Var3.getValue()).booleanValue()) {
                z = false;
            }
            a26 a26Var3 = (a26) l46Var.k(sad.d);
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean bool = (Boolean) e89Var3.getValue();
            bool.getClass();
            boolean zG3 = l46Var.g(a26Var3) | l46Var.g(e89Var3) | ((i2 & 896) == 256) | l46Var.h(z);
            Object objR4 = l46Var.R();
            if (zG3 || objR4 == i8cVar) {
                a26Var2 = a26Var3;
                e89Var = e89Var3;
                objR4 = new vp4(a26Var2, x16Var2, z, e89Var, null);
                l46Var.p0(objR4);
            } else {
                a26Var2 = a26Var3;
                e89Var = e89Var3;
            }
            af1.q(boolValueOf, bool, a26Var2, (l26) objR4, l46Var);
            boolean zH = l46Var.h(zF);
            Object objR5 = l46Var.R();
            if (zH || objR5 == i8cVar) {
                objR5 = q1c.f(Boolean.valueOf(zF));
                l46Var.p0(objR5);
            }
            final e89 e89Var4 = (e89) objR5;
            final boolean zBooleanValue = ((Boolean) l46Var.k(sad.b)).booleanValue();
            final int iIntValue = ((Number) l46Var.k(sad.c)).intValue();
            final e89 e89Var5 = e89Var;
            s(392.0f, af1.b0(-911087194, new l26() { // from class: up4
                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    l46 l46Var2 = (l46) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        j09 j09VarC = b.c(g09.a, 1.0f);
                        e89 e89Var6 = e89Var2;
                        List listI = t72.I(sharePayload$DrawnCards, tarotSkinIdentify, (Set) e89Var6.getValue());
                        boolean zS = g21.S(l46Var2);
                        boolean z3 = zBooleanValue;
                        e89 e89Var7 = e89Var4;
                        boolean z4 = z3 && ((Boolean) e89Var7.getValue()).booleanValue() && z;
                        a26 a26Var4 = a26Var;
                        boolean zG4 = l46Var2.g(a26Var4);
                        Object objR6 = l46Var2.R();
                        i8c i8cVar2 = sf2.a;
                        if (zG4 || objR6 == i8cVar2) {
                            objR6 = new k50(a26Var4, 7);
                            l46Var2.p0(objR6);
                        }
                        j09 j09VarA = d8d.a(iIntValue, (l26) objR6, j09VarC, listI, "drawn_cards", zS, z4, true);
                        List list2 = list;
                        x82 x82Var = list2.size() <= 4 ? x82.b : x82.a;
                        boolean zG5 = l46Var2.g(e89Var7);
                        Object objR7 = l46Var2.R();
                        if (zG5 || objR7 == i8cVar2) {
                            objR7 = new pg(e89Var7, 26);
                            l46Var2.p0(objR7);
                        }
                        h7d.f(j09VarA, x82Var, 0.2f, 0.0f, (a26) objR7, af1.b0(740488774, new ck(zF, list2, e89Var6, e89Var5, 4), l46Var2), l46Var2, 200064, 0);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 54);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i, sharePayload$DrawnCards, a26Var, x16Var, 18);
        }
    }

    public static final p3f i0(Object obj, String str, l46 l46Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = new p3f(new o89(obj), null, str);
            l46Var.p0(objR);
        }
        p3f p3fVar = (p3f) objR;
        p3fVar.a(obj, l46Var, (i & 8) | 48 | (i & 14));
        Object objR2 = l46Var.R();
        if (objR2 == i8cVar) {
            objR2 = new trd(21, p3fVar);
            l46Var.p0(objR2);
        }
        af1.g(p3fVar, (a26) objR2, l46Var);
        return p3fVar;
    }

    public static final void j(SharePayload$DrawnCards sharePayload$DrawnCards, a26 a26Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(1992160710);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(sharePayload$DrawnCards) : l46Var.i(sharePayload$DrawnCards) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(a26Var) ? 32 : 16;
        }
        int i4 = 1;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            TarotSkinIdentify tarotSkinIdentify = ((die) l46Var.k(snd.a)).a;
            int i5 = i2 & 14;
            boolean zE = (i5 == 4 || ((i2 & 8) != 0 && l46Var.g(sharePayload$DrawnCards))) | l46Var.e(tarotSkinIdentify.ordinal());
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zE || objR == obj) {
                objR = kv2.f(0, l46Var);
            }
            s69 s69Var = (s69) objR;
            l46Var.d0(-1088964615, l46Var.I(l46Var.I(sharePayload$DrawnCards, tarotSkinIdentify), Integer.valueOf(((sz9) s69Var).j())));
            boolean zG = l46Var.g(s69Var);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new q50(s69Var, i3);
                l46Var.p0(objR2);
            }
            i(sharePayload$DrawnCards, a26Var, (x16) objR2, l46Var, (i2 & 112) | SharePayload$DrawnCards.$stable | i5);
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tp4(sharePayload$DrawnCards, a26Var, i, i4);
        }
    }

    public static final int j0(float f2, float[] fArr, int i) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static final void k(final j09 j09Var, final o89 o89Var, final e89 e89Var, final ghc ghcVar, final x4d x4dVar, final long j, final float f2, final dd2 dd2Var, l46 l46Var, final int i) {
        float f3;
        l46Var.h0(848986741);
        int i2 = i | (l46Var.g(j09Var) ? 4 : 2) | (l46Var.g(o89Var) ? 32 : 16) | (l46Var.g(ghcVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(x4dVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.f(j) ? 131072 : 65536) | (l46Var.d(0.0f) ? 1048576 : 524288) | (l46Var.d(f2) ? 8388608 : 4194304) | (l46Var.g(null) ? 67108864 : 33554432) | (l46Var.i(dd2Var) ? 536870912 : 268435456);
        if (l46Var.W(i2 & 1, (i2 & 306783379) != 306783378)) {
            n3f n3fVarH0 = h0(o89Var, "DropDownMenu", l46Var, ((i2 >> 3) & 14) | 48);
            fxd fxdVarZ = vpf.Z(t39.b, l46Var);
            fxd fxdVarZ2 = vpf.Z(t39.d, l46Var);
            y6f y6fVar = xo1.g;
            s3f s3fVar = n3fVarH0.a;
            vz9 vz9Var = n3fVarH0.d;
            boolean zBooleanValue = ((Boolean) s3fVar.a()).booleanValue();
            l46Var.f0(143964305);
            float f4 = zBooleanValue ? 1.0f : 0.8f;
            l46Var.r(false);
            Float fValueOf = Float.valueOf(f4);
            boolean zBooleanValue2 = ((Boolean) vz9Var.getValue()).booleanValue();
            l46Var.f0(143964305);
            float f5 = zBooleanValue2 ? 1.0f : 0.8f;
            l46Var.r(false);
            Float fValueOf2 = Float.valueOf(f5);
            n3fVarH0.f();
            l46Var.f0(-745957716);
            l46Var.r(false);
            boolean z = true;
            k3f k3fVarH = H(n3fVarH0, fValueOf, fValueOf2, fxdVarZ, y6fVar, l46Var, 0);
            boolean zBooleanValue3 = ((Boolean) n3fVarH0.a.a()).booleanValue();
            l46Var.f0(892761509);
            float f6 = zBooleanValue3 ? 1.0f : 0.0f;
            l46Var.r(false);
            Float fValueOf3 = Float.valueOf(f6);
            boolean zBooleanValue4 = ((Boolean) vz9Var.getValue()).booleanValue();
            l46Var.f0(892761509);
            float f7 = zBooleanValue4 ? 1.0f : 0.0f;
            l46Var.r(false);
            Float fValueOf4 = Float.valueOf(f7);
            n3fVarH0.f();
            l46Var.f0(2839488);
            l46Var.r(false);
            k3f k3fVarH2 = H(n3fVarH0, fValueOf3, fValueOf4, fxdVarZ2, y6fVar, l46Var, 0);
            boolean zBooleanValue5 = ((Boolean) l46Var.k(h57.a)).booleanValue();
            boolean zH = l46Var.h(zBooleanValue5) | l46Var.g(k3fVarH);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean zG = z | zH | l46Var.g(k3fVarH2);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                f3 = 0.0f;
                Object fl0Var = new fl0(zBooleanValue5, o89Var, e89Var, k3fVarH, k3fVarH2);
                l46Var.p0(fl0Var);
                objR = fl0Var;
            } else {
                f3 = 0.0f;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            nae.a(bzd.x(g09.a, (a26) objR), x4dVar, j, 0L, f3, f2, null, af1.b0(-1463404422, new bs8(j09Var, ghcVar, dd2Var), l46Var), l46Var, (i3 & 896) | (i3 & 112) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(o89Var, e89Var, ghcVar, x4dVar, j, f2, dd2Var, i) { // from class: as8
                public final /* synthetic */ o89 b;
                public final /* synthetic */ e89 c;
                public final /* synthetic */ ghc d;
                public final /* synthetic */ x4d e;
                public final /* synthetic */ long f;
                public final /* synthetic */ float g;
                public final /* synthetic */ dd2 v;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(385);
                    g21.k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void l(dd2 dd2Var, x16 x16Var, j09 j09Var, boolean z, tr8 tr8Var, xw9 xw9Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-1325192924);
        if ((i & 6) == 0) {
            i2 = (l46Var.i(dd2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(null) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(null) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var.g(tr8Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= l46Var.g(xw9Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= l46Var.g(null) ? 67108864 : 33554432;
        }
        if (l46Var.W(i2 & 1, (38347923 & i2) != 38347922)) {
            j09 j09VarY = ynb.Y(b.o(b.c(androidx.compose.foundation.b.b(j09Var, null, d5c.a(0.0f, 6, 0L, true), z, null, x16Var, 24), 1.0f), 112.0f, 48.0f, 280.0f, 8), xw9Var);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var, 48);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarY);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dec.l(hj6.x, l46Var, j09VarJ);
            nte.a(((p9f) l46Var.k(r9f.a)).m, af1.b0(865999929, new cs8(tr8Var, z, dd2Var), l46Var), l46Var, 48);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tg(dd2Var, x16Var, j09Var, z, tr8Var, xw9Var, i);
        }
    }

    public static final void m(x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-1370708430);
        int i2 = 4;
        int i3 = i | (l46Var.i(x16Var) ? 4 : 2) | (l46Var.i(x16Var2) ? 32 : 16);
        int i4 = 18;
        int i5 = 0;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(null);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            e89 e89Var2 = (e89) objR2;
            if (((Boolean) e89Var2.getValue()).booleanValue()) {
                l46Var.f0(1774434138);
                Object objR3 = l46Var.R();
                if (objR3 == i8cVar) {
                    objR3 = new ok3(e89Var2, i4);
                    l46Var.p0(objR3);
                }
                wi.a((x16) objR3, null, new s84(z, z3 ? 1 : 0, i2), af1.b0(-1705697871, new hr(e89Var2, 9), l46Var), l46Var, 3462, 2);
                l46Var.r(false);
            } else {
                l46Var.f0(1774701296);
                l46Var.r(false);
            }
            xdc.a(null, af1.b0(870699758, new s95(x16Var, e89Var, i5), l46Var), af1.b0(-328035507, new s95(x16Var2, e89Var2, z2 ? 1 : 0), l46Var), null, null, 0, 0L, 0L, null, af1.b0(729569859, new j41((Context) l46Var.k(uq.b), x16Var, e89Var, 6), l46Var), l46Var, 805306800, 505);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i, 5, x16Var, x16Var2);
        }
    }

    public static final void n(x16 x16Var, l46 l46Var, int i) {
        x16Var.getClass();
        l46Var.h0(-462149143);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            kc5 kc5Var = (kc5) z5c.G(job.a.b(kc5.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            Context context = (Context) l46Var.k(uq.b);
            boolean zI = l46Var.i(kc5Var) | l46Var.i(context);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new jt3(17, kc5Var, context);
                l46Var.p0(objR);
            }
            m(x16Var, (x16) objR, l46Var, i2 & 14);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fi4(i, i3, x16Var);
        }
    }

    public static final void o(ii6 ii6Var, dd2 dd2Var, l46 l46Var, int i, int i2) {
        int i3;
        j09 j09VarP;
        l46Var.h0(-1989935437);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (l46Var.g(ii6Var) ? 4 : 2) | i;
        }
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                ii6Var = null;
            }
            FillElement fillElement = b.c;
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, fillElement);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            d31 d31Var = d31.a;
            j09 j09Var = g09.a;
            j09 j09VarB = d31Var.b(j09Var);
            if (ii6Var != null && (j09VarP = P(j09Var, ii6Var)) != null) {
                j09Var = j09VarP;
            }
            s21.a(M(l46Var, j09VarB.D(j09Var)), l46Var, 0);
            dd2Var.m(d31Var, l46Var, 54);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ii6 ii6Var2 = ii6Var;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(ii6Var2, dd2Var, i, i2, 21);
        }
    }

    public static final void p(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(1177494560);
        if (l46Var.W(i & 1, (i & 3) != 2)) {
            ms8 ms8Var = new ms8();
            dd2Var.m(ms8Var, l46Var, 48);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            ArrayList arrayList = ms8Var.a;
            if (arrayList.isEmpty()) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new qx1(dd2Var, i, 12);
                    return;
                }
                return;
            }
            if (arrayList.size() == 1) {
                l46Var.f0(1742769385);
                arrayList.get(0).getClass();
                r3.f();
                return;
            }
            l46Var.f0(1742916418);
            l46Var.r(false);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new x08(e89Var, 15);
                l46Var.p0(objR2);
            }
            dd2 dd2Var2 = pa7.c;
            g09 g09Var = g09.a;
            bm8.h((x16) objR2, g09Var, false, null, null, dd2Var2, l46Var, 1572918, 60);
            j09 j09VarP = b.p(g09Var, 228.0f);
            boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
            long j = ((m82) l46Var.k(o82.a)).n;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = new x08(e89Var, 16);
                l46Var.p0(objR3);
            }
            mt.a(zBooleanValue, (x16) objR3, j09VarP, 0L, null, null, null, j, 0.0f, af1.b0(-1149518331, new g20(23, ms8Var, e89Var), l46Var), l46Var, 432);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new qx1(dd2Var, i, 13);
        }
    }

    public static final void q(j09 j09Var, float f2, dd2 dd2Var, l46 l46Var, int i) {
        dd2 dd2Var2;
        l46Var.h0(1059423706);
        int i2 = i | (l46Var.g(j09Var) ? 4 : 2) | (l46Var.d(f2) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            b41 b41VarC0 = c0(S(l46Var), l46Var);
            y6c y6cVarB = a7c.b(f2);
            pr4 pr4Var = l8b.a;
            j09 j09VarX = db6.x(tm7.o(iqf.h(j09Var, y72.b(y72.b, 0.1f), 2.0f, 21.0f, new s4d(f2, f2), 2), abg.r(((e8b) l46Var.k(pr4Var)).g, ((e8b) l46Var.k(pr4Var)).a), y6cVarB), 1.0f, b41VarC0, y6cVarB);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarX);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            dd2Var2 = dd2Var;
            dd2Var2.m(d31.a, l46Var, 54);
            l46Var.r(true);
        } else {
            dd2Var2 = dd2Var;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fz4(j09Var, f2, dd2Var2, i, 3);
        }
    }

    public static final void r(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(373355980);
        int i2 = 1;
        if (l46Var.W(i & 1, (i & 3) != 2)) {
            mh3.a(p77.c.a(new yi4(24.0f)), dd2Var, l46Var, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qx1(dd2Var, i, i2);
        }
    }

    public static final void s(float f2, dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-904276862);
        if (l46Var.W(i & 1, (i & 19) != 18)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new vc2(f2);
                l46Var.p0(objR);
            }
            xn8 xn8Var = (xn8) objR;
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, g09.a);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8Var);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            tec.q(6, dd2Var, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xh1(f2, dd2Var, i);
        }
    }

    public static final void t(n3f n3fVar, k3f k3fVar, Object obj, Object obj2, ze5 ze5Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(867041821);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(n3fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(k3fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(obj) : l46Var.i(obj) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? l46Var.g(obj2) : l46Var.i(obj2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? l46Var.g(ze5Var) : l46Var.i(ze5Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (!l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            l46Var.Z();
        } else if (n3fVar.h()) {
            k3fVar.i(obj, obj2, ze5Var);
        } else {
            k3fVar.j(obj2, ze5Var, null, null);
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yb(n3fVar, k3fVar, obj, obj2, ze5Var, i, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d5 A[Catch: hd7 -> 0x01c8, TryCatch #8 {hd7 -> 0x01c8, blocks: (B:37:0x00d0, B:38:0x00d2, B:39:0x00d5, B:57:0x0125, B:40:0x00de), top: B:122:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00de A[Catch: hd7 -> 0x01c8, TRY_LEAVE, TryCatch #8 {hd7 -> 0x01c8, blocks: (B:37:0x00d0, B:38:0x00d2, B:39:0x00d5, B:57:0x0125, B:40:0x00de), top: B:122:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea A[Catch: hd7 -> 0x01c2, TRY_ENTER, TRY_LEAVE, TryCatch #4 {hd7 -> 0x01c2, blocks: (B:35:0x00cc, B:42:0x00ea, B:56:0x0114, B:58:0x012a, B:62:0x013f, B:66:0x0147), top: B:114:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:55:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x013c  */
    /* JADX WARN: Code duplicated, block: B:61:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:65:0x0145  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0197 -> B:18:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object u(defpackage.d18 r28, int r29, int r30, int r31, defpackage.sw3 r32, defpackage.zn2 r33) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g21.u(d18, int, int, int, sw3, zn2):java.lang.Object");
    }

    public static final boolean v(boolean z, d18 d18Var, int i, int i2) {
        if (z) {
            if (d18Var.c() > i) {
                return true;
            }
            return d18Var.c() == i && d18Var.d() > i2;
        }
        if (d18Var.c() < i) {
            return true;
        }
        return d18Var.c() == i && d18Var.d() < i2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:4:0x0017  */
    public static final long w(a77 a77Var, a77 a77Var2) {
        float fMin;
        int i = a77Var2.a;
        int i2 = a77Var2.d;
        int i3 = a77Var2.a;
        int i4 = a77Var2.c;
        int i5 = a77Var2.b;
        int i6 = a77Var.c;
        int i7 = a77Var.b;
        int i8 = a77Var.d;
        int i9 = a77Var.a;
        float fMin2 = 1.0f;
        if (i >= i6) {
            fMin = 0.0f;
        } else if (i4 <= i9) {
            fMin = 1.0f;
        } else if (a77Var2.d() == 0) {
            fMin = 0.0f;
        } else {
            fMin = (((Math.min(a77Var.c, i4) + Math.max(i9, i3)) / 2) - i3) / a77Var2.d();
        }
        if (i5 >= i8) {
            fMin2 = 0.0f;
        } else if (i2 > i7) {
            if (a77Var2.b() == 0) {
                fMin2 = 0.0f;
            } else {
                fMin2 = (((Math.min(i8, i2) + Math.max(i7, i5)) / 2) - i5) / a77Var2.b();
            }
        }
        return sfc.d(fMin, fMin2);
    }

    public static final h9g x(l46 l46Var) {
        w8g w8gVar;
        Context context = (Context) l46Var.k(uq.b);
        if (((Boolean) l46Var.k(h57.a)).booleanValue() || !(context instanceof Activity)) {
            l46Var.f0(1039058196);
            Configuration configuration = (Configuration) l46Var.k(uq.a);
            h9g h9gVarF = w1e.f(cgg.f(configuration.screenWidthDp, configuration.screenHeightDp));
            l46Var.r(false);
            return h9gVarF;
        }
        l46Var.f0(1039062184);
        Activity activity = (Activity) context;
        l46Var.k(uq.a);
        sw3 sw3Var = (sw3) l46Var.k(zg2.h);
        u8g.a.getClass();
        v8g v8gVar = t8g.b;
        v8gVar.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            w8gVar = uw3.b;
        } else {
            w8gVar = i >= 30 ? o21.b : gec.X;
        }
        h9g h9gVarF2 = w1e.f(sw3Var.u(ynb.l0(w8gVar.j(activity, v8gVar.b).a()).e()));
        l46Var.r(false);
        return h9gVarF2;
    }

    public static Object y(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(g21.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final boolean z(z17 z17Var) {
        return !z17Var.h && z17Var.d;
    }
}
