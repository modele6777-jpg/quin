package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class nnb extends jnb implements td7, ke7 {
    @Override // defpackage.td7
    public final tmb a(dx5 dx5Var) {
        dx5Var.getClass();
        Member memberB = b();
        memberB.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return vpf.y(declaredAnnotations, dx5Var);
        }
        return null;
    }

    public abstract Member b();

    public final t99 c() {
        String name = b().getName();
        return name != null ? t99.e(name) : sud.a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    public final ArrayList d(Type[] typeArr, Annotation[][] annotationArr, boolean z) throws IllegalAccessException, InvocationTargetException {
        snb xmbVar;
        snb qnbVar;
        boolean z2;
        ArrayList arrayList = new ArrayList(typeArr.length);
        ArrayList arrayListA = hj6.K0.A(b());
        int size = arrayListA != null ? arrayListA.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i = 0; i < length; i++) {
            Type type = typeArr[i];
            type.getClass();
            boolean z3 = type instanceof Class;
            if (z3) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    qnbVar = new qnb(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z3 && ((Class) type).isArray())) {
                        xmbVar = new xmb(type);
                    } else {
                        xmbVar = type instanceof WildcardType ? new vnb((WildcardType) type) : new hnb(type);
                    }
                    qnbVar = xmbVar;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    xmbVar = new xmb(type);
                } else {
                    xmbVar = new xmb(type);
                }
                qnbVar = xmbVar;
            }
            String str = null;
            if (arrayListA != null) {
                String str2 = (String) s72.y0(i + size, arrayListA);
                if (str2 == null) {
                    yg5.f(i, c(), qnbVar, this, size);
                    return null;
                }
                str = str2;
            }
            if (z) {
                z2 = true;
                if (i != typeArr.length - 1) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            arrayList.add(new unb(qnbVar, annotationArr[i], str, z2));
        }
        return arrayList;
    }

    public final cd e() {
        int modifiers = b().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return myf.d;
        }
        if (Modifier.isPrivate(modifiers)) {
            return jyf.d;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? cg7.d : bg7.d;
        }
        return ag7.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nnb) && pa7.t(b(), ((nnb) obj).b());
    }

    @Override // defpackage.td7
    public final Collection getAnnotations() {
        Member memberB = b();
        memberB.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        return declaredAnnotations != null ? vpf.E(declaredAnnotations) : pu4.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
