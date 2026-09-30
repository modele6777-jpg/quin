package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pl6 {
    public final bv7 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final i79 f = new i79();
    public final dg9 g = new dg9();
    public final y69 h = new y69(10);

    public pl6(bv7 bv7Var) {
        this.a = bv7Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    public final void a(long j, List list, boolean z) {
        y69 y69Var;
        long[] jArr;
        tf9 tf9Var;
        Object objE;
        Object obj;
        int size = list.size();
        dg9 dg9Var = this.g;
        dg9 dg9Var2 = dg9Var;
        boolean z2 = true;
        int i = 0;
        while (true) {
            y69Var = this.h;
            if (i >= size) {
                break;
            }
            i09 i09Var = (i09) list.get(i);
            if (i09Var.Y) {
                i09Var.X = new jf6(5, this, i09Var);
                if (z2) {
                    p89 p89Var = dg9Var2.a;
                    Object[] objArr = p89Var.a;
                    int i2 = p89Var.c;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (((tf9) obj).c.equals(i09Var)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    tf9Var = (tf9) obj;
                    if (tf9Var != null) {
                        tf9Var.i = true;
                        tf9Var.d.a(j);
                        if (z) {
                            Object objE2 = y69Var.e(j);
                            if (objE2 == null) {
                                objE2 = new i79();
                                y69Var.i(j, objE2);
                            }
                            ((i79) objE2).h(tf9Var);
                        }
                    } else {
                        z2 = false;
                        tf9Var = new tf9(i09Var);
                        tf9Var.d.a(j);
                        if (z) {
                            objE = y69Var.e(j);
                            if (objE == null) {
                                objE = new i79();
                                y69Var.i(j, objE);
                            }
                            ((i79) objE).h(tf9Var);
                        }
                        dg9Var2.a.b(tf9Var);
                    }
                } else {
                    tf9Var = new tf9(i09Var);
                    tf9Var.d.a(j);
                    if (z) {
                        objE = y69Var.e(j);
                        if (objE == null) {
                            objE = new i79();
                            y69Var.i(j, objE);
                        }
                        ((i79) objE).h(tf9Var);
                    }
                    dg9Var2.a.b(tf9Var);
                }
                dg9Var2 = tf9Var;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = y69Var.b;
            Object[] objArr2 = y69Var.c;
            long[] jArr3 = y69Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                i79 i79Var = (i79) objArr2[i8];
                                p89 p89Var2 = dg9Var.a;
                                Object[] objArr3 = p89Var2.a;
                                int i9 = p89Var2.c;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((tf9) objArr3[i10]).f(j3, i79Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                }
            }
        }
        y69Var.a();
    }

    public final boolean b(egh eghVar, boolean z) {
        dg9 dg9Var = this.g;
        p89 p89Var = dg9Var.a;
        if (!dg9Var.a((gg8) eghVar.c, this.a, eghVar, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = p89Var.a;
        int i = p89Var.c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((tf9) objArr[i2]).e(eghVar, z) || z3;
        }
        Object[] objArr2 = p89Var.a;
        int i3 = p89Var.c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((tf9) objArr2[i4]).d(eghVar) || z4;
        }
        dg9Var.b(eghVar);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            i79 i79Var = this.f;
            int i5 = i79Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((i09) i79Var.b(i6));
            }
            i79Var.k();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            dg9Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        dg9 dg9Var = this.g;
        p89 p89Var = dg9Var.a;
        Object[] objArr = p89Var.a;
        int i = p89Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((tf9) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            dg9Var.a.g();
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
    public final void d(i09 i09Var) {
        if (this.b) {
            this.e = true;
            this.f.h(i09Var);
            return;
        }
        dg9 dg9Var = this.g;
        i79 i79Var = dg9Var.b;
        i79Var.k();
        i79Var.h(dg9Var);
        while (i79Var.e()) {
            dg9 dg9Var2 = (dg9) i79Var.m(i79Var.b - 1);
            int i = 0;
            while (true) {
                p89 p89Var = dg9Var2.a;
                if (i < p89Var.c) {
                    tf9 tf9Var = (tf9) p89Var.a[i];
                    if (tf9Var.c.equals(i09Var)) {
                        dg9Var2.a.j(tf9Var);
                        tf9Var.c();
                    } else {
                        i79Var.h(tf9Var);
                        i++;
                    }
                }
            }
        }
    }
}
