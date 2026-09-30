package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nza extends u56 implements wt8 {
    public static final nza a;
    public static final gl7 b = new gl7(20);
    private int bitField0_;
    private mza kind_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int parentQualifiedName_;
    private int shortName_;
    private final z61 unknownFields;

    static {
        nza nzaVar = new nza();
        a = nzaVar;
        nzaVar.parentQualifiedName_ = -1;
        nzaVar.shortName_ = 0;
        nzaVar.kind_ = mza.PACKAGE;
    }

    public nza(g72 g72Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.parentQualifiedName_ = -1;
        boolean z = false;
        this.shortName_ = 0;
        mza mzaVar = mza.PACKAGE;
        this.kind_ = mzaVar;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.bitField0_ |= 1;
                            this.parentQualifiedName_ = g72Var.k();
                        } else if (iN == 16) {
                            this.bitField0_ |= 2;
                            this.shortName_ = g72Var.k();
                        } else if (iN == 24) {
                            int iK = g72Var.k();
                            mza mzaVar2 = iK != 0 ? iK != 1 ? iK != 2 ? null : mza.LOCAL : mzaVar : mza.CLASS;
                            if (mzaVar2 == null) {
                                p90VarK.q0(iN);
                                p90VarK.q0(iK);
                            } else {
                                this.bitField0_ |= 4;
                                this.kind_ = mzaVar2;
                            }
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

    @Override // defpackage.wt8
    public final boolean b() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (t()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        lza lzaVar = new lza();
        lzaVar.c = -1;
        lzaVar.e = mza.PACKAGE;
        lzaVar.k(this);
        return lzaVar;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(1, this.parentQualifiedName_);
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.h0(2, this.shortName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            p90Var.g0(3, this.kind_.a());
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 1) == 1 ? p90.o(1, this.parentQualifiedName_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iO += p90.o(2, this.shortName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iO += p90.n(3, this.kind_.a());
        }
        int size = this.unknownFields.size() + iO;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        lza lzaVar = new lza();
        lzaVar.c = -1;
        lzaVar.e = mza.PACKAGE;
        return lzaVar;
    }

    public final mza o() {
        return this.kind_;
    }

    public final int p() {
        return this.parentQualifiedName_;
    }

    public final int q() {
        return this.shortName_;
    }

    public final boolean r() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) == 2;
    }

    public nza() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public nza(lza lzaVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = lzaVar.a;
    }
}
