package defpackage;

import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.ShareSummaryContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class st5 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ st5(int i, int i2, k00 k00Var) {
        this.a = 11;
        this.b = i;
        this.c = k00Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                kj0.b((dd2) obj3, i2, (l46) obj, ((Integer) obj2).intValue());
                break;
            case 1:
                ((Integer) obj2).getClass();
                db6.f((u06) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                pa7.f((c4c) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 3:
                tw7 tw7Var = (tw7) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    da7 da7VarF = tw7Var.b.t.f(i2);
                    ((rw7) da7VarF.c).d.t(vw7.a, Integer.valueOf(i2 - da7VarF.a), l46Var, 6);
                } else {
                    l46Var.Z();
                }
                break;
            case 4:
                w08 w08Var = (w08) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    da7 da7VarF2 = w08Var.b.s.f(i2);
                    ((t08) da7VarF2.c).c.t(w08Var.c, Integer.valueOf(i2 - da7VarF2.a), l46Var2, 0);
                } else {
                    l46Var2.Z();
                }
                break;
            case 5:
                ox9 ox9Var = (ox9) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    da7 da7VarF3 = ox9Var.b.D().f(i2);
                    ((jx9) da7VarF3.c).b.t(rx9.a, Integer.valueOf(i2 - da7VarF3.a), l46Var3, 0);
                } else {
                    l46Var3.Z();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                vfh.j((j2a) obj3, i2, (l46) obj, k99.P(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                an1.i((fqd) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                p6d.o((ShareSummaryContent) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                p6d.a((cv6) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                List<List> list = (List) obj3;
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    for (List list2 : list) {
                        l46Var4.f0(-387902567);
                        Iterator it = s72.c1(list2, i2).iterator();
                        while (it.hasNext()) {
                            ((l26) it.next()).z(l46Var4, 0);
                        }
                        l46Var4.r(false);
                        l46Var4.f0(-387900834);
                        int size = i2 - list2.size();
                        if (size < 0) {
                            size = 0;
                        }
                        for (int i3 = 0; i3 < size; i3++) {
                            s21.a(g09.a, l46Var4, 6);
                        }
                        l46Var4.r(false);
                    }
                } else {
                    l46Var4.Z();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                t4c.d(i2, (k00) obj3, (l46) obj, k99.P(7));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ st5(j2a j2aVar, int i, int i2) {
        this.a = 6;
        this.c = j2aVar;
        this.b = i;
    }

    public /* synthetic */ st5(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
