package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nfc {
    public final z3b a;
    public final String b;
    public final boolean c;
    public final j8f d;
    public final hr7 e;
    public final ArrayList f;
    public volatile ThreadLocal g;

    public nfc(z3b z3bVar, String str, j8f j8fVar, hr7 hr7Var, int i) {
        boolean z = (i & 4) == 0;
        j8fVar = (i & 8) != 0 ? null : j8fVar;
        z3bVar.getClass();
        this.a = z3bVar;
        this.b = str;
        this.c = z;
        this.d = j8fVar;
        this.e = hr7Var;
        this.f = new ArrayList();
        new LinkedHashSet();
    }

    public final void a(ad0 ad0Var) {
        if (!ad0Var.isEmpty()) {
            ad0Var.removeFirst();
        }
        if (ad0Var.isEmpty()) {
            e().remove();
        }
    }

    public final Object b(em7 em7Var, z3b z3bVar, x16 x16Var) {
        em7Var.getClass();
        return g(em7Var, x16Var != null ? (nz9) x16Var.invoke() : null, z3bVar);
    }

    public final ArrayList c(em7 em7Var) {
        em7Var.getClass();
        hr7 hr7Var = this.e;
        hbc hbcVar = new hbc(hr7Var.a, this, em7Var);
        j8f j8fVar = this.d;
        hbcVar.f = j8fVar;
        ta0 ta0Var = hr7Var.d;
        ta0Var.getClass();
        Collection collectionValues = ((ConcurrentHashMap) ta0Var.d).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            yw0 yw0Var = ((u57) obj).a;
            z3b z3bVar = yw0Var.a;
            if (pa7.t(z3bVar, this.a) || pa7.t(z3bVar, j8fVar)) {
                if (pa7.t(yw0Var.b, em7Var) || yw0Var.f.contains(em7Var)) {
                    arrayList.add(obj);
                }
            }
        }
        List listJ1 = s72.j1(s72.n1(arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listJ1.iterator();
        while (it.hasNext()) {
            Object objB = ((u57) it.next()).b(hbcVar);
            if (objB == null) {
                objB = null;
            }
            if (objB != null) {
                arrayList2.add(objB);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            x72.g0(arrayList3, ((nfc) it2.next()).c(em7Var));
        }
        return s72.Q0(arrayList2, arrayList3);
    }

    public final Object d(em7 em7Var, o4e o4eVar) {
        a48 a48Var = a48.a;
        hr7 hr7Var = this.e;
        em7Var.getClass();
        try {
            return g(em7Var, null, o4eVar);
        } catch (kf9 unused) {
            rs0 rs0Var = hr7Var.a;
            String str = "* No instance found for type '" + fm7.a(em7Var) + "' on scope '" + this + '\'';
            rs0Var.getClass();
            rs0Var.H(a48Var, str);
            return null;
        }
    }

    public final ThreadLocal e() {
        ThreadLocal threadLocal;
        ThreadLocal threadLocal2 = this.g;
        if (threadLocal2 != null) {
            return threadLocal2;
        }
        synchronized (this) {
            threadLocal = this.g;
            if (threadLocal == null) {
                threadLocal = new ThreadLocal();
                this.g = threadLocal;
            }
        }
        return threadLocal;
    }

    public final ad0 f(nz9 nz9Var) {
        nz9Var.getClass();
        ad0 ad0Var = (ad0) e().get();
        if (ad0Var == null) {
            ad0Var = new ad0();
            e().set(ad0Var);
        }
        ad0Var.addFirst(nz9Var);
        return ad0Var;
    }

    public final Object g(em7 em7Var, nz9 nz9Var, z3b z3bVar) {
        String str;
        hr7 hr7Var = this.e;
        hr7Var.a.getClass();
        a48 a48Var = a48.e;
        a48 a48Var2 = a48.a;
        if (a48Var.compareTo(a48Var2) > 0) {
            return i(em7Var, nz9Var, z3bVar);
        }
        if (z3bVar != null) {
            str = " with qualifier '" + z3bVar + '\'';
        } else {
            str = "";
        }
        String strL = this.c ? "" : ub3.l(new StringBuilder(" - scope:'"), this.b, '\'');
        hr7Var.a.u(a48Var2, "|- '" + fm7.a(em7Var) + '\'' + str + strL + "...");
        long jA = a19.a();
        Object objI = i(em7Var, nz9Var, z3bVar);
        long jA2 = zxe.a(jA);
        rs0 rs0Var = hr7Var.a;
        StringBuilder sb = new StringBuilder("|- '");
        sb.append(fm7.a(em7Var));
        sb.append("' in ");
        qfc qfcVar = ar4.b;
        sb.append(ar4.h(jA2, gr4.MICROSECONDS) / 1000.0d);
        sb.append(" ms");
        rs0Var.u(a48Var2, sb.toString());
        return objI;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01b7 A[PHI: r1
  0x01b7: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v17 java.lang.Object), (r1v22 java.lang.Object) binds: [B:9:0x0025, B:24:0x0053, B:103:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object h(hbc hbcVar) throws kf9 {
        String str;
        String str2;
        String str3;
        ThreadLocal threadLocal;
        ad0 ad0Var;
        nz9 nz9Var;
        u57 u57VarM;
        Object objB;
        ThreadLocal threadLocal2;
        ad0 ad0Var2;
        nz9 nz9Var2;
        j8f j8fVar;
        k47 k47Var = this.e.b;
        k47Var.getClass();
        nz9 nz9Var3 = (nz9) hbcVar.e;
        Object obj = null;
        Object objA = (nz9Var3 == null || nz9Var3.a.isEmpty()) ? null : ((nz9) hbcVar.e).a((em7) hbcVar.c);
        if (objA != null) {
            obj = objA;
        } else {
            objA = (((z3b) hbcVar.d) != null || (threadLocal = this.g) == null || (ad0Var = (ad0) threadLocal.get()) == null || ad0Var.isEmpty() || (nz9Var = (nz9) ad0Var.i()) == null) ? null : nz9Var.a((em7) hbcVar.c);
            if (objA == null) {
                hr7 hr7Var = (hr7) k47Var.b;
                ta0 ta0Var = hr7Var.d;
                em7 em7Var = (em7) hbcVar.c;
                z3b z3bVar = (z3b) hbcVar.d;
                u57 u57VarM2 = ta0Var.M(em7Var, z3bVar, this.a);
                if (u57VarM2 == null) {
                    if (this.c || (j8fVar = this.d) == null) {
                        u57VarM2 = null;
                    } else {
                        hbcVar.f = j8fVar;
                        u57VarM2 = hr7Var.d.M((em7) hbcVar.c, z3bVar, j8fVar);
                    }
                }
                objA = u57VarM2 != null ? u57VarM2.b(hbcVar) : null;
                if (objA == null) {
                    if (!this.c && ((z3b) hbcVar.d) == null) {
                        ((em7) hbcVar.c).D(null);
                    }
                    ArrayList arrayList = this.f;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    ad0 ad0Var3 = new ad0(new sm8(arrayList));
                    while (!ad0Var3.isEmpty()) {
                        nfc nfcVar = (nfc) ad0Var3.removeLast();
                        if (linkedHashSet.add(nfcVar)) {
                            Iterator it = nfcVar.f.iterator();
                            it.getClass();
                            while (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                nfc nfcVar2 = (nfc) next;
                                if (!linkedHashSet.contains(nfcVar2)) {
                                    ad0Var3.addLast(nfcVar2);
                                }
                            }
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it2 = linkedHashSet.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                objA = null;
                                break;
                            }
                            nfc nfcVar3 = (nfc) it2.next();
                            hr7 hr7Var2 = (hr7) k47Var.b;
                            j8f j8fVar2 = nfcVar3.d;
                            if (j8fVar2 == null || (u57VarM = hr7Var2.d.M((em7) hbcVar.c, (z3b) hbcVar.d, j8fVar2)) == null) {
                                u57VarM = hr7Var2.d.M((em7) hbcVar.c, (z3b) hbcVar.d, nfcVar3.a);
                            }
                            u57 u57Var = u57VarM;
                            if (u57Var == null) {
                                objB = (((z3b) hbcVar.d) != null || (threadLocal2 = nfcVar3.g) == null || (ad0Var2 = (ad0) threadLocal2.get()) == null || ad0Var2.isEmpty() || (nz9Var2 = (nz9) ad0Var2.i()) == null) ? null : nz9Var2.a((em7) hbcVar.c);
                                if (objB != null) {
                                }
                            } else {
                                if (nfcVar3.c && !(u57Var instanceof ckd)) {
                                    objA = u57Var.b(hbcVar);
                                    break;
                                }
                                rs0 rs0Var = (rs0) hbcVar.a;
                                em7 em7Var2 = (em7) hbcVar.c;
                                z3b z3bVar2 = (z3b) hbcVar.d;
                                nz9 nz9Var4 = (nz9) hbcVar.e;
                                hbc hbcVar2 = new hbc(rs0Var, nfcVar3, em7Var2, z3bVar2, nz9Var4);
                                j8f j8fVar3 = nfcVar3.d;
                                hbcVar2.f = j8fVar3;
                                if (j8fVar3 != null && !nfcVar3.c) {
                                    hbcVar2.f = j8fVar3;
                                }
                                ad0 ad0VarF = nz9Var4 != null ? nfcVar3.f(nz9Var4) : null;
                                objB = u57Var.b(hbcVar2);
                                if (ad0VarF != null) {
                                    nfcVar3.a(ad0VarF);
                                }
                            }
                            objA = objB;
                            break;
                        }
                    }
                    objA = null;
                    break;
                }
                if (objA == null) {
                    Iterator it3 = ((ArrayList) k47Var.c).iterator();
                    if (it3.hasNext()) {
                        throw kv2.g(it3);
                    }
                } else {
                    obj = objA;
                }
            } else {
                obj = objA;
            }
        }
        if (obj != null) {
            return obj;
        }
        z3b z3bVar3 = (z3b) hbcVar.d;
        String string = "";
        if (z3bVar3 != null) {
            str = " and qualifier '" + z3bVar3 + '\'';
        } else {
            str = "";
        }
        if (pa7.t((nfc) hbcVar.b, this)) {
            str2 = "scope '" + this + '\'';
        } else {
            str2 = "scope '" + this + "' (resolution context scope: '" + ((nfc) hbcVar.b) + "')";
        }
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(t72.u(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((nfc) it4.next()).b);
        }
        if (!arrayList3.isEmpty()) {
            StringBuilder sb = new StringBuilder(" Searched scopes: ['");
            sb.append(this.b);
            sb.append("'] -> ");
            ArrayList arrayList4 = new ArrayList(t72.u(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                arrayList4.add("['" + ((String) it5.next()) + "']");
            }
            sb.append(arrayList4);
            string = sb.toString();
        }
        String strA = fm7.a((em7) hbcVar.c);
        if (v4e.g0('.', strA, strA).equals("SavedStateHandle")) {
            str3 = " SavedStateHandle is provided by the ViewModel's CreationExtras during creation, not by a module definition — resolve the ViewModel via koinViewModel()/koinNavViewModel() with a proper owner and inject SavedStateHandle in its constructor (do not resolve it lazily or outside construction).";
        } else {
            str3 = " Check or add definition for type '" + strA + '\'' + str + " in scope '" + this.a + "'.";
        }
        throw new kf9("No definition found for type '" + strA + '\'' + str + " on " + str2 + '.' + string + '.' + str3);
    }

    public final Object i(em7 em7Var, nz9 nz9Var, z3b z3bVar) {
        hr7 hr7Var = this.e;
        hbc hbcVar = new hbc(hr7Var.a, this, em7Var, z3bVar, nz9Var);
        if (nz9Var == null) {
            return h(hbcVar);
        }
        rs0 rs0Var = hr7Var.a;
        rs0Var.getClass();
        a48 a48Var = a48.e;
        a48 a48Var2 = a48.a;
        if (a48Var.compareTo(a48Var2) <= 0) {
            rs0Var.u(a48Var2, "| >> parameters " + nz9Var);
        }
        ad0 ad0VarF = f(nz9Var);
        try {
            return h(hbcVar);
        } finally {
            rs0 rs0Var2 = hr7Var.a;
            rs0Var2.getClass();
            rs0Var2.H(a48Var2, "| << parameters");
            a(ad0VarF);
        }
    }

    public final String toString() {
        return ks0.l(new StringBuilder("['"), this.b, "']");
    }
}
