package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oya extends u56 implements wt8 {
    public static final oya a;
    public static final gl7 b = new gl7(9);
    private int bitField0_;
    private z61 data_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int pluginId_;
    private final z61 unknownFields;

    static {
        oya oyaVar = new oya();
        a = oyaVar;
        oyaVar.pluginId_ = 0;
        oyaVar.data_ = z61.a;
    }

    public oya(g72 g72Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.pluginId_ = 0;
        this.data_ = z61.a;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iN = g72Var.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.bitField0_ |= 1;
                                this.pluginId_ = g72Var.k();
                            } else if (iN == 18) {
                                this.bitField0_ |= 2;
                                this.data_ = g72Var.f();
                            } else if (!g72Var.q(iN, p90VarK)) {
                            }
                        }
                        z = true;
                    } catch (ab7 e) {
                        e.b(this);
                        throw e;
                    }
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

    @Override // defpackage.wt8
    public final boolean b() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!q()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (p()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        eya eyaVar = new eya(1);
        eyaVar.e = z61.a;
        eyaVar.m(this);
        return eyaVar;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(1, this.pluginId_);
        }
        if ((this.bitField0_ & 2) == 2) {
            z61 z61Var = this.data_;
            p90Var.s0(2, 2);
            p90Var.q0(z61Var.size());
            p90Var.m0(z61Var);
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 1) == 1 ? p90.o(1, this.pluginId_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            z61 z61Var = this.data_;
            iO += z61Var.size() + p90.s(z61Var.size()) + p90.u(2);
        }
        int size = this.unknownFields.size() + iO;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        eya eyaVar = new eya(1);
        eyaVar.e = z61.a;
        return eyaVar;
    }

    public final z61 n() {
        return this.data_;
    }

    public final int o() {
        return this.pluginId_;
    }

    public final boolean p() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) == 1;
    }

    public oya() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public oya(eya eyaVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = eyaVar.a;
    }
}
