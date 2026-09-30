package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d5a implements a26 {
    public final /* synthetic */ int a;
    public static final d5a b = new d5a(0);
    public static final d5a c = new d5a(1);
    public static final d5a d = new d5a(2);
    public static final d5a e = new d5a(3);
    public static final d5a f = new d5a(4);
    public static final d5a g = new d5a(5);
    public static final d5a v = new d5a(6);
    public static final d5a w = new d5a(7);
    public static final d5a x = new d5a(8);
    public static final d5a y = new d5a(9);
    public static final d5a z = new d5a(10);
    public static final d5a X = new d5a(11);
    public static final d5a Y = new d5a(12);
    public static final d5a Z = new d5a(13);
    public static final d5a E0 = new d5a(14);
    public static final d5a F0 = new d5a(15);
    public static final d5a G0 = new d5a(16);
    public static final d5a H0 = new d5a(17);
    public static final d5a I0 = new d5a(18);
    public static final d5a J0 = new d5a(19);
    public static final d5a K0 = new d5a(20);
    public static final d5a L0 = new d5a(21);
    public static final d5a M0 = new d5a(22);
    public static final d5a N0 = new d5a(23);
    public static final d5a O0 = new d5a(24);
    public static final d5a P0 = new d5a(25);
    public static final d5a Q0 = new d5a(26);
    public static final d5a R0 = new d5a(27);
    public static final d5a S0 = new d5a(28);
    public static final d5a T0 = new d5a(29);

    public /* synthetic */ d5a(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        switch (this.a) {
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
                Context context7 = (Context) obj;
                context7.getClass();
                if (context7 instanceof ContextWrapper) {
                    return ((ContextWrapper) context7).getBaseContext();
                }
                return null;
            case 7:
                Context context8 = (Context) obj;
                context8.getClass();
                if (context8 instanceof ContextWrapper) {
                    return ((ContextWrapper) context8).getBaseContext();
                }
                return null;
            case 8:
                String str = (String) obj;
                str.getClass();
                return "(raw) ".concat(str);
            case 9:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List list = smb.a;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                List list2 = smb.a;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return qd0.S(actualTypeArguments);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                String simpleName = ((Class) obj).getSimpleName();
                if (!t99.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return t99.e(simpleName);
                }
                return null;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                aob aobVar = (aob) obj;
                aobVar.getClass();
                String name = aobVar.getName();
                if (name == null) {
                    name = "_";
                }
                return name + ": " + aobVar.u();
            case 14:
                aob aobVar2 = (aob) obj;
                aobVar2.getClass();
                return af8.C(aobVar2.u(), false);
            case 15:
                aob aobVar3 = (aob) obj;
                aobVar3.getClass();
                return af8.C(aobVar3.u(), false);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                t99 t99Var = (t99) obj;
                t99Var.getClass();
                return rxg.Q(t99Var);
            case 17:
                rf0 rf0Var = (rf0) obj;
                rf0Var.getClass();
                return Boolean.valueOf(rf0Var.a instanceof eg0);
            case 18:
                rf0 rf0Var2 = (rf0) obj;
                rf0Var2.getClass();
                return Boolean.valueOf(rf0Var2.a instanceof gg0);
            case 19:
                rf0 rf0Var3 = (rf0) obj;
                rf0Var3.getClass();
                return Boolean.valueOf(rf0Var3.a instanceof cg0);
            case 20:
                rf0 rf0Var4 = (rf0) obj;
                rf0Var4.getClass();
                return Boolean.valueOf(rf0Var4.a instanceof bg0);
            case 21:
                rf0 rf0Var5 = (rf0) obj;
                rf0Var5.getClass();
                return Boolean.valueOf(rf0Var5.a instanceof gg0);
            case 22:
                rf0 rf0Var6 = (rf0) obj;
                rf0Var6.getClass();
                return Boolean.valueOf(rf0Var6.a instanceof cg0);
            case 23:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case 24:
                xr7 xr7Var = (xr7) obj;
                a0c a0cVar = a0c.c;
                xr7Var.getClass();
                return xr7Var.t(jua.BOOLEAN);
            case 25:
                xr7 xr7Var2 = (xr7) obj;
                b0c b0cVar = b0c.c;
                xr7Var2.getClass();
                return xr7Var2.t(jua.INT);
            case 26:
                xr7 xr7Var3 = (xr7) obj;
                c0c c0cVar = c0c.c;
                xr7Var3.getClass();
                return xr7Var3.x();
            case 27:
                Class cls = (Class) obj;
                cls.getClass();
                return smb.b(cls);
            case 28:
                Class cls2 = (Class) obj;
                cls2.getClass();
                return smb.b(cls2);
            default:
                if (pa7.t(obj, Boolean.FALSE)) {
                    return new y72(y72.k);
                }
                obj.getClass();
                return new y72(abg.c(((Integer) obj).intValue()));
        }
    }
}
