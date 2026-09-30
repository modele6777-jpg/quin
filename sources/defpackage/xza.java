package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xza extends q56 {
    public static final xza a;
    public static final gl7 b = new gl7(24);
    private List<kya> annotation_;
    private int bitField0_;
    private List<oya> compilerPluginData_;
    private int expandedTypeId_;
    private vza expandedType_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private List<a0b> typeParameter_;
    private int underlyingTypeId_;
    private vza underlyingType_;
    private final z61 unknownFields;
    private List<Integer> versionRequirement_;

    static {
        xza xzaVar = new xza();
        a = xzaVar;
        xzaVar.flags_ = 6;
        xzaVar.name_ = 0;
        List list = Collections.EMPTY_LIST;
        xzaVar.typeParameter_ = list;
        vza vzaVar = vza.a;
        xzaVar.underlyingType_ = vzaVar;
        xzaVar.underlyingTypeId_ = 0;
        xzaVar.expandedType_ = vzaVar;
        xzaVar.expandedTypeId_ = 0;
        xzaVar.annotation_ = list;
        xzaVar.versionRequirement_ = list;
        xzaVar.compilerPluginData_ = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public xza(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.flags_ = 6;
        boolean z = false;
        this.name_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        vza vzaVar = vza.a;
        this.underlyingType_ = vzaVar;
        this.underlyingTypeId_ = 0;
        this.expandedType_ = vzaVar;
        this.expandedTypeId_ = 0;
        this.annotation_ = list;
        this.versionRequirement_ = list;
        this.compilerPluginData_ = list;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    uza uzaVarR0 = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.bitField0_ |= 1;
                            this.flags_ = g72Var.k();
                            continue;
                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                            this.bitField0_ |= 2;
                            this.name_ = g72Var.k();
                            continue;
                        case 26:
                            if ((i & 4) != 4) {
                                this.typeParameter_ = new ArrayList();
                                i |= 4;
                            }
                            this.typeParameter_.add((a0b) g72Var.g(a0b.b, o85Var));
                            continue;
                        case 34:
                            if ((this.bitField0_ & 4) == 4) {
                                vza vzaVar2 = this.underlyingType_;
                                vzaVar2.getClass();
                                uzaVarR0 = vza.r0(vzaVar2);
                            }
                            vza vzaVar3 = (vza) g72Var.g(vza.b, o85Var);
                            this.underlyingType_ = vzaVar3;
                            if (uzaVarR0 != null) {
                                uzaVarR0.m(vzaVar3);
                                this.underlyingType_ = uzaVarR0.k();
                            }
                            this.bitField0_ |= 4;
                            continue;
                        case 40:
                            this.bitField0_ |= 8;
                            this.underlyingTypeId_ = g72Var.k();
                            continue;
                        case 50:
                            if ((this.bitField0_ & 16) == 16) {
                                vza vzaVar4 = this.expandedType_;
                                vzaVar4.getClass();
                                uzaVarR0 = vza.r0(vzaVar4);
                            }
                            vza vzaVar5 = (vza) g72Var.g(vza.b, o85Var);
                            this.expandedType_ = vzaVar5;
                            if (uzaVarR0 != null) {
                                uzaVarR0.m(vzaVar5);
                                this.expandedType_ = uzaVarR0.k();
                            }
                            this.bitField0_ |= 16;
                            continue;
                        case 56:
                            this.bitField0_ |= 32;
                            this.expandedTypeId_ = g72Var.k();
                            continue;
                        case 66:
                            if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 128) {
                                this.annotation_ = new ArrayList();
                                i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            }
                            this.annotation_.add((kya) g72Var.g(kya.b, o85Var));
                            continue;
                        case 248:
                            if ((i & 256) != 256) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 256;
                            }
                            this.versionRequirement_.add(Integer.valueOf(g72Var.k()));
                            continue;
                        case 250:
                            int iE = g72Var.e(g72Var.k());
                            if ((i & 256) != 256 && g72Var.c() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 256;
                            }
                            while (g72Var.c() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(g72Var.k()));
                            }
                            g72Var.d(iE);
                            continue;
                        case 258:
                            if ((i & 512) != 512) {
                                this.compilerPluginData_ = new ArrayList();
                                i |= 512;
                            }
                            this.compilerPluginData_.add((oya) g72Var.g(oya.b, o85Var));
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
                if ((i & 4) == 4) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if ((i & 256) == 256) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if ((i & 512) == 512) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
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
        if ((i & 4) == 4) {
            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
        }
        if ((i & 256) == 256) {
            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
        }
        if ((i & 512) == 512) {
            this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
        q();
    }

    public final List K() {
        return this.annotation_;
    }

    public final List L() {
        return this.compilerPluginData_;
    }

    public final vza M() {
        return this.expandedType_;
    }

    public final int N() {
        return this.expandedTypeId_;
    }

    public final int O() {
        return this.flags_;
    }

    public final int P() {
        return this.name_;
    }

    public final List Q() {
        return this.typeParameter_;
    }

    public final vza R() {
        return this.underlyingType_;
    }

    public final int S() {
        return this.underlyingTypeId_;
    }

    public final List T() {
        return this.versionRequirement_;
    }

    public final boolean U() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean V() {
        return (this.bitField0_ & 32) == 32;
    }

    public final boolean W() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean X() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean Y() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean Z() {
        return (this.bitField0_ & 8) == 8;
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
        if (!X()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            if (!this.typeParameter_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (Y() && !this.underlyingType_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (U() && !this.expandedType_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            if (!this.annotation_.get(i2).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.compilerPluginData_.size(); i3++) {
            if (!this.compilerPluginData_.get(i3).b()) {
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

    @Override // defpackage.ut8
    public final l56 c() {
        wza wzaVarL = wza.l();
        wzaVarL.m(this);
        return wzaVarL;
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
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            p90Var.j0(3, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 4) == 4) {
            p90Var.j0(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            p90Var.h0(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            p90Var.j0(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            p90Var.h0(7, this.expandedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            p90Var.j0(8, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            p90Var.h0(31, this.versionRequirement_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
            p90Var.j0(32, this.compilerPluginData_.get(i4));
        }
        fz3Var.y(200, p90Var);
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        List<Integer> list;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 1) == 1 ? p90.o(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iO += p90.o(2, this.name_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            iO += p90.q(3, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 4) == 4) {
            iO += p90.q(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iO += p90.o(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iO += p90.q(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iO += p90.o(7, this.expandedTypeId_);
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            iO += p90.q(8, this.annotation_.get(i3));
        }
        int i4 = 0;
        int iP = 0;
        while (true) {
            int size = this.versionRequirement_.size();
            list = this.versionRequirement_;
            if (i4 >= size) {
                break;
            }
            iP += p90.p(list.get(i4).intValue());
            i4++;
        }
        int size2 = (list.size() * 2) + iO + iP;
        for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
            size2 += p90.q(32, this.compilerPluginData_.get(i5));
        }
        int size3 = this.unknownFields.size() + l() + size2;
        this.memoizedSerializedSize = size3;
        return size3;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return wza.l();
    }

    public xza() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public xza(wza wzaVar) {
        super(wzaVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wzaVar.a;
    }
}
