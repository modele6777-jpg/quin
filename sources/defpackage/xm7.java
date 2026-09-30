package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class xm7 implements y12 {
    public static final rob a = new rob("<v#(\\d+)>");

    public static Method O(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Method methodO;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodP = P(cls, str, clsArr, cls2);
        if (methodP != null) {
            return methodP;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodO = O(superclass, str, clsArr, cls2, z)) != null) {
            return methodO;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        int length = interfaces.length;
        int i = 0;
        while (true) {
            Class<?> cls3 = null;
            if (i >= length) {
                return null;
            }
            Class<?> cls4 = interfaces[i];
            cls4.getClass();
            Method methodO2 = O(cls4, str, clsArr, cls2, z);
            if (methodO2 != null) {
                return methodO2;
            }
            if (z) {
                try {
                    cls3 = Class.forName(cls4.getName().concat("$DefaultImpls"), false, smb.d(cls4));
                } catch (ClassNotFoundException unused) {
                }
                if (cls3 != null) {
                    clsArr[0] = cls4;
                    Method methodP2 = P(cls3, str, clsArr, cls2);
                    if (methodP2 != null) {
                        return methodP2;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public static Method P(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (pa7.t(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (pa7.t(method.getName(), str) && pa7.t(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static void w(ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        int size;
        List listSubList;
        boolean zT = pa7.t(s72.H0(arrayList2), rp3.class);
        List list = arrayList2;
        if (zT) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        if (z2) {
            list = listSubList;
            size = list.size() - 1;
        } else {
            list = listSubList;
            size = list.size();
        }
        arrayList.addAll(list);
        int i = (size + 31) / 32;
        for (int i2 = 0; i2 < i; i2++) {
            Class cls = Integer.TYPE;
            cls.getClass();
            arrayList.add(cls);
        }
        arrayList.add(z ? rp3.class : Object.class);
    }

    public final Field C(String str) throws NoSuchFieldException {
        str.getClass();
        Class cls = ((nm7) this).b;
        Field declaredField = cls.getDeclaredField(str);
        if (declaredField != null) {
            return declaredField;
        }
        StringBuilder sb = new StringBuilder("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(cls);
        sb.append(':');
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        sb.append(declaredFields.length == 0 ? " no fields found" : "\n".concat(qd0.t0(declaredFields, "\n", null, null, tj7.y, 30)));
        throw new pt7(sb.toString());
    }

    public final Method F(String str, String str2) {
        Method methodO;
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        w84 w84VarM = sqf.m(smb.d(d()), str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) w84VarM.b).toArray(new Class[0]);
        Class cls = (Class) w84VarM.c;
        cls.getClass();
        Method methodO2 = O(M(), str, clsArr, cls, false);
        if (methodO2 != null) {
            return methodO2;
        }
        if (!M().isInterface() || (methodO = O(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return methodO;
    }

    public final uq7 G(String str, String str2) {
        str.getClass();
        str2.getClass();
        List list = (List) ((mn7) ((nn7) this).c.getValue()).c.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x72.g0(arrayList, ((tq7) it.next()).b);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            uq7 uq7Var = (uq7) obj;
            if (pa7.t(uq7Var.b, str) && pa7.t(abg.s(uq7Var, this), str2)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            StringBuilder sbO = ib8.o("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
            sbO.append(this);
            throw new pt7(sbO.toString());
        }
        if (arrayList2.size() <= 1) {
            return (uq7) s72.X0(arrayList2);
        }
        StringBuilder sbO2 = ib8.o("Property '", str, "' (JVM signature: ", str2, ") resolved in several methods in ");
        sbO2.append(this);
        throw new pt7(sbO2.toString());
    }

    public abstract Collection H();

    public abstract Collection I();

    public abstract Collection J(t99 t99Var);

    public abstract wxa K(int i);

    public abstract uq7 L(int i);

    public Class M() {
        Class clsD = d();
        List list = smb.a;
        clsD.getClass();
        Class cls = (Class) smb.c.get(clsD);
        return cls == null ? d() : cls;
    }

    public abstract Collection N(t99 t99Var);

    public final gt7 y(int i, String str) {
        str.getClass();
        uq7 uq7VarL = L(i);
        if (uq7VarL == null) {
            return null;
        }
        if (uq7VarL.f == null) {
            return si0.q.F(si0.a[36], uq7VarL) ? new rs7(this, str, null, uq7VarL, dm7.j) : new gt7(this, str, null, uq7VarL, dm7.j);
        }
        throw new pt7(ks0.l(new StringBuilder("Local property "), uq7VarL.b, " is an extension, which is not yet supported"));
    }

    public final Method z(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(d());
        }
        w84 w84VarM = sqf.m(smb.d(d()), str2, true);
        w(arrayList, (ArrayList) w84VarM.b, false, z2);
        Class clsM = M();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) w84VarM.c;
        cls.getClass();
        return O(clsM, strConcat, clsArr, cls, z);
    }
}
