package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tmb extends jnb {
    public final Annotation a;

    public tmb(Annotation annotation) {
        annotation.getClass();
        this.a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, InvocationTargetException {
        Object gnbVar;
        Annotation annotation = this.a;
        Method[] declaredMethods = af1.R(af1.Q(annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            objInvoke.getClass();
            t99 t99VarE = t99.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = smb.a;
            if (Enum.class.isAssignableFrom(cls)) {
                gnbVar = new knb(t99VarE, (Enum) objInvoke);
            } else if (objInvoke instanceof Annotation) {
                gnbVar = new vmb(t99VarE, (Annotation) objInvoke);
            } else if (objInvoke instanceof Object[]) {
                gnbVar = new wmb(t99VarE, (Object[]) objInvoke);
            } else {
                gnbVar = objInvoke instanceof Class ? new gnb(t99VarE, (Class) objInvoke) : new mnb(t99VarE, objInvoke);
            }
            arrayList.add(gnbVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tmb) {
            return this.a == ((tmb) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final String toString() {
        return tmb.class.getName() + ": " + this.a;
    }
}
