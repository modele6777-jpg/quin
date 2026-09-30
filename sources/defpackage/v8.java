package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v8 implements a26 {
    public final /* synthetic */ int a;
    public static final v8 b = new v8(0);
    public static final v8 c = new v8(1);
    public static final v8 d = new v8(2);
    public static final v8 e = new v8(3);
    public static final v8 f = new v8(4);
    public static final v8 g = new v8(5);
    public static final v8 v = new v8(6);
    public static final v8 w = new v8(7);
    public static final v8 x = new v8(8);
    public static final v8 y = new v8(9);
    public static final v8 z = new v8(10);
    public static final v8 X = new v8(11);
    public static final v8 Y = new v8(12);
    public static final v8 Z = new v8(13);
    public static final v8 E0 = new v8(14);
    public static final v8 F0 = new v8(15);
    public static final v8 G0 = new v8(16);
    public static final v8 H0 = new v8(17);
    public static final v8 I0 = new v8(18);
    public static final v8 J0 = new v8(19);
    public static final v8 K0 = new v8(20);
    public static final v8 L0 = new v8(21);
    public static final v8 M0 = new v8(22);
    public static final v8 N0 = new v8(23);
    public static final v8 O0 = new v8(24);
    public static final v8 P0 = new v8(25);
    public static final v8 Q0 = new v8(26);
    public static final v8 R0 = new v8(27);
    public static final v8 S0 = new v8(28);
    public static final v8 T0 = new v8(29);

    public /* synthetic */ v8(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        String string;
        Class<?> declaringClass;
        int i = this.a;
        boolean z2 = false;
        pu4 pu4Var = pu4.a;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 2:
                Context context3 = (Context) obj;
                context3.getClass();
                if (context3 instanceof ContextWrapper) {
                    return ((ContextWrapper) context3).getBaseContext();
                }
                return null;
            case 3:
                Context context4 = (Context) obj;
                context4.getClass();
                if (context4 instanceof ContextWrapper) {
                    return ((ContextWrapper) context4).getBaseContext();
                }
                return null;
            case 4:
                Context context5 = (Context) obj;
                context5.getClass();
                if (context5 instanceof ContextWrapper) {
                    return ((ContextWrapper) context5).getBaseContext();
                }
                return null;
            case 5:
                Context context6 = (Context) obj;
                context6.getClass();
                if (context6 instanceof ContextWrapper) {
                    return ((ContextWrapper) context6).getBaseContext();
                }
                return null;
            case 6:
                return wef.a;
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                    string.getClass();
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                    string.getClass();
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                    string.getClass();
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                    string.getClass();
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                    string.getClass();
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                    string.getClass();
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                    string.getClass();
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                    string.getClass();
                } else if (value instanceof Object[]) {
                    string = Arrays.toString((Object[]) value);
                    string.getClass();
                } else {
                    string = value.toString();
                }
                return str + '=' + string;
            case 8:
                Context context7 = (Context) obj;
                context7.getClass();
                if (context7 instanceof ContextWrapper) {
                    return ((ContextWrapper) context7).getBaseContext();
                }
                return null;
            case 9:
                Context context8 = (Context) obj;
                context8.getClass();
                if (context8 instanceof ContextWrapper) {
                    return ((ContextWrapper) context8).getBaseContext();
                }
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Context context9 = (Context) obj;
                context9.getClass();
                if (context9 instanceof ContextWrapper) {
                    return ((ContextWrapper) context9).getBaseContext();
                }
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                Context context10 = (Context) obj;
                context10.getClass();
                if (context10 instanceof ContextWrapper) {
                    return ((ContextWrapper) context10).getBaseContext();
                }
                return null;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Context context11 = (Context) obj;
                context11.getClass();
                if (context11 instanceof ContextWrapper) {
                    return ((ContextWrapper) context11).getBaseContext();
                }
                return null;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                Context context12 = (Context) obj;
                context12.getClass();
                if (context12 instanceof ContextWrapper) {
                    return ((ContextWrapper) context12).getBaseContext();
                }
                return null;
            case 14:
                Context context13 = (Context) obj;
                context13.getClass();
                if (context13 instanceof ContextWrapper) {
                    return ((ContextWrapper) context13).getBaseContext();
                }
                return null;
            case 15:
                Context context14 = (Context) obj;
                context14.getClass();
                if (context14 instanceof ContextWrapper) {
                    return ((ContextWrapper) context14).getBaseContext();
                }
                return null;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                Context context15 = (Context) obj;
                context15.getClass();
                if (context15 instanceof ContextWrapper) {
                    return ((ContextWrapper) context15).getBaseContext();
                }
                return null;
            case 17:
                Context context16 = (Context) obj;
                context16.getClass();
                if (context16 instanceof ContextWrapper) {
                    return ((ContextWrapper) context16).getBaseContext();
                }
                return null;
            case 18:
                rf0 rf0Var = (rf0) obj;
                rf0Var.getClass();
                return Boolean.valueOf(rf0Var.a instanceof qf0);
            case 19:
                rf0 rf0Var2 = (rf0) obj;
                rf0Var2.getClass();
                return Boolean.valueOf(rf0Var2.a instanceof qf0);
            case 20:
                return new y72(y72.b(((y72) obj).a, 0.25f));
            case 21:
                ea1 ea1Var = (ea1) obj;
                int i2 = o51.l;
                ea1Var.getClass();
                return Boolean.valueOf(s72.o0(qud.f, xo1.r(ea1Var)));
            case 22:
                ea1 ea1Var2 = (ea1) obj;
                int i3 = o51.l;
                ea1Var2.getClass();
                if ((ea1Var2 instanceof c36) && s72.o0(qud.f, xo1.r(ea1Var2))) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 23:
                Class cls = (Class) obj;
                k47 k47Var = y81.a;
                cls.getClass();
                return new nm7(cls);
            case 24:
                Class cls2 = (Class) obj;
                k47 k47Var2 = y81.a;
                cls2.getClass();
                return new nn7(cls2);
            case 25:
                Class cls3 = (Class) obj;
                k47 k47Var3 = y81.a;
                cls3.getClass();
                return qn4.y(y81.a(cls3), pu4Var, false, pu4Var, null);
            case 26:
                Class cls4 = (Class) obj;
                k47 k47Var4 = y81.a;
                cls4.getClass();
                return qn4.y(y81.a(cls4), pu4Var, true, pu4Var, null);
            case 27:
                k47 k47Var5 = y81.a;
                ((Class) obj).getClass();
                return new ConcurrentHashMap();
            case 28:
                em7 em7Var = (em7) obj;
                em7Var.getClass();
                if (!em7Var.j() || (declaringClass = af1.R(em7Var).getDeclaringClass()) == null) {
                    return null;
                }
                return job.a.b(declaringClass);
            default:
                em7 em7Var2 = (em7) obj;
                em7Var2.getClass();
                return em7Var2.getTypeParameters();
        }
    }
}
