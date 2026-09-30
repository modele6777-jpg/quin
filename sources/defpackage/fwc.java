package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fwc implements vpb {
    public tvc G0;
    public boolean H0;
    public aw2 I0;
    public rfa J0;
    public final y69 K0;
    public final lw7 L0;
    public boolean M0;
    public final owc a;
    public eh6 e;
    public a26 f;
    public hl9 y;
    public bv7 z;
    public final vz9 b = q1c.f(null);
    public final vz9 c = q1c.f(Boolean.TRUE);
    public a26 d = new cvc(this, 7);
    public final tze g = new tze();
    public final fo5 v = new fo5();
    public final vz9 w = q1c.f(Boolean.FALSE);
    public final mx3 x = zrd.b(new yuc(this, 5));
    public final vz9 X = new vz9(wef.a, qk6.L0);
    public final vz9 Y = q1c.f(null);
    public final vz9 Z = q1c.f(null);
    public final vz9 E0 = q1c.f(null);
    public final vz9 F0 = q1c.f(null);

    public fwc(owc owcVar) {
        this.a = owcVar;
        y69 y69Var = of8.a;
        this.K0 = new y69();
        this.L0 = eb3.N(z18.c, new yuc(this, 6));
        owcVar.e = new cvc(this, 8);
        owcVar.f = new wt(12, this);
        owcVar.g = new yvc(this);
        owcVar.h = new yuc(this, 3);
        owcVar.i = new cvc(this, 1);
        owcVar.j = new cvc(this, 2);
    }

    public static uuc f(int i, ArrayList arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            x59 x59Var = (x59) arrayList.get(i3);
            int length = x59Var.e().b.length();
            if (i >= i2 && i <= i2 + length) {
                int i4 = i - i2;
                ste steVar = (ste) x59Var.c.invoke();
                if (steVar != null) {
                    return new uuc(gcc.q(steVar, i4), i4, x59Var.a);
                }
                return null;
            }
            i2 += length;
        }
        return null;
    }

    @Override // defpackage.vpb
    public final void a() {
        r();
    }

    public final long b(bv7 bv7Var, long j) {
        bv7 bv7Var2 = this.z;
        if (bv7Var2 == null || !bv7Var2.h()) {
            return 9205357640488583168L;
        }
        return n().K(bv7Var, j);
    }

    @Override // defpackage.vpb
    public final void c() {
        r();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0011  */
    public final void e() {
        k00 k00VarL;
        a26 a26Var;
        int iNextIndex;
        if (j() != null) {
            owc owcVar = this.a;
            if (owcVar.a().e == 0) {
                k00VarL = null;
            } else {
                i00 i00Var = new i00();
                ArrayList arrayListE = owcVar.e(n());
                ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    vuc vucVar = (vuc) owcVar.a().e(((x59) listIterator.previous()).a);
                    if (vucVar != null && vucVar.a.b != vucVar.b.b) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                if (iNextIndex != -1) {
                    int size = arrayListE.size();
                    int i = 0;
                    while (i < size) {
                        x59 x59Var = (x59) arrayListE.get(i);
                        vuc vucVar2 = (vuc) owcVar.a().e(x59Var.a);
                        if (vucVar2 != null) {
                            k00 k00VarE = x59Var.e();
                            long jB = u3c.b(vucVar2.a.b, vucVar2.b.b);
                            boolean z = i >= iNextIndex;
                            i00Var.c(eue.g(jB), eue.f(jB), k00VarE);
                            if (!z) {
                                i00Var.a.append('\n');
                            }
                        }
                        i++;
                    }
                }
                k00VarL = i00Var.l();
            }
        } else {
            k00VarL = null;
        }
        if (k00VarL != null) {
            k00 k00Var = k00VarL.b.length() > 0 ? k00VarL : null;
            if (k00Var == null || (a26Var = this.f) == null) {
                return;
            }
            a26Var.d(k00Var);
        }
    }

    public final x59 g(uuc uucVar) {
        return (x59) this.a.c.e(uucVar.c);
    }

    public final iy9 h() {
        int iNextIndex;
        int iG;
        int length;
        if (j() == null) {
            return null;
        }
        owc owcVar = this.a;
        if (owcVar.b.isEmpty()) {
            return null;
        }
        i00 i00Var = new i00();
        ArrayList arrayListE = owcVar.e(n());
        ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            vuc vucVar = (vuc) owcVar.a().e(((x59) listIterator.previous()).a);
            if (vucVar != null && vucVar.a.b != vucVar.b.b) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = arrayListE.size();
            iG = -1;
            length = -1;
            int i = 0;
            while (i < size) {
                x59 x59Var = (x59) arrayListE.get(i);
                vuc vucVar2 = (vuc) owcVar.a().e(x59Var.a);
                if (vucVar2 != null) {
                    k00 k00VarE = x59Var.e();
                    long jB = u3c.b(vucVar2.a.b, vucVar2.b.b);
                    boolean z = i >= iNextIndex;
                    if (iG == -1) {
                        iG = eue.g(jB);
                        i00Var.c(0, eue.g(jB), k00VarE);
                    }
                    i00Var.c(eue.g(jB), eue.f(jB), k00VarE);
                    StringBuilder sb = i00Var.a;
                    if (z) {
                        length = sb.length();
                        i00Var.c(eue.f(jB), k00VarE.b.length(), k00VarE);
                    } else {
                        sb.append('\n');
                    }
                }
                i++;
            }
        } else {
            iG = -1;
            length = -1;
        }
        k00 k00VarL = i00Var.l();
        if (iG == -1 || length == -1) {
            return null;
        }
        return new iy9(k00VarL, new eue(u3c.b(iG, length)));
    }

    public final sg6 i() {
        return (sg6) this.E0.getValue();
    }

    public final vuc j() {
        return (vuc) this.b.getValue();
    }

    public final boolean k() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean l() {
        vuc vucVarJ = j();
        if (vucVarJ != null) {
            uuc uucVar = vucVarJ.b;
            uuc uucVar2 = vucVarJ.a;
            if (!pa7.t(uucVar2, uucVar)) {
                if (uucVar2.c == uucVar.c) {
                    return true;
                }
                bv7 bv7VarN = n();
                owc owcVar = this.a;
                ArrayList arrayListE = owcVar.e(bv7VarN);
                int size = arrayListE.size();
                for (int i = 0; i < size; i++) {
                    vuc vucVar = (vuc) owcVar.a().e(((x59) arrayListE.get(i)).a);
                    if (vucVar != null && vucVar.a.b != vucVar.b.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void m() {
        eh6 eh6Var;
        y69 y69Var = of8.a;
        y69Var.getClass();
        this.a.k.setValue(y69Var);
        q(false);
        this.G0 = null;
        if (j() != null) {
            this.d.d(null);
            if (!k() || (eh6Var = this.e) == null) {
                return;
            }
            ((afa) eh6Var).a(9);
        }
    }

    public final bv7 n() {
        bv7 bv7Var = this.z;
        if (bv7Var == null) {
            throw ub3.e("null coordinates");
        }
        if (!bv7Var.h()) {
            l37.a("unattached coordinates");
        }
        return bv7Var;
    }

    public final void o(boolean z) {
        vz9 vz9Var = this.c;
        if (((Boolean) vz9Var.getValue()).booleanValue() != z) {
            vz9Var.setValue(Boolean.valueOf(z));
            u();
        }
    }

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
    public final void p(vuc vucVar) {
        long j;
        char c;
        long j2;
        long j3;
        x59 x59Var;
        a08 a08Var;
        long j4;
        char c2;
        long j5;
        vz9 vz9Var = this.b;
        if (pa7.t(vz9Var.getValue(), vucVar)) {
            return;
        }
        vz9Var.setValue(vucVar);
        if (vucVar != null) {
            s();
        }
        y69 y69Var = this.K0;
        long[] jArr = y69Var.a;
        int length = jArr.length - 2;
        long j6 = 255;
        char c3 = 7;
        owc owcVar = this.a;
        long j7 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j8 = jArr[i];
                j3 = 128;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j8 & j6) < 128) {
                            j4 = j6;
                            int i4 = (i << 3) + i3;
                            c2 = c3;
                            j5 = j7;
                            long j9 = y69Var.b[i4];
                            a08 a08Var2 = (a08) y69Var.c[i4];
                            boolean zB = owcVar.a().b(j9);
                            if (!zB) {
                                a08Var2.b();
                            }
                            if (!zB) {
                                y69Var.h(i4);
                            }
                        } else {
                            j4 = j6;
                            c2 = c3;
                            j5 = j7;
                        }
                        j8 >>= 8;
                        i3++;
                        c3 = c2;
                        j6 = j4;
                        j7 = j5;
                    }
                    j = j6;
                    c = c3;
                    j2 = j7;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    j = j6;
                    c = c3;
                    j2 = j7;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
                j6 = j;
                j7 = j2;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        y69 y69VarA = owcVar.a();
        long[] jArr2 = y69VarA.b;
        Object[] objArr = y69VarA.c;
        long[] jArr3 = y69VarA.a;
        int length2 = jArr3.length - 2;
        if (length2 < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j10 = jArr3[i5];
            if ((((~j10) << c) & j10 & j2) != j2) {
                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((j10 & j) < j3) {
                        int i8 = (i5 << 3) + i7;
                        long j11 = jArr2[i8];
                        vuc vucVar2 = (vuc) objArr[i8];
                        if (vucVar2.a.b != vucVar2.b.b && (x59Var = (x59) owcVar.c.e(j11)) != null && (a08Var = (a08) x59Var.d.invoke()) != null && !y69Var.b(j11)) {
                            a08Var.a();
                            y69Var.i(j11, a08Var);
                        }
                    }
                    j10 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length2) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final void q(boolean z) {
        this.M0 = z;
        u();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    public final void r() {
        y69 y69Var = this.K0;
        Object[] objArr = y69Var.c;
        long[] jArr = y69Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((a08) objArr[(i << 3) + i3]).b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        y69Var.a();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    public final void s() {
        long j;
        hl9 hl9Var;
        long jA;
        hl9 hl9Var2;
        uuc uucVar;
        uuc uucVar2;
        vuc vucVarJ = j();
        bv7 bv7Var = this.z;
        hl9 hl9Var3 = null;
        x59 x59VarG = (vucVarJ == null || (uucVar2 = vucVarJ.a) == null) ? null : g(uucVar2);
        x59 x59VarG2 = (vucVarJ == null || (uucVar = vucVarJ.b) == null) ? null : g(uucVar);
        bv7 bv7VarC = x59VarG != null ? x59VarG.c() : null;
        bv7 bv7VarC2 = x59VarG2 != null ? x59VarG2.c() : null;
        vz9 vz9Var = this.Z;
        vz9 vz9Var2 = this.Y;
        if (vucVarJ == null || bv7Var == null || !bv7Var.h() || (bv7VarC == null && bv7VarC2 == null)) {
            vz9Var2.setValue(null);
            vz9Var.setValue(null);
            return;
        }
        hkb hkbVarZ = dj6.Z(bv7Var);
        if (bv7VarC != null) {
            j = 9205357640488583168L;
            long jA2 = x59VarG.a(vucVarJ, true);
            if ((jA2 & 9223372034707292159L) != 9205357640488583168L) {
                long jK = bv7Var.K(bv7VarC, jA2);
                hl9Var = new hl9(jK);
                if (i() != sg6.b && !dj6.D(jK, hkbVarZ)) {
                }
            }
            vz9Var2.setValue(hl9Var);
            if (bv7VarC2 != null) {
                jA = x59VarG2.a(vucVarJ, false);
                if ((jA & 9223372034707292159L) != j) {
                    long jK2 = bv7Var.K(bv7VarC2, jA);
                    hl9Var2 = new hl9(jK2);
                    if (i() != sg6.c || dj6.D(jK2, hkbVarZ)) {
                        hl9Var3 = hl9Var2;
                    }
                }
            }
            vz9Var.setValue(hl9Var3);
        }
        j = 9205357640488583168L;
        hl9Var = null;
        vz9Var2.setValue(hl9Var);
        if (bv7VarC2 != null) {
            jA = x59VarG2.a(vucVarJ, false);
            if ((jA & 9223372034707292159L) != j) {
                long jK3 = bv7Var.K(bv7VarC2, jA);
                hl9Var2 = new hl9(jK3);
                if (i() != sg6.c) {
                    hl9Var3 = hl9Var2;
                } else {
                    hl9Var3 = hl9Var2;
                }
            }
        }
        vz9Var.setValue(hl9Var3);
    }

    public final boolean t(long j, long j2, boolean z, wuc wucVar) {
        w69 w69Var;
        ArrayList arrayList;
        tvc tvcVar;
        owc owcVar;
        bv7 bv7VarC;
        k31 k31Var;
        hl9 hl9Var;
        tvc mkdVar;
        ste steVar;
        int i;
        int i2;
        int i3;
        long j3;
        i94 i94VarN;
        i94 i94Var;
        i94 i94Var2;
        uvc uvcVar;
        i94 i94Var3;
        i94 i94Var4;
        i94 i94Var5;
        i94 i94Var6;
        owc owcVar2;
        int i4;
        int i5;
        uuc uucVar;
        uuc uucVar2;
        i94 i94VarL;
        this.E0.setValue(z ? sg6.b : sg6.c);
        hl9 hl9Var2 = new hl9(j);
        vz9 vz9Var = this.F0;
        vz9Var.setValue(hl9Var2);
        bv7 bv7VarN = n();
        owc owcVar3 = this.a;
        ArrayList arrayListE = owcVar3.e(bv7VarN);
        int i6 = mf8.a;
        int i7 = 6;
        w69 w69Var2 = new w69(6);
        int size = arrayListE.size();
        for (int i8 = 0; i8 < size; i8++) {
            w69Var2.e(i8, ((x59) arrayListE.get(i8)).a);
        }
        y85 y85Var = new y85(i7, w69Var2);
        long j4 = j2 & 9223372034707292159L;
        int i9 = 1;
        uvc uvcVar2 = new uvc(j, j2, bv7VarN, z, j4 == 9205357640488583168L ? null : j(), j4 == 9205357640488583168L ? null : this.G0, y85Var, !k());
        int size2 = arrayListE.size();
        int i10 = 0;
        while (true) {
            w69Var = uvcVar2.i;
            arrayList = uvcVar2.j;
            if (i10 >= size2) {
                break;
            }
            x59 x59Var = (x59) arrayListE.get(i10);
            bv7 bv7VarC2 = x59Var.c();
            if (bv7VarC2 == null || (steVar = (ste) x59Var.c.invoke()) == null) {
                owcVar2 = owcVar3;
                i2 = size2;
                i3 = i10;
                vz9Var = vz9Var;
                arrayListE = arrayListE;
                i = i9;
                uvcVar = uvcVar2;
            } else {
                i = i9;
                long jK = uvcVar2.c.K(bv7VarC2, 0L);
                long jF = hl9.f(uvcVar2.a, jK);
                tvc tvcVar2 = uvcVar2.f;
                i2 = size2;
                i3 = i10;
                guc gucVarD = tvcVar2 != null ? tvcVar2.d(x59Var.a) : null;
                boolean z2 = uvcVar2.d;
                int i11 = gucVarD != null ? z2 ? gucVarD.c : gucVarD.d : -1;
                long j5 = uvcVar2.b;
                long jF2 = (j5 & 9223372034707292159L) == 9205357640488583168L ? 9205357640488583168L : hl9.f(j5, jK);
                long j6 = x59Var.a;
                long j7 = steVar.c;
                float f = (int) (j7 >> 32);
                float f2 = (int) (j7 & 4294967295L);
                int i12 = (int) (jF >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i12);
                i94 i94Var7 = i94.c;
                i94 i94Var8 = i94.a;
                i94 i94Var9 = i94.b;
                i94 i94Var10 = fIntBitsToFloat < 0.0f ? i94Var8 : Float.intBitsToFloat(i12) > f ? i94Var7 : i94Var9;
                int i13 = (int) (jF & 4294967295L);
                if (Float.intBitsToFloat(i13) < 0.0f) {
                    i94Var7 = i94Var8;
                } else if (Float.intBitsToFloat(i13) <= f2) {
                    i94Var7 = i94Var9;
                }
                vuc vucVar = uvcVar2.e;
                if (z2) {
                    uvc uvcVar3 = uvcVar2;
                    j3 = j6;
                    i94VarN = lmg.N(i94Var10, i94Var7, uvcVar3, j3, vucVar != null ? vucVar.b : null);
                    i94Var4 = i94VarN;
                    i94Var = i94Var10;
                    i94Var3 = i94Var7;
                    i94Var2 = i94Var3;
                    uvcVar = uvcVar3;
                    i94Var6 = i94Var;
                    i94Var5 = i94Var4;
                } else {
                    uvc uvcVar4 = uvcVar2;
                    j3 = j6;
                    i94VarN = lmg.N(i94Var10, i94Var7, uvcVar4, j3, vucVar != null ? vucVar.a : null);
                    i94Var = i94Var10;
                    i94Var2 = i94Var7;
                    uvcVar = uvcVar4;
                    i94Var3 = i94VarN;
                    i94Var4 = i94Var;
                    i94Var5 = i94Var2;
                    i94Var6 = i94Var3;
                }
                owcVar2 = owcVar3;
                if (uvcVar.h || (i94VarL = hcc.l(i94Var, i94Var2)) == i94Var9 || i94VarL != i94VarN) {
                    int length = steVar.a.a.b.length();
                    y85 y85Var2 = uvcVar.g;
                    if (z2) {
                        int iI0 = lmg.i0(jF, steVar);
                        if (vucVar == null || (uucVar2 = vucVar.b) == null) {
                            length = iI0;
                        } else {
                            int iCompare = y85Var2.compare(Long.valueOf(uucVar2.c), Long.valueOf(j3));
                            if (iCompare < 0) {
                                length = 0;
                            } else if (iCompare <= 0) {
                                length = uucVar2.b;
                            }
                        }
                        i5 = length;
                        i4 = iI0;
                    } else {
                        int iI1 = lmg.i0(jF, steVar);
                        if (vucVar == null || (uucVar = vucVar.a) == null) {
                            length = iI1;
                        } else {
                            int iCompare2 = y85Var2.compare(Long.valueOf(uucVar.c), Long.valueOf(j3));
                            if (iCompare2 < 0) {
                                length = 0;
                            } else if (iCompare2 <= 0) {
                                length = uucVar.b;
                            }
                        }
                        i4 = length;
                        i5 = iI1;
                    }
                    int iI2 = i11 != -1 ? i11 : (jF2 & 9223372034707292159L) == 9205357640488583168L ? -1 : lmg.i0(jF2, steVar);
                    int i14 = uvcVar.m + 2;
                    uvcVar.m = i14;
                    long j8 = j3;
                    guc gucVar = new guc(j8, i14, i4, i5, iI2, steVar);
                    uvcVar.k = uvcVar.a(uvcVar.k, i94Var6, i94Var3);
                    uvcVar.l = uvcVar.a(uvcVar.l, i94Var4, i94Var5);
                    w69Var.e(arrayList.size(), j8);
                    arrayList.add(gucVar);
                }
            }
            i10 = i3 + 1;
            uvcVar2 = uvcVar;
            vz9Var = vz9Var;
            owcVar3 = owcVar2;
            i9 = i;
            size2 = i2;
            arrayListE = arrayListE;
        }
        owc owcVar4 = owcVar3;
        uvc uvcVar5 = uvcVar2;
        vz9 vz9Var2 = vz9Var;
        int i15 = i9;
        int i16 = uvcVar5.m + 1;
        int size3 = arrayList.size();
        if (size3 != 0) {
            if (size3 != i15) {
                int i17 = uvcVar5.k;
                int i18 = i17 == -1 ? i16 : i17;
                int i19 = uvcVar5.l;
                mkdVar = new r59(w69Var, arrayList, i18, i19 == -1 ? i16 : i19, uvcVar5.d, uvcVar5.e);
            } else {
                guc gucVar2 = (guc) s72.X0(arrayList);
                int i20 = uvcVar5.k;
                int i21 = i20 == -1 ? i16 : i20;
                int i22 = uvcVar5.l;
                mkdVar = new mkd(uvcVar5.d, i21, i22 == -1 ? i16 : i22, uvcVar5.e, gucVar2);
            }
            tvcVar = mkdVar;
        } else {
            tvcVar = null;
        }
        if (tvcVar == null) {
            return false;
        }
        boolean zM = tvcVar.m(this.G0);
        if (zM) {
            vuc vucVarA = wucVar.a(tvcVar);
            if (pa7.t(vucVarA, j())) {
                owcVar = owcVar4;
            } else {
                if (k()) {
                    owcVar = owcVar4;
                    ArrayList arrayList2 = owcVar.b;
                    int size4 = arrayList2.size();
                    for (int i23 = 0; i23 < size4; i23++) {
                        if (((x59) arrayList2.get(i23)).e().b.length() > 0) {
                            eh6 eh6Var = this.e;
                            if (eh6Var == null) {
                                break;
                            }
                            ((afa) eh6Var).a(9);
                            break;
                        }
                    }
                } else {
                    owcVar = owcVar4;
                }
                owcVar.k.setValue(tvcVar.n(vucVarA));
                this.d.d(vucVarA);
                this.H0 = false;
            }
            this.G0 = tvcVar;
        } else {
            owcVar = owcVar4;
        }
        tvc tvcVar3 = this.G0;
        if (tvcVar3 != null) {
            guc gucVarC = tvcVar3.c();
            x59 x59Var2 = (x59) owcVar.c.e(gucVarC.a);
            if (x59Var2 != null && (bv7VarC = x59Var2.c()) != null && (k31Var = x59Var2.e) != null && (hl9Var = (hl9) vz9Var2.getValue()) != null) {
                long jK2 = bv7VarC.K(n(), hl9Var.a);
                mmb mmbVar = new mmb();
                mmbVar.element = z5c.g(jK2, 0L);
                if (k()) {
                    hkb hkbVarC = gucVarC.f.c(tvcVar3.b() ? gucVarC.c : gucVarC.d);
                    hkb hkbVar = (hkb) mmbVar.element;
                    mmbVar.element = new hkb(Math.min(hkbVar.a, hkbVarC.a), Math.min(hkbVar.b, hkbVarC.b), Math.max(hkbVar.c, hkbVarC.c), Math.max(hkbVar.d, hkbVarC.d));
                }
                hkb hkbVar2 = (hkb) mmbVar.element;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(mh3.n(Float.intBitsToFloat((int) (jK2 & 4294967295L)), 0.0f, (int) (bv7VarC.l() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(mh3.n(Float.intBitsToFloat((int) (jK2 >> 32)), 0.0f, (int) (bv7VarC.l() >> 32)))) << 32);
                int i24 = (int) (jFloatToRawIntBits >> 32);
                int i25 = (int) (jFloatToRawIntBits & 4294967295L);
                mmbVar.element = new hkb(Math.min(hkbVar2.a, Float.intBitsToFloat(i24)), Math.min(hkbVar2.b, Float.intBitsToFloat(i25)), Math.max(hkbVar2.c, Float.intBitsToFloat(i24)), Math.max(hkbVar2.d, Float.intBitsToFloat(i25)));
                aw2 aw2Var = this.I0;
                if (aw2Var != null) {
                    ynb.V(aw2Var, null, dw2.d, new zvc(k31Var, mmbVar, null), 1);
                }
            }
        }
        return zM;
    }

    public final void u() {
        lyd lydVar;
        if (((Boolean) this.w.getValue()).booleanValue()) {
            boolean z = this.M0;
            tze tzeVar = this.g;
            if (z && k()) {
                if (((hkb) this.x.getValue()) == null) {
                    return;
                }
                tzeVar.a();
            } else {
                lne lneVar = tzeVar.a;
                if (lneVar == null || (lydVar = lneVar.J0) == null) {
                    return;
                }
                lydVar.h(null);
                lneVar.J0 = null;
            }
        }
    }

    public final void v(vuc vucVar) {
        bv7 bv7VarN = n();
        owc owcVar = this.a;
        ArrayList arrayListE = owcVar.e(bv7VarN);
        if (arrayListE.isEmpty()) {
            return;
        }
        owcVar.k.setValue(hcc.g(vucVar, arrayListE, new fnc(18), new qdc(13), new q59(vucVar, 1)));
    }

    @Override // defpackage.vpb
    public final void d() {
    }
}
