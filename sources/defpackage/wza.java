package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wza extends p56 {
    public List X;
    public List Y;
    public int d;
    public int e;
    public int f;
    public List g;
    public vza v;
    public int w;
    public vza x;
    public int y;
    public List z;

    public static wza l() {
        wza wzaVar = new wza();
        wzaVar.e = 6;
        List list = Collections.EMPTY_LIST;
        wzaVar.g = list;
        vza vzaVar = vza.a;
        wzaVar.v = vzaVar;
        wzaVar.x = vzaVar;
        wzaVar.z = list;
        wzaVar.X = list;
        wzaVar.Y = list;
        return wzaVar;
    }

    public final Object clone() {
        wza wzaVarL = l();
        wzaVarL.m(k());
        return wzaVarL;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        xza xzaVarK = k();
        if (xzaVarK.b()) {
            return xzaVarK;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        xza xzaVar = null;
        try {
            try {
                xza.b.getClass();
                m(new xza(g72Var, o85Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (xzaVar != null) {
                    m(xzaVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            xza xzaVar2 = (xza) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                xzaVar = xzaVar2;
                if (xzaVar != null) {
                    m(xzaVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        m((xza) u56Var);
        return this;
    }

    public final xza k() {
        xza xzaVar = new xza(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        xzaVar.flags_ = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        xzaVar.name_ = this.f;
        if ((this.d & 4) == 4) {
            this.g = Collections.unmodifiableList(this.g);
            this.d &= -5;
        }
        xzaVar.typeParameter_ = this.g;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        xzaVar.underlyingType_ = this.v;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        xzaVar.underlyingTypeId_ = this.w;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        xzaVar.expandedType_ = this.x;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        xzaVar.expandedTypeId_ = this.y;
        if ((this.d & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            this.z = Collections.unmodifiableList(this.z);
            this.d &= -129;
        }
        xzaVar.annotation_ = this.z;
        if ((this.d & 256) == 256) {
            this.X = Collections.unmodifiableList(this.X);
            this.d &= -257;
        }
        xzaVar.versionRequirement_ = this.X;
        if ((this.d & 512) == 512) {
            this.Y = Collections.unmodifiableList(this.Y);
            this.d &= -513;
        }
        xzaVar.compilerPluginData_ = this.Y;
        xzaVar.bitField0_ = i2;
        return xzaVar;
    }

    public final void m(xza xzaVar) {
        vza vzaVar;
        vza vzaVar2;
        if (xzaVar == xza.a) {
            return;
        }
        if (xzaVar.W()) {
            int iO = xzaVar.O();
            this.d |= 1;
            this.e = iO;
        }
        if (xzaVar.X()) {
            int iP = xzaVar.P();
            this.d |= 2;
            this.f = iP;
        }
        if (!xzaVar.typeParameter_.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = xzaVar.typeParameter_;
                this.d &= -5;
            } else {
                if ((this.d & 4) != 4) {
                    this.g = new ArrayList(this.g);
                    this.d |= 4;
                }
                this.g.addAll(xzaVar.typeParameter_);
            }
        }
        if (xzaVar.Y()) {
            vza vzaVarR = xzaVar.R();
            if ((this.d & 8) != 8 || (vzaVar2 = this.v) == vza.a) {
                this.v = vzaVarR;
            } else {
                uza uzaVarR0 = vza.r0(vzaVar2);
                uzaVarR0.m(vzaVarR);
                this.v = uzaVarR0.k();
            }
            this.d |= 8;
        }
        if (xzaVar.Z()) {
            int iS = xzaVar.S();
            this.d |= 16;
            this.w = iS;
        }
        if (xzaVar.U()) {
            vza vzaVarM = xzaVar.M();
            if ((this.d & 32) != 32 || (vzaVar = this.x) == vza.a) {
                this.x = vzaVarM;
            } else {
                uza uzaVarR1 = vza.r0(vzaVar);
                uzaVarR1.m(vzaVarM);
                this.x = uzaVarR1.k();
            }
            this.d |= 32;
        }
        if (xzaVar.V()) {
            int iN = xzaVar.N();
            this.d |= 64;
            this.y = iN;
        }
        if (!xzaVar.annotation_.isEmpty()) {
            if (this.z.isEmpty()) {
                this.z = xzaVar.annotation_;
                this.d &= -129;
            } else {
                if ((this.d & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 128) {
                    this.z = new ArrayList(this.z);
                    this.d |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                this.z.addAll(xzaVar.annotation_);
            }
        }
        if (!xzaVar.versionRequirement_.isEmpty()) {
            if (this.X.isEmpty()) {
                this.X = xzaVar.versionRequirement_;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.X = new ArrayList(this.X);
                    this.d |= 256;
                }
                this.X.addAll(xzaVar.versionRequirement_);
            }
        }
        if (!xzaVar.compilerPluginData_.isEmpty()) {
            if (this.Y.isEmpty()) {
                this.Y = xzaVar.compilerPluginData_;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.Y = new ArrayList(this.Y);
                    this.d |= 512;
                }
                this.Y.addAll(xzaVar.compilerPluginData_);
            }
        }
        j(xzaVar);
        this.a = this.a.c(xzaVar.unknownFields);
    }
}
