package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sqf {
    public static final dx5 a = new dx5("kotlin.jvm.JvmStatic");
    public static final String b;

    static {
        StringBuilder sb = new StringBuilder();
        l36 l36Var = l36.d;
        sb.append(l36Var.a.a.a);
        sb.append('.');
        sb.append(l36Var.b);
        b = sb.toString();
    }

    public static final wnb a(Object obj) {
        if (obj instanceof ry7) {
            return a(((ry7) obj).f());
        }
        if (obj instanceof wnb) {
            return (wnb) obj;
        }
        if (obj instanceof ga1) {
            cm7 cm7VarCompute = ((ga1) obj).compute();
            if (cm7VarCompute == obj) {
                cm7VarCompute = null;
            }
            if (cm7VarCompute != null) {
                return a(cm7VarCompute);
            }
        }
        return null;
    }

    public static final znb b(Object obj) {
        if (obj instanceof znb) {
            return (znb) obj;
        }
        if (obj instanceof g36) {
            cm7 cm7VarCompute = ((g36) obj).compute();
            if (cm7VarCompute instanceof znb) {
                return (znb) cm7VarCompute;
            }
        }
        return null;
    }

    public static final bob c(Object obj) {
        if (obj instanceof ry7) {
            return c(((ry7) obj).f());
        }
        if (obj instanceof bob) {
            return (bob) obj;
        }
        if (obj instanceof cya) {
            cm7 cm7VarCompute = ((cya) obj).compute();
            if (cm7VarCompute == obj) {
                cm7VarCompute = null;
            }
            if (cm7VarCompute != null) {
                return c(cm7VarCompute);
            }
        }
        return null;
    }

    public static final List d(f00 f00Var) {
        Annotation annotationP;
        f00Var.getClass();
        h10<u00> annotations = f00Var.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (u00 u00Var : annotations) {
            ntd ntdVarE = u00Var.e();
            if (ntdVarE instanceof rmb) {
                annotationP = ((rmb) ntdVarE).a;
            } else if (ntdVarE instanceof l8c) {
                jnb jnbVar = ((l8c) ntdVarE).a;
                tmb tmbVar = jnbVar instanceof tmb ? (tmb) jnbVar : null;
                annotationP = tmbVar != null ? tmbVar.a : null;
            } else {
                annotationP = p(u00Var);
            }
            if (annotationP != null) {
                arrayList.add(annotationP);
            }
        }
        return t(arrayList);
    }

    public static final Class e(Class cls) {
        cls.getClass();
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static final Object f(Type type) {
        type.getClass();
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (cls.equals(Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (cls.equals(Character.TYPE)) {
                    return (char) 0;
                }
                if (cls.equals(Byte.TYPE)) {
                    return (byte) 0;
                }
                if (cls.equals(Short.TYPE)) {
                    return (short) 0;
                }
                if (cls.equals(Integer.TYPE)) {
                    return 0;
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (cls.equals(Long.TYPE)) {
                    return 0L;
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (cls.equals(Void.TYPE)) {
                    qc0.p("Parameter with void type is illegal");
                    return null;
                }
                s8f.n(type, "Unknown primitive: ");
            }
        }
        return null;
    }

    public static final ca1 g(Class cls, f04 f04Var, q56 q56Var, u99 u99Var, bu3 bu3Var, ay0 ay0Var, l26 l26Var) {
        List listD0;
        q56Var.getClass();
        u99Var.getClass();
        ay0Var.getClass();
        k8c k8cVarA = v09.a(cls);
        if (q56Var instanceof dza) {
            listD0 = ((dza) q56Var).m0();
        } else {
            if (!(q56Var instanceof kza)) {
                pd4.i(q56Var, "Unsupported message: ");
                return null;
            }
            listD0 = ((kza) q56Var).D0();
        }
        List list = listD0;
        tz3 tz3Var = k8cVarA.a;
        w09 w09Var = tz3Var.b;
        otf otfVar = otf.b;
        list.getClass();
        return (ca1) l26Var.z(new yq8(new lp0(tz3Var, u99Var, w09Var, bu3Var, otfVar, ay0Var, f04Var, null, list)), q56Var);
    }

    public static final nw7 h(rx3 rx3Var) {
        rx3Var.getClass();
        ca1 ca1VarG = rx3Var.G();
        dm7 dm7Var = rx3Var.a;
        if (dm7Var.d == null || !ia5.e(rx3Var)) {
            if (dm7Var.d != null && !ia5.e(rx3Var)) {
                xm7 xm7VarS = rx3Var.s();
                nm7 nm7Var = xm7VarS instanceof nm7 ? (nm7) xm7VarS : null;
                if (nm7Var != null) {
                    return nm7Var.T().i0();
                }
            } else {
                if (ca1VarG instanceof ul2) {
                    return ((e36) ((ul2) ca1VarG)).y;
                }
                if (ca1VarG.K() != null) {
                    bm3 bm3VarK = ca1VarG.k();
                    bm3VarK.getClass();
                    return ((u09) bm3VarK).i0();
                }
            }
        }
        return null;
    }

    public static final boolean i(yn7 yn7Var) {
        yn7Var.getClass();
        um7 um7VarB = yn7Var.B();
        nm7 nm7Var = um7VarB instanceof nm7 ? (nm7) um7VarB : null;
        return nm7Var != null && nm7Var.q();
    }

    public static final boolean j(em7 em7Var) {
        Method declaredMethod;
        Class<?> componentType;
        Annotation annotation;
        Object objInvoke;
        Class clsR = af1.R(em7Var);
        try {
            declaredMethod = clsR.getDeclaredMethod("value", (Class[]) Arrays.copyOf(new Class[0], 0));
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        if (declaredMethod != null && (componentType = declaredMethod.getReturnType().getComponentType()) != null && componentType.isAnnotation()) {
            Annotation[] annotations = componentType.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i];
                if (af1.R(af1.Q(annotation)).getName().equals(pj7.g.a.a)) {
                    break;
                }
                i++;
            }
            if (annotation != null && (objInvoke = af1.R(af1.Q(annotation)).getMethod("value", null).invoke(annotation, null)) != null) {
                return clsR.equals(objInvoke);
            }
        }
        return false;
    }

    public static final boolean k(yn7 yn7Var) {
        yn7Var.getClass();
        if (yn7Var.o()) {
            return true;
        }
        j2 j2Var = (j2) yn7Var;
        j2 j2VarF = j2Var.F();
        if (j2VarF != null && k(j2VarF)) {
            return true;
        }
        if (j2Var.m()) {
            return false;
        }
        um7 um7VarB = yn7Var.B();
        if (!(um7VarB instanceof ao7)) {
            return false;
        }
        List upperBounds = ((ao7) um7VarB).getUpperBounds();
        if (upperBounds.isEmpty()) {
            return false;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (k((yn7) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class l(ClassLoader classLoader, j22 j22Var, int i) {
        j22Var.getClass();
        ex5 ex5Var = j22Var.a().a;
        String str = ex5Var.a;
        Integer numD = c5e.D(v4e.f0(str, b, str));
        if (numD != null) {
            int iIntValue = numD.intValue();
            i36 i36Var = i36.d;
            return l(classLoader, new j22(i36Var.a, i36Var.a(iIntValue + 1)), i);
        }
        String str2 = qf7.a;
        j22 j22VarH = qf7.h(ex5Var);
        if (j22VarH == null) {
            j22VarH = j22Var;
        }
        if (!j22VarH.equals(j22Var)) {
            classLoader = smb.d(wef.class);
        }
        String str3 = j22VarH.a.a.a;
        String str4 = j22VarH.b.a.a;
        if (pa7.t(str3, "kotlin")) {
            switch (str4.hashCode()) {
                case -901856463:
                    if (str4.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str4.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str4.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str4.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str4.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str4.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str4.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str4.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str4.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str3.length() > 0) {
            sb.append(str3.concat("."));
        }
        sb.append(c5e.z(str4, '.', '$'));
        if (i > 0) {
            sb.append(";");
        }
        try {
            return Class.forName(sb.toString(), false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final w84 m(ClassLoader classLoader, String str, boolean z) {
        Class clsN;
        str.getClass();
        fz3 fz3VarO = o(str);
        ArrayList<String> arrayList = (ArrayList) fz3VarO.c;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(n(classLoader, str2, 0, str2.length()));
        }
        if (z) {
            String str3 = (String) fz3VarO.b;
            clsN = n(classLoader, str3, 0, str3.length());
        } else {
            clsN = null;
        }
        return new w84(i, arrayList2, clsN);
    }

    public static final Class n(ClassLoader classLoader, String str, int i, int i2) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            String strReplace = str.substring(i + 1, i2 - 1).replace('/', '.');
            strReplace.getClass();
            Class<?> clsLoadClass = classLoader.loadClass(strReplace);
            clsLoadClass.getClass();
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            cls.getClass();
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return e(n(classLoader, str, i + 1, i2));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new pt7("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    public static final fz3 o(String str) {
        int iN;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (v4e.G("VZCBSIFJD", cCharAt)) {
                iN = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new pt7("Unknown type prefix in the method signature: ".concat(str));
                }
                iN = v4e.N(str, ';', i, 4) + 1;
            }
            arrayList.add(str.substring(i, iN));
            i = iN;
        }
        return new fz3(arrayList, str.substring(i + 1), 8);
    }

    public static final Annotation p(u00 u00Var) {
        u09 u09VarD = qz3.d(u00Var);
        Class clsQ = u09VarD != null ? q(u09VarD) : null;
        if (clsQ == null) {
            clsQ = null;
        }
        if (clsQ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = u00Var.g().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            t99 t99Var = (t99) entry.getKey();
            Object objR = r((bl2) entry.getValue(), smb.d(clsQ));
            iy9 iy9Var = objR != null ? new iy9(t99Var.b(), objR) : null;
            if (iy9Var != null) {
                arrayList.add(iy9Var);
            }
        }
        return (Annotation) an1.s(clsQ, bm8.W(arrayList));
    }

    public static final Class q(u09 u09Var) {
        ntd ntdVarE = u09Var.e();
        ntdVarE.getClass();
        if (ntdVarE instanceof ls7) {
            return ((ls7) ntdVarE).a.a;
        }
        if (ntdVarE instanceof l8c) {
            return ((enb) ((l8c) ntdVarE).a).a;
        }
        j22 j22VarF = qz3.f(u09Var);
        if (j22VarF == null) {
            return null;
        }
        return l(smb.d(u09Var.getClass()), j22VarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object r(bl2 bl2Var, ClassLoader classLoader) {
        Class clsL;
        if (bl2Var instanceof f10) {
            return p((u00) ((f10) bl2Var).a);
        }
        int i = 0;
        if (bl2Var instanceof pd0) {
            pd0 pd0Var = (pd0) bl2Var;
            z8f z8fVar = pd0Var instanceof z8f ? (z8f) pd0Var : null;
            if (z8fVar != null) {
                tt7 tt7Var = z8fVar.c;
                Object obj = pd0Var.a;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(t72.u(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(r((bl2) it.next(), classLoader));
                }
                t99 t99Var = xr7.e;
                y22 y22VarM = tt7Var.c0().m();
                jua juaVarS = y22VarM == null ? null : xr7.s(y22VarM);
                switch (juaVarS == null ? -1 : rqf.a[juaVarS.ordinal()]) {
                    case -1:
                        if (!xr7.z(tt7Var)) {
                            ho7.w(tt7Var, "Not an array type: ");
                            return null;
                        }
                        tt7 tt7VarB = ((i8f) s72.X0(tt7Var.Z())).b();
                        tt7VarB.getClass();
                        y22 y22VarM2 = tt7VarB.c0().m();
                        u09 u09Var = y22VarM2 instanceof u09 ? (u09) y22VarM2 : null;
                        if (u09Var == null) {
                            pd4.i(tt7VarB, "Not a class type: ");
                            return null;
                        }
                        if (xr7.H(tt7VarB)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                obj2.getClass();
                                strArr[i] = obj2;
                                i++;
                            }
                            return strArr;
                        }
                        if (xr7.b(u09Var, syd.Q)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj3 = arrayList.get(i);
                                obj3.getClass();
                                clsArr[i] = obj3;
                                i++;
                            }
                            return clsArr;
                        }
                        j22 j22VarF = qz3.f(u09Var);
                        if (j22VarF != null && (clsL = l(classLoader, j22VarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsL, ((List) obj).size());
                            objNewInstance.getClass();
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        ap.c();
                        return null;
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            Object obj4 = arrayList.get(i);
                            obj4.getClass();
                            zArr[i] = ((Boolean) obj4).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            Object obj5 = arrayList.get(i);
                            obj5.getClass();
                            cArr[i] = ((Character) obj5).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            Object obj6 = arrayList.get(i);
                            obj6.getClass();
                            bArr[i] = ((Byte) obj6).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            Object obj7 = arrayList.get(i);
                            obj7.getClass();
                            sArr[i] = ((Short) obj7).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            Object obj8 = arrayList.get(i);
                            obj8.getClass();
                            iArr[i] = ((Integer) obj8).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            Object obj9 = arrayList.get(i);
                            obj9.getClass();
                            fArr[i] = ((Float) obj9).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            Object obj10 = arrayList.get(i);
                            obj10.getClass();
                            jArr[i] = ((Long) obj10).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            Object obj11 = arrayList.get(i);
                            obj11.getClass();
                            dArr[i] = ((Double) obj11).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (bl2Var instanceof rx4) {
            iy9 iy9Var = (iy9) ((rx4) bl2Var).a;
            j22 j22Var = (j22) iy9Var.a();
            t99 t99Var2 = (t99) iy9Var.b();
            Class clsL2 = l(classLoader, j22Var, 0);
            if (clsL2 != null) {
                return Enum.valueOf(clsL2, t99Var2.b());
            }
        } else {
            if (!(bl2Var instanceof rm7)) {
                if ((bl2Var instanceof ty4) || (bl2Var instanceof sj9)) {
                    return null;
                }
                return bl2Var.b();
            }
            qm7 qm7Var = (qm7) ((rm7) bl2Var).a;
            if (qm7Var instanceof pm7) {
                m22 m22Var = ((pm7) qm7Var).a;
                return l(classLoader, m22Var.a, m22Var.b);
            }
            if (!(qm7Var instanceof om7)) {
                ap.c();
                return null;
            }
            y22 y22VarM3 = ((om7) qm7Var).a.c0().m();
            u09 u09Var2 = y22VarM3 instanceof u09 ? (u09) y22VarM3 : null;
            if (u09Var2 != null) {
                return q(u09Var2);
            }
        }
        return null;
    }

    public static final yn7 s(yn7 yn7Var) {
        yn7Var.getClass();
        um7 um7VarB = yn7Var.B();
        nm7 nm7Var = um7VarB instanceof nm7 ? (nm7) um7VarB : null;
        if (nm7Var != null) {
            return (yn7) ((jm7) nm7Var.c.getValue()).l.getValue();
        }
        return null;
    }

    public static final List t(List list) throws IllegalAccessException, InvocationTargetException {
        List listH;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (af1.R(af1.Q((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        em7 em7VarQ = af1.Q(annotation);
                        Class clsR = af1.R(em7VarQ);
                        if (!clsR.getSimpleName().equals("Container") || clsR.getAnnotation(srb.class) == null) {
                            listH = t72.H(annotation);
                        } else {
                            Object objInvoke = af1.R(em7VarQ).getDeclaredMethod("value", null).invoke(annotation, null);
                            objInvoke.getClass();
                            listH = Arrays.asList((Annotation[]) objInvoke);
                            listH.getClass();
                        }
                        x72.g0(arrayList, listH);
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }
}
