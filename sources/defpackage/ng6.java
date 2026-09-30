package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ng6 implements xs4 {
    public final vtc a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public k1f j;
    public mg6 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final d55 d = new d55(7);
    public final d55 e = new d55(8);
    public final d55 f = new d55(6);
    public long m = -9223372036854775807L;
    public final d0a o = new d0a();

    public ng6(vtc vtcVar, boolean z, boolean z2) {
        this.a = vtcVar;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:70:0x020e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0215  */
    /* JADX WARN: Code duplicated, block: B:92:0x0252  */
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
    public final void a(long j, int i, int i2, long j2) {
        long j3;
        int i3;
        long j4;
        long j5;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        a80 a80Var = this.a.d;
        if (!this.l || this.k.c) {
            d55 d55Var = this.d;
            d55Var.d(i2);
            d55 d55Var2 = this.e;
            d55Var2.d(i2);
            boolean z4 = this.l;
            boolean z5 = d55Var.e;
            if (z4) {
                if (z5) {
                    s99 s99VarQ = n16.Q((byte[]) d55Var.f, 3, d55Var.c);
                    a80Var.D(s99VarQ.s);
                    this.k.d.append(s99VarQ.d, s99VarQ);
                    d55Var.f();
                } else if (d55Var2.e) {
                    er0 er0Var = new er0((byte[]) d55Var2.f, 4, d55Var2.c);
                    int iL = er0Var.l();
                    int iL2 = er0Var.l();
                    er0Var.w();
                    this.k.e.append(iL, new r99(iL, iL2, er0Var.j()));
                    d55Var2.f();
                }
            } else if (z5 && d55Var2.e) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) d55Var.f, d55Var.c));
                arrayList.add(Arrays.copyOf((byte[]) d55Var2.f, d55Var2.c));
                s99 s99VarQ2 = n16.Q((byte[]) d55Var.f, 3, d55Var.c);
                int i8 = s99VarQ2.s;
                er0 er0Var2 = new er0((byte[]) d55Var2.f, 4, d55Var2.c);
                int iL3 = er0Var2.l();
                int iL4 = er0Var2.l();
                er0Var2.w();
                r99 r99Var = new r99(iL3, iL4, er0Var2.j());
                int i9 = s99VarQ2.a;
                int i10 = s99VarQ2.b;
                int i11 = s99VarQ2.c;
                byte[] bArr = d72.a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
                k1f k1fVar = this.j;
                qr5 qr5Var = new qr5();
                qr5Var.a = this.i;
                qr5Var.n = qv8.l("video/mp2t");
                qr5Var.o = qv8.l("video/avc");
                qr5Var.k = str;
                qr5Var.v = s99VarQ2.e;
                qr5Var.w = s99VarQ2.f;
                qr5Var.G = new e82(s99VarQ2.p, s99VarQ2.q, s99VarQ2.r, null, s99VarQ2.h + 8, s99VarQ2.i + 8);
                qr5Var.D = s99VarQ2.g;
                qr5Var.r = arrayList;
                qr5Var.q = i8;
                k1fVar.g(new rr5(qr5Var));
                this.l = true;
                a80Var.D(i8);
                this.k.d.append(s99VarQ2.d, s99VarQ2);
                this.k.e.append(iL3, r99Var);
                d55Var.f();
                d55Var2.f();
            }
        }
        d55 d55Var3 = this.f;
        if (d55Var3.d(i2)) {
            int iA0 = n16.a0((byte[]) d55Var3.f, d55Var3.c);
            byte[] bArr2 = (byte[]) d55Var3.f;
            d0a d0aVar = this.o;
            d0aVar.K(bArr2, iA0);
            d0aVar.M(4);
            a80Var.a(j2, d0aVar);
        }
        mg6 mg6Var = this.k;
        boolean z6 = this.l;
        if (mg6Var.i == 9) {
            if (z6 && mg6Var.o) {
                j3 = mg6Var.j;
                i3 = i + ((int) (j - j3));
                j4 = mg6Var.q;
                if (j4 != -9223372036854775807L) {
                    j5 = mg6Var.p;
                    if (j3 != j5) {
                        mg6Var.a.a(j4, mg6Var.r ? 1 : 0, (int) (j3 - j5), i3, null);
                    }
                }
            }
            mg6Var.p = mg6Var.j;
            mg6Var.q = mg6Var.l;
            mg6Var.r = false;
            mg6Var.o = true;
        } else if (mg6Var.c) {
            lg6 lg6Var = mg6Var.n;
            lg6 lg6Var2 = mg6Var.m;
            if (lg6Var.a) {
                if (lg6Var2.a) {
                    s99 s99Var = lg6Var.c;
                    s99Var.getClass();
                    s99 s99Var2 = lg6Var2.c;
                    s99Var2.getClass();
                    int i12 = s99Var2.m;
                    if (lg6Var.f != lg6Var2.f || lg6Var.g != lg6Var2.g || lg6Var.h != lg6Var2.h || ((lg6Var.i && lg6Var2.i && lg6Var.j != lg6Var2.j) || (((i5 = lg6Var.d) != (i6 = lg6Var2.d) && (i5 == 0 || i6 == 0)) || (((i7 = s99Var.m) == 0 && i12 == 0 && (lg6Var.m != lg6Var2.m || lg6Var.n != lg6Var2.n)) || ((i7 == 1 && i12 == 1 && (lg6Var.o != lg6Var2.o || lg6Var.p != lg6Var2.p)) || (z3 = lg6Var.k) != lg6Var2.k || (z3 && lg6Var.l != lg6Var2.l)))))) {
                        if (z6) {
                            j3 = mg6Var.j;
                            i3 = i + ((int) (j - j3));
                            j4 = mg6Var.q;
                            if (j4 != -9223372036854775807L) {
                                j5 = mg6Var.p;
                                if (j3 != j5) {
                                    mg6Var.a.a(j4, mg6Var.r ? 1 : 0, (int) (j3 - j5), i3, null);
                                }
                            }
                        }
                        mg6Var.p = mg6Var.j;
                        mg6Var.q = mg6Var.l;
                        mg6Var.r = false;
                        mg6Var.o = true;
                    }
                } else {
                    if (z6) {
                        j3 = mg6Var.j;
                        i3 = i + ((int) (j - j3));
                        j4 = mg6Var.q;
                        if (j4 != -9223372036854775807L) {
                            j5 = mg6Var.p;
                            if (j3 != j5) {
                                mg6Var.a.a(j4, mg6Var.r ? 1 : 0, (int) (j3 - j5), i3, null);
                            }
                        }
                    }
                    mg6Var.p = mg6Var.j;
                    mg6Var.q = mg6Var.l;
                    mg6Var.r = false;
                    mg6Var.o = true;
                }
            }
        }
        if (mg6Var.b) {
            lg6 lg6Var3 = mg6Var.n;
            z = lg6Var3.b && ((i4 = lg6Var3.e) == 7 || i4 == 2);
        } else {
            z = mg6Var.s;
        }
        boolean z7 = mg6Var.r;
        int i13 = mg6Var.i;
        if (i13 == 5) {
            z2 = true;
        } else if (z) {
            z2 = true;
            if (i13 != 1) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z8 = z7 | z2;
        mg6Var.r = z8;
        mg6Var.i = 24;
        if (z8) {
            this.n = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0139  */
    public final void b(byte[] bArr, int i, int i2) {
        boolean zJ;
        boolean zJ2;
        boolean z;
        boolean z2;
        int iL;
        int i3;
        int iK;
        int i4;
        int iM;
        int iM2;
        if (!this.l || this.k.c) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        mg6 mg6Var = this.k;
        SparseArray sparseArray = mg6Var.e;
        er0 er0Var = mg6Var.f;
        if (mg6Var.k) {
            int i5 = i2 - i;
            byte[] bArrCopyOf = mg6Var.g;
            int length = bArrCopyOf.length;
            int i6 = mg6Var.h + i5;
            if (length < i6) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6 * 2);
                mg6Var.g = bArrCopyOf;
            }
            System.arraycopy(bArr, i, bArrCopyOf, mg6Var.h, i5);
            int i7 = mg6Var.h + i5;
            mg6Var.h = i7;
            er0Var.f = mg6Var.g;
            er0Var.c = 0;
            er0Var.d = 0;
            er0Var.b = i7;
            er0Var.e = 0;
            er0Var.a();
            if (er0Var.c(8)) {
                er0Var.w();
                int iK2 = er0Var.k(2);
                er0Var.x(5);
                if (er0Var.d()) {
                    er0Var.l();
                    if (er0Var.d()) {
                        int iL2 = er0Var.l();
                        if (!mg6Var.c) {
                            mg6Var.k = false;
                            lg6 lg6Var = mg6Var.n;
                            lg6Var.e = iL2;
                            lg6Var.b = true;
                            return;
                        }
                        if (er0Var.d()) {
                            int iL3 = er0Var.l();
                            if (sparseArray.indexOfKey(iL3) < 0) {
                                mg6Var.k = false;
                                return;
                            }
                            r99 r99Var = (r99) sparseArray.get(iL3);
                            SparseArray sparseArray2 = mg6Var.d;
                            int i8 = r99Var.a;
                            boolean z3 = r99Var.b;
                            s99 s99Var = (s99) sparseArray2.get(i8);
                            boolean z4 = s99Var.j;
                            int i9 = s99Var.n;
                            int i10 = s99Var.l;
                            if (z4) {
                                if (!er0Var.c(2)) {
                                    return;
                                } else {
                                    er0Var.x(2);
                                }
                            }
                            if (er0Var.c(i10)) {
                                int iK3 = er0Var.k(i10);
                                if (!s99Var.k) {
                                    if (er0Var.c(1)) {
                                        zJ = er0Var.j();
                                        if (!zJ) {
                                            zJ2 = false;
                                        } else {
                                            if (!er0Var.c(1)) {
                                                return;
                                            }
                                            zJ2 = er0Var.j();
                                            z = true;
                                        }
                                        if (mg6Var.i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iL = 0;
                                        } else if (!er0Var.d()) {
                                            return;
                                        } else {
                                            iL = er0Var.l();
                                        }
                                        i3 = s99Var.m;
                                        if (i3 != 0) {
                                            if (er0Var.c(i9)) {
                                                iK = er0Var.k(i9);
                                                if (!z3 && !zJ) {
                                                    if (!er0Var.d()) {
                                                        return;
                                                    }
                                                    iM2 = er0Var.m();
                                                    i4 = 0;
                                                }
                                                iM = 0;
                                                lg6 lg6Var2 = mg6Var.n;
                                                lg6Var2.c = s99Var;
                                                lg6Var2.d = iK2;
                                                lg6Var2.e = iL2;
                                                lg6Var2.f = iK3;
                                                lg6Var2.g = iL3;
                                                lg6Var2.h = zJ;
                                                lg6Var2.i = z;
                                                lg6Var2.j = zJ2;
                                                lg6Var2.k = z2;
                                                lg6Var2.l = iL;
                                                lg6Var2.m = iK;
                                                lg6Var2.n = iM2;
                                                lg6Var2.o = i4;
                                                lg6Var2.p = iM;
                                                lg6Var2.a = true;
                                                lg6Var2.b = true;
                                                mg6Var.k = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || s99Var.o) {
                                            iK = 0;
                                        } else {
                                            if (!er0Var.d()) {
                                                return;
                                            }
                                            int iM3 = er0Var.m();
                                            if (!z3 || zJ) {
                                                i4 = iM3;
                                                iK = 0;
                                                iM2 = 0;
                                                iM = 0;
                                            } else {
                                                if (!er0Var.d()) {
                                                    return;
                                                }
                                                iM = er0Var.m();
                                                iM2 = 0;
                                                i4 = iM3;
                                                iK = 0;
                                            }
                                        }
                                        lg6 lg6Var3 = mg6Var.n;
                                        lg6Var3.c = s99Var;
                                        lg6Var3.d = iK2;
                                        lg6Var3.e = iL2;
                                        lg6Var3.f = iK3;
                                        lg6Var3.g = iL3;
                                        lg6Var3.h = zJ;
                                        lg6Var3.i = z;
                                        lg6Var3.j = zJ2;
                                        lg6Var3.k = z2;
                                        lg6Var3.l = iL;
                                        lg6Var3.m = iK;
                                        lg6Var3.n = iM2;
                                        lg6Var3.o = i4;
                                        lg6Var3.p = iM;
                                        lg6Var3.a = true;
                                        lg6Var3.b = true;
                                        mg6Var.k = false;
                                        i4 = 0;
                                        iM2 = 0;
                                        iM = 0;
                                        lg6 lg6Var4 = mg6Var.n;
                                        lg6Var4.c = s99Var;
                                        lg6Var4.d = iK2;
                                        lg6Var4.e = iL2;
                                        lg6Var4.f = iK3;
                                        lg6Var4.g = iL3;
                                        lg6Var4.h = zJ;
                                        lg6Var4.i = z;
                                        lg6Var4.j = zJ2;
                                        lg6Var4.k = z2;
                                        lg6Var4.l = iL;
                                        lg6Var4.m = iK;
                                        lg6Var4.n = iM2;
                                        lg6Var4.o = i4;
                                        lg6Var4.p = iM;
                                        lg6Var4.a = true;
                                        lg6Var4.b = true;
                                        mg6Var.k = false;
                                    }
                                    return;
                                }
                                zJ = false;
                                zJ2 = false;
                                z = zJ2;
                                if (mg6Var.i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iL = 0;
                                } else if (!er0Var.d()) {
                                    return;
                                } else {
                                    iL = er0Var.l();
                                }
                                i3 = s99Var.m;
                                if (i3 != 0) {
                                    if (i3 == 1) {
                                    }
                                    iK = 0;
                                } else {
                                    if (er0Var.c(i9)) {
                                        return;
                                    }
                                    iK = er0Var.k(i9);
                                    if (!z3) {
                                    }
                                }
                                i4 = 0;
                                iM2 = 0;
                                iM = 0;
                                lg6 lg6Var5 = mg6Var.n;
                                lg6Var5.c = s99Var;
                                lg6Var5.d = iK2;
                                lg6Var5.e = iL2;
                                lg6Var5.f = iK3;
                                lg6Var5.g = iL3;
                                lg6Var5.h = zJ;
                                lg6Var5.i = z;
                                lg6Var5.j = zJ2;
                                lg6Var5.k = z2;
                                lg6Var5.l = iL;
                                lg6Var5.m = iK;
                                lg6Var5.n = iM2;
                                lg6Var5.o = i4;
                                lg6Var5.p = iM;
                                lg6Var5.a = true;
                                lg6Var5.b = true;
                                mg6Var.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.xs4
    public final void c(d0a d0aVar) {
        int i;
        this.j.getClass();
        String str = pqf.a;
        int i2 = d0aVar.b;
        int i3 = d0aVar.c;
        byte[] bArr = d0aVar.a;
        this.g += (long) d0aVar.a();
        this.j.e(d0aVar.a(), d0aVar);
        while (true) {
            int iB = n16.B(bArr, i2, i3, this.h);
            if (iB == i3) {
                b(bArr, i2, i3);
                return;
            }
            int i4 = bArr[iB + 3] & 31;
            if (iB <= 0 || bArr[iB - 1] != 0) {
                i = 3;
            } else {
                iB--;
                i = 4;
            }
            int i5 = iB;
            int i6 = i;
            int i7 = i5 - i2;
            if (i7 > 0) {
                b(bArr, i2, i5);
            }
            int i8 = i3 - i5;
            long j = this.g - ((long) i8);
            a(j, i8, i7 < 0 ? -i7 : 0, this.m);
            i(j, i4, this.m);
            i2 = i5 + i6;
        }
    }

    @Override // defpackage.xs4
    public final void d() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        n16.z(this.h);
        this.d.f();
        this.e.f();
        this.f.f();
        this.a.d.o(0);
        mg6 mg6Var = this.k;
        if (mg6Var != null) {
            mg6Var.k = false;
            mg6Var.o = false;
            lg6 lg6Var = mg6Var.n;
            lg6Var.b = false;
            lg6Var.a = false;
        }
    }

    @Override // defpackage.xs4
    public final void f() {
        this.j.getClass();
        String str = pqf.a;
        this.a.d.o(0);
        a(this.g, 0, 0, this.m);
        i(this.g, 9, this.m);
        a(this.g, 0, 0, this.m);
    }

    @Override // defpackage.xs4
    public final void g(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    @Override // defpackage.xs4
    public final void h(n95 n95Var, xg3 xg3Var) {
        xg3Var.d();
        xg3Var.i();
        this.i = (String) xg3Var.e;
        xg3Var.i();
        k1f k1fVarN = n95Var.n(xg3Var.c, 2);
        this.j = k1fVarN;
        this.k = new mg6(k1fVarN, this.b, this.c);
        this.a.b(n95Var, xg3Var);
    }

    public final void i(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.g(i);
            this.e.g(i);
        }
        this.f.g(i);
        mg6 mg6Var = this.k;
        boolean z = this.n;
        mg6Var.i = i;
        mg6Var.l = j2;
        mg6Var.j = j;
        mg6Var.s = z;
        if (!mg6Var.b || i != 1) {
            if (!mg6Var.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        lg6 lg6Var = mg6Var.m;
        mg6Var.m = mg6Var.n;
        mg6Var.n = lg6Var;
        lg6Var.b = false;
        lg6Var.a = false;
        mg6Var.h = 0;
        mg6Var.k = true;
    }
}
