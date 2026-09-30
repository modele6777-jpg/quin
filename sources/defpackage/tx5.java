package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tx5 {
    public static final wid b = new wid(0);
    public final /* synthetic */ zx5 a;

    public tx5(zx5 zx5Var) {
        this.a = zx5Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        wid widVar = b;
        wid widVar2 = (wid) widVar.get(classLoader);
        if (widVar2 == null) {
            widVar2 = new wid(0);
            widVar.put(classLoader, widVar2);
        }
        Class cls = (Class) widVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        widVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new jx5(ib8.j("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new jx5(ib8.j("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final kx5 a(String str) {
        try {
            return (kx5) c(this.a.w.H0.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new jx5(ib8.j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new jx5(ib8.j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new jx5(ib8.j("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new jx5(ib8.j("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
