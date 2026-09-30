package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import io.sentry.android.core.b1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hj6 implements pj2, n21, cu2, ov2, mjd, bc2, t07, d85, fx9, wea, czc, yrd {
    public static w84 L0;
    public final /* synthetic */ int a;
    public static final hj6 b = new hj6(1);
    public static final g10 c = new g10();
    public static final hj6 d = new hj6(3);
    public static final hj6 e = new hj6(4);
    public static final hj6 f = new hj6(5);
    public static final qc0 g = new qc0(27);
    public static final /* synthetic */ hj6 v = new hj6(7);
    public static final r02 w = new r02(29);
    public static final he2 x = new he2(20);
    public static final he2 y = new he2(21);
    public static final he2 z = new he2(22);
    public static final he2 X = new he2(23);
    public static final cz1 Y = new cz1(11);
    public static final /* synthetic */ hj6 Z = new hj6(8);
    public static final hj6 E0 = new hj6(9);
    public static final hj6 F0 = new hj6(10);
    public static final hj6 G0 = new hj6(11);
    public static final hj6 H0 = new hj6(12);
    public static final hj6 I0 = new hj6(13);
    public static final hkb J0 = new hkb(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final hj6 K0 = new hj6(17);
    public static final hj6 M0 = new hj6(18);
    public static final hj6 N0 = new hj6(20);
    public static final /* synthetic */ hj6 O0 = new hj6(21);
    public static final hj6 P0 = new hj6(22);
    public static final hj6 Q0 = new hj6(23);
    public static final hj6 R0 = new hj6(24);
    public static final kr9 S0 = new kr9(1);
    public static final kr9 T0 = new kr9(0);
    public static final hj6 U0 = new hj6(26);
    public static final hj6 V0 = new hj6(27);
    public static final hj6 W0 = new hj6(28);
    public static final hj6 X0 = new hj6(29);

    public /* synthetic */ hj6(int i) {
        this.a = i;
    }

    public static void C(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && pa7.t(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            s8f.p(parentFile, "Failed to delete conflicting file: ");
            return;
        }
        if (parentFile.isDirectory()) {
            return;
        }
        try {
            Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
        } catch (Exception e2) {
            throw new IOException("Failed to create directory: " + parentFile, e2);
        }
    }

    public static ntd D(ca1 ca1Var) {
        while (ca1Var instanceof ea1) {
            ea1 ea1Var = (ea1) ca1Var;
            if (ea1Var.g() != 2) {
                break;
            }
            Collection collectionL = ea1Var.l();
            collectionL.getClass();
            ca1Var = (ea1) s72.Y0(collectionL);
            if (ca1Var == null) {
                return null;
            }
        }
        return ca1Var.e();
    }

    public static String E(xl7 xl7Var) {
        String strC;
        xl7Var.getClass();
        if (xl7Var instanceof ul7) {
            return "[".concat(E(((ul7) xl7Var).i));
        }
        if (xl7Var instanceof wl7) {
            al7 al7Var = ((wl7) xl7Var).i;
            return (al7Var == null || (strC = al7Var.c()) == null) ? "V" : strC;
        }
        if (xl7Var instanceof vl7) {
            return ub3.l(new StringBuilder("L"), ((vl7) xl7Var).i, ';');
        }
        ap.c();
        return null;
    }

    public static final boolean j(r8f r8fVar, w4c w4cVar) {
        r8fVar.getClass();
        if (!r8fVar.M(w4cVar)) {
            if (!(w4cVar instanceof fp1)) {
                return false;
            }
            ep1 ep1VarU = r8fVar.u((fp1) w4cVar);
            ep1VarU.getClass();
            d7f d7fVarZ = r8fVar.Z(ep1VarU);
            d7fVarZ.getClass();
            xt7 xt7VarS = r8fVar.s(d7fVarZ);
            if (xt7VarS == null || !r8fVar.M(r8fVar.U(xt7VarS))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m(r8f r8fVar, h7f h7fVar, w4c w4cVar, w4c w4cVar2, boolean z2) {
        r8fVar.getClass();
        Collection<xt7> collectionQ = r8fVar.Q(w4cVar);
        if ((collectionQ instanceof Collection) && collectionQ.isEmpty()) {
            return false;
        }
        for (xt7 xt7Var : collectionQ) {
            xt7Var.getClass();
            if (pa7.t(r8fVar.i0(xt7Var), r8fVar.G(w4cVar2))) {
                return true;
            }
            if (z2 && y(b, h7fVar, w4cVar2, xt7Var)) {
                return true;
            }
        }
        return false;
    }

    public static List n(h7f h7fVar, r8f r8fVar, w4c w4cVar, k7f k7fVar) {
        v2c v2cVarP;
        g7f g7fVar = g7f.c;
        r8fVar.getClass();
        r8fVar.B0(w4cVar, k7fVar);
        if (r8fVar.w(k7fVar) || !r8fVar.y(w4cVar)) {
            if (!r8fVar.t0(k7fVar)) {
                cqd cqdVar = new cqd();
                h7fVar.b();
                r8f r8fVar2 = h7fVar.c;
                ArrayDeque arrayDeque = h7fVar.g;
                arrayDeque.getClass();
                dqd dqdVar = h7fVar.h;
                dqdVar.getClass();
                arrayDeque.push(w4cVar);
                while (!arrayDeque.isEmpty()) {
                    w4c w4cVar2 = (w4c) arrayDeque.pop();
                    w4cVar2.getClass();
                    if (dqdVar.add(w4cVar2)) {
                        w4c w4cVarK0 = r8fVar.k0(w4cVar2);
                        if (w4cVarK0 == null) {
                            w4cVarK0 = w4cVar2;
                        }
                        if (r8fVar.c0(r8fVar.G(w4cVarK0), k7fVar)) {
                            cqdVar.add(w4cVarK0);
                            v2cVarP = g7fVar;
                        } else {
                            v2cVarP = r8fVar.l(w4cVarK0) == 0 ? g7f.b : r8fVar2.P(w4cVarK0);
                        }
                        if (v2cVarP.equals(g7fVar)) {
                            v2cVarP = null;
                        }
                        if (v2cVarP != null) {
                            Iterator it = r8fVar2.E(r8fVar2.G(w4cVar2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(v2cVarP.A(h7fVar, (xt7) it.next()));
                            }
                        }
                    }
                }
                h7fVar.a();
                return cqdVar;
            }
            if (r8fVar.c0(r8fVar.G(w4cVar), k7fVar)) {
                w4c w4cVarK1 = r8fVar.k0(w4cVar);
                if (w4cVarK1 != null) {
                    w4cVar = w4cVarK1;
                }
                return t72.H(w4cVar);
            }
        }
        return pu4.a;
    }

    public static List o(h7f h7fVar, r8f r8fVar, w4c w4cVar, k7f k7fVar) {
        List listN = n(h7fVar, r8fVar, w4cVar, k7fVar);
        if (listN.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listN) {
                w4c w4cVar2 = (w4c) obj;
                w4cVar2.getClass();
                c7f c7fVarC0 = r8fVar.C0(w4cVar2);
                int iO = r8fVar.o(c7fVarC0);
                int i = 0;
                while (true) {
                    if (i >= iO) {
                        arrayList.add(obj);
                        break;
                    }
                    d7f d7fVarS0 = r8fVar.s0(c7fVarC0, i);
                    d7fVarS0.getClass();
                    xt7 xt7VarS = r8fVar.s(d7fVarS0);
                    if ((xt7VarS != null ? r8fVar.g0(xt7VarS) : null) != null) {
                        break;
                    }
                    i++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listN;
    }

    public static od3 q(czc czcVar, vrb vrbVar, qn2 qn2Var, x16 x16Var) {
        pu4 pu4Var = pu4.a;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new od3(new sd5(czcVar, new p59(0, qn2Var), x16Var), t72.H(new lb3(pu4Var, null)), vrbVar, qn2Var);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new od3(new sd5(czcVar, new hl4(16), x16Var), t72.H(new lb3(pu4Var, null)), vrbVar, qn2Var);
        }
    }

    public static xl7 r(String str) {
        al7 al7Var;
        char cCharAt = str.charAt(0);
        al7[] al7VarArrValues = al7.values();
        int length = al7VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                al7Var = null;
                break;
            }
            al7Var = al7VarArrValues[i];
            if (al7Var.c().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (al7Var != null) {
            return new wl7(al7Var);
        }
        if (cCharAt == 'V') {
            return new wl7(null);
        }
        if (cCharAt == '[') {
            return new ul7(r(str.substring(1)));
        }
        if (cCharAt == 'L') {
            v4e.I(str, ';');
        }
        return new vl7(str.substring(1, str.length() - 1));
    }

    public static boolean s(h7f h7fVar, xt7 xt7Var, xt7 xt7Var2) {
        kj0 kj0Var = h7fVar.d;
        rs0 rs0Var = h7fVar.e;
        xt7Var.getClass();
        xt7Var2.getClass();
        r8f r8fVar = h7fVar.c;
        if (xt7Var == xt7Var2) {
            return true;
        }
        if (w(r8fVar, xt7Var) && w(r8fVar, xt7Var2)) {
            xt7 xt7VarV0 = kj0Var.v0(rs0Var.J(xt7Var));
            xt7 xt7VarV1 = kj0Var.v0(rs0Var.J(xt7Var2));
            w4c w4cVarC = r8fVar.C(xt7VarV0);
            if (!r8fVar.c0(r8fVar.i0(xt7VarV0), r8fVar.i0(xt7VarV1))) {
                return false;
            }
            if (r8fVar.l(w4cVarC) == 0) {
                return r8fVar.I(xt7VarV0) || r8fVar.I(xt7VarV1) || r8fVar.z0(w4cVarC) == r8fVar.z0(r8fVar.C(xt7VarV1));
            }
        }
        hj6 hj6Var = b;
        return y(hj6Var, h7fVar, xt7Var, xt7Var2) && y(hj6Var, h7fVar, xt7Var2, xt7Var);
    }

    public static p07 t(String str) {
        Object next;
        str.getClass();
        ArrayList arrayListQ0 = s72.Q0(s72.Q0(s72.Q0(s72.Q0(thb.x, az2.d), e56.w), hj.c), m86.d);
        lmd.a.getClass();
        Iterator it = s72.Q0(arrayListQ0, lmd.b).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((p07) next).c().contains(str)) {
                return (p07) next;
            }
        }
        next = null;
        return (p07) next;
    }

    public static e8f u(r8f r8fVar, xt7 xt7Var, w4c w4cVar) {
        xt7 xt7VarS;
        r8fVar.getClass();
        int iL = r8fVar.l(xt7Var);
        int i = 0;
        while (true) {
            if (i >= iL) {
                return null;
            }
            d7f d7fVarU0 = r8fVar.u0(xt7Var, i);
            d7fVarU0.getClass();
            d7f d7fVar = r8fVar.n(d7fVarU0) ? null : d7fVarU0;
            if (d7fVar != null && (xt7VarS = r8fVar.s(d7fVar)) != null) {
                boolean z2 = r8fVar.d0(r8fVar.C(xt7VarS)) && r8fVar.d0(r8fVar.C(w4cVar));
                if (xt7VarS.equals(w4cVar) || (z2 && pa7.t(r8fVar.i0(xt7VarS), r8fVar.i0(w4cVar)))) {
                    k7f k7fVarI0 = r8fVar.i0(xt7Var);
                    k7fVarI0.getClass();
                    return r8fVar.b0(k7fVarI0, i);
                }
                e8f e8fVarU = u(r8fVar, xt7VarS, w4cVar);
                if (e8fVarU != null) {
                    return e8fVarU;
                }
            }
            i++;
        }
    }

    public static boolean w(r8f r8fVar, xt7 xt7Var) {
        r8fVar.getClass();
        xt7Var.getClass();
        k7f k7fVarI0 = r8fVar.i0(xt7Var);
        k7fVarI0.getClass();
        if (!r8fVar.F(k7fVarI0)) {
            return false;
        }
        r8fVar.r(xt7Var);
        return (r8fVar.J(xt7Var) || r8fVar.e0(xt7Var) || r8fVar.x0(xt7Var)) ? false : true;
    }

    public static boolean x(h7f h7fVar, r8f r8fVar, c7f c7fVar, w4c w4cVar) {
        boolean zY;
        r8fVar.getClass();
        c7fVar.getClass();
        k7f k7fVarG = r8fVar.G(w4cVar);
        int iO = r8fVar.o(c7fVar);
        k7fVarG.getClass();
        int iT = r8fVar.T(k7fVarG);
        if (iO == iT && iO == r8fVar.l(w4cVar)) {
            for (int i = 0; i < iT; i++) {
                d7f d7fVarU0 = r8fVar.u0(w4cVar, i);
                d7fVarU0.getClass();
                xt7 xt7VarS = r8fVar.s(d7fVarU0);
                if (xt7VarS != null) {
                    d7f d7fVarS0 = r8fVar.s0(c7fVar, i);
                    d7fVarS0.getClass();
                    r8fVar.p(d7fVarS0);
                    xt7 xt7VarS2 = r8fVar.s(d7fVarS0);
                    xt7VarS2.getClass();
                    x8f x8fVarA = r8fVar.A(r8fVar.b0(k7fVarG, i));
                    x8f x8fVarP = r8fVar.p(d7fVarU0);
                    x8f x8fVar = x8f.INV;
                    if (x8fVarA == x8fVar) {
                        x8fVarA = x8fVarP;
                    } else if (x8fVarP != x8fVar && x8fVarA != x8fVarP) {
                        x8fVarA = null;
                    }
                    if (x8fVarA == null) {
                        return h7fVar.a;
                    }
                    if (x8fVarA == x8fVar) {
                        z(r8fVar, xt7VarS2, xt7VarS);
                        z(r8fVar, xt7VarS, xt7VarS2);
                    }
                    int i2 = h7fVar.f;
                    if (i2 > 100) {
                        pd4.i(xt7VarS2, "Arguments depth is too high. Some related argument: ");
                        return false;
                    }
                    h7fVar.f = i2 + 1;
                    int iOrdinal = x8fVarA.ordinal();
                    hj6 hj6Var = b;
                    if (iOrdinal == 0) {
                        zY = y(hj6Var, h7fVar, xt7VarS, xt7VarS2);
                    } else if (iOrdinal == 1) {
                        zY = y(hj6Var, h7fVar, xt7VarS2, xt7VarS);
                    } else {
                        if (iOrdinal != 2) {
                            ap.c();
                            return false;
                        }
                        zY = s(h7fVar, xt7VarS2, xt7VarS);
                    }
                    h7fVar.f--;
                    if (!zY) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean y(hj6 hj6Var, h7f h7fVar, xt7 xt7Var, xt7 xt7Var2) {
        r8f r8fVar = h7fVar.c;
        xt7Var.getClass();
        xt7Var2.getClass();
        if (xt7Var == xt7Var2) {
            return true;
        }
        l26 l26VarO = r8fVar.O();
        Boolean bool = l26VarO != null ? (Boolean) l26VarO.z(xt7Var, xt7Var2) : null;
        return bool != null ? bool.booleanValue() : b.p(h7fVar, r8fVar, xt7Var, xt7Var2);
    }

    public static void z(r8f r8fVar, xt7 xt7Var, xt7 xt7Var2) {
        r8fVar.getClass();
        w4c w4cVarM0 = r8fVar.m0(xt7Var);
        if (w4cVarM0 instanceof fp1) {
            fp1 fp1Var = (fp1) w4cVarM0;
            if (r8fVar.m(fp1Var)) {
                return;
            }
            ep1 ep1VarU = r8fVar.u(fp1Var);
            ep1VarU.getClass();
            d7f d7fVarZ = r8fVar.Z(ep1VarU);
            d7fVarZ.getClass();
            if (r8fVar.n(d7fVarZ) && r8fVar.H(fp1Var) == to1.a) {
                r8fVar.i0(xt7Var2);
            }
        }
    }

    public ArrayList A(Member member) throws IllegalAccessException, InvocationTargetException {
        Method method;
        w84 w84Var;
        member.getClass();
        w84 w84Var2 = L0;
        Object obj = null;
        if (w84Var2 == null) {
            synchronized (this) {
                w84Var2 = L0;
                if (w84Var2 == null) {
                    Class<?> cls = member.getClass();
                    int i = 14;
                    try {
                        w84Var = new w84(i, cls.getMethod("getParameters", null), smb.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                    } catch (NoSuchMethodException unused) {
                        w84Var = new w84(i, obj, obj);
                    }
                    L0 = w84Var;
                    w84Var2 = w84Var;
                }
            }
        }
        Method method2 = (Method) w84Var2.b;
        if (method2 == null || (method = (Method) w84Var2.c) == null) {
            return null;
        }
        Object objInvoke = method2.invoke(member, null);
        objInvoke.getClass();
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj2 : objArr) {
            Object objInvoke2 = method.invoke(obj2, null);
            objInvoke2.getClass();
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }

    @Override // defpackage.czc
    public Object B(FileInputStream fileInputStream) throws mw2 {
        byte[] bArr;
        fileInputStream.getClass();
        try {
            osa osaVarO = osa.o(fileInputStream);
            p79 p79Var = new p79(false);
            jsa[] jsaVarArr = (jsa[]) Arrays.copyOf(new jsa[0], 0);
            p79Var.b();
            if (jsaVarArr.length > 0) {
                jsa jsaVar = jsaVarArr[0];
                throw null;
            }
            Map mapL = osaVarO.l();
            mapL.getClass();
            for (Map.Entry entry : mapL.entrySet()) {
                String str = (String) entry.getKey();
                ssa ssaVar = (ssa) entry.getValue();
                str.getClass();
                ssaVar.getClass();
                int iU = ssaVar.u();
                switch (iU == 0 ? -1 : ksa.a[kv2.B(iU)]) {
                    case -1:
                        throw new mw2("Value case is null.", null);
                    case 0:
                    default:
                        ap.c();
                        return null;
                    case 1:
                        p79Var.f(new isa(str), Boolean.valueOf(ssaVar.l()));
                        break;
                    case 2:
                        p79Var.f(new isa(str), Float.valueOf(ssaVar.p()));
                        break;
                    case 3:
                        p79Var.f(new isa(str), Double.valueOf(ssaVar.o()));
                        break;
                    case 4:
                        p79Var.f(new isa(str), Integer.valueOf(ssaVar.q()));
                        break;
                    case 5:
                        p79Var.f(new isa(str), Long.valueOf(ssaVar.r()));
                        break;
                    case 6:
                        p79Var.f(new isa(str), ssaVar.s());
                        break;
                    case 7:
                        isa isaVar = new isa(str);
                        o87 o87VarN = ssaVar.t().n();
                        o87VarN.getClass();
                        p79Var.f(isaVar, s72.o1(o87VarN));
                        break;
                    case 8:
                        isa isaVar2 = new isa(str);
                        b71 b71VarM = ssaVar.m();
                        int size = b71VarM.size();
                        if (size == 0) {
                            bArr = r87.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            b71VarM.e(bArr2, size);
                            bArr = bArr2;
                        }
                        p79Var.f(isaVar2, bArr);
                        break;
                    case 9:
                        throw new mw2("Value not set.", null);
                }
            }
            return new p79(new LinkedHashMap(p79Var.a()), true);
        } catch (ya7 e2) {
            throw new mw2("Unable to parse preferences proto.", e2);
        }
    }

    @Override // defpackage.yrd
    public boolean N(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // defpackage.t07
    public void b(int i, lu3 lu3Var, yf1 yf1Var) {
        lu3Var.getClass();
        yf1Var.getClass();
    }

    @Override // defpackage.bc2
    public Object c(hbc hbcVar) {
        Object objR = hbcVar.r(new y3b(ns0.class, Executor.class));
        objR.getClass();
        return t72.z((Executor) objR);
    }

    @Override // defpackage.pj2
    public void configure(gv4 gv4Var) {
        bm0 bm0Var = bm0.a;
        hh7 hh7Var = (hh7) gv4Var;
        hh7Var.a(tw0.class, bm0Var);
        hh7Var.a(go0.class, bm0Var);
        im0 im0Var = im0.a;
        hh7Var.a(ye8.class, im0Var);
        hh7Var.a(np0.class, im0Var);
        cm0 cm0Var = cm0.a;
        hh7Var.a(y42.class, cm0Var);
        hh7Var.a(lo0.class, cm0Var);
        am0 am0Var = am0.a;
        hh7Var.a(qp.class, am0Var);
        hh7Var.a(do0.class, am0Var);
        hm0 hm0Var = hm0.a;
        hh7Var.a(ue8.class, hm0Var);
        hh7Var.a(mp0.class, hm0Var);
        dm0 dm0Var = dm0.a;
        hh7Var.a(hb2.class, dm0Var);
        hh7Var.a(mo0.class, dm0Var);
        gm0 gm0Var = gm0.a;
        hh7Var.a(b95.class, gm0Var);
        hh7Var.a(bp0.class, gm0Var);
        fm0 fm0Var = fm0.a;
        hh7Var.a(a95.class, fm0Var);
        hh7Var.a(ap0.class, fm0Var);
        jm0 jm0Var = jm0.a;
        hh7Var.a(nd9.class, jm0Var);
        hh7Var.a(pp0.class, jm0Var);
        em0 em0Var = em0.a;
        hh7Var.a(q55.class, em0Var);
        hh7Var.a(zo0.class, em0Var);
    }

    @Override // defpackage.czc
    public Object e() {
        return new p79(true);
    }

    public boolean g(bm3 bm3Var, bm3 bm3Var2, boolean z2) {
        if ((bm3Var instanceof u09) && (bm3Var2 instanceof u09)) {
            return pa7.t(((u09) bm3Var).h(), ((u09) bm3Var2).h());
        }
        if ((bm3Var instanceof c8f) && (bm3Var2 instanceof c8f)) {
            return h((c8f) bm3Var, (c8f) bm3Var2, z2, y.F0);
        }
        if (!(bm3Var instanceof ca1) || !(bm3Var2 instanceof ca1)) {
            return ((bm3Var instanceof kw9) && (bm3Var2 instanceof kw9)) ? pa7.t(((lw9) ((kw9) bm3Var)).f, ((lw9) ((kw9) bm3Var2)).f) : pa7.t(bm3Var, bm3Var2);
        }
        ca1 ca1Var = (ca1) bm3Var;
        ca1 ca1Var2 = (ca1) bm3Var2;
        if (!ca1Var.equals(ca1Var2)) {
            if (pa7.t(ca1Var.getName(), ca1Var2.getName()) && ((!(ca1Var instanceof tq8) || !(ca1Var2 instanceof tq8) || ((tq8) ca1Var).w() == ((tq8) ca1Var2).w()) && ((!pa7.t(ca1Var.k(), ca1Var2.k()) || (z2 && pa7.t(D(ca1Var), D(ca1Var2)))) && !oz3.m(ca1Var) && !oz3.m(ca1Var2)))) {
                bm3 bm3VarK = ca1Var.k();
                bm3 bm3VarK2 = ca1Var2.k();
                if (((bm3VarK instanceof ea1) || (bm3VarK2 instanceof ea1)) ? false : g(bm3VarK, bm3VarK2, z2)) {
                    iu9 iu9Var = new iu9(new egh(z2, ca1Var, ca1Var2, 4));
                    if (iu9Var.m(ca1Var, ca1Var2, null, true).b() != 1 || iu9Var.m(ca1Var2, ca1Var, null, true).b() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean h(c8f c8fVar, c8f c8fVar2, boolean z2, l26 l26Var) {
        if (c8fVar.equals(c8fVar2)) {
            return true;
        }
        if (pa7.t(c8fVar.k(), c8fVar2.k())) {
            return false;
        }
        bm3 bm3VarK = c8fVar.k();
        bm3 bm3VarK2 = c8fVar2.k();
        return (((bm3VarK instanceof ea1) || (bm3VarK2 instanceof ea1)) ? ((Boolean) l26Var.z(bm3VarK, bm3VarK2)).booleanValue() : g(bm3VarK, bm3VarK2, z2)) && c8fVar.getIndex() == c8fVar2.getIndex();
    }

    @Override // defpackage.n21
    public Rect i(Activity activity) throws Exception {
        DisplayCutout displayCutoutT;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                objInvoke2.getClass();
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            n21.i.getClass();
            b1.m(e2, m21.b);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode() && (displayCutoutT = s.t(defaultDisplay)) != null) {
            if (rect.left == s.X(displayCutoutT)) {
                rect.left = 0;
            }
            if (point.x - rect.right == s.Y(displayCutoutT)) {
                rect.right = s.Y(displayCutoutT) + rect.right;
            }
            if (rect.top == s.Z(displayCutoutT)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == s.W(displayCutoutT)) {
                rect.bottom = s.W(displayCutoutT) + rect.bottom;
            }
        }
        return rect;
    }

    @Override // defpackage.wea
    public boolean k(u09 u09Var, r04 r04Var) {
        u09Var.getClass();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x021e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0280  */
    /* JADX WARN: Code duplicated, block: B:171:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:186:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:190:0x030a  */
    /* JADX WARN: Code duplicated, block: B:191:0x030f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0317  */
    /* JADX WARN: Code duplicated, block: B:201:0x032d A[LOOP:9: B:199:0x0327->B:201:0x032d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x0355 A[LOOP:10: B:203:0x034f->B:205:0x0355, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x037f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0398  */
    /* JADX WARN: Code duplicated, block: B:217:0x03a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:220:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:223:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:226:0x03db  */
    /* JADX WARN: Code duplicated, block: B:228:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:231:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:233:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Code duplicated, block: B:242:0x044b  */
    /* JADX WARN: Code duplicated, block: B:245:0x0457  */
    /* JADX WARN: Code duplicated, block: B:250:0x046e  */
    /* JADX WARN: Code duplicated, block: B:252:0x0480  */
    /* JADX WARN: Code duplicated, block: B:254:0x048f  */
    /* JADX WARN: Code duplicated, block: B:256:0x0494  */
    /* JADX WARN: Code duplicated, block: B:259:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code duplicated, block: B:262:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:266:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:267:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:271:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:277:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:281:0x050b A[LOOP:7: B:275:0x04e7->B:281:0x050b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:297:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0404 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0451 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:310:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x04db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x0507 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:? A[LOOP:12: B:31:0x00a7->B:333:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:? A[LOOP:13: B:47:0x00eb->B:336:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Object, r8f] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    public boolean p(h7f h7fVar, r8f r8fVar, xt7 xt7Var, xt7 xt7Var2) {
        Boolean boolValueOf;
        Boolean bool;
        k7f k7fVarG;
        cqd<w4c> cqdVar;
        ArrayDeque arrayDeque;
        dqd dqdVar;
        boolean z2;
        ArrayList arrayList;
        List<w4c> listN;
        w4c w4cVar;
        g7f g7fVar;
        Iterator it;
        ArrayList<w4c> arrayList2;
        int size;
        k7f k7fVarG2;
        k7f k7fVarG3;
        ArrayDeque arrayDeque2;
        dqd dqdVar2;
        w4c w4cVar2;
        g7f g7fVar2;
        Iterator it2;
        w4c w4cVarA;
        k7f k7fVarG4;
        pc0 pc0Var;
        int iT;
        ?? r6;
        boolean zX;
        boolean zX2;
        d7f d7fVarZ;
        xt7 xt7VarS;
        w4c w4cVarM0;
        k7f k7fVarG5;
        k7f k7fVarG6;
        e8f e8fVarU;
        Collection collectionE;
        Iterator it3;
        Collection collectionE2;
        Iterator it4;
        boolean z3;
        xt7Var.getClass();
        rs0 rs0Var = h7fVar.e;
        xt7 xt7VarJ = rs0Var.J(xt7Var);
        kj0 kj0Var = h7fVar.d;
        xt7 xt7VarV0 = kj0Var.v0(xt7VarJ);
        xt7Var2.getClass();
        xt7 xt7VarV1 = kj0Var.v0(rs0Var.J(xt7Var2));
        r8fVar.getClass();
        xt7VarV0.getClass();
        w4c w4cVarC = r8fVar.C(xt7VarV0);
        xt7VarV1.getClass();
        w4c w4cVarU = r8fVar.U(xt7VarV1);
        boolean z4 = false;
        boolean z5 = true;
        if (!r8fVar.F0(w4cVarC) && !r8fVar.F0(w4cVarU)) {
            r8fVar.f0(w4cVarC);
            r8fVar.S(w4cVarC);
            r8fVar.S(w4cVarU);
            fp1 fp1VarN0 = r8fVar.n0(w4cVarU);
            xt7 xt7VarD = fp1VarN0 != null ? r8fVar.D(fp1VarN0) : null;
            if (fp1VarN0 == null || xt7VarD == null) {
                k7fVarG5 = r8fVar.G(w4cVarU);
                k7fVarG5.getClass();
                if (r8fVar.t(k7fVarG5)) {
                    r8fVar.z0(w4cVarU);
                    collectionE2 = r8fVar.E(k7fVarG5);
                    if (!(collectionE2 instanceof Collection) && collectionE2.isEmpty()) {
                        z3 = true;
                        break;
                    }
                    it4 = collectionE2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z3 = true;
                            break;
                        }
                        if (!y(b, h7fVar, w4cVarC, (xt7) it4.next())) {
                            z3 = false;
                            break;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z3);
                } else {
                    k7fVarG6 = r8fVar.G(w4cVarC);
                    if (w4cVarC instanceof fp1) {
                        e8fVarU = u(r8fVar, w4cVarU, w4cVarC);
                        if (e8fVarU == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        k7fVarG6.getClass();
                        if (r8fVar.t(k7fVarG6)) {
                            collectionE = r8fVar.E(k7fVarG6);
                            if ((collectionE instanceof Collection) || !collectionE.isEmpty()) {
                                it3 = collectionE.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        e8fVarU = u(r8fVar, w4cVarU, w4cVarC);
                                        if (e8fVarU == null && r8fVar.b(e8fVarU, r8fVar.G(w4cVarU))) {
                                            boolValueOf = Boolean.TRUE;
                                        }
                                    } else if (!(((xt7) it3.next()) instanceof fp1)) {
                                    }
                                }
                            } else {
                                e8fVarU = u(r8fVar, w4cVarU, w4cVarC);
                                if (e8fVarU == null) {
                                }
                            }
                        }
                        boolValueOf = null;
                    }
                }
            } else {
                if (r8fVar.z0(w4cVarU)) {
                    xt7VarD = r8fVar.E0(xt7VarD);
                } else if (r8fVar.L(w4cVarU)) {
                    xt7VarD = r8fVar.R(xt7VarD);
                }
                if (y(this, h7fVar, w4cVarC, xt7VarD)) {
                    boolValueOf = Boolean.TRUE;
                } else {
                    k7fVarG5 = r8fVar.G(w4cVarU);
                    k7fVarG5.getClass();
                    if (r8fVar.t(k7fVarG5)) {
                        r8fVar.z0(w4cVarU);
                        collectionE2 = r8fVar.E(k7fVarG5);
                        if (!(collectionE2 instanceof Collection)) {
                            it4 = collectionE2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z3 = true;
                                    break;
                                }
                                if (!y(b, h7fVar, w4cVarC, (xt7) it4.next())) {
                                    z3 = false;
                                    break;
                                }
                            }
                        } else {
                            it4 = collectionE2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z3 = true;
                                    break;
                                }
                                if (!y(b, h7fVar, w4cVarC, (xt7) it4.next())) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z3);
                    } else {
                        k7fVarG6 = r8fVar.G(w4cVarC);
                        if (w4cVarC instanceof fp1) {
                            k7fVarG6.getClass();
                            if (r8fVar.t(k7fVarG6)) {
                                collectionE = r8fVar.E(k7fVarG6);
                                if (collectionE instanceof Collection) {
                                    it3 = collectionE.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            e8fVarU = u(r8fVar, w4cVarU, w4cVarC);
                                            if (e8fVarU == null) {
                                            }
                                        } else if (!(((xt7) it3.next()) instanceof fp1)) {
                                        }
                                    }
                                } else {
                                    it3 = collectionE.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            e8fVarU = u(r8fVar, w4cVarU, w4cVarC);
                                            if (e8fVarU == null) {
                                            }
                                        } else if (!(((xt7) it3.next()) instanceof fp1)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        } else {
                            e8fVarU = u(r8fVar, w4cVarU, w4cVarC);
                            if (e8fVarU == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        }
                    }
                }
            }
        } else if (h7fVar.a) {
            boolValueOf = Boolean.TRUE;
        } else if (!r8fVar.z0(w4cVarC) || r8fVar.z0(w4cVarU)) {
            if (!r8fVar.F0(w4cVarC)) {
                w4cVarC = r8fVar.g(w4cVarC);
            }
            if (!r8fVar.F0(w4cVarU)) {
                w4cVarU = r8fVar.g(w4cVarU);
            }
            w4cVarC.getClass();
            w4cVarU.getClass();
            boolValueOf = Boolean.valueOf(vd0.w0(r8fVar, w4cVarC, w4cVarU));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        w4c w4cVarC2 = r8fVar.C(xt7VarV0);
        w4c w4cVarU2 = r8fVar.U(xt7VarV1);
        g7f g7fVar3 = g7f.c;
        g7f g7fVar4 = g7f.b;
        r8f r8fVar2 = h7fVar.c;
        if (!r8fVar2.z0(w4cVarU2) && !r8fVar2.e0(w4cVarC2) && !r8fVar2.L(w4cVarC2) && ((!(w4cVarC2 instanceof fp1) || !r8fVar2.p0((fp1) w4cVarC2)) && !vfh.x(h7fVar, w4cVarC2, g7fVar4))) {
            if (r8fVar2.L(w4cVarU2) || vfh.x(h7fVar, w4cVarU2, g7f.d) || r8fVar2.y(w4cVarC2)) {
                return false;
            }
            k7f k7fVarG7 = r8fVar2.G(w4cVarU2);
            k7fVarG7.getClass();
            if (!vfh.A(h7fVar, w4cVarC2, k7fVarG7)) {
                h7fVar.b();
                ArrayDeque arrayDeque3 = h7fVar.g;
                arrayDeque3.getClass();
                dqd dqdVar3 = h7fVar.h;
                dqdVar3.getClass();
                arrayDeque3.push(w4cVarC2);
                loop0: while (true) {
                    if (arrayDeque3.isEmpty()) {
                        h7fVar.a();
                        return false;
                    }
                    w4c w4cVar3 = (w4c) arrayDeque3.pop();
                    w4cVar3.getClass();
                    if (dqdVar3.add(w4cVar3)) {
                        g7f g7fVar5 = r8fVar2.z0(w4cVar3) ? g7fVar3 : g7fVar4;
                        if (g7fVar5.equals(g7fVar3)) {
                            g7fVar5 = null;
                        }
                        if (g7fVar5 == null) {
                            continue;
                        } else {
                            Iterator it5 = r8fVar2.E(r8fVar2.G(w4cVar3)).iterator();
                            while (it5.hasNext()) {
                                w4c w4cVarA2 = g7fVar5.A(h7fVar, (xt7) it5.next());
                                if (vfh.A(h7fVar, w4cVarA2, k7fVarG7)) {
                                    h7fVar.a();
                                    break loop0;
                                }
                                arrayDeque3.add(w4cVarA2);
                            }
                        }
                    }
                }
            }
        }
        if (!r8fVar.M(w4cVarC2) && !r8fVar.M(w4cVarU2)) {
            bool = null;
        } else if (j(r8fVar, w4cVarC2) && j(r8fVar, w4cVarU2)) {
            bool = Boolean.TRUE;
        } else if (r8fVar.M(w4cVarC2)) {
            if (m(r8fVar, h7fVar, w4cVarC2, w4cVarU2, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (r8fVar.M(w4cVarU2)) {
            k7f k7fVarG8 = r8fVar.G(w4cVarC2);
            if (k7fVarG8 instanceof ca7) {
                Collection collectionE3 = r8fVar.E(k7fVarG8);
                if (!(collectionE3 instanceof Collection) || !collectionE3.isEmpty()) {
                    Iterator it6 = collectionE3.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            xt7 xt7Var3 = (xt7) it6.next();
                            xt7Var3.getClass();
                            w4c w4cVarM1 = r8fVar.m0(xt7Var3);
                            if (w4cVarM1 == null || !r8fVar.M(w4cVarM1)) {
                            }
                        } else if (!m(r8fVar, h7fVar, w4cVarU2, w4cVarC2, true)) {
                            bool = null;
                        }
                    }
                } else if (!m(r8fVar, h7fVar, w4cVarU2, w4cVarC2, true)) {
                    bool = null;
                }
            } else if (!m(r8fVar, h7fVar, w4cVarU2, w4cVarC2, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        k7f k7fVarG9 = r8fVar.G(w4cVarU2);
        if (r8fVar.c0(r8fVar.G(w4cVarC2), k7fVarG9)) {
            k7fVarG9.getClass();
            if (r8fVar.T(k7fVarG9) != 0) {
                k7fVarG = r8fVar.G(w4cVarU2);
                k7fVarG.getClass();
                if (!r8fVar.o0(k7fVarG)) {
                    k7fVarG9.getClass();
                    if (r8fVar2.y(w4cVarC2)) {
                        if (!r8fVar2.w(k7fVarG9) || r8fVar2.j0(k7fVarG9)) {
                            cqdVar = new cqd();
                            h7fVar.b();
                            arrayDeque = h7fVar.g;
                            arrayDeque.getClass();
                            dqdVar = h7fVar.h;
                            dqdVar.getClass();
                            arrayDeque.push(w4cVarC2);
                            while (!arrayDeque.isEmpty()) {
                                w4cVar = (w4c) arrayDeque.pop();
                                w4cVar.getClass();
                                if (!dqdVar.add(w4cVar)) {
                                    if (r8fVar2.y(w4cVar)) {
                                        cqdVar.add(w4cVar);
                                        g7fVar = g7fVar3;
                                    } else {
                                        g7fVar = g7fVar4;
                                    }
                                    if (g7fVar.equals(g7fVar3)) {
                                        g7fVar = null;
                                    }
                                    if (g7fVar == null) {
                                        it = r8fVar2.E(r8fVar2.G(w4cVar)).iterator();
                                        while (it.hasNext()) {
                                            arrayDeque.add(g7fVar.A(h7fVar, (xt7) it.next()));
                                            z4 = z4;
                                        }
                                    }
                                }
                            }
                            z2 = z4;
                            h7fVar.a();
                            arrayList = new ArrayList();
                            for (w4c w4cVar4 : cqdVar) {
                                w4cVar4.getClass();
                                x72.g0(arrayList, o(h7fVar, r8fVar2, w4cVar4, k7fVarG9));
                            }
                            listN = arrayList;
                        } else {
                            listN = n(h7fVar, r8fVar2, w4cVarC2, k7fVarG9);
                        }
                        listN.size();
                        arrayList2 = new ArrayList(t72.u(listN, 10));
                        for (w4c w4cVar5 : listN) {
                            w4cVar5.getClass();
                            xt7 xt7VarV2 = h7fVar.d.v0(w4cVar5);
                            xt7VarV2.getClass();
                            w4cVarM0 = r8fVar.m0(xt7VarV2);
                            if (w4cVarM0 == null) {
                                w4cVar5 = w4cVarM0;
                            }
                            arrayList2.add(w4cVar5);
                        }
                        size = arrayList2.size();
                        if (size != 0) {
                            k7fVarG2 = r8fVar.G(w4cVarC2);
                            k7fVarG2.getClass();
                            if (r8fVar.w(k7fVarG2)) {
                                return r8fVar.q0(k7fVarG2);
                            }
                            k7fVarG3 = r8fVar.G(w4cVarC2);
                            k7fVarG3.getClass();
                            if (r8fVar.q0(k7fVarG3)) {
                                return true;
                            }
                            h7fVar.b();
                            arrayDeque2 = h7fVar.g;
                            arrayDeque2.getClass();
                            dqdVar2 = h7fVar.h;
                            dqdVar2.getClass();
                            arrayDeque2.push(w4cVarC2);
                            while (!arrayDeque2.isEmpty()) {
                                w4cVar2 = (w4c) arrayDeque2.pop();
                                w4cVar2.getClass();
                                if (!dqdVar2.add(w4cVar2)) {
                                    if (r8fVar.y(w4cVar2)) {
                                        g7fVar2 = g7fVar3;
                                    } else {
                                        g7fVar2 = g7fVar4;
                                    }
                                    if (g7fVar2.equals(g7fVar3)) {
                                        g7fVar2 = null;
                                    }
                                    if (g7fVar2 == null) {
                                        continue;
                                    } else {
                                        it2 = r8fVar2.E(r8fVar2.G(w4cVar2)).iterator();
                                        while (it2.hasNext()) {
                                            w4cVarA = g7fVar2.A(h7fVar, (xt7) it2.next());
                                            w4cVarA.getClass();
                                            k7fVarG4 = r8fVar.G(w4cVarA);
                                            k7fVarG4.getClass();
                                            if (r8fVar.q0(k7fVarG4)) {
                                                h7fVar.a();
                                                return true;
                                            }
                                            arrayDeque2.add(w4cVarA);
                                        }
                                    }
                                }
                            }
                            h7fVar.a();
                            return z2;
                        }
                        if (size != 1) {
                            w4c w4cVar6 = (w4c) s72.u0(arrayList2);
                            w4cVar6.getClass();
                            return x(h7fVar, r8fVar, r8fVar.C0(w4cVar6), w4cVarU2);
                        }
                        pc0Var = new pc0(r8fVar.T(k7fVarG9));
                        iT = r8fVar.T(k7fVarG9);
                        r6 = z2;
                        while (true) {
                            if (r6 < iT) {
                                zX = x(h7fVar, r8fVar, pc0Var, w4cVarU2);
                                break;
                            }
                            if (r8fVar.A(r8fVar.b0(k7fVarG9, r6)) != x8f.OUT) {
                                zX = z2;
                                break;
                            }
                            ArrayList arrayList3 = new ArrayList(t72.u(arrayList2, 10));
                            for (w4c w4cVar7 : arrayList2) {
                                w4cVar7.getClass();
                                d7fVarZ = r8fVar.z(w4cVar7, r6);
                                if (d7fVarZ != null) {
                                    boolean z6 = z5;
                                    if (r8fVar.p(d7fVarZ) != x8f.INV) {
                                        d7fVarZ = null;
                                    }
                                    if (d7fVarZ == null && (xt7VarS = r8fVar.s(d7fVarZ)) != null) {
                                        arrayList3.add(xt7VarS);
                                        z5 = z6;
                                    }
                                }
                                throw new IllegalStateException(("Incorrect type: " + w4cVar7 + ", subType: " + w4cVarC2 + ", superType: " + w4cVarU2).toString());
                            }
                            boolean z7 = z5;
                            xt7 xt7VarX = r8fVar.X(arrayList3);
                            xt7VarX.getClass();
                            pc0Var.add(r8fVar.Y(xt7VarX));
                            z5 = z7;
                            r6++;
                        }
                        if (zX) {
                            return z5;
                        }
                        zX2 = z2;
                        for (w4c w4cVar8 : arrayList2) {
                            if (zX2) {
                                w4cVar8.getClass();
                                zX2 = x(h7fVar, r8fVar, r8fVar.C0(w4cVar8), w4cVarU2);
                            }
                        }
                        return zX2;
                    }
                    listN = o(h7fVar, r8fVar2, w4cVarC2, k7fVarG9);
                    z2 = false;
                    listN.size();
                    arrayList2 = new ArrayList(t72.u(listN, 10));
                    while (r11.hasNext()) {
                        w4cVar5.getClass();
                        xt7 xt7VarV3 = h7fVar.d.v0(w4cVar5);
                        xt7VarV3.getClass();
                        w4cVarM0 = r8fVar.m0(xt7VarV3);
                        if (w4cVarM0 == null) {
                            w4cVar5 = w4cVarM0;
                        }
                        arrayList2.add(w4cVar5);
                    }
                    size = arrayList2.size();
                    if (size != 0) {
                        k7fVarG2 = r8fVar.G(w4cVarC2);
                        k7fVarG2.getClass();
                        if (r8fVar.w(k7fVarG2)) {
                            return r8fVar.q0(k7fVarG2);
                        }
                        k7fVarG3 = r8fVar.G(w4cVarC2);
                        k7fVarG3.getClass();
                        if (r8fVar.q0(k7fVarG3)) {
                            return true;
                        }
                        h7fVar.b();
                        arrayDeque2 = h7fVar.g;
                        arrayDeque2.getClass();
                        dqdVar2 = h7fVar.h;
                        dqdVar2.getClass();
                        arrayDeque2.push(w4cVarC2);
                        while (!arrayDeque2.isEmpty()) {
                            w4cVar2 = (w4c) arrayDeque2.pop();
                            w4cVar2.getClass();
                            if (!dqdVar2.add(w4cVar2)) {
                                if (r8fVar.y(w4cVar2)) {
                                    g7fVar2 = g7fVar3;
                                } else {
                                    g7fVar2 = g7fVar4;
                                }
                                if (g7fVar2.equals(g7fVar3)) {
                                    g7fVar2 = null;
                                }
                                if (g7fVar2 == null) {
                                    continue;
                                } else {
                                    it2 = r8fVar2.E(r8fVar2.G(w4cVar2)).iterator();
                                    while (it2.hasNext()) {
                                        w4cVarA = g7fVar2.A(h7fVar, (xt7) it2.next());
                                        w4cVarA.getClass();
                                        k7fVarG4 = r8fVar.G(w4cVarA);
                                        k7fVarG4.getClass();
                                        if (r8fVar.q0(k7fVarG4)) {
                                            h7fVar.a();
                                            return true;
                                        }
                                        arrayDeque2.add(w4cVarA);
                                    }
                                }
                            }
                        }
                        h7fVar.a();
                        return z2;
                    }
                    if (size != 1) {
                        w4c w4cVar9 = (w4c) s72.u0(arrayList2);
                        w4cVar9.getClass();
                        return x(h7fVar, r8fVar, r8fVar.C0(w4cVar9), w4cVarU2);
                    }
                    pc0Var = new pc0(r8fVar.T(k7fVarG9));
                    iT = r8fVar.T(k7fVarG9);
                    r6 = z2;
                    while (true) {
                        if (r6 < iT) {
                            zX = x(h7fVar, r8fVar, pc0Var, w4cVarU2);
                            break;
                        }
                        if (r8fVar.A(r8fVar.b0(k7fVarG9, r6)) != x8f.OUT) {
                            zX = z2;
                            break;
                        }
                        ArrayList arrayList4 = new ArrayList(t72.u(arrayList2, 10));
                        while (r13.hasNext()) {
                            w4cVar7.getClass();
                            d7fVarZ = r8fVar.z(w4cVar7, r6);
                            if (d7fVarZ != null) {
                                boolean z8 = z5;
                                if (r8fVar.p(d7fVarZ) != x8f.INV) {
                                    d7fVarZ = null;
                                }
                                if (d7fVarZ == null) {
                                }
                            }
                            throw new IllegalStateException(("Incorrect type: " + w4cVar7 + ", subType: " + w4cVarC2 + ", superType: " + w4cVarU2).toString());
                        }
                        boolean z9 = z5;
                        xt7 xt7VarX2 = r8fVar.X(arrayList4);
                        xt7VarX2.getClass();
                        pc0Var.add(r8fVar.Y(xt7VarX2));
                        z5 = z9;
                        r6++;
                    }
                    if (zX) {
                        return z5;
                    }
                    zX2 = z2;
                    while (r3.hasNext()) {
                        if (zX2) {
                            w4cVar8.getClass();
                            zX2 = x(h7fVar, r8fVar, r8fVar.C0(w4cVar8), w4cVarU2);
                        }
                    }
                    return zX2;
                }
            }
        } else {
            k7fVarG = r8fVar.G(w4cVarU2);
            k7fVarG.getClass();
            if (!r8fVar.o0(k7fVarG)) {
                k7fVarG9.getClass();
                if (r8fVar2.y(w4cVarC2)) {
                    if (r8fVar2.w(k7fVarG9)) {
                    }
                    cqdVar = new cqd();
                    h7fVar.b();
                    arrayDeque = h7fVar.g;
                    arrayDeque.getClass();
                    dqdVar = h7fVar.h;
                    dqdVar.getClass();
                    arrayDeque.push(w4cVarC2);
                    while (!arrayDeque.isEmpty()) {
                        w4cVar = (w4c) arrayDeque.pop();
                        w4cVar.getClass();
                        if (!dqdVar.add(w4cVar)) {
                            if (r8fVar2.y(w4cVar)) {
                                cqdVar.add(w4cVar);
                                g7fVar = g7fVar3;
                            } else {
                                g7fVar = g7fVar4;
                            }
                            if (g7fVar.equals(g7fVar3)) {
                                g7fVar = null;
                            }
                            if (g7fVar == null) {
                                it = r8fVar2.E(r8fVar2.G(w4cVar)).iterator();
                                while (it.hasNext()) {
                                    arrayDeque.add(g7fVar.A(h7fVar, (xt7) it.next()));
                                    z4 = z4;
                                }
                            }
                        }
                    }
                    z2 = z4;
                    h7fVar.a();
                    arrayList = new ArrayList();
                    while (r11.hasNext()) {
                        w4cVar4.getClass();
                        x72.g0(arrayList, o(h7fVar, r8fVar2, w4cVar4, k7fVarG9));
                    }
                    listN = arrayList;
                    listN.size();
                    arrayList2 = new ArrayList(t72.u(listN, 10));
                    while (r11.hasNext()) {
                        w4cVar5.getClass();
                        xt7 xt7VarV4 = h7fVar.d.v0(w4cVar5);
                        xt7VarV4.getClass();
                        w4cVarM0 = r8fVar.m0(xt7VarV4);
                        if (w4cVarM0 == null) {
                            w4cVar5 = w4cVarM0;
                        }
                        arrayList2.add(w4cVar5);
                    }
                    size = arrayList2.size();
                    if (size != 0) {
                        k7fVarG2 = r8fVar.G(w4cVarC2);
                        k7fVarG2.getClass();
                        if (r8fVar.w(k7fVarG2)) {
                            return r8fVar.q0(k7fVarG2);
                        }
                        k7fVarG3 = r8fVar.G(w4cVarC2);
                        k7fVarG3.getClass();
                        if (r8fVar.q0(k7fVarG3)) {
                            return true;
                        }
                        h7fVar.b();
                        arrayDeque2 = h7fVar.g;
                        arrayDeque2.getClass();
                        dqdVar2 = h7fVar.h;
                        dqdVar2.getClass();
                        arrayDeque2.push(w4cVarC2);
                        while (!arrayDeque2.isEmpty()) {
                            w4cVar2 = (w4c) arrayDeque2.pop();
                            w4cVar2.getClass();
                            if (!dqdVar2.add(w4cVar2)) {
                                if (r8fVar.y(w4cVar2)) {
                                    g7fVar2 = g7fVar3;
                                } else {
                                    g7fVar2 = g7fVar4;
                                }
                                if (g7fVar2.equals(g7fVar3)) {
                                    g7fVar2 = null;
                                }
                                if (g7fVar2 == null) {
                                    continue;
                                } else {
                                    it2 = r8fVar2.E(r8fVar2.G(w4cVar2)).iterator();
                                    while (it2.hasNext()) {
                                        w4cVarA = g7fVar2.A(h7fVar, (xt7) it2.next());
                                        w4cVarA.getClass();
                                        k7fVarG4 = r8fVar.G(w4cVarA);
                                        k7fVarG4.getClass();
                                        if (r8fVar.q0(k7fVarG4)) {
                                            h7fVar.a();
                                            return true;
                                        }
                                        arrayDeque2.add(w4cVarA);
                                    }
                                }
                            }
                        }
                        h7fVar.a();
                        return z2;
                    }
                    if (size != 1) {
                        w4c w4cVar10 = (w4c) s72.u0(arrayList2);
                        w4cVar10.getClass();
                        return x(h7fVar, r8fVar, r8fVar.C0(w4cVar10), w4cVarU2);
                    }
                    pc0Var = new pc0(r8fVar.T(k7fVarG9));
                    iT = r8fVar.T(k7fVarG9);
                    r6 = z2;
                    while (true) {
                        if (r6 < iT) {
                            zX = x(h7fVar, r8fVar, pc0Var, w4cVarU2);
                            break;
                        }
                        if (r8fVar.A(r8fVar.b0(k7fVarG9, r6)) != x8f.OUT) {
                            zX = z2;
                            break;
                        }
                        ArrayList arrayList5 = new ArrayList(t72.u(arrayList2, 10));
                        while (r13.hasNext()) {
                            w4cVar7.getClass();
                            d7fVarZ = r8fVar.z(w4cVar7, r6);
                            if (d7fVarZ != null) {
                                boolean z10 = z5;
                                if (r8fVar.p(d7fVarZ) != x8f.INV) {
                                    d7fVarZ = null;
                                }
                                if (d7fVarZ == null) {
                                }
                            }
                            throw new IllegalStateException(("Incorrect type: " + w4cVar7 + ", subType: " + w4cVarC2 + ", superType: " + w4cVarU2).toString());
                        }
                        boolean z11 = z5;
                        xt7 xt7VarX3 = r8fVar.X(arrayList5);
                        xt7VarX3.getClass();
                        pc0Var.add(r8fVar.Y(xt7VarX3));
                        z5 = z11;
                        r6++;
                    }
                    if (zX) {
                        return z5;
                    }
                    zX2 = z2;
                    while (r3.hasNext()) {
                        if (zX2) {
                            w4cVar8.getClass();
                            zX2 = x(h7fVar, r8fVar, r8fVar.C0(w4cVar8), w4cVarU2);
                        }
                    }
                    return zX2;
                }
                listN = o(h7fVar, r8fVar2, w4cVarC2, k7fVarG9);
                z2 = false;
                listN.size();
                arrayList2 = new ArrayList(t72.u(listN, 10));
                while (r11.hasNext()) {
                    w4cVar5.getClass();
                    xt7 xt7VarV5 = h7fVar.d.v0(w4cVar5);
                    xt7VarV5.getClass();
                    w4cVarM0 = r8fVar.m0(xt7VarV5);
                    if (w4cVarM0 == null) {
                        w4cVar5 = w4cVarM0;
                    }
                    arrayList2.add(w4cVar5);
                }
                size = arrayList2.size();
                if (size != 0) {
                    k7fVarG2 = r8fVar.G(w4cVarC2);
                    k7fVarG2.getClass();
                    if (r8fVar.w(k7fVarG2)) {
                        return r8fVar.q0(k7fVarG2);
                    }
                    k7fVarG3 = r8fVar.G(w4cVarC2);
                    k7fVarG3.getClass();
                    if (r8fVar.q0(k7fVarG3)) {
                        return true;
                    }
                    h7fVar.b();
                    arrayDeque2 = h7fVar.g;
                    arrayDeque2.getClass();
                    dqdVar2 = h7fVar.h;
                    dqdVar2.getClass();
                    arrayDeque2.push(w4cVarC2);
                    while (!arrayDeque2.isEmpty()) {
                        w4cVar2 = (w4c) arrayDeque2.pop();
                        w4cVar2.getClass();
                        if (!dqdVar2.add(w4cVar2)) {
                            if (r8fVar.y(w4cVar2)) {
                                g7fVar2 = g7fVar3;
                            } else {
                                g7fVar2 = g7fVar4;
                            }
                            if (g7fVar2.equals(g7fVar3)) {
                                g7fVar2 = null;
                            }
                            if (g7fVar2 == null) {
                                continue;
                            } else {
                                it2 = r8fVar2.E(r8fVar2.G(w4cVar2)).iterator();
                                while (it2.hasNext()) {
                                    w4cVarA = g7fVar2.A(h7fVar, (xt7) it2.next());
                                    w4cVarA.getClass();
                                    k7fVarG4 = r8fVar.G(w4cVarA);
                                    k7fVarG4.getClass();
                                    if (r8fVar.q0(k7fVarG4)) {
                                        h7fVar.a();
                                        return true;
                                    }
                                    arrayDeque2.add(w4cVarA);
                                }
                            }
                        }
                    }
                    h7fVar.a();
                    return z2;
                }
                if (size != 1) {
                    w4c w4cVar11 = (w4c) s72.u0(arrayList2);
                    w4cVar11.getClass();
                    return x(h7fVar, r8fVar, r8fVar.C0(w4cVar11), w4cVarU2);
                }
                pc0Var = new pc0(r8fVar.T(k7fVarG9));
                iT = r8fVar.T(k7fVarG9);
                r6 = z2;
                while (true) {
                    if (r6 < iT) {
                        zX = x(h7fVar, r8fVar, pc0Var, w4cVarU2);
                        break;
                    }
                    if (r8fVar.A(r8fVar.b0(k7fVarG9, r6)) != x8f.OUT) {
                        zX = z2;
                        break;
                    }
                    ArrayList arrayList6 = new ArrayList(t72.u(arrayList2, 10));
                    while (r13.hasNext()) {
                        w4cVar7.getClass();
                        d7fVarZ = r8fVar.z(w4cVar7, r6);
                        if (d7fVarZ != null) {
                            boolean z12 = z5;
                            if (r8fVar.p(d7fVarZ) != x8f.INV) {
                                d7fVarZ = null;
                            }
                            if (d7fVarZ == null) {
                            }
                        }
                        throw new IllegalStateException(("Incorrect type: " + w4cVar7 + ", subType: " + w4cVarC2 + ", superType: " + w4cVarU2).toString());
                    }
                    boolean z13 = z5;
                    xt7 xt7VarX4 = r8fVar.X(arrayList6);
                    xt7VarX4.getClass();
                    pc0Var.add(r8fVar.Y(xt7VarX4));
                    z5 = z13;
                    r6++;
                }
                if (zX) {
                    return z5;
                }
                zX2 = z2;
                while (r3.hasNext()) {
                    if (zX2) {
                        w4cVar8.getClass();
                        zX2 = x(h7fVar, r8fVar, r8fVar.C0(w4cVar8), w4cVarU2);
                    }
                }
                return zX2;
            }
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 29:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.cu2
    public Object v(Object obj) {
        return (vyb) obj;
    }

    @Override // defpackage.czc
    public Object v0(Object obj, abf abfVar, ke5 ke5Var) {
        v56 v56VarA;
        Map mapA = ((p79) obj).a();
        msa msaVarN = osa.n();
        for (Map.Entry entry : mapA.entrySet()) {
            isa isaVar = (isa) entry.getKey();
            Object value = entry.getValue();
            String str = isaVar.a;
            if (value instanceof Boolean) {
                rsa rsaVarV = ssa.v();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                rsaVarV.c();
                ((ssa) rsaVarV.b).w(zBooleanValue);
                v56VarA = rsaVarV.a();
            } else if (value instanceof Float) {
                rsa rsaVarV2 = ssa.v();
                float fFloatValue = ((Number) value).floatValue();
                rsaVarV2.c();
                ((ssa) rsaVarV2.b).z(fFloatValue);
                v56VarA = rsaVarV2.a();
            } else if (value instanceof Double) {
                rsa rsaVarV3 = ssa.v();
                double dDoubleValue = ((Number) value).doubleValue();
                rsaVarV3.c();
                ((ssa) rsaVarV3.b).y(dDoubleValue);
                v56VarA = rsaVarV3.a();
            } else if (value instanceof Integer) {
                rsa rsaVarV4 = ssa.v();
                int iIntValue = ((Number) value).intValue();
                rsaVarV4.c();
                ((ssa) rsaVarV4.b).A(iIntValue);
                v56VarA = rsaVarV4.a();
            } else if (value instanceof Long) {
                rsa rsaVarV5 = ssa.v();
                long jLongValue = ((Number) value).longValue();
                rsaVarV5.c();
                ((ssa) rsaVarV5.b).B(jLongValue);
                v56VarA = rsaVarV5.a();
            } else if (value instanceof String) {
                rsa rsaVarV6 = ssa.v();
                rsaVarV6.c();
                ((ssa) rsaVarV6.b).C((String) value);
                v56VarA = rsaVarV6.a();
            } else if (value instanceof Set) {
                rsa rsaVarV7 = ssa.v();
                psa psaVarO = qsa.o();
                psaVarO.c();
                ((qsa) psaVarO.b).l((Set) value);
                rsaVarV7.c();
                ((ssa) rsaVarV7.b).D((qsa) psaVarO.a());
                v56VarA = rsaVarV7.a();
            } else {
                if (!(value instanceof byte[])) {
                    qc0.p("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return null;
                }
                rsa rsaVarV8 = ssa.v();
                byte[] bArr = (byte[]) value;
                w61 w61VarD = b71.d(bArr, 0, bArr.length);
                rsaVarV8.c();
                ((ssa) rsaVarV8.b).x(w61VarD);
                v56VarA = rsaVarV8.a();
            }
            msaVarN.getClass();
            str.getClass();
            msaVarN.c();
            ((osa) msaVarN.b).m().put(str, (ssa) v56VarA);
        }
        osa osaVar = (osa) msaVarN.a();
        int iA = osaVar.a(null);
        Logger logger = m72.f;
        if (iA > 4096) {
            iA = 4096;
        }
        m72 m72Var = new m72(abfVar, iA);
        osaVar.k(m72Var);
        if (m72Var.d > 0) {
            m72Var.k();
        }
        return wef.a;
    }

    @Override // defpackage.t07
    public void a() {
    }

    @Override // defpackage.mjd
    public void lock() {
    }

    @Override // defpackage.mjd
    public void unlock() {
    }

    @Override // defpackage.t07
    public void f(lu3 lu3Var) {
    }

    @Override // defpackage.fx9
    public int l(sw3 sw3Var, int i) {
        return i;
    }
}
