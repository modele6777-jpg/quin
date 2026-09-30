package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cza extends p56 {
    public List E0;
    public b0b F0;
    public List G0;
    public sya H0;
    public List I0;
    public List J0;
    public List K0;
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

    public static cza l() {
        cza czaVar = new cza();
        czaVar.e = 6;
        czaVar.f = 6;
        vza vzaVar = vza.a;
        czaVar.v = vzaVar;
        List list = Collections.EMPTY_LIST;
        czaVar.x = list;
        czaVar.y = vzaVar;
        czaVar.X = list;
        czaVar.Y = list;
        czaVar.Z = list;
        czaVar.E0 = list;
        czaVar.F0 = b0b.a;
        czaVar.G0 = list;
        czaVar.H0 = sya.a;
        czaVar.I0 = list;
        czaVar.J0 = list;
        czaVar.K0 = list;
        return czaVar;
    }

    public final Object clone() {
        cza czaVarL = l();
        czaVarL.m(k());
        return czaVarL;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        dza dzaVarK = k();
        if (dzaVarK.b()) {
            return dzaVarK;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        dza dzaVar = null;
        try {
            try {
                dza.b.getClass();
                m(new dza(g72Var, o85Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (dzaVar != null) {
                    m(dzaVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            dza dzaVar2 = (dza) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                dzaVar = dzaVar2;
                if (dzaVar != null) {
                    m(dzaVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        m((dza) u56Var);
        return this;
    }

    public final dza k() {
        dza dzaVar = new dza(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        dzaVar.flags_ = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        dzaVar.oldFlags_ = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        dzaVar.name_ = this.g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        dzaVar.returnType_ = this.v;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        dzaVar.returnTypeId_ = this.w;
        if ((this.d & 32) == 32) {
            this.x = Collections.unmodifiableList(this.x);
            this.d &= -33;
        }
        dzaVar.typeParameter_ = this.x;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        dzaVar.receiverType_ = this.y;
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            i2 |= 64;
        }
        dzaVar.receiverTypeId_ = this.z;
        if ((this.d & 256) == 256) {
            this.X = Collections.unmodifiableList(this.X);
            this.d &= -257;
        }
        dzaVar.contextReceiverType_ = this.X;
        if ((this.d & 512) == 512) {
            this.Y = Collections.unmodifiableList(this.Y);
            this.d &= -513;
        }
        dzaVar.contextReceiverTypeId_ = this.Y;
        if ((this.d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
            this.Z = Collections.unmodifiableList(this.Z);
            this.d &= -1025;
        }
        dzaVar.contextParameter_ = this.Z;
        if ((this.d & 2048) == 2048) {
            this.E0 = Collections.unmodifiableList(this.E0);
            this.d &= -2049;
        }
        dzaVar.valueParameter_ = this.E0;
        if ((i & 4096) == 4096) {
            i2 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        dzaVar.typeTable_ = this.F0;
        if ((this.d & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
            this.G0 = Collections.unmodifiableList(this.G0);
            this.d &= -8193;
        }
        dzaVar.versionRequirement_ = this.G0;
        if ((i & 16384) == 16384) {
            i2 |= 256;
        }
        dzaVar.contract_ = this.H0;
        if ((this.d & 32768) == 32768) {
            this.I0 = Collections.unmodifiableList(this.I0);
            this.d &= -32769;
        }
        dzaVar.compilerPluginData_ = this.I0;
        if ((this.d & 65536) == 65536) {
            this.J0 = Collections.unmodifiableList(this.J0);
            this.d &= -65537;
        }
        dzaVar.annotation_ = this.J0;
        if ((this.d & 131072) == 131072) {
            this.K0 = Collections.unmodifiableList(this.K0);
            this.d &= -131073;
        }
        dzaVar.extensionReceiverAnnotation_ = this.K0;
        dzaVar.bitField0_ = i2;
        return dzaVar;
    }

    public final void m(dza dzaVar) {
        sya syaVar;
        b0b b0bVar;
        vza vzaVar;
        vza vzaVar2;
        if (dzaVar == dza.a) {
            return;
        }
        if (dzaVar.r0()) {
            int iF0 = dzaVar.f0();
            this.d |= 1;
            this.e = iF0;
        }
        if (dzaVar.t0()) {
            int iH0 = dzaVar.h0();
            this.d |= 2;
            this.f = iH0;
        }
        if (dzaVar.s0()) {
            int iG0 = dzaVar.g0();
            this.d |= 4;
            this.g = iG0;
        }
        if (dzaVar.w0()) {
            vza vzaVarK0 = dzaVar.k0();
            if ((this.d & 8) != 8 || (vzaVar2 = this.v) == vza.a) {
                this.v = vzaVarK0;
            } else {
                uza uzaVarR0 = vza.r0(vzaVar2);
                uzaVarR0.m(vzaVarK0);
                this.v = uzaVarR0.k();
            }
            this.d |= 8;
        }
        if (dzaVar.x0()) {
            int iL0 = dzaVar.l0();
            this.d |= 16;
            this.w = iL0;
        }
        if (!dzaVar.typeParameter_.isEmpty()) {
            if (this.x.isEmpty()) {
                this.x = dzaVar.typeParameter_;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.x = new ArrayList(this.x);
                    this.d |= 32;
                }
                this.x.addAll(dzaVar.typeParameter_);
            }
        }
        if (dzaVar.u0()) {
            vza vzaVarI0 = dzaVar.i0();
            if ((this.d & 64) != 64 || (vzaVar = this.y) == vza.a) {
                this.y = vzaVarI0;
            } else {
                uza uzaVarR1 = vza.r0(vzaVar);
                uzaVarR1.m(vzaVarI0);
                this.y = uzaVarR1.k();
            }
            this.d |= 64;
        }
        if (dzaVar.v0()) {
            int iJ0 = dzaVar.j0();
            this.d |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            this.z = iJ0;
        }
        if (!dzaVar.contextReceiverType_.isEmpty()) {
            if (this.X.isEmpty()) {
                this.X = dzaVar.contextReceiverType_;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.X = new ArrayList(this.X);
                    this.d |= 256;
                }
                this.X.addAll(dzaVar.contextReceiverType_);
            }
        }
        if (!dzaVar.contextReceiverTypeId_.isEmpty()) {
            if (this.Y.isEmpty()) {
                this.Y = dzaVar.contextReceiverTypeId_;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.Y = new ArrayList(this.Y);
                    this.d |= 512;
                }
                this.Y.addAll(dzaVar.contextReceiverTypeId_);
            }
        }
        if (!dzaVar.contextParameter_.isEmpty()) {
            if (this.Z.isEmpty()) {
                this.Z = dzaVar.contextParameter_;
                this.d &= -1025;
            } else {
                if ((this.d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 1024) {
                    this.Z = new ArrayList(this.Z);
                    this.d |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                this.Z.addAll(dzaVar.contextParameter_);
            }
        }
        if (!dzaVar.valueParameter_.isEmpty()) {
            if (this.E0.isEmpty()) {
                this.E0 = dzaVar.valueParameter_;
                this.d &= -2049;
            } else {
                if ((this.d & 2048) != 2048) {
                    this.E0 = new ArrayList(this.E0);
                    this.d |= 2048;
                }
                this.E0.addAll(dzaVar.valueParameter_);
            }
        }
        if (dzaVar.y0()) {
            b0b b0bVarN0 = dzaVar.n0();
            if ((this.d & 4096) != 4096 || (b0bVar = this.F0) == b0b.a) {
                this.F0 = b0bVarN0;
            } else {
                jya jyaVarR = b0b.r(b0bVar);
                jyaVarR.m(b0bVarN0);
                this.F0 = jyaVarR.k();
            }
            this.d |= 4096;
        }
        if (!dzaVar.versionRequirement_.isEmpty()) {
            if (this.G0.isEmpty()) {
                this.G0 = dzaVar.versionRequirement_;
                this.d &= -8193;
            } else {
                if ((this.d & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 8192) {
                    this.G0 = new ArrayList(this.G0);
                    this.d |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                this.G0.addAll(dzaVar.versionRequirement_);
            }
        }
        if (dzaVar.q0()) {
            sya syaVarD0 = dzaVar.d0();
            if ((this.d & 16384) != 16384 || (syaVar = this.H0) == sya.a) {
                this.H0 = syaVarD0;
            } else {
                rya ryaVarN = sya.n(syaVar);
                ryaVarN.n(syaVarD0);
                this.H0 = ryaVarN.j();
            }
            this.d |= 16384;
        }
        if (!dzaVar.compilerPluginData_.isEmpty()) {
            if (this.I0.isEmpty()) {
                this.I0 = dzaVar.compilerPluginData_;
                this.d &= -32769;
            } else {
                if ((this.d & 32768) != 32768) {
                    this.I0 = new ArrayList(this.I0);
                    this.d |= 32768;
                }
                this.I0.addAll(dzaVar.compilerPluginData_);
            }
        }
        if (!dzaVar.annotation_.isEmpty()) {
            if (this.J0.isEmpty()) {
                this.J0 = dzaVar.annotation_;
                this.d &= -65537;
            } else {
                if ((this.d & 65536) != 65536) {
                    this.J0 = new ArrayList(this.J0);
                    this.d |= 65536;
                }
                this.J0.addAll(dzaVar.annotation_);
            }
        }
        if (!dzaVar.extensionReceiverAnnotation_.isEmpty()) {
            if (this.K0.isEmpty()) {
                this.K0 = dzaVar.extensionReceiverAnnotation_;
                this.d &= -131073;
            } else {
                if ((this.d & 131072) != 131072) {
                    this.K0 = new ArrayList(this.K0);
                    this.d |= 131072;
                }
                this.K0.addAll(dzaVar.extensionReceiverAnnotation_);
            }
        }
        j(dzaVar);
        this.a = this.a.c(dzaVar.unknownFields);
    }
}
