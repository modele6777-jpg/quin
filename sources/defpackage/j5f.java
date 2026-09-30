package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j5f {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final w5c a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final uj3 e;
    public final String[] g;
    public final wk9 h;
    public final yk9 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public x16 k = new r02(12);
    public final LinkedHashMap f = new LinkedHashMap();

    public j5f(w5c w5cVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, uj3 uj3Var) {
        String lowerCase;
        this.a = w5cVar;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = uj3Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase4, bm8.B(linkedHashMap3, lowerCase3));
            }
        }
        this.h = new wk9(this.g.length);
        this.i = new yk9(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(jja jjaVar, zn2 zn2Var) {
        v4f v4fVar;
        if (zn2Var instanceof v4f) {
            v4fVar = (v4f) zn2Var;
            int i = v4fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                v4fVar.label = i - Integer.MIN_VALUE;
            } else {
                v4fVar = new v4f(this, zn2Var);
            }
        } else {
            v4fVar = new v4f(this, zn2Var);
        }
        Object objD = v4fVar.result;
        int i2 = v4fVar.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objD);
            ule uleVar = new ule(28);
            v4fVar.L$0 = jjaVar;
            v4fVar.label = 1;
            objD = jjaVar.d("SELECT * FROM room_table_modification_log WHERE invalidated = 1", uleVar, v4fVar);
            if (objD != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) v4fVar.L$0;
            jzb.q(objD);
            return set;
        }
        jjaVar = (jja) v4fVar.L$0;
        jzb.q(objD);
        Set set2 = (Set) objD;
        if (!set2.isEmpty()) {
            v4fVar.L$0 = set2;
            v4fVar.label = 2;
            if (afc.d(jjaVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", v4fVar) == bw2Var) {
                return bw2Var;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object b(zn2 zn2Var) throws Throwable {
        a5f a5fVar;
        s52 s52Var;
        Object value;
        int[] iArr;
        if (zn2Var instanceof a5f) {
            a5fVar = (a5f) zn2Var;
            int i = a5fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                a5fVar.label = i - Integer.MIN_VALUE;
            } else {
                a5fVar = new a5f(this, zn2Var);
            }
        } else {
            a5fVar = new a5f(this, zn2Var);
        }
        Object objR = a5fVar.result;
        int i2 = a5fVar.label;
        if (i2 == 0) {
            jzb.q(objR);
            w5c w5cVar = this.a;
            s52 s52Var2 = w5cVar.g;
            boolean zA = s52Var2.a();
            xu4 xu4Var = xu4.a;
            if (!zA) {
                return xu4Var;
            }
            try {
                if (!this.j.compareAndSet(true, false)) {
                    s52Var2.b();
                    return xu4Var;
                }
                if (!((Boolean) this.k.invoke()).booleanValue()) {
                    s52Var2.b();
                    return xu4Var;
                }
                c5f c5fVar = new c5f(this, null);
                a5fVar.L$0 = s52Var2;
                a5fVar.label = 1;
                objR = w5cVar.r(false, c5fVar, a5fVar);
                bw2 bw2Var = bw2.a;
                if (objR == bw2Var) {
                    return bw2Var;
                }
                s52Var = s52Var2;
            } catch (Throwable th) {
                th = th;
                s52Var = s52Var2;
                s52Var.b();
                throw th;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s52Var = (s52) a5fVar.L$0;
            try {
                jzb.q(objR);
            } catch (Throwable th2) {
                th = th2;
                s52Var.b();
                throw th;
            }
        }
        Set set = (Set) objR;
        if (!set.isEmpty()) {
            yk9 yk9Var = this.i;
            set.getClass();
            if (!set.isEmpty()) {
                s0e s0eVar = yk9Var.a;
                do {
                    value = s0eVar.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                    }
                } while (!s0eVar.l(value, iArr));
            }
            this.e.d(set);
        }
        s52Var.b();
        return set;
    }

    public final void c(x16 x16Var, x16 x16Var2) {
        x16Var.getClass();
        x16Var2.getClass();
        if (this.j.compareAndSet(false, true)) {
            x16Var.invoke();
            qn2 qn2Var = this.a.a;
            if (qn2Var != null) {
                ynb.V(qn2Var, new wv2("Room Invalidation Tracker Refresh"), null, new d5f(this, x16Var2, null), 2);
            } else {
                pa7.g0("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (defpackage.afc.d(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        if (defpackage.afc.d(r11, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00df, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00dd -> B:28:0x00e0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.l2f r18, int r19, defpackage.zn2 r20) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5f.d(l2f, int, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0084 -> B:19:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(defpackage.l2f r8, int r9, defpackage.zn2 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.f5f
            if (r0 == 0) goto L13
            r0 = r10
            f5f r0 = (defpackage.f5f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            f5f r0 = new f5f
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L37
            int r7 = r0.I$1
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$2
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r0.L$0
            jja r3 = (defpackage.jja) r3
            defpackage.jzb.q(r10)
            r10 = r9
            r9 = r3
            goto L87
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            r7 = 0
            return r7
        L3e:
            defpackage.jzb.q(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.j5f.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L50:
            if (r8 >= r7) goto L89
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = defpackage.ks0.g(r5, r4, r3)
            r0.L$0 = r9
            r0.L$1 = r1
            r0.L$2 = r10
            r0.I$0 = r8
            r0.I$1 = r7
            r0.label = r2
            java.lang.Object r3 = defpackage.afc.d(r9, r3, r0)
            bw2 r4 = defpackage.bw2.a
            if (r3 != r4) goto L87
            return r4
        L87:
            int r8 = r8 + r2
            goto L50
        L89:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5f.e(l2f, int, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(zn2 zn2Var) {
        g5f g5fVar;
        s52 s52Var;
        if (zn2Var instanceof g5f) {
            g5fVar = (g5f) zn2Var;
            int i = g5fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                g5fVar.label = i - Integer.MIN_VALUE;
            } else {
                g5fVar = new g5f(this, zn2Var);
            }
        } else {
            g5fVar = new g5f(this, zn2Var);
        }
        Object obj = g5fVar.result;
        int i2 = g5fVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            w5c w5cVar = this.a;
            s52 s52Var2 = w5cVar.g;
            if (s52Var2.a()) {
                try {
                    i5f i5fVar = new i5f(this, null);
                    g5fVar.L$0 = s52Var2;
                    g5fVar.label = 1;
                    Object objR = w5cVar.r(false, i5fVar, g5fVar);
                    bw2 bw2Var = bw2.a;
                    if (objR == bw2Var) {
                        return bw2Var;
                    }
                    s52Var = s52Var2;
                    s52Var.b();
                } catch (Throwable th) {
                    th = th;
                    s52Var = s52Var2;
                    s52Var.b();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s52Var = (s52) g5fVar.L$0;
            try {
                jzb.q(obj);
                s52Var.b();
            } catch (Throwable th2) {
                th = th2;
                s52Var.b();
                throw th;
            }
        }
        return wef.a;
    }

    public final iy9 g(String[] strArr) {
        o1d o1dVar = new o1d();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) this.c.get(lowerCase);
            if (set != null) {
                o1dVar.addAll(set);
            } else {
                o1dVar.add(str);
            }
        }
        String[] strArr2 = (String[]) o1dVar.d().toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) this.f.get(lowerCase2);
            if (num == null) {
                qc0.j("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new iy9(strArr2, iArr);
    }
}
