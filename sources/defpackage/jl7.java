package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jl7 extends u56 implements wt8 {
    public static final jl7 a;
    public static final gl7 b = new gl7(1);
    private int bitField0_;
    private int desc_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private final z61 unknownFields;

    static {
        jl7 jl7Var = new jl7();
        a = jl7Var;
        jl7Var.name_ = 0;
        jl7Var.desc_ = 0;
    }

    public jl7(g72 g72Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.name_ = 0;
        this.desc_ = 0;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.bitField0_ |= 1;
                            this.name_ = g72Var.k();
                        } else if (iN == 16) {
                            this.bitField0_ |= 2;
                            this.desc_ = g72Var.k();
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

    public static hl7 r(jl7 jl7Var) {
        hl7 hl7Var = new hl7(1);
        hl7Var.m(jl7Var);
        return hl7Var;
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
        return r(this);
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(1, this.name_);
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.h0(2, this.desc_);
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 1) == 1 ? p90.o(1, this.name_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iO += p90.o(2, this.desc_);
        }
        int size = this.unknownFields.size() + iO;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return new hl7(1);
    }

    public final int n() {
        return this.desc_;
    }

    public final int o() {
        return this.name_;
    }

    public final boolean p() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) == 1;
    }

    public jl7() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public jl7(hl7 hl7Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = hl7Var.a;
    }
}
