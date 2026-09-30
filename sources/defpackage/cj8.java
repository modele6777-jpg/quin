package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cj8 extends gbe implements l26 {
    final /* synthetic */ boolean $cancelPreviousTask$inlined;
    final /* synthetic */ boolean $lowLightBoost$inlined;
    final /* synthetic */ ya2 $signal$inlined;
    int label;
    final /* synthetic */ dj8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj8(xn2 xn2Var, dj8 dj8Var, ya2 ya2Var, boolean z, boolean z2) {
        super(2, xn2Var);
        this.this$0 = dj8Var;
        this.$signal$inlined = ya2Var;
        this.$lowLightBoost$inlined = z;
        this.$cancelPreviousTask$inlined = z2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new cj8(xn2Var, this.this$0, this.$signal$inlined, this.$lowLightBoost$inlined, this.$cancelPreviousTask$inlined);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        boolean zBooleanValue;
        dj8 dj8Var;
        boolean z;
        dj8 dj8Var2;
        boolean z2;
        dj8 dj8Var3;
        ya2 ya2Var;
        n0e n0eVar;
        Integer num;
        ya2 ya2Var2;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            nu3 nu3Var = this.this$0.i;
            if (nu3Var != null) {
                this.label = 1;
                obj = nu3Var.H0(this);
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                zBooleanValue = false;
            }
            dj8Var = this.this$0;
            if (zBooleanValue) {
                dj8Var.c(dj8Var.f, -1);
                dj8 dj8Var4 = this.this$0;
                ya2 ya2Var3 = this.$signal$inlined;
                IllegalStateException illegalStateException = new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30.");
                dj8Var4.getClass();
                ((za2) ya2Var3).i0(illegalStateException);
            } else {
                z = this.$lowLightBoost$inlined;
                dj8Var.e = z;
                if (!z) {
                    dj8Var.c(dj8Var.f, -1);
                }
                dj8Var2 = this.this$0;
                if (dj8Var2.c != null) {
                    if (this.$lowLightBoost$inlined) {
                        dj8Var2.c(dj8Var2.f, 0);
                    }
                    z2 = this.$cancelPreviousTask$inlined;
                    dj8Var3 = this.this$0;
                    if (z2) {
                        ya2Var2 = dj8Var3.h;
                        if (ya2Var2 != null) {
                            ((za2) ya2Var2).i0(new ye1("There is a new enableLowLightBoost being set"));
                        }
                        dj8Var3.h = null;
                    } else {
                        ya2Var = dj8Var3.h;
                        if (ya2Var != null) {
                            lmg.o0(this.$signal$inlined, ya2Var);
                        }
                    }
                    dj8 dj8Var5 = this.this$0;
                    dj8Var5.h = this.$signal$inlined;
                    n0eVar = dj8Var5.a;
                    num = this.$lowLightBoost$inlined ? new Integer(6) : null;
                    synchronized (n0eVar.d) {
                        n0eVar.k = num;
                    }
                    lmg.o0(n0eVar.f(), this.$signal$inlined);
                    dg7 dg7Var = this.$signal$inlined;
                    ((rg7) dg7Var).E(new d5(24, dg7Var, this.this$0));
                } else {
                    ((za2) this.$signal$inlined).i0(new ye1("Camera is not active."));
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        zBooleanValue = ((Boolean) obj).booleanValue();
        dj8Var = this.this$0;
        if (zBooleanValue) {
            dj8Var.c(dj8Var.f, -1);
            dj8 dj8Var6 = this.this$0;
            ya2 ya2Var4 = this.$signal$inlined;
            IllegalStateException illegalStateException2 = new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30.");
            dj8Var6.getClass();
            ((za2) ya2Var4).i0(illegalStateException2);
        } else {
            z = this.$lowLightBoost$inlined;
            dj8Var.e = z;
            if (!z) {
                dj8Var.c(dj8Var.f, -1);
            }
            dj8Var2 = this.this$0;
            if (dj8Var2.c != null) {
                if (this.$lowLightBoost$inlined) {
                    dj8Var2.c(dj8Var2.f, 0);
                }
                z2 = this.$cancelPreviousTask$inlined;
                dj8Var3 = this.this$0;
                if (z2) {
                    ya2Var2 = dj8Var3.h;
                    if (ya2Var2 != null) {
                        ((za2) ya2Var2).i0(new ye1("There is a new enableLowLightBoost being set"));
                    }
                    dj8Var3.h = null;
                } else {
                    ya2Var = dj8Var3.h;
                    if (ya2Var != null) {
                        lmg.o0(this.$signal$inlined, ya2Var);
                    }
                }
                dj8 dj8Var7 = this.this$0;
                dj8Var7.h = this.$signal$inlined;
                n0eVar = dj8Var7.a;
                if (this.$lowLightBoost$inlined) {
                }
                synchronized (n0eVar.d) {
                    n0eVar.k = num;
                    lmg.o0(n0eVar.f(), this.$signal$inlined);
                    dg7 dg7Var2 = this.$signal$inlined;
                    ((rg7) dg7Var2).E(new d5(24, dg7Var2, this.this$0));
                }
            } else {
                ((za2) this.$signal$inlined).i0(new ye1("Camera is not active."));
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cj8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
