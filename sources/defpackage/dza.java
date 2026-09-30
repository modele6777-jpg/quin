package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dza extends q56 {
    public static final dza a;
    public static final gl7 b = new gl7(15);
    private List<kya> annotation_;
    private int bitField0_;
    private List<oya> compilerPluginData_;
    private List<d0b> contextParameter_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<vza> contextReceiverType_;
    private sya contract_;
    private List<kya> extensionReceiverAnnotation_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int oldFlags_;
    private int receiverTypeId_;
    private vza receiverType_;
    private int returnTypeId_;
    private vza returnType_;
    private List<a0b> typeParameter_;
    private b0b typeTable_;
    private final z61 unknownFields;
    private List<d0b> valueParameter_;
    private List<Integer> versionRequirement_;

    static {
        dza dzaVar = new dza();
        a = dzaVar;
        dzaVar.z0();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    /* JADX WARN: Code duplicated, block: B:134:0x033b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0347  */
    /* JADX WARN: Code duplicated, block: B:140:0x0353  */
    /* JADX WARN: Code duplicated, block: B:143:0x035f  */
    /* JADX WARN: Code duplicated, block: B:146:0x036b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0377  */
    /* JADX WARN: Code duplicated, block: B:152:0x0383  */
    /* JADX WARN: Code duplicated, block: B:155:0x0391  */
    /* JADX WARN: Code duplicated, block: B:158:0x039f  */
    /* JADX WARN: Multi-variable type inference failed */
    public dza(g72 g72Var, o85 o85Var) throws Throwable {
        int i;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        z0();
        x61 x61Var = new x61();
        boolean z = true;
        p90 p90VarK = p90.K(x61Var, 1);
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            int i3 = 32768;
            int i4 = 131072;
            boolean z3 = z;
            if (z2) {
                if ((i2 & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if ((i2 & 2048) == 2048) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                }
                if ((i2 & 256) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                }
                if ((i2 & 512) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                }
                if ((i2 & 65536) == 65536) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if ((i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                    this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                }
                if ((i2 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if ((i2 & 32768) == 32768) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                }
                if ((i2 & 131072) == 131072) {
                    this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                }
                try {
                    p90VarK.b0();
                } catch (IOException unused) {
                } finally {
                    this.unknownFields = x61Var.l();
                }
                q();
                return;
            }
            try {
                int iN = g72Var.n();
                Cloneable cloneableR0 = null;
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
                            cloneableR0 = vza.r0(vzaVar);
                        }
                        uza uzaVar = cloneableR0;
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
                        if ((i2 & 32) != 32) {
                            this.typeParameter_ = new ArrayList();
                            i2 |= 32;
                        }
                        this.typeParameter_.add((a0b) g72Var.g(a0b.b, o85Var));
                        z = z3;
                        break;
                    case 42:
                        if ((this.bitField0_ & 32) == 32) {
                            vza vzaVar3 = this.receiverType_;
                            vzaVar3.getClass();
                            cloneableR0 = vza.r0(vzaVar3);
                        }
                        uza uzaVar2 = cloneableR0;
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
                        if ((i2 & 2048) != 2048) {
                            this.valueParameter_ = new ArrayList();
                            i2 |= 2048;
                        }
                        this.valueParameter_.add((d0b) g72Var.g(d0b.b, o85Var));
                        z = z3;
                        break;
                    case 56:
                        this.bitField0_ |= 16;
                        this.returnTypeId_ = g72Var.k();
                        z = z3;
                        break;
                    case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                        this.bitField0_ |= 64;
                        this.receiverTypeId_ = g72Var.k();
                        z = z3;
                        break;
                    case 72:
                        this.bitField0_ |= 1;
                        this.flags_ = g72Var.k();
                        z = z3;
                        break;
                    case 82:
                        if ((i2 & 256) != 256) {
                            this.contextReceiverType_ = new ArrayList();
                            i2 |= 256;
                        }
                        this.contextReceiverType_.add((vza) g72Var.g(vza.b, o85Var));
                        z = z3;
                        break;
                    case 88:
                        if ((i2 & 512) != 512) {
                            this.contextReceiverTypeId_ = new ArrayList();
                            i2 |= 512;
                        }
                        this.contextReceiverTypeId_.add(Integer.valueOf(g72Var.k()));
                        z = z3;
                        break;
                    case 90:
                        int iE = g72Var.e(g72Var.k());
                        if ((i2 & 512) != 512 && g72Var.c() > 0) {
                            this.contextReceiverTypeId_ = new ArrayList();
                            i2 |= 512;
                        }
                        while (g72Var.c() > 0) {
                            this.contextReceiverTypeId_.add(Integer.valueOf(g72Var.k()));
                        }
                        g72Var.d(iE);
                        z = z3;
                        break;
                    case 98:
                        if ((i2 & 65536) != 65536) {
                            this.annotation_ = new ArrayList();
                            i2 |= 65536;
                        }
                        this.annotation_.add((kya) g72Var.g(kya.b, o85Var));
                        z = z3;
                        break;
                    case 106:
                        if ((i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 1024) {
                            this.contextParameter_ = new ArrayList();
                            i2 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                        }
                        this.contextParameter_.add((d0b) g72Var.g(d0b.b, o85Var));
                        z = z3;
                        break;
                    case 242:
                        if ((this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                            b0b b0bVar = this.typeTable_;
                            b0bVar.getClass();
                            cloneableR0 = b0b.r(b0bVar);
                        }
                        jya jyaVar = cloneableR0;
                        b0b b0bVar2 = (b0b) g72Var.g(b0b.b, o85Var);
                        this.typeTable_ = b0bVar2;
                        if (jyaVar != 0) {
                            jyaVar.m(b0bVar2);
                            this.typeTable_ = jyaVar.k();
                        }
                        this.bitField0_ |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        z = z3;
                        break;
                    case 248:
                        if ((i2 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 8192) {
                            this.versionRequirement_ = new ArrayList();
                            i2 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        this.versionRequirement_.add(Integer.valueOf(g72Var.k()));
                        z = z3;
                        break;
                    case 250:
                        i4 = 131072;
                        int iE2 = g72Var.e(g72Var.k());
                        if ((i2 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 8192 && g72Var.c() > 0) {
                            this.versionRequirement_ = new ArrayList();
                            i2 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        while (g72Var.c() > 0) {
                            i = i3;
                            try {
                                try {
                                    this.versionRequirement_.add(Integer.valueOf(g72Var.k()));
                                    i3 = i;
                                } catch (ab7 e) {
                                    e = e;
                                    e.b(this);
                                    throw e;
                                } catch (IOException e2) {
                                    e = e2;
                                    ab7 ab7Var = new ab7(e.getMessage());
                                    ab7Var.b(this);
                                    throw ab7Var;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if ((i2 & 32) == 32) {
                                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                }
                                if ((i2 & 2048) == 2048) {
                                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                                }
                                if ((i2 & 256) == 256) {
                                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                }
                                if ((i2 & 512) == 512) {
                                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                }
                                if ((i2 & 65536) == 65536) {
                                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                }
                                if ((i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                                    this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                }
                                if ((i2 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
                                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                }
                                if ((i2 & i) == i) {
                                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                }
                                if ((i2 & i4) == i4) {
                                    this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                }
                                try {
                                    p90VarK.b0();
                                    break;
                                } catch (IOException unused2) {
                                } finally {
                                    this.unknownFields = x61Var.l();
                                }
                                q();
                                throw th;
                            }
                        }
                        g72Var.d(iE2);
                        z = z3;
                        break;
                    case 258:
                        if ((this.bitField0_ & 256) == 256) {
                            sya syaVar = this.contract_;
                            syaVar.getClass();
                            cloneableR0 = sya.n(syaVar);
                        }
                        rya ryaVar = cloneableR0;
                        sya syaVar2 = (sya) g72Var.g(sya.b, o85Var);
                        this.contract_ = syaVar2;
                        if (ryaVar != 0) {
                            ryaVar.n(syaVar2);
                            this.contract_ = ryaVar.j();
                        }
                        this.bitField0_ |= 256;
                        z = z3;
                        break;
                    case 266:
                        if ((i2 & 32768) != 32768) {
                            this.compilerPluginData_ = new ArrayList();
                            i2 |= 32768;
                        }
                        this.compilerPluginData_.add((oya) g72Var.g(oya.b, o85Var));
                        z = z3;
                        break;
                    case 274:
                        if ((i2 & 131072) != 131072) {
                            this.extensionReceiverAnnotation_ = new ArrayList();
                            i2 |= 131072;
                        }
                        try {
                            try {
                                this.extensionReceiverAnnotation_.add((kya) g72Var.g(kya.b, o85Var));
                                z = z3;
                            } catch (ab7 e3) {
                                e = e3;
                                e.b(this);
                                throw e;
                            } catch (IOException e4) {
                                e = e4;
                                ab7 ab7Var2 = new ab7(e.getMessage());
                                ab7Var2.b(this);
                                throw ab7Var2;
                            } catch (Throwable th2) {
                                th = th2;
                                i = 32768;
                                if ((i2 & 32) == 32) {
                                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                }
                                if ((i2 & 2048) == 2048) {
                                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                                }
                                if ((i2 & 256) == 256) {
                                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                }
                                if ((i2 & 512) == 512) {
                                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                }
                                if ((i2 & 65536) == 65536) {
                                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                }
                                if ((i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                                    this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                }
                                if ((i2 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
                                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                }
                                if ((i2 & i) == i) {
                                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                }
                                if ((i2 & i4) == i4) {
                                    this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                }
                                p90VarK.b0();
                                q();
                                throw th;
                            }
                        } catch (ab7 e5) {
                            e = e5;
                        } catch (IOException e6) {
                            e = e6;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        break;
                    default:
                        if (!r(g72Var, p90VarK, o85Var, iN)) {
                            z2 = z3;
                        }
                        z = z3;
                        break;
                }
            } catch (ab7 e7) {
                e = e7;
            } catch (IOException e8) {
                e = e8;
            } catch (Throwable th4) {
                th = th4;
                i = 32768;
                i4 = 131072;
            }
        }
    }

    public final List X() {
        return this.annotation_;
    }

    public final List Y() {
        return this.compilerPluginData_;
    }

    public final int Z() {
        return this.contextParameter_.size();
    }

    @Override // defpackage.wt8
    public final ut8 a() {
        return a;
    }

    public final List a0() {
        return this.contextParameter_;
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
        if (!s0()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (w0() && !this.returnType_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            if (!this.typeParameter_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (u0() && !this.receiverType_.b()) {
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
        for (int i4 = 0; i4 < this.valueParameter_.size(); i4++) {
            if (!this.valueParameter_.get(i4).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (y0() && !this.typeTable_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (q0() && !this.contract_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
            if (!this.compilerPluginData_.get(i5).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.annotation_.size(); i6++) {
            if (!this.annotation_.get(i6).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.extensionReceiverAnnotation_.size(); i7++) {
            if (!this.extensionReceiverAnnotation_.get(i7).b()) {
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

    public final List b0() {
        return this.contextReceiverTypeId_;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        cza czaVarL = cza.l();
        czaVarL.m(this);
        return czaVarL;
    }

    public final List c0() {
        return this.contextReceiverType_;
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
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            p90Var.j0(6, this.valueParameter_.get(i2));
        }
        if ((this.bitField0_ & 16) == 16) {
            p90Var.h0(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            p90Var.h0(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(9, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            p90Var.j0(10, this.contextReceiverType_.get(i3));
        }
        if (this.contextReceiverTypeId_.size() > 0) {
            p90Var.q0(90);
            p90Var.q0(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
            p90Var.i0(this.contextReceiverTypeId_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
            p90Var.j0(12, this.annotation_.get(i5));
        }
        for (int i6 = 0; i6 < this.contextParameter_.size(); i6++) {
            p90Var.j0(13, this.contextParameter_.get(i6));
        }
        if ((this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            p90Var.j0(30, this.typeTable_);
        }
        for (int i7 = 0; i7 < this.versionRequirement_.size(); i7++) {
            p90Var.h0(31, this.versionRequirement_.get(i7).intValue());
        }
        if ((this.bitField0_ & 256) == 256) {
            p90Var.j0(32, this.contract_);
        }
        for (int i8 = 0; i8 < this.compilerPluginData_.size(); i8++) {
            p90Var.j0(33, this.compilerPluginData_.get(i8));
        }
        for (int i9 = 0; i9 < this.extensionReceiverAnnotation_.size(); i9++) {
            p90Var.j0(34, this.extensionReceiverAnnotation_.get(i9));
        }
        fz3Var.y(19000, p90Var);
        p90Var.m0(this.unknownFields);
    }

    public final sya d0() {
        return this.contract_;
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
        for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
            iO += p90.q(6, this.valueParameter_.get(i3));
        }
        if ((this.bitField0_ & 16) == 16) {
            iO += p90.o(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iO += p90.o(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            iO += p90.o(9, this.flags_);
        }
        for (int i4 = 0; i4 < this.contextReceiverType_.size(); i4++) {
            iO += p90.q(10, this.contextReceiverType_.get(i4));
        }
        int i5 = 0;
        int iP = 0;
        while (true) {
            int size = this.contextReceiverTypeId_.size();
            list = this.contextReceiverTypeId_;
            if (i5 >= size) {
                break;
            }
            iP += p90.p(list.get(i5).intValue());
            i5++;
        }
        int iQ = iO + iP;
        if (!list.isEmpty()) {
            iQ = iQ + 1 + p90.p(iP);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iP;
        for (int i6 = 0; i6 < this.annotation_.size(); i6++) {
            iQ += p90.q(12, this.annotation_.get(i6));
        }
        for (int i7 = 0; i7 < this.contextParameter_.size(); i7++) {
            iQ += p90.q(13, this.contextParameter_.get(i7));
        }
        if ((this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            iQ += p90.q(30, this.typeTable_);
        }
        int i8 = 0;
        int iP2 = 0;
        while (true) {
            int size2 = this.versionRequirement_.size();
            list2 = this.versionRequirement_;
            if (i8 >= size2) {
                break;
            }
            iP2 += p90.p(list2.get(i8).intValue());
            i8++;
        }
        int size3 = (list2.size() * 2) + iQ + iP2;
        if ((this.bitField0_ & 256) == 256) {
            size3 += p90.q(32, this.contract_);
        }
        for (int i9 = 0; i9 < this.compilerPluginData_.size(); i9++) {
            size3 += p90.q(33, this.compilerPluginData_.get(i9));
        }
        for (int i10 = 0; i10 < this.extensionReceiverAnnotation_.size(); i10++) {
            size3 += p90.q(34, this.extensionReceiverAnnotation_.get(i10));
        }
        int size4 = this.unknownFields.size() + l() + size3;
        this.memoizedSerializedSize = size4;
        return size4;
    }

    public final List e0() {
        return this.extensionReceiverAnnotation_;
    }

    public final int f0() {
        return this.flags_;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return cza.l();
    }

    public final int g0() {
        return this.name_;
    }

    public final int h0() {
        return this.oldFlags_;
    }

    public final vza i0() {
        return this.receiverType_;
    }

    public final int j0() {
        return this.receiverTypeId_;
    }

    public final vza k0() {
        return this.returnType_;
    }

    public final int l0() {
        return this.returnTypeId_;
    }

    public final List m0() {
        return this.typeParameter_;
    }

    public final b0b n0() {
        return this.typeTable_;
    }

    public final List o0() {
        return this.valueParameter_;
    }

    public final List p0() {
        return this.versionRequirement_;
    }

    public final boolean q0() {
        return (this.bitField0_ & 256) == 256;
    }

    public final boolean r0() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean s0() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean t0() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean u0() {
        return (this.bitField0_ & 32) == 32;
    }

    public final boolean v0() {
        return (this.bitField0_ & 64) == 64;
    }

    public final boolean w0() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean x0() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean y0() {
        return (this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128;
    }

    public final void z0() {
        this.flags_ = 6;
        this.oldFlags_ = 6;
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
        this.valueParameter_ = list;
        this.typeTable_ = b0b.a;
        this.versionRequirement_ = list;
        this.contract_ = sya.a;
        this.compilerPluginData_ = list;
        this.annotation_ = list;
        this.extensionReceiverAnnotation_ = list;
    }

    public dza() {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public dza(cza czaVar) {
        super(czaVar);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = czaVar.a;
    }
}
