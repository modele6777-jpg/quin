package defpackage;

import ai.askquin.MainActivity;
import ai.askquin.qa.transport.QaBridgeService;
import ai.askquin.ui.share.ShareActivity;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class wj7 implements x16 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ wj7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:54:0x016e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0172  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Iterable] */
    @Override // defpackage.x16
    public final Object invoke() {
        ?? H;
        List listAsList;
        sug sugVar;
        String property;
        int i;
        Executable executable;
        int i2 = this.a;
        List listG0 = pu4.a;
        int length = 0;
        Object obj = this.b;
        switch (i2) {
            case 0:
                yj7 yj7Var = (yj7) obj;
                vj7 vj7Var = yj7Var.f;
                if (vj7Var == null) {
                    qc0.i("JvmBuiltins instance has not been initialized properly");
                    return null;
                }
                xj7 xj7Var = (xj7) vj7Var.invoke();
                yj7Var.f = null;
                return xj7Var;
            case 1:
                zk7 zk7Var = (zk7) obj;
                yx7 yx7Var = zk7Var.c;
                Collection collectionValues = ((Map) gdc.f(yx7Var.x, yx7.Y[0])).values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    p04 p04VarA = ((mf7) zk7Var.b.b).d.a(yx7Var, (cob) it.next());
                    if (p04VarA != null) {
                        arrayList.add(p04VarA);
                    }
                }
                return (dr8[]) sfc.l(arrayList).toArray(new dr8[0]);
            case 2:
                mn7 mn7Var = (mn7) obj;
                fob fobVar = mn7Var.d;
                wn7 wn7Var = mn7.g[0];
                cob cobVar = (cob) fobVar.invoke();
                if (cobVar == null) {
                    return cr8.b;
                }
                fob fobVar2 = mn7Var.a;
                wn7 wn7Var2 = wm7.b[0];
                Object objInvoke = fobVar2.invoke();
                objInvoke.getClass();
                gg7 gg7Var = ((k8c) objInvoke).b;
                h04 h04Var = (h04) gg7Var.b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) gg7Var.d;
                Class cls = cobVar.a;
                j22 j22VarA = smb.a(cls);
                Object obj2 = concurrentHashMap.get(j22VarA);
                if (obj2 == null) {
                    dx5 dx5Var = smb.a(cls).a;
                    zr7 zr7Var = cobVar.b;
                    yr7 yr7Var = zr7Var.a;
                    yr7 yr7Var2 = yr7.MULTIFILE_CLASS;
                    if (yr7Var == yr7Var2) {
                        String[] strArr = zr7Var.c;
                        if (yr7Var != yr7Var2) {
                            strArr = null;
                        }
                        if (strArr != null) {
                            listAsList = Arrays.asList(strArr);
                            listAsList.getClass();
                        } else {
                            listAsList = null;
                        }
                        if (listAsList != null) {
                            listG0 = listAsList;
                        }
                        H = new ArrayList();
                        Iterator it2 = listG0.iterator();
                        while (it2.hasNext()) {
                            dx5 dx5Var2 = new dx5(gk7.b((String) it2.next()).a.replace('/', '.'));
                            dx5 dx5VarB = dx5Var2.b();
                            t99 t99VarG = dx5Var2.a.g();
                            dx5 dx5Var3 = dx5.c;
                            ex5 ex5Var = cn1.V(t99VarG).a;
                            ex5Var.c();
                            g5b g5bVar = (g5b) gg7Var.c;
                            h04Var.c().c.getClass();
                            fv8.g.getClass();
                            String strZ = c5e.z(ex5Var.a, '.', '$');
                            if (!dx5VarB.a.c()) {
                                strZ = dx5VarB + '.' + strZ;
                            }
                            ssg ssgVarP = g5bVar.p(strZ);
                            cob cobVar2 = ssgVarP != null ? (cob) ssgVarP.b : null;
                            if (cobVar2 != null) {
                                H.add(cobVar2);
                            }
                        }
                    } else {
                        H = t72.H(cobVar);
                    }
                    su4 su4Var = new su4(h04Var.c().b, dx5Var, 0);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = H.iterator();
                    while (it3.hasNext()) {
                        p04 p04VarA2 = h04Var.a(su4Var, (cob) it3.next());
                        if (p04VarA2 != null) {
                            arrayList2.add(p04VarA2);
                        }
                    }
                    dr8 dr8VarZ = lmg.Z("package " + dx5Var + " (" + cobVar + ')', s72.j1(arrayList2));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(j22VarA, dr8VarZ);
                    obj2 = objPutIfAbsent == null ? dr8VarZ : objPutIfAbsent;
                }
                obj2.getClass();
                return (dr8) obj2;
            case 3:
                return new qs7((rs7) obj);
            case 4:
                return new ss7((ts7) obj);
            case 5:
                return new us7((vs7) obj);
            case 6:
                xs7 xs7Var = (xs7) obj;
                Type typeF = feg.F(xs7Var);
                return typeF == null ? xs7Var.h().getReturnType() : typeF;
            case 7:
                ys7 ys7Var = (ys7) obj;
                ms7 ms7Var = ys7Var.a;
                if ((ms7Var.s() instanceof nn7) || ynb.R(ms7Var)) {
                    return (Type) ms7Var.h().a().get(ys7Var.c);
                }
                StringBuilder sb = new StringBuilder("Only constructors and top-level callables are supported for now: ");
                sb.append(ms7Var.s());
                ho7.s(sb, ms7Var.getName(), ys7Var.e);
                return null;
            case 8:
                return urg.p((bt7) obj, true);
            case 9:
                return new lt7((mt7) obj);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((ey7) obj).o.f.getClass();
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                xt7 xt7Var = (xt7) ((c28) obj).c.invoke();
                xt7Var.getClass();
                return (tt7) xt7Var;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                MainActivity mainActivity = (MainActivity) obj;
                return z5c.G(job.a.b(wk8.class), mainActivity.g(), null, mainActivity.e(), cgg.A(mainActivity), null);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                x16 x16Var = ((ve9) obj).b;
                if (x16Var != null) {
                    return (List) x16Var.invoke();
                }
                return null;
            case 14:
                return cgg.A((QaBridgeService) obj).g(job.a.b(x2b.class), null, null);
            case 15:
                aob aobVar = (aob) obj;
                if (ynb.P(aobVar.d())) {
                    if (!(aobVar instanceof ys7)) {
                        return listG0;
                    }
                    ys7 ys7Var2 = (ys7) aobVar;
                    ArrayList arrayList3 = ys7Var2.b.e;
                    ArrayList arrayList4 = new ArrayList(t72.u(arrayList3, 10));
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(abg.X((mp7) it4.next(), smb.d(ys7Var2.a.s().d())));
                    }
                    return arrayList4;
                }
                Member memberB = aobVar.d().h().b();
                int i3 = 7;
                if (memberB instanceof Method) {
                    if (!Modifier.isStatic(((Method) memberB).getModifiers())) {
                        ho7.y(memberB, "Only static methods are supported for now: ");
                        return null;
                    }
                    sugVar = new sug((Executable) memberB, aobVar.m(), i3);
                    i = sugVar.b;
                    executable = (Executable) sugVar.c;
                    if (executable instanceof Method) {
                        Annotation[] annotationArr = ((Method) executable).getParameterAnnotations()[i];
                        annotationArr.getClass();
                        listG0 = qd0.G0(annotationArr);
                    } else if (executable instanceof Constructor) {
                        Annotation[] annotationArr2 = ((Constructor) executable).getParameterAnnotations()[i];
                        annotationArr2.getClass();
                        listG0 = qd0.G0(annotationArr2);
                    }
                    return sqf.t(listG0);
                }
                if (!(memberB instanceof Constructor)) {
                    ho7.m(memberB, "Unsupported parameter owner: ");
                    return null;
                }
                Constructor constructor = (Constructor) memberB;
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                if (job.a.b(declaringClass).j() && (property = System.getProperty("java.version")) != null && c5e.C(property, "1.", false)) {
                    length = -1;
                } else if (constructor.getDeclaringClass().isEnum()) {
                    length = (constructor.getParameterAnnotations().length - constructor.getParameterTypes().length) + 2;
                }
                sugVar = new sug((Executable) memberB, aobVar.m() + length, i3);
                i = sugVar.b;
                executable = (Executable) sugVar.c;
                if (executable instanceof Method) {
                    Annotation[] annotationArr3 = ((Method) executable).getParameterAnnotations()[i];
                    annotationArr3.getClass();
                    listG0 = qd0.G0(annotationArr3);
                } else if (executable instanceof Constructor) {
                    Annotation[] annotationArr4 = ((Constructor) executable).getParameterAnnotations()[i];
                    annotationArr4.getClass();
                    listG0 = qd0.G0(annotationArr4);
                }
                return sqf.t(listG0);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return (dr8) ((ufc) obj).b.d(zt7.p);
            case 17:
                ShareActivity shareActivity = (ShareActivity) obj;
                return z5c.G(job.a.b(hod.class), shareActivity.g(), null, shareActivity.e(), cgg.A(shareActivity), null);
            case 18:
                return fbc.k((c8f) ((dzd) obj).b);
            case 19:
                return new q8f(((q8f) obj).a);
            case 20:
                w7e w7eVar = (w7e) obj;
                return w7eVar.i(mxb.f(w7eVar.b, null, 3));
            case 21:
                return sy4.c(qy4.L0, ((vea) obj).toString());
            case 22:
                sz9 sz9Var = (sz9) ((s69) obj);
                sz9Var.k(sz9Var.j() + 1);
                return wef.a;
            case 23:
                return (List) ((wrf) obj).X.getValue();
            default:
                return new ql2[((wj5[]) obj).length];
        }
    }

    public /* synthetic */ wj7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }
}
