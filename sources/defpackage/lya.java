package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lya extends p56 {
    public List E0;
    public List F0;
    public List G0;
    public List H0;
    public int I0;
    public vza J0;
    public int K0;
    public List L0;
    public b0b M0;
    public List N0;
    public i0b O0;
    public List P0;
    public List X;
    public List Y;
    public List Z;
    public int d;
    public int e;
    public int f;
    public int g;
    public List v;
    public List w;
    public List x;
    public List y;
    public List z;

    public static lya l() {
        lya lyaVar = new lya();
        lyaVar.e = 6;
        List list = Collections.EMPTY_LIST;
        lyaVar.v = list;
        lyaVar.w = list;
        lyaVar.x = list;
        lyaVar.y = list;
        lyaVar.z = list;
        lyaVar.X = list;
        lyaVar.Y = list;
        lyaVar.Z = list;
        lyaVar.E0 = list;
        lyaVar.F0 = list;
        lyaVar.G0 = list;
        lyaVar.H0 = list;
        lyaVar.J0 = vza.a;
        lyaVar.L0 = list;
        lyaVar.M0 = b0b.a;
        lyaVar.N0 = list;
        lyaVar.O0 = i0b.a;
        lyaVar.P0 = list;
        return lyaVar;
    }

    public final Object clone() {
        lya lyaVarL = l();
        lyaVarL.m(k());
        return lyaVarL;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        nya nyaVarK = k();
        if (nyaVarK.b()) {
            return nyaVarK;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        nya nyaVar = null;
        try {
            try {
                nya.b.getClass();
                m(new nya(g72Var, o85Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (nyaVar != null) {
                    m(nyaVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            nya nyaVar2 = (nya) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                nyaVar = nyaVar2;
                if (nyaVar != null) {
                    m(nyaVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        m((nya) u56Var);
        return this;
    }

    public final nya k() {
        nya nyaVar = new nya(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        nyaVar.flags_ = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        nyaVar.fqName_ = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        nyaVar.companionObjectName_ = this.g;
        if ((this.d & 8) == 8) {
            this.v = Collections.unmodifiableList(this.v);
            this.d &= -9;
        }
        nyaVar.typeParameter_ = this.v;
        if ((this.d & 16) == 16) {
            this.w = Collections.unmodifiableList(this.w);
            this.d &= -17;
        }
        nyaVar.supertype_ = this.w;
        if ((this.d & 32) == 32) {
            this.x = Collections.unmodifiableList(this.x);
            this.d &= -33;
        }
        nyaVar.supertypeId_ = this.x;
        if ((this.d & 64) == 64) {
            this.y = Collections.unmodifiableList(this.y);
            this.d &= -65;
        }
        nyaVar.nestedClassName_ = this.y;
        if ((this.d & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            this.z = Collections.unmodifiableList(this.z);
            this.d &= -129;
        }
        nyaVar.contextReceiverType_ = this.z;
        if ((this.d & 256) == 256) {
            this.X = Collections.unmodifiableList(this.X);
            this.d &= -257;
        }
        nyaVar.contextReceiverTypeId_ = this.X;
        if ((this.d & 512) == 512) {
            this.Y = Collections.unmodifiableList(this.Y);
            this.d &= -513;
        }
        nyaVar.constructor_ = this.Y;
        if ((this.d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
            this.Z = Collections.unmodifiableList(this.Z);
            this.d &= -1025;
        }
        nyaVar.function_ = this.Z;
        if ((this.d & 2048) == 2048) {
            this.E0 = Collections.unmodifiableList(this.E0);
            this.d &= -2049;
        }
        nyaVar.property_ = this.E0;
        if ((this.d & 4096) == 4096) {
            this.F0 = Collections.unmodifiableList(this.F0);
            this.d &= -4097;
        }
        nyaVar.typeAlias_ = this.F0;
        if ((this.d & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
            this.G0 = Collections.unmodifiableList(this.G0);
            this.d &= -8193;
        }
        nyaVar.enumEntry_ = this.G0;
        if ((this.d & 16384) == 16384) {
            this.H0 = Collections.unmodifiableList(this.H0);
            this.d &= -16385;
        }
        nyaVar.sealedSubclassFqName_ = this.H0;
        if ((i & 32768) == 32768) {
            i2 |= 8;
        }
        nyaVar.inlineClassUnderlyingPropertyName_ = this.I0;
        if ((i & 65536) == 65536) {
            i2 |= 16;
        }
        nyaVar.inlineClassUnderlyingType_ = this.J0;
        if ((i & 131072) == 131072) {
            i2 |= 32;
        }
        nyaVar.inlineClassUnderlyingTypeId_ = this.K0;
        if ((this.d & 262144) == 262144) {
            this.L0 = Collections.unmodifiableList(this.L0);
            this.d &= -262145;
        }
        nyaVar.annotation_ = this.L0;
        if ((i & 524288) == 524288) {
            i2 |= 64;
        }
        nyaVar.typeTable_ = this.M0;
        if ((this.d & 1048576) == 1048576) {
            this.N0 = Collections.unmodifiableList(this.N0);
            this.d &= -1048577;
        }
        nyaVar.versionRequirement_ = this.N0;
        if ((i & 2097152) == 2097152) {
            i2 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        nyaVar.versionRequirementTable_ = this.O0;
        if ((this.d & 4194304) == 4194304) {
            this.P0 = Collections.unmodifiableList(this.P0);
            this.d &= -4194305;
        }
        nyaVar.compilerPluginData_ = this.P0;
        nyaVar.bitField0_ = i2;
        return nyaVar;
    }

    public final void m(nya nyaVar) {
        i0b i0bVar;
        b0b b0bVar;
        vza vzaVar;
        if (nyaVar == nya.a) {
            return;
        }
        if (nyaVar.G0()) {
            int iP0 = nyaVar.p0();
            this.d |= 1;
            this.e = iP0;
        }
        if (nyaVar.H0()) {
            int iQ0 = nyaVar.q0();
            this.d |= 2;
            this.f = iQ0;
        }
        if (nyaVar.F0()) {
            int iJ0 = nyaVar.j0();
            this.d |= 4;
            this.g = iJ0;
        }
        if (!nyaVar.typeParameter_.isEmpty()) {
            if (this.v.isEmpty()) {
                this.v = nyaVar.typeParameter_;
                this.d &= -9;
            } else {
                if ((this.d & 8) != 8) {
                    this.v = new ArrayList(this.v);
                    this.d |= 8;
                }
                this.v.addAll(nyaVar.typeParameter_);
            }
        }
        if (!nyaVar.supertype_.isEmpty()) {
            if (this.w.isEmpty()) {
                this.w = nyaVar.supertype_;
                this.d &= -17;
            } else {
                if ((this.d & 16) != 16) {
                    this.w = new ArrayList(this.w);
                    this.d |= 16;
                }
                this.w.addAll(nyaVar.supertype_);
            }
        }
        if (!nyaVar.supertypeId_.isEmpty()) {
            if (this.x.isEmpty()) {
                this.x = nyaVar.supertypeId_;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.x = new ArrayList(this.x);
                    this.d |= 32;
                }
                this.x.addAll(nyaVar.supertypeId_);
            }
        }
        if (!nyaVar.nestedClassName_.isEmpty()) {
            if (this.y.isEmpty()) {
                this.y = nyaVar.nestedClassName_;
                this.d &= -65;
            } else {
                if ((this.d & 64) != 64) {
                    this.y = new ArrayList(this.y);
                    this.d |= 64;
                }
                this.y.addAll(nyaVar.nestedClassName_);
            }
        }
        if (!nyaVar.contextReceiverType_.isEmpty()) {
            if (this.z.isEmpty()) {
                this.z = nyaVar.contextReceiverType_;
                this.d &= -129;
            } else {
                if ((this.d & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 128) {
                    this.z = new ArrayList(this.z);
                    this.d |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                this.z.addAll(nyaVar.contextReceiverType_);
            }
        }
        if (!nyaVar.contextReceiverTypeId_.isEmpty()) {
            if (this.X.isEmpty()) {
                this.X = nyaVar.contextReceiverTypeId_;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.X = new ArrayList(this.X);
                    this.d |= 256;
                }
                this.X.addAll(nyaVar.contextReceiverTypeId_);
            }
        }
        if (!nyaVar.constructor_.isEmpty()) {
            if (this.Y.isEmpty()) {
                this.Y = nyaVar.constructor_;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.Y = new ArrayList(this.Y);
                    this.d |= 512;
                }
                this.Y.addAll(nyaVar.constructor_);
            }
        }
        if (!nyaVar.function_.isEmpty()) {
            if (this.Z.isEmpty()) {
                this.Z = nyaVar.function_;
                this.d &= -1025;
            } else {
                if ((this.d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 1024) {
                    this.Z = new ArrayList(this.Z);
                    this.d |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                this.Z.addAll(nyaVar.function_);
            }
        }
        if (!nyaVar.property_.isEmpty()) {
            if (this.E0.isEmpty()) {
                this.E0 = nyaVar.property_;
                this.d &= -2049;
            } else {
                if ((this.d & 2048) != 2048) {
                    this.E0 = new ArrayList(this.E0);
                    this.d |= 2048;
                }
                this.E0.addAll(nyaVar.property_);
            }
        }
        if (!nyaVar.typeAlias_.isEmpty()) {
            if (this.F0.isEmpty()) {
                this.F0 = nyaVar.typeAlias_;
                this.d &= -4097;
            } else {
                if ((this.d & 4096) != 4096) {
                    this.F0 = new ArrayList(this.F0);
                    this.d |= 4096;
                }
                this.F0.addAll(nyaVar.typeAlias_);
            }
        }
        if (!nyaVar.enumEntry_.isEmpty()) {
            if (this.G0.isEmpty()) {
                this.G0 = nyaVar.enumEntry_;
                this.d &= -8193;
            } else {
                if ((this.d & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 8192) {
                    this.G0 = new ArrayList(this.G0);
                    this.d |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                this.G0.addAll(nyaVar.enumEntry_);
            }
        }
        if (!nyaVar.sealedSubclassFqName_.isEmpty()) {
            if (this.H0.isEmpty()) {
                this.H0 = nyaVar.sealedSubclassFqName_;
                this.d &= -16385;
            } else {
                if ((this.d & 16384) != 16384) {
                    this.H0 = new ArrayList(this.H0);
                    this.d |= 16384;
                }
                this.H0.addAll(nyaVar.sealedSubclassFqName_);
            }
        }
        if (nyaVar.I0()) {
            int iS0 = nyaVar.s0();
            this.d |= 32768;
            this.I0 = iS0;
        }
        if (nyaVar.J0()) {
            vza vzaVarT0 = nyaVar.t0();
            if ((this.d & 65536) != 65536 || (vzaVar = this.J0) == vza.a) {
                this.J0 = vzaVarT0;
            } else {
                uza uzaVarR0 = vza.r0(vzaVar);
                uzaVarR0.m(vzaVarT0);
                this.J0 = uzaVarR0.k();
            }
            this.d |= 65536;
        }
        if (nyaVar.K0()) {
            int iU0 = nyaVar.u0();
            this.d |= 131072;
            this.K0 = iU0;
        }
        if (!nyaVar.annotation_.isEmpty()) {
            if (this.L0.isEmpty()) {
                this.L0 = nyaVar.annotation_;
                this.d &= -262145;
            } else {
                if ((this.d & 262144) != 262144) {
                    this.L0 = new ArrayList(this.L0);
                    this.d |= 262144;
                }
                this.L0.addAll(nyaVar.annotation_);
            }
        }
        if (nyaVar.L0()) {
            b0b b0bVarC0 = nyaVar.C0();
            if ((this.d & 524288) != 524288 || (b0bVar = this.M0) == b0b.a) {
                this.M0 = b0bVarC0;
            } else {
                jya jyaVarR = b0b.r(b0bVar);
                jyaVarR.m(b0bVarC0);
                this.M0 = jyaVarR.k();
            }
            this.d |= 524288;
        }
        if (!nyaVar.versionRequirement_.isEmpty()) {
            if (this.N0.isEmpty()) {
                this.N0 = nyaVar.versionRequirement_;
                this.d &= -1048577;
            } else {
                if ((this.d & 1048576) != 1048576) {
                    this.N0 = new ArrayList(this.N0);
                    this.d |= 1048576;
                }
                this.N0.addAll(nyaVar.versionRequirement_);
            }
        }
        if (nyaVar.M0()) {
            i0b i0bVarE0 = nyaVar.E0();
            if ((this.d & 2097152) != 2097152 || (i0bVar = this.O0) == i0b.a) {
                this.O0 = i0bVarE0;
            } else {
                rya ryaVar = new rya(2);
                ryaVar.d = Collections.EMPTY_LIST;
                ryaVar.q(i0bVar);
                ryaVar.q(i0bVarE0);
                this.O0 = ryaVar.m();
            }
            this.d |= 2097152;
        }
        if (!nyaVar.compilerPluginData_.isEmpty()) {
            if (this.P0.isEmpty()) {
                this.P0 = nyaVar.compilerPluginData_;
                this.d &= -4194305;
            } else {
                if ((this.d & 4194304) != 4194304) {
                    this.P0 = new ArrayList(this.P0);
                    this.d |= 4194304;
                }
                this.P0.addAll(nyaVar.compilerPluginData_);
            }
        }
        j(nyaVar);
        this.a = this.a.c(nyaVar.unknownFields);
    }
}
