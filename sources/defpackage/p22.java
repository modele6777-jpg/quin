package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p22 implements em7, y12, hs7 {
    public static final Map b;
    public final Class a;

    static {
        List listI = t72.I(x16.class, a26.class, l26.class, n26.class, o26.class, p26.class, q26.class, r26.class, s26.class, t26.class, y16.class, z16.class, p36.class, b26.class, c26.class, d26.class, e26.class, f26.class, g26.class, h26.class, j26.class, k26.class, p36.class);
        ArrayList arrayList = new ArrayList(t72.u(listI, 10));
        int i = 0;
        for (Object obj : listI) {
            int i2 = i + 1;
            if (i < 0) {
                t72.Z();
                throw null;
            }
            arrayList.add(new iy9((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = bm8.W(arrayList);
    }

    public p22(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    public static void f() {
        throw new qt7();
    }

    @Override // defpackage.em7
    public final boolean D(Object obj) {
        Class clsS = this.a;
        clsS.getClass();
        Map map = b;
        map.getClass();
        Integer num = (Integer) map.get(clsS);
        if (num != null) {
            return z7f.L(num.intValue(), obj);
        }
        if (clsS.isPrimitive()) {
            clsS = af1.S(job.a.b(clsS));
        }
        return clsS.isInstance(obj);
    }

    @Override // defpackage.y12
    public final Class d() {
        return this.a;
    }

    @Override // defpackage.em7
    public final List e() {
        f();
        throw null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p22) && af1.S(this).equals(af1.S((em7) obj));
    }

    @Override // defpackage.hs7
    public final GenericDeclaration findJavaDeclaration() {
        return this.a;
    }

    @Override // defpackage.em7
    public final String g() {
        String strL;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strL2 = od4.l(cls.getName());
            return strL2 == null ? cls.getCanonicalName() : strL2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strL = od4.l(componentType.getName())) != null) {
            strConcat = strL.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        f();
        throw null;
    }

    @Override // defpackage.em7, defpackage.bo7
    public final List getTypeParameters() {
        f();
        throw null;
    }

    @Override // defpackage.em7
    public final int hashCode() {
        return af1.S(this).hashCode();
    }

    @Override // defpackage.em7
    public final boolean j() {
        f();
        throw null;
    }

    @Override // defpackage.em7
    public final Collection k() {
        f();
        throw null;
    }

    @Override // defpackage.em7
    public final boolean q() {
        f();
        throw null;
    }

    @Override // defpackage.em7
    public final String r() {
        String strF;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strF2 = od4.F(cls.getName());
                return strF2 == null ? cls.getSimpleName() : strF2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strF = od4.F(componentType.getName())) != null) {
                strConcat = strF.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return v4e.f0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iN = v4e.N(simpleName, '$', 0, 6);
            return iN == -1 ? simpleName : simpleName.substring(iN + 1, simpleName.length());
        }
        return v4e.f0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
