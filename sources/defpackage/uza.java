package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uza extends p56 {
    public vza E0;
    public int F0;
    public int G0;
    public List H0;
    public int X;
    public vza Y;
    public int Z;
    public int d;
    public List e;
    public boolean f;
    public int g;
    public vza v;
    public int w;
    public int x;
    public int y;
    public int z;

    public static uza l() {
        uza uzaVar = new uza();
        List list = Collections.EMPTY_LIST;
        uzaVar.e = list;
        vza vzaVar = vza.a;
        uzaVar.v = vzaVar;
        uzaVar.Y = vzaVar;
        uzaVar.E0 = vzaVar;
        uzaVar.H0 = list;
        return uzaVar;
    }

    public final Object clone() {
        uza uzaVarL = l();
        uzaVarL.m(k());
        return uzaVarL;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        vza vzaVarK = k();
        if (vzaVarK.b()) {
            return vzaVarK;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        vza vzaVar = null;
        try {
            try {
                vza.b.getClass();
                m(new vza(g72Var, o85Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (vzaVar != null) {
                    m(vzaVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            vza vzaVar2 = (vza) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                vzaVar = vzaVar2;
                if (vzaVar != null) {
                    m(vzaVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        m((vza) u56Var);
        return this;
    }

    public final vza k() {
        vza vzaVar = new vza(this);
        int i = this.d;
        if ((i & 1) == 1) {
            this.e = Collections.unmodifiableList(this.e);
            this.d &= -2;
        }
        vzaVar.argument_ = this.e;
        int i2 = (i & 2) != 2 ? 0 : 1;
        vzaVar.nullable_ = this.f;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        vzaVar.flexibleTypeCapabilitiesId_ = this.g;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        vzaVar.flexibleUpperBound_ = this.v;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        vzaVar.flexibleUpperBoundId_ = this.w;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        vzaVar.className_ = this.x;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        vzaVar.typeParameter_ = this.y;
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            i2 |= 64;
        }
        vzaVar.typeParameterName_ = this.z;
        if ((i & 256) == 256) {
            i2 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        vzaVar.typeAliasName_ = this.X;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        vzaVar.outerType_ = this.Y;
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
            i2 |= 512;
        }
        vzaVar.outerTypeId_ = this.Z;
        if ((i & 2048) == 2048) {
            i2 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        vzaVar.abbreviatedType_ = this.E0;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        vzaVar.abbreviatedTypeId_ = this.F0;
        if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
            i2 |= 4096;
        }
        vzaVar.flags_ = this.G0;
        if ((this.d & 16384) == 16384) {
            this.H0 = Collections.unmodifiableList(this.H0);
            this.d &= -16385;
        }
        vzaVar.annotation_ = this.H0;
        vzaVar.bitField0_ = i2;
        return vzaVar;
    }

    public final uza m(vza vzaVar) {
        vza vzaVar2;
        vza vzaVar3;
        vza vzaVar4;
        vza vzaVar5 = vza.a;
        if (vzaVar == vzaVar5) {
            return this;
        }
        if (!vzaVar.argument_.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e = vzaVar.argument_;
                this.d &= -2;
            } else {
                if ((this.d & 1) != 1) {
                    this.e = new ArrayList(this.e);
                    this.d |= 1;
                }
                this.e.addAll(vzaVar.argument_);
            }
        }
        if (vzaVar.k0()) {
            boolean zX = vzaVar.X();
            this.d |= 2;
            this.f = zX;
        }
        if (vzaVar.h0()) {
            int iU = vzaVar.U();
            this.d |= 4;
            this.g = iU;
        }
        if (vzaVar.i0()) {
            vza vzaVarV = vzaVar.V();
            if ((this.d & 8) != 8 || (vzaVar4 = this.v) == vzaVar5) {
                this.v = vzaVarV;
            } else {
                uza uzaVarR0 = vza.r0(vzaVar4);
                uzaVarR0.m(vzaVarV);
                this.v = uzaVarR0.k();
            }
            this.d |= 8;
        }
        if (vzaVar.j0()) {
            int iW = vzaVar.W();
            this.d |= 16;
            this.w = iW;
        }
        if (vzaVar.f0()) {
            int iS = vzaVar.S();
            this.d |= 32;
            this.x = iS;
        }
        if (vzaVar.o0()) {
            int iB0 = vzaVar.b0();
            this.d |= 64;
            this.y = iB0;
        }
        if (vzaVar.p0()) {
            int iC0 = vzaVar.c0();
            this.d |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            this.z = iC0;
        }
        if (vzaVar.n0()) {
            int iA0 = vzaVar.a0();
            this.d |= 256;
            this.X = iA0;
        }
        if (vzaVar.l0()) {
            vza vzaVarY = vzaVar.Y();
            if ((this.d & 512) != 512 || (vzaVar3 = this.Y) == vzaVar5) {
                this.Y = vzaVarY;
            } else {
                uza uzaVarR1 = vza.r0(vzaVar3);
                uzaVarR1.m(vzaVarY);
                this.Y = uzaVarR1.k();
            }
            this.d |= 512;
        }
        if (vzaVar.m0()) {
            int iZ = vzaVar.Z();
            this.d |= UserMetadata.MAX_ATTRIBUTE_SIZE;
            this.Z = iZ;
        }
        if (vzaVar.d0()) {
            vza vzaVarN = vzaVar.N();
            if ((this.d & 2048) != 2048 || (vzaVar2 = this.E0) == vzaVar5) {
                this.E0 = vzaVarN;
            } else {
                uza uzaVarR2 = vza.r0(vzaVar2);
                uzaVarR2.m(vzaVarN);
                this.E0 = uzaVarR2.k();
            }
            this.d |= 2048;
        }
        if (vzaVar.e0()) {
            int iO = vzaVar.O();
            this.d |= 4096;
            this.F0 = iO;
        }
        if (vzaVar.g0()) {
            int iT = vzaVar.T();
            this.d |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
            this.G0 = iT;
        }
        if (!vzaVar.annotation_.isEmpty()) {
            if (this.H0.isEmpty()) {
                this.H0 = vzaVar.annotation_;
                this.d &= -16385;
            } else {
                if ((this.d & 16384) != 16384) {
                    this.H0 = new ArrayList(this.H0);
                    this.d |= 16384;
                }
                this.H0.addAll(vzaVar.annotation_);
            }
        }
        j(vzaVar);
        this.a = this.a.c(vzaVar.unknownFields);
        return this;
    }
}
