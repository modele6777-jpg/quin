package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0b extends u56 implements wt8 {
    public static final h0b a;
    public static final gl7 b = new gl7(28);
    private int bitField0_;
    private int errorCode_;
    private f0b level_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int message_;
    private final z61 unknownFields;
    private int versionFull_;
    private g0b versionKind_;
    private int version_;

    static {
        h0b h0bVar = new h0b();
        a = h0bVar;
        h0bVar.version_ = 0;
        h0bVar.versionFull_ = 0;
        h0bVar.level_ = f0b.ERROR;
        h0bVar.errorCode_ = 0;
        h0bVar.message_ = 0;
        h0bVar.versionKind_ = g0b.LANGUAGE_VERSION;
    }

    public h0b(g72 g72Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.version_ = 0;
        this.versionFull_ = 0;
        f0b f0bVar = f0b.ERROR;
        this.level_ = f0bVar;
        this.errorCode_ = 0;
        this.message_ = 0;
        g0b g0bVar = g0b.LANGUAGE_VERSION;
        this.versionKind_ = g0bVar;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.bitField0_ |= 1;
                            this.version_ = g72Var.k();
                        } else if (iN != 16) {
                            g0b g0bVar2 = null;
                            f0b f0bVar2 = null;
                            if (iN == 24) {
                                int iK = g72Var.k();
                                if (iK == 0) {
                                    f0bVar2 = f0b.WARNING;
                                } else if (iK == 1) {
                                    f0bVar2 = f0bVar;
                                } else if (iK == 2) {
                                    f0bVar2 = f0b.HIDDEN;
                                }
                                if (f0bVar2 == null) {
                                    p90VarK.q0(iN);
                                    p90VarK.q0(iK);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.level_ = f0bVar2;
                                }
                            } else if (iN == 32) {
                                this.bitField0_ |= 8;
                                this.errorCode_ = g72Var.k();
                            } else if (iN == 40) {
                                this.bitField0_ |= 16;
                                this.message_ = g72Var.k();
                            } else if (iN == 48) {
                                int iK2 = g72Var.k();
                                if (iK2 == 0) {
                                    g0bVar2 = g0bVar;
                                } else if (iK2 == 1) {
                                    g0bVar2 = g0b.COMPILER_VERSION;
                                } else if (iK2 == 2) {
                                    g0bVar2 = g0b.API_VERSION;
                                }
                                if (g0bVar2 == null) {
                                    p90VarK.q0(iN);
                                    p90VarK.q0(iK2);
                                } else {
                                    this.bitField0_ |= 32;
                                    this.versionKind_ = g0bVar2;
                                }
                            } else if (!g72Var.q(iN, p90VarK)) {
                            }
                        } else {
                            this.bitField0_ |= 2;
                            this.versionFull_ = g72Var.k();
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
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean B() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean C() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean D() {
        return (this.bitField0_ & 32) == 32;
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
        e0b e0bVar = new e0b();
        e0bVar.e = f0b.ERROR;
        e0bVar.v = g0b.LANGUAGE_VERSION;
        e0bVar.k(this);
        return e0bVar;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.h0(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            p90Var.g0(3, this.level_.a());
        }
        if ((this.bitField0_ & 8) == 8) {
            p90Var.h0(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            p90Var.h0(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            p90Var.g0(6, this.versionKind_.a());
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 1) == 1 ? p90.o(1, this.version_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iO += p90.o(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iO += p90.n(3, this.level_.a());
        }
        if ((this.bitField0_ & 8) == 8) {
            iO += p90.o(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iO += p90.o(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iO += p90.n(6, this.versionKind_.a());
        }
        int size = this.unknownFields.size() + iO;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        e0b e0bVar = new e0b();
        e0bVar.e = f0b.ERROR;
        e0bVar.v = g0b.LANGUAGE_VERSION;
        return e0bVar;
    }

    public final int r() {
        return this.errorCode_;
    }

    public final f0b s() {
        return this.level_;
    }

    public final int t() {
        return this.message_;
    }

    public final int u() {
        return this.version_;
    }

    public final int v() {
        return this.versionFull_;
    }

    public final g0b w() {
        return this.versionKind_;
    }

    public final boolean x() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean z() {
        return (this.bitField0_ & 4) == 4;
    }

    public h0b() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public h0b(e0b e0bVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = e0bVar.a;
    }
}
