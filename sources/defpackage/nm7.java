package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nm7 extends xm7 implements hs7, em7, bo7, k7f {
    public static final HashSet d;
    public final Class b;
    public final lw7 c = eb3.N(z18.b, new gm7(this, 0));

    static {
        LinkedHashSet linkedHashSet = rud.a;
        HashSet hashSet = new HashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((j22) it.next()).a().a.toString());
        }
        d = hashSet;
    }

    public nm7(Class cls) {
        this.b = cls;
    }

    public static f22 Q(j22 j22Var, k8c k8cVar) {
        tz3 tz3Var = k8cVar.a;
        su4 su4Var = new su4(tz3Var.b, j22Var.a, 0);
        t99 t99VarF = j22Var.f();
        List listH = t72.H(tz3Var.b.f().k("Any").S());
        ge8 ge8Var = tz3Var.a;
        f22 f22Var = new f22(su4Var, t99VarF, e09.b, l22.CLASS, listH, ge8Var);
        f22Var.u0(new a36(ge8Var, f22Var, 1), xu4.a, null);
        return f22Var;
    }

    @Override // defpackage.em7
    public final boolean D(Object obj) {
        Map map = smb.d;
        Class cls = this.b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return z7f.L(num.intValue(), obj);
        }
        Class cls2 = (Class) smb.c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // defpackage.xm7
    public final Collection H() {
        Collection collectionP = T().p();
        collectionP.getClass();
        return collectionP;
    }

    @Override // defpackage.xm7
    public final Collection I() {
        hq7 hq7VarU = U();
        ArrayList arrayList = hq7VarU != null ? hq7VarU.h : null;
        return arrayList == null ? pu4.a : arrayList;
    }

    @Override // defpackage.xm7
    public final Collection J(t99 t99Var) {
        dr8 dr8VarF = T().S().F();
        lf9 lf9Var = lf9.b;
        Collection collectionB = dr8VarF.b(t99Var, lf9Var);
        dr8 dr8VarC0 = T().c0();
        dr8VarC0.getClass();
        return s72.Q0(collectionB, dr8VarC0.b(t99Var, lf9Var));
    }

    @Override // defpackage.xm7
    public final wxa K(int i) {
        u09 u09VarT = T();
        d04 d04Var = u09VarT instanceof d04 ? (d04) u09VarT : null;
        if (d04Var != null) {
            nya nyaVar = d04Var.e;
            s56 s56Var = rl7.h;
            s56Var.getClass();
            nyaVar.getClass();
            kza kzaVar = (kza) (i < nyaVar.o(s56Var) ? nyaVar.n(s56Var, i) : null);
            if (kzaVar != null) {
                bb8 bb8Var = new bb8(this);
                lp0 lp0Var = d04Var.z;
                return (wxa) sqf.g(this.b, bb8Var, kzaVar, (u99) lp0Var.c, (bu3) lp0Var.e, d04Var.f, y.G0);
            }
        }
        return null;
    }

    @Override // defpackage.xm7
    public final uq7 L(int i) {
        hq7 hq7VarU = U();
        if (hq7VarU != null) {
            return (uq7) s72.y0(i, cn1.A(hq7VarU).a);
        }
        return null;
    }

    @Override // defpackage.xm7
    public final Collection N(t99 t99Var) {
        dr8 dr8VarF = T().S().F();
        lf9 lf9Var = lf9.b;
        Collection collectionF = dr8VarF.f(t99Var, lf9Var);
        dr8 dr8VarC0 = T().c0();
        dr8VarC0.getClass();
        return s72.Q0(collectionF, dr8VarC0.f(t99Var, lf9Var));
    }

    public final j22 R() {
        jua juaVarE;
        j22 j22Var = n8c.a;
        Class cls = this.b;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            juaVarE = componentType.isPrimitive() ? al7.b(componentType.getSimpleName()).e() : null;
            if (juaVarE != null) {
                return new j22(tyd.k, juaVarE.c());
            }
            dx5 dx5VarI = syd.g.i();
            return new j22(dx5VarI.b(), dx5VarI.a.g());
        }
        if (cls.equals(Void.TYPE)) {
            return n8c.a;
        }
        juaVarE = cls.isPrimitive() ? al7.b(cls.getSimpleName()).e() : null;
        if (juaVarE != null) {
            return new j22(tyd.k, juaVarE.e());
        }
        j22 j22VarA = smb.a(cls);
        if (!j22VarA.c) {
            String str = qf7.a;
            j22 j22VarG = qf7.g(j22VarA.a());
            if (j22VarG != null) {
                return j22VarG;
            }
        }
        return j22VarA;
    }

    public final k22 S() {
        k22 k22VarA;
        hq7 hq7VarU = U();
        if (hq7VarU != null && (k22VarA = si0.a(hq7VarU)) != null) {
            return k22VarA;
        }
        Class cls = this.b;
        if (cls.isAnnotation()) {
            return k22.ANNOTATION_CLASS;
        }
        if (cls.isInterface()) {
            return k22.INTERFACE;
        }
        if (cls.isEnum()) {
            return k22.ENUM_CLASS;
        }
        return cls.getSuperclass().isEnum() ? k22.ENUM_ENTRY : k22.CLASS;
    }

    public final u09 T() {
        return ((jm7) this.c.getValue()).b();
    }

    public final hq7 U() {
        return ((jm7) this.c.getValue()).c();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    public final List V(dr8 dr8Var, km7 km7Var) {
        rx3 rx3Var;
        mm7 mm7Var = new mm7(this, 0);
        Collection<bm3> collectionF = mxb.f(dr8Var, null, 3);
        ArrayList arrayList = new ArrayList();
        for (bm3 bm3Var : collectionF) {
            if (bm3Var instanceof ea1) {
                ea1 ea1Var = (ea1) bm3Var;
                if (pa7.t(ea1Var.getVisibility(), sz3.h)) {
                    rx3Var = null;
                } else if ((ea1Var.g() != 2) == (km7Var == km7.a)) {
                    rx3Var = (rx3) bm3Var.D(mm7Var, wef.a);
                } else {
                    rx3Var = null;
                }
            } else {
                rx3Var = null;
            }
            if (rx3Var != null) {
                arrayList.add(rx3Var);
            }
        }
        return s72.j1(arrayList);
    }

    @Override // defpackage.y12
    public final Class d() {
        return this.b;
    }

    @Override // defpackage.em7
    public final List e() {
        fob fobVar = ((jm7) this.c.getValue()).k;
        wn7 wn7Var = jm7.w[8];
        Object objInvoke = fobVar.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nm7) && af1.S(this).equals(af1.S((em7) obj));
    }

    @Override // defpackage.hs7
    public final GenericDeclaration findJavaDeclaration() {
        return this.b;
    }

    @Override // defpackage.em7
    public final String g() {
        fob fobVar = ((jm7) this.c.getValue()).g;
        wn7 wn7Var = jm7.w[3];
        return (String) fobVar.invoke();
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        fob fobVar = ((jm7) this.c.getValue()).e;
        wn7 wn7Var = jm7.w[1];
        Object objInvoke = fobVar.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.em7, defpackage.bo7
    public final List getTypeParameters() {
        fob fobVar = ((jm7) this.c.getValue()).i;
        wn7 wn7Var = jm7.w[6];
        Object objInvoke = fobVar.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.em7
    public final int hashCode() {
        return af1.S(this).hashCode();
    }

    @Override // defpackage.em7
    public final boolean j() {
        hq7 hq7VarU = U();
        if (hq7VarU != null) {
            return si0.e.F(si0.a[10], hq7VarU);
        }
        Class cls = this.b;
        return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
    }

    @Override // defpackage.em7
    public final Collection k() {
        fob fobVar = ((jm7) this.c.getValue()).h;
        wn7 wn7Var = jm7.w[4];
        Object objInvoke = fobVar.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    @Override // defpackage.em7
    public final boolean q() {
        hq7 hq7VarU = U();
        return hq7VarU != null && si0.f.F(si0.a[14], hq7VarU);
    }

    @Override // defpackage.em7
    public final String r() {
        fob fobVar = ((jm7) this.c.getValue()).f;
        wn7 wn7Var = jm7.w[2];
        return (String) fobVar.invoke();
    }

    public final String toString() {
        j22 j22VarR = R();
        dx5 dx5Var = j22VarR.a;
        return "class ".concat((dx5Var.a.c() ? "" : ub3.l(new StringBuilder(), dx5Var.a.a, '.')).concat(c5e.z(j22VarR.b.a.a, '.', '$')));
    }
}
