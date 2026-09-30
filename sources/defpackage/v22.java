package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v22 {
    public static final v22 c = new v22();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, u22 u22Var, f48 f48Var, Class cls) {
        f48 f48Var2 = (f48) map.get(u22Var);
        if (f48Var2 == null || f48Var == f48Var2) {
            if (f48Var2 == null) {
                map.put(u22Var, f48Var);
            }
        } else {
            String name = u22Var.b.getName();
            String name2 = cls.getName();
            qc0.j(ib8.m(ib8.o("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), String.valueOf(f48Var2), ", new value ", String.valueOf(f48Var)));
        }
    }

    public final t22 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            t22 t22VarA = (t22) map2.get(superclass);
            if (t22VarA == null) {
                t22VarA = a(superclass, null);
            }
            map.putAll(t22VarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            t22 t22VarA2 = (t22) map2.get(cls2);
            if (t22VarA2 == null) {
                t22VarA2 = a(cls2, null);
            }
            for (Map.Entry entry : t22VarA2.b.entrySet()) {
                b(map, (u22) entry.getKey(), (f48) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            dn9 dn9Var = (dn9) method.getAnnotation(dn9.class);
            if (dn9Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!x48.class.isAssignableFrom(parameterTypes[0])) {
                        qc0.j("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                f48 f48VarValue = dn9Var.value();
                if (parameterTypes.length > 1) {
                    if (!f48.class.isAssignableFrom(parameterTypes[1])) {
                        qc0.j("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (f48VarValue != f48.ON_ANY) {
                        qc0.j("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    qc0.j("cannot have more than 2 params");
                    return null;
                }
                b(map, new u22(method, i), f48VarValue, cls);
                z = true;
            }
        }
        t22 t22Var = new t22(map);
        map2.put(cls, t22Var);
        this.b.put(cls, Boolean.valueOf(z));
        return t22Var;
    }
}
