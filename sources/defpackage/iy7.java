package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class iy7 extends er8 {
    public static final /* synthetic */ wn7[] m = {new aya(iy7.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0), new aya(iy7.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0), new aya(iy7.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0)};
    public final szc b;
    public final iy7 c;
    public final zd8 d;
    public final ee8 e;
    public final be8 f;
    public final mz0 g;
    public final be8 h;
    public final ee8 i;
    public final ee8 j;
    public final ee8 k;
    public final be8 l;

    public iy7(szc szcVar, wx7 wx7Var) {
        szcVar.getClass();
        this.b = szcVar;
        this.c = wx7Var;
        ge8 ge8Var = ((mf7) szcVar.b).a;
        int i = 0;
        this.d = new zd8(ge8Var, new fy7(this, i));
        int i2 = 1;
        this.e = new ee8(ge8Var, new fy7(this, i2));
        this.f = ge8Var.b(new gy7(this, i));
        this.g = ge8Var.c(new gy7(this, i2));
        int i3 = 2;
        this.h = ge8Var.b(new gy7(this, i3));
        this.i = new ee8(ge8Var, new fy7(this, i3));
        int i4 = 3;
        this.j = new ee8(ge8Var, new fy7(this, i4));
        this.k = new ee8(ge8Var, new fy7(this, 4));
        this.l = ge8Var.b(new gy7(this, i4));
    }

    public static tt7 l(onb onbVar, szc szcVar) {
        onbVar.getClass();
        Class<?> declaringClass = ((Method) onbVar.b()).getDeclaringClass();
        declaringClass.getClass();
        return ((ta0) szcVar.e).T(onbVar.f(), vfh.Q(t8f.b, declaringClass.isAnnotation(), null, 6));
    }

    public static pk1 u(szc szcVar, e36 e36Var, List list) {
        iy9 iy9Var;
        t99 t99Var;
        t99 t99VarE;
        ta0 ta0Var = (ta0) szcVar.e;
        x09 x09Var = ((mf7) szcVar.b).h;
        sd0 sd0VarQ1 = s72.q1(list);
        ArrayList arrayList = new ArrayList(t72.u(sd0VarQ1, 10));
        Iterator it = sd0VarQ1.iterator();
        boolean z = false;
        while (true) {
            iq4 iq4Var = (iq4) it;
            if (!iq4Var.b.hasNext()) {
                return new pk1(s72.j1(arrayList), z, 3);
            }
            n17 n17Var = (n17) iq4Var.next();
            int i = n17Var.a;
            unb unbVar = (unb) n17Var.b;
            px7 px7VarV = kn2.V(szcVar, unbVar);
            tf7 tf7VarQ = vfh.Q(t8f.b, false, null, 7);
            boolean z2 = unbVar.d;
            snb snbVar = unbVar.a;
            if (z2) {
                xmb xmbVar = snbVar instanceof xmb ? (xmb) snbVar : null;
                if (xmbVar == null) {
                    ho7.t(unbVar, "Vararg parameter should be an array: ");
                    return null;
                }
                jgf jgfVarS = ta0Var.S(xmbVar, tf7VarQ, true);
                iy9Var = new iy9(jgfVarS, x09Var.e.f(jgfVarS));
            } else {
                iy9Var = new iy9(ta0Var.T(snbVar, tf7VarQ), null);
            }
            tt7 tt7Var = (tt7) iy9Var.a();
            tt7 tt7Var2 = (tt7) iy9Var.b();
            if (pa7.t(e36Var.getName().b(), "equals") && list.size() == 1 && x09Var.e.p().equals(tt7Var)) {
                t99VarE = t99.e("other");
            } else {
                String str = unbVar.c;
                t99 t99VarD = str != null ? t99.d(str) : null;
                if (t99VarD == null) {
                    z = true;
                }
                if (t99VarD == null) {
                    t99VarE = t99.e("p" + i);
                } else {
                    t99Var = t99VarD;
                }
                arrayList.add(new xrf(e36Var, null, i, px7VarV, t99Var, tt7Var, false, false, false, tt7Var2, m8c.B(unbVar)));
            }
            t99Var = t99VarE;
            arrayList.add(new xrf(e36Var, null, i, px7VarV, t99Var, tt7Var, false, false, false, tt7Var2, m8c.B(unbVar)));
        }
    }

    @Override // defpackage.er8, defpackage.dr8
    public Collection a(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        return (Collection) this.d.invoke();
    }

    @Override // defpackage.er8, defpackage.dr8
    public Collection b(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        return !c().contains(t99Var) ? pu4.a : (Collection) this.h.d(t99Var);
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Set c() {
        return (Set) gdc.f(this.i, m[0]);
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Set d() {
        return (Set) gdc.f(this.k, m[2]);
    }

    @Override // defpackage.er8, defpackage.dr8
    public Collection f(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        return !g().contains(t99Var) ? pu4.a : (Collection) this.l.d(t99Var);
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Set g() {
        return (Set) gdc.f(this.j, m[1]);
    }

    public abstract Set h(ez3 ez3Var, a26 a26Var);

    public abstract Set i(ez3 ez3Var, a26 a26Var);

    public abstract im3 k();

    public abstract void m(LinkedHashSet linkedHashSet, t99 t99Var);

    public abstract void n(t99 t99Var, ArrayList arrayList);

    public abstract Set o(ez3 ez3Var);

    public abstract nw7 p();

    public abstract bm3 q();

    public boolean r(if7 if7Var) {
        return true;
    }

    public abstract hy7 s(onb onbVar, ArrayList arrayList, tt7 tt7Var, List list);

    public final if7 t(onb onbVar) {
        e09 e09Var;
        onbVar.getClass();
        szc szcVar = this.b;
        if7 if7VarR0 = if7.R0(q(), kn2.V(szcVar, onbVar), onbVar.c(), m8c.B(onbVar), ((im3) this.e.invoke()).b(onbVar.c()) != null && ((ArrayList) onbVar.g()).isEmpty());
        szcVar.getClass();
        szc szcVar2 = new szc((mf7) szcVar.b, new r1f(szcVar, if7VarR0, onbVar, 0), (lw7) szcVar.d);
        ArrayList typeParameters = onbVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(t72.u(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            c8f c8fVarI = ((f8f) szcVar2.c).i((tnb) it.next());
            c8fVarI.getClass();
            arrayList.add(c8fVarI);
        }
        pk1 pk1VarU = u(szcVar2, if7VarR0, onbVar.g());
        hy7 hy7VarS = s(onbVar, arrayList, l(onbVar, szcVar2), (List) pk1VarU.c);
        List list = hy7VarS.d;
        nw7 nw7VarP = p();
        ArrayList arrayList2 = hy7VarS.c;
        List list2 = hy7VarS.b;
        tt7 tt7Var = hy7VarS.a;
        boolean zIsAbstract = Modifier.isAbstract(((Method) onbVar.b()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) onbVar.b()).getModifiers());
        e09.a.getClass();
        if (zIsAbstract) {
            e09Var = e09.e;
        } else {
            e09Var = !zIsFinal ? e09.d : e09.b;
        }
        if7VarR0.Q0(null, nw7VarP, pu4.a, arrayList2, list2, tt7Var, e09Var, t4c.u(onbVar.e()), qu4.a);
        if7VarR0.E0 = Modifier.isNative(onbVar.a.getModifiers());
        if7VarR0.S0(false, pk1VarU.b);
        if (list.isEmpty()) {
            return if7VarR0;
        }
        s8f.i("Should not be called");
        return null;
    }

    public String toString() {
        return "Lazy scope for " + q();
    }

    public void j(t99 t99Var, ArrayList arrayList) {
    }
}
