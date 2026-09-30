package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c2 implements PrivilegedExceptionAction {
    public final /* synthetic */ int a;

    public /* synthetic */ c2(int i) {
        this.a = i;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() throws IllegalAccessException {
        int i = 0;
        switch (this.a) {
            case 0:
                Field[] declaredFields = Unsafe.class.getDeclaredFields();
                int length = declaredFields.length;
                while (i < length) {
                    Field field = declaredFields[i];
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                    i++;
                }
                throw new NoSuchFieldError("the Unsafe");
            case 1:
                Field[] declaredFields2 = Unsafe.class.getDeclaredFields();
                int length2 = declaredFields2.length;
                while (i < length2) {
                    Field field2 = declaredFields2[i];
                    field2.setAccessible(true);
                    Object obj2 = field2.get(null);
                    if (Unsafe.class.isInstance(obj2)) {
                        return (Unsafe) Unsafe.class.cast(obj2);
                    }
                    i++;
                }
                return null;
            case 2:
                Field[] declaredFields3 = Unsafe.class.getDeclaredFields();
                int length3 = declaredFields3.length;
                while (i < length3) {
                    Field field3 = declaredFields3[i];
                    field3.setAccessible(true);
                    Object obj3 = field3.get(null);
                    if (Unsafe.class.isInstance(obj3)) {
                        return (Unsafe) Unsafe.class.cast(obj3);
                    }
                    i++;
                }
                return null;
            case 3:
                Field[] declaredFields4 = Unsafe.class.getDeclaredFields();
                int length4 = declaredFields4.length;
                while (i < length4) {
                    Field field4 = declaredFields4[i];
                    field4.setAccessible(true);
                    Object obj4 = field4.get(null);
                    if (Unsafe.class.isInstance(obj4)) {
                        return (Unsafe) Unsafe.class.cast(obj4);
                    }
                    i++;
                }
                return null;
            case 4:
                return fvg.D();
            default:
                Field[] declaredFields5 = Unsafe.class.getDeclaredFields();
                int length5 = declaredFields5.length;
                while (i < length5) {
                    Field field5 = declaredFields5[i];
                    field5.setAccessible(true);
                    Object obj5 = field5.get(null);
                    if (Unsafe.class.isInstance(obj5)) {
                        return (Unsafe) Unsafe.class.cast(obj5);
                    }
                    i++;
                }
                return null;
        }
    }
}
