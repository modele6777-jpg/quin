package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bza extends u56 implements wt8 {
    public static final bza a;
    public static final gl7 b = new gl7(14);
    private List<bza> andArgument_;
    private int bitField0_;
    private aza constantValue_;
    private int flags_;
    private int isInstanceTypeId_;
    private vza isInstanceType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<bza> orArgument_;
    private final z61 unknownFields;
    private int valueParameterReference_;

    static {
        bza bzaVar = new bza();
        a = bzaVar;
        bzaVar.flags_ = 0;
        bzaVar.valueParameterReference_ = 0;
        bzaVar.constantValue_ = aza.TRUE;
        bzaVar.isInstanceType_ = vza.a;
        bzaVar.isInstanceTypeId_ = 0;
        List<bza> list = Collections.EMPTY_LIST;
        bzaVar.andArgument_ = list;
        bzaVar.orArgument_ = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public bza(g72 g72Var, o85 o85Var) {
        aza azaVar;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.flags_ = 0;
        this.valueParameterReference_ = 0;
        aza azaVar2 = aza.TRUE;
        this.constantValue_ = azaVar2;
        this.isInstanceType_ = vza.a;
        this.isInstanceTypeId_ = 0;
        List<bza> list = Collections.EMPTY_LIST;
        this.andArgument_ = list;
        this.orArgument_ = list;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = g72Var.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = g72Var.k();
                            } else if (iN != 16) {
                                Object objR0 = null;
                                if (iN == 24) {
                                    int iK = g72Var.k();
                                    if (iK != 0) {
                                        if (iK == 1) {
                                            objR0 = aza.FALSE;
                                        } else if (iK == 2) {
                                            objR0 = aza.NULL;
                                        }
                                        azaVar = objR0;
                                    } else {
                                        azaVar = azaVar2;
                                    }
                                    if (azaVar == 0) {
                                        p90VarK.q0(iN);
                                        p90VarK.q0(iK);
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.constantValue_ = azaVar;
                                    }
                                } else if (iN == 34) {
                                    if ((this.bitField0_ & 8) == 8) {
                                        vza vzaVar = this.isInstanceType_;
                                        vzaVar.getClass();
                                        objR0 = vza.r0(vzaVar);
                                    }
                                    uza uzaVar = objR0;
                                    vza vzaVar2 = (vza) g72Var.g(vza.b, o85Var);
                                    this.isInstanceType_ = vzaVar2;
                                    if (uzaVar != 0) {
                                        uzaVar.m(vzaVar2);
                                        this.isInstanceType_ = uzaVar.k();
                                    }
                                    this.bitField0_ |= 8;
                                } else if (iN != 40) {
                                    gl7 gl7Var = b;
                                    if (iN == 50) {
                                        if ((i & 32) != 32) {
                                            this.andArgument_ = new ArrayList();
                                            i |= 32;
                                        }
                                        this.andArgument_.add((bza) g72Var.g(gl7Var, o85Var));
                                    } else if (iN == 58) {
                                        if ((i & 64) != 64) {
                                            this.orArgument_ = new ArrayList();
                                            i |= 64;
                                        }
                                        this.orArgument_.add((bza) g72Var.g(gl7Var, o85Var));
                                    } else if (!g72Var.q(iN, p90VarK)) {
                                    }
                                } else {
                                    this.bitField0_ |= 16;
                                    this.isInstanceTypeId_ = g72Var.k();
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.valueParameterReference_ = g72Var.k();
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
                if ((i & 32) == 32) {
                    this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                }
                if ((i & 64) == 64) {
                    this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                }
                try {
                    p90VarK.b0();
                } catch (IOException unused) {
                } finally {
                    this.unknownFields = x61Var.l();
                }
                throw th;
            }
        }
        if ((i & 32) == 32) {
            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
        }
        if ((i & 64) == 64) {
            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
    }

    public final List A() {
        return this.orArgument_;
    }

    public final int B() {
        return this.valueParameterReference_;
    }

    public final boolean C() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean D() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean E() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean F() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean G() {
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
        if (E() && !this.isInstanceType_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.andArgument_.size(); i++) {
            if (!this.andArgument_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
            if (!this.orArgument_.get(i2).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        zya zyaVarK = zya.k();
        zyaVarK.l(this);
        return zyaVarK;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.h0(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            p90Var.g0(3, this.constantValue_.a());
        }
        if ((this.bitField0_ & 8) == 8) {
            p90Var.j0(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            p90Var.h0(5, this.isInstanceTypeId_);
        }
        for (int i = 0; i < this.andArgument_.size(); i++) {
            p90Var.j0(6, this.andArgument_.get(i));
        }
        for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
            p90Var.j0(7, this.orArgument_.get(i2));
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 1) == 1 ? p90.o(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iO += p90.o(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iO += p90.n(3, this.constantValue_.a());
        }
        if ((this.bitField0_ & 8) == 8) {
            iO += p90.q(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iO += p90.o(5, this.isInstanceTypeId_);
        }
        for (int i2 = 0; i2 < this.andArgument_.size(); i2++) {
            iO += p90.q(6, this.andArgument_.get(i2));
        }
        for (int i3 = 0; i3 < this.orArgument_.size(); i3++) {
            iO += p90.q(7, this.orArgument_.get(i3));
        }
        int size = this.unknownFields.size() + iO;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return zya.k();
    }

    public final List u() {
        return this.andArgument_;
    }

    public final aza v() {
        return this.constantValue_;
    }

    public final int w() {
        return this.flags_;
    }

    public final vza x() {
        return this.isInstanceType_;
    }

    public final int z() {
        return this.isInstanceTypeId_;
    }

    public bza() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public bza(zya zyaVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = zyaVar.a;
    }
}
