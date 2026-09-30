package defpackage;

import com.adjust.sdk.Constants;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class smb {
    public static final List a;
    public static final LinkedHashMap b;
    public static final LinkedHashMap c;
    public static final Map d;

    static {
        kob kobVar = job.a;
        int i = 0;
        List<em7> listI = t72.I(kobVar.b(Boolean.TYPE), kobVar.b(Byte.TYPE), kobVar.b(Character.TYPE), kobVar.b(Double.TYPE), kobVar.b(Float.TYPE), kobVar.b(Integer.TYPE), kobVar.b(Long.TYPE), kobVar.b(Short.TYPE));
        a = listI;
        int iF = bm8.F(t72.u(listI, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
        for (em7 em7Var : listI) {
            iy9 iy9Var = new iy9(af1.S(em7Var), af1.T(em7Var));
            linkedHashMap.put(iy9Var.d(), iy9Var.e());
        }
        b = linkedHashMap;
        List<em7> list = a;
        int iF2 = bm8.F(t72.u(list, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF2 >= 16 ? iF2 : 16);
        for (em7 em7Var2 : list) {
            iy9 iy9Var2 = new iy9(af1.T(em7Var2), af1.S(em7Var2));
            linkedHashMap2.put(iy9Var2.d(), iy9Var2.e());
        }
        c = linkedHashMap2;
        List listI2 = t72.I(x16.class, a26.class, l26.class, n26.class, o26.class, p26.class, q26.class, r26.class, s26.class, t26.class, y16.class, z16.class, p36.class, b26.class, c26.class, d26.class, e26.class, f26.class, g26.class, h26.class, j26.class, k26.class, p36.class);
        ArrayList arrayList = new ArrayList(t72.u(listI2, 10));
        for (Object obj : listI2) {
            int i2 = i + 1;
            if (i < 0) {
                t72.Z();
                throw null;
            }
            arrayList.add(new iy9((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = bm8.W(arrayList);
    }

    public static final j22 a(Class cls) {
        cls.getClass();
        if (cls.isPrimitive()) {
            yg5.l(cls, "Can't compute ClassId for primitive type: ");
            return null;
        }
        if (cls.isArray()) {
            yg5.l(cls, "Can't compute ClassId for array type: ");
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            dx5 dx5Var = new dx5(cls.getName());
            return new j22(dx5Var.b(), cn1.V(dx5Var.a.g()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return a(declaringClass).d(t99.e(cls.getSimpleName()));
        }
        dx5 dx5Var2 = new dx5(cls.getName());
        return new j22(dx5Var2.b(), dx5Var2.a.g());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class cls) {
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String strReplace = cls.getName().replace('.', '/');
                strReplace.getClass();
                return strReplace;
            }
            StringBuilder sb = new StringBuilder("L");
            String strReplace2 = cls.getName().replace('.', '/');
            strReplace2.getClass();
            sb.append(strReplace2);
            sb.append(';');
            return sb.toString();
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        yg5.l(cls, "Unsupported primitive type: ");
        return null;
    }

    public static final List c(Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return pu4.a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return fyc.A(new zi5(fyc.u(d5a.y, type), d5a.z, jyc.a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return qd0.G0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }
}
