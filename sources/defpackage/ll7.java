package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ll7 extends u56 implements wt8 {
    public static final ll7 a;
    public static final gl7 b = new gl7(2);
    private int bitField0_;
    private jl7 delegateMethod_;
    private il7 field_;
    private jl7 getter_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private jl7 setter_;
    private jl7 syntheticMethod_;
    private final z61 unknownFields;

    static {
        ll7 ll7Var = new ll7();
        a = ll7Var;
        ll7Var.field_ = il7.a;
        jl7 jl7Var = jl7.a;
        ll7Var.syntheticMethod_ = jl7Var;
        ll7Var.getter_ = jl7Var;
        ll7Var.setter_ = jl7Var;
        ll7Var.delegateMethod_ = jl7Var;
    }

    public ll7(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.field_ = il7.a;
        jl7 jl7Var = jl7.a;
        this.syntheticMethod_ = jl7Var;
        this.getter_ = jl7Var;
        this.setter_ = jl7Var;
        this.delegateMethod_ = jl7Var;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        int i = 0;
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    if (iN != 0) {
                        hl7 hl7VarR = null;
                        if (iN == 10) {
                            if ((this.bitField0_ & 1) == 1) {
                                il7 il7Var = this.field_;
                                il7Var.getClass();
                                hl7VarR = new hl7(i);
                                hl7VarR.l(il7Var);
                            }
                            il7 il7Var2 = (il7) g72Var.g(il7.b, o85Var);
                            this.field_ = il7Var2;
                            if (hl7VarR != null) {
                                hl7VarR.l(il7Var2);
                                this.field_ = hl7VarR.j();
                            }
                            this.bitField0_ |= 1;
                        } else if (iN == 18) {
                            if ((this.bitField0_ & 2) == 2) {
                                jl7 jl7Var2 = this.syntheticMethod_;
                                jl7Var2.getClass();
                                hl7VarR = jl7.r(jl7Var2);
                            }
                            jl7 jl7Var3 = (jl7) g72Var.g(jl7.b, o85Var);
                            this.syntheticMethod_ = jl7Var3;
                            if (hl7VarR != null) {
                                hl7VarR.m(jl7Var3);
                                this.syntheticMethod_ = hl7VarR.k();
                            }
                            this.bitField0_ |= 2;
                        } else if (iN == 26) {
                            if ((this.bitField0_ & 4) == 4) {
                                jl7 jl7Var4 = this.getter_;
                                jl7Var4.getClass();
                                hl7VarR = jl7.r(jl7Var4);
                            }
                            jl7 jl7Var5 = (jl7) g72Var.g(jl7.b, o85Var);
                            this.getter_ = jl7Var5;
                            if (hl7VarR != null) {
                                hl7VarR.m(jl7Var5);
                                this.getter_ = hl7VarR.k();
                            }
                            this.bitField0_ |= 4;
                        } else if (iN == 34) {
                            if ((this.bitField0_ & 8) == 8) {
                                jl7 jl7Var6 = this.setter_;
                                jl7Var6.getClass();
                                hl7VarR = jl7.r(jl7Var6);
                            }
                            jl7 jl7Var7 = (jl7) g72Var.g(jl7.b, o85Var);
                            this.setter_ = jl7Var7;
                            if (hl7VarR != null) {
                                hl7VarR.m(jl7Var7);
                                this.setter_ = hl7VarR.k();
                            }
                            this.bitField0_ |= 8;
                        } else if (iN == 42) {
                            if ((this.bitField0_ & 16) == 16) {
                                jl7 jl7Var8 = this.delegateMethod_;
                                jl7Var8.getClass();
                                hl7VarR = jl7.r(jl7Var8);
                            }
                            jl7 jl7Var9 = (jl7) g72Var.g(jl7.b, o85Var);
                            this.delegateMethod_ = jl7Var9;
                            if (hl7VarR != null) {
                                hl7VarR.m(jl7Var9);
                                this.delegateMethod_ = hl7VarR.k();
                            }
                            this.bitField0_ |= 16;
                        } else if (!g72Var.q(iN, p90VarK)) {
                        }
                    }
                    z = true;
                } catch (ab7 e) {
                    e.b(this);
                    throw e;
                } catch (IOException e2) {
                    ab7 ab7Var = new ab7(e2.getMessage());
                    ab7Var.b(this);
                    throw ab7Var;
                }
            } catch (Throwable th) {
                try {
                    p90VarK.b0();
                } catch (IOException unused) {
                } finally {
                    this.unknownFields = x61Var.l();
                }
                throw th;
            }
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
    }

    public final boolean A() {
        return (this.bitField0_ & 2) == 2;
    }

    @Override // defpackage.wt8
    public final boolean b() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        kl7 kl7VarL = kl7.l();
        kl7VarL.n(this);
        return kl7VarL;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        if ((this.bitField0_ & 1) == 1) {
            p90Var.j0(1, this.field_);
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.j0(2, this.syntheticMethod_);
        }
        if ((this.bitField0_ & 4) == 4) {
            p90Var.j0(3, this.getter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            p90Var.j0(4, this.setter_);
        }
        if ((this.bitField0_ & 16) == 16) {
            p90Var.j0(5, this.delegateMethod_);
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iQ = (this.bitField0_ & 1) == 1 ? p90.q(1, this.field_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iQ += p90.q(2, this.syntheticMethod_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iQ += p90.q(3, this.getter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iQ += p90.q(4, this.setter_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iQ += p90.q(5, this.delegateMethod_);
        }
        int size = this.unknownFields.size() + iQ;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return kl7.l();
    }

    public final jl7 q() {
        return this.delegateMethod_;
    }

    public final il7 r() {
        return this.field_;
    }

    public final jl7 s() {
        return this.getter_;
    }

    public final jl7 t() {
        return this.setter_;
    }

    public final jl7 u() {
        return this.syntheticMethod_;
    }

    public final boolean v() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean w() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean x() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean z() {
        return (this.bitField0_ & 8) == 8;
    }

    public ll7() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public ll7(kl7 kl7Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = kl7Var.a;
    }
}
