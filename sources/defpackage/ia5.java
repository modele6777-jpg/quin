package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ia5 {
    public static final va2 a = new va2(0, new a26[]{z03.F0, z03.G0});

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (defpackage.i7h.x(r0) == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.yn7 a(defpackage.yn7 r7, java.lang.String r8) {
        /*
            boolean r0 = r7 instanceof defpackage.j2
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r7
            j2 r0 = (defpackage.j2) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L2a
            um7 r2 = r0.B()
            boolean r2 = r2 instanceof defpackage.ry4
            if (r2 != 0) goto L29
            boolean r2 = r0 instanceof defpackage.zy3
            if (r2 == 0) goto L1b
            zy3 r0 = (defpackage.zy3) r0
            goto L1c
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L2a
            tt7 r0 = r0.b
            if (r0 == 0) goto L2a
            boolean r0 = defpackage.i7h.x(r0)
            r2 = 1
            if (r0 != r2) goto L2a
        L29:
            return r7
        L2a:
            um7 r0 = r7.B()
            if (r0 == 0) goto L6e
            java.util.List r2 = r7.A()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.t72.u(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L43:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r2.next()
            do7 r4 = (defpackage.do7) r4
            yn7 r5 = r4.b
            if (r5 == 0) goto L58
            yn7 r5 = a(r5, r8)
            goto L59
        L58:
            r5 = r1
        L59:
            io7 r4 = r4.a
            do7 r6 = new do7
            r6.<init>(r5, r4)
            r3.add(r6)
            goto L43
        L64:
            java.util.List r7 = r7.getAnnotations()
            r8 = 0
            j2 r7 = defpackage.qn4.w(r0, r3, r8, r7)
            return r7
        L6e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type '"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.Class r7 = r7.getClass()
            kob r2 = defpackage.job.a
            em7 r7 = r2.b(r7)
            java.lang.String r2 = "' ("
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = ") which belongs to member '"
            r1.append(r7)
            r1.append(r8)
            r7 = 39
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia5.a(yn7, java.lang.String):yn7");
    }

    public static final Collection b(em7 em7Var) {
        fob fobVar = ((jm7) ((nm7) em7Var).c.getValue()).s;
        wn7 wn7Var = jm7.w[16];
        Object objInvoke = fobVar.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    public static final ha5 c(em7 em7Var) {
        if (em7Var instanceof nm7) {
            fob fobVar = ((jm7) ((nm7) em7Var).c.getValue()).u;
            wn7 wn7Var = jm7.w[18];
            Object objInvoke = fobVar.invoke();
            objInvoke.getClass();
            return (ha5) objInvoke;
        }
        if (em7Var instanceof j69) {
            return c(((j69) em7Var).a);
        }
        cva.k(job.a.b(em7Var.getClass()), "Unknown type ");
        return null;
    }

    public static final boolean d(nm7 nm7Var, wnb wnbVar) {
        Field fieldZ;
        Class<?> declaringClass;
        if (wnbVar.getVisibility() == jo7.d) {
            return true;
        }
        if (e(wnbVar) && nm7Var.S() == k22.INTERFACE) {
            return !(wnbVar instanceof wn7) || (fieldZ = abg.z((wn7) wnbVar)) == null || (declaringClass = fieldZ.getDeclaringClass()) == null || declaringClass.getAnnotation(Metadata.class) != null;
        }
        return false;
    }

    public static final boolean e(wnb wnbVar) {
        wnbVar.getClass();
        Boolean bool = ((xnb) wnbVar).a.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        aob aobVar = (aob) s72.x0(wnbVar.a());
        return (aobVar != null ? aobVar.t() : null) != on7.a;
    }

    public static final void f(String str) {
        str.getClass();
        throw new IllegalStateException(("Star projection in top level type is not possible. Star projection appeared in the following container: '" + str + '\'').toString());
    }

    public static final fo7 g(List list, List list2) {
        list.getClass();
        list2.getClass();
        if (list.size() != list2.size()) {
            return null;
        }
        if (list.isEmpty()) {
            return fo7.c;
        }
        ArrayList<iy9> arrayListR1 = s72.r1(list, list2);
        int iF = bm8.F(t72.u(arrayListR1, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
        for (iy9 iy9Var : arrayListR1) {
            ao7 ao7Var = (ao7) iy9Var.a();
            ao7 ao7Var2 = (ao7) iy9Var.b();
            do7 do7Var = do7.c;
            iy9 iy9Var2 = new iy9(ao7Var, db6.b0(qn4.x(ao7Var2, null, false, 7)));
            linkedHashMap.put(iy9Var2.d(), iy9Var2.e());
        }
        return new fo7(linkedHashMap, false);
    }

    public static final ux4 h(wnb wnbVar, ok8 ok8Var) {
        pid pidVar;
        Field fieldZ;
        Class<?> declaringClass;
        List parameters = wnbVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((aob) obj).t() != on7.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((aob) it.next()).u());
        }
        boolean z = wnbVar instanceof wn7;
        if (z && (fieldZ = abg.z((wn7) wnbVar)) != null && (declaringClass = fieldZ.getDeclaringClass()) != null && declaringClass.getAnnotation(Metadata.class) == null) {
            pidVar = pid.c;
        } else if (z) {
            pidVar = pid.b;
        } else {
            if (!(wnbVar instanceof ym7)) {
                cva.k(job.a.b(wnbVar.getClass()), "Unknown kind for ");
                return null;
            }
            pidVar = pid.a;
        }
        pid pidVar2 = pidVar;
        ym7 ym7Var = wnbVar instanceof ym7 ? (ym7) wnbVar : null;
        Method methodA = ym7Var != null ? abg.A(ym7Var) : null;
        Type[] genericParameterTypes = methodA != null ? methodA.getGenericParameterTypes() : null;
        if (genericParameterTypes == null) {
            genericParameterTypes = new Type[0];
        }
        List listG0 = qd0.G0(genericParameterTypes);
        Class<?>[] parameterTypes = methodA != null ? methodA.getParameterTypes() : null;
        if (parameterTypes == null) {
            parameterTypes = new Class[0];
        }
        return new ux4(pidVar2, wnbVar.getName(), methodA != null ? methodA.getName() : null, wnbVar.getTypeParameters(), arrayList2, qd0.G0(parameterTypes), listG0, e(wnbVar), ok8Var);
    }
}
