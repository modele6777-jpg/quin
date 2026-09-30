package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes.dex */
public final class zo1 implements a26 {
    public final /* synthetic */ int a;
    public static final zo1 b = new zo1(0);
    public static final zo1 c = new zo1(1);
    public static final zo1 d = new zo1(2);
    public static final zo1 e = new zo1(3);
    public static final zo1 f = new zo1(4);
    public static final zo1 g = new zo1(5);
    public static final zo1 v = new zo1(6);
    public static final zo1 w = new zo1(7);
    public static final zo1 x = new zo1(8);
    public static final zo1 y = new zo1(9);
    public static final zo1 z = new zo1(10);
    public static final zo1 X = new zo1(11);
    public static final zo1 Y = new zo1(12);
    public static final zo1 Z = new zo1(13);
    public static final zo1 E0 = new zo1(14);
    public static final zo1 F0 = new zo1(15);
    public static final zo1 G0 = new zo1(16);
    public static final zo1 H0 = new zo1(17);
    public static final zo1 I0 = new zo1(18);
    public static final zo1 J0 = new zo1(19);
    public static final zo1 K0 = new zo1(20);
    public static final zo1 L0 = new zo1(21);
    public static final zo1 M0 = new zo1(22);
    public static final zo1 N0 = new zo1(23);
    public static final zo1 O0 = new zo1(24);
    public static final zo1 P0 = new zo1(25);
    public static final zo1 Q0 = new zo1(26);
    public static final zo1 R0 = new zo1(27);
    public static final zo1 S0 = new zo1(28);
    public static final zo1 T0 = new zo1(29);

    public /* synthetic */ zo1(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        switch (this.a) {
            case 0:
                jgf jgfVar = (jgf) obj;
                jgfVar.getClass();
                return Boolean.valueOf(jgfVar.c0() instanceof bp1);
            case 1:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 2:
                ((c36) obj).getClass();
                return null;
            case 3:
                ((c36) obj).getClass();
                return null;
            case 4:
                ((c36) obj).getClass();
                return null;
            case 5:
                ea1 ea1Var = (ea1) obj;
                ea1Var.getClass();
                return Boolean.valueOf(qn4.F(ea1Var));
            case 6:
                h10 h10Var = (h10) obj;
                h10Var.getClass();
                return new td0(1, h10Var);
            case 7:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 8:
                Context context3 = (Context) obj;
                context3.getClass();
                if (context3 instanceof ContextWrapper) {
                    return ((ContextWrapper) context3).getBaseContext();
                }
                return null;
            case 9:
                Context context4 = (Context) obj;
                context4.getClass();
                if (context4 instanceof ContextWrapper) {
                    return ((ContextWrapper) context4).getBaseContext();
                }
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Context context5 = (Context) obj;
                context5.getClass();
                if (context5 instanceof ContextWrapper) {
                    return ((ContextWrapper) context5).getBaseContext();
                }
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                Context context6 = (Context) obj;
                context6.getClass();
                if (context6 instanceof ContextWrapper) {
                    return ((ContextWrapper) context6).getBaseContext();
                }
                return null;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Context context7 = (Context) obj;
                context7.getClass();
                if (context7 instanceof ContextWrapper) {
                    return ((ContextWrapper) context7).getBaseContext();
                }
                return null;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                Context context8 = (Context) obj;
                context8.getClass();
                if (context8 instanceof ContextWrapper) {
                    return ((ContextWrapper) context8).getBaseContext();
                }
                return null;
            case 14:
                Context context9 = (Context) obj;
                context9.getClass();
                if (context9 instanceof ContextWrapper) {
                    return ((ContextWrapper) context9).getBaseContext();
                }
                return null;
            case 15:
                Context context10 = (Context) obj;
                context10.getClass();
                if (context10 instanceof ContextWrapper) {
                    return ((ContextWrapper) context10).getBaseContext();
                }
                return null;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                Context context11 = (Context) obj;
                context11.getClass();
                if (context11 instanceof ContextWrapper) {
                    return ((ContextWrapper) context11).getBaseContext();
                }
                return null;
            case 17:
                Context context12 = (Context) obj;
                context12.getClass();
                if (context12 instanceof ContextWrapper) {
                    return ((ContextWrapper) context12).getBaseContext();
                }
                return null;
            case 18:
                Context context13 = (Context) obj;
                context13.getClass();
                if (context13 instanceof ContextWrapper) {
                    return ((ContextWrapper) context13).getBaseContext();
                }
                return null;
            case 19:
                Context context14 = (Context) obj;
                context14.getClass();
                if (context14 instanceof ContextWrapper) {
                    return ((ContextWrapper) context14).getBaseContext();
                }
                return null;
            case 20:
                Context context15 = (Context) obj;
                context15.getClass();
                if (context15 instanceof ContextWrapper) {
                    return ((ContextWrapper) context15).getBaseContext();
                }
                return null;
            case 21:
                ym7 ym7Var = (ym7) obj;
                ym7Var.getClass();
                return "  - " + ym7Var + " (" + abg.A(ym7Var) + ')';
            case 22:
                TypeVariable typeVariable = (TypeVariable) obj;
                typeVariable.getClass();
                Type[] bounds = typeVariable.getBounds();
                bounds.getClass();
                Object objL0 = qd0.l0(bounds);
                if (objL0 instanceof TypeVariable) {
                    return (TypeVariable) objL0;
                }
                return null;
            case 23:
                Class cls = (Class) obj;
                cls.getClass();
                if (Modifier.isStatic(cls.getModifiers())) {
                    return null;
                }
                return cls.getDeclaringClass();
            case 24:
                Class cls2 = (Class) obj;
                cls2.getClass();
                TypeVariable[] typeParameters = cls2.getTypeParameters();
                typeParameters.getClass();
                return qd0.S(typeParameters);
            case 25:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 26:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return qd0.G0(actualTypeArguments);
            case 27:
                ym7 ym7Var2 = (ym7) obj;
                ym7Var2.getClass();
                return "  - " + ym7Var2 + " (" + abg.y(ym7Var2) + ')';
            case 28:
                wq7 wq7Var = (wq7) obj;
                wq7Var.getClass();
                return wq7Var.e;
            default:
                wq7 wq7Var2 = (wq7) obj;
                wq7Var2.getClass();
                return wq7Var2.c;
        }
    }
}
