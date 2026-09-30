package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 extends u09 {
    public final t99 a;
    public final ee8 b;
    public final ee8 c;
    public final ee8 d;

    public i0(ge8 ge8Var, t99 t99Var) {
        int i = 0;
        if (ge8Var == null) {
            s0(0);
            throw null;
        }
        int i2 = 1;
        if (t99Var == null) {
            s0(1);
            throw null;
        }
        this.a = t99Var;
        this.b = new ee8(ge8Var, new h0(this, i));
        this.c = new ee8(ge8Var, new h0(this, i2));
        this.d = new ee8(ge8Var, new h0(this, 2));
    }

    public static /* synthetic */ void s0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return fm3Var.w(this, obj);
    }

    @Override // defpackage.u09
    public final dr8 M(o8f o8fVar) {
        qz3.h(oz3.c(this));
        dr8 dr8VarZ = Z(o8fVar, zt7.p);
        if (dr8VarZ != null) {
            return dr8VarZ;
        }
        s0(16);
        throw null;
    }

    @Override // defpackage.u09, defpackage.y22
    public final tjd S() {
        tjd tjdVar = (tjd) this.b.invoke();
        if (tjdVar != null) {
            return tjdVar;
        }
        s0(20);
        throw null;
    }

    @Override // defpackage.u09
    public dr8 Z(o8f o8fVar, zt7 zt7Var) {
        if (!o8fVar.e()) {
            return new w7e(l0(zt7Var), new q8f(o8fVar));
        }
        dr8 dr8VarL0 = l0(zt7Var);
        if (dr8VarL0 != null) {
            return dr8VarL0;
        }
        s0(12);
        throw null;
    }

    @Override // defpackage.bm3
    public final t99 getName() {
        t99 t99Var = this.a;
        if (t99Var != null) {
            return t99Var;
        }
        s0(2);
        throw null;
    }

    @Override // defpackage.u09
    public final nw7 i0() {
        nw7 nw7Var = (nw7) this.d.invoke();
        if (nw7Var != null) {
            return nw7Var;
        }
        s0(5);
        throw null;
    }

    @Override // defpackage.u09
    public dr8 j0() {
        dr8 dr8Var = (dr8) this.c.invoke();
        if (dr8Var != null) {
            return dr8Var;
        }
        s0(4);
        throw null;
    }

    @Override // defpackage.u09
    public dr8 k0() {
        qz3.h(oz3.c(this));
        dr8 dr8VarL0 = l0(zt7.p);
        if (dr8VarL0 != null) {
            return dr8VarL0;
        }
        s0(17);
        throw null;
    }

    @Override // defpackage.v7e
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public u09 d(q8f q8fVar) {
        if (q8fVar != null) {
            return q8fVar.a.e() ? this : new y18(this, q8fVar);
        }
        s0(18);
        throw null;
    }

    @Override // defpackage.u09
    public List v() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s0(6);
        throw null;
    }

    @Override // defpackage.u09, defpackage.bm3
    public final bm3 a() {
        return this;
    }

    @Override // defpackage.u09, defpackage.bm3
    public final y22 a() {
        return this;
    }

    @Override // defpackage.u09
    /* JADX INFO: renamed from: a0 */
    public final u09 a() {
        return this;
    }
}
