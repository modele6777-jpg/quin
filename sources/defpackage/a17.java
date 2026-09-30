package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a17 implements mxe, gu2 {
    public Integer a;
    public Integer b;
    public ak c;
    public Integer d;
    public Integer e;
    public Integer f;

    public a17(Integer num, Integer num2, ak akVar, Integer num3, Integer num4, Integer num5) {
        this.a = num;
        this.b = num2;
        this.c = akVar;
        this.d = num3;
        this.e = num4;
        this.f = num5;
    }

    @Override // defpackage.mxe
    public final void A(Integer num) {
        this.a = num;
    }

    @Override // defpackage.mxe
    public final Integer B() {
        return this.a;
    }

    @Override // defpackage.mxe
    public final Integer C() {
        return this.e;
    }

    @Override // defpackage.mxe
    public final void E(Integer num) {
        this.e = num;
    }

    @Override // defpackage.mxe
    public final ak b() {
        return this.c;
    }

    @Override // defpackage.gu2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final a17 copy() {
        return new a17(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final kd8 d() {
        int iIntValue;
        int iIntValue2;
        Integer num = this.a;
        Integer num2 = this.b;
        ak akVar = ak.a;
        Integer numValueOf = null;
        if (num != null) {
            iIntValue = num.intValue();
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                qc0.o(ks0.k("Inconsistent hour and hour-of-am-pm: hour is ", iIntValue, ", but hour-of-am-pm is ", iIntValue2));
                return null;
            }
            ak akVar2 = this.c;
            if (akVar2 != null) {
                if ((akVar2 == akVar) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + akVar2).toString());
                }
            }
        } else {
            if (num2 != null) {
                int iIntValue3 = num2.intValue();
                ak akVar3 = this.c;
                if (akVar3 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (akVar3 != akVar ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new kg3("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        Integer num3 = this.d;
        idg.a(num3, "minute");
        int iIntValue4 = num3.intValue();
        Integer num4 = this.e;
        int iIntValue5 = num4 != null ? num4.intValue() : 0;
        Integer num5 = this.f;
        return new kd8(iIntValue, iIntValue4, iIntValue5, num5 != null ? num5.intValue() : 0);
    }

    @Override // defpackage.mxe
    public final void e(Integer num) {
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a17)) {
            return false;
        }
        a17 a17Var = (a17) obj;
        return pa7.t(this.a, a17Var.a) && pa7.t(this.b, a17Var.b) && this.c == a17Var.c && pa7.t(this.d, a17Var.d) && pa7.t(this.e, a17Var.e) && pa7.t(this.f, a17Var.f);
    }

    @Override // defpackage.mxe
    public final void f(Integer num) {
        this.f = num;
    }

    @Override // defpackage.mxe
    public final Integer h() {
        return this.d;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.b;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        ak akVar = this.c;
        int iHashCode = ((akVar != null ? akVar.hashCode() : 0) * 31) + iIntValue2;
        Integer num3 = this.d;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        Integer num4 = this.e;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        Integer num5 = this.f;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // defpackage.mxe
    public final void k(Integer num) {
        this.d = num;
    }

    @Override // defpackage.mxe
    public final Integer o() {
        return this.f;
    }

    @Override // defpackage.mxe
    public final Integer q() {
        return this.b;
    }

    @Override // defpackage.mxe
    public final void t(ak akVar) {
        this.c = akVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final String toString() {
        String strW;
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.d;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.e;
        sb.append(num != null ? num : "??");
        sb.append('.');
        Integer num2 = this.f;
        if (num2 != null) {
            String strValueOf = String.valueOf(num2.intValue());
            strW = v4e.W(9 - strValueOf.length(), strValueOf);
            if (strW == null) {
                strW = "???";
            }
        } else {
            strW = "???";
        }
        sb.append(strW);
        return sb.toString();
    }

    public /* synthetic */ a17() {
        this(null, null, null, null, null, null);
    }
}
