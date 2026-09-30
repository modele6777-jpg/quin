package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tj7 implements a26 {
    public final /* synthetic */ int a;
    public static final tj7 b = new tj7(0);
    public static final tj7 c = new tj7(1);
    public static final tj7 d = new tj7(2);
    public static final tj7 e = new tj7(3);
    public static final tj7 f = new tj7(4);
    public static final tj7 g = new tj7(5);
    public static final tj7 v = new tj7(6);
    public static final tj7 w = new tj7(7);
    public static final tj7 x = new tj7(8);
    public static final tj7 y = new tj7(9);
    public static final tj7 z = new tj7(10);
    public static final tj7 X = new tj7(11);
    public static final tj7 Y = new tj7(12);
    public static final tj7 Z = new tj7(13);
    public static final tj7 E0 = new tj7(14);
    public static final tj7 F0 = new tj7(15);
    public static final tj7 G0 = new tj7(16);
    public static final tj7 H0 = new tj7(17);
    public static final tj7 I0 = new tj7(18);
    public static final tj7 J0 = new tj7(19);
    public static final tj7 K0 = new tj7(20);
    public static final tj7 L0 = new tj7(21);
    public static final tj7 M0 = new tj7(22);
    public static final tj7 N0 = new tj7(23);
    public static final tj7 O0 = new tj7(24);
    public static final tj7 P0 = new tj7(25);
    public static final tj7 Q0 = new tj7(26);
    public static final tj7 R0 = new tj7(27);
    public static final tj7 S0 = new tj7(28);
    public static final tj7 T0 = new tj7(29);

    public /* synthetic */ tj7(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        tjd tjdVarS;
        jgf jgfVarZ;
        tt7 returnType;
        j22 j22VarF;
        tt7 returnType2;
        int i = this.a;
        wef wefVar = wef.a;
        boolean zU = false;
        switch (i) {
            case 0:
                w09 w09Var = (w09) obj;
                yx4 yx4Var = uj7.d;
                w09Var.getClass();
                List list = (List) gdc.f(w09Var.W(uj7.f).f, n18.w[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof k51) {
                        arrayList.add(obj2);
                    }
                }
                return (bm3) s72.v0(arrayList);
            case 1:
                Class<?> returnType3 = ((Method) obj).getReturnType();
                returnType3.getClass();
                return smb.b(returnType3);
            case 2:
                o85 o85Var = (o85) obj;
                o85 o85Var2 = sl7.a;
                o85Var.getClass();
                o85Var.a(rl7.a);
                o85Var.a(rl7.b);
                o85Var.a(rl7.c);
                o85Var.a(rl7.d);
                o85Var.a(rl7.e);
                o85Var.a(rl7.f);
                o85Var.a(rl7.g);
                o85Var.a(rl7.h);
                o85Var.a(rl7.i);
                o85Var.a(rl7.j);
                o85Var.a(rl7.k);
                o85Var.a(rl7.l);
                o85Var.a(zyc.a);
                return wefVar;
            case 3:
                wxa wxaVar = (wxa) obj;
                rob robVar = xm7.a;
                wxaVar.getClass();
                return jz3.e.n(wxaVar) + " | " + n8c.b(wxaVar).r();
            case 4:
                sq7 sq7Var = (sq7) obj;
                rob robVar2 = xm7.a;
                sq7Var.getClass();
                return sq7Var.b + " | " + cn1.C(sq7Var).a;
            case 5:
                c36 c36Var = (c36) obj;
                rob robVar3 = xm7.a;
                c36Var.getClass();
                return jz3.e.n(c36Var) + " | " + n8c.c(c36Var).i();
            case 6:
                Method method = (Method) obj;
                rob robVar4 = xm7.a;
                method.getClass();
                return o8c.n(method);
            case 7:
                lq7 lq7Var = (lq7) obj;
                rob robVar5 = xm7.a;
                lq7Var.getClass();
                return String.valueOf(cn1.B(lq7Var).a);
            case 8:
                Constructor constructor = (Constructor) obj;
                rob robVar6 = xm7.a;
                constructor.getClass();
                return o8c.l(constructor);
            case 9:
                Field field = (Field) obj;
                rob robVar7 = xm7.a;
                return field.getName() + ' ' + field.getType();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                yn7 yn7Var = (yn7) obj;
                yn7Var.getClass();
                um7 um7VarB = yn7Var.B();
                ao7 ao7Var = um7VarB instanceof ao7 ? (ao7) um7VarB : null;
                if (ao7Var != null) {
                    return (yn7) s72.x0(ao7Var.getUpperBounds());
                }
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                iy9 iy9Var = (iy9) obj;
                iy9Var.getClass();
                return ((String) iy9Var.a()) + " = " + ((gq7) iy9Var.b());
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Number) obj).intValue();
                return null;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                nnb nnbVar = (nnb) obj;
                int i2 = wx7.v;
                nnbVar.getClass();
                return Boolean.valueOf(!Modifier.isStatic(nnbVar.b().getModifiers()));
            case 14:
                hjd hjdVar = (hjd) obj;
                wn7[] wn7VarArr = iy7.m;
                hjdVar.getClass();
                return hjdVar;
            case 15:
                nnb nnbVar2 = (nnb) obj;
                int i3 = ky7.p;
                nnbVar2.getClass();
                return Boolean.valueOf(Modifier.isStatic(nnbVar2.b().getModifiers()));
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                dr8 dr8Var = (dr8) obj;
                int i4 = ky7.p;
                dr8Var.getClass();
                return dr8Var.g();
            case 17:
                int i5 = ky7.p;
                y22 y22VarM = ((tt7) obj).c0().m();
                if (y22VarM instanceof u09) {
                    return (u09) y22VarM;
                }
                return null;
            case 18:
                ((Number) obj).intValue();
                return null;
            case 19:
                ((Number) obj).intValue();
                return null;
            case 20:
                qk6 qk6Var = qk6.J0;
                ((t99) obj).getClass();
                return Boolean.TRUE;
            case 21:
                ((l1f) obj).getClass();
                return wefVar;
            case 22:
                c36 c36Var2 = (c36) obj;
                List list2 = sr9.a;
                c36Var2.getClass();
                List listG = c36Var2.G();
                listG.getClass();
                xrf xrfVar = (xrf) s72.H0(listG);
                if (xrfVar == null || qz3.a(xrfVar) || xrfVar.y != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 23:
                c36 c36Var3 = (c36) obj;
                List list3 = sr9.a;
                c36Var3.getClass();
                bm3 bm3VarK = c36Var3.k();
                bm3VarK.getClass();
                if (bm3VarK instanceof u09) {
                    t99 t99Var = xr7.e;
                    if (xr7.b((u09) bm3VarK, syd.a)) {
                        return null;
                    }
                }
                Collection collectionL = c36Var3.l();
                collectionL.getClass();
                Collection collection = collectionL;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        bm3 bm3VarK2 = ((c36) it.next()).k();
                        bm3VarK2.getClass();
                        if (bm3VarK2 instanceof u09) {
                            t99 t99Var2 = xr7.e;
                            if (xr7.b((u09) bm3VarK2, syd.a)) {
                                return null;
                            }
                        }
                    }
                }
                bm3 bm3VarK3 = c36Var3.k();
                u09 u09Var = bm3VarK3 instanceof u09 ? (u09) bm3VarK3 : null;
                if (u09Var != null) {
                    if (!n37.b(u09Var)) {
                        u09Var = null;
                    }
                    if (u09Var != null && (tjdVarS = u09Var.S()) != null && (jgfVarZ = o7c.z(tjdVarS)) != null && (returnType = c36Var3.getReturnType()) != null && pa7.t(((cm3) c36Var3).getName(), tr9.d)) {
                        t99 t99Var3 = xr7.e;
                        if ((xr7.C(returnType, syd.h) || xr7.F(returnType)) && c36Var3.G().size() == 1) {
                            tt7 type = ((xrf) c36Var3.G().get(0)).getType();
                            type.getClass();
                            if (pa7.t(o7c.z(type), jgfVarZ) && c36Var3.T().isEmpty() && c36Var3.O() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                bm3 bm3VarK4 = c36Var3.k();
                bm3VarK4.getClass();
                if (n37.b(bm3VarK4)) {
                    jz3 jz3Var = jz3.d;
                    bm3 bm3VarK5 = c36Var3.k();
                    bm3VarK5.getClass();
                    tjd tjdVarS2 = ((u09) bm3VarK5).S();
                    tjdVarS2.getClass();
                    sb.append(" or define ''equals(other: " + jz3Var.P(o7c.z(tjdVarS2)) + "): Boolean''");
                }
                return sb.toString();
            case 24:
                c36 c36Var4 = (c36) obj;
                List list4 = sr9.a;
                c36Var4.getClass();
                nw7 nw7VarK = c36Var4.K();
                if (nw7VarK == null) {
                    nw7VarK = c36Var4.O();
                }
                if (nw7VarK != null) {
                    tt7 returnType4 = c36Var4.getReturnType();
                    if (returnType4 != null ? o7c.u(returnType4, nw7VarK.getType()) : false) {
                        return null;
                    }
                    ejb ejbVarD0 = nw7VarK.D0();
                    ejbVarD0.getClass();
                    if (ejbVarD0 instanceof xy6) {
                        u09 u09Var2 = ((xy6) ejbVarD0).a;
                        if (u09Var2.w() && (j22VarF = qz3.f(u09Var2)) != null) {
                            w09 w09VarC = oz3.c(u09Var2);
                            w09VarC.getClass();
                            y22 y22VarQ = od4.q(w09VarC, j22VarF);
                            s04 s04Var = y22VarQ instanceof s04 ? (s04) y22VarQ : null;
                            if (s04Var != null && (returnType2 = c36Var4.getReturnType()) != null) {
                                zU = o7c.u(returnType2, s04Var.E0());
                            }
                        }
                    }
                    if (zU) {
                        return null;
                    }
                }
                return "receiver must be a supertype of the return type";
            case 25:
                kw9 kw9Var = (kw9) obj;
                kw9Var.getClass();
                return ((lw9) kw9Var).f;
            case 26:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 27:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 28:
                Context context3 = (Context) obj;
                context3.getClass();
                if (context3 instanceof ContextWrapper) {
                    return ((ContextWrapper) context3).getBaseContext();
                }
                return null;
            default:
                Context context4 = (Context) obj;
                context4.getClass();
                if (context4 instanceof ContextWrapper) {
                    return ((ContextWrapper) context4).getBaseContext();
                }
                return null;
        }
    }
}
