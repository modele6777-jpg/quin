package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vza extends q56 {
    public static final vza a;
    public static final gl7 b = new gl7(22);
    private int abbreviatedTypeId_;
    private vza abbreviatedType_;
    private List<kya> annotation_;
    private List<tza> argument_;
    private int bitField0_;
    private int className_;
    private int flags_;
    private int flexibleTypeCapabilitiesId_;
    private int flexibleUpperBoundId_;
    private vza flexibleUpperBound_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private boolean nullable_;
    private int outerTypeId_;
    private vza outerType_;
    private int typeAliasName_;
    private int typeParameterName_;
    private int typeParameter_;
    private final z61 unknownFields;

    static {
        vza vzaVar = new vza();
        a = vzaVar;
        vzaVar.q0();
    }

    public vza(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        q0();
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    gl7 gl7Var = b;
                    uza uzaVarR0 = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.bitField0_ |= 4096;
                            this.flags_ = g72Var.k();
                            continue;
                        case 18:
                            if ((i & 1) != 1) {
                                this.argument_ = new ArrayList();
                                i |= 1;
                            }
                            this.argument_.add((tza) g72Var.g(tza.b, o85Var));
                            continue;
                        case 24:
                            this.bitField0_ |= 1;
                            this.nullable_ = g72Var.l() != 0;
                            continue;
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                            this.bitField0_ |= 2;
                            this.flexibleTypeCapabilitiesId_ = g72Var.k();
                            continue;
                        case 42:
                            if ((this.bitField0_ & 4) == 4) {
                                vza vzaVar = this.flexibleUpperBound_;
                                vzaVar.getClass();
                                uzaVarR0 = r0(vzaVar);
                            }
                            vza vzaVar2 = (vza) g72Var.g(gl7Var, o85Var);
                            this.flexibleUpperBound_ = vzaVar2;
                            if (uzaVarR0 != null) {
                                uzaVarR0.m(vzaVar2);
                                this.flexibleUpperBound_ = uzaVarR0.k();
                            }
                            this.bitField0_ |= 4;
                            continue;
                        case z7c.f /* 48 */:
                            this.bitField0_ |= 16;
                            this.className_ = g72Var.k();
                            continue;
                        case 56:
                            this.bitField0_ |= 32;
                            this.typeParameter_ = g72Var.k();
                            continue;
                        case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                            this.bitField0_ |= 8;
                            this.flexibleUpperBoundId_ = g72Var.k();
                            continue;
                        case 72:
                            this.bitField0_ |= 64;
                            this.typeParameterName_ = g72Var.k();
                            continue;
                        case 82:
                            if ((this.bitField0_ & 256) == 256) {
                                vza vzaVar3 = this.outerType_;
                                vzaVar3.getClass();
                                uzaVarR0 = r0(vzaVar3);
                            }
                            vza vzaVar4 = (vza) g72Var.g(gl7Var, o85Var);
                            this.outerType_ = vzaVar4;
                            if (uzaVarR0 != null) {
                                uzaVarR0.m(vzaVar4);
                                this.outerType_ = uzaVarR0.k();
                            }
                            this.bitField0_ |= 256;
                            continue;
                        case 88:
                            this.bitField0_ |= 512;
                            this.outerTypeId_ = g72Var.k();
                            continue;
                        case 96:
                            this.bitField0_ |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            this.typeAliasName_ = g72Var.k();
                            continue;
                        case 106:
                            if ((this.bitField0_ & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                                vza vzaVar5 = this.abbreviatedType_;
                                vzaVar5.getClass();
                                uzaVarR0 = r0(vzaVar5);
                            }
                            vza vzaVar6 = (vza) g72Var.g(gl7Var, o85Var);
                            this.abbreviatedType_ = vzaVar6;
                            if (uzaVarR0 != null) {
                                uzaVarR0.m(vzaVar6);
                                this.abbreviatedType_ = uzaVarR0.k();
                            }
                            this.bitField0_ |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                            continue;
                        case 112:
                            this.bitField0_ |= 2048;
                            this.abbreviatedTypeId_ = g72Var.k();
                            continue;
                        case 802:
                            if ((i & 16384) != 16384) {
                                this.annotation_ = new ArrayList();
                                i |= 16384;
                            }
                            this.annotation_.add((kya) g72Var.g(kya.b, o85Var));
                            continue;
                        default:
                            if (!r(g72Var, p90VarK, o85Var, iN)) {
                                break;
                            }
                            break;
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
                if ((i & 1) == 1) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
                }
                if ((i & 16384) == 16384) {
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
        if ((i & 1) == 1) {
            this.argument_ = Collections.unmodifiableList(this.argument_);
        }
        if ((i & 16384) == 16384) {
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

    public static uza r0(vza vzaVar) {
        uza uzaVarL = uza.l();
        uzaVarL.m(vzaVar);
        return uzaVarL;
    }

    public final vza N() {
        return this.abbreviatedType_;
    }

    public final int O() {
        return this.abbreviatedTypeId_;
    }

    public final List P() {
        return this.annotation_;
    }

    public final int Q() {
        return this.argument_.size();
    }

    public final List R() {
        return this.argument_;
    }

    public final int S() {
        return this.className_;
    }

    public final int T() {
        return this.flags_;
    }

    public final int U() {
        return this.flexibleTypeCapabilitiesId_;
    }

    public final vza V() {
        return this.flexibleUpperBound_;
    }

    public final int W() {
        return this.flexibleUpperBoundId_;
    }

    public final boolean X() {
        return this.nullable_;
    }

    public final vza Y() {
        return this.outerType_;
    }

    public final int Z() {
        return this.outerTypeId_;
    }

    @Override // defpackage.wt8
    public final ut8 a() {
        return a;
    }

    public final int a0() {
        return this.typeAliasName_;
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
        for (int i = 0; i < this.argument_.size(); i++) {
            if (!this.argument_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (i0() && !this.flexibleUpperBound_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (l0() && !this.outerType_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (d0() && !this.abbreviatedType_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            if (!this.annotation_.get(i2).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (k()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    public final int b0() {
        return this.typeParameter_;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        return r0(this);
    }

    public final int c0() {
        return this.typeParameterName_;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        fz3 fz3Var = new fz3(this);
        if ((this.bitField0_ & 4096) == 4096) {
            p90Var.h0(1, this.flags_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            p90Var.j0(2, this.argument_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            boolean z = this.nullable_;
            p90Var.s0(3, 0);
            p90Var.l0(z ? 1 : 0);
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.h0(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            p90Var.j0(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            p90Var.h0(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            p90Var.h0(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            p90Var.h0(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            p90Var.h0(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            p90Var.j0(10, this.outerType_);
        }
        if ((this.bitField0_ & 512) == 512) {
            p90Var.h0(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            p90Var.h0(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
            p90Var.j0(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            p90Var.h0(14, this.abbreviatedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            p90Var.j0(100, this.annotation_.get(i2));
        }
        fz3Var.y(200, p90Var);
        p90Var.m0(this.unknownFields);
    }

    public final boolean d0() {
        return (this.bitField0_ & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024;
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 4096) == 4096 ? p90.o(1, this.flags_) : 0;
        for (int i2 = 0; i2 < this.argument_.size(); i2++) {
            iO += p90.q(2, this.argument_.get(i2));
        }
        if ((this.bitField0_ & 1) == 1) {
            iO += p90.u(3) + 1;
        }
        if ((this.bitField0_ & 2) == 2) {
            iO += p90.o(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iO += p90.q(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iO += p90.o(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iO += p90.o(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iO += p90.o(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iO += p90.o(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            iO += p90.q(10, this.outerType_);
        }
        if ((this.bitField0_ & 512) == 512) {
            iO += p90.o(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            iO += p90.o(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
            iO += p90.q(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            iO += p90.o(14, this.abbreviatedTypeId_);
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            iO += p90.q(100, this.annotation_.get(i3));
        }
        int size = this.unknownFields.size() + l() + iO;
        this.memoizedSerializedSize = size;
        return size;
    }

    public final boolean e0() {
        return (this.bitField0_ & 2048) == 2048;
    }

    public final boolean f0() {
        return (this.bitField0_ & 16) == 16;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return uza.l();
    }

    public final boolean g0() {
        return (this.bitField0_ & 4096) == 4096;
    }

    public final boolean h0() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean i0() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean j0() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean k0() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean l0() {
        return (this.bitField0_ & 256) == 256;
    }

    public final boolean m0() {
        return (this.bitField0_ & 512) == 512;
    }

    public final boolean n0() {
        return (this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128;
    }

    public final boolean o0() {
        return (this.bitField0_ & 32) == 32;
    }

    public final boolean p0() {
        return (this.bitField0_ & 64) == 64;
    }

    public final void q0() {
        List list = Collections.EMPTY_LIST;
        this.argument_ = list;
        this.nullable_ = false;
        this.flexibleTypeCapabilitiesId_ = 0;
        vza vzaVar = a;
        this.flexibleUpperBound_ = vzaVar;
        this.flexibleUpperBoundId_ = 0;
        this.className_ = 0;
        this.typeParameter_ = 0;
        this.typeParameterName_ = 0;
        this.typeAliasName_ = 0;
        this.outerType_ = vzaVar;
        this.outerTypeId_ = 0;
        this.abbreviatedType_ = vzaVar;
        this.abbreviatedTypeId_ = 0;
        this.flags_ = 0;
        this.annotation_ = list;
    }

    public vza() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public vza(uza uzaVar) {
        super(uzaVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = uzaVar.a;
    }
}
