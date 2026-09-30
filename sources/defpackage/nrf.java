package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nrf implements sa1 {
    public final sa1 a;
    public final boolean b;
    public final psd c;

    /* JADX WARN: Code duplicated, block: B:100:0x0183  */
    /* JADX WARN: Code duplicated, block: B:102:0x0195  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c0 A[LOOP:2: B:111:0x01ba->B:113:0x01c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:127:0x0200  */
    /* JADX WARN: Code duplicated, block: B:131:0x020a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:? A[LOOP:3: B:83:0x0139->B:147:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:? A[LOOP:4: B:39:0x009b->B:150:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088 A[EDGE_INSN: B:32:0x0088->B:52:0x00c3 BREAK  A[LOOP:4: B:39:0x009b->B:150:?]] */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    /* JADX WARN: Code duplicated, block: B:73:0x0112  */
    /* JADX WARN: Code duplicated, block: B:82:0x0135  */
    /* JADX WARN: Code duplicated, block: B:85:0x013f  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0161  */
    /* JADX WARN: Code duplicated, block: B:97:0x016f  */
    public nrf(sa1 sa1Var, wnb wnbVar, List list, boolean z) {
        Class clsW;
        Method declaredMethod;
        boolean z2;
        on7 on7Var;
        int i;
        List parameters;
        Iterator it;
        xm7 xm7VarS;
        nm7 nm7Var;
        ArrayList arrayList;
        vm7 vm7VarS;
        boolean z3;
        List listA;
        Iterator it2;
        int size;
        int i2;
        int i3;
        int size2;
        boolean z4;
        z67 z67VarC0;
        Method[] methodArr;
        int i4;
        Iterator it3;
        psd psdVar;
        Member memberB;
        Class<?> declaringClass;
        boolean z5;
        Method methodJ;
        Class clsW2;
        em7 em7Var;
        em7 em7Var2;
        yn7 yn7VarS;
        this.a = sa1Var;
        this.b = z;
        yn7 returnType = wnbVar.getReturnType();
        boolean z6 = wnbVar instanceof znb;
        if ((z6 && ((znb) wnbVar).isSuspend() && (yn7VarS = sqf.s(returnType)) != null && w6c.n(yn7VarS)) || (clsW = w6c.w(returnType)) == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = clsW.getDeclaredMethod("box-impl", w6c.j(clsW, wnbVar).getReturnType());
                declaredMethod.getClass();
            } catch (NoSuchMethodException unused) {
                r82.h("No box method found in inline class: ", clsW, " (calling ", wnbVar);
                throw null;
            }
        }
        if (wnbVar instanceof qn7) {
            wn7 wn7VarF = ((qn7) wnbVar).f();
            wn7VarF.getClass();
            if (w6c.p((bob) wn7VarF)) {
                psdVar = new psd(z67.d, new Method[0], declaredMethod);
            } else {
                z2 = sa1Var instanceof fb1;
                on7Var = on7.a;
                i = -1;
                if (z2 || ((fb1) sa1Var).f) {
                    if (!ynb.R(wnbVar)) {
                        parameters = wnbVar.getParameters();
                        if (parameters != null || !parameters.isEmpty()) {
                            it = parameters.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((aob) it.next()).t() == on7Var) {
                                        xm7VarS = wnbVar.s();
                                        if (xm7VarS instanceof nm7) {
                                            nm7Var = (nm7) xm7VarS;
                                        } else {
                                            nm7Var = null;
                                        }
                                        if (nm7Var != null || !nm7Var.q()) {
                                            i = 1;
                                            break;
                                        }
                                    }
                                }
                                i = 0;
                                break;
                            }
                        }
                        i = 0;
                        break;
                    }
                    if (!(sa1Var instanceof d21)) {
                        i = 0;
                        break;
                    }
                }
                this.a.b();
                arrayList = new ArrayList();
                vm7VarS = wnbVar.s();
                if (!ynb.R(wnbVar) && (vm7VarS instanceof em7)) {
                    em7Var2 = (em7) vm7VarS;
                    if (em7Var2.q()) {
                        arrayList.add(tm7.u(em7Var2));
                    }
                }
                if (ynb.R(wnbVar)) {
                    if (vm7VarS instanceof em7) {
                        em7Var = (em7) vm7VarS;
                    } else {
                        em7Var = null;
                    }
                    if (em7Var == null && em7Var.j()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                for (aob aobVar : wnbVar.a()) {
                    if (aobVar.t() == on7Var || z3) {
                        arrayList.add(aobVar.u());
                    }
                }
                listA = wnbVar.a();
                if (listA == null && listA.isEmpty()) {
                    size = arrayList.size();
                    break;
                }
                it2 = listA.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((aob) it2.next()).t() == on7.c) {
                            size = arrayList.size() - 1;
                            break;
                        }
                    } else {
                        size = arrayList.size();
                        break;
                    }
                }
                if (this.b) {
                    i2 = ((size + 31) / 32) + 1;
                } else {
                    i2 = 0;
                }
                if (z6 || !((znb) wnbVar).isSuspend()) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                size2 = arrayList.size() + i + i2 + i3;
                z4 = this.b;
                if (a().size() == size2) {
                    StringBuilder sb = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                    sb.append(this.a.a().size());
                    sb.append(" != ");
                    sb.append(size2);
                    sb.append("\nCalling: ");
                    sb.append(wnbVar);
                    List listA2 = this.a.a();
                    sb.append("\nParameter types: ");
                    sb.append(listA2);
                    sb.append(")\nDefault: ");
                    sb.append(z4);
                    throw new pt7(sb.toString());
                }
                z67VarC0 = mh3.c0(Math.max(i, 0), arrayList.size() + i);
                methodArr = new Method[size2];
                for (i4 = 0; i4 < size2; i4++) {
                    int i5 = z67VarC0.a;
                    if (i4 <= z67VarC0.b || i5 > i4 || (clsW2 = w6c.w((yn7) arrayList.get(i4 - i))) == null) {
                        methodJ = null;
                    } else {
                        methodJ = w6c.j(clsW2, wnbVar);
                    }
                    methodArr[i4] = methodJ;
                }
                it3 = list.iterator();
                while (it3.hasNext()) {
                    methodArr[((Number) it3.next()).intValue()] = null;
                }
                vm7 vm7VarS2 = wnbVar.s();
                if (!ynb.R(wnbVar) && (vm7VarS2 instanceof em7) && ((em7) vm7VarS2).q() && (memberB = this.a.b()) != null) {
                    declaringClass = memberB.getDeclaringClass();
                    if (declaringClass == null) {
                        z5 = false;
                    } else {
                        z5 = !job.a.b(declaringClass).q();
                    }
                    if (z5) {
                        methodArr[0] = null;
                    }
                }
                psdVar = new psd(z67VarC0, methodArr, declaredMethod);
            }
        } else {
            z2 = sa1Var instanceof fb1;
            on7Var = on7.a;
            i = -1;
            if (z2) {
                if (!ynb.R(wnbVar)) {
                    parameters = wnbVar.getParameters();
                    if (parameters != null) {
                        it = parameters.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((aob) it.next()).t() == on7Var) {
                                    xm7VarS = wnbVar.s();
                                    if (xm7VarS instanceof nm7) {
                                        nm7Var = (nm7) xm7VarS;
                                    } else {
                                        nm7Var = null;
                                    }
                                    if (nm7Var != null) {
                                    }
                                    i = 1;
                                    break;
                                }
                            }
                            i = 0;
                            break;
                        }
                    }
                    it = parameters.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((aob) it.next()).t() == on7Var) {
                                xm7VarS = wnbVar.s();
                                if (xm7VarS instanceof nm7) {
                                    nm7Var = (nm7) xm7VarS;
                                } else {
                                    nm7Var = null;
                                }
                                if (nm7Var != null) {
                                }
                                i = 1;
                                break;
                            }
                        }
                        i = 0;
                        break;
                    }
                }
                if (!(sa1Var instanceof d21)) {
                    i = 0;
                    break;
                }
            } else {
                if (!ynb.R(wnbVar)) {
                    parameters = wnbVar.getParameters();
                    if (parameters != null) {
                        it = parameters.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((aob) it.next()).t() == on7Var) {
                                    xm7VarS = wnbVar.s();
                                    if (xm7VarS instanceof nm7) {
                                        nm7Var = (nm7) xm7VarS;
                                    } else {
                                        nm7Var = null;
                                    }
                                    if (nm7Var != null) {
                                    }
                                    i = 1;
                                    break;
                                }
                            }
                            i = 0;
                            break;
                        }
                    }
                    it = parameters.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((aob) it.next()).t() == on7Var) {
                                xm7VarS = wnbVar.s();
                                if (xm7VarS instanceof nm7) {
                                    nm7Var = (nm7) xm7VarS;
                                } else {
                                    nm7Var = null;
                                }
                                if (nm7Var != null) {
                                }
                                i = 1;
                                break;
                            }
                        }
                        i = 0;
                        break;
                    }
                }
                if (!(sa1Var instanceof d21)) {
                    i = 0;
                    break;
                }
            }
            this.a.b();
            arrayList = new ArrayList();
            vm7VarS = wnbVar.s();
            if (!ynb.R(wnbVar)) {
                em7Var2 = (em7) vm7VarS;
                if (em7Var2.q()) {
                    arrayList.add(tm7.u(em7Var2));
                }
            }
            if (ynb.R(wnbVar)) {
                z3 = false;
            } else {
                if (vm7VarS instanceof em7) {
                    em7Var = (em7) vm7VarS;
                } else {
                    em7Var = null;
                }
                if (em7Var == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
            }
            while (r7.hasNext()) {
                if (aobVar.t() == on7Var) {
                }
                arrayList.add(aobVar.u());
            }
            listA = wnbVar.a();
            if (listA == null) {
                it2 = listA.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((aob) it2.next()).t() == on7.c) {
                            size = arrayList.size() - 1;
                            break;
                        }
                    } else {
                        size = arrayList.size();
                        break;
                    }
                }
            } else {
                it2 = listA.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((aob) it2.next()).t() == on7.c) {
                            size = arrayList.size() - 1;
                            break;
                        }
                    } else {
                        size = arrayList.size();
                        break;
                    }
                }
            }
            if (this.b) {
                i2 = ((size + 31) / 32) + 1;
            } else {
                i2 = 0;
            }
            if (z6) {
                i3 = 0;
            } else {
                i3 = 0;
            }
            size2 = arrayList.size() + i + i2 + i3;
            z4 = this.b;
            if (a().size() == size2) {
                StringBuilder sb2 = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                sb2.append(this.a.a().size());
                sb2.append(" != ");
                sb2.append(size2);
                sb2.append("\nCalling: ");
                sb2.append(wnbVar);
                List listA3 = this.a.a();
                sb2.append("\nParameter types: ");
                sb2.append(listA3);
                sb2.append(")\nDefault: ");
                sb2.append(z4);
                throw new pt7(sb2.toString());
            }
            z67VarC0 = mh3.c0(Math.max(i, 0), arrayList.size() + i);
            methodArr = new Method[size2];
            while (i4 < size2) {
                int i6 = z67VarC0.a;
                if (i4 <= z67VarC0.b) {
                    methodJ = null;
                } else {
                    methodJ = null;
                }
                methodArr[i4] = methodJ;
            }
            it3 = list.iterator();
            while (it3.hasNext()) {
                methodArr[((Number) it3.next()).intValue()] = null;
            }
            vm7 vm7VarS3 = wnbVar.s();
            if (!ynb.R(wnbVar)) {
                declaringClass = memberB.getDeclaringClass();
                if (declaringClass == null) {
                    z5 = false;
                } else {
                    z5 = !job.a.b(declaringClass).q();
                }
                if (z5) {
                    methodArr[0] = null;
                }
            }
            psdVar = new psd(z67VarC0, methodArr, declaredMethod);
        }
        this.c = psdVar;
    }

    @Override // defpackage.sa1
    public final List a() {
        return this.a.a();
    }

    @Override // defpackage.sa1
    public final Member b() {
        return this.a.b();
    }

    @Override // defpackage.sa1
    public final boolean c() {
        return this.a instanceof db1;
    }

    @Override // defpackage.sa1
    public final Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Method method;
        objArr.getClass();
        psd psdVar = this.c;
        z67 z67Var = (z67) psdVar.b;
        Method[] methodArr = (Method[]) psdVar.c;
        Method method2 = (Method) psdVar.d;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object objF = objArr[i];
            int i2 = z67Var.a;
            if (i <= z67Var.b && i2 <= i && (method = methodArr[i]) != null) {
                if (objF != null) {
                    objF = method.invoke(objF, null);
                } else {
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    objF = sqf.f(returnType);
                }
            }
            objArr2[i] = objF;
        }
        Object objCall = this.a.call(objArr2);
        return (objCall == bw2.a || method2 == null || (objInvoke = method2.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // defpackage.sa1
    public final Type getReturnType() {
        return this.a.getReturnType();
    }
}
