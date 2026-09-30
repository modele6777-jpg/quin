package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kza extends q56 {
    public static final kza a;
    public static final gl7 b = new gl7(18);
    private List<kya> annotation_;
    private List<kya> backingFieldAnnotation_;
    private int bitField0_;
    private List<oya> compilerPluginData_;
    private List<d0b> contextParameter_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<vza> contextReceiverType_;
    private List<kya> delegateFieldAnnotation_;
    private List<kya> extensionReceiverAnnotation_;
    private int flags_;
    private List<kya> getterAnnotation_;
    private sya getterContract_;
    private int getterFlags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int oldFlags_;
    private int receiverTypeId_;
    private vza receiverType_;
    private int returnTypeId_;
    private vza returnType_;
    private List<kya> setterAnnotation_;
    private sya setterContract_;
    private int setterFlags_;
    private d0b setterValueParameter_;
    private List<a0b> typeParameter_;
    private final z61 unknownFields;
    private List<Integer> versionRequirement_;

    static {
        kza kzaVar = new kza();
        a = kzaVar;
        kzaVar.R0();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    public kza(g72 g72Var, o85 o85Var) throws Throwable {
        c0b c0bVarL;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        R0();
        x61 x61VarJ = z61.j();
        boolean z = true;
        p90 p90VarK = p90.K(x61VarJ, 1);
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = z;
            if (z2) {
                if ((i & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if ((i & 256) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                }
                if ((i & 512) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                }
                if ((i & 65536) == 65536) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if ((i & 131072) == 131072) {
                    this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                }
                if ((i & 262144) == 262144) {
                    this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                }
                if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                    this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                }
                if ((i & 16384) == 16384) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if ((i & 32768) == 32768) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                }
                if ((i & 524288) == 524288) {
                    this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                }
                if ((i & 1048576) == 1048576) {
                    this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                }
                if ((i & 2097152) == 2097152) {
                    this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
                }
                try {
                    p90VarK.B();
                } catch (IOException unused) {
                } finally {
                    this.unknownFields = x61VarJ.l();
                }
                q();
                return;
            }
            try {
                try {
                    int iN = g72Var.n();
                    Cloneable cloneableN = null;
                    switch (iN) {
                        case 0:
                            z2 = z3;
                            z = z3;
                            break;
                        case 8:
                            this.bitField0_ |= 2;
                            this.oldFlags_ = g72Var.k();
                            z = z3;
                            break;
                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                            this.bitField0_ |= 4;
                            this.name_ = g72Var.k();
                            z = z3;
                            break;
                        case 26:
                            if ((this.bitField0_ & 8) == 8) {
                                vza vzaVar = this.returnType_;
                                vzaVar.getClass();
                                cloneableN = vza.r0(vzaVar);
                            }
                            uza uzaVar = cloneableN;
                            vza vzaVar2 = (vza) g72Var.g(vza.b, o85Var);
                            this.returnType_ = vzaVar2;
                            if (uzaVar != 0) {
                                uzaVar.m(vzaVar2);
                                this.returnType_ = uzaVar.k();
                            }
                            this.bitField0_ |= 8;
                            z = z3;
                            break;
                        case 34:
                            if ((i & 32) != 32) {
                                this.typeParameter_ = new ArrayList();
                                i |= 32;
                            }
                            this.typeParameter_.add((a0b) g72Var.g(a0b.b, o85Var));
                            z = z3;
                            break;
                        case 42:
                            if ((this.bitField0_ & 32) == 32) {
                                vza vzaVar3 = this.receiverType_;
                                vzaVar3.getClass();
                                cloneableN = vza.r0(vzaVar3);
                            }
                            uza uzaVar2 = cloneableN;
                            vza vzaVar4 = (vza) g72Var.g(vza.b, o85Var);
                            this.receiverType_ = vzaVar4;
                            if (uzaVar2 != 0) {
                                uzaVar2.m(vzaVar4);
                                this.receiverType_ = uzaVar2.k();
                            }
                            this.bitField0_ |= 32;
                            z = z3;
                            break;
                        case 50:
                            if ((this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                                d0b d0bVar = this.setterValueParameter_;
                                d0bVar.getClass();
                                c0bVarL = c0b.l();
                                c0bVarL.m(d0bVar);
                            } else {
                                c0bVarL = null;
                            }
                            d0b d0bVar2 = (d0b) g72Var.g(d0b.b, o85Var);
                            this.setterValueParameter_ = d0bVar2;
                            if (c0bVarL != null) {
                                c0bVarL.m(d0bVar2);
                                this.setterValueParameter_ = c0bVarL.k();
                            }
                            this.bitField0_ |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            z = z3;
                            break;
                        case 56:
                            this.bitField0_ |= 256;
                            this.getterFlags_ = g72Var.k();
                            z = z3;
                            break;
                        case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                            this.bitField0_ |= 512;
                            this.setterFlags_ = g72Var.k();
                            z = z3;
                            break;
                        case 72:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = g72Var.k();
                            z = z3;
                            break;
                        case 80:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = g72Var.k();
                            z = z3;
                            break;
                        case 88:
                            this.bitField0_ |= 1;
                            this.flags_ = g72Var.k();
                            z = z3;
                            break;
                        case 98:
                            if ((i & 256) != 256) {
                                this.contextReceiverType_ = new ArrayList();
                                i |= 256;
                            }
                            this.contextReceiverType_.add((vza) g72Var.g(vza.b, o85Var));
                            z = z3;
                            break;
                        case 104:
                            if ((i & 512) != 512) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i |= 512;
                            }
                            this.contextReceiverTypeId_.add(Integer.valueOf(g72Var.k()));
                            z = z3;
                            break;
                        case 106:
                            int iE = g72Var.e(g72Var.k());
                            if ((i & 512) != 512 && g72Var.c() > 0) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i |= 512;
                            }
                            while (g72Var.c() > 0) {
                                this.contextReceiverTypeId_.add(Integer.valueOf(g72Var.k()));
                            }
                            g72Var.d(iE);
                            z = z3;
                            break;
                        case 114:
                            if ((i & 65536) != 65536) {
                                this.annotation_ = new ArrayList();
                                i |= 65536;
                            }
                            this.annotation_.add((kya) g72Var.g(kya.b, o85Var));
                            z = z3;
                            break;
                        case 122:
                            if ((i & 131072) != 131072) {
                                this.getterAnnotation_ = new ArrayList();
                                i |= 131072;
                            }
                            this.getterAnnotation_.add((kya) g72Var.g(kya.b, o85Var));
                            z = z3;
                            break;
                        case 130:
                            if ((i & 262144) != 262144) {
                                this.setterAnnotation_ = new ArrayList();
                                i |= 262144;
                            }
                            this.setterAnnotation_.add((kya) g72Var.g(kya.b, o85Var));
                            z = z3;
                            break;
                        case 138:
                            if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 1024) {
                                this.contextParameter_ = new ArrayList();
                                i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                            }
                            this.contextParameter_.add((d0b) g72Var.g(d0b.b, o85Var));
                            z = z3;
                            break;
                        case 248:
                            if ((i & 16384) != 16384) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 16384;
                            }
                            this.versionRequirement_.add(Integer.valueOf(g72Var.k()));
                            z = z3;
                            break;
                        case 250:
                            int iE2 = g72Var.e(g72Var.k());
                            if ((i & 16384) != 16384 && g72Var.c() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 16384;
                            }
                            while (g72Var.c() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(g72Var.k()));
                            }
                            g72Var.d(iE2);
                            z = z3;
                            break;
                        case 258:
                            if ((i & 32768) != 32768) {
                                this.compilerPluginData_ = new ArrayList();
                                i |= 32768;
                            }
                            this.compilerPluginData_.add((oya) g72Var.g(oya.b, o85Var));
                            z = z3;
                            break;
                        case 266:
                            if ((i & 524288) != 524288) {
                                this.extensionReceiverAnnotation_ = new ArrayList();
                                i |= 524288;
                            }
                            this.extensionReceiverAnnotation_.add((kya) g72Var.g(kya.b, o85Var));
                            z = z3;
                            break;
                        case 274:
                            if ((i & 1048576) != 1048576) {
                                this.backingFieldAnnotation_ = new ArrayList();
                                i |= 1048576;
                            }
                            this.backingFieldAnnotation_.add((kya) g72Var.g(kya.b, o85Var));
                            z = z3;
                            break;
                        case 282:
                            if ((i & 2097152) != 2097152) {
                                this.delegateFieldAnnotation_ = new ArrayList();
                                i |= 2097152;
                            }
                            this.delegateFieldAnnotation_.add((kya) g72Var.g(kya.b, o85Var));
                            z = z3;
                            break;
                        case 322:
                            if ((this.bitField0_ & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                                sya syaVar = this.getterContract_;
                                syaVar.getClass();
                                cloneableN = sya.n(syaVar);
                            }
                            rya ryaVar = cloneableN;
                            sya syaVar2 = (sya) g72Var.g(sya.b, o85Var);
                            this.getterContract_ = syaVar2;
                            if (ryaVar != 0) {
                                ryaVar.n(syaVar2);
                                this.getterContract_ = ryaVar.j();
                            }
                            this.bitField0_ |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                            z = z3;
                            break;
                        case 330:
                            try {
                                if ((this.bitField0_ & 2048) == 2048) {
                                    sya syaVar3 = this.setterContract_;
                                    syaVar3.getClass();
                                    cloneableN = sya.n(syaVar3);
                                }
                                rya ryaVar2 = cloneableN;
                                sya syaVar4 = (sya) g72Var.g(sya.b, o85Var);
                                this.setterContract_ = syaVar4;
                                if (ryaVar2 != 0) {
                                    ryaVar2.n(syaVar4);
                                    this.setterContract_ = ryaVar2.j();
                                }
                                this.bitField0_ |= 2048;
                                z = z3;
                            } catch (ab7 e) {
                                e = e;
                                e.b(this);
                                throw e;
                            } catch (IOException e2) {
                                e = e2;
                                ab7 ab7Var = new ab7(e.getMessage());
                                ab7Var.b(this);
                                throw ab7Var;
                            } catch (Throwable th) {
                                th = th;
                                if ((i & 32) == 32) {
                                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                }
                                if ((i & 256) == 256) {
                                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                }
                                if ((i & 512) == 512) {
                                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                }
                                if ((i & 65536) == 65536) {
                                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                }
                                if ((i & 131072) == 131072) {
                                    this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                                }
                                if ((i & 262144) == 262144) {
                                    this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                                }
                                if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                                    this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                }
                                if ((i & 16384) == 16384) {
                                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                }
                                if ((i & 32768) == 32768) {
                                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                }
                                if ((i & 524288) == 524288) {
                                    this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                }
                                if ((i & 1048576) == 1048576) {
                                    this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                                }
                                if ((i & 2097152) == 2097152) {
                                    this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
                                }
                                try {
                                    p90VarK.B();
                                    break;
                                } catch (IOException unused2) {
                                } finally {
                                    this.unknownFields = x61VarJ.l();
                                }
                                q();
                                throw th;
                            }
                            break;
                        default:
                            if (!r(g72Var, p90VarK, o85Var, iN)) {
                                z2 = z3;
                            }
                            z = z3;
                            break;
                    }
                } catch (ab7 e3) {
                    e = e3;
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final sya A0() {
        return this.setterContract_;
    }

    public final int B0() {
        return this.setterFlags_;
    }

    public final d0b C0() {
        return this.setterValueParameter_;
    }

    public final List D0() {
        return this.typeParameter_;
    }

    public final List E0() {
        return this.versionRequirement_;
    }

    public final boolean F0() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean G0() {
        return (this.bitField0_ & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024;
    }

    public final boolean H0() {
        return (this.bitField0_ & 256) == 256;
    }

    public final boolean I0() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean J0() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean K0() {
        return (this.bitField0_ & 32) == 32;
    }

    public final boolean L0() {
        return (this.bitField0_ & 64) == 64;
    }

    public final boolean M0() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean N0() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean O0() {
        return (this.bitField0_ & 2048) == 2048;
    }

    public final boolean P0() {
        return (this.bitField0_ & 512) == 512;
    }

    public final boolean Q0() {
        return (this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128;
    }

    public final void R0() {
        this.flags_ = 518;
        this.oldFlags_ = 2054;
        this.name_ = 0;
        vza vzaVar = vza.a;
        this.returnType_ = vzaVar;
        this.returnTypeId_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        this.receiverType_ = vzaVar;
        this.receiverTypeId_ = 0;
        this.contextReceiverType_ = list;
        this.contextReceiverTypeId_ = list;
        this.contextParameter_ = list;
        this.setterValueParameter_ = d0b.a;
        this.getterFlags_ = 0;
        this.setterFlags_ = 0;
        this.versionRequirement_ = list;
        this.compilerPluginData_ = list;
        this.annotation_ = list;
        this.getterAnnotation_ = list;
        this.setterAnnotation_ = list;
        this.extensionReceiverAnnotation_ = list;
        this.backingFieldAnnotation_ = list;
        this.delegateFieldAnnotation_ = list;
        sya syaVar = sya.a;
        this.getterContract_ = syaVar;
        this.setterContract_ = syaVar;
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
        if (!I0()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (M0() && !this.returnType_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            if (!this.typeParameter_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (K0() && !this.receiverType_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
            if (!this.contextReceiverType_.get(i2).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.contextParameter_.size(); i3++) {
            if (!this.contextParameter_.get(i3).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (Q0() && !this.setterValueParameter_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
            if (!this.compilerPluginData_.get(i4).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
            if (!this.annotation_.get(i5).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.getterAnnotation_.size(); i6++) {
            if (!this.getterAnnotation_.get(i6).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.setterAnnotation_.size(); i7++) {
            if (!this.setterAnnotation_.get(i7).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.extensionReceiverAnnotation_.size(); i8++) {
            if (!this.extensionReceiverAnnotation_.get(i8).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.backingFieldAnnotation_.size(); i9++) {
            if (!this.backingFieldAnnotation_.get(i9).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.delegateFieldAnnotation_.size(); i10++) {
            if (!this.delegateFieldAnnotation_.get(i10).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (G0() && !this.getterContract_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (O0() && !this.setterContract_.b()) {
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
        jza jzaVarL = jza.l();
        jzaVarL.m(this);
        return jzaVarL;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        fz3 fz3Var = new fz3(this);
        if ((this.bitField0_ & 2) == 2) {
            p90Var.h0(1, this.oldFlags_);
        }
        if ((this.bitField0_ & 4) == 4) {
            p90Var.h0(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            p90Var.j0(3, this.returnType_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            p90Var.j0(4, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 32) == 32) {
            p90Var.j0(5, this.receiverType_);
        }
        if ((this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            p90Var.j0(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            p90Var.h0(7, this.getterFlags_);
        }
        if ((this.bitField0_ & 512) == 512) {
            p90Var.h0(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            p90Var.h0(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            p90Var.h0(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(11, this.flags_);
        }
        for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
            p90Var.j0(12, this.contextReceiverType_.get(i2));
        }
        if (this.contextReceiverTypeId_.size() > 0) {
            p90Var.q0(106);
            p90Var.q0(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i3 = 0; i3 < this.contextReceiverTypeId_.size(); i3++) {
            p90Var.i0(this.contextReceiverTypeId_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
            p90Var.j0(14, this.annotation_.get(i4));
        }
        for (int i5 = 0; i5 < this.getterAnnotation_.size(); i5++) {
            p90Var.j0(15, this.getterAnnotation_.get(i5));
        }
        for (int i6 = 0; i6 < this.setterAnnotation_.size(); i6++) {
            p90Var.j0(16, this.setterAnnotation_.get(i6));
        }
        for (int i7 = 0; i7 < this.contextParameter_.size(); i7++) {
            p90Var.j0(17, this.contextParameter_.get(i7));
        }
        for (int i8 = 0; i8 < this.versionRequirement_.size(); i8++) {
            p90Var.h0(31, this.versionRequirement_.get(i8).intValue());
        }
        for (int i9 = 0; i9 < this.compilerPluginData_.size(); i9++) {
            p90Var.j0(32, this.compilerPluginData_.get(i9));
        }
        for (int i10 = 0; i10 < this.extensionReceiverAnnotation_.size(); i10++) {
            p90Var.j0(33, this.extensionReceiverAnnotation_.get(i10));
        }
        for (int i11 = 0; i11 < this.backingFieldAnnotation_.size(); i11++) {
            p90Var.j0(34, this.backingFieldAnnotation_.get(i11));
        }
        for (int i12 = 0; i12 < this.delegateFieldAnnotation_.size(); i12++) {
            p90Var.j0(35, this.delegateFieldAnnotation_.get(i12));
        }
        if ((this.bitField0_ & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
            p90Var.j0(40, this.getterContract_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            p90Var.j0(41, this.setterContract_);
        }
        fz3Var.y(19000, p90Var);
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        List<Integer> list;
        List<Integer> list2;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 2) == 2 ? p90.o(1, this.oldFlags_) : 0;
        if ((this.bitField0_ & 4) == 4) {
            iO += p90.o(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iO += p90.q(3, this.returnType_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            iO += p90.q(4, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 32) == 32) {
            iO += p90.q(5, this.receiverType_);
        }
        if ((this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            iO += p90.q(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            iO += p90.o(7, this.getterFlags_);
        }
        if ((this.bitField0_ & 512) == 512) {
            iO += p90.o(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iO += p90.o(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iO += p90.o(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            iO += p90.o(11, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            iO += p90.q(12, this.contextReceiverType_.get(i3));
        }
        int i4 = 0;
        int iP = 0;
        while (true) {
            int size = this.contextReceiverTypeId_.size();
            list = this.contextReceiverTypeId_;
            if (i4 >= size) {
                break;
            }
            iP += p90.p(list.get(i4).intValue());
            i4++;
        }
        int iQ = iO + iP;
        if (!list.isEmpty()) {
            iQ = iQ + 1 + p90.p(iP);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iP;
        for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
            iQ += p90.q(14, this.annotation_.get(i5));
        }
        for (int i6 = 0; i6 < this.getterAnnotation_.size(); i6++) {
            iQ += p90.q(15, this.getterAnnotation_.get(i6));
        }
        for (int i7 = 0; i7 < this.setterAnnotation_.size(); i7++) {
            iQ += p90.q(16, this.setterAnnotation_.get(i7));
        }
        for (int i8 = 0; i8 < this.contextParameter_.size(); i8++) {
            iQ += p90.q(17, this.contextParameter_.get(i8));
        }
        int i9 = 0;
        int iP2 = 0;
        while (true) {
            int size2 = this.versionRequirement_.size();
            list2 = this.versionRequirement_;
            if (i9 >= size2) {
                break;
            }
            iP2 += p90.p(list2.get(i9).intValue());
            i9++;
        }
        int size3 = (list2.size() * 2) + iQ + iP2;
        for (int i10 = 0; i10 < this.compilerPluginData_.size(); i10++) {
            size3 += p90.q(32, this.compilerPluginData_.get(i10));
        }
        for (int i11 = 0; i11 < this.extensionReceiverAnnotation_.size(); i11++) {
            size3 += p90.q(33, this.extensionReceiverAnnotation_.get(i11));
        }
        for (int i12 = 0; i12 < this.backingFieldAnnotation_.size(); i12++) {
            size3 += p90.q(34, this.backingFieldAnnotation_.get(i12));
        }
        for (int i13 = 0; i13 < this.delegateFieldAnnotation_.size(); i13++) {
            size3 += p90.q(35, this.delegateFieldAnnotation_.get(i13));
        }
        if ((this.bitField0_ & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
            size3 += p90.q(40, this.getterContract_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            size3 += p90.q(41, this.setterContract_);
        }
        int size4 = this.unknownFields.size() + l() + size3;
        this.memoizedSerializedSize = size4;
        return size4;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return jza.l();
    }

    public final List g0() {
        return this.annotation_;
    }

    public final List h0() {
        return this.backingFieldAnnotation_;
    }

    public final List i0() {
        return this.compilerPluginData_;
    }

    public final int j0() {
        return this.contextParameter_.size();
    }

    public final List k0() {
        return this.contextParameter_;
    }

    public final List l0() {
        return this.contextReceiverTypeId_;
    }

    public final List m0() {
        return this.contextReceiverType_;
    }

    public final List n0() {
        return this.delegateFieldAnnotation_;
    }

    public final List o0() {
        return this.extensionReceiverAnnotation_;
    }

    public final int p0() {
        return this.flags_;
    }

    public final List q0() {
        return this.getterAnnotation_;
    }

    public final sya r0() {
        return this.getterContract_;
    }

    public final int s0() {
        return this.getterFlags_;
    }

    public final int t0() {
        return this.name_;
    }

    public final int u0() {
        return this.oldFlags_;
    }

    public final vza v0() {
        return this.receiverType_;
    }

    public final int w0() {
        return this.receiverTypeId_;
    }

    public final vza x0() {
        return this.returnType_;
    }

    public final int y0() {
        return this.returnTypeId_;
    }

    public final List z0() {
        return this.setterAnnotation_;
    }

    public kza() {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public kza(jza jzaVar) {
        super(jzaVar);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = jzaVar.a;
    }
}
