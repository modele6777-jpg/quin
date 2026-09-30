package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class id2 implements o26 {
    public static final id2 b = new id2(0);
    public static final id2 c = new id2(1);
    public static final id2 d = new id2(2);
    public final /* synthetic */ int a;

    public id2(a26 a26Var) {
        this.a = 3;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        wef wefVar = wef.a;
        int i5 = 2;
        int i6 = 4;
        switch (i4) {
            case 0:
                ((Number) obj4).intValue();
                return wefVar;
            case 1:
                y72 y72Var = (y72) obj;
                long j = y72Var.a;
                l26 l26Var = (l26) obj2;
                l46 l46Var = (l46) obj3;
                int iIntValue = ((Number) obj4).intValue();
                l26Var.getClass();
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | (l46Var.f(j) ? 4 : 2);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= l46Var.i(l26Var) ? 32 : 16;
                }
                if (l46Var.W(i & 1, (i & 147) != 146)) {
                    mh3.a(em2.a.a(y72Var), af1.b0(-2003013541, new sb0(i5, l26Var), l46Var), l46Var, 56);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 2:
                y72 y72Var2 = (y72) obj;
                long j2 = y72Var2.a;
                l26 l26Var2 = (l26) obj2;
                l46 l46Var2 = (l46) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                l26Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i2 = iIntValue2 | (l46Var2.f(j2) ? 4 : 2);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= l46Var2.i(l26Var2) ? 32 : 16;
                }
                if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
                    mh3.a(b4c.b.a(y72Var2), af1.b0(-824975258, new sb0(i6, l26Var2), l46Var2), l46Var2, 56);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            default:
                mx7 mx7Var = (mx7) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l46 l46Var3 = (l46) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i3 = iIntValue4 | (l46Var3.g(mx7Var) ? 4 : 2);
                } else {
                    i3 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i3 |= l46Var3.e(iIntValue3) ? 32 : 16;
                }
                if (l46Var3.W(i3 & 1, (i3 & 147) != 146)) {
                    r3.i(tec.k("Empty list doesn't contain element at index ", iIntValue3, '.'));
                    return null;
                }
                l46Var3.Z();
                return wefVar;
        }
    }

    public /* synthetic */ id2(int i) {
        this.a = i;
    }
}
