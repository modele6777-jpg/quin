package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class os7 implements x16 {
    public final /* synthetic */ int a;
    public final ps7 b;

    public /* synthetic */ os7(ps7 ps7Var, int i) {
        this.a = i;
        this.b = ps7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        GenericDeclaration genericDeclarationF;
        hb1 hb1VarF;
        GenericDeclaration genericDeclarationZ;
        int i = this.a;
        boolean z = false;
        ps7 ps7Var = this.b;
        switch (i) {
            case 0:
                ps7 ps7Var2 = this.b;
                return lmg.W(ps7Var2, ps7Var2.G(), ps7Var2.H(), ps7Var2.K(), ps7Var2.J(), true);
            case 1:
                ps7 ps7Var3 = this.b;
                return ynb.Q(ps7Var3) ? lmg.W(ps7Var3, ps7Var3.G(), ps7Var3.H(), ps7Var3.K(), ps7Var3.J(), false) : ps7Var3.a();
            case 2:
                boolean zR = ynb.R(ps7Var);
                xm7 xm7Var = ps7Var.c;
                if (!zR && !(xm7Var instanceof nn7)) {
                    StringBuilder sb = new StringBuilder("Only constructors and top-level functions are supported for now: ");
                    sb.append(xm7Var);
                    ho7.s(sb, ps7Var.getName(), ps7Var.d);
                    return null;
                }
                vk7 vk7VarI = ps7Var.I();
                String str = vk7VarI.F0;
                if (ynb.R(ps7Var) && (!(xm7Var instanceof nm7) || !((nm7) xm7Var).q())) {
                    if (ynb.P(ps7Var)) {
                        Class clsD = xm7Var.d();
                        List parameters = ps7Var.getParameters();
                        ArrayList arrayList = new ArrayList(t72.u(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((aob) it.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        return new r00(clsD, arrayList, p00.b);
                    }
                    xm7Var.getClass();
                    str.getClass();
                    Class clsD2 = xm7Var.d();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) sqf.m(smb.d(xm7Var.d()), str, false).b).toArray(new Class[0]);
                        genericDeclarationF = clsD2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                        genericDeclarationF = null;
                    }
                    break;
                } else {
                    genericDeclarationF = xm7Var.F(vk7VarI.E0, str);
                }
                if (genericDeclarationF instanceof Constructor) {
                    hb1VarF = ps7Var.y((Constructor) genericDeclarationF, false);
                } else {
                    if (!(genericDeclarationF instanceof Method)) {
                        ho7.m(ps7Var, "Could not compute caller for function: ");
                        return null;
                    }
                    hb1VarF = ps7Var.F((Method) genericDeclarationF, false);
                }
                return w6c.h(hb1VarF, ps7Var, pu4.a, false);
            default:
                boolean zR2 = ynb.R(ps7Var);
                xm7 xm7Var2 = ps7Var.c;
                if (!zR2 && !(xm7Var2 instanceof nn7)) {
                    StringBuilder sb2 = new StringBuilder("Only constructors and top-level functions are supported for now: ");
                    sb2.append(xm7Var2);
                    ho7.s(sb2, ps7Var.getName(), ps7Var.d);
                    return null;
                }
                vk7 vk7VarI2 = ps7Var.I();
                ArrayList arrayList2 = new ArrayList();
                if (ynb.R(ps7Var) && (!(xm7Var2 instanceof nm7) || !((nm7) xm7Var2).q())) {
                    if (ynb.P(ps7Var)) {
                        Class clsD3 = xm7Var2.d();
                        List parameters2 = ps7Var.getParameters();
                        ArrayList arrayList3 = new ArrayList(t72.u(parameters2, 10));
                        Iterator it2 = parameters2.iterator();
                        while (it2.hasNext()) {
                            String name2 = ((aob) it2.next()).getName();
                            name2.getClass();
                            arrayList3.add(name2);
                        }
                        return new r00(clsD3, arrayList3, p00.a);
                    }
                    fz3 fz3VarN = feg.N(ps7Var, ps7Var.I().F0);
                    arrayList2.addAll((Set) fz3VarN.c);
                    String str2 = (String) fz3VarN.b;
                    xm7Var2.getClass();
                    str2.getClass();
                    Class clsD4 = xm7Var2.d();
                    ArrayList arrayList4 = new ArrayList();
                    xm7.w(arrayList4, (ArrayList) sqf.m(smb.d(xm7Var2.d()), str2, false).b, true, false);
                    try {
                        Class[] clsArr2 = (Class[]) arrayList4.toArray(new Class[0]);
                        genericDeclarationZ = clsD4.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                    } catch (NoSuchMethodException unused2) {
                        genericDeclarationZ = null;
                    }
                    break;
                } else {
                    fz3 fz3VarN2 = feg.N(ps7Var, vk7VarI2.F0);
                    arrayList2.addAll((Set) fz3VarN2.c);
                    String str3 = vk7VarI2.E0;
                    String str4 = (String) fz3VarN2.b;
                    Member memberB = ps7Var.h().b();
                    memberB.getClass();
                    boolean z2 = !Modifier.isStatic(memberB.getModifiers());
                    List listA = ps7Var.a();
                    if (listA == null || !listA.isEmpty()) {
                        Iterator it3 = listA.iterator();
                        while (it3.hasNext()) {
                            if (((aob) it3.next()).t() == on7.c) {
                                z = true;
                            }
                        }
                    }
                    genericDeclarationZ = xm7Var2.z(str3, str4, z2, z);
                }
                hb1 hb1VarY = genericDeclarationZ instanceof Constructor ? ps7Var.y((Constructor) genericDeclarationZ, true) : genericDeclarationZ instanceof Method ? ps7Var.F((Method) genericDeclarationZ, ps7Var.h().c()) : null;
                if (hb1VarY != null) {
                    return w6c.h(hb1VarY, ps7Var, arrayList2, true);
                }
                return null;
        }
    }
}
