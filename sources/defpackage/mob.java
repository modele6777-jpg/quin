package defpackage;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class mob extends kob {
    public static xm7 m(ga1 ga1Var) {
        vm7 owner = ga1Var.getOwner();
        return owner instanceof xm7 ? (xm7) owner : mu4.b;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kob
    public final ym7 a(g36 g36Var) throws IOException {
        boolean z;
        xm7 xm7VarM = m(g36Var);
        String name = g36Var.getName();
        String signature = g36Var.getSignature();
        if (!rce.a) {
            int i = 0;
            if ((xm7VarM instanceof nm7) && ((nm7) xm7VarM).b.getAnnotation(Metadata.class) == null) {
                em7 em7Var = (em7) xm7VarM;
                if (pa7.t(af1.R(em7Var).getCanonicalName(), em7Var.g())) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (name.equals("<init>")) {
                Object obj = null;
                constructor = null;
                Constructor<?> constructor = null;
                obj = null;
                if (!z) {
                    signature.getClass();
                    Iterator it = xm7VarM.I().iterator();
                    Object obj2 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (i == 0) {
                                break;
                            }
                            obj = obj2;
                            break;
                        }
                        Object next = it.next();
                        lq7 lq7Var = (lq7) next;
                        lq7Var.getClass();
                        if (String.valueOf(cn1.B(lq7Var).a).equals(signature)) {
                            if (i != 0) {
                                break;
                            }
                            i = 1;
                            obj2 = next;
                        }
                    }
                    lq7 lq7Var2 = (lq7) obj;
                    if (lq7Var2 != null) {
                        return new ns7(xm7VarM, signature, g36Var.getBoundReceiver(), lq7Var2);
                    }
                    String strD0 = s72.D0(xm7VarM.I(), "\n", null, null, tj7.w, 30);
                    StringBuilder sb = new StringBuilder("Constructor (JVM signature: ");
                    sb.append(signature);
                    sb.append(") not resolved in ");
                    sb.append(xm7VarM);
                    sb.append(':');
                    sb.append(strD0.length() != 0 ? " several matching constructors found:\n".concat(strD0) : " no constructors found");
                    throw new pt7(sb.toString());
                }
                signature.getClass();
                Constructor<?>[] declaredConstructors = xm7VarM.d().getDeclaredConstructors();
                declaredConstructors.getClass();
                int length = declaredConstructors.length;
                boolean z2 = false;
                Constructor<?> constructor2 = null;
                while (true) {
                    if (i >= length) {
                        if (!z2) {
                            break;
                        }
                        constructor = constructor2;
                        break;
                    }
                    Constructor<?> constructor3 = declaredConstructors[i];
                    constructor3.getClass();
                    if (o8c.l(constructor3).equals(signature)) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        constructor2 = constructor3;
                    }
                    i++;
                    z2 = z2;
                }
                if (constructor != null) {
                    return new ue7(xm7VarM, constructor, g36Var.getBoundReceiver());
                }
                Constructor<?>[] declaredConstructors2 = xm7VarM.d().getDeclaredConstructors();
                declaredConstructors2.getClass();
                String strT0 = qd0.t0(declaredConstructors2, "\n", null, null, tj7.x, 30);
                StringBuilder sb2 = new StringBuilder("Constructor (JVM signature: ");
                sb2.append(signature);
                sb2.append(") not resolved in ");
                sb2.append(xm7VarM);
                sb2.append(':');
                sb2.append(strT0.length() != 0 ? "\n".concat(strT0) : " no constructors found");
                throw new pt7(sb2.toString());
            }
            if (z) {
                signature.getClass();
                String strSubstring = signature.substring(v4e.N(signature, '(', 0, 6), signature.length());
                w84 w84VarM = sqf.m(smb.d(xm7VarM.d()), strSubstring, true);
                Class[] clsArr = (Class[]) ((ArrayList) w84VarM.b).toArray(new Class[0]);
                Class cls = (Class) w84VarM.c;
                cls.getClass();
                Method methodO = xm7.O(xm7VarM.M(), name, clsArr, cls, false);
                if (methodO == null) {
                    Method[] declaredMethods = xm7VarM.d().getDeclaredMethods();
                    declaredMethods.getClass();
                    String strT1 = qd0.t0(declaredMethods, "\n", null, null, tj7.v, 30);
                    StringBuilder sbO = ib8.o("Method '", name, "' (JVM signature: ", strSubstring, ") not resolved in ");
                    sbO.append(xm7VarM);
                    sbO.append(':');
                    sbO.append(strT1.length() == 0 ? " no methods found" : "\n".concat(strT1));
                    throw new pt7(sbO.toString());
                }
                if (Modifier.isStatic(methodO.getModifiers())) {
                    return new af7(xm7VarM, methodO, g36Var.getBoundReceiver(), dm7.j);
                }
            } else if (xm7VarM instanceof nn7) {
                signature.getClass();
                nn7 nn7Var = (nn7) xm7VarM;
                ArrayList arrayListQ = nn7Var.Q();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListQ) {
                    sq7 sq7Var = (sq7) obj3;
                    if (pa7.t(sq7Var.b, name) && String.valueOf(cn1.C(sq7Var).a).equals(signature)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.size() == 1) {
                    return new xs7(xm7VarM, signature, g36Var.getBoundReceiver(), (sq7) s72.X0(arrayList), dm7.j);
                }
                String strD1 = s72.D0(nn7Var.Q(), "\n", null, null, tj7.f, 30);
                StringBuilder sbO2 = ib8.o("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbO2.append(xm7VarM);
                sbO2.append(':');
                sbO2.append(strD1.length() == 0 ? " no members found" : " several matching members found:\n".concat(strD1));
                throw new pt7(sbO2.toString());
            }
        }
        Object boundReceiver = g36Var.getBoundReceiver();
        name.getClass();
        signature.getClass();
        return new tx3(xm7VarM, name, signature, null, boundReceiver, dm7.j);
    }

    @Override // defpackage.kob
    public final em7 b(Class cls) {
        return y81.a(cls);
    }

    @Override // defpackage.kob
    public final vm7 c(Class cls) {
        k47 k47Var = y81.a;
        cls.getClass();
        return (vm7) y81.b.z(cls);
    }

    @Override // defpackage.kob
    public final yn7 d(yn7 yn7Var) {
        String strG;
        yn7Var.getClass();
        if (!rce.a) {
            ljd ljdVar = (ljd) yn7Var;
            um7 um7Var = ljdVar.b;
            em7 em7Var = um7Var instanceof em7 ? (em7) um7Var : null;
            if (em7Var == null || (strG = em7Var.g()) == null) {
                ho7.m(yn7Var, "Non-class type cannot be a mutable collection type: ");
                return null;
            }
            String str = qf7.a;
            dx5 dx5VarI = qf7.i(new ex5(strG));
            if (dx5VarI != null) {
                return new ljd(ljdVar.b, ljdVar.c, ljdVar.d, ljdVar.e, ljdVar.f, ljdVar.g, ljdVar.v, ljdVar.w, urg.D(dx5VarI, (em7) um7Var), null);
            }
            yg5.l(yn7Var, "Not a readonly collection: ");
            return null;
        }
        tt7 tt7Var = ((zy3) yn7Var).b;
        if (!(tt7Var instanceof tjd)) {
            ho7.y(yn7Var, "Non-simple type cannot be a mutable collection type: ");
            return null;
        }
        y22 y22VarM = tt7Var.c0().m();
        u09 u09Var = y22VarM instanceof u09 ? (u09) y22VarM : null;
        if (u09Var == null) {
            yg5.l(yn7Var, "Non-class type cannot be a mutable collection type: ");
            return null;
        }
        tjd tjdVar = (tjd) tt7Var;
        String str2 = qf7.a;
        int i = qz3.a;
        ex5 ex5VarF = oz3.f(u09Var);
        ex5VarF.getClass();
        dx5 dx5VarI2 = qf7.i(ex5VarF);
        if (dx5VarI2 == null) {
            yg5.l(u09Var, "Not a readonly collection: ");
            return null;
        }
        j7f j7fVarH = qz3.e(u09Var).j(dx5VarI2).h();
        j7fVarH.getClass();
        e7f e7fVarA0 = tjdVar.a0();
        List listZ = tjdVar.Z();
        boolean zI0 = tjdVar.i0();
        e7fVarA0.getClass();
        listZ.getClass();
        return new zy3(rxg.T(e7fVarA0, j7fVarH, listZ, zI0), null, false);
    }

    @Override // defpackage.kob
    public final fn7 e(zf3 zf3Var) {
        xm7 xm7VarM = m(zf3Var);
        String name = zf3Var.getName();
        String signature = zf3Var.getSignature();
        if (rce.a) {
            return new vx3(xm7VarM, name, signature, zf3Var.getBoundReceiver());
        }
        lob lobVar = new lob(signature, xm7VarM, zf3Var, name, 1);
        name.getClass();
        return new ny7(name, lobVar);
    }

    @Override // defpackage.kob
    public final hn7 f(q79 q79Var) {
        xm7 xm7VarM = m(q79Var);
        String name = q79Var.getName();
        String signature = q79Var.getSignature();
        if (rce.a) {
            return new xx3(xm7VarM, name, signature, q79Var.getBoundReceiver());
        }
        lob lobVar = new lob(xm7VarM, name, signature, q79Var, 3);
        name.getClass();
        return new oy7(name, lobVar);
    }

    @Override // defpackage.kob
    public final sn7 g(uw7 uw7Var) {
        xm7 xm7VarM = m(uw7Var);
        String name = uw7Var.getName();
        String signature = uw7Var.getSignature();
        return !rce.a ? new py7(name, new lob(signature, xm7VarM, uw7Var, name, 0)) : new ny3(xm7VarM, name, signature, uw7Var.getBoundReceiver());
    }

    @Override // defpackage.kob
    public final un7 h(aya ayaVar) {
        xm7 xm7VarM = m(ayaVar);
        String name = ayaVar.getName();
        String signature = ayaVar.getSignature();
        return !rce.a ? new qy7(name, new lob(xm7VarM, name, signature, ayaVar, 2)) : new qy3(xm7VarM, name, signature, ayaVar.getBoundReceiver());
    }

    @Override // defpackage.kob
    public final vn7 i(bya byaVar) {
        return new ty3(m(byaVar), byaVar.getName(), byaVar.getSignature());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    @Override // defpackage.kob
    public final String j(w26 w26Var) throws IOException {
        tx3 tx3Var;
        Metadata metadata = (Metadata) w26Var.getClass().getAnnotation(Metadata.class);
        Object obj = null;
        if (metadata == null) {
            tx3Var = null;
        } else {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 == null) {
                tx3Var = null;
            } else {
                iy9 iy9VarG = sl7.g(strArrD1, metadata.d2());
                wk7 wk7Var = (wk7) iy9VarG.a();
                dza dzaVar = (dza) iy9VarG.b();
                fv8 fv8Var = new fv8(metadata.mv(), (metadata.xi() & 8) != 0);
                Class<?> cls = w26Var.getClass();
                b0b b0bVarN0 = dzaVar.n0();
                b0bVarN0.getClass();
                tx3Var = new tx3(mu4.b, (hjd) sqf.g(cls, hob.a, dzaVar, wk7Var, new bu3(b0bVarN0), fv8Var, eob.a));
            }
        }
        if (tx3Var == null) {
            return super.j(w26Var);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = tx3Var.getParameters().iterator();
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                obj = obj2;
                break;
            }
            Object next = it.next();
            if (((aob) next).t() == on7.c) {
                if (z) {
                    break;
                }
                z = true;
                obj2 = next;
            }
        }
        aob aobVar = (aob) obj;
        if (aobVar != null) {
            sb.append(af8.C(aobVar.u(), false));
            sb.append(".");
        }
        s72.C0(mh3.J(tx3Var), sb, ", ", "(", ")", d5a.F0, 48);
        sb.append(" -> ");
        sb.append(af8.C(tx3Var.getReturnType(), false));
        return sb.toString();
    }

    @Override // defpackage.kob
    public final String k(gu7 gu7Var) {
        return j(gu7Var);
    }

    @Override // defpackage.kob
    public final yn7 l(em7 em7Var, List list, boolean z) {
        if (!(em7Var instanceof y12)) {
            return qn4.w(em7Var, list, z, Collections.EMPTY_LIST);
        }
        Class clsD = ((y12) em7Var).d();
        k47 k47Var = y81.a;
        clsD.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return z ? (yn7) y81.d.z(clsD) : (yn7) y81.c.z(clsD);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) y81.e.z(clsD);
        iy9 iy9Var = new iy9(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(iy9Var);
        if (obj == null) {
            j2 j2VarY = qn4.y(y81.a(clsD), list, z, pu4.a, null);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(iy9Var, j2VarY);
            obj = objPutIfAbsent == null ? j2VarY : objPutIfAbsent;
        }
        return (yn7) obj;
    }
}
