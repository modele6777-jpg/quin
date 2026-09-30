package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0b extends q56 {
    public static final d0b a;
    public static final gl7 b = new gl7(27);
    private hya annotationParameterDefaultValue_;
    private List<kya> annotation_;
    private int bitField0_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int typeId_;
    private vza type_;
    private final z61 unknownFields;
    private int varargElementTypeId_;
    private vza varargElementType_;

    static {
        d0b d0bVar = new d0b();
        a = d0bVar;
        d0bVar.flags_ = 0;
        d0bVar.name_ = 0;
        vza vzaVar = vza.a;
        d0bVar.type_ = vzaVar;
        d0bVar.typeId_ = 0;
        d0bVar.varargElementType_ = vzaVar;
        d0bVar.varargElementTypeId_ = 0;
        d0bVar.annotation_ = Collections.EMPTY_LIST;
        d0bVar.annotationParameterDefaultValue_ = hya.a;
    }

    public d0b(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.flags_ = 0;
        this.name_ = 0;
        vza vzaVar = vza.a;
        this.type_ = vzaVar;
        this.typeId_ = 0;
        this.varargElementType_ = vzaVar;
        this.varargElementTypeId_ = 0;
        this.annotation_ = Collections.EMPTY_LIST;
        this.annotationParameterDefaultValue_ = hya.a;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = g72Var.k();
                        } else if (iN != 16) {
                            fya fyaVarK = null;
                            uza uzaVarR0 = null;
                            uza uzaVarR1 = null;
                            if (iN == 26) {
                                if ((this.bitField0_ & 4) == 4) {
                                    vza vzaVar2 = this.type_;
                                    vzaVar2.getClass();
                                    uzaVarR0 = vza.r0(vzaVar2);
                                }
                                vza vzaVar3 = (vza) g72Var.g(vza.b, o85Var);
                                this.type_ = vzaVar3;
                                if (uzaVarR0 != null) {
                                    uzaVarR0.m(vzaVar3);
                                    this.type_ = uzaVarR0.k();
                                }
                                this.bitField0_ |= 4;
                            } else if (iN == 34) {
                                if ((this.bitField0_ & 16) == 16) {
                                    vza vzaVar4 = this.varargElementType_;
                                    vzaVar4.getClass();
                                    uzaVarR1 = vza.r0(vzaVar4);
                                }
                                vza vzaVar5 = (vza) g72Var.g(vza.b, o85Var);
                                this.varargElementType_ = vzaVar5;
                                if (uzaVarR1 != null) {
                                    uzaVarR1.m(vzaVar5);
                                    this.varargElementType_ = uzaVarR1.k();
                                }
                                this.bitField0_ |= 16;
                            } else if (iN == 40) {
                                this.bitField0_ |= 8;
                                this.typeId_ = g72Var.k();
                            } else if (iN == 48) {
                                this.bitField0_ |= 32;
                                this.varargElementTypeId_ = g72Var.k();
                            } else if (iN == 58) {
                                int i = (c == true ? 1 : 0) & '@';
                                c = c;
                                if (i != 64) {
                                    this.annotation_ = new ArrayList();
                                    c = '@';
                                }
                                this.annotation_.add((kya) g72Var.g(kya.b, o85Var));
                            } else if (iN == 66) {
                                if ((this.bitField0_ & 64) == 64) {
                                    hya hyaVar = this.annotationParameterDefaultValue_;
                                    hyaVar.getClass();
                                    fyaVarK = fya.k();
                                    fyaVarK.l(hyaVar);
                                }
                                hya hyaVar2 = (hya) g72Var.g(hya.b, o85Var);
                                this.annotationParameterDefaultValue_ = hyaVar2;
                                if (fyaVarK != null) {
                                    fyaVarK.l(hyaVar2);
                                    this.annotationParameterDefaultValue_ = fyaVarK.j();
                                }
                                this.bitField0_ |= 64;
                            } else if (!r(g72Var, p90VarK, o85Var, iN)) {
                            }
                        } else {
                            this.bitField0_ |= 2;
                            this.name_ = g72Var.k();
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
                if (((c == true ? 1 : 0) & '@') == 64) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                try {
                    p90VarK.b0();
                } catch (IOException unused) {
                } finally {
                    this.unknownFields = x61Var.l();
                }
                q();
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & '@') == 64) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
        q();
    }

    public final List F() {
        return this.annotation_;
    }

    public final hya G() {
        return this.annotationParameterDefaultValue_;
    }

    public final int H() {
        return this.flags_;
    }

    public final int I() {
        return this.name_;
    }

    public final vza J() {
        return this.type_;
    }

    public final int K() {
        return this.typeId_;
    }

    public final vza L() {
        return this.varargElementType_;
    }

    public final int M() {
        return this.varargElementTypeId_;
    }

    public final boolean N() {
        return (this.bitField0_ & 64) == 64;
    }

    public final boolean O() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean P() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean Q() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean R() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean S() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean T() {
        return (this.bitField0_ & 32) == 32;
    }

    @Override // defpackage.wt8
    public final ut8 a() {
        return a;
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
        if (!P()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (Q() && !this.type_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (S() && !this.varargElementType_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.annotation_.size(); i++) {
            if (!this.annotation_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (N() && !this.annotationParameterDefaultValue_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (k()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        c0b c0bVarL = c0b.l();
        c0bVarL.m(this);
        return c0bVarL;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        fz3 fz3Var = new fz3(this);
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.h0(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            p90Var.j0(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            p90Var.j0(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            p90Var.h0(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            p90Var.h0(6, this.varargElementTypeId_);
        }
        for (int i = 0; i < this.annotation_.size(); i++) {
            p90Var.j0(7, this.annotation_.get(i));
        }
        if ((this.bitField0_ & 64) == 64) {
            p90Var.j0(8, this.annotationParameterDefaultValue_);
        }
        fz3Var.y(200, p90Var);
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
            iO += p90.o(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iO += p90.q(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iO += p90.q(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iO += p90.o(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iO += p90.o(6, this.varargElementTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            iO += p90.q(7, this.annotation_.get(i2));
        }
        if ((this.bitField0_ & 64) == 64) {
            iO += p90.q(8, this.annotationParameterDefaultValue_);
        }
        int size = this.unknownFields.size() + l() + iO;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return c0b.l();
    }

    public d0b() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public d0b(c0b c0bVar) {
        super(c0bVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c0bVar.a;
    }
}
