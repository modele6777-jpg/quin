package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hya extends u56 implements wt8 {
    public static final hya a;
    public static final gl7 b = new gl7(7);
    private kya annotation_;
    private int arrayDimensionCount_;
    private List<hya> arrayElement_;
    private int bitField0_;
    private int classId_;
    private double doubleValue_;
    private int enumValueId_;
    private int flags_;
    private float floatValue_;
    private long intValue_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int stringValue_;
    private gya type_;
    private final z61 unknownFields;

    static {
        hya hyaVar = new hya();
        a = hyaVar;
        hyaVar.U();
    }

    public hya(g72 g72Var, o85 o85Var) {
        jya jyaVar;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        U();
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        int i = 0;
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            int iK = g72Var.k();
                            gya gyaVarB = gya.b(iK);
                            if (gyaVarB == null) {
                                p90VarK.q0(iN);
                                p90VarK.q0(iK);
                            } else {
                                this.bitField0_ |= 1;
                                this.type_ = gyaVarB;
                                continue;
                            }
                            break;
                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                            this.bitField0_ |= 2;
                            long jL = g72Var.l();
                            this.intValue_ = (-(jL & 1)) ^ (jL >>> 1);
                            continue;
                        case 29:
                            this.bitField0_ |= 4;
                            this.floatValue_ = Float.intBitsToFloat(g72Var.i());
                            continue;
                        case 33:
                            this.bitField0_ |= 8;
                            this.doubleValue_ = Double.longBitsToDouble(g72Var.j());
                            continue;
                        case 40:
                            this.bitField0_ |= 16;
                            this.stringValue_ = g72Var.k();
                            continue;
                        case z7c.f /* 48 */:
                            this.bitField0_ |= 32;
                            this.classId_ = g72Var.k();
                            continue;
                        case 56:
                            this.bitField0_ |= 64;
                            this.enumValueId_ = g72Var.k();
                            continue;
                        case 66:
                            if ((this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                                kya kyaVar = this.annotation_;
                                kyaVar.getClass();
                                jyaVar = new jya(i);
                                jyaVar.d = Collections.EMPTY_LIST;
                                jyaVar.l(kyaVar);
                            } else {
                                jyaVar = null;
                            }
                            kya kyaVar2 = (kya) g72Var.g(kya.b, o85Var);
                            this.annotation_ = kyaVar2;
                            if (jyaVar != null) {
                                jyaVar.l(kyaVar2);
                                this.annotation_ = jyaVar.j();
                            }
                            this.bitField0_ |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            continue;
                        case 74:
                            if ((c & 256) != 256) {
                                this.arrayElement_ = new ArrayList();
                                c = 256;
                            }
                            this.arrayElement_.add((hya) g72Var.g(b, o85Var));
                            continue;
                        case 80:
                            this.bitField0_ |= 512;
                            this.flags_ = g72Var.k();
                            continue;
                        case 88:
                            this.bitField0_ |= 256;
                            this.arrayDimensionCount_ = g72Var.k();
                            continue;
                        default:
                            if (!g72Var.q(iN, p90VarK)) {
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
                if ((c & 256) == 256) {
                    this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
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
        if ((c & 256) == 256) {
            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
    }

    public final hya A(int i) {
        return this.arrayElement_.get(i);
    }

    public final List B() {
        return this.arrayElement_;
    }

    public final int C() {
        return this.classId_;
    }

    public final double D() {
        return this.doubleValue_;
    }

    public final int E() {
        return this.enumValueId_;
    }

    public final int F() {
        return this.flags_;
    }

    public final float G() {
        return this.floatValue_;
    }

    public final long H() {
        return this.intValue_;
    }

    public final int I() {
        return this.stringValue_;
    }

    public final gya J() {
        return this.type_;
    }

    public final boolean K() {
        return (this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128;
    }

    public final boolean L() {
        return (this.bitField0_ & 256) == 256;
    }

    public final boolean M() {
        return (this.bitField0_ & 32) == 32;
    }

    public final boolean N() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean O() {
        return (this.bitField0_ & 64) == 64;
    }

    public final boolean P() {
        return (this.bitField0_ & 512) == 512;
    }

    public final boolean Q() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean R() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean S() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean T() {
        return (this.bitField0_ & 1) == 1;
    }

    public final void U() {
        this.type_ = gya.BYTE;
        this.intValue_ = 0L;
        this.floatValue_ = 0.0f;
        this.doubleValue_ = 0.0d;
        this.stringValue_ = 0;
        this.classId_ = 0;
        this.enumValueId_ = 0;
        this.annotation_ = kya.a;
        this.arrayElement_ = Collections.EMPTY_LIST;
        this.arrayDimensionCount_ = 0;
        this.flags_ = 0;
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
        if (K() && !this.annotation_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.arrayElement_.size(); i++) {
            if (!A(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        fya fyaVarK = fya.k();
        fyaVarK.l(this);
        return fyaVarK;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        if ((this.bitField0_ & 1) == 1) {
            p90Var.g0(1, this.type_.a());
        }
        if ((this.bitField0_ & 2) == 2) {
            long j = this.intValue_;
            p90Var.s0(2, 0);
            p90Var.r0((j >> 63) ^ (j << 1));
        }
        if ((this.bitField0_ & 4) == 4) {
            float f = this.floatValue_;
            p90Var.s0(3, 5);
            p90Var.o0(Float.floatToRawIntBits(f));
        }
        if ((this.bitField0_ & 8) == 8) {
            double d = this.doubleValue_;
            p90Var.s0(4, 1);
            p90Var.p0(Double.doubleToRawLongBits(d));
        }
        if ((this.bitField0_ & 16) == 16) {
            p90Var.h0(5, this.stringValue_);
        }
        if ((this.bitField0_ & 32) == 32) {
            p90Var.h0(6, this.classId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            p90Var.h0(7, this.enumValueId_);
        }
        if ((this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            p90Var.j0(8, this.annotation_);
        }
        for (int i = 0; i < this.arrayElement_.size(); i++) {
            p90Var.j0(9, this.arrayElement_.get(i));
        }
        if ((this.bitField0_ & 512) == 512) {
            p90Var.h0(10, this.flags_);
        }
        if ((this.bitField0_ & 256) == 256) {
            p90Var.h0(11, this.arrayDimensionCount_);
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iN = (this.bitField0_ & 1) == 1 ? p90.n(1, this.type_.a()) : 0;
        if ((this.bitField0_ & 2) == 2) {
            long j = this.intValue_;
            iN += p90.t((j >> 63) ^ (j << 1)) + p90.u(2);
        }
        if ((this.bitField0_ & 4) == 4) {
            iN += p90.u(3) + 4;
        }
        if ((this.bitField0_ & 8) == 8) {
            iN += p90.u(4) + 8;
        }
        if ((this.bitField0_ & 16) == 16) {
            iN += p90.o(5, this.stringValue_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iN += p90.o(6, this.classId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iN += p90.o(7, this.enumValueId_);
        }
        if ((this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            iN += p90.q(8, this.annotation_);
        }
        for (int i2 = 0; i2 < this.arrayElement_.size(); i2++) {
            iN += p90.q(9, this.arrayElement_.get(i2));
        }
        if ((this.bitField0_ & 512) == 512) {
            iN += p90.o(10, this.flags_);
        }
        if ((this.bitField0_ & 256) == 256) {
            iN += p90.o(11, this.arrayDimensionCount_);
        }
        int size = this.unknownFields.size() + iN;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return fya.k();
    }

    public final kya x() {
        return this.annotation_;
    }

    public final int z() {
        return this.arrayDimensionCount_;
    }

    public hya() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public hya(fya fyaVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = fyaVar.a;
    }
}
