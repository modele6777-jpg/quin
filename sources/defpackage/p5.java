package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p5 extends em3 implements c8f {
    public final dsf f;
    public final boolean g;
    public final int v;
    public final ee8 w;
    public final ee8 x;
    public final ge8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(int i, h10 h10Var, bm3 bm3Var, ge8 ge8Var, t99 t99Var, dsf dsfVar, boolean z) {
        super(bm3Var, h10Var, t99Var, ntd.T);
        int i2 = 0;
        if (ge8Var == null) {
            k0(0);
            throw null;
        }
        int i3 = 1;
        if (bm3Var == null) {
            k0(1);
            throw null;
        }
        if (h10Var == null) {
            k0(2);
            throw null;
        }
        if (t99Var == null) {
            k0(3);
            throw null;
        }
        if (dsfVar == null) {
            k0(4);
            throw null;
        }
        this.f = dsfVar;
        this.g = z;
        this.v = i;
        this.w = new ee8(ge8Var, new n5(i2, this, ge8Var));
        this.x = new ee8(ge8Var, new n5(i3, this, t99Var));
        this.y = ge8Var;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                i2 = 2;
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getDefaultType";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "getOriginal";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                throw new IllegalStateException(str2);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return fm3Var.f(this, obj);
    }

    public abstract List E0();

    @Override // defpackage.c8f
    public final ge8 L() {
        ge8 ge8Var = this.y;
        if (ge8Var != null) {
            return ge8Var;
        }
        k0(14);
        throw null;
    }

    @Override // defpackage.c8f
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.y22
    public final tjd S() {
        tjd tjdVar = (tjd) this.x.invoke();
        if (tjdVar != null) {
            return tjdVar;
        }
        k0(10);
        throw null;
    }

    @Override // defpackage.c8f
    public final int getIndex() {
        return this.v;
    }

    @Override // defpackage.c8f
    public final List getUpperBounds() {
        return ((o5) h()).e();
    }

    @Override // defpackage.c8f, defpackage.y22
    public final j7f h() {
        j7f j7fVar = (j7f) this.w.invoke();
        if (j7fVar != null) {
            return j7fVar;
        }
        k0(9);
        throw null;
    }

    @Override // defpackage.c8f
    public final boolean s() {
        return this.g;
    }

    @Override // defpackage.c8f
    public final dsf x() {
        dsf dsfVar = this.f;
        if (dsfVar != null) {
            return dsfVar;
        }
        k0(7);
        throw null;
    }

    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    public final bm3 a() {
        return this;
    }

    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    public final c8f a() {
        return this;
    }

    @Override // defpackage.em3
    /* JADX INFO: renamed from: C0 */
    public final dm3 a() {
        return this;
    }

    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    public final y22 a() {
        return this;
    }

    public List D0(List list) {
        return list;
    }
}
