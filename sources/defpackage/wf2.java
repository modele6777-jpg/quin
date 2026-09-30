package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wf2 {
    public static final dq9 a = new dq9("provider");
    public static final dq9 b = new dq9("provider");
    public static final dq9 c = new dq9("compositionLocalMap");
    public static final dq9 d = new dq9("providers");
    public static final dq9 e = new dq9("reference");

    public static final void a(String str) {
        throw new bf2(ib8.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new bf2(ib8.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [pu4] */
    public static final f49 c(rg2 rg2Var, g49 g49Var, opd opdVar, ac0 ac0Var) {
        i8c i8cVar;
        lpd lpdVar;
        ?? arrayList;
        f46 f46Var;
        long[] jArr;
        f46 f46Var2;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean zC;
        long[] jArr2;
        int i4;
        long j;
        long[] jArr3;
        int i5;
        int i6;
        g49 g49Var2 = g49Var;
        i8c i8cVar2 = sf2.a;
        lpd lpdVar2 = new lpd();
        if (opdVar.e != null) {
            lpdVar2.d();
        }
        if (opdVar.f != null) {
            lpdVar2.y = new q69();
        }
        int i7 = opdVar.t;
        if (ac0Var != null && opdVar.E(i7) > 0) {
            int iF = opdVar.v;
            while (iF > 0 && !opdVar.x(iF)) {
                iF = opdVar.F(opdVar.b, iF);
            }
            if (iF >= 0 && opdVar.x(iF)) {
                Object objD = opdVar.D(iF);
                int i8 = iF + 1;
                int iT = opdVar.t(iF) + iF;
                int iE = 0;
                while (i8 < iT) {
                    int iT2 = opdVar.t(i8) + i8;
                    if (iT2 > i7) {
                        break;
                    }
                    iE += opdVar.x(i8) ? 1 : opdVar.E(i8);
                    i8 = iT2;
                }
                int iE2 = opdVar.x(i7) ? 1 : opdVar.E(i7);
                ac0Var.d(objD);
                ac0Var.g(iE, iE2);
                ac0Var.l();
            }
        }
        f46 f46Var3 = g49Var2.e;
        if (f46Var3.a()) {
            rg2Var.getClass();
            if (rg2Var.Y.e > 0) {
                arrayList = new ArrayList();
                w79 w79Var = rg2Var.Y;
                long[] jArr4 = w79Var.a;
                int length = jArr4.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j2 = jArr4[i9];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8;
                            int i11 = 8 - ((~(i9 - length)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j2 & 255) < 128) {
                                    int i13 = i10;
                                    int i14 = (i9 << 3) + i12;
                                    f46Var2 = f46Var3;
                                    Object obj = w79Var.b[i14];
                                    Object obj2 = w79Var.c[i14];
                                    obj.getClass();
                                    if (obj2 instanceof x79) {
                                        x79 x79Var = (x79) obj2;
                                        Object[] objArr = x79Var.b;
                                        long[] jArr5 = x79Var.a;
                                        int length2 = jArr5.length - 2;
                                        if (length2 >= 0) {
                                            int i15 = 0;
                                            while (true) {
                                                long j3 = jArr5[i15];
                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                    int i17 = 0;
                                                    while (i17 < i16) {
                                                        if ((j3 & 255) < 128) {
                                                            i4 = i17;
                                                            int i18 = (i15 << 3) + i4;
                                                            j = j3;
                                                            Object obj3 = objArr[i18];
                                                            ojb ojbVar = (ojb) obj;
                                                            jArr3 = jArr5;
                                                            f46 f46Var4 = ojbVar.c;
                                                            if (f46Var4 != null) {
                                                                f46 f46VarL = nk8.l(f46Var2);
                                                                i6 = i12;
                                                                f46 f46VarL2 = nk8.l(f46Var4);
                                                                int iC = opdVar.c(f46VarL);
                                                                i5 = length;
                                                                int i19 = opdVar.b[(iC * 5) + 3] + iC;
                                                                int i20 = f46VarL2.a;
                                                                if (iC <= i20 && i20 < i19) {
                                                                    arrayList.add(new iy9(ojbVar, obj3));
                                                                    x79Var.n(i18);
                                                                }
                                                            }
                                                            j3 = j >> i13;
                                                            i17 = i4 + 1;
                                                            jArr5 = jArr3;
                                                            length = i5;
                                                            i12 = i6;
                                                        } else {
                                                            i4 = i17;
                                                            j = j3;
                                                            jArr3 = jArr5;
                                                        }
                                                        i5 = length;
                                                        i6 = i12;
                                                        j3 = j >> i13;
                                                        i17 = i4 + 1;
                                                        jArr5 = jArr3;
                                                        length = i5;
                                                        i12 = i6;
                                                    }
                                                    jArr2 = jArr5;
                                                    i = length;
                                                    i2 = i12;
                                                    if (i16 != i13) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr2 = jArr5;
                                                    i = length;
                                                    i2 = i12;
                                                }
                                                if (i15 == length2) {
                                                    break;
                                                }
                                                i15++;
                                                jArr5 = jArr2;
                                                length = i;
                                                i12 = i2;
                                                i13 = 8;
                                            }
                                        } else {
                                            i = length;
                                            i2 = i12;
                                        }
                                        zC = x79Var.c();
                                    } else {
                                        i = length;
                                        i2 = i12;
                                        obj2.getClass();
                                        ojb ojbVar2 = (ojb) obj;
                                        f46 f46Var5 = ojbVar2.c;
                                        if (f46Var5 != null) {
                                            f46 f46VarL3 = nk8.l(f46Var2);
                                            f46 f46VarL4 = nk8.l(f46Var5);
                                            int iC2 = opdVar.c(f46VarL3);
                                            int i21 = opdVar.b[(iC2 * 5) + 3] + iC2;
                                            int i22 = f46VarL4.a;
                                            if (iC2 > i22 || i22 >= i21) {
                                                z = false;
                                            } else {
                                                arrayList.add(new iy9(ojbVar2, obj2));
                                                z = true;
                                            }
                                        } else {
                                            z = false;
                                        }
                                        zC = z;
                                    }
                                    if (zC) {
                                        w79Var.l(i14);
                                    }
                                    i3 = 8;
                                } else {
                                    f46Var2 = f46Var3;
                                    i8cVar2 = i8cVar2;
                                    lpdVar2 = lpdVar2;
                                    i = length;
                                    j2 = j2;
                                    i2 = i12;
                                    i3 = i10;
                                }
                                j2 >>= i3;
                                i12 = i2 + 1;
                                i10 = i3;
                                f46Var3 = f46Var2;
                                jArr4 = jArr4;
                                i8cVar2 = i8cVar2;
                                lpdVar2 = lpdVar2;
                                length = i;
                            }
                            f46Var = f46Var3;
                            i8cVar = i8cVar2;
                            lpdVar = lpdVar2;
                            jArr = jArr4;
                            int i23 = length;
                            if (i11 != i10) {
                                break;
                            }
                            length = i23;
                        } else {
                            f46Var = f46Var3;
                            i8cVar = i8cVar2;
                            lpdVar = lpdVar2;
                            jArr = jArr4;
                        }
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                        f46Var3 = f46Var;
                        jArr4 = jArr;
                        i8cVar2 = i8cVar;
                        lpdVar2 = lpdVar;
                    }
                } else {
                    i8cVar = i8cVar2;
                    lpdVar = lpdVar2;
                }
            } else {
                i8cVar = i8cVar2;
                lpdVar = lpdVar2;
                arrayList = pu4.a;
            }
            g49Var2 = g49Var;
            g49Var2.f = s72.Q0(g49Var2.f, arrayList);
        } else {
            i8cVar = i8cVar2;
            lpdVar = lpdVar2;
        }
        opd opdVarI = lpdVar.i();
        try {
            opdVarI.d();
            i8c i8cVar3 = i8cVar;
            opdVarI.R(g49Var2.a, i8cVar3, false, 126665345);
            opd.y(opdVarI);
            opdVarI.T(g49Var2.b);
            List listC = opdVar.C(nk8.l(g49Var2.e), opdVarI);
            opdVarI.M();
            opdVarI.i();
            opdVarI.j();
            opdVarI.e(true);
            lpd lpdVar3 = lpdVar;
            f49 f49Var = new f49(lpdVar3);
            if (!listC.isEmpty()) {
                int size = listC.size();
                for (int i24 = 0; i24 < size; i24++) {
                    f46 f46Var6 = (f46) listC.get(i24);
                    if (lpdVar3.j(f46Var6)) {
                        int iC3 = lpdVar3.c(f46Var6);
                        int iD = npd.d(lpdVar3.a, iC3);
                        int i25 = iC3 + 1;
                        if (((i25 < lpdVar3.b ? lpdVar3.a[(i25 * 5) + 4] : lpdVar3.c.length) - iD > 0 ? lpdVar3.c[iD] : i8cVar3) instanceof ojb) {
                            k47 k47Var = new k47(20, rg2Var, g49Var2);
                            opd opdVarI2 = lpdVar3.i();
                            try {
                                ym8.l(opdVarI2, listC, k47Var);
                                boolean z2 = true;
                                return f49Var;
                            } finally {
                                opdVarI2.e(false);
                            }
                        }
                    }
                }
            }
            return f49Var;
        } catch (Throwable th) {
            opdVarI.e(false);
            throw th;
        }
    }
}
