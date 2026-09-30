package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ox7 implements wna {
    public static final /* synthetic */ wn7[] h = {new aya(ox7.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0), new aya(ox7.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new aya(ox7.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    public final szc a;
    public final tmb b;
    public final de8 c;
    public final ee8 d;
    public final l8c e;
    public final ee8 f;
    public final boolean g;

    public ox7(tmb tmbVar, szc szcVar, boolean z) {
        szcVar.getClass();
        tmbVar.getClass();
        this.a = szcVar;
        this.b = tmbVar;
        ge8 ge8Var = ((mf7) szcVar.b).a;
        this.c = new de8(ge8Var, new nx7(this, 0));
        this.d = new ee8(ge8Var, new nx7(this, 1));
        this.e = m8c.B(tmbVar);
        this.f = new ee8(ge8Var, new nx7(this, 2));
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bl2 a(umb umbVar) {
        snb xmbVar;
        tt7 tt7VarH;
        if (umbVar instanceof mnb) {
            return af8.r(null, ((mnb) umbVar).b);
        }
        if (umbVar instanceof knb) {
            Enum r6 = ((knb) umbVar).b;
            Class<?> enclosingClass = r6.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            enclosingClass.getClass();
            return new rx4(smb.a(enclosingClass), t99.e(r6.name()));
        }
        boolean z = umbVar instanceof wmb;
        szc szcVar = this.a;
        if (z) {
            wmb wmbVar = (wmb) umbVar;
            t99 t99Var = wmbVar.a;
            if (t99Var == null) {
                t99Var = pj7.b;
            }
            t99Var.getClass();
            ArrayList arrayListA = wmbVar.a();
            if (!i7h.x((tjd) gdc.f(this.d, h[1]))) {
                u09 u09VarD = qz3.d(this);
                u09VarD.getClass();
                xrf xrfVarY = cn1.y(t99Var, u09VarD);
                if (xrfVarY == null || (tt7VarH = xrfVarY.getType()) == null) {
                    tt7VarH = ((mf7) szcVar.b).h.e.h(sy4.c(qy4.Q0, new String[0]));
                }
                ArrayList arrayList = new ArrayList(t72.u(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    bl2 bl2VarA = a((umb) it.next());
                    if (bl2VarA == null) {
                        bl2VarA = new sj9(null);
                    }
                    arrayList.add(bl2VarA);
                }
                return new z8f(arrayList, tt7VarH);
            }
        } else {
            if (umbVar instanceof vmb) {
                return new f10((Object) new ox7(new tmb(((vmb) umbVar).b), szcVar, false));
            }
            if (umbVar instanceof gnb) {
                Class cls = ((gnb) umbVar).b;
                if (cls.isPrimitive()) {
                    xmbVar = new qnb(cls);
                } else if ((cls instanceof GenericArrayType) || cls.isArray()) {
                    xmbVar = new xmb(cls);
                } else {
                    xmbVar = cls instanceof WildcardType ? new vnb((WildcardType) cls) : new hnb(cls);
                }
                tt7 tt7VarT = ((ta0) szcVar.e).T(xmbVar, vfh.Q(t8f.b, false, null, 7));
                if (!i7h.x(tt7VarT)) {
                    tt7 tt7VarB = tt7VarT;
                    int i = 0;
                    while (xr7.z(tt7VarB)) {
                        tt7VarB = ((i8f) s72.X0(tt7VarB.Z())).b();
                        tt7VarB.getClass();
                        i++;
                    }
                    y22 y22VarM = tt7VarB.c0().m();
                    if (y22VarM instanceof u09) {
                        j22 j22VarF = qz3.f(y22VarM);
                        return j22VarF == null ? new rm7(new om7(tt7VarT)) : new rm7(j22VarF, i);
                    }
                    if (y22VarM instanceof c8f) {
                        dx5 dx5VarI = syd.a.i();
                        return new rm7(new j22(dx5VarI.b(), dx5VarI.a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.u00
    public final ntd e() {
        return this.e;
    }

    @Override // defpackage.u00
    public final dx5 f() {
        wn7 wn7Var = h[0];
        de8 de8Var = this.c;
        de8Var.getClass();
        wn7Var.getClass();
        return (dx5) de8Var.invoke();
    }

    @Override // defpackage.u00
    public final Map g() {
        return (Map) gdc.f(this.f, h[2]);
    }

    @Override // defpackage.u00
    public final tt7 getType() {
        return (tjd) gdc.f(this.d, h[1]);
    }

    public final String toString() {
        return jz3.c.o(this, null);
    }
}
