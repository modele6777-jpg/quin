package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bgf extends bk9 {
    public final Integer c;
    public final Integer d;
    public final ze0 e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public bgf(Integer num, Integer num2, ze0 ze0Var, String str, boolean z) {
        Integer num3 = num.equals(num2) ? num : null;
        super(str, num3);
        this.c = num;
        this.d = num2;
        this.e = ze0Var;
        this.f = z;
        if (num3 == null || new z67(1, 9, 1).e(num3.intValue())) {
            return;
        }
        ho7.x("Invalid length for field ", str, ": ", num3);
        throw null;
    }

    @Override // defpackage.bk9
    public final dk9 a(Object obj, CharSequence charSequence, int i, int i2) {
        Integer numValueOf;
        charSequence.getClass();
        Integer num = this.d;
        if (num != null && i2 - i > num.intValue()) {
            return new ff8(num.intValue(), 12);
        }
        int i3 = i2 - i;
        Integer num2 = this.c;
        if (i3 < num2.intValue()) {
            return new ff8(num2.intValue(), 11);
        }
        int iCharAt = 0;
        while (true) {
            if (i >= i2) {
                numValueOf = Integer.valueOf(iCharAt);
                break;
            }
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i) - '0');
            if (iCharAt < 0) {
                numValueOf = null;
                break;
            }
            i++;
        }
        if (numValueOf == null) {
            return ndb.f1;
        }
        boolean z = this.f;
        int iIntValue = numValueOf.intValue();
        if (z) {
            iIntValue = -iIntValue;
        }
        Object objE = this.e.e(obj, Integer.valueOf(iIntValue));
        if (objE == null) {
            return null;
        }
        return new mjg(objE);
    }
}
