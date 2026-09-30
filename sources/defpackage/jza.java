package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jza extends p56 {
    public d0b E0;
    public int F0;
    public int G0;
    public List H0;
    public List I0;
    public List J0;
    public List K0;
    public List L0;
    public List M0;
    public List N0;
    public List O0;
    public sya P0;
    public sya Q0;
    public List X;
    public List Y;
    public List Z;
    public int d;
    public int e;
    public int f;
    public int g;
    public vza v;
    public int w;
    public List x;
    public vza y;
    public int z;

    public static jza l() {
        jza jzaVar = new jza();
        jzaVar.e = 518;
        jzaVar.f = 2054;
        vza vzaVar = vza.a;
        jzaVar.v = vzaVar;
        List list = Collections.EMPTY_LIST;
        jzaVar.x = list;
        jzaVar.y = vzaVar;
        jzaVar.X = list;
        jzaVar.Y = list;
        jzaVar.Z = list;
        jzaVar.E0 = d0b.a;
        jzaVar.H0 = list;
        jzaVar.I0 = list;
        jzaVar.J0 = list;
        jzaVar.K0 = list;
        jzaVar.L0 = list;
        jzaVar.M0 = list;
        jzaVar.N0 = list;
        jzaVar.O0 = list;
        sya syaVar = sya.a;
        jzaVar.P0 = syaVar;
        jzaVar.Q0 = syaVar;
        return jzaVar;
    }

    public final Object clone() {
        jza jzaVarL = l();
        jzaVarL.m(k());
        return jzaVarL;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        kza kzaVarK = k();
        if (kzaVarK.b()) {
            return kzaVarK;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        kza kzaVar = null;
        try {
            try {
                kza.b.getClass();
                m(new kza(g72Var, o85Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (kzaVar != null) {
                    m(kzaVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            kza kzaVar2 = (kza) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                kzaVar = kzaVar2;
                if (kzaVar != null) {
                    m(kzaVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        m((kza) u56Var);
        return this;
    }

    public final kza k() {
        kza kzaVar = new kza(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        kzaVar.flags_ = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        kzaVar.oldFlags_ = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        kzaVar.name_ = this.g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        kzaVar.returnType_ = this.v;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        kzaVar.returnTypeId_ = this.w;
        if ((this.d & 32) == 32) {
            this.x = Collections.unmodifiableList(this.x);
            this.d &= -33;
        }
        kzaVar.typeParameter_ = this.x;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        kzaVar.receiverType_ = this.y;
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            i2 |= 64;
        }
        kzaVar.receiverTypeId_ = this.z;
        if ((this.d & 256) == 256) {
            this.X = Collections.unmodifiableList(this.X);
            this.d &= -257;
        }
        kzaVar.contextReceiverType_ = this.X;
        if ((this.d & 512) == 512) {
            this.Y = Collections.unmodifiableList(this.Y);
            this.d &= -513;
        }
        kzaVar.contextReceiverTypeId_ = this.Y;
        if ((this.d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
            this.Z = Collections.unmodifiableList(this.Z);
            this.d &= -1025;
        }
        kzaVar.contextParameter_ = this.Z;
        if ((i & 2048) == 2048) {
            i2 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        kzaVar.setterValueParameter_ = this.E0;
        if ((i & 4096) == 4096) {
            i2 |= 256;
        }
        kzaVar.getterFlags_ = this.F0;
        if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
            i2 |= 512;
        }
        kzaVar.setterFlags_ = this.G0;
        if ((this.d & 16384) == 16384) {
            this.H0 = Collections.unmodifiableList(this.H0);
            this.d &= -16385;
        }
        kzaVar.versionRequirement_ = this.H0;
        if ((this.d & 32768) == 32768) {
            this.I0 = Collections.unmodifiableList(this.I0);
            this.d &= -32769;
        }
        kzaVar.compilerPluginData_ = this.I0;
        if ((this.d & 65536) == 65536) {
            this.J0 = Collections.unmodifiableList(this.J0);
            this.d &= -65537;
        }
        kzaVar.annotation_ = this.J0;
        if ((this.d & 131072) == 131072) {
            this.K0 = Collections.unmodifiableList(this.K0);
            this.d &= -131073;
        }
        kzaVar.getterAnnotation_ = this.K0;
        if ((this.d & 262144) == 262144) {
            this.L0 = Collections.unmodifiableList(this.L0);
            this.d &= -262145;
        }
        kzaVar.setterAnnotation_ = this.L0;
        if ((this.d & 524288) == 524288) {
            this.M0 = Collections.unmodifiableList(this.M0);
            this.d &= -524289;
        }
        kzaVar.extensionReceiverAnnotation_ = this.M0;
        if ((this.d & 1048576) == 1048576) {
            this.N0 = Collections.unmodifiableList(this.N0);
            this.d &= -1048577;
        }
        kzaVar.backingFieldAnnotation_ = this.N0;
        if ((this.d & 2097152) == 2097152) {
            this.O0 = Collections.unmodifiableList(this.O0);
            this.d &= -2097153;
        }
        kzaVar.delegateFieldAnnotation_ = this.O0;
        if ((i & 4194304) == 4194304) {
            i2 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        kzaVar.getterContract_ = this.P0;
        if ((i & 8388608) == 8388608) {
            i2 |= 2048;
        }
        kzaVar.setterContract_ = this.Q0;
        kzaVar.bitField0_ = i2;
        return kzaVar;
    }

    public final void m(kza kzaVar) {
        sya syaVar;
        sya syaVar2;
        d0b d0bVar;
        vza vzaVar;
        vza vzaVar2;
        if (kzaVar == kza.a) {
            return;
        }
        if (kzaVar.F0()) {
            int iP0 = kzaVar.p0();
            this.d |= 1;
            this.e = iP0;
        }
        if (kzaVar.J0()) {
            int iU0 = kzaVar.u0();
            this.d |= 2;
            this.f = iU0;
        }
        if (kzaVar.I0()) {
            int iT0 = kzaVar.t0();
            this.d |= 4;
            this.g = iT0;
        }
        if (kzaVar.M0()) {
            vza vzaVarX0 = kzaVar.x0();
            if ((this.d & 8) != 8 || (vzaVar2 = this.v) == vza.a) {
                this.v = vzaVarX0;
            } else {
                uza uzaVarR0 = vza.r0(vzaVar2);
                uzaVarR0.m(vzaVarX0);
                this.v = uzaVarR0.k();
            }
            this.d |= 8;
        }
        if (kzaVar.N0()) {
            int iY0 = kzaVar.y0();
            this.d |= 16;
            this.w = iY0;
        }
        if (!kzaVar.typeParameter_.isEmpty()) {
            if (this.x.isEmpty()) {
                this.x = kzaVar.typeParameter_;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.x = new ArrayList(this.x);
                    this.d |= 32;
                }
                this.x.addAll(kzaVar.typeParameter_);
            }
        }
        if (kzaVar.K0()) {
            vza vzaVarV0 = kzaVar.v0();
            if ((this.d & 64) != 64 || (vzaVar = this.y) == vza.a) {
                this.y = vzaVarV0;
            } else {
                uza uzaVarR1 = vza.r0(vzaVar);
                uzaVarR1.m(vzaVarV0);
                this.y = uzaVarR1.k();
            }
            this.d |= 64;
        }
        if (kzaVar.L0()) {
            int iW0 = kzaVar.w0();
            this.d |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            this.z = iW0;
        }
        if (!kzaVar.contextReceiverType_.isEmpty()) {
            if (this.X.isEmpty()) {
                this.X = kzaVar.contextReceiverType_;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.X = new ArrayList(this.X);
                    this.d |= 256;
                }
                this.X.addAll(kzaVar.contextReceiverType_);
            }
        }
        if (!kzaVar.contextReceiverTypeId_.isEmpty()) {
            if (this.Y.isEmpty()) {
                this.Y = kzaVar.contextReceiverTypeId_;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.Y = new ArrayList(this.Y);
                    this.d |= 512;
                }
                this.Y.addAll(kzaVar.contextReceiverTypeId_);
            }
        }
        if (!kzaVar.contextParameter_.isEmpty()) {
            if (this.Z.isEmpty()) {
                this.Z = kzaVar.contextParameter_;
                this.d &= -1025;
            } else {
                if ((this.d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 1024) {
                    this.Z = new ArrayList(this.Z);
                    this.d |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                this.Z.addAll(kzaVar.contextParameter_);
            }
        }
        if (kzaVar.Q0()) {
            d0b d0bVarC0 = kzaVar.C0();
            if ((this.d & 2048) != 2048 || (d0bVar = this.E0) == d0b.a) {
                this.E0 = d0bVarC0;
            } else {
                c0b c0bVarL = c0b.l();
                c0bVarL.m(d0bVar);
                c0bVarL.m(d0bVarC0);
                this.E0 = c0bVarL.k();
            }
            this.d |= 2048;
        }
        if (kzaVar.H0()) {
            int iS0 = kzaVar.s0();
            this.d |= 4096;
            this.F0 = iS0;
        }
        if (kzaVar.P0()) {
            int iB0 = kzaVar.B0();
            this.d |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
            this.G0 = iB0;
        }
        if (!kzaVar.versionRequirement_.isEmpty()) {
            if (this.H0.isEmpty()) {
                this.H0 = kzaVar.versionRequirement_;
                this.d &= -16385;
            } else {
                if ((this.d & 16384) != 16384) {
                    this.H0 = new ArrayList(this.H0);
                    this.d |= 16384;
                }
                this.H0.addAll(kzaVar.versionRequirement_);
            }
        }
        if (!kzaVar.compilerPluginData_.isEmpty()) {
            if (this.I0.isEmpty()) {
                this.I0 = kzaVar.compilerPluginData_;
                this.d &= -32769;
            } else {
                if ((this.d & 32768) != 32768) {
                    this.I0 = new ArrayList(this.I0);
                    this.d |= 32768;
                }
                this.I0.addAll(kzaVar.compilerPluginData_);
            }
        }
        if (!kzaVar.annotation_.isEmpty()) {
            if (this.J0.isEmpty()) {
                this.J0 = kzaVar.annotation_;
                this.d &= -65537;
            } else {
                if ((this.d & 65536) != 65536) {
                    this.J0 = new ArrayList(this.J0);
                    this.d |= 65536;
                }
                this.J0.addAll(kzaVar.annotation_);
            }
        }
        if (!kzaVar.getterAnnotation_.isEmpty()) {
            if (this.K0.isEmpty()) {
                this.K0 = kzaVar.getterAnnotation_;
                this.d &= -131073;
            } else {
                if ((this.d & 131072) != 131072) {
                    this.K0 = new ArrayList(this.K0);
                    this.d |= 131072;
                }
                this.K0.addAll(kzaVar.getterAnnotation_);
            }
        }
        if (!kzaVar.setterAnnotation_.isEmpty()) {
            if (this.L0.isEmpty()) {
                this.L0 = kzaVar.setterAnnotation_;
                this.d &= -262145;
            } else {
                if ((this.d & 262144) != 262144) {
                    this.L0 = new ArrayList(this.L0);
                    this.d |= 262144;
                }
                this.L0.addAll(kzaVar.setterAnnotation_);
            }
        }
        if (!kzaVar.extensionReceiverAnnotation_.isEmpty()) {
            if (this.M0.isEmpty()) {
                this.M0 = kzaVar.extensionReceiverAnnotation_;
                this.d &= -524289;
            } else {
                if ((this.d & 524288) != 524288) {
                    this.M0 = new ArrayList(this.M0);
                    this.d |= 524288;
                }
                this.M0.addAll(kzaVar.extensionReceiverAnnotation_);
            }
        }
        if (!kzaVar.backingFieldAnnotation_.isEmpty()) {
            if (this.N0.isEmpty()) {
                this.N0 = kzaVar.backingFieldAnnotation_;
                this.d &= -1048577;
            } else {
                if ((this.d & 1048576) != 1048576) {
                    this.N0 = new ArrayList(this.N0);
                    this.d |= 1048576;
                }
                this.N0.addAll(kzaVar.backingFieldAnnotation_);
            }
        }
        if (!kzaVar.delegateFieldAnnotation_.isEmpty()) {
            if (this.O0.isEmpty()) {
                this.O0 = kzaVar.delegateFieldAnnotation_;
                this.d &= -2097153;
            } else {
                if ((this.d & 2097152) != 2097152) {
                    this.O0 = new ArrayList(this.O0);
                    this.d |= 2097152;
                }
                this.O0.addAll(kzaVar.delegateFieldAnnotation_);
            }
        }
        if (kzaVar.G0()) {
            sya syaVarR0 = kzaVar.r0();
            if ((this.d & 4194304) != 4194304 || (syaVar2 = this.P0) == sya.a) {
                this.P0 = syaVarR0;
            } else {
                rya ryaVarN = sya.n(syaVar2);
                ryaVarN.n(syaVarR0);
                this.P0 = ryaVarN.j();
            }
            this.d |= 4194304;
        }
        if (kzaVar.O0()) {
            sya syaVarA0 = kzaVar.A0();
            if ((this.d & 8388608) != 8388608 || (syaVar = this.Q0) == sya.a) {
                this.Q0 = syaVarA0;
            } else {
                rya ryaVarN2 = sya.n(syaVar);
                ryaVarN2.n(syaVarA0);
                this.Q0 = ryaVarN2.j();
            }
            this.d |= 8388608;
        }
        j(kzaVar);
        this.a = this.a.c(kzaVar.unknownFields);
    }
}
