package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class enb extends jnb implements td7, xd7, vf7 {
    public final Class a;

    public enb(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.td7
    public final tmb a(dx5 dx5Var) {
        dx5Var.getClass();
        Annotation[] declaredAnnotations = this.a.getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return vpf.y(declaredAnnotations, dx5Var);
        }
        return null;
    }

    public final List b() {
        Field[] declaredFields = this.a.getDeclaredFields();
        declaredFields.getClass();
        return fyc.A(fyc.x(new ve5(qd0.S(declaredFields), false, bnb.a), cnb.a));
    }

    public final dx5 c() {
        return smb.a(this.a).a();
    }

    public final List d() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        declaredMethods.getClass();
        return fyc.A(fyc.x(new ve5(qd0.S(declaredMethods), true, new ymb(0, this)), dnb.a));
    }

    public final t99 e() {
        Class cls = this.a;
        return cls.isAnonymousClass() ? t99.e(v4e.h0(cls.getName())) : t99.e(cls.getSimpleName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enb) {
            return this.a.equals(((enb) obj).a);
        }
        return false;
    }

    public final ArrayList f() {
        szc szcVar = cgg.q;
        Object[] objArr = null;
        if (szcVar == null) {
            try {
                szcVar = new szc(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 21);
            } catch (NoSuchMethodException unused) {
                szcVar = new szc(objArr, objArr, objArr, objArr, 21);
            }
            cgg.q = szcVar;
        }
        Method method = (Method) szcVar.e;
        objArr = method != null ? (Object[]) method.invoke(this.a, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new rnb(obj));
        }
        return arrayList;
    }

    public final boolean g() throws IllegalAccessException, InvocationTargetException {
        szc szcVar = cgg.q;
        Boolean bool = null;
        if (szcVar == null) {
            try {
                szcVar = new szc(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 21);
            } catch (NoSuchMethodException unused) {
                szcVar = new szc(bool, bool, bool, bool, 21);
            }
            cgg.q = szcVar;
        }
        Method method = (Method) szcVar.d;
        if (method != null) {
            Object objInvoke = method.invoke(this.a, null);
            objInvoke.getClass();
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.td7
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations = this.a.getDeclaredAnnotations();
        return declaredAnnotations != null ? vpf.E(declaredAnnotations) : pu4.a;
    }

    @Override // defpackage.vf7
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new tnb(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return enb.class.getName() + ": " + this.a;
    }
}
