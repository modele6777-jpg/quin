package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class sx3 implements x16 {
    public final /* synthetic */ int a;
    public final tx3 b;

    public /* synthetic */ sx3(tx3 tx3Var, int i) {
        this.a = i;
        this.b = tx3Var;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0298  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.x16
    public final Object invoke() {
        hb1 hb1VarI;
        GenericDeclaration declaredConstructor;
        hb1 hb1VarI2;
        em7 em7Var;
        Object next;
        znb znbVar;
        int i = this.a;
        tx3 tx3Var = this.b;
        Object objF = null;
        switch (i) {
            case 0:
                j22 j22Var = n8c.a;
                c36 c36VarG = tx3Var.G();
                xm7 xm7Var = tx3Var.v;
                xo1 xo1VarC = n8c.c(c36VarG);
                boolean z = xo1VarC instanceof pk7;
                p00 p00Var = p00.b;
                if (z) {
                    if (ynb.P(tx3Var)) {
                        Class clsD = xm7Var.d();
                        List parameters = tx3Var.getParameters();
                        ArrayList arrayList = new ArrayList(t72.u(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((aob) it.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        return new r00(clsD, arrayList, p00Var);
                    }
                    String str = ((pk7) xo1VarC).p.H0;
                    xm7Var.getClass();
                    str.getClass();
                    Class clsD2 = xm7Var.d();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) sqf.m(smb.d(xm7Var.d()), str, false).b).toArray(new Class[0]);
                        objF = clsD2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                        break;
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (xo1VarC instanceof qk7) {
                    sk7 sk7Var = ((qk7) xo1VarC).p;
                    objF = xm7Var.F(sk7Var.G0, sk7Var.H0);
                } else if (xo1VarC instanceof ok7) {
                    objF = ((ok7) xo1VarC).p;
                } else {
                    if (!(xo1VarC instanceof nk7)) {
                        if (!(xo1VarC instanceof mk7)) {
                            ap.c();
                            return null;
                        }
                        List list = ((mk7) xo1VarC).p;
                        Class clsD3 = xm7Var.d();
                        ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new r00(clsD3, arrayList2, p00Var, q00.a, list);
                    }
                    objF = ((nk7) xo1VarC).p;
                }
                if (objF instanceof Constructor) {
                    hb1VarI = tx3Var.H((Constructor) objF, tx3Var.G(), false);
                } else {
                    if (!(objF instanceof Method)) {
                        throw new pt7("Could not compute caller for function: " + tx3Var.G() + " (member = " + objF + ')');
                    }
                    Method method = (Method) objF;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        hb1VarI = ynb.Q(tx3Var) ? new db1(method, ynb.J(tx3Var)) : new gb1(method, false, 6, 0);
                    } else if (((m4) tx3Var.G()).getAnnotations().R(sqf.a) != null) {
                        hb1VarI = ynb.Q(tx3Var) ? new eb1(method, false, 4) : new gb1(method, true, 4, 1);
                    } else {
                        hb1VarI = tx3Var.I(method, false);
                    }
                }
                return w6c.h(hb1VarI, tx3Var, pu4.a, false);
            case 1:
                ArrayList arrayList3 = new ArrayList();
                j22 j22Var2 = n8c.a;
                c36 c36VarG2 = tx3Var.G();
                xm7 xm7Var2 = tx3Var.v;
                xo1 xo1VarC2 = n8c.c(c36VarG2);
                if (!(xo1VarC2 instanceof qk7)) {
                    boolean z2 = xo1VarC2 instanceof pk7;
                    p00 p00Var2 = p00.a;
                    if (z2) {
                        if (ynb.P(tx3Var)) {
                            Class clsD4 = xm7Var2.d();
                            List parameters2 = tx3Var.getParameters();
                            ArrayList arrayList4 = new ArrayList(t72.u(parameters2, 10));
                            Iterator it3 = parameters2.iterator();
                            while (it3.hasNext()) {
                                String name2 = ((aob) it3.next()).getName();
                                name2.getClass();
                                arrayList4.add(name2);
                            }
                            return new r00(clsD4, arrayList4, p00Var2);
                        }
                        fz3 fz3VarN = feg.N(tx3Var, ((pk7) xo1VarC2).p.H0);
                        arrayList3.addAll((Set) fz3VarN.c);
                        String str2 = (String) fz3VarN.b;
                        xm7Var2.getClass();
                        str2.getClass();
                        Class clsD5 = xm7Var2.d();
                        ArrayList arrayList5 = new ArrayList();
                        xm7.w(arrayList5, (ArrayList) sqf.m(smb.d(xm7Var2.d()), str2, false).b, true, false);
                        try {
                            Class[] clsArr2 = (Class[]) arrayList5.toArray(new Class[0]);
                            declaredConstructor = clsD5.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = null;
                        }
                    } else if (xo1VarC2 instanceof mk7) {
                        List list2 = ((mk7) xo1VarC2).p;
                        Class clsD6 = xm7Var2.d();
                        ArrayList arrayList6 = new ArrayList(t72.u(list2, 10));
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList6.add(((Method) it4.next()).getName());
                        }
                        return new r00(clsD6, arrayList6, p00Var2, q00.a, list2);
                    }
                    declaredConstructor = null;
                    break;
                } else {
                    ArrayList arrayListJ = mh3.J(tx3Var);
                    if (arrayListJ.isEmpty()) {
                        if (xm7Var2 instanceof em7) {
                            em7Var = (em7) xm7Var2;
                        } else {
                            em7Var = null;
                        }
                        if (em7Var == null && em7Var.q()) {
                            Member memberB = tx3Var.h().b();
                            memberB.getClass();
                            if (Modifier.isStatic(memberB.getModifiers())) {
                                Collection collectionL = tx3Var.G().l();
                                collectionL.getClass();
                                Collection<c36> collection = collectionL;
                                ArrayList arrayList7 = new ArrayList(t72.u(collection, 10));
                                for (c36 c36Var : collection) {
                                    bm3 bm3VarK = c36Var.k();
                                    bm3VarK.getClass();
                                    Class clsQ = sqf.q((u09) bm3VarK);
                                    if (clsQ == null) {
                                        ho7.m(tx3Var, "Unknown container class for overridden function: ");
                                        return null;
                                    }
                                    arrayList7.add(new tx3((nm7) job.a.b(clsQ), c36Var));
                                }
                                Iterator it5 = arrayList7.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        ArrayList arrayListJ2 = mh3.J((znb) next);
                                        if (!arrayListJ2.isEmpty()) {
                                            Iterator it6 = arrayListJ2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    aob aobVar = (aob) it6.next();
                                                    if (aobVar == null) {
                                                        aobVar = null;
                                                    }
                                                    if (aobVar == null || !aobVar.f()) {
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                znbVar = (znb) next;
                            } else {
                                znbVar = null;
                            }
                        } else {
                            znbVar = null;
                        }
                    } else {
                        Iterator it7 = arrayListJ.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                aob aobVar2 = (aob) it7.next();
                                if (aobVar2 == null) {
                                    aobVar2 = null;
                                }
                                if (aobVar2 == null || !aobVar2.f()) {
                                }
                            } else {
                                if (xm7Var2 instanceof em7) {
                                    em7Var = (em7) xm7Var2;
                                } else {
                                    em7Var = null;
                                }
                                if (em7Var == null) {
                                }
                            }
                            znbVar = null;
                        }
                    }
                    if (znbVar != null) {
                        String strI0 = v4e.i0(znbVar.getSignature(), '(');
                        fz3 fz3VarN2 = feg.N(znbVar, znbVar.getSignature().substring(strI0.length()));
                        arrayList3.addAll((Set) fz3VarN2.c);
                        declaredConstructor = xm7Var2.z(strI0, (String) fz3VarN2.b, true, tx3Var.G().O() != null);
                    } else {
                        sk7 sk7Var2 = ((qk7) xo1VarC2).p;
                        fz3 fz3VarN3 = feg.N(tx3Var, sk7Var2.H0);
                        arrayList3.addAll((Set) fz3VarN3.c);
                        String str3 = sk7Var2.G0;
                        String str4 = (String) fz3VarN3.b;
                        Member memberB2 = tx3Var.h().b();
                        memberB2.getClass();
                        declaredConstructor = xm7Var2.z(str3, str4, !Modifier.isStatic(memberB2.getModifiers()), tx3Var.G().O() != null);
                    }
                }
                if (declaredConstructor instanceof Constructor) {
                    hb1VarI2 = tx3Var.H((Constructor) declaredConstructor, tx3Var.G(), true);
                } else if (!(declaredConstructor instanceof Method)) {
                    hb1VarI2 = null;
                } else if (((m4) tx3Var.G()).getAnnotations().R(sqf.a) != null) {
                    bm3 bm3VarK2 = tx3Var.G().k();
                    bm3VarK2.getClass();
                    if (((u09) bm3VarK2).o0()) {
                        hb1VarI2 = tx3Var.I((Method) declaredConstructor, tx3Var.h().c());
                    } else {
                        Method method2 = (Method) declaredConstructor;
                        hb1VarI2 = ynb.Q(tx3Var) ? new eb1(method2, false, 4) : new gb1(method2, true, 4, 1);
                    }
                } else {
                    hb1VarI2 = tx3Var.I((Method) declaredConstructor, tx3Var.h().c());
                }
                if (hb1VarI2 != null) {
                    return w6c.h(hb1VarI2, tx3Var, arrayList3, true);
                }
                return null;
            default:
                Type typeF = feg.F(tx3Var);
                return typeF == null ? tx3Var.h().getReturnType() : typeF;
        }
    }
}
