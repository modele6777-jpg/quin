package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w13 extends gbe implements l26 {
    final /* synthetic */ a26 $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ w5c $this_internalPerform;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w13(xn2 xn2Var, a26 a26Var, w5c w5cVar, boolean z, boolean z2) {
        super(2, xn2Var);
        this.$inTransaction = z;
        this.$isReadOnly = z2;
        this.$this_internalPerform = w5cVar;
        this.$block$inlined = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        boolean z = this.$inTransaction;
        boolean z2 = this.$isReadOnly;
        w13 w13Var = new w13(xn2Var, this.$block$inlined, this.$this_internalPerform, z, z2);
        w13Var.L$0 = obj;
        return w13Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009e A[PHI: r0 r10
  0x009e: PHI (r0v11 l2f) = (r0v8 l2f), (r0v20 l2f) binds: [B:35:0x009b, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x009e: PHI (r10v14 java.lang.Object) = (r10v13 java.lang.Object), (r10v0 java.lang.Object) binds: [B:35:0x009b, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8 A[RETURN] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        k2f k2fVar;
        l2f l2fVar;
        l2f l2fVar2;
        k2f k2fVar2;
        l2f l2fVar3;
        Boolean boolA;
        Object obj2;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            l2f l2fVar4 = (l2f) this.L$0;
            if (!this.$inTransaction) {
                l2fVar4.getClass();
                return this.$block$inlined.d(((gdb) l2fVar4).c());
            }
            boolean z = this.$isReadOnly;
            k2fVar = z ? k2f.a : k2f.b;
            if (z) {
                l2fVar = l2fVar4;
                v13 v13Var = new v13(null, this.$block$inlined);
                this.L$0 = l2fVar;
                this.L$1 = null;
                this.label = 3;
                obj = l2fVar.b(k2fVar, v13Var, this);
                if (obj != bw2Var) {
                    if (this.$isReadOnly) {
                        return obj;
                    }
                    this.L$0 = obj;
                    this.label = 4;
                    boolA = l2fVar.a(this);
                    if (boolA != bw2Var) {
                        obj2 = obj;
                        obj = boolA;
                        if (!((Boolean) obj).booleanValue()) {
                            jb7 jb7VarF = this.$this_internalPerform.f();
                            jb7VarF.b.c(jb7VarF.e, jb7VarF.f);
                        }
                        return obj2;
                    }
                }
            } else {
                this.L$0 = l2fVar4;
                this.L$1 = k2fVar;
                this.label = 1;
                Boolean boolA2 = l2fVar4.a(this);
                if (boolA2 != bw2Var) {
                    l2fVar2 = l2fVar4;
                    obj = boolA2;
                    k2fVar2 = k2fVar;
                }
            }
            return bw2Var;
        }
        if (i == 1) {
            k2fVar2 = (k2f) this.L$1;
            l2fVar2 = (l2f) this.L$0;
            jzb.q(obj);
        } else {
            if (i == 2) {
                k2fVar2 = (k2f) this.L$1;
                l2fVar3 = (l2f) this.L$0;
                jzb.q(obj);
                k2fVar = k2fVar2;
                l2fVar = l2fVar3;
                v13 v13Var2 = new v13(null, this.$block$inlined);
                this.L$0 = l2fVar;
                this.L$1 = null;
                this.label = 3;
                obj = l2fVar.b(k2fVar, v13Var2, this);
                if (obj != bw2Var) {
                    if (this.$isReadOnly) {
                        return obj;
                    }
                    this.L$0 = obj;
                    this.label = 4;
                    boolA = l2fVar.a(this);
                    if (boolA != bw2Var) {
                        obj2 = obj;
                        obj = boolA;
                    }
                }
                return bw2Var;
            }
            if (i == 3) {
                l2fVar = (l2f) this.L$0;
                jzb.q(obj);
                if (this.$isReadOnly) {
                    return obj;
                }
                this.L$0 = obj;
                this.label = 4;
                boolA = l2fVar.a(this);
                if (boolA != bw2Var) {
                    obj2 = obj;
                    obj = boolA;
                }
                return bw2Var;
            }
            if (i != 4) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$0;
            jzb.q(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            jb7 jb7VarF2 = this.$this_internalPerform.f();
            jb7VarF2.b.c(jb7VarF2.e, jb7VarF2.f);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            k2fVar = k2fVar2;
            l2fVar = l2fVar2;
            v13 v13Var3 = new v13(null, this.$block$inlined);
            this.L$0 = l2fVar;
            this.L$1 = null;
            this.label = 3;
            obj = l2fVar.b(k2fVar, v13Var3, this);
            if (obj != bw2Var) {
                if (this.$isReadOnly) {
                    return obj;
                }
                this.L$0 = obj;
                this.label = 4;
                boolA = l2fVar.a(this);
                if (boolA != bw2Var) {
                    obj2 = obj;
                    obj = boolA;
                    if (!((Boolean) obj).booleanValue()) {
                        jb7 jb7VarF3 = this.$this_internalPerform.f();
                        jb7VarF3.b.c(jb7VarF3.e, jb7VarF3.f);
                    }
                    return obj2;
                }
            }
        } else {
            jb7 jb7VarF4 = this.$this_internalPerform.f();
            this.L$0 = l2fVar2;
            this.L$1 = k2fVar2;
            this.label = 2;
            if (jb7VarF4.a(this) != bw2Var) {
                l2fVar3 = l2fVar2;
                k2fVar = k2fVar2;
                l2fVar = l2fVar3;
                v13 v13Var4 = new v13(null, this.$block$inlined);
                this.L$0 = l2fVar;
                this.L$1 = null;
                this.label = 3;
                obj = l2fVar.b(k2fVar, v13Var4, this);
                if (obj != bw2Var) {
                    if (this.$isReadOnly) {
                        return obj;
                    }
                    this.L$0 = obj;
                    this.label = 4;
                    boolA = l2fVar.a(this);
                    if (boolA != bw2Var) {
                        obj2 = obj;
                        obj = boolA;
                        if (!((Boolean) obj).booleanValue()) {
                            jb7 jb7VarF5 = this.$this_internalPerform.f();
                            jb7VarF5.b.c(jb7VarF5.e, jb7VarF5.f);
                        }
                        return obj2;
                    }
                }
            }
        }
        return bw2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((w13) k((xn2) obj2, (l2f) obj)).r(wef.a);
    }
}
