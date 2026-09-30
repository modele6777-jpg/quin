package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yx9 implements zhc {
    public final e89 A;
    public final e89 B;
    public final vz9 C;
    public final vz9 D;
    public final vz9 E;
    public final vz9 F;
    public boolean a;
    public qx9 b;
    public final vz9 c;
    public final hzc d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final os3 k;
    public final boolean l;
    public final vz9 m;
    public sw3 n;
    public int o;
    public final u69 p;
    public final sz9 q;
    public final sz9 r;
    public final mx3 s;
    public final e08 t;
    public final ix9 u;
    public final ssg v;
    public final rr0 w;
    public final vz9 x;
    public final gx7 y;
    public final b08 z;

    public yx9(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            l37.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = q1c.f(new hl9(0L));
        this.d = new hzc(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        this.k = new os3(new j38(this, 1));
        this.l = true;
        this.m = new vz9(ay9.b, qk6.L0);
        this.n = ay9.a;
        this.p = new u69();
        this.q = new sz9(-1);
        this.r = new sz9(i);
        i8c i8cVar = i8c.f;
        f12 f12Var = new f12(this, 4);
        psd psdVar = zrd.a;
        this.s = new mx3(f12Var, i8cVar);
        new xh0(0);
        new lx3(qrd.h().g());
        e08 e08Var = new e08(new j38(this, 2));
        this.t = e08Var;
        this.u = new ix9(new m6c(25, this), e08Var, new f12(this, 5));
        this.v = new ssg(24);
        this.w = new rr0();
        this.x = q1c.f(null);
        this.y = new gx7(this, 2);
        ll2.b(0, 0, 0, 0, 15);
        this.z = new b08();
        this.A = k99.v();
        this.B = k99.v();
        Boolean bool = Boolean.FALSE;
        this.C = q1c.f(bool);
        this.D = q1c.f(bool);
        this.E = q1c.f(bool);
        this.F = q1c.f(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r9.b(r7, r8, r0) == r5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object r(defpackage.yx9 r6, defpackage.s89 r7, defpackage.l26 r8, defpackage.zn2 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.wx9
            if (r0 == 0) goto L13
            r0 = r9
            wx9 r0 = (defpackage.wx9) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            wx9 r0 = new wx9
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L47
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            java.lang.Object r6 = r0.L$0
            yx9 r6 = (defpackage.yx9) r6
            defpackage.jzb.q(r9)
            goto L81
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r2
        L35:
            java.lang.Object r6 = r0.L$2
            r8 = r6
            l26 r8 = (defpackage.l26) r8
            java.lang.Object r6 = r0.L$1
            r7 = r6
            s89 r7 = (defpackage.s89) r7
            java.lang.Object r6 = r0.L$0
            yx9 r6 = (defpackage.yx9) r6
            defpackage.jzb.q(r9)
            goto L59
        L47:
            defpackage.jzb.q(r9)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r4
            java.lang.Object r9 = r6.i(r0)
            if (r9 != r5) goto L59
            goto L80
        L59:
            os3 r9 = r6.k
            boolean r9 = r9.a()
            if (r9 != 0) goto L70
            hzc r9 = r6.d
            java.lang.Object r9 = r9.c
            sz9 r9 = (defpackage.sz9) r9
            int r9 = r9.j()
            sz9 r1 = r6.r
            r1.k(r9)
        L70:
            os3 r9 = r6.k
            r0.L$0 = r6
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r7 = r9.b(r7, r8, r0)
            if (r7 != r5) goto L81
        L80:
            return r5
        L81:
            r7 = -1
            sz9 r6 = r6.q
            r6.k(r7)
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx9.r(yx9, s89, l26, zn2):java.lang.Object");
    }

    public static Object s(yx9 yx9Var, int i, gbe gbeVar) {
        yx9Var.getClass();
        Object objB = yx9Var.b(s89.a, new xx9(yx9Var, 0.0f, i, null), gbeVar);
        return objB == bw2.a ? objB : wef.a;
    }

    @Override // defpackage.zhc
    public final boolean a() {
        return this.k.a();
    }

    @Override // defpackage.zhc
    public final Object b(s89 s89Var, l26 l26Var, zn2 zn2Var) {
        return r(this, s89Var, l26Var, zn2Var);
    }

    @Override // defpackage.zhc
    public final boolean c() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // defpackage.zhc
    public final boolean d() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // defpackage.zhc
    public final float e(float f) {
        return this.k.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object f(int i, fxd fxdVar, xn2 xn2Var) {
        tx9 tx9Var;
        float f;
        int i2;
        vz vzVar;
        if (xn2Var instanceof tx9) {
            tx9Var = (tx9) xn2Var;
            int i3 = tx9Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tx9Var.label = i3 - Integer.MIN_VALUE;
            } else {
                tx9Var = new tx9(this, xn2Var);
            }
        } else {
            tx9Var = new tx9(this, xn2Var);
        }
        tx9 tx9Var2 = tx9Var;
        Object obj = tx9Var2.result;
        int i4 = tx9Var2.label;
        wef wefVar = wef.a;
        Object obj2 = bw2.a;
        if (i4 == 0) {
            jzb.q(obj);
            hzc hzcVar = this.d;
            f = 0.0f;
            if ((i != ((sz9) hzcVar.c).j() || ((qz9) hzcVar.d).j() != 0.0f) && l() != 0) {
                tx9Var2.L$0 = fxdVar;
                tx9Var2.I$0 = i;
                tx9Var2.F$0 = 0.0f;
                tx9Var2.label = 1;
                if (i(tx9Var2) != obj2) {
                    i2 = i;
                    vzVar = fxdVar;
                }
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        float f2 = tx9Var2.F$0;
        int i5 = tx9Var2.I$0;
        vzVar = (vz) tx9Var2.L$0;
        jzb.q(obj);
        f = f2;
        i2 = i5;
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            l37.a("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        l26 ux9Var = new ux9(this, j(i2), f * n(), vzVar, null);
        tx9Var2.L$0 = null;
        tx9Var2.label = 2;
        return b(s89.a, ux9Var, tx9Var2) == obj2 ? obj2 : wefVar;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:122:0x02af  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:145:0x0308 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:137:0x02e6, B:140:0x02ef, B:143:0x02fc, B:145:0x0308, B:153:0x033e, B:151:0x0338, B:148:0x0320), top: B:169:0x02e6 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x031f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0320 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:137:0x02e6, B:140:0x02ef, B:143:0x02fc, B:145:0x0308, B:153:0x033e, B:151:0x0338, B:148:0x0320), top: B:169:0x02e6 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0337  */
    /* JADX WARN: Code duplicated, block: B:151:0x0338 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:137:0x02e6, B:140:0x02ef, B:143:0x02fc, B:145:0x0308, B:153:0x033e, B:151:0x0338, B:148:0x0320), top: B:169:0x02e6 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0359  */
    /* JADX WARN: Code duplicated, block: B:161:0x0360  */
    /* JADX WARN: Code duplicated, block: B:164:0x037c  */
    /* JADX WARN: Code duplicated, block: B:169:0x02e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:96:0x021d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0224 A[LOOP:1: B:97:0x0222->B:98:0x0224, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r5v22, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v56 */
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
    public final void h(qx9 qx9Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        Object obj;
        boolean z7;
        boolean z8;
        w81 w81Var;
        List list;
        int size;
        int i2;
        ?? r5;
        ?? r11;
        ?? r8;
        float f;
        long jI;
        long jO;
        long j;
        int i3;
        List list2 = qx9Var.a;
        int i4 = qx9Var.l;
        ao8 ao8Var = qx9Var.i;
        ao8 ao8Var2 = qx9Var.j;
        float f2 = qx9Var.k;
        this.t.e = list2.size();
        int i5 = qx9Var.b;
        this.o = qx9Var.c + i5;
        if (!z && this.a) {
            this.b = qx9Var;
            return;
        }
        boolean z9 = true;
        if (z) {
            this.a = true;
        }
        ix9 ix9Var = this.u;
        boolean z10 = this.l;
        hzc hzcVar = this.d;
        if (!z2) {
            hzcVar.getClass();
            hzcVar.e = ao8Var2 != null ? ao8Var2.d : null;
            if (hzcVar.a || !list2.isEmpty()) {
                hzcVar.a = true;
                int i6 = ao8Var2 != null ? ao8Var2.a : 0;
                ((sz9) hzcVar.c).k(i6);
                ((wz7) hzcVar.f).c(i6);
                ((qz9) hzcVar.d).k(f2);
            }
            if (z10) {
                boolean z11 = z10;
                gg7 gg7Var = ix9Var.o;
                q69 q69Var = ix9Var.e;
                gg7Var.c = qx9Var;
                gg7Var.d = ix9Var.n;
                m6c m6cVar = ix9Var.a;
                int i7 = ix9Var.g;
                float f3 = 0.0f;
                int i8 = -1;
                if (i7 != -1 && i7 != gg7Var.r()) {
                    ix9Var.l = true;
                    if (gg7Var.k()) {
                        int i9 = ix9Var.h;
                        if (i9 < 0) {
                            i9 = 0;
                        }
                        ix9Var.h = i9;
                        int iR = gg7Var.n().a.isEmpty() ? -1 : gg7Var.r() - 1;
                        if (iR != -1) {
                            int i10 = ix9Var.i;
                            if (i10 <= iR) {
                                iR = i10;
                            }
                            ix9Var.i = iR;
                        }
                        if (ix9Var.f <= 0.0f) {
                            ix9Var.f(gg7Var.m(), ix9Var.m - 1);
                        } else {
                            ix9Var.f(0, gg7Var.j());
                        }
                    }
                }
                ix9Var.m = gg7Var.r();
                if (gg7Var.k()) {
                    int size2 = gg7Var.n().r.size() + gg7Var.n().a.size() + gg7Var.n().q.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        int size3 = gg7Var.n().q.size();
                        float f4 = f3;
                        int size4 = gg7Var.n().a.size();
                        if (i11 < size3) {
                            i = ((ao8) gg7Var.n().q.get(i11)).a;
                        } else if (i11 < size3 || i11 >= size3 + size4) {
                            i = i11 >= size3 + size4 ? ((ao8) gg7Var.n().r.get((i11 - size3) - size4)).a : i8;
                        } else {
                            i = ((ao8) gg7Var.n().a.get(i11 - size3)).a;
                        }
                        int size5 = gg7Var.n().q.size();
                        int size6 = gg7Var.n().a.size();
                        if (i11 < size5) {
                            obj = ((ao8) gg7Var.n().q.get(i11)).d;
                        } else if (i11 < size5 || i11 >= size5 + size6) {
                            obj = i11 >= size5 + size6 ? ((ao8) gg7Var.n().r.get((i11 - size5) - size6)).d : w81.c;
                        } else {
                            obj = ((ao8) gg7Var.n().a.get(i11 - size5)).d;
                        }
                        int i12 = gg7Var.n().b;
                        if (i != -1) {
                            if (q69Var.a(i)) {
                                Object objB = q69Var.b(i);
                                objB.getClass();
                                int i13 = ((w81) objB).b;
                                Object objB2 = q69Var.b(i);
                                objB2.getClass();
                                z7 = z11;
                                Object obj2 = ((w81) objB2).a;
                                if (i13 != i12 || !pa7.t(obj2, obj)) {
                                    z8 = true;
                                    ix9Var.l = true;
                                }
                                w81Var = (w81) q69Var.b(i);
                                if (w81Var != null) {
                                    w81Var.b = i12;
                                    w81Var.a = obj;
                                } else {
                                    w81Var = new w81();
                                    w81Var.a = obj;
                                    w81Var.b = i12;
                                }
                                q69Var.i(i, w81Var);
                                ix9Var.h = Math.min(ix9Var.h, i);
                                ix9Var.i = Math.max(ix9Var.i, i);
                                list = (List) ix9Var.b.g(i);
                                if (list != null) {
                                    size = list.size();
                                    for (i2 = 0; i2 < size; i2++) {
                                        ((d08) list.get(i2)).cancel();
                                    }
                                }
                            } else {
                                z7 = z11;
                            }
                            z8 = true;
                            w81Var = (w81) q69Var.b(i);
                            if (w81Var != null) {
                                w81Var.b = i12;
                                w81Var.a = obj;
                            } else {
                                w81Var = new w81();
                                w81Var.a = obj;
                                w81Var.b = i12;
                            }
                            q69Var.i(i, w81Var);
                            ix9Var.h = Math.min(ix9Var.h, i);
                            ix9Var.i = Math.max(ix9Var.i, i);
                            list = (List) ix9Var.b.g(i);
                            if (list != null) {
                                size = list.size();
                                while (i2 < size) {
                                    ((d08) list.get(i2)).cancel();
                                }
                            }
                        } else {
                            z7 = z11;
                            z8 = true;
                        }
                        i11++;
                        f3 = f4;
                        z9 = z8;
                        z11 = z7;
                        i8 = -1;
                    }
                    z3 = z11;
                    z4 = z9;
                    float f5 = f3;
                    if (ix9Var.l) {
                        boolean z12 = ix9Var.f <= f5 ? z4 : false;
                        if (gg7Var.k()) {
                            xo1.A(gg7Var.n());
                            z6 = false;
                            ix9Var.d(gg7Var, gg7Var.j(), gg7Var.m(), gg7Var.n().t != null ? ((yx9) m6cVar.b).o : 0, gg7Var.o(), gg7Var.p(), 0.0f, z12);
                        } else {
                            z6 = false;
                        }
                        ix9Var.l = z6;
                        z5 = z6;
                    } else {
                        z5 = false;
                    }
                } else {
                    z3 = z11;
                    z4 = true;
                    z5 = false;
                    ix9Var.g();
                }
                ix9Var.g = gg7Var.r();
                r5 = z5;
            }
            this.m.setValue(qx9Var);
            this.C.setValue(Boolean.valueOf(qx9Var.m));
            if (ao8Var != null) {
                i3 = ao8Var.a;
            } else {
                r11 = r5;
            }
            if (r11 == 0 || i4 != 0) {
                r11 = i3;
                r8 = z4;
            } else {
                r8 = r5;
            }
            this.D.setValue(Boolean.valueOf((boolean) r8));
            if (ao8Var != null) {
                this.e = ao8Var.a;
            }
            this.f = i4;
            ird irdVarJ = iqf.j();
            a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
            ird irdVarL = iqf.l(irdVarJ);
            if (z3) {
                try {
                    if (qx9Var.h < l() && Math.abs(this.j) > 0.5f) {
                        f = this.j;
                        if (k().e == ks9.a) {
                            if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (p() & 4294967295L)))) {
                                if (q()) {
                                }
                            }
                        } else if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (p() >> 32)))) {
                            if (q()) {
                            }
                        }
                        ix9Var.e(this.j, qx9Var);
                    }
                } catch (Throwable th) {
                    iqf.p(irdVarJ, irdVarL, a26VarE);
                    throw th;
                }
            }
            iqf.p(irdVarJ, irdVarL, a26VarE);
            this.g = ay9.a(qx9Var, l());
            l();
            if (qx9Var.e == ks9.b) {
                jI = qx9Var.i() >> 32;
            } else {
                jI = qx9Var.i() & 4294967295L;
            }
            int i14 = (int) jI;
            jO = mh3.o(qx9Var.n.g(i14, i5, -qx9Var.f, qx9Var.d), r5, i14);
            j = this.g;
            if (jO > j) {
                jO = j;
            }
            this.h = jO;
        }
        ((qz9) hzcVar.d).k(f2);
        z4 = true;
        z3 = z10;
        r5 = 0;
        this.m.setValue(qx9Var);
        this.C.setValue(Boolean.valueOf(qx9Var.m));
        if (ao8Var != null) {
            i3 = ao8Var.a;
        } else {
            r11 = r5;
        }
        if (r11 == 0) {
            r11 = i3;
            r8 = z4;
        } else {
            r11 = i3;
            r8 = z4;
        }
        this.D.setValue(Boolean.valueOf((boolean) r8));
        if (ao8Var != null) {
            this.e = ao8Var.a;
        }
        this.f = i4;
        ird irdVarJ2 = iqf.j();
        a26 a26VarE2 = irdVarJ2 != null ? irdVarJ2.e() : null;
        ird irdVarL2 = iqf.l(irdVarJ2);
        if (z3) {
            if (qx9Var.h < l()) {
                f = this.j;
                if (k().e == ks9.a) {
                    if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (p() & 4294967295L)))) {
                        if (q()) {
                        }
                    }
                } else if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (p() >> 32)))) {
                    if (q()) {
                    }
                }
                ix9Var.e(this.j, qx9Var);
            }
        }
        iqf.p(irdVarJ2, irdVarL2, a26VarE2);
        this.g = ay9.a(qx9Var, l());
        l();
        if (qx9Var.e == ks9.b) {
            jI = qx9Var.i() >> 32;
        } else {
            jI = qx9Var.i() & 4294967295L;
        }
        int i15 = (int) jI;
        jO = mh3.o(qx9Var.n.g(i15, i5, -qx9Var.f, qx9Var.d), r5, i15);
        j = this.g;
        if (jO > j) {
            jO = j;
        }
        this.h = jO;
    }

    public final Object i(zn2 zn2Var) {
        Object objA;
        return (this.m.getValue() == ay9.b && (objA = this.w.a(zn2Var)) == bw2.a) ? objA : wef.a;
    }

    public final int j(int i) {
        if (l() > 0) {
            return mh3.o(i, 0, l() - 1);
        }
        return 0;
    }

    public final qx9 k() {
        return (qx9) this.m.getValue();
    }

    public abstract int l();

    public final int m() {
        return ((qx9) this.m.getValue()).b;
    }

    public final int n() {
        return ((qx9) this.m.getValue()).c + m();
    }

    public final int o() {
        return ((Number) this.s.getValue()).intValue();
    }

    public final long p() {
        return ((hl9) this.c.getValue()).a;
    }

    public final boolean q() {
        return ((int) Float.intBitsToFloat((int) (p() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (p() & 4294967295L))) == 0;
    }

    public final void t(float f, int i, boolean z) {
        hzc hzcVar = this.d;
        sz9 sz9Var = (sz9) hzcVar.c;
        qz9 qz9Var = (qz9) hzcVar.d;
        if (sz9Var.j() != i || qz9Var.j() != f) {
            this.u.g();
        }
        ((sz9) hzcVar.c).k(i);
        ((wz7) hzcVar.f).c(i);
        qz9Var.k(f);
        hzcVar.e = null;
        if (!z) {
            this.B.setValue(wef.a);
            return;
        }
        LayoutNode layoutNode = (LayoutNode) this.x.getValue();
        if (layoutNode != null) {
            layoutNode.m();
        }
    }
}
