package defpackage;

import ai.askquin.ui.draw.photo.homepage.CardPositionConfig;
import androidx.compose.foundation.layout.b;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class or1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ or1(int i, int i2, a26 a26Var, n26 n26Var) {
        this.a = 10;
        this.b = i;
        this.c = i2;
        this.e = a26Var;
        this.d = n26Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        int i4 = 1;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                gs1.c((CardPositionConfig) obj4, i3, (a26) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                cgg.c((j09) obj4, (TarotCardChoice) obj3, (l46) obj, k99.P(i3 | 1), i2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                jgb.b((j09) obj4, (dd2) obj3, (l46) obj, k99.P(i3 | 1), i2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                tm7.b((j09) obj4, (x16) obj3, (l46) obj, k99.P(i3 | 1), i2);
                break;
            case 4:
                ((Integer) obj2).intValue();
                xj3.o(i3, (y72) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                n16.o((fj8) obj4, (j09) obj3, (l46) obj, k99.P(i3 | 1), i2);
                break;
            case 6:
                ((Integer) obj2).getClass();
                dj6.k((x16) obj4, (dd2) obj3, (l46) obj, k99.P(i3 | 1), i2);
                break;
            case 7:
                ((Integer) obj2).intValue();
                bm8.a((b4a) obj4, (Integer) obj3, i3, (l46) obj, k99.P(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                p6d.k(i3, k99.P(i2 | 1), (l46) obj, (j09) obj3, (List) obj4);
                break;
            case 9:
                ((Integer) obj2).getClass();
                t6d.a((dsb) obj4, (a26) obj3, (l46) obj, k99.P(i3 | 1), i2);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                a26 a26Var = (a26) obj3;
                n26 n26Var = (n26) obj4;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    int i5 = 0;
                    while (i5 < i3) {
                        int i6 = i2 == i5 ? i4 : 0;
                        j09 j09VarD = b.d(oa7.E(fdc.w(g09.a, 1.0f), eze.a(l46Var).a.j), 32.0f);
                        pr4 pr4Var = o82.a;
                        long j = ((m82) l46Var.k(pr4Var)).q;
                        long j2 = ((m82) l46Var.k(pr4Var)).q;
                        boolean zG = l46Var.g(a26Var) | l46Var.e(i5);
                        Object objR = l46Var.R();
                        if (zG || objR == sf2.a) {
                            objR = new rr1(i5, 9, a26Var);
                            l46Var.p0(objR);
                        }
                        int i7 = i4;
                        l46 l46Var2 = l46Var;
                        xce.a(i6, (x16) objR, j09VarD, false, j, j2, af1.b0(305198349, new dc7(n26Var, i5, i4), l46Var), l46Var2, 12582912);
                        i5++;
                        i4 = i7;
                        l46Var = l46Var2;
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                m6e.a((j09) obj4, (l26) obj3, (l46) obj, k99.P(i3 | 1), i2);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ or1(int i, y72 y72Var, x16 x16Var, int i2) {
        this.a = 4;
        this.b = i;
        this.d = y72Var;
        this.e = x16Var;
        this.c = i2;
    }

    public /* synthetic */ or1(Object obj, int i, Object obj2, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.c = i2;
    }

    public /* synthetic */ or1(Object obj, Object obj2, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = i2;
    }
}
