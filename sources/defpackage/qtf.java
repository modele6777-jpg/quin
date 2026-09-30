package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qtf {
    public final kd0 a;
    public final kd0 b;
    public final kd0 c;

    public qtf(kd0 kd0Var, kd0 kd0Var2, kd0 kd0Var3) {
        this.a = kd0Var;
        this.b = kd0Var2;
        this.c = kd0Var3;
    }

    public abstract rtf a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        kd0 kd0Var = this.c;
        Class cls2 = (Class) kd0Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        kd0Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        kd0 kd0Var = this.a;
        Method method = (Method) kd0Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, qtf.class.getClassLoader()).getDeclaredMethod("read", qtf.class);
        kd0Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        kd0 kd0Var = this.b;
        Method method = (Method) kd0Var.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, qtf.class);
        kd0Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((rtf) this).e.readParcelable(rtf.class.getClassLoader());
    }

    public final stf g() {
        String string = ((rtf) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (stf) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            cva.q("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            cva.q("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            cva.q("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            cva.q("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void h(int i);

    public final void i(stf stfVar) {
        if (stfVar == null) {
            ((rtf) this).e.writeString(null);
            return;
        }
        try {
            ((rtf) this).e.writeString(b(stfVar.getClass()).getName());
            rtf rtfVarA = a();
            try {
                d(stfVar.getClass()).invoke(null, stfVar, rtfVarA);
                Parcel parcel = rtfVarA.e;
                int i = rtfVarA.i;
                if (i >= 0) {
                    int i2 = rtfVarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                cva.q("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                cva.q("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                cva.q("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                cva.q("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            cva.q(stfVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
