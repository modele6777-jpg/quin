package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nya extends q56 {
    public static final nya a;
    public static final gl7 b = new gl7(8);
    private List<kya> annotation_;
    private int bitField0_;
    private int companionObjectName_;
    private List<oya> compilerPluginData_;
    private List<qya> constructor_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<vza> contextReceiverType_;
    private List<yya> enumEntry_;
    private int flags_;
    private int fqName_;
    private List<dza> function_;
    private int inlineClassUnderlyingPropertyName_;
    private int inlineClassUnderlyingTypeId_;
    private vza inlineClassUnderlyingType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int nestedClassNameMemoizedSerializedSize;
    private List<Integer> nestedClassName_;
    private List<kza> property_;
    private int sealedSubclassFqNameMemoizedSerializedSize;
    private List<Integer> sealedSubclassFqName_;
    private int supertypeIdMemoizedSerializedSize;
    private List<Integer> supertypeId_;
    private List<vza> supertype_;
    private List<xza> typeAlias_;
    private List<a0b> typeParameter_;
    private b0b typeTable_;
    private final z61 unknownFields;
    private i0b versionRequirementTable_;
    private List<Integer> versionRequirement_;

    static {
        nya nyaVar = new nya();
        a = nyaVar;
        nyaVar.N0();
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public nya(defpackage.g72 r22, defpackage.o85 r23) {
        /*
            Method dump skipped, instruction units count: 1620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nya.<init>(g72, o85):void");
    }

    public final List A0() {
        return this.typeAlias_;
    }

    public final List B0() {
        return this.typeParameter_;
    }

    public final b0b C0() {
        return this.typeTable_;
    }

    public final List D0() {
        return this.versionRequirement_;
    }

    public final i0b E0() {
        return this.versionRequirementTable_;
    }

    public final boolean F0() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean G0() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean H0() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean I0() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean J0() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean K0() {
        return (this.bitField0_ & 32) == 32;
    }

    public final boolean L0() {
        return (this.bitField0_ & 64) == 64;
    }

    public final boolean M0() {
        return (this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128;
    }

    public final void N0() {
        this.flags_ = 6;
        this.fqName_ = 0;
        this.companionObjectName_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        this.supertype_ = list;
        this.supertypeId_ = list;
        this.nestedClassName_ = list;
        this.contextReceiverType_ = list;
        this.contextReceiverTypeId_ = list;
        this.constructor_ = list;
        this.function_ = list;
        this.property_ = list;
        this.typeAlias_ = list;
        this.enumEntry_ = list;
        this.sealedSubclassFqName_ = list;
        this.inlineClassUnderlyingPropertyName_ = 0;
        this.inlineClassUnderlyingType_ = vza.a;
        this.inlineClassUnderlyingTypeId_ = 0;
        this.annotation_ = list;
        this.typeTable_ = b0b.a;
        this.versionRequirement_ = list;
        this.versionRequirementTable_ = i0b.a;
        this.compilerPluginData_ = list;
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
        if (!H0()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            if (!this.typeParameter_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.supertype_.size(); i2++) {
            if (!this.supertype_.get(i2).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            if (!this.contextReceiverType_.get(i3).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.constructor_.size(); i4++) {
            if (!this.constructor_.get(i4).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.function_.size(); i5++) {
            if (!this.function_.get(i5).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.property_.size(); i6++) {
            if (!this.property_.get(i6).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.typeAlias_.size(); i7++) {
            if (!this.typeAlias_.get(i7).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.enumEntry_.size(); i8++) {
            if (!this.enumEntry_.get(i8).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (J0() && !this.inlineClassUnderlyingType_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.annotation_.size(); i9++) {
            if (!this.annotation_.get(i9).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (L0() && !this.typeTable_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.compilerPluginData_.size(); i10++) {
            if (!this.compilerPluginData_.get(i10).b()) {
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
        lya lyaVarL = lya.l();
        lyaVarL.m(this);
        return lyaVarL;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        fz3 fz3Var = new fz3(this);
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(1, this.flags_);
        }
        if (this.supertypeId_.size() > 0) {
            p90Var.q0(18);
            p90Var.q0(this.supertypeIdMemoizedSerializedSize);
        }
        for (int i = 0; i < this.supertypeId_.size(); i++) {
            p90Var.i0(this.supertypeId_.get(i).intValue());
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.h0(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            p90Var.h0(4, this.companionObjectName_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            p90Var.j0(5, this.typeParameter_.get(i2));
        }
        for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
            p90Var.j0(6, this.supertype_.get(i3));
        }
        if (this.nestedClassName_.size() > 0) {
            p90Var.q0(58);
            p90Var.q0(this.nestedClassNameMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
            p90Var.i0(this.nestedClassName_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
            p90Var.j0(8, this.constructor_.get(i5));
        }
        for (int i6 = 0; i6 < this.function_.size(); i6++) {
            p90Var.j0(9, this.function_.get(i6));
        }
        for (int i7 = 0; i7 < this.property_.size(); i7++) {
            p90Var.j0(10, this.property_.get(i7));
        }
        for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
            p90Var.j0(11, this.typeAlias_.get(i8));
        }
        for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
            p90Var.j0(13, this.enumEntry_.get(i9));
        }
        if (this.sealedSubclassFqName_.size() > 0) {
            p90Var.q0(130);
            p90Var.q0(this.sealedSubclassFqNameMemoizedSerializedSize);
        }
        for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
            p90Var.i0(this.sealedSubclassFqName_.get(i10).intValue());
        }
        if ((this.bitField0_ & 8) == 8) {
            p90Var.h0(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            p90Var.j0(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            p90Var.h0(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i11 = 0; i11 < this.contextReceiverType_.size(); i11++) {
            p90Var.j0(20, this.contextReceiverType_.get(i11));
        }
        if (this.contextReceiverTypeId_.size() > 0) {
            p90Var.q0(170);
            p90Var.q0(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i12 = 0; i12 < this.contextReceiverTypeId_.size(); i12++) {
            p90Var.i0(this.contextReceiverTypeId_.get(i12).intValue());
        }
        for (int i13 = 0; i13 < this.annotation_.size(); i13++) {
            p90Var.j0(25, this.annotation_.get(i13));
        }
        if ((this.bitField0_ & 64) == 64) {
            p90Var.j0(30, this.typeTable_);
        }
        for (int i14 = 0; i14 < this.versionRequirement_.size(); i14++) {
            p90Var.h0(31, this.versionRequirement_.get(i14).intValue());
        }
        if ((this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            p90Var.j0(32, this.versionRequirementTable_);
        }
        for (int i15 = 0; i15 < this.compilerPluginData_.size(); i15++) {
            p90Var.j0(33, this.compilerPluginData_.get(i15));
        }
        fz3Var.y(19000, p90Var);
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        List<Integer> list;
        List<Integer> list2;
        List<Integer> list3;
        List<Integer> list4;
        List<Integer> list5;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 1) == 1 ? p90.o(1, this.flags_) : 0;
        int i2 = 0;
        int iP = 0;
        while (true) {
            int size = this.supertypeId_.size();
            list = this.supertypeId_;
            if (i2 >= size) {
                break;
            }
            iP += p90.p(list.get(i2).intValue());
            i2++;
        }
        int iQ = iO + iP;
        if (!list.isEmpty()) {
            iQ = iQ + 1 + p90.p(iP);
        }
        this.supertypeIdMemoizedSerializedSize = iP;
        if ((this.bitField0_ & 2) == 2) {
            iQ += p90.o(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iQ += p90.o(4, this.companionObjectName_);
        }
        for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
            iQ += p90.q(5, this.typeParameter_.get(i3));
        }
        for (int i4 = 0; i4 < this.supertype_.size(); i4++) {
            iQ += p90.q(6, this.supertype_.get(i4));
        }
        int i5 = 0;
        int iP2 = 0;
        while (true) {
            int size2 = this.nestedClassName_.size();
            list2 = this.nestedClassName_;
            if (i5 >= size2) {
                break;
            }
            iP2 += p90.p(list2.get(i5).intValue());
            i5++;
        }
        int iQ2 = iQ + iP2;
        if (!list2.isEmpty()) {
            iQ2 = iQ2 + 1 + p90.p(iP2);
        }
        this.nestedClassNameMemoizedSerializedSize = iP2;
        for (int i6 = 0; i6 < this.constructor_.size(); i6++) {
            iQ2 += p90.q(8, this.constructor_.get(i6));
        }
        for (int i7 = 0; i7 < this.function_.size(); i7++) {
            iQ2 += p90.q(9, this.function_.get(i7));
        }
        for (int i8 = 0; i8 < this.property_.size(); i8++) {
            iQ2 += p90.q(10, this.property_.get(i8));
        }
        for (int i9 = 0; i9 < this.typeAlias_.size(); i9++) {
            iQ2 += p90.q(11, this.typeAlias_.get(i9));
        }
        for (int i10 = 0; i10 < this.enumEntry_.size(); i10++) {
            iQ2 += p90.q(13, this.enumEntry_.get(i10));
        }
        int i11 = 0;
        int iP3 = 0;
        while (true) {
            int size3 = this.sealedSubclassFqName_.size();
            list3 = this.sealedSubclassFqName_;
            if (i11 >= size3) {
                break;
            }
            iP3 += p90.p(list3.get(i11).intValue());
            i11++;
        }
        int iQ3 = iQ2 + iP3;
        if (!list3.isEmpty()) {
            iQ3 = iQ3 + 2 + p90.p(iP3);
        }
        this.sealedSubclassFqNameMemoizedSerializedSize = iP3;
        if ((this.bitField0_ & 8) == 8) {
            iQ3 += p90.o(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iQ3 += p90.q(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iQ3 += p90.o(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i12 = 0; i12 < this.contextReceiverType_.size(); i12++) {
            iQ3 += p90.q(20, this.contextReceiverType_.get(i12));
        }
        int i13 = 0;
        int iP4 = 0;
        while (true) {
            int size4 = this.contextReceiverTypeId_.size();
            list4 = this.contextReceiverTypeId_;
            if (i13 >= size4) {
                break;
            }
            iP4 += p90.p(list4.get(i13).intValue());
            i13++;
        }
        int iQ4 = iQ3 + iP4;
        if (!list4.isEmpty()) {
            iQ4 = iQ4 + 2 + p90.p(iP4);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iP4;
        for (int i14 = 0; i14 < this.annotation_.size(); i14++) {
            iQ4 += p90.q(25, this.annotation_.get(i14));
        }
        if ((this.bitField0_ & 64) == 64) {
            iQ4 += p90.q(30, this.typeTable_);
        }
        int i15 = 0;
        int iP5 = 0;
        while (true) {
            int size5 = this.versionRequirement_.size();
            list5 = this.versionRequirement_;
            if (i15 >= size5) {
                break;
            }
            iP5 += p90.p(list5.get(i15).intValue());
            i15++;
        }
        int size6 = (list5.size() * 2) + iQ4 + iP5;
        if ((this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            size6 += p90.q(32, this.versionRequirementTable_);
        }
        for (int i16 = 0; i16 < this.compilerPluginData_.size(); i16++) {
            size6 += p90.q(33, this.compilerPluginData_.get(i16));
        }
        int size7 = this.unknownFields.size() + l() + size6;
        this.memoizedSerializedSize = size7;
        return size7;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return lya.l();
    }

    public final List i0() {
        return this.annotation_;
    }

    public final int j0() {
        return this.companionObjectName_;
    }

    public final List k0() {
        return this.compilerPluginData_;
    }

    public final List l0() {
        return this.constructor_;
    }

    public final List m0() {
        return this.contextReceiverTypeId_;
    }

    public final List n0() {
        return this.contextReceiverType_;
    }

    public final List o0() {
        return this.enumEntry_;
    }

    public final int p0() {
        return this.flags_;
    }

    public final int q0() {
        return this.fqName_;
    }

    public final List r0() {
        return this.function_;
    }

    public final int s0() {
        return this.inlineClassUnderlyingPropertyName_;
    }

    public final vza t0() {
        return this.inlineClassUnderlyingType_;
    }

    public final int u0() {
        return this.inlineClassUnderlyingTypeId_;
    }

    public final List v0() {
        return this.nestedClassName_;
    }

    public final List w0() {
        return this.property_;
    }

    public final List x0() {
        return this.sealedSubclassFqName_;
    }

    public final List y0() {
        return this.supertypeId_;
    }

    public final List z0() {
        return this.supertype_;
    }

    public nya() {
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public nya(lya lyaVar) {
        super(lyaVar);
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = lyaVar.a;
    }
}
