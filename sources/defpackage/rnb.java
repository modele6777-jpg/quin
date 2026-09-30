package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rnb extends nnb {
    public final Object a;

    public rnb(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.nnb
    public final Member b() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.a;
        obj.getClass();
        fz3 fz3Var = feg.m;
        Method method = null;
        if (fz3Var == null) {
            Class<?> cls = obj.getClass();
            int i = 13;
            try {
                fz3Var = new fz3(i, cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                fz3Var = new fz3(i, method, method);
            }
            feg.m = fz3Var;
        }
        Method method2 = (Method) fz3Var.c;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, null);
            objInvoke.getClass();
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final snb f() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.a;
        obj.getClass();
        fz3 fz3Var = feg.m;
        Class cls = null;
        if (fz3Var == null) {
            Class<?> cls2 = obj.getClass();
            int i = 13;
            try {
                fz3Var = new fz3(i, cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                fz3Var = new fz3(i, cls, cls);
            }
            feg.m = fz3Var;
        }
        Method method = (Method) fz3Var.b;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            objInvoke.getClass();
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new hnb(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
